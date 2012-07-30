package org.jnario.jnario.tests.unit;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.unit.MethodBuilderJavaMethodBuilderSpec;
import org.jnario.jnario.tests.unit.MethodBuilderXtendMethodBuilderSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.ui.quickfix.XtendMethodBuilder;
import org.junit.Assert;
import org.junit.runner.RunWith;

@Contains({ MethodBuilderXtendMethodBuilderSpec.class, MethodBuilderJavaMethodBuilderSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("MethodBuilder")
@CreateWith(value = SpecTestCreator.class)
public class MethodBuilderSpec {
  @Inject
  @Extension
  public ModelStore m;
  
  XtendMethodBuilder subject;
  
  public void setContext(final CharSequence s) {
    this.m.parseSpec(s);
    XAbstractFeatureCall _first = this.m.<XAbstractFeatureCall>first(XAbstractFeatureCall.class);
    this.subject.setFeatureCall(_first);
  }
  
  public void is(final String actual, final CharSequence expected) {
    String _string = expected.toString();
    Assert.assertEquals(_string, actual);
  }
  
  public String generatedMethod() {
    String _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      final StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      this.subject.build(appendable);
      String _string = appendable.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
