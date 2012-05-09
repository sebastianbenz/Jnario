package org.jnario.spec.tests.unit.naming;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.naming.OperationNameProvider;
import org.jnario.spec.tests.unit.naming.OperationNamesExample;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("OperationNameProvider")
@InstantiateWith(value = SpecTestInstantiator.class)
public class OperationNameProviderSpec {
  @Inject
  OperationNameProvider subject;
  
  @Inject
  TypeReferences typeReferences;
  
  Map<String,JvmOperation> operations;
  
  @Test
  @Named("should name methods similar to JavaDoc links")
  @Order(99)
  public void shouldNameMethodsSimilarToJavaDocLinks() throws Exception {
    String _nameOf = this.nameOf("simpleOperation");
    Should.operator_doubleArrow(_nameOf, "simpleOperation");
    String _nameOf_1 = this.nameOf("operationWithSingleArgument");
    Should.operator_doubleArrow(_nameOf_1, "operationWithSingleArgument(String)");
    String _nameOf_2 = this.nameOf("operationWithMultipleArguments");
    Should.operator_doubleArrow(_nameOf_2, "operationWithMultipleArguments(String, Object, int)");
    String _nameOf_3 = this.nameOf("operationWithTypedArguments");
    Should.operator_doubleArrow(_nameOf_3, "operationWithTypedArguments(List<String>, List<? extends String>)");
    String _nameOf_4 = this.nameOf("operationWithVarArg");
    Should.operator_doubleArrow(_nameOf_4, "operationWithVarArg(String[])");
  }
  
  @Before
  public void setup() {
    final Class<OperationNamesExample> contextType = OperationNamesExample.class;
    XtextResourceSet _xtextResourceSet = new XtextResourceSet();
    URI _createURI = URI.createURI("dummy.spec");
    final Resource r = _xtextResourceSet.createResource(_createURI);
    final EObject eObject = EcoreFactory.eINSTANCE.createEObject();
    EList<EObject> _contents = r.getContents();
    _contents.add(eObject);
    JvmType _findDeclaredType = this.typeReferences.findDeclaredType(contextType, eObject);
    final JvmGenericType type = ((JvmGenericType) _findDeclaredType);
    EList<JvmMember> _members = type.getMembers();
    final Iterable<JvmOperation> jvmOperations = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Function1<JvmOperation,String> _function = new Function1<JvmOperation,String>() {
        public String apply(final JvmOperation it) {
          String _simpleName = it.getSimpleName();
          return _simpleName;
        }
      };
    Map<String,JvmOperation> _map = IterableExtensions.<String, JvmOperation>toMap(jvmOperations, _function);
    this.operations = _map;
  }
  
  public String nameOf(final String operationName) {
    String _xblockexpression = null;
    {
      final JvmOperation op = this.operations.get(operationName);
      QualifiedName _apply = this.subject.apply(op);
      String _string = _apply.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
