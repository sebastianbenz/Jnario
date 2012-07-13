/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import static org.eclipse.xtext.util.Strings.isEmpty;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.EcoreUtil2;
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
			Step step = (Step)obj;
			String name = step.getName();
			if(isEmpty(name)){
				return null;
			}
			name = getName(name);
			return toQualifiedName(step, name);
		}
		return super.getFullyQualifiedName(obj);
	}

	private QualifiedName toQualifiedName(EObject obj, String name) {
		XtendFile file = EcoreUtil2.getContainerOfType(obj, XtendFile.class);
		String[] parentSegments = file.getPackage().split("\\.");
		String[] segments = new String[parentSegments.length + 1];
		System.arraycopy(parentSegments, 0, segments, 0, parentSegments.length);
		segments[parentSegments.length] = name;
		return QualifiedName.create(segments);
	}

	private String getName(String name) {
		name = stepNameProvider.removeArguments(name);
		if(name.endsWith(".")){
			name = name.substring(0, name.length()-1);
		}
		return name;
	}
	
}
