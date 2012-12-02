package org.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class EncodingTest {
  public static void main(final String[] args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"hall\u00F6\"");
    String _convertToJavaString = Strings.convertToJavaString(_builder.toString());
    InputOutput.<String>println(_convertToJavaString);
  }
}
