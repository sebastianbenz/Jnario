package org.jnario.spec.tests.unit.validation;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.jnario.Assertion;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.Resources;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SpecJavaValidator")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class SpecJavaValidatorSpec {
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("assert statement must be boolean")
  @Order(1)
  public void _assertStatementMustBeBoolean() throws Exception {
    this.modelStore.parseSpec("\n\t\t\tpackage bootstrap\n\n\t\t\tdescribe \"Example\"{\n\t\t\t\tfact \"invalid assert\"{\n\t\t\t\t\tassert 1\n\t\t\t\t}\n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(Assertion.class);
    validationResult.assertErrorContains("invalid type");
  }
  
  @Test
  @Named("duplicate names of example methods are ignored")
  @Order(2)
  public void _duplicateNamesOfExampleMethodsAreIgnored() throws Exception {
    this.modelStore.parseSpec("\n\t\t\tpackage bootstrap\n\n\t\t\tdescribe \"Example\"{\n\t\t\t\tfact \"a***\" \n      \t\t\tfact \"a???\" \n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    validationResult.assertOK();
  }
  
  @Test
  @Named("specs without description but different types are OK")
  @Order(3)
  public void _specsWithoutDescriptionButDifferentTypesAreOK() throws Exception {
    this.modelStore.parseSpec("\n\t\t  package bootstrap\n\n\t\t  describe \"something\"{\n\t\t\t  describe String{\n\t\t\t  }\n\t\t\t  describe Integer{\n\t\t\t  }\t\n\t\t  }\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    validationResult.assertOK();
  }
  
  @Test
  @Named("specs with different method contexts are OK")
  @Order(4)
  public void _specsWithDifferentMethodContextsAreOK() throws Exception {
    this.modelStore.parseSpec("\n\t\t\timport java.util.Stack\n\t\t  \tdescribe Stack{\n\t\t\t\tcontext push(E){\n\t\t\t\t}\n\t\t\t\tcontext push{\n\t\t\t\t}\n\t\t\t}  \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    validationResult.assertOK();
  }
  
  @Test
  @Named("specs without description and same types are not OK")
  @Order(5)
  public void _specsWithoutDescriptionAndSameTypesAreNotOK() throws Exception {
    this.modelStore.parseSpec("\n\t\t  package bootstrap\n\n\t\t  describe \"something\"{\n\t\t\t  describe String{\n\t\t\t  }\n\t\t\t  describe String{\n\t\t\t  }\t\n\t\t  }\n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleGroup.class);
    validationResult.assertErrorContains("The spec \'String\' is already defined.");
  }
  
  @Test
  @Named("example table values must not be void")
  @Order(6)
  public void _exampleTableValuesMustNotBeVoid() throws Exception {
    this.modelStore.parseSpec("\n\t\t\tpackage bootstrap\n\n\t\t\tdescribe \"Example\"{\n\t\t\t\tdef examples{\n\t\t\t\t\t| a         |\n\t\t\t\t\t| throw new Exception() |\n\t\t\t\t}\n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleRow.class);
    validationResult.assertErrorContains("void");
  }
  
  @Test
  @Named("example table rows must have the same size")
  @Order(7)
  public void _exampleTableRowsMustHaveTheSameSize() throws Exception {
    this.modelStore.parseSpec("\n\t\t\tpackage bootstrap\n\n\t\t\tdescribe \"Example\"{\n\t\t\t\tdef examples{\n\t\t\t\t\t| a | b |\n\t\t\t\t\t| 0 |\n\t\t\t\t}\n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(ExampleTable.class);
    validationResult.assertErrorContains("number");
  }
  
  @Test
  @Named("should can compare objects of the same type")
  @Order(8)
  public void _shouldCanCompareObjectsOfTheSameType() throws Exception {
    this.modelStore.parseSpec("\n\t\t\tdescribe \"Example\"{\n\t\t\t\tfact 1 => 1\n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(XBinaryOperation.class);
    validationResult.assertOK();
  }
  
  @Test
  @Named("should can compare object with a class")
  @Order(9)
  public void _shouldCanCompareObjectWithAClass() throws Exception {
    this.modelStore.parseSpec("\n\t\t\tdescribe \"Example\"{\n\t\t\t\tfact 1 => typeof(int)\n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(XBinaryOperation.class);
    validationResult.assertOK();
  }
  
  @Test
  @Named("should can compare with matcher")
  @Order(10)
  public void _shouldCanCompareWithMatcher() throws Exception {
    this.modelStore.parseSpec("\n\t\t\timport static org.hamcrest.CoreMatchers.*\n\t\t\tdescribe \"Example\"{\n\t\t\t\tfact 1 => notNullValue\n\t\t\t} \n\t\t");
    final AssertableDiagnostics validationResult = this.validate(XBinaryOperation.class);
    validationResult.assertOK();
  }
  
  public AssertableDiagnostics validate(final Class<? extends EObject> type) {
    XtextResourceSet _resourceSet = this.modelStore.getResourceSet();
    Resources.addContainerStateAdapter(_resourceSet);
    Query _query = Query.query(this.modelStore);
    final EObject target = _query.first(type);
    return RegisteredValidatorTester.validateObj(target);
  }
}
