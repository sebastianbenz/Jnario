/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 * 
 */
package org.jnario.validation;

/**
 * @author Sebastian Benz
 *
 */
public class JnarioIssueCodes {
	
	protected static final String ISSUE_CODE_PREFIX = "org.jnario.validation.IssueCodes.";

	public static final String JNARIO_LIB_NOT_ON_CLASSPATH = ISSUE_CODE_PREFIX + ".jnario_lib_missing";
	public static final String JUNIT_NOT_ON_CLASSPATH = ISSUE_CODE_PREFIX + ".junit_missing";

}
