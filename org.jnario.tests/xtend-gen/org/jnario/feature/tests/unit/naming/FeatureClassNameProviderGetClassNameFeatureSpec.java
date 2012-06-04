package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameFeatureSpecExamples;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("getClassName[Feature]")
public class FeatureClassNameProviderGetClassNameFeatureSpec extends FeatureClassNameProviderSpec {
  @Before
  public void _initFeatureClassNameProviderGetClassNameFeatureSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "expectedClassName"), 
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"Sample\"", "\"SampleFeature\""), "Sample", "SampleFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"\"", "\"FeatureFeature\""), "", "FeatureFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"  Sample\"", "\"SampleFeature\""), "  Sample", "SampleFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"hello world\"", "\"HelloWorldFeature\""), "hello world", "HelloWorldFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"$hello %& world\"", "\"HelloWorldFeature\""), "$hello %& world", "HelloWorldFeature")
    );
  }
  
  protected ExampleTable<FeatureClassNameProviderGetClassNameFeatureSpecExamples> examples;
  
  @Test
  @Named("examples work")
  @Order(99)
  public void examplesWork() throws Exception {
    final Procedure1<FeatureClassNameProviderGetClassNameFeatureSpecExamples> _function = new Procedure1<FeatureClassNameProviderGetClassNameFeatureSpecExamples>() {
        public void apply(final FeatureClassNameProviderGetClassNameFeatureSpecExamples it) {
          Feature _feature = FeatureClassNameProviderGetClassNameFeatureSpec.this.feature(it.name);
          String _className = FeatureClassNameProviderGetClassNameFeatureSpec.this.className(_feature);
          boolean _doubleArrow = Should.operator_doubleArrow(_className, it.expectedClassName);
          Assert.assertTrue("\nExpected className(feature(name)) => expectedClassName but"
           + "\n     className(feature(name)) is " + "\"" + _className + "\""
           + "\n     feature(name) is " + _feature
           + "\n     name is " + "\"" + it.name + "\""
           + "\n     expectedClassName is " + "\"" + it.expectedClassName + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<FeatureClassNameProviderGetClassNameFeatureSpecExamples>forEach(this.examples, _function);
  }
}
