/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.editor;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;
import static org.jnario.util.Strings.countWhitespaceAtEnd;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureFoldingRegionProvider extends DefaultFoldingRegionProvider {

	protected void computeObjectFolding(XtextResource xtextResource, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		IParseResult parseResult = xtextResource.getParseResult();
		if(parseResult != null){
			EObject rootASTElement = parseResult.getRootASTElement();
			if(rootASTElement != null){
				computeObjectFolding(rootASTElement, foldingRegionAcceptor);
				TreeIterator<EObject> allContents = rootASTElement.eAllContents();
				while (allContents.hasNext()) {
					EObject eObject = allContents.next();
					if (isHandled(eObject)) {
						computeObjectFolding(eObject, foldingRegionAcceptor);
					}
					if (!shouldProcessContent(eObject)) {
						allContents.prune();
					}
				}
			}
		}
	}
	
	@Override
	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		if(eObject instanceof FeatureFile){
			calculateFolding((FeatureFile)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Scenario){
			calculateFolding((Scenario)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof StepImplementation){
			calculateFolding((Step)eObject, foldingRegionAcceptor);
		}else if(eObject instanceof Background){
			calculateFolding((Background)eObject, foldingRegionAcceptor);
		}
	}

	private void calculateFolding(FeatureFile featureFile, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		EList<XtendImport> imports = featureFile.getImports();
		if(imports.isEmpty()){
			return;
		}
		int begin = 0;
		XtendImport xtendImport = imports.get(imports.size()-1);
		setFoldingRegion(xtendImport, begin, foldingRegionAcceptor);
	}
	
	private void calculateFolding(Scenario scenario, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		int begin = getBegin(scenario);
		EList<XtendMember> members = scenario.getMembers();
		XtendMember previous = null;
		for (XtendMember xtendMember : members) {
			if (xtendMember instanceof Step) {
				if (previous != null && getNode(previous) != null) {
					setFoldingRegion(previous, begin, foldingRegionAcceptor);
					break;
				}
			}else{
				previous = xtendMember;
			}
		}
	}

	private void calculateFolding(Step step, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		List<INode> nodes = findNodesForFeature(step, XtendPackage.Literals.XTEND_FUNCTION__NAME);
		if(nodes.isEmpty()){
			return;
		}
		INode last = nodes.get(nodes.size() - 1);
		int length = last.getLength() - countWhitespaceAtEnd(last.getText());
		setFoldingRegion(step.getExpression(), last.getOffset() + length, foldingRegionAcceptor);
	}

	private int getBegin(EObject object){
		ITextRegion beginRegion = getLocationInFileProvider().getSignificantTextRegion(object);
		if(beginRegion == null){
			return -1;
		}
		return beginRegion.getOffset() + beginRegion.getLength() - 1;
	}

	private void setFoldingRegion(EObject object, int begin, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		ICompositeNode node = NodeModelUtils.getNode(object);
		if(node != null){
			int offset = node.getOffset() + node.getLength() - begin;
			foldingRegionAcceptor.accept(begin, offset);
		}
	}
}