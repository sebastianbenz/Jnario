/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import org.eclipse.xtend.core.conversion.XtendValueConverterService;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class JnarioValueConverterService extends XtendValueConverterService {
	
	@Inject ShouldValueConverter shouldValueConverter;
	
	@ValueConverter(rule = "Should")
	public IValueConverter<String> getShouldValueConverter() {
		return shouldValueConverter;
	}

}
