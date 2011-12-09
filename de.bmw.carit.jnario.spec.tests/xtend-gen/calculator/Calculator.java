package calculator;

import org.eclipse.xtext.xbase.lib.IntegerExtensions;

@SuppressWarnings("all")
public class Calculator {
  public int add(final int a, final int b) {
    int _operator_plus = IntegerExtensions.operator_plus(a, b);
    return _operator_plus;
  }
}
