package calculator;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimpleCalculator {
  private final ArrayList<Integer> values = new Function0<ArrayList<Integer>>() {
    public ArrayList<Integer> apply() {
      ArrayList<Integer> _newArrayList = CollectionLiterals.<Integer>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  private int result = 0;
  
  public boolean enter(final String string) {
    Integer _valueOf = Integer.valueOf(string);
    boolean _add = this.values.add(_valueOf);
    return _add;
  }
  
  public int add() {
    final Function2<Integer,Integer,Integer> _function = new Function2<Integer,Integer,Integer>() {
        public Integer apply(final Integer a, final Integer b) {
          int _plus = ((a).intValue() + (b).intValue());
          return Integer.valueOf(_plus);
        }
      };
    Integer _fold = IterableExtensions.<Integer, Integer>fold(this.values, Integer.valueOf(0), _function);
    int _result = this.result = (_fold).intValue();
    return _result;
  }
  
  public String result() {
    String _string = Integer.valueOf(this.result).toString();
    return _string;
  }
  
  public String toString() {
    return "Calculator";
  }
}
