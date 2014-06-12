/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(SpecTestCreator.class)
@Named("ExampleGroup")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleGroupSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should resolve target class")
  @Order(1)
  public void _shouldResolveTargetClass() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport static org.junit.Assert.*\r\n\t\t\timport org.junit.Assert\r\n\t\r\n\t\t\tdescribe Assert {\r\n\t\t\t\r\n\t\t\t\tfact \"should resolve target class\"{\r\n\t\t\t\t}  \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    Result _execute = this._behaviorExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(_execute, _isSuccessful);
  }
  
  @Test
  @Named("should be able to declare helper methods")
  @Order(2)
  public void _shouldBeAbleToDeclareHelperMethods() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"ExampleGroup\" {\r\n\t\t\t\r\n\t\t\t\tint i = 0\r\n\t\t\t\r\n\t\t\t\tfact \"should be able to declare void helper methods\"{\r\n\t\t\t\t\tinc()\r\n\t\t\t\t\ti => 1\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tdef void inc(){\r\n\t\t\t\t\ti = i + 1 \r\n\t\t\t\t}  \r\n\t\t\t\t\r\n\t\t\t\tfact \"should be able to declare helper methods with parameter and return type\"{\r\n\t\t\t\t\tinc2(i) => 1 \r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tfact \"should be able to use helper methods as extensions\"{\r\n\t\t\t\t\ti.inc2 => 1 \r\n\t\t\t\t}\r\n\t\t\t\t  \r\n\t\t\t\tdef int inc2(int value){\r\n\t\t\t\t\tvalue + 1 \r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tfact \"should be able to declare helper methods with inferred return type\"{\r\n\t\t\t\t\t// will not compile otherwise\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tdef int inc3(){\r\n\t\t\t\t\t5\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tfact \"should automatically rethrow all exceptions\"{\r\n\t\t\t\t\t// will not compile otherwise\r\n\t\t\t\t}\r\n\t\t\t\t  \r\n\t\t\t\tdef inc4(){\r\n\t\t\t\t\tthrow new java.io.IOException()\r\n\t\t\t\t}\r\n\t\t\t\r\n\t\t\t\tdescribe \"Nested Examples\"{\r\n\t\t\t\t\t\r\n\t\t\t\t\tfact \"should support extensions methods from parent example group\"{\r\n\t\t\t\t\t\ti.inc2 => 1 \r\n\t\t\t\t\t}\r\n\t\t\t\t\t\r\n\t\t\t\t\tfact \"should support extension methods from nested example group\"{\r\n\t\t\t\t\t\ti.inc5 => 1 \r\n\t\t\t\t\t}\r\n\t\t\t\t\t\r\n\t\t\t\t\tdef inc5(int value){\r\n\t\t\t\t\t\tvalue + 1 \r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t   \r\n\t\t\t} \r\n\t\t";
    Result _execute = this._behaviorExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(_execute, _isSuccessful);
  }
}
