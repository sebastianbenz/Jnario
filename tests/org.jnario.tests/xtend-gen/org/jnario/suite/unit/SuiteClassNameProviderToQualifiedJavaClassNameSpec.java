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
import org.jnario.suite.unit.SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toQualifiedJavaClassName")
@RunWith(ExampleGroupRunner.class)
public class SuiteClassNameProviderToQualifiedJavaClassNameSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  public ExampleTable<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples> _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "packageName", "qualifiedName"), 
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  java.util.Arrays.asList("null", "null", "null"), null, null, null),
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  java.util.Arrays.asList("\"#\"", "\"test\"", "null"), "#", "test", null),
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  java.util.Arrays.asList("\"#my Suite\"", "null", "\"MySuiteSuite\""), "#my Suite", null, "MySuiteSuite"),
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  java.util.Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"test\"", "\"test.MySuiteSuite\""), "##My Suite \n with multiple lines", "test", "test.MySuiteSuite")
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples> examples = _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamples();
  
  @Test
  @Named("examples.forEach[ val actualName = subject.toQualifiedJavaClassName[suite[name, packageName]] actualName => qualifiedName ]")
  @Order(3)
  public void _examplesForEachValActualNameSubjectToQualifiedJavaClassNameSuiteNamePackageNameActualNameQualifiedName() throws Exception {
    final Procedure1<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples> _function = new Procedure1<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples>() {
        public void apply(final SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples it) {
          Suite _suite = Suites.suite(it.name, it.packageName);
          final String actualName = SuiteClassNameProviderToQualifiedJavaClassNameSpec.this.subject.toQualifiedJavaClassName(_suite);
          boolean _doubleArrow = Should.operator_doubleArrow(actualName, it.qualifiedName);
          Assert.assertTrue("\nExpected actualName => qualifiedName but"
           + "\n     actualName is " + new StringDescription().appendValue(actualName).toString()
           + "\n     qualifiedName is " + new StringDescription().appendValue(it.qualifiedName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples>forEach(this.examples, _function);
  }
}
