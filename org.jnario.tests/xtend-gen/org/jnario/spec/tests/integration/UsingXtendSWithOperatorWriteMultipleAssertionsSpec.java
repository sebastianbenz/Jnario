package org.jnario.spec.tests.integration;

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
@Named("write multiple assertions")
public class UsingXtendSWithOperatorWriteMultipleAssertionsSpec extends UsingXtendSWithOperatorSpec {
  @Test
  @Named("\\\"hello world\\\" => [\\n\\t\\t\\tlength => 11\\n\\t\\t\\tit should startWith[\\\"hello\\\"]\\n\\t\\t\\tit should endWith[\\\"world\\\"]\\n\\t\\t]")
  @Order(99)
  public void helloWorldLength11ItShouldStartWithHelloItShouldEndWithWorld() throws Exception {
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          int _length = it.length();
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(11));
          Assert.assertTrue("\nExpected length => 11 but"
           + "\n     length is " + Integer.valueOf(_length) + "\n", _doubleArrow);
          
          boolean _should_startWith = Should.should_startWith(it, "hello");
          Assert.assertTrue("\nExpected it should startWith(\"hello\") but"
           + "\n     it is " + "\"" + it + "\"" + "\n", _should_startWith);
          
          boolean _should_endWith = Should.should_endWith(it, "world");
          Assert.assertTrue("\nExpected it should endWith(\"world\") but"
           + "\n     it is " + "\"" + it + "\"" + "\n", _should_endWith);
          
        }
      };
    ObjectExtensions.<String>operator_doubleArrow("hello world", _function);
  }
}
