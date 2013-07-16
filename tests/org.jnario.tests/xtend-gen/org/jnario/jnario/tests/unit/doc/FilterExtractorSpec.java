/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.doc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.Filter;
import org.jnario.doc.FilterExtractor;
import org.jnario.doc.FilteringResult;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpecFilterCreation;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpecFilterExtractions;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("FilterExtractor")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FilterExtractorSpec {
  @Subject
  public FilterExtractor subject;
  
  public ExampleTable<FilterExtractorSpecFilterExtractions> _initFilterExtractorSpecFilterExtractions() {
    return ExampleTable.create("filterExtractions", 
      Arrays.asList("input", "resultString"), 
      new FilterExtractorSpecFilterExtractions(  Arrays.asList("\"\"", "\"\""), _initFilterExtractorSpecFilterExtractionsCell0(), _initFilterExtractorSpecFilterExtractionsCell1()),
      new FilterExtractorSpecFilterExtractions(  Arrays.asList("\"string\"", "\"string\""), _initFilterExtractorSpecFilterExtractionsCell2(), _initFilterExtractorSpecFilterExtractionsCell3()),
      new FilterExtractorSpecFilterExtractions(  Arrays.asList("\"@filter(bbb)\"", "\"\""), _initFilterExtractorSpecFilterExtractionsCell4(), _initFilterExtractorSpecFilterExtractionsCell5()),
      new FilterExtractorSpecFilterExtractions(  Arrays.asList("\"text @filter(bbb) text\"", "\"text text\""), _initFilterExtractorSpecFilterExtractionsCell6(), _initFilterExtractorSpecFilterExtractionsCell7()),
      new FilterExtractorSpecFilterExtractions(  Arrays.asList("\"text@filter(bbb) text\"", "\"text@filter(bbb) text\""), _initFilterExtractorSpecFilterExtractionsCell8(), _initFilterExtractorSpecFilterExtractionsCell9()),
      new FilterExtractorSpecFilterExtractions(  Arrays.asList("\"text @filter(bbb) text @filter(.*) text\"", "\"text text text\""), _initFilterExtractorSpecFilterExtractionsCell10(), _initFilterExtractorSpecFilterExtractionsCell11())
    );
  }
  
  protected ExampleTable<FilterExtractorSpecFilterExtractions> filterExtractions = _initFilterExtractorSpecFilterExtractions();
  
  public String _initFilterExtractorSpecFilterExtractionsCell0() {
    return "";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell1() {
    return "";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell2() {
    return "string";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell3() {
    return "string";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell4() {
    return "@filter(bbb)";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell5() {
    return "";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell6() {
    return "text @filter(bbb) text";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell7() {
    return "text text";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell8() {
    return "text@filter(bbb) text";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell9() {
    return "text@filter(bbb) text";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell10() {
    return "text @filter(bbb) text @filter(.*) text";
  }
  
  public String _initFilterExtractorSpecFilterExtractionsCell11() {
    return "text text text";
  }
  
  public ExampleTable<FilterExtractorSpecFilterCreation> _initFilterExtractorSpecFilterCreation() {
    return ExampleTable.create("filterCreation", 
      Arrays.asList("input", "resultingFilters"), 
      new FilterExtractorSpecFilterCreation(  Arrays.asList("null", "<String>emptyList"), null, _initFilterExtractorSpecFilterCreationCell1()),
      new FilterExtractorSpecFilterCreation(  Arrays.asList("\"string\"", "<String>emptyList"), _initFilterExtractorSpecFilterCreationCell2(), _initFilterExtractorSpecFilterCreationCell3()),
      new FilterExtractorSpecFilterCreation(  Arrays.asList("\"@filter(bbb)\"", "newArrayList(\"bbb\")"), _initFilterExtractorSpecFilterCreationCell4(), _initFilterExtractorSpecFilterCreationCell5()),
      new FilterExtractorSpecFilterCreation(  Arrays.asList("\"text @filter(bbb) text  @filter(.*)\"", "newArrayList(\"bbb\", \".*\")"), _initFilterExtractorSpecFilterCreationCell6(), _initFilterExtractorSpecFilterCreationCell7())
    );
  }
  
  protected ExampleTable<FilterExtractorSpecFilterCreation> filterCreation = _initFilterExtractorSpecFilterCreation();
  
  public Object _initFilterExtractorSpecFilterCreationCell0() {
    return null;
  }
  
  public List<String> _initFilterExtractorSpecFilterCreationCell1() {
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    return _emptyList;
  }
  
  public String _initFilterExtractorSpecFilterCreationCell2() {
    return "string";
  }
  
  public List<String> _initFilterExtractorSpecFilterCreationCell3() {
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    return _emptyList;
  }
  
  public String _initFilterExtractorSpecFilterCreationCell4() {
    return "@filter(bbb)";
  }
  
  public ArrayList<String> _initFilterExtractorSpecFilterCreationCell5() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("bbb");
    return _newArrayList;
  }
  
  public String _initFilterExtractorSpecFilterCreationCell6() {
    return "text @filter(bbb) text  @filter(.*)";
  }
  
  public ArrayList<String> _initFilterExtractorSpecFilterCreationCell7() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("bbb", ".*");
    return _newArrayList;
  }
  
  @Test
  @Named("should remove all filter annotations from a string")
  @Order(1)
  public void _shouldRemoveAllFilterAnnotationsFromAString() throws Exception {
    final Procedure1<FilterExtractorSpecFilterExtractions> _function = new Procedure1<FilterExtractorSpecFilterExtractions>() {
        public void apply(final FilterExtractorSpecFilterExtractions it) {
          String _input = it.getInput();
          String _stringAfterExtract = FilterExtractorSpec.this.stringAfterExtract(_input);
          String _resultString = it.getResultString();
          boolean _doubleArrow = Should.<String>operator_doubleArrow(_stringAfterExtract, _resultString);
          Assert.assertTrue("\nExpected stringAfterExtract(input) => resultString but"
           + "\n     stringAfterExtract(input) is " + new org.hamcrest.StringDescription().appendValue(_stringAfterExtract).toString()
           + "\n     input is " + new org.hamcrest.StringDescription().appendValue(_input).toString()
           + "\n     resultString is " + new org.hamcrest.StringDescription().appendValue(_resultString).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<FilterExtractorSpecFilterExtractions>forEach(this.filterExtractions, _function);
  }
  
  @Test
  @Named("should extract and create filters")
  @Order(2)
  public void _shouldExtractAndCreateFilters() throws Exception {
    final Procedure1<FilterExtractorSpecFilterCreation> _function = new Procedure1<FilterExtractorSpecFilterCreation>() {
        public void apply(final FilterExtractorSpecFilterCreation it) {
          String _input = it.getInput();
          List<String> _extractedFilters = FilterExtractorSpec.this.extractedFilters(_input);
          List<String> _resultingFilters = it.getResultingFilters();
          boolean _doubleArrow = Should.<List<String>>operator_doubleArrow(_extractedFilters, _resultingFilters);
          Assert.assertTrue("\nExpected extractedFilters(input) => resultingFilters but"
           + "\n     extractedFilters(input) is " + new org.hamcrest.StringDescription().appendValue(_extractedFilters).toString()
           + "\n     input is " + new org.hamcrest.StringDescription().appendValue(_input).toString()
           + "\n     resultingFilters is " + new org.hamcrest.StringDescription().appendValue(_resultingFilters).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<FilterExtractorSpecFilterCreation>forEach(this.filterCreation, _function);
  }
  
  public String stringAfterExtract(final String input) {
    FilteringResult _apply = this.subject.apply(input);
    String _string = _apply.getString();
    return _string;
  }
  
  public List<String> extractedFilters(final String input) {
    FilteringResult _apply = this.subject.apply(input);
    List<Filter> _filters = _apply.getFilters();
    final Function1<Filter,String> _function = new Function1<Filter,String>() {
        public String apply(final Filter it) {
          String _string = it.toString();
          return _string;
        }
      };
    List<String> _map = ListExtensions.<Filter, String>map(_filters, _function);
    return _map;
  }
}
