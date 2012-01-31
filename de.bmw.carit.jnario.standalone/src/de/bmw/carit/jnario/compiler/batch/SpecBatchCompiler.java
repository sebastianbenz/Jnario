package de.bmw.carit.jnario.compiler.batch;

import static com.google.common.collect.Iterables.*;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SpecBatchCompiler extends Xtend2BatchCompiler {

	private static final Logger log = Logger.getLogger(SpecBatchCompiler.class);
	
	@Inject
	private ExampleNameProvider nameProvider;
	
	@Override
	protected File createStubs(ResourceSet resourceSet) {
		File outputDirectory = createTempDir("stubs");
		JavaIoFileSystemAccess fileSystemAccess = javaIoFileSystemAccessProvider.get();
		fileSystemAccess.setOutputPath(outputDirectory.toString());
			Iterator<ExampleGroup> exampleGroups = getExampleGroups(resourceSet);
			while (exampleGroups.hasNext()) {
				ExampleGroup exampleGroup = exampleGroups.next();
				StringBuilder classSignatureBuilder = new StringBuilder();
				String packageName = exampleGroup.getPackageName();
				if (!Strings.isEmpty(packageName)) {
					classSignatureBuilder.append("package " + packageName + ";");
					classSignatureBuilder.append("\n");
				}
				classSignatureBuilder.append("public class " + nameProvider.toJavaClassName(exampleGroup) + "{}");
				String javaFileName = getJavaFileName(packageName, exampleGroup);
				if (log.isDebugEnabled()) {
					log.debug("create java stub '" + javaFileName + "'");
				}
				fileSystemAccess.generateFile(javaFileName, classSignatureBuilder.toString());
		}
		return outputDirectory;
	}

	protected String getJavaFileName(String packageName, ExampleGroup exampleGroup) {
		String javaClassName = nameProvider.toJavaClassName(exampleGroup) + ".java";
		if(packageName == null){
			return javaClassName;
		}
		return packageName.replaceAll("\\.", "/") + javaClassName;
	}

	private Iterator<ExampleGroup> getExampleGroups(ResourceSet resource) {
		return Iterators.filter(resource.getAllContents(), ExampleGroup.class);
	}

	@Override
	protected List<Issue> validate(ResourceSet resourceSet) {
		List<Issue> issues = Lists.newArrayList();
		List<Resource> resources = Lists.newArrayList(resourceSet.getResources());
		for (Resource resource : resources) {
			if(fileExtensionProvider.isValid(resource.getURI().fileExtension())){
				IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
						.getResourceServiceProvider(resource.getURI());
				IResourceValidator resourceValidator = resourceServiceProvider.getResourceValidator();
				List<Issue> result = resourceValidator.validate(resource, CheckMode.ALL, null);
				addAll(issues, result);
			}
		}
		return issues;
	}

}
