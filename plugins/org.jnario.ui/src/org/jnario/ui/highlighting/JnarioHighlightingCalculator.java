/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.highlighting;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import static org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.EXTENSION_METHOD_INVOCATION;

import java.util.List;

import org.eclipse.xtend.ide.highlighting.XtendHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XbasePackage;
import org.jnario.Should;

@SuppressWarnings("restriction")
public class JnarioHighlightingCalculator extends XtendHighlightingCalculator {

	@Override
	protected void computeFeatureCallHighlighting(
			XAbstractFeatureCall featureCall,
			IHighlightedPositionAcceptor acceptor) {
		if (featureCall instanceof Should) {
			Should should = (Should) featureCall;
			List<INode> nodes = findNodesForFeature(should, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE);
			if(nodes.isEmpty()){
				return;
			}
			for (INode node : nodes) {
				highlightNode(node, EXTENSION_METHOD_INVOCATION, acceptor);
			}
		}else{
			super.computeFeatureCallHighlighting(featureCall, acceptor);
		}
	}
}
