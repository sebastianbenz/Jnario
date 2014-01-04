/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.linking;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.tests.unit.linking.StepArgumentsProviderSpecExamples;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("StepArgumentsProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class StepArgumentsProviderSpec {
  @Subject
  public StepArgumentsProvider subject;
  
  @Inject
  LazyLinkingResource resource;
  
  public ExampleTable<StepArgumentsProviderSpecExamples> _initStepArgumentsProviderSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("step", "expectedArgs"), 
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\'Given no values\'", "list()"), _initStepArgumentsProviderSpecExamplesCell0(), _initStepArgumentsProviderSpecExamplesCell1()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\'Given \"hello\"\'", "list(\"hello\")"), _initStepArgumentsProviderSpecExamplesCell2(), _initStepArgumentsProviderSpecExamplesCell3()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\'Given \"hello\" and \"world\"\'", "list(\"hello\", \"world\")"), _initStepArgumentsProviderSpecExamplesCell4(), _initStepArgumentsProviderSpecExamplesCell5()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\'Given \"hello\" and \"world\"\'", "list(\"hello\", \"world\")"), _initStepArgumentsProviderSpecExamplesCell6(), _initStepArgumentsProviderSpecExamplesCell7()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\'Given an escaped quote in \"\\\\\\\"hello\\\\\\\"\"\'", "list(\'\"hello\"\')"), _initStepArgumentsProviderSpecExamplesCell8(), _initStepArgumentsProviderSpecExamplesCell9()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\"Given a multiline \\n\'\'\'hello\'\'\'\"", "list(\"hello\")"), _initStepArgumentsProviderSpecExamplesCell10(), _initStepArgumentsProviderSpecExamplesCell11()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\"Given a multiline \\n\'\'\'hello \'nested\' \'\'\'\"", "list(\"hello \'nested\' \")"), _initStepArgumentsProviderSpecExamplesCell12(), _initStepArgumentsProviderSpecExamplesCell13()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\"Given a multiline \\n\\t\\t\'\'\'hello\'\'\'\"", "list(\"hello\")"), _initStepArgumentsProviderSpecExamplesCell14(), _initStepArgumentsProviderSpecExamplesCell15()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\"Given a multiline \\n 1+1 => 2 \'\'\'hello\'\'\'\"", "list()"), _initStepArgumentsProviderSpecExamplesCell16(), _initStepArgumentsProviderSpecExamplesCell17()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\"Given a multiline \\n\\t\\t\'\'\'hello\"", "list()"), _initStepArgumentsProviderSpecExamplesCell18(), _initStepArgumentsProviderSpecExamplesCell19()),
      new StepArgumentsProviderSpecExamples(  Arrays.asList("\"Given a multiline \\n\\t\\t\'\'\'\"", "list()"), _initStepArgumentsProviderSpecExamplesCell20(), _initStepArgumentsProviderSpecExamplesCell21())
    );
  }
  
  protected ExampleTable<StepArgumentsProviderSpecExamples> examples = _initStepArgumentsProviderSpecExamples();
  
  public String _initStepArgumentsProviderSpecExamplesCell0() {
    return "Given no values";
  }
  
  public List<Object> _initStepArgumentsProviderSpecExamplesCell1() {
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell2() {
    return "Given \"hello\"";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell3() {
    List<String> _list = JnarioCollectionLiterals.<String>list("hello");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell4() {
    return "Given \"hello\" and \"world\"";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell5() {
    List<String> _list = JnarioCollectionLiterals.<String>list("hello", "world");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell6() {
    return "Given \"hello\" and \"world\"";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell7() {
    List<String> _list = JnarioCollectionLiterals.<String>list("hello", "world");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell8() {
    return "Given an escaped quote in \"\\\"hello\\\"\"";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell9() {
    List<String> _list = JnarioCollectionLiterals.<String>list("\"hello\"");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell10() {
    return "Given a multiline \n\'\'\'hello\'\'\'";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell11() {
    List<String> _list = JnarioCollectionLiterals.<String>list("hello");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell12() {
    return "Given a multiline \n\'\'\'hello \'nested\' \'\'\'";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell13() {
    List<String> _list = JnarioCollectionLiterals.<String>list("hello \'nested\' ");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell14() {
    return "Given a multiline \n\t\t\'\'\'hello\'\'\'";
  }
  
  public List<String> _initStepArgumentsProviderSpecExamplesCell15() {
    List<String> _list = JnarioCollectionLiterals.<String>list("hello");
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell16() {
    return "Given a multiline \n 1+1 => 2 \'\'\'hello\'\'\'";
  }
  
  public List<Object> _initStepArgumentsProviderSpecExamplesCell17() {
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell18() {
    return "Given a multiline \n\t\t\'\'\'hello";
  }
  
  public List<Object> _initStepArgumentsProviderSpecExamplesCell19() {
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    return _list;
  }
  
  public String _initStepArgumentsProviderSpecExamplesCell20() {
    return "Given a multiline \n\t\t\'\'\'";
  }
  
  public List<Object> _initStepArgumentsProviderSpecExamplesCell21() {
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    return _list;
  }
  
  @Test
  @Named("extracts arguments from step descriptions")
  @Order(1)
  public void _extractsArgumentsFromStepDescriptions() throws Exception {
    final Procedure1<StepArgumentsProviderSpecExamples> _function = new Procedure1<StepArgumentsProviderSpecExamples>() {
      public void apply(final StepArgumentsProviderSpecExamples it) {
        String _step = it.getStep();
        Step _create = StepArgumentsProviderSpec.this.create(_step);
        final List<String> foundArgs = StepArgumentsProviderSpec.this.subject.findStepArguments(_create);
        List<? extends Object> _expectedArgs = it.getExpectedArgs();
        boolean _doubleArrow = Should.<List<? extends Object>>operator_doubleArrow(foundArgs, _expectedArgs);
        Assert.assertTrue("\nExpected foundArgs => expectedArgs but"
         + "\n     foundArgs is " + new org.hamcrest.StringDescription().appendValue(foundArgs).toString()
         + "\n     expectedArgs is " + new org.hamcrest.StringDescription().appendValue(_expectedArgs).toString() + "\n", _doubleArrow);
        
      }
    };
    Each.<StepArgumentsProviderSpecExamples>forEach(this.examples, _function);
  }
  
  @Test
  @Named("returns empty list if step has no name")
  @Order(2)
  public void _returnsEmptyListIfStepHasNoName() throws Exception {
    Given _step = Features.step(null);
    List<String> _findStepArguments = this.subject.findStepArguments(_step);
    List<String> _list = JnarioCollectionLiterals.<String>list();
    boolean _doubleArrow = Should.<List<String>>operator_doubleArrow(_findStepArguments, _list);
    Assert.assertTrue("\nExpected subject.findStepArguments(step(null)) => list() but"
     + "\n     subject.findStepArguments(step(null)) is " + new org.hamcrest.StringDescription().appendValue(_findStepArguments).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     step(null) is " + new org.hamcrest.StringDescription().appendValue(_step).toString()
     + "\n     list() is " + new org.hamcrest.StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
  
  public Step create(final String step) {
    Step _xblockexpression = null;
    {
      boolean _equals = Objects.equal(step, null);
      if (_equals) {
        return null;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: dummy");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: dummy ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(step, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      final String scenario = _builder.toString();
      IParser _parser = this.resource.getParser();
      String _string = scenario.toString();
      StringInputStream _stringInputStream = new StringInputStream(_string);
      InputStreamReader _inputStreamReader = new InputStreamReader(_stringInputStream);
      final IParseResult parseResult = _parser.parse(_inputStreamReader);
      EObject _rootASTElement = parseResult.getRootASTElement();
      TreeIterator<EObject> _eAllContents = _rootASTElement.eAllContents();
      List<EObject> _list = IteratorExtensions.<EObject>toList(_eAllContents);
      Query _query = Query.query(_list);
      Step _first = _query.<Step>first(Step.class);
      _xblockexpression = (_first);
    }
    return _xblockexpression;
  }
}
