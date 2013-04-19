package org.jnario.feature.linking;

import org.eclipse.xtend.core.linking.XtendLinkingDiagnosticMessageProvider;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.jnario.feature.feature.StepReference;


public class FeatureLinkingDiagnosticMessageProvider extends XtendLinkingDiagnosticMessageProvider {
	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		if(context.getContext() instanceof StepReference){
			return null;
		}
		return super.getUnresolvedProxyMessage(context);
	}
}
