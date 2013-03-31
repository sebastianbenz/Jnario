/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.compiler;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.jnario.compiler.JnarioBatchCompiler;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.naming.FeatureClassNameProvider;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class FeatureBatchCompiler extends JnarioBatchCompiler {
	
	@Inject
	public FeatureClassNameProvider nameProvider;

	@Override
	protected String getClassName(EObject eObject) {
		return nameProvider.toJavaClassName(eObject);
	}
	
	@Override
	protected List<EObject> getObjectsWithClasses(ResourceSet resourceSet) {
		TreeIterator<Notifier> allContents = resourceSet.getAllContents();
		List<EObject> result = newArrayList();
		while (allContents.hasNext()) {
			Notifier notifier = allContents.next();
			if (notifier instanceof Feature) {
				Feature feature = (Feature) notifier;
				result.add(feature);
				if (feature.getBackground() != null) {
					result.add(feature.getBackground());
				}
				Iterable<Scenario> scenarios = filter(feature.getMembers(), Scenario.class);
				for (Scenario scenario : scenarios) {
					result.add(scenario);
				}
				allContents.prune();
			}
		}
		return result;
	}

}
