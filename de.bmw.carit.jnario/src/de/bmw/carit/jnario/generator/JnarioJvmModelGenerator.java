package de.bmw.carit.jnario.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;

import com.google.inject.Inject;

import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmModelGenerator;

public class JnarioJvmModelGenerator extends ExtendedJvmModelGenerator {
	
	@Inject private ILogicalContainerProvider logicalContainerProvider;

	@Override
	public CharSequence generateBody(final JvmExecutable op, final ImportManager importManager) {
		if(logicalContainerProvider.getAssociatedExpression(op) == null){
			return new StringConcatenation();
		}
		return super.generateBody(op, importManager);		
	}

}
