/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.naming.ExamplePendingSpecExamples;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Pending")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExamplePendingSpec extends ExampleSpec {
  public ExampleTable<ExamplePendingSpecExamples> _initExamplePendingSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("example", "expected"), 
      new ExamplePendingSpecExamples(  Arrays.asList("\"fact \'with description\'\"", "true"), _initExamplePendingSpecExamplesCell0(), _initExamplePendingSpecExamplesCell1()),
      new ExamplePendingSpecExamples(  Arrays.asList("\"fact \'with description and empty block\' {}\"", "true"), _initExamplePendingSpecExamplesCell2(), _initExamplePendingSpecExamplesCell3()),
      new ExamplePendingSpecExamples(  Arrays.asList("\"fact \'with description and code block\' {1 => 1}\"", "false"), _initExamplePendingSpecExamplesCell4(), _initExamplePendingSpecExamplesCell5()),
      new ExamplePendingSpecExamples(  Arrays.asList("\"fact 1 => 1\"", "false"), _initExamplePendingSpecExamplesCell6(), _initExamplePendingSpecExamplesCell7()),
      new ExamplePendingSpecExamples(  Arrays.asList("\"pending fact \'with description and code block\' {1 => 1}\"", "true"), _initExamplePendingSpecExamplesCell8(), _initExamplePendingSpecExamplesCell9())
    );
  }
  
  protected ExampleTable<ExamplePendingSpecExamples> examples = _initExamplePendingSpecExamples();
  
  public String _initExamplePendingSpecExamplesCell0() {
    return "fact \'with description\'";
  }
  
  public boolean _initExamplePendingSpecExamplesCell1() {
    return true;
  }
  
  public String _initExamplePendingSpecExamplesCell2() {
    return "fact \'with description and empty block\' {}";
  }
  
  public boolean _initExamplePendingSpecExamplesCell3() {
    return true;
  }
  
  public String _initExamplePendingSpecExamplesCell4() {
    return "fact \'with description and code block\' {1 => 1}";
  }
  
  public boolean _initExamplePendingSpecExamplesCell5() {
    return false;
  }
  
  public String _initExamplePendingSpecExamplesCell6() {
    return "fact 1 => 1";
  }
  
  public boolean _initExamplePendingSpecExamplesCell7() {
    return false;
  }
  
  public String _initExamplePendingSpecExamplesCell8() {
    return "pending fact \'with description and code block\' {1 => 1}";
  }
  
  public boolean _initExamplePendingSpecExamplesCell9() {
    return true;
  }
  
  @Test
  @Named("examples.forEach[pendingStateOf[example] should be expected]")
  @Order(1)
  public void _examplesForEachPendingStateOfExampleShouldBeExpected() throws Exception {
    final Procedure1<ExamplePendingSpecExamples> _function = new Procedure1<ExamplePendingSpecExamples>() {
      public void apply(final ExamplePendingSpecExamples it) {
        String _example = it.getExample();
        boolean _pendingStateOf = ExamplePendingSpec.this.pendingStateOf(_example);
        boolean _expected = it.getExpected();
        boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_pendingStateOf), _expected);
        Assert.assertTrue("\nExpected pendingStateOf(example) should be expected but"
         + "\n     pendingStateOf(example) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_pendingStateOf)).toString()
         + "\n     example is " + new org.hamcrest.StringDescription().appendValue(_example).toString()
         + "\n     expected is " + new org.hamcrest.StringDescription().appendValue(_expected).toString() + "\n", _should_be);
        
      }
    };
    ExampleTableIterators.<ExamplePendingSpecExamples>forEach(this.examples, _function);
  }
}
