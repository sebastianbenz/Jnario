package org.jnario.ui.quickfix;

import org.eclipse.xtend.ide.quickfix.CreateXtendTypeQuickfixes;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

@SuppressWarnings("restriction")
public class CreateJnarioTypeQuickfixes extends CreateXtendTypeQuickfixes {

	@Override
	protected void newLocalXtendClassQuickfix(String typeName,
			XtextResource resource, Issue issue,
			IssueResolutionAcceptor issueResolutionAcceptor) {
	}
	
	@Override
	protected void newLocalXtendAnnotationQuickfix(String typeName,
			XtextResource resource, Issue issue,
			IssueResolutionAcceptor issueResolutionAcceptor) {
	}
	
	@Override
	protected void newLocalXtendInterfaceQuickfix(String typeName,
			XtextResource resource, Issue issue,
			IssueResolutionAcceptor issueResolutionAcceptor) {
	}
	
}
