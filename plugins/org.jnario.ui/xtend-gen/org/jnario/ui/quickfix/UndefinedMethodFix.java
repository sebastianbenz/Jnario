package org.jnario.ui.quickfix;

import com.google.inject.Inject;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XbasePackage.Literals;
import org.jnario.ui.quickfix.CallsReadOnlyType;
import org.jnario.ui.quickfix.IsUndefinedMethod;
import org.jnario.ui.quickfix.NewMethodModificationProvider;
import org.jnario.util.Nodes;

@SuppressWarnings("all")
public class UndefinedMethodFix {
  @Inject
  private NewMethodModificationProvider _newMethodModificationProvider;
  
  @Inject
  private IsUndefinedMethod _isUndefinedMethod;
  
  @Inject
  private CallsReadOnlyType _callsReadOnlyType;
  
  public void apply(final Issue issue, final IssueResolutionAcceptor issueResolutionAcceptor, final XMemberFeatureCall featureCall) {
    final String issueString = Nodes.textForFeature(featureCall, Literals.XABSTRACT_FEATURE_CALL__FEATURE);
    boolean _callsUndefinedMethod = this._isUndefinedMethod.callsUndefinedMethod(featureCall);
    boolean _not = (!_callsUndefinedMethod);
    if (_not) {
      return;
    }
    boolean _receiverIsReadOnly = this._callsReadOnlyType.receiverIsReadOnly(featureCall);
    if (_receiverIsReadOnly) {
      return;
    }
    String _plus = ("create method \'" + issueString);
    String _plus_1 = (_plus + "\'");
    IModification _createModification = this._newMethodModificationProvider.createModification(featureCall, issueString);
    issueResolutionAcceptor.accept(issue, _plus_1, "", 
      "fix_public_function.png", _createModification);
  }
}
