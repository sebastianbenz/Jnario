package org.jnario.jnario.tests.integration;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.StringInputStream;
import org.hamcrest.StringDescription;
import org.jnario.Specification;
import org.jnario.doc.ParseResultAcceptor;
import org.jnario.doc.SpecExecution;
import org.jnario.doc.SpecResultParser;
import org.jnario.doc.SpecResultProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching successfull Spec Runs")
@Ignore
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
    Iterator<Specification> _filter = Iterators.<Specification>filter(_allContents, Specification.class);
    Specification _first_1 = JnarioIteratorExtensions.<Specification>first(_filter);
    this.specification = _first_1;
  }
  
  @Test
  @Order(1)
  @Named("And a test result xml file")
  public void andATestResultXmlFile() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\t<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n\t\t\t<testsuite failures=\"0\" time=\"0.001\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\n\t\t\t  <properties>\n\t\t\t    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n\t\t\t  </properties>\n\t\t\t  <testcase time=\"0.001\" classname=\"example.AddingValuesSpec\" name=\"4 + 3 is 7\"/>\n\t\t\t</testsuite>\n\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    StringInputStream _stringInputStream = new StringInputStream(_first);
    this.resultParser.parse(_stringInputStream, this.acceptor);
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \"passed\"")
  public void thenTheSpecExecutionPassed() {
    StepArguments _stepArguments = new StepArguments("passed");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    final boolean shouldPass = Objects.equal(_first, "passed");
    List<SpecExecution> _results = this.acceptor.results();
    SpecExecution _result = this.resultProvider.getResult(this.specification, _results);
    boolean _hasPassed = _result.hasPassed();
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasPassed), Boolean.valueOf(shouldPass));
    Assert.assertTrue("\nExpected resultProvider.getResult(specification, acceptor.results).hasPassed => shouldPass but"
     + "\n     resultProvider.getResult(specification, acceptor.results).hasPassed is " + new StringDescription().appendValue(Boolean.valueOf(_hasPassed)).toString()
     + "\n     resultProvider.getResult(specification, acceptor.results) is " + new StringDescription().appendValue(_result).toString()
     + "\n     resultProvider is " + new StringDescription().appendValue(this.resultProvider).toString()
     + "\n     specification is " + new StringDescription().appendValue(this.specification).toString()
     + "\n     acceptor.results is " + new StringDescription().appendValue(_results).toString()
     + "\n     acceptor is " + new StringDescription().appendValue(this.acceptor).toString()
     + "\n     shouldPass is " + new StringDescription().appendValue(Boolean.valueOf(shouldPass)).toString() + "\n", _doubleArrow);
    
  }
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  SpecResultProvider resultProvider;
  
  @Inject
  SpecResultParser resultParser;
  
  @Inject
  ParseResultAcceptor acceptor;
  
  Specification specification;
}
