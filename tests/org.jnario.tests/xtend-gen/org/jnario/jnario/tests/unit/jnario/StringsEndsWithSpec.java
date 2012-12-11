package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("endsWith")
@RunWith(ExampleGroupRunner.class)
public class StringsEndsWithSpec extends StringsSpec {
  @Test
  @Named("assert \\\'\\\'\\\'hello\\\'\\\'\\\'.endsWith[\\\'\\\'\\\'lo\\\'\\\'\\\']")
  @Order(5)
  public void _assertHelloEndsWithLo() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hello");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("lo");
    boolean _endsWith = Strings.endsWith(_builder, _builder_1);
    Assert.assertTrue("\nExpected \'\'\'hello\'\'\'.endsWith(\'\'\'lo\'\'\') but"
     + "\n     \'\'\'hello\'\'\' is " + new StringDescription().appendValue(_builder).toString()
     + "\n     \'\'\'lo\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _endsWith);
    
  }
  
  @Test
  @Named("assert !\\\'\\\'\\\'hello\\\'\\\'\\\'.endsWith[\\\'\\\'\\\'he\\\'\\\'\\\']")
  @Order(6)
  public void _assertHelloEndsWithHe() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hello");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("he");
    boolean _endsWith = Strings.endsWith(_builder, _builder_1);
    boolean _not = (!_endsWith);
    Assert.assertTrue("\nExpected !\'\'\'hello\'\'\'.endsWith(\'\'\'he\'\'\') but"
     + "\n     \'\'\'hello\'\'\'.endsWith(\'\'\'he\'\'\') is " + new StringDescription().appendValue(_endsWith).toString()
     + "\n     \'\'\'hello\'\'\' is " + new StringDescription().appendValue(_builder).toString()
     + "\n     \'\'\'he\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("assert !\\\'\\\'\\\'short\\\'\\\'\\\'.endsWith[\\\'\\\'\\\'longer\\\'\\\'\\\']")
  @Order(7)
  public void _assertShortEndsWithLonger() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("short");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("longer");
    boolean _endsWith = Strings.endsWith(_builder, _builder_1);
    boolean _not = (!_endsWith);
    Assert.assertTrue("\nExpected !\'\'\'short\'\'\'.endsWith(\'\'\'longer\'\'\') but"
     + "\n     \'\'\'short\'\'\'.endsWith(\'\'\'longer\'\'\') is " + new StringDescription().appendValue(_endsWith).toString()
     + "\n     \'\'\'short\'\'\' is " + new StringDescription().appendValue(_builder).toString()
     + "\n     \'\'\'longer\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _not);
    
  }
}
