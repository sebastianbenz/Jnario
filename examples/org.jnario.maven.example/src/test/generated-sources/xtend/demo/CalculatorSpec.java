package demo;

import demo.Calculator;
import demo.CalculatorSpecExamples;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
public class CalculatorSpec {
  @Test
  @Named("should add two values")
  @Order(99)
  public void _shouldAddTwoValues() throws Exception {
    Calculator _calculator = new Calculator();
    int _add = _calculator.add(1, 2);
    boolean _should_be = Should.should_be(Integer.valueOf(_add), Integer.valueOf(3));
    Assert.assertTrue("\nExpected new Calculator().add(1, 2) should be 3 but"
     + "\n     new Calculator().add(1, 2) is " + new StringDescription().appendValue(Integer.valueOf(_add)).toString()
     + "\n     new Calculator() is " + new StringDescription().appendValue(_calculator).toString() + "\n", _should_be);
    
  }
  
  @Before
  public void _initCalculatorSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("a", "b", "sum"), 
      new CalculatorSpecExamples(  java.util.Arrays.asList("1", "2", "4"), 1, 2, 4),
      new CalculatorSpecExamples(  java.util.Arrays.asList("1", "3", "4"), 1, 3, 4)
    );
  }
  
  protected ExampleTable<CalculatorSpecExamples> examples;
  
  @Test
  @Named("should handle tables")
  @Order(99)
  public void _shouldHandleTables() throws Exception {
    final Procedure1<CalculatorSpecExamples> _function = new Procedure1<CalculatorSpecExamples>() {
        public void apply(final CalculatorSpecExamples it) {
          int _plus = (it.a + it.b);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(it.sum));
          Assert.assertTrue("\nExpected a + b => sum but"
           + "\n     a + b is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString()
           + "\n     a is " + new StringDescription().appendValue(it.a).toString()
           + "\n     b is " + new StringDescription().appendValue(it.b).toString()
           + "\n     sum is " + new StringDescription().appendValue(Integer.valueOf(it.sum)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<CalculatorSpecExamples>forEach(this.examples, _function);
  }
}
