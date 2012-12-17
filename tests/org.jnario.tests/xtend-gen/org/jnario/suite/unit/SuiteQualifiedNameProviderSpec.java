package org.jnario.suite.unit;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.naming.SuiteQualifiedNameProvider;
import org.jnario.suite.suite.Suite;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SuiteQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SuiteQualifiedNameProviderSpec {
  @Subject
  public SuiteQualifiedNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("removes suite prefix")
  @Order(1)
  public void _removesSuitePrefix() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#My Suite");
    this._modelStore.parseSuite(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Suite");
    Assert.assertTrue("\nExpected qualifiedName => \"My Suite\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("removes suite trailing text")
  @Order(2)
  public void _removesSuiteTrailingText() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.append("with description");
    this._modelStore.parseSuite(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Suite");
    Assert.assertTrue("\nExpected qualifiedName => \"My Suite\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("add suite package")
  @Order(3)
  public void _addSuitePackage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("#My Suite");
    this._modelStore.parseSuite(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "test.My Suite");
    Assert.assertTrue("\nExpected qualifiedName => \"test.My Suite\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("handles empty packages")
  @Order(4)
  public void _handlesEmptyPackages() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#My Suite");
    this._modelStore.parseSuite(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Suite");
    Assert.assertTrue("\nExpected qualifiedName => \"My Suite\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("handles empty suites")
  @Order(5)
  public void _handlesEmptySuites() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    _builder.newLine();
    this._modelStore.parseSuite(_builder);
    String _qualifiedName = this.qualifiedName();
    Matcher<String> _nullValue = CoreMatchers.<String>nullValue();
    boolean _should_be = Should.<String>should_be(_qualifiedName, _nullValue);
    Assert.assertTrue("\nExpected qualifiedName should be null but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _should_be);
    
  }
  
  public String qualifiedName() {
    Suite _firstSuite = this._modelStore.firstSuite();
    QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_firstSuite);
    String _string = _fullyQualifiedName==null?(String)null:_fullyQualifiedName.toString();
    return _string;
  }
}
