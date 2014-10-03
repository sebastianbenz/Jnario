/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.launching;


import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.reconstr.impl.NodeIterator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegateJunitLaunch;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
public class FeatureJavaElementDelegate extends JavaElementDelegateJunitLaunch {
	
	@Inject
	private IJavaElementFinder elementFinder;

	@Override
	protected boolean containsElementsSearchedFor(IFile file) {
		return file.getName().endsWith("Feature.java");
	}
	
	@Override
	protected JvmIdentifiableElement findAssociatedJvmElement(EObject element) {
		if (element == null){
			return null;
		}
		EObject toExecute = EcoreUtil2.getContainerOfType(element, Scenario.class);
		if(toExecute == null){
		    toExecute = EcoreUtil2.getContainerOfType(element, Feature.class);
		}
		if(toExecute == null){
		    FeatureFile featureFile = EcoreUtil2.getContainerOfType(element, FeatureFile.class);
		    Iterable<Feature> features = Iterables.filter(featureFile.getXtendTypes(), Feature.class);
		    Iterator<Feature> iterator = features.iterator();
			if(iterator.hasNext()){
		    	toExecute = iterator.next();
		    }
		}
		if(toExecute == null){
			return null;
		}
		return super.findAssociatedJvmElement(toExecute);
	}
	
	protected IJavaElement findJavaElement(XtextResource resource, int offset) {
		IParseResult parseResult = resource.getParseResult();
		if (parseResult == null)
			return null;
		INode root = parseResult.getRootNode();
		INode node = NodeModelUtils.findLeafNodeAtOffset(root, offset);
		if (node == null)
			return null;
		INode previousSementic = null, nextSemantic = null;
		NodeIterator backwards = new NodeIterator(node);
		while (backwards.hasPrevious()) {
			INode n = backwards.previous();
			if (n instanceof ILeafNode && !((ILeafNode) n).isHidden()) {
				previousSementic = n;
				break;
			}
		}
		NodeIterator forward = new NodeIterator(node);
		while (forward.hasNext()) {
			INode n = forward.next();
			if (n instanceof ILeafNode && !((ILeafNode) n).isHidden()) {
				nextSemantic = n;
				break;
			}
		}
		EObject element;
		if (previousSementic != null && nextSemantic == null){
			element = NodeModelUtils.findActualSemanticObjectFor(previousSementic);
		}else if (nextSemantic != null && previousSementic == null){
			element = NodeModelUtils.findActualSemanticObjectFor(nextSemantic);
		}else{
		EObject prevObj = NodeModelUtils.findActualSemanticObjectFor(previousSementic);
		EObject nextObj = NodeModelUtils.findActualSemanticObjectFor(nextSemantic);
		if (prevObj == null || nextObj == null)
			return null;
		 element = findCommonContainer(prevObj, nextObj);
			
		}
		JvmIdentifiableElement jvmElement = findAssociatedJvmElement(element);
		if (jvmElement == null)
			return null;
		IJavaElement javaElement = elementFinder.findElementFor(jvmElement);
		return javaElement;
	}

}
