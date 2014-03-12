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
import org.jnario.feature.feature.Background;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameBackgroundSpecExamples;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("getClassName[Background]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureClassNameProviderGetClassNameBackgroundSpec extends FeatureClassNameProviderSpec {
  public ExampleTable<FeatureClassNameProviderGetClassNameBackgroundSpecExamples> _initFeatureClassNameProviderGetClassNameBackgroundSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("name", "feature", "expectedClassName"), 
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  Arrays.asList("\"\"", "\"Sample\"", "\"SampleFeatureBackground\""), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell0(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell1(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell2()),
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  Arrays.asList("\"Stuff\"", "\"Ha ha\"", "\"HaHaFeatureStuff\""), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell3(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell4(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell5()),
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  Arrays.asList("\"Do Stuff\"", "\"Sample\"", "\"SampleFeatureDoStuff\""), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell6(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell7(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell8()),
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  Arrays.asList("\"% Do$% Stuff\"", "\"$$Sample\"", "\"SampleFeatureDoStuff\""), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell9(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell10(), _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<FeatureClassNameProviderGetClassNameBackgroundSpecExamples> examples = _initFeatureClassNameProviderGetClassNameBackgroundSpecExamples();
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell0() {
    return "";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell1() {
    return "Sample";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell2() {
    return "SampleFeatureBackground";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell3() {
    return "Stuff";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell4() {
    return "Ha ha";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell5() {
    return "HaHaFeatureStuff";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell6() {
    return "Do Stuff";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell7() {
    return "Sample";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell8() {
    return "SampleFeatureDoStuff";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell9() {
    return "% Do$% Stuff";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell10() {
    return "$$Sample";
  }
  
  public String _initFeatureClassNameProviderGetClassNameBackgroundSpecExamplesCell11() {
    return "SampleFeatureDoStuff";
  }
  
  @Test
  @Named("examples work")
  @Order(1)
  public void _examplesWork() throws Exception {
    final Procedure1<FeatureClassNameProviderGetClassNameBackgroundSpecExamples> _function = new Procedure1<FeatureClassNameProviderGetClassNameBackgroundSpecExamples>() {
      public void apply(final FeatureClassNameProviderGetClassNameBackgroundSpecExamples it) {
        String _name = it.getName();
        String _feature = it.getFeature();
        Background _background = FeatureClassNameProviderGetClassNameBackgroundSpec.this.background(_name, _feature);
        String _className = FeatureClassNameProviderGetClassNameBackgroundSpec.this.className(_background);
        String _expectedClassName = it.getExpectedClassName();
        Assert.assertTrue("\nExpected className(background(name, feature)) => expectedClassName but"
         + "\n     className(background(name, feature)) is " + new org.hamcrest.StringDescription().appendValue(_className).toString()
         + "\n     background(name, feature) is " + new org.hamcrest.StringDescription().appendValue(_background).toString()
         + "\n     name is " + new org.hamcrest.StringDescription().appendValue(_name).toString()
         + "\n     feature is " + new org.hamcrest.StringDescription().appendValue(_feature).toString()
         + "\n     expectedClassName is " + new org.hamcrest.StringDescription().appendValue(_expectedClassName).toString() + "\n", Should.<String>operator_doubleArrow(_className, _expectedClassName));
        
      }
    };
    ExampleTableIterators.<FeatureClassNameProviderGetClassNameBackgroundSpecExamples>forEach(this.examples, _function);
  }
}
