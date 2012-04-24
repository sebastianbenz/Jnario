package demo;

import org.junit.Test;

@SuppressWarnings("all")
public class CalculatorTest {
  @Test
  public void shouldRun() {
    Calculator _calculator = new Calculator();
    _calculator.add(1, 1);
  }
}
