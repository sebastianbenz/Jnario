package org.jnario.spec.tests.unit.spec;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.jvmmodel.SpecExecutableProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("SpecExecutableProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecExecutableProviderSpec {
  @Subject
  public SpecExecutableProvider subject;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("returns all examples")
  @Order(1)
  public void _returnsAllExamples() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 2\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    ExampleGroup _exampleGroup = this._modelStore.exampleGroup("Something");
    List<Executable> _executables = this.executables(_exampleGroup);
    Example _example = this._modelStore.example("fact 1");
    Example _example_1 = this._modelStore.example("fact 2");
    List<Example> _list = JnarioCollectionLiterals.<Example>list(_example, _example_1);
    Assert.assertTrue("\nExpected exampleGroup(\"Something\").executables => list(example(\"fact 1\"), example(\"fact 2\")) but"
     + "\n     exampleGroup(\"Something\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     exampleGroup(\"Something\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup).toString()
     + "\n     list(example(\"fact 1\"), example(\"fact 2\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     example(\"fact 1\") is " + new org.hamcrest.StringDescription().appendValue(_example).toString()
     + "\n     example(\"fact 2\") is " + new org.hamcrest.StringDescription().appendValue(_example_1).toString() + "\n", Should.<List<? extends Executable>>operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns all sub example groups")
  @Order(2)
  public void _returnsAllSubExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 1\"{}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 2\"{}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    ExampleGroup _exampleGroup = this._modelStore.exampleGroup("Something");
    List<Executable> _executables = this.executables(_exampleGroup);
    ExampleGroup _exampleGroup_1 = this._modelStore.exampleGroup("exampleGroup 1");
    ExampleGroup _exampleGroup_2 = this._modelStore.exampleGroup("exampleGroup 2");
    List<ExampleGroup> _list = JnarioCollectionLiterals.<ExampleGroup>list(_exampleGroup_1, _exampleGroup_2);
    Assert.assertTrue("\nExpected exampleGroup(\"Something\").executables => list(exampleGroup(\"exampleGroup 1\"), exampleGroup(\"exampleGroup 2\")) but"
     + "\n     exampleGroup(\"Something\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     exampleGroup(\"Something\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup).toString()
     + "\n     list(exampleGroup(\"exampleGroup 1\"), exampleGroup(\"exampleGroup 2\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     exampleGroup(\"exampleGroup 1\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup_1).toString()
     + "\n     exampleGroup(\"exampleGroup 2\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup_2).toString() + "\n", Should.<List<? extends Executable>>operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns all facts in sub example groups")
  @Order(3)
  public void _returnsAllFactsInSubExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 1\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact \"fact 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"exampleGroup 2\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact \"fact 2\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
    ExampleGroup _exampleGroup = this._modelStore.exampleGroup("Something");
    List<Executable> _executables = this.executables(_exampleGroup);
    Set<Executable> _set = IterableExtensions.<Executable>toSet(_executables);
    ExampleGroup _exampleGroup_1 = this._modelStore.exampleGroup("exampleGroup 1");
    Example _example = this._modelStore.example("fact 1");
    ExampleGroup _exampleGroup_2 = this._modelStore.exampleGroup("exampleGroup 2");
    Example _example_1 = this._modelStore.example("fact 2");
    Set<Executable> _set_1 = JnarioCollectionLiterals.<Executable>set(_exampleGroup_1, _example, _exampleGroup_2, _example_1);
    Assert.assertTrue("\nExpected exampleGroup(\"Something\").executables.toSet => <Executable>set(exampleGroup(\"exampleGroup 1\"), example(\"fact 1\"), exampleGroup(\"exampleGroup 2\"), example(\"fact 2\")) but"
     + "\n     exampleGroup(\"Something\").executables.toSet is " + new org.hamcrest.StringDescription().appendValue(_set).toString()
     + "\n     exampleGroup(\"Something\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     exampleGroup(\"Something\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup).toString()
     + "\n     <Executable>set(exampleGroup(\"exampleGroup 1\"), example(\"fact 1\"), exampleGroup(\"exampleGroup 2\"), example(\"fact 2\")) is " + new org.hamcrest.StringDescription().appendValue(_set_1).toString()
     + "\n     exampleGroup(\"exampleGroup 1\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup_1).toString()
     + "\n     example(\"fact 1\") is " + new org.hamcrest.StringDescription().appendValue(_example).toString()
     + "\n     exampleGroup(\"exampleGroup 2\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup_2).toString()
     + "\n     example(\"fact 2\") is " + new org.hamcrest.StringDescription().appendValue(_example_1).toString() + "\n", Should.<Set<Executable>>operator_doubleArrow(_set, _set_1));
    
  }
  
  public List<Executable> executables(final Executable spec) {
    return this.subject.getExecutables(spec);
  }
}
