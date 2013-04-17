/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.compiler;

import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.jnario.Specification;
import org.jnario.compiler.JnarioBatchCompiler;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SuiteBatchCompiler extends JnarioBatchCompiler {
	
	@Inject
	public SuiteClassNameProvider nameProvider;

	@Override
	protected String getClassName(EObject eObject) {
		if (eObject instanceof Specification) {
			return nameProvider.toJavaClassName((Specification) eObject);
		}
		return null;
	}
	
	@Override
	protected void addObjectsWithClasses(Resource resource, List<EObject> result) {
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			Notifier notifier = allContents.next();
			if (notifier instanceof Suite) {
				Suite suite = (Suite) notifier;
				result.add(suite);
				allContents.prune();
			}
		}
	}

}
