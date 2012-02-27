package org.jnario.serializer;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.serializer.analysis.IGrammarConstraintProvider.IConstraint;
import org.eclipse.xtext.serializer.sequencer.ContextFinder;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class JnarioContextFinder extends ContextFinder {

	protected Iterable<EObject> findContextsByContainer(EObject semanticObject, Iterable<EObject> contextCandidates) {
		if (semanticObject.eResource() != null && semanticObject.eResource().getContents().contains(semanticObject))
			return Collections.singleton(getRootContext());
		EReference ref = semanticObject.eContainmentFeature();
		if (ref == null || (contextCandidates != null && Iterables.size(contextCandidates) < 2))
			return contextCandidates;
		Map<IConstraint, List<EObject>> containerConstraints = getConstraints(semanticObject.eContainer().eClass());
		int refID = semanticObject.eContainer().eClass().getFeatureID(ref);
		Set<EObject> childContexts = Sets.newHashSet();
		for (IConstraint constraint : Lists.newArrayList(containerConstraints.keySet()))
			if (constraint.getFeatures()[refID] == null)
				containerConstraints.remove(constraint);
			else
				childContexts.addAll(constraint.getFeatures()[refID].getCalledContexts());

		Set<EObject> result;
		if (contextCandidates != null) {
			result = Sets.newHashSet(contextCandidates);
			result.retainAll(childContexts);
		} else
			result = childContexts;
		if (result.size() == 1)
			return result;
		Iterable<EObject> filteredContexts = findContextsByContainer(semanticObject.eContainer(),
				Iterables.concat(containerConstraints.values()));
		childContexts = Sets.newHashSet();
		for (Map.Entry<IConstraint, List<EObject>> e : Lists.newArrayList(containerConstraints.entrySet()))
			if (intersect(filteredContexts, e.getValue()))
				childContexts.addAll(e.getKey().getFeatures()[refID].getCalledContexts());
		result.retainAll(childContexts);
		return result;
	}
}
