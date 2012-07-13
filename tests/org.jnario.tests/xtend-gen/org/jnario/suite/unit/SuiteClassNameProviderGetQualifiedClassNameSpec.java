package org.jnario.suite.unit;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteClassNameProviderGetQualifiedClassNameSpecExamples;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("getQualifiedClassName")
public class SuiteClassNameProviderGetQualifiedClassNameSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  @Before
  public void _initSuiteClassNameProviderGetQualifiedClassNameSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("name", "packageName", "qualifiedName"), 
      new SuiteClassNameProviderGetQualifiedClassNameSpecExamples(  java.util.Arrays.asList("null", "null", "null"), null, null, null),
      new SuiteClassNameProviderGetQualifiedClassNameSpecExamples(  java.util.Arrays.asList("\"#\"", "\"test\"", "null"), "#", "test", null),
      new SuiteClassNameProviderGetQualifiedClassNameSpecExamples(  java.util.Arrays.asList("\"#my Suite\"", "null", "\"MySuiteSuite\""), "#my Suite", null, "MySuiteSuite"),
      new SuiteClassNameProviderGetQualifiedClassNameSpecExamples(  java.util.Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"test\"", "\"test.MySuiteSuite\""), "##My Suite \n with multiple lines", "test", "test.MySuiteSuite")
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderGetQualifiedClassNameSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[ val actualName = subject.getQualifiedClassName[suite[name, packageName]] actualName => qualifiedName ]")
  @Order(99)
  public void examplesForEachValActualNameSubjectGetQualifiedClassNameSuiteNamePackageNameActualNameQualifiedName() throws Exception {
    final Procedure1<SuiteClassNameProviderGetQualifiedClassNameSpecExamples> _function = new Procedure1<SuiteClassNameProviderGetQualifiedClassNameSpecExamples>() {
        public void apply(final SuiteClassNameProviderGetQualifiedClassNameSpecExamples it) {
          Suite _suite = Suites.suite(it.name, it.packageName);
          final String actualName = SuiteClassNameProviderGetQualifiedClassNameSpec.this.subject.getQualifiedClassName(_suite);
          boolean _doubleArrow = Should.operator_doubleArrow(actualName, it.qualifiedName);
          Assert.assertTrue("\nExpected actualName => qualifiedName but"
           + "\n     actualName is " + new StringDescription().appendValue(actualName).toString()
           + "\n     qualifiedName is " + new StringDescription().appendValue(it.qualifiedName).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<SuiteClassNameProviderGetQualifiedClassNameSpecExamples>forEach(this.examples, _function);
  }
}
