package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameExampleTableSpecExamples;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("getClassName[ExampleTable]")
public class FeatureClassNameProviderGetClassNameExampleTableSpec extends FeatureClassNameProviderSpec {
  @Before
  public void _initFeatureClassNameProviderGetClassNameExampleTableSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "scenario", "feature", "expectedClassName"), 
      new FeatureClassNameProviderGetClassNameExampleTableSpecExamples(  java.util.Arrays.asList("\"\"", "\"Das Szenario\"", "\"Sample\"", "\"SampleFeatureDasSzenarioExamples\""), "", "Das Szenario", "Sample", "SampleFeatureDasSzenarioExamples"),
      new FeatureClassNameProviderGetClassNameExampleTableSpecExamples(  java.util.Arrays.asList("\"Samples\"", "\"Das Szenario\"", "\"Sample\"", "\"SampleFeatureDasSzenarioSamples\""), "Samples", "Das Szenario", "Sample", "SampleFeatureDasSzenarioSamples"),
      new FeatureClassNameProviderGetClassNameExampleTableSpecExamples(  java.util.Arrays.asList("\"Many Samples\"", "\"Das Szenario\"", "\"Sample\"", "\"SampleFeatureDasSzenarioManySamples\""), "Many Samples", "Das Szenario", "Sample", "SampleFeatureDasSzenarioManySamples"),
      new FeatureClassNameProviderGetClassNameExampleTableSpecExamples(  java.util.Arrays.asList("\"% Many% Samples\"", "\"Das Szenario\"", "\"Sample\"", "\"SampleFeatureDasSzenarioManySamples\""), "% Many% Samples", "Das Szenario", "Sample", "SampleFeatureDasSzenarioManySamples")
    );
  }
  
  protected ExampleTable<FeatureClassNameProviderGetClassNameExampleTableSpecExamples> examples;
  
  @Test
  @Named("examples work")
  @Order(99)
  public void examplesWork() throws Exception {
    final Procedure1<FeatureClassNameProviderGetClassNameExampleTableSpecExamples> _function = new Procedure1<FeatureClassNameProviderGetClassNameExampleTableSpecExamples>() {
        public void apply(final FeatureClassNameProviderGetClassNameExampleTableSpecExamples it) {
          org.jnario.ExampleTable _examples = FeatureClassNameProviderGetClassNameExampleTableSpec.this.examples(it.name, it.scenario, it.feature);
          String _className = FeatureClassNameProviderGetClassNameExampleTableSpec.this.className(_examples);
          boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_className, it.expectedClassName);
          Assert.assertTrue("\nExpected className(examples(name, scenario, feature)) => expectedClassName but"
           + "\n     className(examples(name, scenario, feature)) is " + "\"" + _className + "\""
           + "\n     examples(name, scenario, feature) is " + _examples
           + "\n     name is " + "\"" + it.name + "\""
           + "\n     scenario is " + "\"" + it.scenario + "\""
           + "\n     feature is " + "\"" + it.feature + "\""
           + "\n     expectedClassName is " + "\"" + it.expectedClassName + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<FeatureClassNameProviderGetClassNameExampleTableSpecExamples>forEach(this.examples, _function);
  }
}
