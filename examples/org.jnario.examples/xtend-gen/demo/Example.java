package demo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Example {
  public static void main(final String[] args) {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("red", "blue", "green");
    List<String> _sort = IterableExtensions.<String>sort(_newArrayList);
    InputOutput.<List<String>>println(_sort);
  }
  
  private Procedure1<? super String> _field;
  
  public Procedure1<? super String> getField() {
    return this._field;
  }
  
  public void setField(final Procedure1<? super String> field) {
    this._field = field;
  }
}
