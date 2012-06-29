package org.jnario.spec.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.SpecQualifiedNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SpecQualifiedNameProvider")
@CreateWith(value = SpecTestCreator.class)
public class SpecQualifiedNameProviderSpec {
  @Subject
  public SpecQualifiedNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("uses spec description")
  @Order(99)
  public void usesSpecDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"My Spec\" but"
     + "\n     qualifiedName is " + "\"" + _qualifiedName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("trims spec description whitespace")
  @Order(99)
  public void trimsSpecDescriptionWhitespace() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"My Spec  \"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"My Spec\" but"
     + "\n     qualifiedName is " + "\"" + _qualifiedName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("uses referenced type")
  @Order(99)
  public void usesReferencedType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "Assert");
    Assert.assertTrue("\nExpected qualifiedName => \"Assert\" but"
     + "\n     qualifiedName is " + "\"" + _qualifiedName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("uses referenced type and description")
  @Order(99)
  public void usesReferencedTypeAndDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "Assert My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"Assert My Spec\" but"
     + "\n     qualifiedName is " + "\"" + _qualifiedName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("adds spec package")
  @Order(99)
  public void addsSpecPackage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    boolean _doubleArrow = Should.operator_doubleArrow(_qualifiedName, "test.My Spec");
    Assert.assertTrue("\nExpected qualifiedName => \"test.My Spec\" but"
     + "\n     qualifiedName is " + "\"" + _qualifiedName + "\"" + "\n", _doubleArrow);
    
  }
  
  public String qualifiedName() {
    ExampleGroup _firstSpec = this._modelStore.firstSpec();
    QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_firstSpec);
    String _string = _fullyQualifiedName.toString();
    return _string;
  }
}
