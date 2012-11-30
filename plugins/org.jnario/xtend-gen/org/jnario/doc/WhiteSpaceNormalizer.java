package org.jnario.doc;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class WhiteSpaceNormalizer {
  public String normalize(final CharSequence input) {
    String _xblockexpression = null;
    {
      boolean _or = false;
      boolean _equals = Objects.equal(input, null);
      if (_equals) {
        _or = true;
      } else {
        int _length = input.length();
        boolean _equals_1 = (_length == 0);
        _or = (_equals || _equals_1);
      }
      if (_or) {
        return "";
      }
      String _string = input.toString();
      String[] _split = _string.split("\r?\n");
      Iterable<String> lines = Arrays.<String>asList(_split);
      boolean _isEmpty = IterableExtensions.isEmpty(lines);
      if (_isEmpty) {
        return "";
      }
      String firstLine = IterableExtensions.<String>head(lines);
      String _trim = firstLine.trim();
      int _length_1 = _trim.length();
      boolean _equals_2 = (_length_1 == 0);
      boolean _while = _equals_2;
      while (_while) {
        {
          Iterable<String> _drop = IterableExtensions.<String>drop(lines, 1);
          lines = _drop;
          String _head = IterableExtensions.<String>head(lines);
          firstLine = _head;
          boolean _equals_3 = Objects.equal(firstLine, null);
          if (_equals_3) {
            return "";
          }
        }
        String _trim_1 = firstLine.trim();
        int _length_2 = _trim_1.length();
        boolean _equals_3 = (_length_2 == 0);
        _while = _equals_3;
      }
      final String whitespace = this.whitespaceAtBeginning(firstLine);
      String ending = "";
      boolean _endsWith = Strings.endsWith(input, "\n");
      if (_endsWith) {
        ending = "\n";
      }
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String it) {
            String _remove = WhiteSpaceNormalizer.this.remove(it, whitespace);
            return _remove;
          }
        };
      Iterable<String> _map = IterableExtensions.<String, String>map(lines, _function);
      String _join = IterableExtensions.join(_map, "\n");
      String result = (_join + ending);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public String whitespaceAtBeginning(final String string) {
    StringBuilder _stringBuilder = new StringBuilder();
    final StringBuilder whitespace = _stringBuilder;
    char[] _charArray = string.toCharArray();
    for (final char c : _charArray) {
      boolean _isWhitespace = Character.isWhitespace(c);
      if (_isWhitespace) {
        whitespace.append(c);
      } else {
        return whitespace.toString();
      }
    }
    return "";
  }
  
  public String remove(final String input, final String toReplace) {
    int _length = input.length();
    int _length_1 = toReplace.length();
    boolean _lessThan = (_length < _length_1);
    if (_lessThan) {
      boolean _startsWith = toReplace.startsWith(input);
      if (_startsWith) {
        return "";
      } else {
        return input;
      }
    }
    int i = 0;
    int _length_2 = toReplace.length();
    boolean _lessThan_1 = (i < _length_2);
    boolean _while = _lessThan_1;
    while (_while) {
      {
        char _charAt = input.charAt(i);
        char _charAt_1 = toReplace.charAt(i);
        boolean _notEquals = (_charAt != _charAt_1);
        if (_notEquals) {
          return input;
        }
        int _plus = (i + 1);
        i = _plus;
      }
      int _length_3 = toReplace.length();
      boolean _lessThan_2 = (i < _length_3);
      _while = _lessThan_2;
    }
    int _length_3 = toReplace.length();
    return input.substring(_length_3);
  }
}
