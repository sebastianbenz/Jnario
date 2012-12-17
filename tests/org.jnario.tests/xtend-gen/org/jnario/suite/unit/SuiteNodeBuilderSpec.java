package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SuiteNodeBuilderLevelSpec;
import org.jnario.suite.unit.SuiteNodeBuilderParentSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteNodeBuilderParentSpec.class, SuiteNodeBuilderLevelSpec.class })
@SuppressWarnings("all")
@Named("SuiteNodeBuilder")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SuiteNodeBuilderSpec {
  @Inject
  @Extension
  public ModelStore m;
  
  public Resource parseSuite(final CharSequence s) {
    Resource _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append(s, "");
      _builder.newLineIfNotEmpty();
      final CharSequence input = _builder;
      Resource _parseSuite = this.m.parseSuite(input);
      _xblockexpression = (_parseSuite);
    }
    return _xblockexpression;
  }
  
  public List<Suite> suites(final String... names) {
    final Function1<String,Suite> _function = new Function1<String,Suite>() {
        public Suite apply(final String it) {
          Suite _suite = SuiteNodeBuilderSpec.this.suite(it);
          return _suite;
        }
      };
    List<Suite> _map = ListExtensions.<String, Suite>map(((List<String>)Conversions.doWrapArray(names)), _function);
    return _map;
  }
  
  public Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = SuiteFactory.eINSTANCE.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
}
