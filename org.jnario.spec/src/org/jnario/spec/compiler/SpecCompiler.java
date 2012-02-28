/*******************************************************************************

 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.compiler;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newHashSet;
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;
import static org.eclipse.xtext.util.Strings.convertToJavaString;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.xtend.core.compiler.XtendCompiler;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.jnario.Assertion;
import org.jnario.Matcher;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecCompiler extends XtendCompiler {

	@Inject
	private ISerializer serializer;
	
	@Inject
	private XExpressionHelper expressionHelper; 

	@Override
	public void internalToConvertedExpression(XExpression obj, ITreeAppendable appendable) {
		if (obj instanceof Matcher) {
			_toJavaExpression((Matcher) obj, appendable);
		} else if (obj instanceof Assertion) {
			_toJavaExpression((Assertion) obj, appendable);
		} else {
			super.internalToConvertedExpression(obj, appendable);
		}
	}
	
	@Override
	public void doInternalToJavaStatement(XExpression obj,
			ITreeAppendable appendable, boolean isReferenced) {
		if (obj instanceof Assertion){
			_toJavaStatement((Assertion)obj, appendable, isReferenced);
		}else if (obj instanceof Matcher){
			_toJavaStatement((Matcher)obj, appendable, isReferenced);
		}else
			super.doInternalToJavaStatement(obj, appendable, isReferenced); 
	}
	
	public void _toJavaExpression(Matcher matcher, ITreeAppendable b) {
		if (matcher.getClosure() == null){
			return;
		}
		b.append(org.jnario.lib.Should.class.getName());
		b.append(".matches(\"");
		describe(matcher, b);
		b.append("\", ");
		toJavaExpression(matcher.getClosure(), b);
		b.append(")");
	}
	
	public void _toJavaStatement(Matcher matcher, ITreeAppendable b, boolean isReferenced) {
		if (matcher.getClosure() == null){
			return;
		}
		toJavaStatement(matcher.getClosure(), b, isReferenced);
	}
	
	private void describe(Matcher matcher, ITreeAppendable b) {
		b.append(serialize(matcher.getClosure()));
	}

	public void _toJavaStatement(Assertion assertion, ITreeAppendable b, boolean isReferenced) {
		if (assertion.getExpression() == null){
			return;
		}
		generateSingleAssertion(assertion.getExpression(), b);
	}
	
	public void _toJavaExpression(Assertion assertion, ITreeAppendable b) {
		b.append("null");
	}
	
	private void generateSingleAssertion(XExpression expr, ITreeAppendable b) {
		toJavaStatement(expr, b, true);
		b.append("\norg.junit.Assert.assertTrue(");
		generateMessageFor(expr, b);
		b.append(" + \"" + convertToJavaString("\n") + "\", ");
		toJavaExpression(expr, b);
		b.append(");\n");
	}

	public void generateMessageFor(XExpression expression, ITreeAppendable b) {
		b.append("\"\\nExpected ");
		b.append(serialize(expression));
		b.append(" but:\"");
		Set<String> valueExpressions = newHashSet();
		Iterator<XExpression> subExpressions = allSubExpressions(expression);
		if(subExpressions.hasNext()){
			while(subExpressions.hasNext()){
				XExpression subExpression = subExpressions.next();
				appendActualValues(subExpression, b, valueExpressions);
			}
		}else{
			toLiteralValue(expression, b, valueExpressions);
		}
	}

	protected String serialize(XExpression expression) {
		INode node = getNode(expression);
		if(node == null){
			return "";
		}
		String result = node.getText();
		result = result.trim();
		result = removeSurroundingParentheses(result);
		return convertToJavaString(result);
	}

	protected String removeSurroundingParentheses(String result) {
		if(result.startsWith("(") && result.endsWith(")")){
			result = result.substring(1, result.length()-1);
		}
		return result.trim();
	}

	protected void appendActualValues(XExpression expression, ITreeAppendable b, Set<String> valueExpressions) {
		toLiteralValue(expression, b, valueExpressions);
		Iterator<XExpression> subExpressions = allSubExpressions(expression);
		while(subExpressions.hasNext()){
			appendActualValues(subExpressions.next(), b, valueExpressions);
		}
	}

	protected Iterator<XExpression> allSubExpressions(XExpression expression) {
		Predicate<XExpression> onlyKnownFeatures = new Predicate<XExpression>() {

			@Override
			public boolean apply(XExpression e) {
				// FIXME
				return !"<unkown>".equals(e.toString());
			}
		};
		return filter(filter(expression.eContents(), XExpression.class), onlyKnownFeatures ).iterator();
	}

	protected void toLiteralValue(XExpression expression, ITreeAppendable b, Set<String> valueMappings) {
		if(expressionHelper.isLiteral(expression)){
			return;
		}
		String expr = serialize(expression);
		if(valueMappings.contains(expr)){
			return;
		}
		valueMappings.add(expr);
		b.append("\n + \"\\n     ");
		b.append(expr);
		b.append(" is \" + ");
		boolean isString = isString(expression);
		if(isString){
			b.append("\"\\\"\" + ");
		} 
		toJavaExpression(expression, b);
		if(isString){
			b.append(" + \"\\\"\"");
		}
	}
	private boolean isString(XExpression expression) {
		JvmTypeReference expectedType = getTypeProvider().getType(expression, true);
		return expectedType != null && expectedType.getQualifiedName().equals(String.class.getName());
	}
	
	@Override
	protected boolean isVariableDeclarationRequired(XExpression expr,
			ITreeAppendable b) {
		if (expr instanceof Assertion){
			return false;
		}
		return super.isVariableDeclarationRequired(expr, b);
	}
	
	/* 
	 * Overridden to evaluate all expressions first to be visible when generating the assertion message.
	 */
	protected void generateShortCircuitInvocation(final XAbstractFeatureCall binaryOperation,
			final ITreeAppendable b) {
		if(EcoreUtil2.getContainerOfType(binaryOperation, Assertion.class) == null){
			super.generateShortCircuitInvocation(binaryOperation, b);
		}
		XExpression leftOperand = ((XBinaryOperation)binaryOperation).getLeftOperand();
		declareSyntheticVariable(binaryOperation, b);
		prepareExpression(leftOperand, b);
		
		for (XExpression arg : binaryOperation.getExplicitArguments()) {
			if (arg!=leftOperand)
				prepareExpression(arg, b);
		}
		
		b.append("\nif (");
		if (binaryOperation.getConcreteSyntaxFeatureName().equals(expressionHelper.getAndOperator())) {
			b.append("!");
		}
		toJavaExpression(leftOperand, b);
		b.append(") {").increaseIndentation();
		boolean rightOperand = binaryOperation.getConcreteSyntaxFeatureName().equals(expressionHelper.getOrOperator());
		b.append("\n").append(b.getName(binaryOperation)).append(" = ").append(Boolean.toString(rightOperand)).append(";");
		
		b.decreaseIndentation().append("\n} else {").increaseIndentation();
		
		if (binaryOperation.getImplicitReceiver()!=null) {
			internalToJavaStatement(binaryOperation.getImplicitReceiver(), b, true);
		}
		
		b.append("\n").append(b.getName(binaryOperation)).append(" = ");
		featureCalltoJavaExpression(binaryOperation, b, true);
		b.append(";");
		b.decreaseIndentation().append("\n}");
	}
	
}
