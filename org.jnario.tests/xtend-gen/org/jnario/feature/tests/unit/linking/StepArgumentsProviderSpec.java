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
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.tests.unit.linking.StepArgumentsProviderSpecExamples;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("StepArgumentsProvider")
@CreateWith(value = FeatureTestCreator.class)
public class StepArgumentsProviderSpec {
  @Subject
  public StepArgumentsProvider subject;
  
  @Inject
  LazyLinkingResource resource;
  
  @Before
  public void _initStepArgumentsProviderSpecExamples() {
    
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("hello");
    List<String> _list_2 = JnarioCollectionLiterals.<String>list("hello", "world");
    List<String> _list_3 = JnarioCollectionLiterals.<String>list("hello", "world");
    List<String> _list_4 = JnarioCollectionLiterals.<String>list("hello");
    List<Object> _list_5 = JnarioCollectionLiterals.<Object>list();examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("step", "expectedArgs"), 
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given no values\'", "list()"), "Given no values", _list),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given \"hello\"\'", "list(\"hello\")"), "Given \"hello\"", _list_1),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given \"hello\" and \"world\"\'", "list(\"hello\", \"world\")"), "Given \"hello\" and \"world\"", _list_2),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\'Given \"hello\" and \"world\"\'", "list(\"hello\", \"world\")"), "Given \"hello\" and \"world\"", _list_3),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n\'\'\'hello\'\'\'\"", "list(\"hello\")"), "Given a multiline \n\'\'\'hello\'\'\'", _list_4),
      new StepArgumentsProviderSpecExamples(  java.util.Arrays.asList("\"Given a multiline \\n 1+1 => 2 \'\'\'hello\'\'\'\"", "list()"), "Given a multiline \n 1+1 => 2 \'\'\'hello\'\'\'", _list_5)
    );
  }
  
  protected ExampleTable<StepArgumentsProviderSpecExamples> examples;
  
  @Test
  @Named("extracts arguments from step descriptions")
  @Order(99)
  public void extractsArgumentsFromStepDescriptions() throws Exception {
    final Procedure1<StepArgumentsProviderSpecExamples> _function = new Procedure1<StepArgumentsProviderSpecExamples>() {
        public void apply(final StepArgumentsProviderSpecExamples it) {
          String _replaceAll = it.step==null?(String)null:it.step.replaceAll("\"", "\'");
          final List<String> singleOrDoubleQuotes = JnarioCollectionLiterals.<String>list(it.step, _replaceAll);
          for (final String each : singleOrDoubleQuotes) {
            Step _create = StepArgumentsProviderSpec.this.create(each);
            List<String> _findStepArguments = StepArgumentsProviderSpec.this.subject.findStepArguments(_create);
            boolean _doubleArrow = Should.operator_doubleArrow(_findStepArguments, it.expectedArgs);
            Assert.assertTrue("\nExpected subject.findStepArguments(create(each)) => expectedArgs but"
             + "\n     subject.findStepArguments(create(each)) is " + _findStepArguments
             + "\n     subject is " + StepArgumentsProviderSpec.this.subject
             + "\n     create(each) is " + _create
             + "\n     each is " + "\"" + each + "\""
             + "\n     expectedArgs is " + it.expectedArgs + "\n", _doubleArrow);
            
          }
        }
      };
    ExampleTableIterators.<StepArgumentsProviderSpecExamples>forEach(this.examples, _function);
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
      _builder.append("1 + 1 => 1");
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
