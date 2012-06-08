package org.jnario.spec.tests.integration;

import java.util.Stack;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("initialize fixtures")
public class UsingXtendSWithOperatorInitializeFixturesSpec extends UsingXtendSWithOperatorSpec {
  final Stack<String> stackWithTwoElements = new Function0<Stack<String>>() {
    public Stack<String> apply() {
      Stack<String> _stack = new Stack<String>();
      final Procedure1<Stack<String>> _function = new Procedure1<Stack<String>>() {
          public void apply(final Stack<String> it) {
            it.add("red");
            it.add("blue");
          }
        };
      Stack<String> _doubleArrow = ObjectExtensions.<Stack<String>>operator_doubleArrow(_stack, _function);
      return _doubleArrow;
    }
  }.apply();
  
  @Test
  @Named("stackWithTwoElements.size => 2")
  @Order(99)
  public void stackWithTwoElementsSize2() throws Exception {
    int _size = this.stackWithTwoElements.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(2));
    Assert.assertTrue("\nExpected stackWithTwoElements.size => 2 but"
     + "\n     stackWithTwoElements.size is " + Integer.valueOf(_size)
     + "\n     stackWithTwoElements is " + this.stackWithTwoElements + "\n", _doubleArrow);
    
  }
}
