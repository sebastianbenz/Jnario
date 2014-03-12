package org.jnario.feature.tests.unit.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.jvmmodel.StepContextProvider;
import org.jnario.feature.tests.unit.jvmmodel.StepContextProviderUsedFieldsSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains(StepContextProviderUsedFieldsSpec.class)
@Named("StepContextProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class StepContextProviderSpec {
  @Subject
  public StepContextProvider subject;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore m;
  
  public Set<XtendField> fields(final String... names) {
    Set<XtendField> _xblockexpression = null;
    {
      final Set<String> expected = IterableExtensions.<String>toSet(((Iterable<String>)Conversions.doWrapArray(names)));
      Iterable<XtendField> _filter = Iterables.<XtendField>filter(this.m, XtendField.class);
      final Function1<XtendField,Boolean> _function = new Function1<XtendField,Boolean>() {
        public Boolean apply(final XtendField it) {
          String _name = it.getName();
          return Boolean.valueOf(expected.contains(_name));
        }
      };
      Iterable<XtendField> _filter_1 = IterableExtensions.<XtendField>filter(_filter, _function);
      _xblockexpression = (IterableExtensions.<XtendField>toSet(_filter_1));
    }
    return _xblockexpression;
  }
  
  public Set<XtendField> usedFields(final CharSequence content) {
    Set<XtendField> _xblockexpression = null;
    {
      this.m.parseScenario(content);
      final StepImplementation step = this.m.<StepImplementation>first(StepImplementation.class);
      _xblockexpression = (this.subject.usedFields(step));
    }
    return _xblockexpression;
  }
}
