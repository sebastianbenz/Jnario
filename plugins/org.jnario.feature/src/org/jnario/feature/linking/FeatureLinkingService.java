/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.linking;

import static org.eclipse.xtext.util.Strings.isEmpty;

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
import org.jnario.feature.feature.Step;
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
		if(context instanceof Step){
			return getLinkedStep(context, ref, node);
		}else{
			return super.getLinkedObjects(context, ref, node);
		}
	}

	private List<EObject> getLinkedStep(EObject context, EReference ref,
			INode node) {
		final EClass requiredType = ref.getEReferenceType();
		if (requiredType == null)
			return Collections.<EObject> emptyList();
		
		String crossRefString = getReferencedStepName(node);
		if (isEmpty(crossRefString)) {
			return Collections.emptyList();
		}
		final IScope scope = getScope(context, ref);
		IEObjectDescription eObjectDescription = null;
		QualifiedName qualifiedLinkName =  qualifiedNameConverter.toQualifiedName(crossRefString);
		for (IEObjectDescription desc : scope.getAllElements()) {
			System.out.println(desc.getName());
			if(desc.getQualifiedName().equals(qualifiedLinkName)){
				eObjectDescription = desc;
				break;
			}
		}
		if (eObjectDescription == null) {
			return Collections.emptyList();
		}
		return Collections.singletonList(eObjectDescription.getEObjectOrProxy());
	}

	private String getReferencedStepName(INode node) {
		String crossRefString = getCrossRefNodeAsString(node);
		crossRefString = stepNameProvider.removeArguments(crossRefString);
		return crossRefString;
	}
}
