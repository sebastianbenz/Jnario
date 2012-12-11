package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.Specification;
import org.jnario.feature.feature.Feature;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.jvmmodel.SuiteExecutableProvider;
import org.jnario.suite.suite.Suite;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SuiteExecutableProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SuiteExecutableProviderSpec {
  @Subject
  public SuiteExecutableProvider subject;
  
  @Inject
  @Extension
  public ModelStore m;
  
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("describe \"My Spec\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// this should be filtered");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"My Internal Spec\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("describe String{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package demo");
    _builder_1.newLine();
    _builder_1.append("Feature: My Feature");
    _builder_1.newLine();
    _builder_1.append("Scenario My Scenario");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Given nothing");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Then nothing");
    _builder_1.newLine();
    this.m.parseScenario(_builder_1);
  }
  
  @Test
  @Named("returns contained suites")
  @Order(1)
  public void _returnsContainedSuites() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("##Child 1");
    _builder.newLine();
    _builder.append("##Child 2");
    _builder.newLine();
    _builder.append("###Grandchild");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _suite = this.m.suite("My Suite");
    List<Executable> _executables = this.subject.getExecutables(_suite);
    Suite _suite_1 = this.m.suite("Child 1");
    Suite _suite_2 = this.m.suite("Child 2");
    List<Suite> _list = JnarioCollectionLiterals.<Suite>list(_suite_1, _suite_2);
    boolean _doubleArrow = Should.operator_doubleArrow(_executables, _list);
    Assert.assertTrue("\nExpected subject.getExecutables(suite(\"My Suite\")) => list(suite(\"Child 1\"), suite(\"Child 2\")) but"
     + "\n     subject.getExecutables(suite(\"My Suite\")) is " + new StringDescription().appendValue(_executables).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     suite(\"My Suite\") is " + new StringDescription().appendValue(_suite).toString()
     + "\n     list(suite(\"Child 1\"), suite(\"Child 2\")) is " + new StringDescription().appendValue(_list).toString()
     + "\n     suite(\"Child 1\") is " + new StringDescription().appendValue(_suite_1).toString()
     + "\n     suite(\"Child 2\") is " + new StringDescription().appendValue(_suite_2).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns resolved specs via link")
  @Order(2)
  public void _returnsResolvedSpecsViaLink() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \"My Spec\"");
    _builder.newLine();
    _builder.append("- \"My Feature\"");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _suite = this.m.suite("My Suite");
    List<Executable> _executables = this.subject.getExecutables(_suite);
    Set<Executable> _set = IterableExtensions.<Executable>toSet(_executables);
    ExampleGroup _exampleGroup = this.m.exampleGroup("My Spec");
    Feature _feature = this.m.feature();
    Set<Specification> _set_1 = JnarioCollectionLiterals.<Specification>set(_exampleGroup, _feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_set, _set_1);
    Assert.assertTrue("\nExpected subject.getExecutables(suite(\"My Suite\")).toSet => set(exampleGroup(\"My Spec\"), feature()) but"
     + "\n     subject.getExecutables(suite(\"My Suite\")).toSet is " + new StringDescription().appendValue(_set).toString()
     + "\n     subject.getExecutables(suite(\"My Suite\")) is " + new StringDescription().appendValue(_executables).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     suite(\"My Suite\") is " + new StringDescription().appendValue(_suite).toString()
     + "\n     set(exampleGroup(\"My Spec\"), feature()) is " + new StringDescription().appendValue(_set_1).toString()
     + "\n     exampleGroup(\"My Spec\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     feature() is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns resolved specs via regex")
  @Order(3)
  public void _returnsResolvedSpecsViaRegex() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\demo.*\\");
    _builder.newLine();
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _suite = this.m.suite("My Suite");
    List<Executable> _executables = this.subject.getExecutables(_suite);
    Set<Executable> _set = IterableExtensions.<Executable>toSet(_executables);
    ExampleGroup _exampleGroup = this.m.exampleGroup("My Spec");
    ExampleGroup _exampleGroup_1 = this.m.exampleGroup("String");
    Feature _feature = this.m.feature();
    Set<Specification> _set_1 = JnarioCollectionLiterals.<Specification>set(_exampleGroup, _exampleGroup_1, _feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_set, _set_1);
    Assert.assertTrue("\nExpected subject.getExecutables(suite(\"My Suite\")).toSet => set(exampleGroup(\"My Spec\"), exampleGroup(\"String\"), feature()) but"
     + "\n     subject.getExecutables(suite(\"My Suite\")).toSet is " + new StringDescription().appendValue(_set).toString()
     + "\n     subject.getExecutables(suite(\"My Suite\")) is " + new StringDescription().appendValue(_executables).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     suite(\"My Suite\") is " + new StringDescription().appendValue(_suite).toString()
     + "\n     set(exampleGroup(\"My Spec\"), exampleGroup(\"String\"), feature()) is " + new StringDescription().appendValue(_set_1).toString()
     + "\n     exampleGroup(\"My Spec\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     exampleGroup(\"String\") is " + new StringDescription().appendValue(_exampleGroup_1).toString()
     + "\n     feature() is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
}
