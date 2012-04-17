package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.Should;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Should")
@InstantiateWith(SpecTestInstantiator.class)
public class ShouldSpec {
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("\\\'isNot\\\' is false if for \\\'1 should be 1")
  @Order(99)
  public void isNotIsFalseIfFor1ShouldBe1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("describe \"Should\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact 1 should be 1");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    Query _query = this._modelStore.query();
    Should _first = _query.<Should>first(Should.class);
    boolean _isNot = _first.isNot();
    boolean _not = (!_isNot);
    Assert.assertTrue("\nExpected !query.first(typeof(Should)).isNot but:"
     + "\n     query.first(typeof(Should)).isNot is " + _isNot
     + "\n     query.first(typeof(Should)) is " + _first
     + "\n     query is " + _query + "\n", _not);
    
  }
  
  @Test
  @Named("\\\'isNot\\\' is true if for \\\'1 should not be 1")
  @Order(99)
  public void isNotIsTrueIfFor1ShouldNotBe1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("describe \"Should\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact 1 should not be 1");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    Query _query = this._modelStore.query();
    Should _first = _query.<Should>first(Should.class);
    boolean _isNot = _first.isNot();
    Assert.assertTrue("\nExpected query.first(typeof(Should)).isNot but:"
     + "\n     query.first(typeof(Should)) is " + _first
     + "\n     query is " + _query + "\n", _isNot);
    
  }
}
