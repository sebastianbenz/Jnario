/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.doc.Filter;
import org.jnario.doc.FilteringResult;
import org.jnario.doc.LangFilter;
import org.jnario.doc.RegexFilter;

@SuppressWarnings("all")
public class FilterExtractor {
  private static String TAG = "(^|\\W)@(\\w+)(\\((.*?)\\))";
  
  private static Pattern TAG_PATTERN = Pattern.compile(FilterExtractor.TAG, Pattern.DOTALL);
  
  private Map<String, Function1<String, Filter>> filterRegistry = CollectionLiterals.<String, Function1<String, Filter>>newHashMap(
    Pair.<String, Function1<String, Filter>>of("filter", new Function1<String, Filter>() {
      public Filter apply(final String s) {
        return RegexFilter.create(s);
      }
    }), 
    Pair.<String, Function1<String, Filter>>of("lang", new Function1<String, Filter>() {
      public Filter apply(final String s) {
        return LangFilter.create(s);
      }
    }));
  
  public FilteringResult apply(final String input) {
    boolean _equals = Objects.equal(input, null);
    if (_equals) {
      return FilteringResult.EMPTY_RESULT;
    }
    final StringBuilder resultString = new StringBuilder();
    final List<Filter> filters = CollectionLiterals.<Filter>newArrayList();
    final Matcher matcher = FilterExtractor.TAG_PATTERN.matcher(input);
    int offset = 0;
    boolean _find = matcher.find();
    boolean _while = _find;
    while (_while) {
      {
        final String key = matcher.group(2);
        final Function1<String, Filter> candidate = this.filterRegistry.get(key);
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
    return new FilteringResult(_string, filters);
  }
}
