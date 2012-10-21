package calculator;

@SuppressWarnings("all")
public class Calculator {
  public int add(final String a, final String b) {
    Integer _valueOf = Integer.valueOf(a);
    Integer _valueOf_1 = Integer.valueOf(b);
    int _add = this.add((_valueOf).intValue(), (_valueOf_1).intValue());
    return _add;
  }
  
  public int add(final int a, final int b) {
    return (a + b);
  }
  
  public int divide(final int a, final int b) {
    return (a / b);
  }
  
  public int substract(final int a, final int b) {
    return (a - b);
  }
  
  public String toString() {
    return "Calculator";
  }
}
