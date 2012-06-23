package org.jnario.suite.unit;

import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("level[Suite]")
public class SuiteNodeBuilderLevelSuiteSpec extends SuiteNodeBuilderSpec {
  @Subject
  public SuiteNodeBuilder subject;
  
  @Test
  @Named("level[\\\"-Suite\\\"]   => 1")
  @Order(99)
  public void levelSuite1() throws Exception {
    Integer _level = this.level("#Suite");
    boolean _doubleArrow = Should.operator_doubleArrow(_level, Integer.valueOf(1));
    Assert.assertTrue("\nExpected level(\"#Suite\")   => 1 but"
     + "\n     level(\"#Suite\") is " + _level + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"--Suite\\\"]  => 2")
  @Order(99)
  public void levelSuite2() throws Exception {
    Integer _level = this.level("##Suite");
    boolean _doubleArrow = Should.operator_doubleArrow(_level, Integer.valueOf(2));
    Assert.assertTrue("\nExpected level(\"##Suite\")  => 2 but"
     + "\n     level(\"##Suite\") is " + _level + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"---Suite\\\"] => 3")
  @Order(99)
  public void levelSuite3() throws Exception {
    Integer _level = this.level("###Suite");
    boolean _doubleArrow = Should.operator_doubleArrow(_level, Integer.valueOf(3));
    Assert.assertTrue("\nExpected level(\"###Suite\") => 3 but"
     + "\n     level(\"###Suite\") is " + _level + "\n", _doubleArrow);
    
  }
  
  public Integer level(final String name) {
    Suite _suite = this.suite(name);
    Integer _level = this.subject.level(_suite);
    return _level;
  }
}
