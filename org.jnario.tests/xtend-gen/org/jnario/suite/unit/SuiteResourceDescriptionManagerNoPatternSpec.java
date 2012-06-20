package org.jnario.suite.unit;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.Matcher;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.unit.SuiteResourceDescriptionManagerSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("no pattern")
public class SuiteResourceDescriptionManagerNoPatternSpec extends SuiteResourceDescriptionManagerSpec {
  @Test
  @Named("affected if referenced")
  @Order(99)
  public void affectedIfReferenced() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.append("- \"MySpec\"");
    _builder.newLine();
    final Resource suite = this.m.parseSuite(_builder);
    Matcher<Resource> _affected = this.affected();
    boolean _should_be = Should.<Resource>should_be(suite, _affected);
    Assert.assertTrue("\nExpected suite should be affected but"
     + "\n     suite is " + suite
     + "\n     affected is " + _affected + "\n", _should_be);
    
  }
  
  @Test
  @Named("not affected if not referenced")
  @Order(99)
  public void notAffectedIfNotReferenced() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.append("- \"MyOtherSpec\"");
    _builder.newLine();
    final Resource suite = this.m.parseSuite(_builder);
    Matcher<Resource> _affected = this.affected();
    boolean _should_be = Should.<Resource>should_be(suite, _affected);
    Assert.assertFalse("\nExpected suite should not be affected but"
     + "\n     suite is " + suite
     + "\n     affected is " + _affected + "\n", _should_be);
    
  }
}
