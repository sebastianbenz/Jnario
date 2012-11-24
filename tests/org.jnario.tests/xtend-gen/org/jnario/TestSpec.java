package org.jnario;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Test")
public class TestSpec {
  Matcher<List<? extends Object>> empty = new Function0<Matcher<List<? extends Object>>>() {
    public Matcher<List<? extends Object>> apply() {
      final Function1<List<? extends Object>,Boolean> _function = new Function1<List<? extends Object>,Boolean>() {
          public Boolean apply(final List<? extends Object> it) {
            boolean _isEmpty = it.isEmpty();
            return Boolean.valueOf(_isEmpty);
          }
        };
      Matcher<List<? extends Object>> _matches = Should.<List<? extends Object>>matches("empty", _function);
      return _matches;
    }
  }.apply();
  
  @Test
  @Named("newArrayList[\\\"\\\"] should be empty")
  @Order(1)
  public void _newArrayListShouldBeEmpty() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("");
    boolean _should_be = Should.<List<? extends Object>>should_be(_newArrayList, this.empty);
    Assert.assertTrue("\nExpected newArrayList(\"\") should be empty but"
     + "\n     newArrayList(\"\") is " + new StringDescription().appendValue(_newArrayList).toString()
     + "\n     empty is " + new StringDescription().appendValue(this.empty).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("newArrayList[] should be greaterThan[1]")
  @Order(2)
  public void _newArrayListShouldBeGreaterThan1() throws Exception {
    ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList();
    Matcher<List<?>> _greaterThan = this.greaterThan(1);
    boolean _should_be = Should.<List<?>>should_be(_newArrayList, _greaterThan);
    Assert.assertTrue("\nExpected newArrayList() should be greaterThan(1) but"
     + "\n     newArrayList() is " + new StringDescription().appendValue(_newArrayList).toString()
     + "\n     greaterThan(1) is " + new StringDescription().appendValue(_greaterThan).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("newArrayList => [ it should be empty size should be 0 ]")
  @Order(3)
  public void _newArrayListItShouldBeEmptySizeShouldBe0() throws Exception {
    ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList();
    final Procedure1<ArrayList<Object>> _function = new Procedure1<ArrayList<Object>>() {
        public void apply(final ArrayList<Object> it) {
          boolean _should_be = Should.<List<? extends Object>>should_be(it, TestSpec.this.empty);
          Assert.assertTrue("\nExpected it should be empty but"
           + "\n     it is " + new StringDescription().appendValue(it).toString()
           + "\n     empty is " + new StringDescription().appendValue(TestSpec.this.empty).toString() + "\n", _should_be);
          
          int _size = it.size();
          boolean _should_be_1 = Should.should_be(Integer.valueOf(_size), Integer.valueOf(0));
          Assert.assertTrue("\nExpected size should be 0 but"
           + "\n     size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString() + "\n", _should_be_1);
          
        }
      };
    ObjectExtensions.<ArrayList<Object>>operator_doubleArrow(_newArrayList, _function);
  }
  
  @Test
  @Named("newArrayList should be allOf[empty, greaterThan[10]]")
  @Order(4)
  public void _newArrayListShouldBeAllOfEmptyGreaterThan10() throws Exception {
    ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList();
    Matcher<List<?>> _greaterThan = this.greaterThan(10);
    Matcher<List<? extends Object>> _allOf = CoreMatchers.<List<? extends Object>>allOf(this.empty, _greaterThan);
    boolean _should_be = Should.<List<? extends Object>>should_be(_newArrayList, _allOf);
    Assert.assertTrue("\nExpected newArrayList should be allOf(empty, greaterThan(10)) but"
     + "\n     newArrayList is " + new StringDescription().appendValue(_newArrayList).toString()
     + "\n     allOf(empty, greaterThan(10)) is " + new StringDescription().appendValue(_allOf).toString()
     + "\n     empty is " + new StringDescription().appendValue(this.empty).toString()
     + "\n     greaterThan(10) is " + new StringDescription().appendValue(_greaterThan).toString() + "\n", _should_be);
    
  }
  
  public Matcher<List<?>> greaterThan(final int x) {
    String _plus = ("greather than " + Integer.valueOf(x));
    final Function1<List<?>,Boolean> _function = new Function1<List<?>,Boolean>() {
        public Boolean apply(final List<?> it) {
          int _size = it.size();
          boolean _greaterThan = (_size > x);
          return Boolean.valueOf(_greaterThan);
        }
      };
    Matcher<List<?>> _matches = Should.<List<?>>matches(_plus, _function);
    return _matches;
  }
}
