/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.isEmpty;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz 
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
			return getStepName((Step) obj);
		}else{
			return super.getFullyQualifiedName(EcoreUtil2.getContainerOfType(obj, Feature.class));
		}
	}

	public QualifiedName getStepName(Step step) {
		String name = null;
		if (step instanceof StepReference) {
			name  = stepNameProvider.nameOf((StepReference)step);
			name = stepNameProvider.removeKeywords(name);
		}else{
			name = step.getName();
		}
		if(isEmpty(name)){
			return null;
		}else{
			String formattedName = format(name);
			return toQualifiedName(step, formattedName);
		}
	}

	private QualifiedName toQualifiedName(EObject obj, String name) {
		String packageName = getPackageName(obj);
		if(isEmpty(packageName)){
			return QualifiedName.create(name);
		}
		List<String> segments = new LinkedList<String>();
		StringBuilder segment = new StringBuilder();
		for(int i = 0; i < packageName.length(); i++){
			char c = packageName.charAt(i);
			if(c == '.'){
				segments.add(segment.toString());
				segment = new StringBuilder();
			}else{
				segment.append(c);
			}
		}
		if(segment.length() > 0){
			segments.add(segment.toString());
		}
		segments.add(name);
		return QualifiedName.create(segments);
	}

	public String getPackageName(EObject obj) {
		XtendFile file = getContainerOfType(obj, XtendFile.class);
		return file.getPackage();
	}

	private String format(String name) {
		name = stepNameProvider.removeArguments(name);
		if(name.endsWith(".")){
			name = name.substring(0, name.length()-1);
		}
		return name;
	}
	
}
