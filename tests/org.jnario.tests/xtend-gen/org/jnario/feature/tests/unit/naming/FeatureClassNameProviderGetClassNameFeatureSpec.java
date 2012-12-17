package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
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

@SuppressWarnings("all")
@Named("getClassName[Feature]")
@RunWith(ExampleGroupRunner.class)
public class FeatureClassNameProviderGetClassNameFeatureSpec extends FeatureClassNameProviderSpec {
  public ExampleTable<FeatureClassNameProviderGetClassNameFeatureSpecExamples> _initFeatureClassNameProviderGetClassNameFeatureSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "expectedClassName"), 
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"Sample\"", "\"SampleFeature\""), "Sample", "SampleFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"\"", "null"), "", null),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"  Sample\"", "\"SampleFeature\""), "  Sample", "SampleFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"hello world\"", "\"HelloWorldFeature\""), "hello world", "HelloWorldFeature"),
      new FeatureClassNameProviderGetClassNameFeatureSpecExamples(  java.util.Arrays.asList("\"$hello %& world\"", "\"HelloWorldFeature\""), "$hello %& world", "HelloWorldFeature")
    );
  }
  
  protected ExampleTable<FeatureClassNameProviderGetClassNameFeatureSpecExamples> examples = _initFeatureClassNameProviderGetClassNameFeatureSpecExamples();
  
  @Test
  @Named("examples work")
  @Order(1)
  public void _examplesWork() throws Exception {
    final Procedure1<FeatureClassNameProviderGetClassNameFeatureSpecExamples> _function = new Procedure1<FeatureClassNameProviderGetClassNameFeatureSpecExamples>() {
        public void apply(final FeatureClassNameProviderGetClassNameFeatureSpecExamples it) {
          Feature _feature = Features.feature(it.name);
          String _className = FeatureClassNameProviderGetClassNameFeatureSpec.this.className(_feature);
          boolean _doubleArrow = Should.operator_doubleArrow(_className, it.expectedClassName);
          Assert.assertTrue("\nExpected className(feature(name)) => expectedClassName but"
           + "\n     className(feature(name)) is " + new StringDescription().appendValue(_className).toString()
           + "\n     feature(name) is " + new StringDescription().appendValue(_feature).toString()
           + "\n     name is " + new StringDescription().appendValue(it.name).toString()
           + "\n     expectedClassName is " + new StringDescription().appendValue(it.expectedClassName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<FeatureClassNameProviderGetClassNameFeatureSpecExamples>forEach(this.examples, _function);
  }
}
