package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.tests.unit.jnario.StringsMakeJunitConformStringBuilderSpecExamples;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("makeJunitConform[StringBuilder]")
public class StringsMakeJunitConformStringBuilderSpec extends StringsSpec {
  @Before
  public void _initStringsMakeJunitConformStringBuilderSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("string", "result"), 
      new StringsMakeJunitConformStringBuilderSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new StringsMakeJunitConformStringBuilderSpecExamples(  java.util.Arrays.asList("\"hello\"", "\"hello\""), "hello", "hello"),
      new StringsMakeJunitConformStringBuilderSpecExamples(  java.util.Arrays.asList("\"hello \"", "\"hello\""), "hello ", "hello"),
      new StringsMakeJunitConformStringBuilderSpecExamples(  java.util.Arrays.asList("\"hello\\n\\tworld\"", "\"hello world\""), "hello\n\tworld", "hello world"),
      new StringsMakeJunitConformStringBuilderSpecExamples(  java.util.Arrays.asList("\"hello(param)\"", "\"hello[param]\""), "hello(param)", "hello[param]"),
      new StringsMakeJunitConformStringBuilderSpecExamples(  java.util.Arrays.asList("\"hello #world#\"", "\"hello -world-\""), "hello #world#", "hello -world-")
    );
  }
  
  protected ExampleTable<StringsMakeJunitConformStringBuilderSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[string.makeJunitConform => result]")
  @Order(99)
  public void examplesForEachStringMakeJunitConformResult() throws Exception {
    final Procedure1<StringsMakeJunitConformStringBuilderSpecExamples> _function = new Procedure1<StringsMakeJunitConformStringBuilderSpecExamples>() {
        public void apply(final StringsMakeJunitConformStringBuilderSpecExamples it) {
          String _makeJunitConform = Strings.makeJunitConform(it.string);
          boolean _doubleArrow = Should.operator_doubleArrow(_makeJunitConform, it.result);
          Assert.assertTrue("\nExpected string.makeJunitConform => result but"
           + "\n     string.makeJunitConform is " + "\"" + _makeJunitConform + "\""
           + "\n     string is " + "\"" + it.string + "\""
           + "\n     result is " + "\"" + it.result + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StringsMakeJunitConformStringBuilderSpecExamples>forEach(this.examples, _function);
  }
}
