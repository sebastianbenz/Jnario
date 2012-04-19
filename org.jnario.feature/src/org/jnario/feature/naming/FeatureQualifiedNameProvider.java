/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.jnario.feature.feature.Step;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureQualifiedNameProvider extends XtendQualifiedNameProvider {

	private StepNameProvider stepNameProvider;
	
	@Inject
	public FeatureQualifiedNameProvider(StepNameProvider stepNameProvider) {
		this.stepNameProvider = stepNameProvider;
	}
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Step) {
			String name = ((Step)obj).getName();
			if(name == null){
				return null;
			}
			name = stepNameProvider.removeKeywordsAndArguments(name);
			return QualifiedName.create(name);
		}
		return super.getFullyQualifiedName(obj);
	}
}
