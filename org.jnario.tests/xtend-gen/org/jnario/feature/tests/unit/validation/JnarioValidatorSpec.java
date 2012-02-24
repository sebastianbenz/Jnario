package org.jnario.feature.tests.unit.validation;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(ExampleGroupRunner.class)
@Named("JnarioValidator")
@InstantiateWith(SpecTestInstantiator.class)
public class JnarioValidatorSpec {
  @Inject
  protected ModelStore modelStore;
  
  @Test
  @Named("returns an error if a step definition and a reference to this step are in the same scenario")
  @Order(1)
  public void returnsAnErrorIfAStepDefinitionAndAReferenceToThisStepAreInTheSameScenario() throws Exception {
      this.modelStore.parseScenario("\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tFeature: Validation\r\n\t\t\t\tScenario: step definition and usage\r\n\t\t\t\t\tGiven some step\r\n\t\t\t\t\t\tvar x = 3\r\n\t\t\t\t\t\tx = 5\r\n\t\t\t\t\tGiven some step\r\n\t\t");
      AssertableDiagnostics _validate = this.validate(org.jnario.feature.feature.GivenReference.class);
      final AssertableDiagnostics validationResult = _validate;
      validationResult.assertErrorContains("Cannot reference a step");
  }
  
  @Test
  @Named("does not return an error if a step definition was in a different scenario than the reference")
  @Order(2)
  public void doesNotReturnAnErrorIfAStepDefinitionWasInADifferentScenarioThanTheReference() throws Exception {
      this.modelStore.parseScenario("\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tFeature: Validation\r\n\t\t\t\tScenario: step definition and usage\r\n\t\t\t\t\tGiven some step\r\n\t\t\t\t\t\tvar x = 3\r\n\t\t\t\t\t\tx = 5\r\n\t\t\t\tScenario: other scenario\r\n\t\t\t\t\tGiven some step\r\n\t\t");
      AssertableDiagnostics _validate = this.validate(org.jnario.feature.feature.GivenReference.class);
      final AssertableDiagnostics validationResult = _validate;
      validationResult.assertOK();
  }
  
  public AssertableDiagnostics validate(final Class<? extends EObject> type) {
      Query _query = Query.query(this.modelStore);
      EObject _first = _query.first(type);
      final EObject target = _first;
      AssertableDiagnostics _validateObj = RegisteredValidatorTester.validateObj(target);
      return _validateObj;
  }
}
