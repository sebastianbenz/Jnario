/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.feature.validation;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureResourceValidator extends ResourceValidatorImpl {

	private static final String REFERENCE_ERROR_MESSAGE = "Couldn't resolve reference to ";

	@Override
	public List<Issue> validate(Resource resource, CheckMode mode,
			CancelIndicator mon) {
		List<Issue> validate = super.validate(resource, mode, mon);
		if(validate == null){
			return null;
		}
		List<Issue> finalList = newArrayList();
		for(Issue issue: validate){
			if(!issue.getMessage().startsWith(REFERENCE_ERROR_MESSAGE + "Step")){
				finalList.add(issue);
			}
		}
		
		return finalList;
	}
}
