package de.bmw.carit.jnario.spec.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.doc.DocGenerator;

public class SpecGenerator implements IGenerator {

	@Inject JvmModelGenerator jvmModelGenerator;
	@Inject DocGenerator docGenerator;
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		jvmModelGenerator.doGenerate(input, fsa);
		docGenerator.doGenerate(input, fsa);
	}

}
