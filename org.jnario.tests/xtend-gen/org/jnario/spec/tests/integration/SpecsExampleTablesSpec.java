package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.SpecsExampleTablesSpecExample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Example tables are a great way to structure input and expected output data.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Specs - Example Tables")
public class SpecsExampleTablesSpec {
  /**
   * Examples are stored within a table. Assertions for the table's values are
   * best implemented by iterating over each table row using `forEach`.
   * Inside the procedure that is passed to `forEach`, each value in a row can be
   * directly accessed by it's column's name making use of
   * Xtend's [implicit 'it'](http://www.eclipse.org/xtend/documentation/index.html#closures).
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("accessing values")
  @Order(99)
  public void accessingValues() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def myExamples{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("|    input      |  result       |  ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| \"Hello World\" | \"HELLO WORLD\" | ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| \"Hallo Welt\"  | \"HALLO WELT\"  |");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"can be accessed via the table name\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("myExamples.forEach[   ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("input.toUpperCase should be result");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("] ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * Naming an example table is optional. If no name is provided, the default name 'examples' will be used.
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Naming examples")
  @Order(99)
  public void namingExamples() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| a | b | ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| 0 | 1 |");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"name is optional\"{    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("examples should not be null");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}     ");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * Values in an example table can be arbitrary non-void expressions, for examples closures:
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("expressions in tables")
  @Order(99)
  public void expressionsInTables() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def myExampleWithClosures{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| input |       operation            | result |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("|   \"a\" | [String s | s.toUpperCase] |   \"A\"  |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("|   \"B\" | [String s | s.toLowerCase] |   \"b\"  | ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"supports closures as values\"{   ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("myExampleWithClosures.forEach[");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("operation.apply(input) should be result");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}       ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * It is also possible to call methods or reference fields from within a table.
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("referencing members")
  @Order(99)
  public void referencingMembers() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String field = \"Hello\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def method(){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"World\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def myExampleWithMemberCalls{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| input    | result  |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| field    | \"Hello\" |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| method() | \"World\" | ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}       ");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"supports closures as values\"{   ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("myExampleWithMemberCalls.forEach[");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("input should be result");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("] ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}   ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * Jnario automatically infers the type of a column. It will use the
   * common supertype of all expressions in a column.
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Specifying column types")
  @Order(99)
  public void specifyingColumnTypes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def examplesWithType{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("|          list            |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| new ArrayList<String>()  |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| new LinkedList<String>() |");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}     ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"computes the common super type\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("examplesWithType.forEach[");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("assert list.empty // works only if the type of list has been inferred as List<String>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  @Before
  public void _initSpecsExampleTablesSpecExample() {
    example = ExampleTable.create("example", 
      java.util.Arrays.asList("value1", "value2", "sum"), 
      new SpecsExampleTablesSpecExample(  java.util.Arrays.asList("1", "2", "3"), 1, 2, 3),
      new SpecsExampleTablesSpecExample(  java.util.Arrays.asList("4", "5", "7"), 4, 5, 7),
      new SpecsExampleTablesSpecExample(  java.util.Arrays.asList("7", "8", "14"), 7, 8, 14)
    );
  }
  
  protected ExampleTable<SpecsExampleTablesSpecExample> example;
  
  /**
   * `ExampleTable#forEach` executes the passed in procedure for all table rows.
   * It will generate an error message for all procedures that have failed with the reason why they failed.
   */
  @Ignore
  @Test
  @Named("Error message")
  @Order(99)
  public void errorMessage() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          final Procedure1<SpecsExampleTablesSpecExample> _function = new Procedure1<SpecsExampleTablesSpecExample>() {
              public void apply(final SpecsExampleTablesSpecExample it) {
                int _plus = IntegerExtensions.operator_plus(
                  it.value1, it.value2);
                boolean _doubleArrow = ObjectExtensions.<Integer>operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(it.sum));
                Assert.assertTrue("\nExpected value1 + value2 => sum but"
                 + "\n     value1 + value2 is " + Integer.valueOf(_plus)
                 + "\n     value1 is " + it.value1
                 + "\n     value2 is " + it.value2
                 + "\n     sum is " + Integer.valueOf(it.sum) + "\n", _doubleArrow);
                
              }
            };
          ExampleTableIterators.<SpecsExampleTablesSpecExample>forEach(SpecsExampleTablesSpec.this.example, _function);
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("example failed");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("| value1     | value2     | sum     |");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("| 1          | 2          | 3       | ?");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("| 4          | 5          | 7       | ?     (1)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("| 7          | 8          | 14      | ?     (2)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("(1) Expected value1 + value2 => sum but");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("value1 + value2 is 9");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("value1 is 4");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("value2 is 5");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("sum is 7");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("(2) Expected value1 + value2 => sum but");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("value1 + value2 is 15");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("value1 is 7");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("value2 is 8");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("sum is 14");
    Helpers.is(_errorMessage, _builder);
  }
}
