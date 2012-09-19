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
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.report.Spec2ResultMapping;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.CreateWith;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching successfull Spec Runs")
@CreateWith(value = SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingSuccessfullSpecRuns {
  @Test
  @Order(0)
  @Named("Given a specification")
  public void givenASpecification() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\tpackage example\n\t\t\tdescribe \"Adding values\"{\n\t\t\t\tfact \"4 + 3 is 7\"{\n\t\t\t\t\t4 + 3 => 7\n\t\t\t\t}\n\t\t\t}\n\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    Resource _parseSpec = this._modelStore.parseSpec(_first);
    TreeIterator<EObject> _allContents = _parseSpec.getAllContents();
    Iterator<Example> _filter = Iterators.<Example>filter(_allContents, Example.class);
    Example _first_1 = JnarioIteratorExtensions.<Example>first(_filter);
    this.specification = _first_1;
  }
  
  @Test
  @Order(1)
  @Named("And a test result xml file")
  public void andATestResultXmlFile() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\t<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n\t\t\t<testsuite failures=\"0\" time=\"0.001\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\n\t\t\t  <properties>\n\t\t\t    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n\t\t\t  </properties>\n\t\t\t  <testcase time=\"0.001\" classname=\"example.AddingValuesSpec\" name=\"4 + 3 is 7\"/>\n\t\t\t</testsuite>\n\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    String _trim = _first.trim();
    StringInputStream _stringInputStream = new StringInputStream(_trim);
    this.resultParser.parse(_stringInputStream, this.spec2ResultMapping);
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \"passed\"")
  public void thenTheSpecExecutionPassed() {
    StepArguments _stepArguments = new StepArguments("passed");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    final boolean shouldPass = Objects.equal(_first, "passed");
    SpecExecution _result = this.spec2ResultMapping.getResult(this.specification);
    boolean _hasPassed = _result.hasPassed();
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasPassed), Boolean.valueOf(shouldPass));
    Assert.assertTrue("\nExpected spec2ResultMapping.getResult(specification).hasPassed => shouldPass but"
     + "\n     spec2ResultMapping.getResult(specification).hasPassed is " + new StringDescription().appendValue(Boolean.valueOf(_hasPassed)).toString()
     + "\n     spec2ResultMapping.getResult(specification) is " + new StringDescription().appendValue(_result).toString()
     + "\n     spec2ResultMapping is " + new StringDescription().appendValue(this.spec2ResultMapping).toString()
     + "\n     specification is " + new StringDescription().appendValue(this.specification).toString()
     + "\n     shouldPass is " + new StringDescription().appendValue(Boolean.valueOf(shouldPass)).toString() + "\n", _doubleArrow);
    
  }
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  Spec2ResultMapping spec2ResultMapping;
  
  @Inject
  SpecResultParser resultParser;
  
  Executable specification;
}
