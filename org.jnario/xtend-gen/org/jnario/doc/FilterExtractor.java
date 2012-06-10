/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.doc.Filter;
import org.jnario.doc.FilteringResult;
import org.jnario.doc.LangFilter;
import org.jnario.doc.RegexFilter;

@SuppressWarnings("all")
public class FilterExtractor {
  private static String TAG = "(^|\\W)@(\\w+)(\\((.*?)\\))";
  
  private static Pattern TAG_PATTERN = new Function0<Pattern>() {
    public Pattern apply() {
      Pattern _compile = Pattern.compile(FilterExtractor.TAG, Pattern.DOTALL);
      return _compile;
    }
  }.apply();
  
  private Map<String,Function1<String,Filter>> filterRegistry = new Function0<Map<String,Function1<String,Filter>>>() {
    public Map<String,Function1<String,Filter>> apply() {
      final Function1<String,Filter> _function = new Function1<String,Filter>() {
          public Filter apply(final String s) {
            Filter _create = RegexFilter.create(s);
            return _create;
          }
        };
      Pair<String,Function1<String,Filter>> _mappedTo = Pair.<String, Function1<String,Filter>>of("filter", _function);
      final Function1<String,Filter> _function_1 = new Function1<String,Filter>() {
          public Filter apply(final String s) {
            Filter _create = LangFilter.create(s);
            return _create;
          }
        };
      Pair<String,Function1<String,Filter>> _mappedTo_1 = Pair.<String, Function1<String,Filter>>of("lang", _function_1);
      HashMap<String,Function1<String,Filter>> _newHashMap = CollectionLiterals.<String, Function1<String,Filter>>newHashMap(_mappedTo, _mappedTo_1);
      return _newHashMap;
    }
  }.apply();
  
  public FilteringResult apply(final String input) {
    boolean _equals = Objects.equal(input, null);
    if (_equals) {
      return FilteringResult.EMPTY_RESULT;
    }
    StringBuilder _stringBuilder = new StringBuilder();
    final StringBuilder resultString = _stringBuilder;
    final List<Filter> filters = CollectionLiterals.<Filter>newArrayList();
    final Matcher matcher = FilterExtractor.TAG_PATTERN.matcher(input);
    int offset = 0;
    boolean _find = matcher.find();
    boolean _while = _find;
    while (_while) {
      {
        final String key = matcher.group(2);
        final Function1<String,Filter> candidate = this.filterRegistry.get(key);
        boolean _notEquals = (!Objects.equal(candidate, null));
        if (_notEquals) {
          String _group = matcher.group(4);
          Filter _apply = candidate.apply(_group);
          filters.add(_apply);
        }
        final int nextOffset = matcher.start();
        String _substring = input.substring(offset, nextOffset);
        resultString.append(_substring);
        int _end = matcher.end();
        offset = _end;
      }
      boolean _find_1 = matcher.find();
      _while = _find_1;
    }
    String _substring = input.substring(offset);
    resultString.append(_substring);
    String _string = resultString.toString();
    FilteringResult _filteringResult = new FilteringResult(_string, filters);
    return _filteringResult;
  }
}
