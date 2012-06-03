package org.jnario.jnario.tests.unit.doc;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.Filter;
import org.jnario.doc.FilterExtractor;
import org.jnario.doc.FilteringResult;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpecFilterCreation;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpecFilterExtractions;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("FilterExtractor")
public class FilterExtractorSpec {
  @Subject
  public FilterExtractor subject;
  
  @Before
  public void _initFilterExtractorSpecFilterExtractions() {
    filterExtractions = ExampleTable.create("filterExtractions", 
      java.util.Arrays.asList("input", "resultString"), 
      new FilterExtractorSpecFilterExtractions(  java.util.Arrays.asList("null", "\"\""), null, ""),
      new FilterExtractorSpecFilterExtractions(  java.util.Arrays.asList("\"string\"", "\"string\""), "string", "string"),
      new FilterExtractorSpecFilterExtractions(  java.util.Arrays.asList("\"@filter(bbb)\"", "\"\""), "@filter(bbb)", ""),
      new FilterExtractorSpecFilterExtractions(  java.util.Arrays.asList("\"text @filter(bbb) text\"", "\"text text\""), "text @filter(bbb) text", "text text"),
      new FilterExtractorSpecFilterExtractions(  java.util.Arrays.asList("\"text@filter(bbb) text\"", "\"text@filter(bbb) text\""), "text@filter(bbb) text", "text@filter(bbb) text"),
      new FilterExtractorSpecFilterExtractions(  java.util.Arrays.asList("\"text @filter(bbb) text @filter(.*) text\"", "\"text text text\""), "text @filter(bbb) text @filter(.*) text", "text text text")
    );
  }
  
  protected ExampleTable<FilterExtractorSpecFilterExtractions> filterExtractions;
  
  @Before
  public void _initFilterExtractorSpecFilterCreation() {
    
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    List<String> _emptyList_1 = CollectionLiterals.<String>emptyList();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("bbb");
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList("bbb", ".*");filterCreation = ExampleTable.create("filterCreation", 
      java.util.Arrays.asList("input", "resultingFilters"), 
      new FilterExtractorSpecFilterCreation(  java.util.Arrays.asList("null", "<String>emptyList"), null, _emptyList),
      new FilterExtractorSpecFilterCreation(  java.util.Arrays.asList("\"string\"", "<String>emptyList"), "string", _emptyList_1),
      new FilterExtractorSpecFilterCreation(  java.util.Arrays.asList("\"@filter(bbb)\"", "newArrayList(\"bbb\")"), "@filter(bbb)", _newArrayList),
      new FilterExtractorSpecFilterCreation(  java.util.Arrays.asList("\"text @filter(bbb) text  @filter(.*)\"", "newArrayList(\"bbb\", \".*\")"), "text @filter(bbb) text  @filter(.*)", _newArrayList_1)
    );
  }
  
  protected ExampleTable<FilterExtractorSpecFilterCreation> filterCreation;
  
  @Test
  @Named("should remove all filter annotations from a string")
  @Order(99)
  public void shouldRemoveAllFilterAnnotationsFromAString() throws Exception {
    final Procedure1<FilterExtractorSpecFilterExtractions> _function = new Procedure1<FilterExtractorSpecFilterExtractions>() {
        public void apply(final FilterExtractorSpecFilterExtractions it) {
          String _stringAfterExtract = FilterExtractorSpec.this.stringAfterExtract(it.input);
          boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_stringAfterExtract, it.resultString);
          Assert.assertTrue("\nExpected stringAfterExtract(input) => resultString but"
           + "\n     stringAfterExtract(input) is " + "\"" + _stringAfterExtract + "\""
           + "\n     input is " + "\"" + it.input + "\""
           + "\n     resultString is " + "\"" + it.resultString + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<FilterExtractorSpecFilterExtractions>forEach(this.filterExtractions, _function);
  }
  
  @Test
  @Named("should extract and create filters")
  @Order(99)
  public void shouldExtractAndCreateFilters() throws Exception {
    final Procedure1<FilterExtractorSpecFilterCreation> _function = new Procedure1<FilterExtractorSpecFilterCreation>() {
        public void apply(final FilterExtractorSpecFilterCreation it) {
          List<String> _extractedFilters = FilterExtractorSpec.this.extractedFilters(it.input);
          boolean _doubleArrow = ObjectExtensions.<List<String>>operator_doubleArrow(_extractedFilters, it.resultingFilters);
          Assert.assertTrue("\nExpected extractedFilters(input) => resultingFilters but"
           + "\n     extractedFilters(input) is " + _extractedFilters
           + "\n     input is " + "\"" + it.input + "\""
           + "\n     resultingFilters is " + it.resultingFilters + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<FilterExtractorSpecFilterCreation>forEach(this.filterCreation, _function);
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
