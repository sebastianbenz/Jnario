package org.jnario.jnario.tests.integration;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.StringInputStream;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.report.Failed;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.CreateWith;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching failed Spec runs")
@CreateWith(value = SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns extends ParsingSpecResultsFromJUnitXMLReportsFeature {
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  HashBasedSpec2ResultMapping spec2ResultMapping;
  
  @Inject
  SpecResultParser resultParser;
  
  Executable specification;
  
  @Test
  @Order(0)
  @Named("Given a specification")
  public void givenASpecification() {
    StepArguments _stepArguments = new StepArguments("package example\n\ndescribe \"Adding values\"{\n\tfact \"4 + 3 is 8\"{\n\t\t4 + 3 => 8\n\t}\n}\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    Resource _parseSpec = this._modelStore.parseSpec(_first);
    TreeIterator<EObject> _allContents = _parseSpec.getAllContents();
    Iterator<ExampleGroup> _filter = Iterators.<ExampleGroup>filter(_allContents, ExampleGroup.class);
    ExampleGroup _first_1 = JnarioIteratorExtensions.<ExampleGroup>first(_filter);
    this.specification = _first_1;
  }
  
  @Test
  @Order(1)
  @Named("And a test result xml file")
  public void andATestResultXmlFile() {
    StepArguments _stepArguments = new StepArguments("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\n  <properties>\n    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n  </properties>\n  <testcase time=\"0.017\" classname=\"example.AddingValuesSpec\" name=\"4 + 3 is 8\">\n    <failure message=\"\nExpected 4 + 3 =&gt; 8 but\n     4 + 3 is &lt;7&gt;\n\" type=\"java.lang.AssertionError\">java.lang.AssertionError: \nExpected 4 + 3 =&gt; 8 but\n     4 + 3 is &lt;7&gt;\n\tat org.junit.Assert.fail(Assert.java:93)\n\tat org.junit.Assert.assertTrue(Assert.java:43)\n\tat example.AddingValuesSpec.__43Is8(AddingValuesSpec.java:22)\n</failure>\n  </testcase>\n</testsuite>\t\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    String _trim = _first.trim();
    StringInputStream _stringInputStream = new StringInputStream(_trim);
    this.resultParser.parse(_stringInputStream, this.spec2ResultMapping);
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \\\"failed\\\"")
  public void thenTheSpecExecutionFailed() {
    StepArguments _stepArguments = new StepArguments("failed");
    final StepArguments args = _stepArguments;
    final SpecExecution result = this.spec2ResultMapping.getResult(this.specification);
    String _first = JnarioIterableExtensions.<String>first(args);
    boolean _equals = Objects.equal(_first, "passed");
    if (_equals) {
      boolean _doubleArrow = Should.operator_doubleArrow(result, Passed.class);
      Assert.assertTrue("\nExpected result => typeof(Passed) but"
       + "\n     result is " + new StringDescription().appendValue(result).toString() + "\n", _doubleArrow);
      
    } else {
      boolean _doubleArrow_1 = Should.operator_doubleArrow(result, Failed.class);
      Assert.assertTrue("\nExpected result => typeof(Failed) but"
       + "\n     result is " + new StringDescription().appendValue(result).toString() + "\n", _doubleArrow_1);
      
    }
  }
}
