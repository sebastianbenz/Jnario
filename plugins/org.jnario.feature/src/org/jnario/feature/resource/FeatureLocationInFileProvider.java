/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.resource;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import static org.jnario.util.Strings.countWhitespaceAtEnd;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.resource.XtendLocationInFileProvider;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegionWithLineInformation;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;


public class FeatureLocationInFileProvider extends XtendLocationInFileProvider {

	protected ITextRegion getTextRegion(EObject obj, boolean isSignificant) {
		if(isSignificant && obj instanceof Step){
			return getSignificantTextRegionStep((Step) obj);
		}
		if (obj instanceof Scenario) {
			if(isSignificant && obj instanceof Scenario){
				return getSignificantTextRegionStep((Scenario) obj);
			}
		}
		return super.getTextRegion(obj, isSignificant);
	}
	

	private ITextRegion getSignificantTextRegionStep(Scenario element) {
		List<INode> nodes = nodesFor(element);
		return createTextRegion(nodes);
	}

	public List<INode> nodesFor(Scenario element) {
		return findNodesForFeature(element, XtendPackage.Literals.XTEND_CLASS__NAME);
	}
	
	

	private ITextRegion getSignificantTextRegionStep(Step element) {
		List<INode> nodes;
		if (element instanceof StepReference) {
			nodes = findNodesForFeature(element, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE);
		}else{
			nodes = findNodesForFeature(element, XtendPackage.Literals.XTEND_FUNCTION__NAME);
		}
		return createTextRegion(nodes);
	}

	protected ITextRegion createTextRegion(List<INode> nodes) {
		if (nodes.isEmpty()) {
			return createRegion(Collections.<INode>emptyList());
		}
		int length = 0;
		int offset = 0;
		int lineNumber = 0;
		int endLineNumber = 0;
		boolean isFirstNode = true;
		for (int i=0; i<nodes.size(); i++) {
			INode node = nodes.get(i);
			if (!isHidden(node)) {
				if(isFirstNode){
					offset = node.getOffset();
					lineNumber = node.getStartLine();
					isFirstNode = false;
				}
				length += node.getLength();
				if(isLastNode(nodes, i)){
					endLineNumber = node.getEndLine();
					length = length - countWhitespaceAtEnd(node.getText());
				}
			}
		}
		return new TextRegionWithLineInformation(offset, length, lineNumber, endLineNumber);
	}

	private boolean isLastNode(List<INode> nodes, int i){
		return nodes.size() == i + 1;
	}
	
}
