package org.jnario.spec.tests.integration;

import java.util.Stack;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * In Xtend you can use the [with operator](http://www.eclipse.org/xtend/new_and_noteworthy/index.html#withOperator)
 *  `=>` as a let-expression, which allows binding any object to the scope of
 * the block, which can be handy when initializing objects. In Jnario `=>` also
 * can be used to describe the expected behavior of objects.
 * It works great together with Xtend's with operator. You can use it to:
 */
@SuppressWarnings("all")
@Named("Using Xtend\\\'s with Operator")
@RunWith(ExampleGroupRunner.class)
public class UsingXtendSWithOperatorSpec {
  @Test
  @Named("initialize fixtures")
  @Order(1)
  public void _initializeFixtures() throws Exception {
    Stack<String> _stack = new Stack<String>();
    final Procedure1<Stack<String>> _function = new Procedure1<Stack<String>>() {
        public void apply(final Stack<String> it) {
          it.add("red");
          it.add("blue");
        }
      };
    final Stack<String> stackWithTwoElements = ObjectExtensions.<Stack<String>>operator_doubleArrow(_stack, _function);
    int _size = stackWithTwoElements.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(2));
    Assert.assertTrue("\nExpected stackWithTwoElements.size => 2 but"
     + "\n     stackWithTwoElements.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     stackWithTwoElements is " + new StringDescription().appendValue(stackWithTwoElements).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("write multiple assertions")
  @Order(2)
  public void _writeMultipleAssertions() throws Exception {
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          int _length = it.length();
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(11));
          Assert.assertTrue("\nExpected length => 11 but"
           + "\n     length is " + new StringDescription().appendValue(Integer.valueOf(_length)).toString() + "\n", _doubleArrow);
          
          boolean _should_startWith = Should.should_startWith(it, "hello");
          Assert.assertTrue("\nExpected it should startWith(\"hello\") but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_startWith);
          
          boolean _should_endWith = Should.should_endWith(it, "world");
          Assert.assertTrue("\nExpected it should endWith(\"world\") but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_endWith);
          
        }
      };
    ObjectExtensions.<String>operator_doubleArrow(
      "hello world", _function);
  }
}
