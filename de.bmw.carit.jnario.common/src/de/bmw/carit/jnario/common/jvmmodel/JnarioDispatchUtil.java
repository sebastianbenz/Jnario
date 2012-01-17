/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.jvmmodel;

import static com.google.common.collect.Iterables.filter;

import java.util.Iterator;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xtend2.jvmmodel.DispatchUtil;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;

import com.google.inject.Inject;

public class JnarioDispatchUtil extends DispatchUtil {
	
	@Inject
	private IJvmModelAssociations associations;
	
	public boolean isDispatcherFunction(JvmOperation inferredOperation) {
		Iterator<XtendFunction> operations = filter(associations.getSourceElements(inferredOperation), XtendFunction.class).iterator();
		if(!operations.hasNext()){
			return false;
		}
		XtendFunction xtendFunction = operations.next();
		return !inferredOperation.getSimpleName().startsWith("_") && xtendFunction.isDispatch();
	}

}
