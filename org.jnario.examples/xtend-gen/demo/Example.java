package demo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Example {
  public static void main(final String[] args) {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("red", "blue", "green");
    List<String> _sort = IterableExtensions.<String>sort(_newArrayList);
    InputOutput.<List<String>>println(_sort);
  }
}
