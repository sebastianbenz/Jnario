/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.documentation;

import java.util.Stack;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Jnario provides different statements for writing assertions ([more...](/org/jnario/spec/tests/integration/AssertionSpec.html)).
 */
@Named("Writing Assertions")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class IntroducingJnarioSpecsWritingAssertionsSpec extends IntroducingJnarioSpecsSpec {
  /**
   * The `assert` statement fails if
   * the following expression does not evaluate to `true`.
   */
  @Test
  @Named("\\\'assert\\\'")
  @Order(1)
  public void _assert() throws Exception {
    Assert.assertTrue("\nExpected true but" + " did not." + "\n", true);
    
    Stack<Object> _stack = new Stack<Object>();
    boolean _empty = _stack.empty();
    Assert.assertTrue("\nExpected new Stack().empty() but"
     + "\n     new Stack() is " + new org.hamcrest.StringDescription().appendValue(_stack).toString() + "\n", _empty);
    
    boolean _startsWith = "Hello".startsWith("H");
    Assert.assertTrue("\nExpected \"Hello\".startsWith(\"H\") but"
     + "\n     \"Hello\".startsWith(\"H\") is " + new org.hamcrest.StringDescription().appendValue(_startsWith).toString() + "\n", _startsWith);
    
  }
  
  /**
   * If you want to express how an object should behave, you can use
   * `should`. It passes if the result of the left expression is
   * equal to the result of the right expression. You can also use `not` to
   * assert that both expressions have different results. You have already seen
   * the short cut `=>` which has the same effect as `should be`.
   */
  @Test
  @Named("\\\'should\\\' and `=>`")
  @Order(2)
  public void _shouldAnd() throws Exception {
    boolean _should_be = Should.<Boolean>should_be(
      Boolean.valueOf(true), true);
    Assert.assertTrue("\nExpected true should be true but"
     + "\n     true should be true is " + new org.hamcrest.StringDescription().appendValue(true).toString() + "\n", _should_be);
    
    boolean _doubleArrow = Should.<Boolean>operator_doubleArrow(
      Boolean.valueOf(false), false);
    Assert.assertTrue("\nExpected false => false but"
     + "\n     false => false is " + new org.hamcrest.StringDescription().appendValue(_doubleArrow).toString() + "\n", _doubleArrow);
    
    boolean _should_be_1 = Should.<Integer>should_be(
      Integer.valueOf((1 + 1)), Integer.valueOf(1));
    Assert.assertFalse("\nExpected 1 + 1 should not be 1 but"
     + "\n     1 + 1 is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf((1 + 1))).toString() + "\n", _should_be_1);
    
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf((1 + 1))).toString() + "\n", Should.<Integer>operator_doubleArrow(
      Integer.valueOf((1 + 1)), Integer.valueOf(2)));
    
  }
  
  /**
   * Assertions in Jnario are self-explainable. When an assertion fails, it tries to
   * provide as much information about the reason of its failure as possible. It will
   * print the exact expression that has failed together with the actual value
   * of all subexpressions. This means that you don't need to debug a test to
   * see why it actually has failed.
   */
  @Test
  @Named("Self-explaining failures")
  @Order(3)
  public void _selfExplainingFailures() throws Exception {
    final int x = 0;
    final int y = 1;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected x == 1 && y == 0 but"
         + "\n     x == 1 is " + new org.hamcrest.StringDescription().appendValue((x == 1)).toString()
         + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
         + "\n     y == 0 is " + new org.hamcrest.StringDescription().appendValue((y == 0)).toString()
         + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", ((x == 1) && (y == 0)));
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x == 1 && y == 0 but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x == 1 is <false>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is <0>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y == 0 is <false>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y is <1>");
    Helpers.is(_errorMessage, _builder);
    final String greeting = "hello";
    final Procedure1<Boolean> _function_1 = new Procedure1<Boolean>() {
      public void apply(final Boolean it) {
        String _upperCase = greeting.toUpperCase();
        Assert.assertFalse("\nExpected greeting.toUpperCase should not be \"HELLO\" but"
         + "\n     greeting.toUpperCase is " + new org.hamcrest.StringDescription().appendValue(_upperCase).toString()
         + "\n     greeting is " + new org.hamcrest.StringDescription().appendValue(greeting).toString() + "\n", Should.<String>should_be(_upperCase, "HELLO"));
        
      }
    };
    String _errorMessage_1 = Helpers.errorMessage(_function_1);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Expected greeting.toUpperCase should not be \"HELLO\" but");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("greeting.toUpperCase is \"HELLO\"");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("greeting is \"hello\"");
    Helpers.is(_errorMessage_1, _builder_1);
  }
}
