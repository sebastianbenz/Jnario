package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameSpecExamples;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("name")
public class ExampleNameSpec extends ExampleSpec {
  @Before
  public void _initExampleNameSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("example", "name"), 
      new ExampleNameSpecExamples(  java.util.Arrays.asList("\"fact \'with description\'\"", "\"with description\""), "fact \'with description\'", "with description"),
      new ExampleNameSpecExamples(  java.util.Arrays.asList("\"fact \'with code\' => \'with code\'\"", "\"\'with code\' => \'with code\'\""), "fact \'with code\' => \'with code\'", "\'with code\' => \'with code\'")
    );
  }
  
  protected ExampleTable<ExampleNameSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[example.parse.name should be name]")
  @Order(99)
  public void examplesForEachExampleParseNameShouldBeName() throws Exception {
    final Procedure1<ExampleNameSpecExamples> _function = new Procedure1<ExampleNameSpecExamples>() {
        public void apply(final ExampleNameSpecExamples it) {
          Example _parse = ExampleNameSpec.this.parse(it.example);
          String _name = _parse.getName();
          boolean _should_be = Should.should_be(_name, it.name);Assert
          .assertTrue("\nExpected example.parse.name should be name but"
           + "\n     example.parse.name is " + "\"" + _name + "\""
           + "\n     example.parse is " + _parse
           + "\n     example is " + "\"" + it.example + "\""
           + "\n     name is " + "\"" + it.name + "\"" + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<ExampleNameSpecExamples>forEach(this.examples, _function);
  }
}
