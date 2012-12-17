package org.jnario.feature.tests.unit.linking;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.InputStreamReader;
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
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.tests.unit.linking.StepArgumentsProviderSpecExamples;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("StepArgumentsProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class StepArgumentsProviderSpec {
  @Subject
  public StepArgumentsProvider subject;
  
  @Inject
  LazyLinkingResource resource;
  
  public ExampleTable<StepArgumentsProviderSpecExamples> _initStepArgumentsProviderSpecExamples() {
    
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("hello");
    List<String> _list_2 = JnarioCollectionLiterals.<String>list("hello", "world");
    List<String> _list_3 = JnarioCollectionLiterals.<String>list("hello", "world");
    List<String> _list_4 = JnarioCollectionLiterals.<String>list("\"hello\"");
    List<String> _list_5 = JnarioCollectionLiterals.<String>list("hello");
    List<String> _list_6 = JnarioCollectionLiterals.<String>list("hello \'nested\' ");
    List<String> _list_7 = JnarioCollectionLiterals.<String>list("hello");
    List<Object> _list_8 = JnarioCollectionLiterals.<Object>list();
    List<Object> _list_9 = JnarioCollectionLiterals.<Object>list();
    List<Object> _list_10 = JnarioCollectionLiterals.<Object>list();return ExampleTable.create("examples", 
      java.util.Arrays.asList("step", "expectedArgs"), 
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given no values\'", "list()"), "Given no values", _list),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given \"hello\"\'", "list(\"hello\")"), "Given \"hello\"", _list_1),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given \"hello\" and \"world\"\'", "list(\"hello\", \"world\")"), "Given \"hello\" and \"world\"", _list_2),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given \"hello\" and \"world\"\'", "list(\"hello\", \"world\")"), "Given \"hello\" and \"world\"", _list_3),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given an escaped quote in \"\\\\\\\"hello\\\\\\\"\"\'", "list(\'\"hello\"\')"), "Given an escaped quote in \"\\\"hello\\\"\"", _list_4),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n\'\'\'hello\'\'\'\"", "list(\"hello\")"), "Given a multiline \n\'\'\'hello\'\'\'", _list_5),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n\'\'\'hello \'nested\' \'\'\'\"", "list(\"hello \'nested\' \")"), "Given a multiline \n\'\'\'hello \'nested\' \'\'\'", _list_6),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n\\t\\t\'\'\'hello\'\'\'\"", "list(\"hello\")"), "Given a multiline \n\t\t\'\'\'hello\'\'\'", _list_7),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n 1+1 => 2 \'\'\'hello\'\'\'\"", "list()"), "Given a multiline \n 1+1 => 2 \'\'\'hello\'\'\'", _list_8),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n\\t\\t\'\'\'hello\"", "list()"), "Given a multiline \n\t\t\'\'\'hello", _list_9),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n\\t\\t\'\'\'\"", "list()"), "Given a multiline \n\t\t\'\'\'", _list_10)
    );
  }
  
  protected ExampleTable<StepArgumentsProviderSpecExamples> examples = _initStepArgumentsProviderSpecExamples();
  
  @Test
  @Named("extracts arguments from step descriptions")
  @Order(1)
  public void _extractsArgumentsFromStepDescriptions() throws Exception {
    final Procedure1<StepArgumentsProviderSpecExamples> _function = new Procedure1<StepArgumentsProviderSpecExamples>() {
        public void apply(final StepArgumentsProviderSpecExamples it) {
          Step _create = StepArgumentsProviderSpec.this.create(it.step);
          final List<String> foundArgs = StepArgumentsProviderSpec.this.subject.findStepArguments(_create);
          boolean _doubleArrow = Should.operator_doubleArrow(foundArgs, it.expectedArgs);
          Assert.assertTrue("\nExpected foundArgs => expectedArgs but"
           + "\n     foundArgs is " + new StringDescription().appendValue(foundArgs).toString()
           + "\n     expectedArgs is " + new StringDescription().appendValue(it.expectedArgs).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StepArgumentsProviderSpecExamples>forEach(this.examples, _function);
  }
  
  @Test
  @Named("returns empty list if step has no name")
  @Order(2)
  public void _returnsEmptyListIfStepHasNoName() throws Exception {
    Given _step = Features.step(null);
    List<String> _findStepArguments = this.subject.findStepArguments(_step);
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    boolean _doubleArrow = Should.operator_doubleArrow(_findStepArguments, _list);
    Assert.assertTrue("\nExpected subject.findStepArguments(step(null)) => list() but"
     + "\n     subject.findStepArguments(step(null)) is " + new StringDescription().appendValue(_findStepArguments).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     step(null) is " + new StringDescription().appendValue(_step).toString()
     + "\n     list() is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
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
      _builder.append(step, "		");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      final CharSequence scenario = _builder;
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
