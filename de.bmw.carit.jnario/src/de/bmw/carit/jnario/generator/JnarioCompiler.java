/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.common.types.util.Primitives.Primitive;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.controlflow.IEarlyExitComputer;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JnarioCompiler extends XbaseCompiler {
	
	@Inject
	private TypeReferences typeReferences;
	
	@Inject
	private IEarlyExitComputer exitComputer;
	
	// removed "{\n" and "\n}" from original method
	@Override
	protected void _toJavaStatement(XBlockExpression expr, IAppendable b, boolean isReferenced) {
		if (expr.getExpressions().isEmpty())
			return;
		if (expr.getExpressions().size()==1) {
			internalToJavaStatement(expr.getExpressions().get(0), b, isReferenced);
			return;
		}
		if (isReferenced)
			declareLocalVariable(expr, b);
		b.increaseIndentation();
		final EList<XExpression> expressions = expr.getExpressions();
		for (int i = 0; i < expressions.size(); i++) {
			XExpression ex = expressions.get(i);
			if (i < expressions.size() - 1) {
				internalToJavaStatement(ex, b, false);
			} else {
				internalToJavaStatement(ex, b, isReferenced);
				if (isReferenced) {
					b.append("\n").append(getVarName(expr, b)).append(" = (");
					internalToConvertedExpression(ex, b, null);
					b.append(");");
				}
			}
		}
		b.decreaseIndentation();
	}
	
	@Override
	protected void _toJavaStatement(XVariableDeclaration varDeclaration, IAppendable b, boolean isReferenced) {
		if (varDeclaration.getRight() != null) {
			internalToJavaStatement(varDeclaration.getRight(), b, true);
		}
		b.append("\n");
		if (!varDeclaration.isWriteable()) {
			b.append("final ");
		}
		JvmTypeReference type = null;
		if (varDeclaration.getType() != null) {
			type = varDeclaration.getType();
		} else {
			type = getTypeProvider().getType(varDeclaration.getRight());
		}
//		serialize(type, varDeclaration, b);
//		b.append(" ");
		String variableName = declareNameInVariableScope(varDeclaration, b);
		b.append(variableName);
		b.append(" = ");
		if (varDeclaration.getRight() != null) {
			internalToConvertedExpression(varDeclaration.getRight(), b, type);
		} else {
			if (getPrimitives().isPrimitive(type)) {
				Primitive primitiveKind = getPrimitives().primitiveKind((JvmPrimitiveType) type.getType());
				switch (primitiveKind) {
					case Boolean:
						b.append("false");
						break;
					default:
						b.append("0");
						break;
				}
			} else {
				b.append("null");
			}
		}
		b.append(";");
	}
	
	@Override
	public IAppendable compile(XExpression obj, IAppendable appendable, JvmTypeReference expectedReturnType) {
		if(expectedReturnType == null){
			return super.compile(obj, appendable, newVoidRef());
		}
		return super.compile(obj, appendable, expectedReturnType);
	}
	
//	public String compileScenario(Scenario scenario, ImportManager importManager, boolean withTestAnnotation) {
//		IAppendable appendable = new StringBuilderBasedAppendable(importManager);
//		
//		if(withTestAnnotation){
//			appendable.append("@Test\n");
//		}
//		appendable.append("public void ");
//		String methodName = extractMethodName(scenario.getName());
//		appendable.append(methodName);
//		appendable.append("(){\n");
//		if(!scenario.getExamples().isEmpty()){		
//			generateExamples(scenario.getExamples(), scenario.getSteps(), appendable, importManager);
//		}
//		for(Step step: scenario.getSteps()){
//			generateStep(step, appendable);
//		}
//
//		appendable.append("\n}\n");
//		return appendable.toString();
//	}
//	
//	public String compileBackground(Background background, ImportManager importManager){
//		IAppendable appendable = new StringBuilderBasedAppendable(importManager);
//		
//		appendable.append("@Before\n");
//		appendable.append("public void setup(){\n");
//		for(Step step: background.getSteps()){
//			generateStep(step, appendable);
//		}
//		appendable.append("\n}\n");
//		return appendable.toString();
//	}
//	
//	protected void generateExamples(EList<Examples> examples, EList<Step> steps,
//			IAppendable appendable, ImportManager importManager) {
//		IAppendable stepAppendable = new StringBuilderBasedAppendable(importManager);
//		for(Step step: steps){
//			generateStep(step, stepAppendable);
//		}
//		String originalCode = stepAppendable.toString();
//		
//		for(Examples example: examples){
//			EList<ExampleCell> exampleHeader = example.getHeading().getParts();
//			for(ExampleRow row: example.getRows()){
//				EList<ExampleCell> exampleRow = row.getParts();
//				if(exampleHeader.size() == exampleRow.size()){
//					String nextCode = originalCode;
//					for(int i = 0; i < exampleHeader.size(); i++){
//						nextCode.replace(exampleHeader.get(i).getValue().replace("|",""), exampleRow.get(i).getValue().replace("|",""));
//					}
//					appendable.append(nextCode);
//				}else{
//					throw new RuntimeException();
//				}
//			}
//		}
//	}

//	protected void generateStep(Step step, IAppendable appendable){
//		Code code = step.getCode();
//			for(XAnnotation annotation: code.getAnnotations()){
//				//annotationCompiler.generate(annotation, appendable);
//			}
//			XBlockExpression expression = code.getBlockExpression();
//			if(expression != null){
//				compile(expression, appendable, newVoidRef());
//			}
//	}
	



	
	

	protected JvmTypeReference newVoidRef() {
		JvmParameterizedTypeReference reference = TypesFactory.eINSTANCE.createJvmParameterizedTypeReference();
		reference.setType(TypesFactory.eINSTANCE.createJvmVoid());
		return reference;
	}
	
	public static String extractMethodName(String name){
		String methodName = "";
		String[] words = name.split(" ");
		for(String word: words){
			// make first letter upper case and join them to MethodName
			String firstLetter = "" + word.charAt(0);
			firstLetter = firstLetter.toUpperCase();
			methodName = methodName + firstLetter + word.substring(1);
		}
		
		int indexOfSentenceEnd = methodName.lastIndexOf(".");
		if(indexOfSentenceEnd > -1){
			methodName = methodName.substring(0, indexOfSentenceEnd);
		}
		
		String firstLetter = "" + methodName.charAt(0);
		firstLetter = firstLetter.toLowerCase();
		methodName = firstLetter + methodName.substring(1);
		
		methodName = methodName.replaceAll("[^A-Za-z0-9_]","");
		return methodName;
	}
	
//	public void declareVariableAndJavaStatement(XExpression expression, IAppendable appendable){
//		this.declareNameInVariableScope(expression, appendable);
//		this.toJavaStatement(expression, appendable, true);
//	}
//	
//	public void getVariables(XExpression expression, IAppendable appendable){
//		this.toJavaExpression(expression, appendable);
//	}	
}
