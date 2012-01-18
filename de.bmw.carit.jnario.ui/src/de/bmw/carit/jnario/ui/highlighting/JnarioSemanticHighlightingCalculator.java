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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xtend2.ui.highlighting.XtendHighlightingCalculator;

import de.bmw.carit.jnario.jnario.AndRef;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.GivenRef;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.ThenRef;
import de.bmw.carit.jnario.jnario.WhenRef;
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
			String description;
			if(object.getName() != null){
				description = getFirstWord(object.getName());
				highlightStep(description, object, JnarioPackage.Literals.STEP__NAME);
			}
			else if(object instanceof GivenRef){
				GivenRef ref = (GivenRef) object;
				description = getFirstWord(ref.getReference().getName());
				highlightReference(description, object, JnarioPackage.Literals.GIVEN_REF__REFERENCE);
			}else if(object instanceof WhenRef){
				WhenRef ref = (WhenRef) object;
				description = getFirstWord(ref.getReference().getName());
				highlightReference(description, object, JnarioPackage.Literals.WHEN_REF__REFERENCE);
			}else if(object instanceof ThenRef){
				ThenRef ref = (ThenRef) object;
				description = getFirstWord(ref.getReference().getName());
				highlightReference(description, object, JnarioPackage.Literals.THEN_REF__REFERENCE);
			}else if(object instanceof AndRef){
				AndRef ref = (AndRef) object;
				description = getFirstWord(ref.getReference().getName());
				highlightReference(description, object, JnarioPackage.Literals.AND_REF__REFERENCE);
			}
			return Boolean.TRUE;
		}




		@Override
		public Boolean caseExampleHeading(ExampleHeading object) {
			// TODO Auto-generated method stub
			return super.caseExampleHeading(object);
		}

		private String getFirstWord(String desc) {
			if(desc != null){
				int begin = 0;
				for (; isWhiteSpace(desc, begin); begin++) {
				}
				int end = desc.indexOf(' ', begin);
				if (end > 0) {
					return desc.substring(begin, end);
				} else{
					if(desc.length() > 0){
						return desc;
					}
				}
			}
			return "";
		}

		private boolean isWhiteSpace(String desc, int begin) {
			return desc.charAt(begin) == ' ' || desc.charAt(begin) == '\t';
		}

		private void highlightStep(String string, EObject object, EAttribute attribute) {
			acceptor.addPosition(offset(object, attribute), string.length(),
					JnarioHighlightingConfiguration.STEP_ID);
		}

		private void highlightReference(String string, EObject object, EReference reference){
			acceptor.addPosition(offset(object, reference), string.length(), JnarioHighlightingConfiguration.STEP_REFERNCE_ID);
		}

		private int offset(EObject content, EAttribute attribute) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content,
					attribute);
			// works only if keyword exists only once in Step
			return nodes.iterator().next().getOffset();
		}

		private int offset(EObject content, EReference reference) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content,
					reference);
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
