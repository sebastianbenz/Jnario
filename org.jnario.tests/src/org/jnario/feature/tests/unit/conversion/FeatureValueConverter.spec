/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.conversion

import org.jnario.feature.conversion.FeatureValueConverter

describe FeatureValueConverter{
	FeatureValueConverter subject = FeatureValueConverter::create("Prefix:")
	
	context toValue{
		fact subject.toValue("Prefix: text\n", null) => "text"
		fact subject.toValue(null, null) => null
		fact subject.toValue("xxx", null) => "xxx"
	}
	
	context toString{
		fact subject.toString("text") => "Prefix:text\n"
		fact subject.toString(null) => null
	}
	

} 