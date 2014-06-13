package calculator;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimpleCalculator {
  private final ArrayList<Integer> values = CollectionLiterals.<Integer>newArrayList();
  
  private int result = 0;
  
  public boolean enter(final String string) {
    Integer _valueOf = Integer.valueOf(string);
    return this.values.add(_valueOf);
  }
  
  public int add() {
    final Function2<Integer, Integer, Integer> _function = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer a, final Integer b) {
        return Integer.valueOf(((a).intValue() + (b).intValue()));
      }
    };
    Integer _fold = IterableExtensions.<Integer, Integer>fold(this.values, Integer.valueOf(0), _function);
    return this.result = (_fold).intValue();
  }
  
  public String result() {
    return Integer.valueOf(this.result).toString();
  }
  
  public String toString() {
    return "Calculator";
  }
}
