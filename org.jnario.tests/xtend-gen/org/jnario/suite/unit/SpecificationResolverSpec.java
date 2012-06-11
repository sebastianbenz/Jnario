package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.Specification;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestInstantiator;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SpecificationResolver;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SpecificationResolverEvaluatesRegularExpressionsSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@Contains(SpecificationResolverEvaluatesRegularExpressionsSpec.class)
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SpecificationResolver")
@InstantiateWith(value = SuiteTestInstantiator.class)
public class SpecificationResolverSpec {
  @Subject
  public SpecificationResolver subject;
  
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
  @Order(99)
  public void resolvesReferencedSpecs() throws Exception {
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
    Set<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = JnarioCollectionLiterals.<String>set("My Spec", "My Feature");
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _set);
    Assert.assertTrue("\nExpected resolvedSpecs(firstSuite) => set(\"My Spec\", \"My Feature\") but"
     + "\n     resolvedSpecs(firstSuite) is " + _resolvedSpecs
     + "\n     firstSuite is " + _firstSuite
     + "\n     set(\"My Spec\", \"My Feature\") is " + _set + "\n", _doubleArrow);
    
  }
  
  public Set<String> resolvedSpecs(final Suite suite) {
    List<Specification> _resolveSpecs = this.subject.resolveSpecs(suite);
    final Function1<Specification,String> _function = new Function1<Specification,String>() {
        public String apply(final Specification it) {
          String _name = it.getName();
          return _name;
        }
      };
    List<String> _map = ListExtensions.<Specification, String>map(_resolveSpecs, _function);
    Set<String> _set = IterableExtensions.<String>toSet(_map);
    return _set;
  }
}
