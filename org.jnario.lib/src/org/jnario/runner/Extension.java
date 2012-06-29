/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Fields annotated with {@link Extension} are treated as spec extensions. When
 * a spec is executed, all methods in the fields respective class that are
 * annotated with {@link Before}, {@link After}, {@link AfterClass} or
 * {@link BeforeClass} will be executed before/after the spec execution.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Extension {

}