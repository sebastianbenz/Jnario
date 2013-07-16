/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.naming.OperationNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("should name methods similar to JavaDoc links")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class OperationNameProviderShouldNameMethodsSimilarToJavaDocLinksSpec extends OperationNameProviderSpec {
  @Test
  @Named("nameOf[\\\"simpleOperation\\\"] => \\\"simpleOperation\\\"")
  @Order(1)
  public void _nameOfSimpleOperationSimpleOperation() throws Exception {
    String _nameOf = this.nameOf("simpleOperation");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_nameOf, "simpleOperation");
    Assert.assertTrue("\nExpected nameOf(\"simpleOperation\") => \"simpleOperation\" but"
     + "\n     nameOf(\"simpleOperation\") is " + new org.hamcrest.StringDescription().appendValue(_nameOf).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("nameOf[\\\"operationWithSingleArgument\\\"] => \\\"operationWithSingleArgument[String]\\\"")
  @Order(2)
  public void _nameOfOperationWithSingleArgumentOperationWithSingleArgumentString() throws Exception {
    String _nameOf = this.nameOf("operationWithSingleArgument");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_nameOf, "operationWithSingleArgument(String)");
    Assert.assertTrue("\nExpected nameOf(\"operationWithSingleArgument\") => \"operationWithSingleArgument(String)\" but"
     + "\n     nameOf(\"operationWithSingleArgument\") is " + new org.hamcrest.StringDescription().appendValue(_nameOf).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("nameOf[\\\"operationWithMultipleArguments\\\"] => \\\"operationWithMultipleArguments[String, Object, int]\\\"")
  @Order(3)
  public void _nameOfOperationWithMultipleArgumentsOperationWithMultipleArgumentsStringObjectInt() throws Exception {
    String _nameOf = this.nameOf("operationWithMultipleArguments");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_nameOf, "operationWithMultipleArguments(String, Object, int)");
    Assert.assertTrue("\nExpected nameOf(\"operationWithMultipleArguments\") => \"operationWithMultipleArguments(String, Object, int)\" but"
     + "\n     nameOf(\"operationWithMultipleArguments\") is " + new org.hamcrest.StringDescription().appendValue(_nameOf).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("nameOf[\\\"operationWithTypedArguments\\\"] => \\\"operationWithTypedArguments[List<String>, List<? extends String>]\\\"")
  @Order(4)
  public void _nameOfOperationWithTypedArgumentsOperationWithTypedArgumentsListStringListExtendsString() throws Exception {
    String _nameOf = this.nameOf("operationWithTypedArguments");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_nameOf, "operationWithTypedArguments(List<String>, List<? extends String>)");
    Assert.assertTrue("\nExpected nameOf(\"operationWithTypedArguments\") => \"operationWithTypedArguments(List<String>, List<? extends String>)\" but"
     + "\n     nameOf(\"operationWithTypedArguments\") is " + new org.hamcrest.StringDescription().appendValue(_nameOf).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("nameOf[\\\"operationWithVarArg\\\"] => \\\"operationWithVarArg[String[]]\\\"")
  @Order(5)
  public void _nameOfOperationWithVarArgOperationWithVarArgString() throws Exception {
    String _nameOf = this.nameOf("operationWithVarArg");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_nameOf, "operationWithVarArg(String[])");
    Assert.assertTrue("\nExpected nameOf(\"operationWithVarArg\") => \"operationWithVarArg(String[])\" but"
     + "\n     nameOf(\"operationWithVarArg\") is " + new org.hamcrest.StringDescription().appendValue(_nameOf).toString() + "\n", _doubleArrow);
    
  }
}
