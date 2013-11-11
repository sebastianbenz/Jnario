package org.jnario.maven;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.lib.macro.file.Path;
import org.eclipse.xtend.maven.MavenProjectAdapter;
import org.eclipse.xtend.maven.XtendTestCompile;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.file.ProjectConfig;
import org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider;
import org.eclipse.xtext.xbase.file.WorkspaceConfig;
import org.jnario.compiler.HtmlAssetsCompiler;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.SpecResultParser;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * Goal which generates Jnario documentation.
 * 
 * @author Sebastian Benz - Initial contribution and API
 * @requiresDependencyResolution test
 * @goal generate	
 */
public class JnarioDocGenerate extends XtendTestCompile {

	private final class XmlFiles implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return name.endsWith("xml");
		}
	}

	/**
	 * Location of the generated documentation.
	 * 
	 * @parameter default-value="${basedir}/target/jnario-doc"
	 * @required
	 */
	private String docOutputDirectory;
	
	/**
	 * Location of the generated JUnit XML reports.
	 * 
	 * @parameter default-value="${basedir}/target/surefire-reports"
	 * @required
	 */
	private String reportsDirectory;
	
	/**
	 * Location of the generated JUnit XML reports.
	 * 
	 * @parameter 
	 */
	private String sourceDirectory;
	
	@Inject
	private RuntimeWorkspaceConfigProvider workspaceConfigProvider;

	private Provider<ResourceSet> resourceSetProvider;

	@Override
	protected void internalExecute() throws MojoExecutionException {
		getLog().info("Generating Jnario reports to " + docOutputDirectory);
		
		// the order is important, the suite compiler must be executed last
		List<Injector> injectors = createInjectors(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());
		generateCssAndJsFiles(injectors);
		resourceSetProvider = new JnarioMavenProjectResourceSetProvider(project);

		HashBasedSpec2ResultMapping resultMapping = createSpec2ResultMapping(injectors);
		for (Injector injector : injectors) {
			generateDoc(injector, resultMapping);
		}
	}

	protected HashBasedSpec2ResultMapping createSpec2ResultMapping(List<Injector> injectors) throws MojoExecutionException {
		HashBasedSpec2ResultMapping resultMapping = injectors.get(2).getInstance(HashBasedSpec2ResultMapping.class);
		File reportFolder = new File(reportsDirectory);
		if(reportFolder.exists()){
			addExecutionResults(resultMapping, reportFolder);
		}else{
			throw new MojoExecutionException("Surefire Report folder does not exist");
		}
		return resultMapping;
	}

	protected void generateCssAndJsFiles(List<Injector> injectors) {
		HtmlAssetsCompiler assetsCompiler = injectors.get(0).getInstance(HtmlAssetsCompiler.class);
		assetsCompiler.setOutputPath(docOutputDirectory);
		getLog().info("Generating HTML assets to " + docOutputDirectory);
		assetsCompiler.compile();
	}

	protected void addExecutionResults(HashBasedSpec2ResultMapping resultMapping, File reportFolder) throws MojoExecutionException {
		SpecResultParser specResultParser = new SpecResultParser();
		for (File file : reportFolder.listFiles(new XmlFiles())) {
			FileInputStream is = null;
			try {
				is = new FileInputStream(file);
				specResultParser.parse(is, resultMapping);
			} catch (Exception e) {
				throw new MojoExecutionException("Exception while parsing spec for: " + file, e);
			}finally{
				try {
					is.close();
				} catch (IOException e) {
				}
			}
			
		}
	}

	protected void compileTestSources(XtendBatchCompiler xtend2BatchCompiler) throws MojoExecutionException {
		List<String> testCompileSourceRoots = Lists.newArrayList(project.getTestCompileSourceRoots());
		String testClassPath = concat(File.pathSeparator, getTestClassPath());
		if(sourceDirectory != null){
			testCompileSourceRoots = Collections.singletonList(sourceDirectory);
		}
		getLog().debug("source folders: " + testCompileSourceRoots);
		compile(xtend2BatchCompiler, testClassPath, testCompileSourceRoots, docOutputDirectory);
	}
	
	private void generateDoc(Injector injector, Executable2ResultMapping resultMapping) throws MojoExecutionException {
		JnarioDocCompiler docCompiler = injector.getInstance(JnarioDocCompiler.class);
		docCompiler.setExecutable2ResultMapping(resultMapping);
		compileTestSources(docCompiler);
	}
	
	protected void compile(XtendBatchCompiler xtend2BatchCompiler, String classPath, List<String> sourceDirectories,
			String outputPath) throws MojoExecutionException {
		configureWorkspace(sourceDirectories, outputPath);
		resourceSetProvider.get().eAdapters().clear();
		xtend2BatchCompiler.setResourceSetProvider(resourceSetProvider);
		MavenProjectAdapter.install(resourceSetProvider.get(), project);
		Iterable<String> filtered = filter(sourceDirectories, FILE_EXISTS);
		if (Iterables.isEmpty(filtered)) {
			getLog().info(
					"skip compiling sources because the configured directory '" + Iterables.toString(sourceDirectories)
							+ "' does not exists.");
			return;
		}
		getLog().debug("Set temp directory: " + getTempDirectory());
		xtend2BatchCompiler.setTempDirectory(getTempDirectory());
		getLog().debug("Set DeleteTempDirectory: " + false);
		xtend2BatchCompiler.setDeleteTempDirectory(false);
		getLog().debug("Set classpath: " + classPath);
		xtend2BatchCompiler.setClassPath(classPath);
		getLog().debug("Set source path: " + concat(File.pathSeparator, newArrayList(filtered)));
		xtend2BatchCompiler.setSourcePath(concat(File.pathSeparator, newArrayList(filtered)));
		getLog().debug("Set output path: " + outputPath);
		xtend2BatchCompiler.setOutputPath(outputPath);
		getLog().debug("Set encoding: " + encoding);
		xtend2BatchCompiler.setFileEncoding(encoding);
		getLog().debug("Set writeTraceFiles: " + writeTraceFiles);
		xtend2BatchCompiler.setWriteTraceFiles(writeTraceFiles);
		if (!xtend2BatchCompiler.compile()) {
			throw new MojoExecutionException("Error compiling xtend sources in '"
					+ concat(File.pathSeparator, newArrayList(filtered)) + "'.");
		}
	}

	private void configureWorkspace(List<String> sourceDirectories, String outputPath) throws MojoExecutionException {
		WorkspaceConfig workspaceConfig = new WorkspaceConfig(project.getBasedir().getParentFile().getAbsolutePath());
		ProjectConfig projectConfig = new ProjectConfig(project.getBasedir().getName());
		URI absoluteRootPath = project.getBasedir().getAbsoluteFile().toURI();
		URI relativizedTarget = absoluteRootPath.relativize(new File(outputPath).toURI());
		if (relativizedTarget.isAbsolute()) {
			throw new MojoExecutionException("Output path '" + outputPath
					+ "' must be a child of the project folder '" + absoluteRootPath + "'");
		}
		for (String source : sourceDirectories) {
			URI relativizedSrc = absoluteRootPath.relativize(new File(source).toURI());
			if (relativizedSrc.isAbsolute()) {
				throw new MojoExecutionException("Source folder " + source
						+ " must be a child of the project folder " + absoluteRootPath);
			}
			projectConfig.addSourceFolderMapping(relativizedSrc.getPath(), relativizedTarget.getPath());
		}
		workspaceConfig.addProjectConfig(projectConfig);
		workspaceConfigProvider.setWorkspaceConfig(workspaceConfig);
		if (getLog().isDebugEnabled()) {
			getLog().debug("WS config root: " + workspaceConfig.getAbsoluteFileSystemPath());
			getLog().debug("Project name: " + projectConfig.getName());
			getLog().debug("Project root path: " + projectConfig.getRootPath());
			for (Entry<Path, Path> entry : projectConfig.getSourceFolderMappings().entrySet()) {
				getLog().debug("Source path: " + entry.getKey() + " -> " + entry.getValue());
			}
		}
	}	
	private List<Injector> createInjectors(ISetup... setups) {
		return transform(asList(setups), new Function<ISetup, Injector>() {
			public Injector apply(ISetup input) {
				return input.createInjectorAndDoEMFRegistration();
			}
		});
	}
	
}