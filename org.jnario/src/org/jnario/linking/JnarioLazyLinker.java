/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.linking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.linking.XbaseLazyLinker;
import org.jnario.CollectionLiteral;

import com.google.common.collect.Multimap;

public class JnarioLazyLinker extends XbaseLazyLinker {
	
	private class ExtendedLeafNode extends LeafNode{
		private final String text;
		private final ICompositeNode parent;
		
		public ExtendedLeafNode(String text, ICompositeNode parent) {
			this.text = text;
			this.parent = parent;
		}
		
		@Override
		public String getText() {
			return text;
		}
		
		@Override
		public ICompositeNode getParent() {
			return parent;
		}
	}

	@Override
	protected void installProxies(EObject obj, IDiagnosticProducer producer,
			Multimap<Setting, INode> settingsToLink) {
		if (obj instanceof CollectionLiteral) {
			CollectionLiteral collectionLiteral = (CollectionLiteral) obj;
			ICompositeNode parent = NodeModelUtils.getNode(obj);
			 
			createAndSetProxy(collectionLiteral, parent.getFirstChild(), XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE);
		}else{
			super.installProxies(obj, producer, settingsToLink);
		}
	}
	
}
