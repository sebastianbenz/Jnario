/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameFeatureSpecExamples;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec;
import org.jnario.jnario.test.util.Features;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("getClassName[Feature]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureClassNameProviderGetClassNameFeatureSpec extends FeatureClassNameProviderSpec {
  public ExampleTable<FeatureClassNameProviderGetClassNameFeatureSpecExamples> _initFeatureClassNameProviderGetClassNameFeatureSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("name", "expectedClassName"), 
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  Arrays.asList("null", "null"), null, null),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  Arrays.asList("\"Sample\"", "\"SampleFeature\""), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell2(), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell3()),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  Arrays.asList("\"\"", "null"), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell4(), null),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  Arrays.asList("\"  Sample\"", "\"SampleFeature\""), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell6(), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell7()),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  Arrays.asList("\"hello world\"", "\"HelloWorldFeature\""), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell8(), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell9()),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  Arrays.asList("\"$hello %& world\"", "\"HelloWorldFeature\""), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell10(), _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<FeatureClassNameProviderGetClassNameFeatureSpecExamples> examples = _initFeatureClassNameProviderGetClassNameFeatureSpecExamples();
  
  public Object _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell0() {
    return null;
  }
  
  public Object _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell1() {
    return null;
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell2() {
    return "Sample";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell3() {
    return "SampleFeature";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell4() {
    return "";
  }
  
  public Object _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell5() {
    return null;
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell6() {
    return "  Sample";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell7() {
    return "SampleFeature";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell8() {
    return "hello world";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell9() {
    return "HelloWorldFeature";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell10() {
    return "$hello %& world";
  }
  
  public String _initFeatureClassNameProviderGetClassNameFeatureSpecExamplesCell11() {
    return "HelloWorldFeature";
  }
  
  @Test
  @Named("examples work")
  @Order(1)
  public void _examplesWork() throws Exception {
    final Procedure1<FeatureClassNameProviderGetClassNameFeatureSpecExamples> _function = new Procedure1<FeatureClassNameProviderGetClassNameFeatureSpecExamples>() {
      public void apply(final FeatureClassNameProviderGetClassNameFeatureSpecExamples it) {
        String _name = it.getName();
        Feature _feature = Features.feature(_name);
        String _className = FeatureClassNameProviderGetClassNameFeatureSpec.this.className(_feature);
        String _expectedClassName = it.getExpectedClassName();
        Assert.assertTrue("\nExpected className(feature(name)) => expectedClassName but"
         + "\n     className(feature(name)) is " + new org.hamcrest.StringDescription().appendValue(_className).toString()
         + "\n     feature(name) is " + new org.hamcrest.StringDescription().appendValue(_feature).toString()
         + "\n     name is " + new org.hamcrest.StringDescription().appendValue(_name).toString()
         + "\n     expectedClassName is " + new org.hamcrest.StringDescription().appendValue(_expectedClassName).toString() + "\n", Should.<String>operator_doubleArrow(_className, _expectedClassName));
        
      }
    };
    ExampleTableIterators.<FeatureClassNameProviderGetClassNameFeatureSpecExamples>forEach(this.examples, _function);
  }
}
