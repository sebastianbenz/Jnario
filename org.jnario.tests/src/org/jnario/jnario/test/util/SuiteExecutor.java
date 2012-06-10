package org.jnario.jnario.test.util;

import java.net.MalformedURLException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.Result;

import com.google.inject.Inject;

public class SuiteExecutor extends BehaviorExecutor {
	
	@Inject
	public SuiteExecutor(JvmModelGenerator generator,
			JavaIoFileSystemAccess fsa, TemporaryFolder tempFolder,
			IResourceValidator validator) {
		super(generator, fsa, tempFolder, validator);
	}

	@Override
	protected Result runExamples(EObject object) throws MalformedURLException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
