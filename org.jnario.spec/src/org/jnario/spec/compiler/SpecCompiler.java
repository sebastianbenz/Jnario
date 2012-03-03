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
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;
import static org.eclipse.xtext.util.Strings.convertToJavaString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.compiler.XtendCompiler;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.jnario.Assertion;
import org.jnario.Matcher;
import org.jnario.Should;
import org.junit.Assert;

import com.google.common.base.Objects;
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
		} else if (obj instanceof Should) {
			_toJavaExpression((Should) obj, appendable);
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
		}else if (obj instanceof Should){
			_toJavaStatement((Should)obj, appendable, isReferenced);
		}else
			super.doInternalToJavaStatement(obj, appendable, isReferenced); 
	}

	public void _toJavaStatement(Should should, ITreeAppendable b, boolean isReferenced) {
		if(should.getRightOperand() == null){
			return;
		}
		toJavaStatement(should.getLeftOperand(), b, true);
		toJavaStatement(should.getRightOperand(), b, true);
		b.newLine();
		String variable = b.declareSyntheticVariable(should, "result");
		b.append("boolean " + variable + " = ");
		JvmTypeReference type = getTypeProvider().getType(should.getRightOperand());
		if(type == null || type.getType() == null){
			return;
		}
		boolean isMatcher = false;
		if (type.getType() instanceof JvmGenericType) {
			if(org.hamcrest.Matcher.class.getName().equals(type.getType().getQualifiedName())){
				isMatcher = true;
			}
			Iterable<JvmTypeReference> interfaces = ((JvmGenericType)type.getType()).getSuperTypes();
			for (JvmTypeReference jvmTypeReference : interfaces) {
				if(org.hamcrest.Matcher.class.getName().equals(jvmTypeReference.getQualifiedName())){
					isMatcher = true;
				}
			}
		}
		if(isMatcher){
			toJavaExpression(should.getRightOperand(), b);
		}else{
			b.append(jvmType(CoreMatchers.class, should));
			b.append(".is(");
			if(should.getRightOperand() instanceof XNullLiteral){
				b.append(jvmType(CoreMatchers.class, should));
				b.append(".nullValue()");
			}else{
				toJavaExpression(should.getRightOperand(), b);
			}
			b.append(")");
		}
		b.append(".matches(");
		toJavaExpression(should.getLeftOperand(), b);
		b.append(");");
		b.newLine();
		b.append(assertType(should));
		if(should.isNot()){
			b.append(".assertFalse(");
		}else{
			b.append(".assertTrue(");
		}
		generateMessageFor(should, b);
		b.append(" + \"" + convertToJavaString("\n") + "\", ");
		b.append(variable);
		b.append(");");
	}
	
	public void _toJavaExpression(Should should, ITreeAppendable b) {
		b.append("null");
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
		b.newLine();
		b.append(assertType(expr));
		b.append(".assertTrue(");
		generateMessageFor(expr, b);
		b.append(" + \"" + convertToJavaString("\n") + "\", ");
		toJavaExpression(expr, b);
		b.append(");");
		b.newLine();
	}

	private JvmType assertType(XExpression expr) {
		return jvmType(Assert.class, expr);
	}
	
	private JvmType jvmType(Class<?> type, EObject context){
		 return getTypeReferences().getTypeForName(type, context).getType();
	}

	public void generateMessageFor(Should should, ITreeAppendable b) {
		b.append("\"\\nExpected ");
		b.append(serialize(should));
		b.append(" but:\"");
		Set<String> valueExpressions = new HashSet<String>();
		XExpression left = should.getLeftOperand();
		toLiteralValue(left, b, valueExpressions);
		appendValues(left, b, valueExpressions);
		XExpression right = should.getRightOperand();
		toLiteralValue(right, b, valueExpressions);
		appendValues(right, b, valueExpressions);
	}
	
	public void generateMessageFor(XExpression expression, ITreeAppendable b) {
		b.append("\"\\nExpected ");
		b.append(serialize(expression));
		b.append(" but:\"");
		appendValues(expression, b, new HashSet<String>());
	}

	private void appendValues(XExpression expression, ITreeAppendable b, Set<String> valueExpressions) {
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
		Predicate<XExpression> noLiteralExpressions = new Predicate<XExpression>() {

			@Override
			public boolean apply(XExpression expr) {
				return !expressionHelper.isLiteral(expr);
			}
		};
		Iterable<XExpression> subExpressions = filter(expression.eContents(), XExpression.class);
		subExpressions = filter(subExpressions, onlyKnownFeatures);
		subExpressions = filter(subExpressions, noLiteralExpressions);
		return subExpressions.iterator();
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
		if(getContainerOfType(binaryOperation, Assertion.class) == null &&
				getContainerOfType(binaryOperation, Should.class) == null){
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
