package org.jnario.suite.unit;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteClassNameProviderGetClassNameSpecificationSpecExamples;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("getClassName[Specification]")
public class SuiteClassNameProviderGetClassNameSpecificationSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  @Before
  public void _initSuiteClassNameProviderGetClassNameSpecificationSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "expectedClassName"), 
      new SuiteClassNameProviderGetClassNameSpecificationSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new SuiteClassNameProviderGetClassNameSpecificationSpecExamples(  java.util.Arrays.asList("\"#\"", "null"), "#", null),
      new SuiteClassNameProviderGetClassNameSpecificationSpecExamples(  java.util.Arrays.asList("\"#my Suite\"", "\"MySuiteSuite\""), "#my Suite", "MySuiteSuite"),
      new SuiteClassNameProviderGetClassNameSpecificationSpecExamples(  java.util.Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"MySuiteSuite\""), "##My Suite \n with multiple lines", "MySuiteSuite")
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderGetClassNameSpecificationSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[subject.getClassName[suite[name]] => expectedClassName]")
  @Order(99)
  public void examplesForEachSubjectGetClassNameSuiteNameExpectedClassName() throws Exception {
    final Procedure1<SuiteClassNameProviderGetClassNameSpecificationSpecExamples> _function = new Procedure1<SuiteClassNameProviderGetClassNameSpecificationSpecExamples>() {
        public void apply(final SuiteClassNameProviderGetClassNameSpecificationSpecExamples it) {
          Suite _suite = SuiteClassNameProviderGetClassNameSpecificationSpec.this.suite(it.name);
          String _className = SuiteClassNameProviderGetClassNameSpecificationSpec.this.subject.getClassName(_suite);
          boolean _doubleArrow = Should.operator_doubleArrow(_className, it.expectedClassName);
          Assert.assertTrue("\nExpected subject.getClassName(suite(name)) => expectedClassName but"
           + "\n     subject.getClassName(suite(name)) is " + new StringDescription().appendValue(_className).toString()
           + "\n     subject is " + new StringDescription().appendValue(SuiteClassNameProviderGetClassNameSpecificationSpec.this.subject).toString()
           + "\n     suite(name) is " + new StringDescription().appendValue(_suite).toString()
           + "\n     name is " + new StringDescription().appendValue(it.name).toString()
           + "\n     expectedClassName is " + new StringDescription().appendValue(it.expectedClassName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<SuiteClassNameProviderGetClassNameSpecificationSpecExamples>forEach(this.examples, _function);
  }
}
