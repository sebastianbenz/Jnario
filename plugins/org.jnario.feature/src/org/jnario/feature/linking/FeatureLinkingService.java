/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.naming.StepNameProvider;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureLinkingService extends DefaultLinkingService {
	
	@Inject
	private StepNameProvider stepNameProvider;
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node)
			throws IllegalNodeException {
		if(context instanceof StepReference && ref == FeaturePackage.Literals.STEP_REFERENCE__REFERENCE){
			return getLinkedStep(context, ref, node);
		}else{
			return super.getLinkedObjects(context, ref, node);
		}
	}
	
	public List<EObject> getLinkedStep(EObject context, EReference ref, INode node)
			throws IllegalNodeException {
		final EClass requiredType = ref.getEReferenceType();
		if (requiredType == null)
			return Collections.<EObject> emptyList();

		final String crossRefString = getReferencedStepName(node);
		if (crossRefString != null && !crossRefString.equals("")) {
			final IScope scope = getScope(context, ref);
			QualifiedName qualifiedLinkName =  qualifiedNameConverter.toQualifiedName(crossRefString);
			IEObjectDescription eObjectDescription = scope.getSingleElement(qualifiedLinkName);
			if (eObjectDescription != null) 
				return Collections.singletonList(eObjectDescription.getEObjectOrProxy());
		}
		return Collections.emptyList();
	}

	private String getReferencedStepName(INode node) {
		String crossRefString = getCrossRefNodeAsString(node);
		crossRefString = stepNameProvider.removeArguments(crossRefString);
		return crossRefString;
	}
}
