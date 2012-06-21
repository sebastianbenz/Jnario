package demo;

import demo.Database;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Example2 {
  private final Database db;
  
  public Example2(final Database db) {
    this.db = db;
  }
  
  public List<Integer> test() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("red", "green");
    final Function1<String,Integer> _function = new Function1<String,Integer>() {
        public Integer apply(final String it) {
          int _length = it.length();
          return Integer.valueOf(_length);
        }
      };
    List<Integer> _map = ListExtensions.<String, Integer>map(_newArrayList, _function);
    List<Integer> _reverseView = ListExtensions.<Integer>reverseView(_map);
    return _reverseView;
  }
}
