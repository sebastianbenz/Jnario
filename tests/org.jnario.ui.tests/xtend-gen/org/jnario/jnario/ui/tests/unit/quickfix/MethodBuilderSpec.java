package org.jnario.jnario.ui.tests.unit.quickfix;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.ui.tests.unit.quickfix.MethodBuilderJavaMethodBuilderSpec;
import org.jnario.jnario.ui.tests.unit.quickfix.MethodBuilderXtendMethodBuilderSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.ui.quickfix.MethodBuilderProvider;
import org.jnario.ui.quickfix.XtendMethodBuilder;
import org.junit.Assert;
import org.junit.runner.RunWith;

@Contains({ MethodBuilderXtendMethodBuilderSpec.class, MethodBuilderJavaMethodBuilderSpec.class })
@SuppressWarnings("all")
@Named("MethodBuilder")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class MethodBuilderSpec {
  @Inject
  @Extension
  public ModelStore m;
  
  @Inject
  MethodBuilderProvider builderProvider;
  
  XtendMethodBuilder builder;
  
  public void is(final String actual, final CharSequence expected) {
    String _string = expected.toString();
    Assert.assertEquals(_string, actual);
  }
  
  public String generatedMethod() {
    String _xblockexpression = null;
    {
      char _charAt = ".".charAt(0);
      ImportManager _importManager = new ImportManager(true, _charAt);
      final ImportManager importManager = _importManager;
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(importManager);
      final StringBuilderBasedAppendable content = _stringBuilderBasedAppendable;
      this.builder.build(content);
      String _string = content.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
