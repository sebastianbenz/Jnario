/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.highlighting;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xtend2.ui.highlighting.XtendHighlightingCalculator;

import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.util.JnarioSwitch;

public class JnarioSemanticHighlightingCalculator extends XtendHighlightingCalculator {

//	private static final Pattern PLACEHOLDER = Pattern.compile("<[^<\\r\\n]*>");

	private class Implementation extends JnarioSwitch<Boolean> {

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseStep(Step object) {
			if(object.getName() != null){
				highlightFirstWord(object, object.getName());
			}
			return Boolean.TRUE;
		}
		
		@Override
		public Boolean caseExampleHeading(ExampleHeading object) {
			// TODO Auto-generated method stub
			return super.caseExampleHeading(object);
		}

		private void highlightFirstWord(EObject object, String desc) {
			int begin = 0;
			for (; isWhiteSpace(desc, begin); begin++) {
			}
			int end = desc.indexOf(' ', begin);
			if (end > 0) {
				highlight(desc.substring(begin, end), object);
			} else{
				if(desc.length() > 0){
					highlight(desc, object);
				}
			}
		}

		private boolean isWhiteSpace(String desc, int begin) {
			return desc.charAt(begin) == ' ' || desc.charAt(begin) == '\t';
		}

		private void highlight(String string, EObject object) {
			acceptor.addPosition(offset(object, JnarioPackage.Literals.STEP__NAME), string.length(),
					JnarioHighlightingConfiguration.STEP_ID);
		}

		private int offset(EObject content, EAttribute attribute) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content,
					attribute);
			// works only if keyword exists only once in Step
			return nodes.iterator().next().getOffset();
		}
	}

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		super.provideHighlightingFor(resource, acceptor);
		if (noNodeModel(resource)) {
			return;
		}

		Implementation highlighter = new Implementation(acceptor);
		Iterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			highlighter.doSwitch((EObject) contents.next());
		}
	}

	protected EObject root(XtextResource resource) {
		return resource.getParseResult().getRootASTElement();
	}

	protected boolean noNodeModel(XtextResource resource) {
		return resource == null || resource.getParseResult() == null
				|| root(resource) == null;
	}

}
