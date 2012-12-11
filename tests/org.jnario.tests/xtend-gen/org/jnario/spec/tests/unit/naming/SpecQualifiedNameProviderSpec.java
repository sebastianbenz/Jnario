package org.jnario.spec.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.SpecQualifiedNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SpecQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class SpecQualifiedNameProviderSpec {
  @Subject
  public SpecQualifiedNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("null if spec description is empty")
  @Order(1)
  public void _nullIfSpecDescriptionIsEmpty() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Matcher<String> _nullValue = CoreMatchers.<String>nullValue();
    boolean _should_be = Should.<String>should_be(_qualifiedName, _nullValue);
    Assert.assertTrue("\nExpected qualifiedName should be null but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _should_be);
    
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("describe \"\"{}");
    this._modelStore.parseSpec(_builder_1);
    String _qualifiedName_1 = this.qualifiedName();
    Matcher<String> _nullValue_1 = CoreMatchers.<String>nullValue();
    boolean _should_be_1 = Should.<String>should_be(_qualifiedName_1, _nullValue_1);
    Assert.assertTrue("\nExpected qualifiedName should be null but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName_1).toString() + "\n", _should_be_1);
    
  }
  
  @Test
  @Named("uses spec description")
  @Order(2)
  public void _usesSpecDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"My Spec\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("trims spec description whitespace")
  @Order(3)
  public void _trimsSpecDescriptionWhitespace() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"My Spec  \"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"My Spec\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("uses referenced type")
  @Order(4)
  public void _usesReferencedType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "Assert");
    Assert.assertTrue("\nExpected qualifiedName => \"Assert\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("uses referenced type and description")
  @Order(5)
  public void _usesReferencedTypeAndDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "Assert My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"Assert My Spec\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("adds spec package")
  @Order(6)
  public void _addsSpecPackage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "test.My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"test.My Spec\" but"
     + "\n     qualifiedName is " + new StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
    
  }
  
  public String qualifiedName() {
    ExampleGroup _firstSpec = this._modelStore.firstSpec();
    QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_firstSpec);
    String _string = _fullyQualifiedName==null?(String)null:_fullyQualifiedName.toString();
    return _string;
  }
}
