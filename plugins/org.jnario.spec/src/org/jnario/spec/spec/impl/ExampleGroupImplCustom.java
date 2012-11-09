/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.spec.impl;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.isEmpty;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.Executable;
import org.jnario.spec.spec.ExampleGroup;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class ExampleGroupImplCustom extends org.jnario.spec.spec.impl.ExampleGroupImpl {

	@Override
	public String getName() {
		if(name != null && name.length() == 0){
			return null;
		}
		return super.getName();
	}
	
	@Override
	public String getPackageName() {
		String packageName = super.getPackageName();
		if(packageName != null){
			return packageName;
		}
		if(eContainer() == null){
			return null;
		}
		ExampleGroup parent = getContainerOfType(eContainer(), ExampleGroup.class);
		if(parent == null){
			return null;
		}
		return parent.getPackageName();
	}
	
	@Override
	public EList<XAnnotation> getAnnotations() {
		if (getAnnotationInfo()!=null) {
			return getAnnotationInfo().getAnnotations();
		}
		return super.getAnnotations();
	}
	
	public boolean isPending(){
		Iterable<Executable> examples = filter(getMembers(), Executable.class);
		if(isEmpty(examples)){
			return true;
		}
		for (Executable executable : examples) {
			if(executable.isPending()){
				return true;
			}
		}
		return false;
	}
}
