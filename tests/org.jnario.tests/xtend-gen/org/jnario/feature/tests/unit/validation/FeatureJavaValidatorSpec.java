package org.jnario.feature.tests.unit.validation;

import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorFeaturesMustHaveDescriptionsSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorScenariosMustHaveDescriptionsSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorScenariosMustHaveDifferentNamesSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorStepsMustHaveDescriptionsSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Contains({ FeatureJavaValidatorFeaturesMustHaveDescriptionsSpec.class, FeatureJavaValidatorScenariosMustHaveDifferentNamesSpec.class, FeatureJavaValidatorScenariosMustHaveDescriptionsSpec.class, FeatureJavaValidatorStepsMustHaveDescriptionsSpec.class })
@SuppressWarnings("all")
@Named("FeatureJavaValidator")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class FeatureJavaValidatorSpec {
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("no name clash between features and imported types")
  @Order(1)
  public void _noNameClashBetweenFeaturesAndImportedTypes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Stack");
    _builder.newLine();
    _builder.append("Feature: Stack");
    _builder.newLine();
    _builder.append("Scenario: Example");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Stack stack");
    _builder.newLine();
    this.modelStore.parseScenario(_builder);
    AssertableDiagnostics _validate = this.validate(XtendFile.class);
    _validate.assertOK();
  }
  
  public AssertableDiagnostics select(final CharSequence input, final Class<? extends EObject> type) {
    AssertableDiagnostics _xblockexpression = null;
    {
      this.modelStore.parseScenario(input);
      AssertableDiagnostics _validate = this.validate(type);
      _xblockexpression = (_validate);
    }
    return _xblockexpression;
  }
  
  public void allOf(final CharSequence input, final Class<? extends EObject> type, final Procedure1<AssertableDiagnostics> test) {
    this.modelStore.parseScenario(input);
    Query _query = Query.query(this.modelStore);
    final Iterator<? extends EObject> steps = _query.allOf(type);
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
        public void apply(final EObject it) {
          final AssertableDiagnostics result = RegisteredValidatorTester.validateObj(it);
          test.apply(result);
        }
      };
    IteratorExtensions.forEach(steps, _function);
  }
  
  public AssertableDiagnostics validate(final Class<? extends EObject> type) {
    Query _query = Query.query(this.modelStore);
    final EObject target = _query.first(type);
    return RegisteredValidatorTester.validateObj(target);
  }
}
