/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.linking;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.FeatureJvmModelInferrer;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.linking.JnarioLazyLinker;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class FeatureLazyLinker extends JnarioLazyLinker {
	
	@Inject StepArgumentsProvider stepArgumentsProvider;
	@Inject FeatureQuery featureQuery;

	@Override
	protected void beforeModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
		generateStepValues(model);
	}

	private void generateStepValues(EObject model) {
		if (!(model instanceof FeatureFile)) {
			return;
		}
		FeatureFile featureFile = (FeatureFile) model;
		generateArguments(featureQuery.allSteps(featureFile));		
	}
	
	private void generateArguments(Iterable<Step> steps) {
		for(Step step: steps){
			generateArguments(step);
		}
	}

	private void generateArguments(Step step) {
		List<String> arguments = stepArgumentsProvider.findStepArguments(step);
		if(arguments.isEmpty()){
			return;
		}
		XVariableDeclaration stepValuesDec = createVariableForStepArguments(arguments);
		EList<XExpression> expressions = step.getStepExpression().getBlockExpression().getExpressions();
		expressions.add(0, stepValuesDec);
		
	}
	
	private XVariableDeclaration createVariableForStepArguments(List<String> arguments){
		XVariableDeclaration variableDec = XbaseFactory.eINSTANCE.createXVariableDeclaration();
		variableDec.setName(FeatureJvmModelInferrer.STEP_VALUES);
		XConstructorCall constructor = XbaseFactory.eINSTANCE.createXConstructorCall();
		for (String arg : arguments) {
			XStringLiteral stringLiteral = XbaseFactory.eINSTANCE.createXStringLiteral();
			stringLiteral.setValue(arg);
			constructor.getArguments().add(stringLiteral);
		}
		variableDec.setRight(constructor);
		return variableDec;
	}


}
