package de.bmw.carit.jnario.tests.util;

import static com.google.common.collect.Lists.newArrayList;
import static junit.framework.Assert.assertFalse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.IResourceValidator;
import org.junit.experimental.results.PrintableResult;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.notification.Failure;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.bmw.carit.jnario.JnarioInjectorProvider;
import de.bmw.carit.jnario.common.test.util.BehaviorExecutor;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.naming.JavaNameProvider;

public class JnarioExecutor extends BehaviorExecutor{

	public static PrintableResult execute(String content) {
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
			return executor.run((Jnario) resource.getContents().get(0));
		} finally {
			injectorProvider.restoreRegistry();
		}
	}
	
	private final JavaNameProvider nameProvider;

	@Inject
	public JnarioExecutor(IGenerator generator, JavaIoFileSystemAccess fsa,
			TemporaryFolder tempFolder, JavaNameProvider javaNameProvider, IResourceValidator validator) {
		super(generator, fsa, tempFolder, validator);
		this.nameProvider = javaNameProvider;
	}

	protected PrintableResult runExamples(EObject object)
			throws MalformedURLException, ClassNotFoundException {
		List<Failure> failures = newArrayList();
		Jnario jnario = (Jnario) object;
//		for (Scenario scenario : jnario.getScenarios()) {
			String jnarioClassName = nameProvider.getJavaClassName(jnario.getName()) + nameProvider.getJavaClassName(jnario.getXtendClass().getName());
			String packageName = jnario.getPackage();
			if(packageName == null){
				packageName = "";
			}
			runTestsInClass(jnarioClassName, packageName, failures);
	//	}
		return new PrintableResult(failures);
	}
	
	protected void generateJava(EObject object) {
		super.generateJava(object);
	//	assertFalse("has no scenarios", ((Jnario)object).getClass().isEmpty());
	}
}
