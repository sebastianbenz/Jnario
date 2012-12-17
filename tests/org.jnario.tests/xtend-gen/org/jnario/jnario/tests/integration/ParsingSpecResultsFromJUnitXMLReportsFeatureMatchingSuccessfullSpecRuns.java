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
@Named("Scenario: Matching successfull Spec Runs")
@CreateWith(value = SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingSuccessfullSpecRuns extends ParsingSpecResultsFromJUnitXMLReportsFeature {
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
    StepArguments _stepArguments = new StepArguments("package example\ndescribe \"Adding values\"{\n\tfact \"4 + 3 is 7\"{\n\t\t4 + 3 => 7\n\t}\n}\n");
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
    StepArguments _stepArguments = new StepArguments("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<testsuite failures=\"0\" time=\"0.001\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\n  <properties>\n    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n  </properties>\n  <testcase time=\"0.001\" classname=\"example.AddingValuesSpec\" name=\"4 + 3 is 7\"/>\n</testsuite>\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    String _trim = _first.trim();
    StringInputStream _stringInputStream = new StringInputStream(_trim);
    this.resultParser.parse(_stringInputStream, this.spec2ResultMapping);
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \\\"passed\\\"")
  public void thenTheSpecExecutionPassed() {
    StepArguments _stepArguments = new StepArguments("passed");
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
