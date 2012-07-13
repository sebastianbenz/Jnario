/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.naming;

import static org.eclipse.xtext.util.Strings.isEmpty;
import static org.jnario.util.Nodes.textForFeature;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SpecQualifiedNameProvider extends XtendQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof ExampleGroup) {
			ExampleGroup suite = (ExampleGroup)obj;
			return getFullyQualifiedName(suite);
		}
		return super.getFullyQualifiedName(obj);
	}

	private QualifiedName getFullyQualifiedName(ExampleGroup exampleGroup) {
		String name = textForFeature(exampleGroup, SpecPackage.Literals.EXAMPLE_GROUP__TARGET_TYPE);
		int end = name.lastIndexOf('.');
		if(end != -1){
			name = name.substring(end+1);
		}
		String description = exampleGroup.getName();
		if(!isEmpty(description)){
			description = description.trim();
			name = isEmpty(name) ? description : (name + " " + description);
		}
		if(isEmpty(name)){
			return null;
		}
		
		final String qualifiedName = (exampleGroup.getPackageName() != null ? exampleGroup.getPackageName() + "." : "")
				+ name;
		return qualifiedNameConverter.toQualifiedName(qualifiedName);
	}
	
}
