/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * In Xtend you can use the [with operator](http://www.eclipse.org/xtend/new_and_noteworthy/index.html#withOperator)
 *  `=>` as a let-expression, which allows binding any object to the scope of
 * the block, which can be handy when initializing objects. In Jnario `=>` also
 * can be used to describe the expected behavior of objects.
 * It works great together with Xtend's with operator. You can use it to:
 */
@Named("Using Xtend\\\'s with Operator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class UsingXtendSWithOperatorSpec {
}
