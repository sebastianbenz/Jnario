package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.hamcrest.StringDescription;
import org.jnario.Specification;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SpecResolverEvaluatesRegularExpressionsSpec;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@Contains(SpecResolverEvaluatesRegularExpressionsSpec.class)
@SuppressWarnings("all")
@Named("SpecResolver")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SpecResolverSpec {
  @Subject
  public SpecResolver subject;
  
  @Inject
  @Extension
  public ModelStore m;
  
  @Inject
  @Extension
  public SuiteClassNameProvider _suiteClassNameProvider;
  
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
  @Named("resolves referenced specs")
  @Order(1)
  public void _resolvesReferencedSpecs() throws Exception {
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
    Suite _firstSuite = this.m.firstSuite();
    List<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = IterableExtensions.<String>toSet(_resolvedSpecs);
    Set<String> _set_1 = JnarioCollectionLiterals.<String>set("MySpecSpec", "MyFeatureFeature");
    boolean _doubleArrow = Should.operator_doubleArrow(_set, _set_1);
    Assert.assertTrue("\nExpected resolvedSpecs(firstSuite).toSet => set(\"MySpecSpec\", \"MyFeatureFeature\") but"
     + "\n     resolvedSpecs(firstSuite).toSet is " + new StringDescription().appendValue(_set).toString()
     + "\n     resolvedSpecs(firstSuite) is " + new StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     firstSuite is " + new StringDescription().appendValue(_firstSuite).toString()
     + "\n     set(\"MySpecSpec\", \"MyFeatureFeature\") is " + new StringDescription().appendValue(_set_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("filters unresolved specs")
  @Order(2)
  public void _filtersUnresolvedSpecs() throws Exception {
    SpecReference _specReference = Suites.specReference(null);
    SpecReference _specReference_1 = Suites.specReference(null);
    final Suite suite = Suites.suiteWith("A Suite", _specReference, _specReference_1);
    List<String> _resolvedSpecs = this.resolvedSpecs(suite);
    List<?> _emptyList = CollectionLiterals.emptyList();
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _emptyList);
    Assert.assertTrue("\nExpected suite.resolvedSpecs => emptyList but"
     + "\n     suite.resolvedSpecs is " + new StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     suite is " + new StringDescription().appendValue(suite).toString()
     + "\n     emptyList is " + new StringDescription().appendValue(_emptyList).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("ignores specs without name")
  @Order(3)
  public void _ignoresSpecsWithoutName() throws Exception {
    final ExampleGroup specWithoutName = Specs.exampleGroup(null);
    SpecReference _specReference = Suites.specReference(specWithoutName);
    final Suite suite = Suites.suiteWith("A Suite", _specReference);
    List<Specification> _resolveSpecs = this.subject.resolveSpecs(suite);
    List<ExampleGroup> _list = JnarioCollectionLiterals.<ExampleGroup>list(specWithoutName);
    boolean _doubleArrow = Should.operator_doubleArrow(_resolveSpecs, _list);
    Assert.assertTrue("\nExpected subject.resolveSpecs(suite) => list(specWithoutName) but"
     + "\n     subject.resolveSpecs(suite) is " + new StringDescription().appendValue(_resolveSpecs).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     suite is " + new StringDescription().appendValue(suite).toString()
     + "\n     list(specWithoutName) is " + new StringDescription().appendValue(_list).toString()
     + "\n     specWithoutName is " + new StringDescription().appendValue(specWithoutName).toString() + "\n", _doubleArrow);
    
  }
  
  public List<String> resolvedSpecs(final Suite suite) {
    List<Specification> _resolveSpecs = this.subject.resolveSpecs(suite);
    final Function1<Specification,String> _function = new Function1<Specification,String>() {
        public String apply(final Specification it) {
          String _javaClassName = SpecResolverSpec.this._suiteClassNameProvider.toJavaClassName(it);
          return _javaClassName;
        }
      };
    List<String> _map = ListExtensions.<Specification, String>map(_resolveSpecs, _function);
    List<String> _list = IterableExtensions.<String>toList(_map);
    return _list;
  }
}
