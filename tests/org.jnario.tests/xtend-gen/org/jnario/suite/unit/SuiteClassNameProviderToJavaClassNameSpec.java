package org.jnario.suite.unit;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToJavaClassNameSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toJavaClassName")
@RunWith(ExampleGroupRunner.class)
public class SuiteClassNameProviderToJavaClassNameSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  public ExampleTable<SuiteClassNameProviderToJavaClassNameSpecExamples> _initSuiteClassNameProviderToJavaClassNameSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "expectedClassName"), 
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  java.util.Arrays.asList("\"#\"", "null"), "#", null),
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  java.util.Arrays.asList("\"#my Suite\"", "\"MySuiteSuite\""), "#my Suite", "MySuiteSuite"),
      new SuiteClassNameProviderToJavaClassNameSpecExamples(  java.util.Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"MySuiteSuite\""), "##My Suite \n with multiple lines", "MySuiteSuite")
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderToJavaClassNameSpecExamples> examples = _initSuiteClassNameProviderToJavaClassNameSpecExamples();
  
  @Test
  @Named("examples.forEach[subject.toJavaClassName[suite[name]] => expectedClassName]")
  @Order(1)
  public void _examplesForEachSubjectToJavaClassNameSuiteNameExpectedClassName() throws Exception {
    final Procedure1<SuiteClassNameProviderToJavaClassNameSpecExamples> _function = new Procedure1<SuiteClassNameProviderToJavaClassNameSpecExamples>() {
        public void apply(final SuiteClassNameProviderToJavaClassNameSpecExamples it) {
          Suite _suite = Suites.suite(it.name);
          String _javaClassName = SuiteClassNameProviderToJavaClassNameSpec.this.subject.toJavaClassName(_suite);
          boolean _doubleArrow = Should.operator_doubleArrow(_javaClassName, it.expectedClassName);
          Assert.assertTrue("\nExpected subject.toJavaClassName(suite(name)) => expectedClassName but"
           + "\n     subject.toJavaClassName(suite(name)) is " + new StringDescription().appendValue(_javaClassName).toString()
           + "\n     subject is " + new StringDescription().appendValue(SuiteClassNameProviderToJavaClassNameSpec.this.subject).toString()
           + "\n     suite(name) is " + new StringDescription().appendValue(_suite).toString()
           + "\n     name is " + new StringDescription().appendValue(it.name).toString()
           + "\n     expectedClassName is " + new StringDescription().appendValue(it.expectedClassName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<SuiteClassNameProviderToJavaClassNameSpecExamples>forEach(this.examples, _function);
  }
}
