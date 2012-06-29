/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.runner;

import org.jnario.lib.AbstractSpecCreator;

/**
 * A factory for creating features or specs together with their subjects. It can 
 * be used to customize the creation of a specification to use, for example,
 * to use a dependency injection container or a mocking framework. Implementations
 * should override {@link AbstractSpecCreator}.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public interface SpecCreator {

	/**
	 * Creates a spec or feature instance. For example, given the following unit spec:
	 * 
	 * <pre>
	 * {@code
	 * describe Greeter{
	 *   fact subject.sayHello() => "Hello World"
	 * }
	 * </pre>
	 * 
	 * the parameter <em>klass</em> will be the generated 
	 * {@code GreeterSpec} class and this method should return
	 * an instance of {@code GreeterSpec}.
	 * 
	 * @param klass the spec type
	 * @return a new instance of the spec
	 */
	<T> T createSpec(Class<T> klass) ;
	
	/**
	 * Creates the subject of a spec. For example, given the following unit spec:
	 * 
	 * <pre>
	 * {@code
	 * describe Greeter{
	 *   fact subject.sayHello() => "Hello World"
	 * }
	 * </pre>
	 * 
	 * the parameter <em>klass</em> will be the subject's class 
	 * {@code Greeter} and this method should return
	 * an instance of {@code Greeter}.
	 * @param klass the subject type
	 * @return a new instance of the subject
	 */
	<T> T createSubject(Class<T> klass);
	
	/**
	 * Callback that is called before the spec is executed.
	 */
	void beforeSpecRun();
	
	/**
	 * Callback that is called after the spec is executed.
	 */
	void afterSpecRun();
	
}
