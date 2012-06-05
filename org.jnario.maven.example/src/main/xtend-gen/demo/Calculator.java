package demo;

import org.eclipse.xtext.xbase.lib.IntegerExtensions;

@SuppressWarnings("all")
public class Calculator {
  public int add(final int a, final int b) {
    return IntegerExtensions.operator_plus(a, b);
  }
}
