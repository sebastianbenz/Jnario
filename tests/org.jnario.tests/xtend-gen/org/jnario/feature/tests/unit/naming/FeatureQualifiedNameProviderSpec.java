package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.FeatureQualifiedNameProvider;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderPackageNameSpec;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderStepImplementationSpec;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderStepReferenceSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains({ FeatureQualifiedNameProviderPackageNameSpec.class, FeatureQualifiedNameProviderStepImplementationSpec.class, FeatureQualifiedNameProviderStepReferenceSpec.class })
@SuppressWarnings("all")
@Named("FeatureQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class FeatureQualifiedNameProviderSpec {
  @Subject
  public FeatureQualifiedNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  IQualifiedNameConverter converter;
  
  public String implementedStepName(final CharSequence s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(s, "");
    _builder.newLineIfNotEmpty();
    _builder.append("val x = \"\"");
    _builder.newLine();
    String _stepName = this.stepName(_builder);
    return _stepName;
  }
  
  public String stepName(final CharSequence s) {
    String _stepName = this.stepName(s, "myPackage");
    return _stepName;
  }
  
  public String stepName(final CharSequence s, final String packageName) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _notEquals = (!Objects.equal(packageName, null));
        if (_notEquals) {
          _builder.append("package ");
          _builder.append(packageName, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("Feature: MyFeature");
      _builder.newLine();
      _builder.append("Scenario: The Scenario");
      _builder.newLine();
      _builder.append(s, "");
      _builder.newLineIfNotEmpty();
      final CharSequence input = _builder;
      this._modelStore.parseScenario(input);
      Step _first = this._modelStore.<Step>first(Step.class);
      QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_first);
      String _string = this.converter.toString(_fullyQualifiedName);
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
