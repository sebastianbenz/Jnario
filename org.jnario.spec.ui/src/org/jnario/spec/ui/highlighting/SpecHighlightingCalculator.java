/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.highlighting;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import static org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.EXTENSION_METHOD_INVOCATION;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtend.ide.highlighting.XtendHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.jnario.ExampleTable;
import org.jnario.JnarioPackage;
import org.jnario.Should;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.jnario.spec.spec.SpecPackage;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecHighlightingCalculator extends XtendHighlightingCalculator {

	@Override
	protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		EObject root = resource.getContents().get(0);
		if (!(root instanceof SpecFile)) {
			return;
		}
		SpecFile file = (SpecFile) root;
		ExampleGroup exampleGroup = (ExampleGroup) file.getXtendClass();
		highlightDeprectedXtendAnnotationTarget(acceptor, exampleGroup);
		provideHighlightingFor(exampleGroup, acceptor);
		super.doProvideHighlightingFor(resource, acceptor);
	}

	protected void provideHighlightingFor(ExampleGroup exampleGroup,
			IHighlightedPositionAcceptor acceptor) {
		if (exampleGroup != null) {
			for (XtendMember member : exampleGroup.getMembers()) {
				if (member.eClass() == XtendPackage.Literals.XTEND_FUNCTION) {
					XtendFunction function = (XtendFunction) member;
					XExpression rootExpression = function.getExpression();
					highlightRichStrings(rootExpression, acceptor);
				}else if(member.eClass() == XtendPackage.Literals.XTEND_FIELD){
					XtendField field = (XtendField) member;
					highlightXtendField(field,acceptor);
				}else if(member.eClass() == SpecPackage.Literals.EXAMPLE){
					Example example = (Example) member;
					highlightRichStrings(example.getBody() ,acceptor);
				}else if(member.eClass() == SpecPackage.Literals.EXAMPLE_GROUP){
					ExampleGroup subExampleGroup = (ExampleGroup) member;
					provideHighlightingFor(subExampleGroup,acceptor);
				}else if(member.eClass() == JnarioPackage.Literals.EXAMPLE_TABLE){
					provideHighlightingFor((ExampleTable)member,acceptor);
				}
				highlightDeprectedXtendAnnotationTarget(acceptor, member);
			}
		}
	}

	private void provideHighlightingFor(ExampleTable table, IHighlightedPositionAcceptor acceptor) {
		if(table == null){
			return;
		}
		List<INode> nodes = findNodesForFeature(table, JnarioPackage.Literals.EXAMPLE_TABLE__COLUMNS);
		if(nodes.isEmpty()){
			return;
		}
		highlighColumnNode(acceptor, nodes.get(0).getPreviousSibling());
		for (INode node : nodes) {
			highlighColumnNode(acceptor, node);
		}
	}

	private void highlighColumnNode(IHighlightedPositionAcceptor acceptor,
			INode node) {
		highlightNode(node, EXTENSION_METHOD_INVOCATION, acceptor);
	}
	
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
