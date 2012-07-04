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
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpecificationSpecExamples;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("describe[Specification]")
public class SuiteClassNameProviderDescribeSpecificationSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  @Before
  public void _initSuiteClassNameProviderDescribeSpecificationSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "expectedClassName"), 
      new SuiteClassNameProviderDescribeSpecificationSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new SuiteClassNameProviderDescribeSpecificationSpecExamples(  java.util.Arrays.asList("\"#\"", "null"), "#", null),
      new SuiteClassNameProviderDescribeSpecificationSpecExamples(  java.util.Arrays.asList("\"#my Suite\"", "\"my Suite\""), "#my Suite", "my Suite"),
      new SuiteClassNameProviderDescribeSpecificationSpecExamples(  java.util.Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"My Suite\""), "##My Suite \n with multiple lines", "My Suite")
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderDescribeSpecificationSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[subject.^describe[suite[name]] => expectedClassName]")
  @Order(99)
  public void examplesForEachSubjectDescribeSuiteNameExpectedClassName() throws Exception {
    final Procedure1<SuiteClassNameProviderDescribeSpecificationSpecExamples> _function = new Procedure1<SuiteClassNameProviderDescribeSpecificationSpecExamples>() {
        public void apply(final SuiteClassNameProviderDescribeSpecificationSpecExamples it) {
          Suite _suite = SuiteClassNameProviderDescribeSpecificationSpec.this.suite(it.name);
          String _describe = SuiteClassNameProviderDescribeSpecificationSpec.this.subject.describe(_suite);
          boolean _doubleArrow = Should.operator_doubleArrow(_describe, it.expectedClassName);
          Assert.assertTrue("\nExpected subject.^describe(suite(name)) => expectedClassName but"
           + "\n     subject.^describe(suite(name)) is " + new StringDescription().appendValue(_describe).toString()
           + "\n     subject is " + new StringDescription().appendValue(SuiteClassNameProviderDescribeSpecificationSpec.this.subject).toString()
           + "\n     suite(name) is " + new StringDescription().appendValue(_suite).toString()
           + "\n     name is " + new StringDescription().appendValue(it.name).toString()
           + "\n     expectedClassName is " + new StringDescription().appendValue(it.expectedClassName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<SuiteClassNameProviderDescribeSpecificationSpecExamples>forEach(this.examples, _function);
  }
}
