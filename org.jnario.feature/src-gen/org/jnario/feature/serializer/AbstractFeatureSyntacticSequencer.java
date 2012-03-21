package org.jnario.feature.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.jnario.feature.services.FeatureGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractFeatureSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FeatureGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BlockExpression_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_Class_PublicKeyword_1_q;
	protected AbstractElementAlias match_ExampleColumn_PIPETerminalRuleCall_0_0_or_PIPE_SPACESTerminalRuleCall_0_1;
	protected AbstractElementAlias match_ExampleRow_PIPETerminalRuleCall_0_0_0_or_PIPE_SPACESTerminalRuleCall_0_0_1;
	protected AbstractElementAlias match_File_SemicolonKeyword_0_2_q;
	protected AbstractElementAlias match_Import_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_Member_SemicolonKeyword_2_0_4_q;
	protected AbstractElementAlias match_XAnnotationElementValue_LeftParenthesisKeyword_7_0_a;
	protected AbstractElementAlias match_XAnnotationElementValue_LeftParenthesisKeyword_7_0_p;
	protected AbstractElementAlias match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_XRelationalExpression_BeKeyword_1_0_0_0_1_0_2_q;
	protected AbstractElementAlias match_XRelationalExpression_EqualsSignGreaterThanSignKeyword_1_0_0_0_1_1_or_____MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0___BeKeyword_1_0_0_0_1_0_2_q__;
	protected AbstractElementAlias match_XRelationalExpression_MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0;
	protected AbstractElementAlias match_XRelationalExpression_ThrowsKeyword_1_1_0_0_1_1_or_____MustKeyword_1_1_0_0_1_0_0_1_or_ShouldKeyword_1_1_0_0_1_0_0_0___ThrowKeyword_1_1_0_0_1_0_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FeatureGrammarAccess) access;
		match_BlockExpression_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1());
		match_Class_PublicKeyword_1_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getPublicKeyword_1());
		match_ExampleColumn_PIPETerminalRuleCall_0_0_or_PIPE_SPACESTerminalRuleCall_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExampleColumnAccess().getPIPETerminalRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getExampleColumnAccess().getPIPE_SPACESTerminalRuleCall_0_1()));
		match_ExampleRow_PIPETerminalRuleCall_0_0_0_or_PIPE_SPACESTerminalRuleCall_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExampleRowAccess().getPIPETerminalRuleCall_0_0_0()), new TokenAlias(false, false, grammarAccess.getExampleRowAccess().getPIPE_SPACESTerminalRuleCall_0_0_1()));
		match_File_SemicolonKeyword_0_2_q = new TokenAlias(false, true, grammarAccess.getFileAccess().getSemicolonKeyword_0_2());
		match_Import_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getImportAccess().getSemicolonKeyword_2());
		match_Member_SemicolonKeyword_2_0_4_q = new TokenAlias(false, true, grammarAccess.getMemberAccess().getSemicolonKeyword_2_0_4());
		match_XAnnotationElementValue_LeftParenthesisKeyword_7_0_a = new TokenAlias(true, true, grammarAccess.getXAnnotationElementValueAccess().getLeftParenthesisKeyword_7_0());
		match_XAnnotationElementValue_LeftParenthesisKeyword_7_0_p = new TokenAlias(true, false, grammarAccess.getXAnnotationElementValueAccess().getLeftParenthesisKeyword_7_0());
		match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getXAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XRelationalExpression_BeKeyword_1_0_0_0_1_0_2_q = new TokenAlias(false, true, grammarAccess.getXRelationalExpressionAccess().getBeKeyword_1_0_0_0_1_0_2());
		match_XRelationalExpression_EqualsSignGreaterThanSignKeyword_1_0_0_0_1_1_or_____MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0___BeKeyword_1_0_0_0_1_0_2_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getMustKeyword_1_0_0_0_1_0_0_1()), new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getShouldKeyword_1_0_0_0_1_0_0_0())), new TokenAlias(false, true, grammarAccess.getXRelationalExpressionAccess().getBeKeyword_1_0_0_0_1_0_2())), new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_0_1_1()));
		match_XRelationalExpression_MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getMustKeyword_1_0_0_0_1_0_0_1()), new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getShouldKeyword_1_0_0_0_1_0_0_0()));
		match_XRelationalExpression_ThrowsKeyword_1_1_0_0_1_1_or_____MustKeyword_1_1_0_0_1_0_0_1_or_ShouldKeyword_1_1_0_0_1_0_0_0___ThrowKeyword_1_1_0_0_1_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getMustKeyword_1_1_0_0_1_0_0_1()), new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getShouldKeyword_1_1_0_0_1_0_0_0())), new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getThrowKeyword_1_1_0_0_1_0_1())), new TokenAlias(false, false, grammarAccess.getXRelationalExpressionAccess().getThrowsKeyword_1_1_0_0_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBACKGROUND_TEXTRule())
			return getBACKGROUND_TEXTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXAMPLE_ROW_ENDRule())
			return getEXAMPLE_ROW_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPIPERule())
			return getPIPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPIPE_SPACESRule())
			return getPIPE_SPACESToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getBACKGROUND_TEXTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Background:";
	}
	protected String getEXAMPLE_ROW_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|\n";
	}
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	protected String getPIPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	protected String getPIPE_SPACESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "| ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BlockExpression_SemicolonKeyword_1_q.equals(syntax))
				emit_BlockExpression_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_PublicKeyword_1_q.equals(syntax))
				emit_Class_PublicKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExampleColumn_PIPETerminalRuleCall_0_0_or_PIPE_SPACESTerminalRuleCall_0_1.equals(syntax))
				emit_ExampleColumn_PIPETerminalRuleCall_0_0_or_PIPE_SPACESTerminalRuleCall_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExampleRow_PIPETerminalRuleCall_0_0_0_or_PIPE_SPACESTerminalRuleCall_0_0_1.equals(syntax))
				emit_ExampleRow_PIPETerminalRuleCall_0_0_0_or_PIPE_SPACESTerminalRuleCall_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_File_SemicolonKeyword_0_2_q.equals(syntax))
				emit_File_SemicolonKeyword_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Import_SemicolonKeyword_2_q.equals(syntax))
				emit_Import_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Member_SemicolonKeyword_2_0_4_q.equals(syntax))
				emit_Member_SemicolonKeyword_2_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XAnnotationElementValue_LeftParenthesisKeyword_7_0_a.equals(syntax))
				emit_XAnnotationElementValue_LeftParenthesisKeyword_7_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XAnnotationElementValue_LeftParenthesisKeyword_7_0_p.equals(syntax))
				emit_XAnnotationElementValue_LeftParenthesisKeyword_7_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XRelationalExpression_BeKeyword_1_0_0_0_1_0_2_q.equals(syntax))
				emit_XRelationalExpression_BeKeyword_1_0_0_0_1_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XRelationalExpression_EqualsSignGreaterThanSignKeyword_1_0_0_0_1_1_or_____MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0___BeKeyword_1_0_0_0_1_0_2_q__.equals(syntax))
				emit_XRelationalExpression_EqualsSignGreaterThanSignKeyword_1_0_0_0_1_1_or_____MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0___BeKeyword_1_0_0_0_1_0_2_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XRelationalExpression_MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0.equals(syntax))
				emit_XRelationalExpression_MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XRelationalExpression_ThrowsKeyword_1_1_0_0_1_1_or_____MustKeyword_1_1_0_0_1_0_0_1_or_ShouldKeyword_1_1_0_0_1_0_0_0___ThrowKeyword_1_1_0_0_1_0_1__.equals(syntax))
				emit_XRelationalExpression_ThrowsKeyword_1_1_0_0_1_1_or_____MustKeyword_1_1_0_0_1_0_0_1_or_ShouldKeyword_1_1_0_0_1_0_0_0___ThrowKeyword_1_1_0_0_1_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BlockExpression_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'public'?
	 */
	protected void emit_Class_PublicKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     PIPE_SPACES | PIPE
	 */
	protected void emit_ExampleColumn_PIPETerminalRuleCall_0_0_or_PIPE_SPACESTerminalRuleCall_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     PIPE | PIPE_SPACES
	 */
	protected void emit_ExampleRow_PIPETerminalRuleCall_0_0_0_or_PIPE_SPACESTerminalRuleCall_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_File_SemicolonKeyword_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Import_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Member_SemicolonKeyword_2_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XAnnotationElementValue_LeftParenthesisKeyword_7_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XAnnotationElementValue_LeftParenthesisKeyword_7_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'be'?
	 */
	protected void emit_XRelationalExpression_BeKeyword_1_0_0_0_1_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('must' | 'should') 'be'?) | '=>'
	 */
	protected void emit_XRelationalExpression_EqualsSignGreaterThanSignKeyword_1_0_0_0_1_1_or_____MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0___BeKeyword_1_0_0_0_1_0_2_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'must' | 'should'
	 */
	protected void emit_XRelationalExpression_MustKeyword_1_0_0_0_1_0_0_1_or_ShouldKeyword_1_0_0_0_1_0_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('must' | 'should') 'throw') | 'throws'
	 */
	protected void emit_XRelationalExpression_ThrowsKeyword_1_1_0_0_1_1_or_____MustKeyword_1_1_0_0_1_0_0_1_or_ShouldKeyword_1_1_0_0_1_0_0_0___ThrowKeyword_1_1_0_0_1_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
