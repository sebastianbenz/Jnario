package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
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

@SuppressWarnings("all")
@Named("getClassName[Background]")
@RunWith(ExampleGroupRunner.class)
public class FeatureClassNameProviderGetClassNameBackgroundSpec extends FeatureClassNameProviderSpec {
  public ExampleTable<FeatureClassNameProviderGetClassNameBackgroundSpecExamples> _initFeatureClassNameProviderGetClassNameBackgroundSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "feature", "expectedClassName"), 
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  java.util.Arrays.asList("\"\"", "\"Sample\"", "\"SampleFeatureBackground\""), "", "Sample", "SampleFeatureBackground"),
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  java.util.Arrays.asList("\"Stuff\"", "\"Ha ha\"", "\"HaHaFeatureStuff\""), "Stuff", "Ha ha", "HaHaFeatureStuff"),
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  java.util.Arrays.asList("\"Do Stuff\"", "\"Sample\"", "\"SampleFeatureDoStuff\""), "Do Stuff", "Sample", "SampleFeatureDoStuff"),
      new FeatureClassNameProviderGetClassNameBackgroundSpecExamples(  java.util.Arrays.asList("\"% Do$% Stuff\"", "\"$$Sample\"", "\"SampleFeatureDoStuff\""), "% Do$% Stuff", "$$Sample", "SampleFeatureDoStuff")
    );
  }
  
  protected ExampleTable<FeatureClassNameProviderGetClassNameBackgroundSpecExamples> examples = _initFeatureClassNameProviderGetClassNameBackgroundSpecExamples();
  
  @Test
  @Named("examples work")
  @Order(2)
  public void _examplesWork() throws Exception {
    final Procedure1<FeatureClassNameProviderGetClassNameBackgroundSpecExamples> _function = new Procedure1<FeatureClassNameProviderGetClassNameBackgroundSpecExamples>() {
        public void apply(final FeatureClassNameProviderGetClassNameBackgroundSpecExamples it) {
          Background _background = FeatureClassNameProviderGetClassNameBackgroundSpec.this.background(it.name, it.feature);
          String _className = FeatureClassNameProviderGetClassNameBackgroundSpec.this.className(_background);
          boolean _doubleArrow = Should.operator_doubleArrow(_className, it.expectedClassName);
          Assert.assertTrue("\nExpected className(background(name, feature)) => expectedClassName but"
           + "\n     className(background(name, feature)) is " + new StringDescription().appendValue(_className).toString()
           + "\n     background(name, feature) is " + new StringDescription().appendValue(_background).toString()
           + "\n     name is " + new StringDescription().appendValue(it.name).toString()
           + "\n     feature is " + new StringDescription().appendValue(it.feature).toString()
           + "\n     expectedClassName is " + new StringDescription().appendValue(it.expectedClassName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<FeatureClassNameProviderGetClassNameBackgroundSpecExamples>forEach(this.examples, _function);
  }
}
