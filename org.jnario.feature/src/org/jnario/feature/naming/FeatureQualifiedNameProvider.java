/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xtend2.naming.Xtend2QualifiedNameProvider;

import org.jnario.feature.feature.Step;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureQualifiedNameProvider extends Xtend2QualifiedNameProvider {
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Step) {
			String name = ((Step)obj).getName();
			if(name == null){
				return null;
			}
			return QualifiedName.create(name);
		}
		return super.getFullyQualifiedName(obj);
	}
}
