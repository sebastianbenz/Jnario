/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.editor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xtend2.xtend2.XtendImport;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

import de.bmw.carit.jnario.jnario.JnarioFile;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.StepExpression;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JnarioFoldingRegionProvider extends DefaultFoldingRegionProvider {

	@Override
	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		if(eObject instanceof JnarioFile){
			calculateFolding((JnarioFile)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Scenario){
			calculateFolding((Scenario)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Step){
			calculateFolding((Step)eObject, foldingRegionAcceptor);
		}
	}

	private void calculateFolding(JnarioFile jnarioFile, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		int startFeature = getBegin(jnarioFile);
		if(startFeature >= 0 && !jnarioFile.getImports().isEmpty()){
			EList<XtendImport> imports = jnarioFile.getImports();
			XtendImport xtendImport = imports.get(imports.size()-1);
			setFoldingRegion(xtendImport, startFeature, foldingRegionAcceptor);
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
		int offset = node.getOffset() + node.getLength() - begin;
		foldingRegionAcceptor.accept(begin, offset);
	}
}