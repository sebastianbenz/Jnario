/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.editor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtend.core.xtend.XtendMember;

import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureFoldingRegionProvider extends DefaultFoldingRegionProvider {

	@Override
	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		if(eObject instanceof FeatureFile){
			calculateFolding((FeatureFile)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Scenario){
			calculateFolding((Scenario)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Step){
			calculateFolding((Step)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Background){
			calculateFolding((Background)eObject, foldingRegionAcceptor);
		}
	}

	private void calculateFolding(FeatureFile featureFile, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		int startFeature = getBegin(featureFile);
		if(startFeature >= 0 && !featureFile.getImports().isEmpty()){
			EList<XtendImport> imports = featureFile.getImports();
			XtendImport xtendImport = imports.get(imports.size()-1);
			setFoldingRegion(xtendImport, startFeature, foldingRegionAcceptor);
		}
	}
	

	private void calculateFolding(Background background, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		int begin = getBegin(background);
		EList<XtendMember> members = background.getMembers();
		if(begin >= 0 && members != null && !members.isEmpty()){
			setFoldingRegion(members.get(members.size() - 1), begin, foldingRegionAcceptor);
		}
	}
	
	private void calculateFolding(Scenario scenario, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		int begin = getBegin(scenario);
		EList<XtendMember> members = scenario.getMembers();
		if(begin >= 0 && members != null && !members.isEmpty()){
			setFoldingRegion(members.get(members.size() - 1), begin, foldingRegionAcceptor);
		}
	}

	private void calculateFolding(Step step, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		int begin = getBegin(step);
		if(begin >= 0 && step.getStepExpression() != null){
			StepExpression expr = step.getStepExpression();
			setFoldingRegion(expr, begin, foldingRegionAcceptor);
		}
	}

	private int getBegin(EObject object){
		ITextRegion beginRegion = getLocationInFileProvider().getSignificantTextRegion(object);
		if(beginRegion == null){
			return -1;
		}
		return beginRegion.getOffset();
	}

	private void setFoldingRegion(EObject object, int begin, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		ICompositeNode node = NodeModelUtils.getNode(object);
		if(node != null){
			int offset = node.getOffset() + node.getLength() - begin;
			foldingRegionAcceptor.accept(begin, offset);
		}
	}
}