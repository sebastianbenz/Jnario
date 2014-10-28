package org.jnario.macro;

import org.eclipse.xtend.core.macro.ActiveAnnotationContext;
import org.eclipse.xtend.core.macro.AnnotationProcessor;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;

public class JnarioAnnotationProcessor extends AnnotationProcessor {
	
	@Override
	public Object indexingPhase(ActiveAnnotationContext ctx,
			IJvmDeclaredTypeAcceptor acceptor, CancelIndicator monitor) {
		return null;
	}
	
	@Override
	public Object inferencePhase(ActiveAnnotationContext ctx,
			CancelIndicator monitor) {
		return null;
	}
	
	@Override
	public Object validationPhase(ActiveAnnotationContext ctx,
			CancelIndicator monitor) {
		return null;
	}

}
