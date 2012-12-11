package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ScopeTestExtension;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.SuitePackage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SuiteScopeProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SuiteScopeProviderSpec {
  @Inject
  @Extension
  public ScopeTestExtension _scopeTestExtension;
  
  @Extension
  public SuitePackage _suitePackage = SuitePackage.eINSTANCE;
  
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#MySuite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \"My Spec Reference\"\t");
    _builder.newLine();
    _builder.newLine();
    this._scopeTestExtension.parseSuite(_builder);
  }
  
  @Before
  public void before2() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"RootSpec\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"SubSpec 1\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"SubSpec 2\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._scopeTestExtension.parseSpec(_builder);
  }
  
  @Test
  @Named("spec references are only root specs")
  @Order(1)
  public void _specReferencesAreOnlyRootSpecs() throws Exception {
    Set<String> _specScope = this.specScope();
    boolean _should_contain = Should.<String>should_contain(_specScope, "RootSpec");
    Assert.assertTrue("\nExpected specScope should contain \"RootSpec\" but"
     + "\n     specScope is " + new StringDescription().appendValue(_specScope).toString() + "\n", _should_contain);
    
    Set<String> _specScope_1 = this.specScope();
    boolean _should_contain_1 = Should.<String>should_contain(_specScope_1, "SubSpec 1");
    Assert.assertFalse("\nExpected specScope should not contain  \"SubSpec 1\" but"
     + "\n     specScope is " + new StringDescription().appendValue(_specScope_1).toString() + "\n", _should_contain_1);
    
  }
  
  public Set<String> specScope() {
    EObject _first = this._scopeTestExtension.first(SpecReference.class);
    EReference _specReference_Spec = this._suitePackage.getSpecReference_Spec();
    return this._scopeTestExtension.scope(_first, _specReference_Spec);
  }
}
