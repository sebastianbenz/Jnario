package de.bmw.carit.jnario.tests.util;

import static junit.framework.Assert.assertFalse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.Result;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.bmw.carit.jnario.JnarioInjectorProvider;
import de.bmw.carit.jnario.common.test.util.BehaviorExecutor;
import de.bmw.carit.jnario.generator.JnarioJvmModelGenerator;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.JnarioFile;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.naming.JavaNameProvider;

@SuppressWarnings("restriction")
public class JnarioExecutor extends BehaviorExecutor{
	
	public static Result execute(String content) {
		JnarioInjectorProvider injectorProvider = new JnarioInjectorProvider();
		try {
			injectorProvider.setupRegistry();
			Injector injector = new JnarioTestSetup().createInjectorAndDoEMFRegistration();
			
			XtextResourceSet resourceSet = new XtextResourceSet();
			Resource resource = resourceSet.createResource(URI.createURI("temp.jnario"));
			try {
				resource.load(new StringInputStream(content), Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
				org.junit.Assert.fail(e.getMessage());
			}
			
			JnarioExecutor executor = injector.getInstance(JnarioExecutor.class);
			return executor.run((JnarioFile) resource.getContents().get(0));
		} finally {
			injectorProvider.restoreRegistry();
		}
	}
	
	private final JavaNameProvider nameProvider;

	@Inject
	public JnarioExecutor(JnarioJvmModelGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider, IResourceValidator validator) {
		super(generator, fsa, tempFolder, validator);
		this.nameProvider = javaNameProvider;
	}

	protected Result runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException {
		CompositeResult result = new CompositeResult();
		JnarioFile jnarioFile = (JnarioFile) object;
		Feature feature = (Feature)jnarioFile.getXtendClass();
		String jnarioClassName = nameProvider.getFeatureClassName(feature.getName());
		String packageName = jnarioFile.getPackage();
		result.add(runTestsInClass(jnarioClassName, packageName));
		return result;
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
		assertFalse("has no feature", ((JnarioFile)object).getXtendClass() == null);
		assertFalse("has no scenarios", ((JnarioFile)object).getXtendClass().getMembers().isEmpty());
	}
}
