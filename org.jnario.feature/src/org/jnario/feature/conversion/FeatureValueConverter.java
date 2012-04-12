/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class FeatureValueConverter implements IValueConverter<String> {

	private final String prefix;

	public static FeatureValueConverter create(String prefix) {
		return new FeatureValueConverter(prefix);
	}

	public FeatureValueConverter(String prefix) {
		this.prefix = prefix;
	}

	public String toValue(String string, INode node)
			throws ValueConverterException {
		if(string == null){
			return null;
		}
		if(string.length() < prefix.length()){
			return string;
		}
		return string.substring(prefix.length()).trim();
	}

	public String toString(String value) throws ValueConverterException {
		if(value == null){
			return null;
		}
		return prefix + value + Strings.newLine();
	}
}
