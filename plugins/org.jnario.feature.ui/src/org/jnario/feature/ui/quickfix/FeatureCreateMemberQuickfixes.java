package org.jnario.feature.ui.quickfix;

import java.util.List;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtend.ide.quickfix.CreateMemberQuickfixes;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

public class FeatureCreateMemberQuickfixes extends CreateMemberQuickfixes{

	@Override
	protected void newMethodQuickfix(JvmDeclaredType containerType,
			String name, LightweightTypeReference returnType,
			List<LightweightTypeReference> parameterTypes, boolean isStatic,
			boolean isAbstract, boolean isExtension, boolean isLocal,
			XAbstractFeatureCall call, Issue issue,
			IssueResolutionAcceptor issueResolutionAcceptor) {
		if(isLocal){
			return;
		}
		super.newMethodQuickfix(containerType, name, returnType, parameterTypes,
				isStatic, isAbstract, isExtension, isLocal, call, issue,
				issueResolutionAcceptor);
	}
}
