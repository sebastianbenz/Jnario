package org.jnario.suite.unit;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.naming.SuiteQualifiedNameProvider;
import org.jnario.suite.suite.Suite;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteQualifiedNameProvider")
@CreateWith(value = SuiteTestCreator.class)
public class SuiteQualifiedNameProviderSpec {
  @Subject
  public SuiteQualifiedNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("removes suite prefix")
  @Order(99)
  public void removesSuitePrefix() throws Exception {
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
  @Order(99)
  public void removesSuiteTrailingText() throws Exception {
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
  @Order(99)
  public void addSuitePackage() throws Exception {
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
  @Order(99)
  public void handlesEmptyPackages() throws Exception {
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
  @Order(99)
  public void handlesEmptySuites() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    _builder.newLine();
    this._modelStore.parseSuite(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _should_be = Should.<String>should_be(_qualifiedName, null);
    Assert.assertTrue("\nExpected qualifiedName should be null but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _should_be);
    
  }
  
  public String qualifiedName() {
    Suite _firstSuite = this._modelStore.firstSuite();
    QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_firstSuite);
    String _string = _fullyQualifiedName.toString();
    return _string;
  }
}
