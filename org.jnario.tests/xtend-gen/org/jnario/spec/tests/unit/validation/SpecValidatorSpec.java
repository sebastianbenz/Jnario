package org.jnario.spec.tests.unit.validation;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.jnario.Assertion;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SpecValidator")
@InstantiateWith(value = SpecTestInstantiator.class)
public class SpecValidatorSpec {
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("assert statement must be boolean")
  @Order(99)
  public void assertStatementMustBeBoolean() throws Exception {
    this.modelStore.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tfact \"invalid assert\"{\r\n\t\t\t\t\tassert 1\r\n\t\t\t\t}\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(Assertion.class);
    validationResult.assertErrorContains("invalid type");
  }
  
  @Test
  @Named("example table values must not be void")
  @Order(99)
  public void exampleTableValuesMustNotBeVoid() throws Exception {
    this.modelStore.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tdef examples{\r\n\t\t\t\t\t| a         |\r\n\t\t\t\t\t| throw new Exception() |\r\n\t\t\t\t}\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleRow.class);
    validationResult.assertErrorContains("void");
  }
  
  @Test
  @Named("example table rows must have the same size")
  @Order(99)
  public void exampleTableRowsMustHaveTheSameSize() throws Exception {
    this.modelStore.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\"{\r\n\t\t\t\tdef examples{\r\n\t\t\t\t\t| a | b |\r\n\t\t\t\t\t| 0 |\r\n\t\t\t\t}\r\n\t\t\t} \r\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleTable.class);
    validationResult.assertErrorContains("number");
  }
  
  public AssertableDiagnostics validate(final Class<? extends EObject> type) {
    Query _query = Query.query(this.modelStore);
    final EObject target = _query.first(type);
    return RegisteredValidatorTester.validateObj(target);
  }
}
