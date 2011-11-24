package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.bmw.carit.jnario.spec.naming.JavaNameProvider;
import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.Field;
import de.bmw.carit.jnario.spec.spec.Function;
import de.bmw.carit.jnario.spec.spec.Member;
import de.bmw.carit.jnario.spec.spec.Parameter;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.resource.Xtend2Resource;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends AbstractModelInferrer {
  /**
   * conveninence API to build and initialize JvmTypes and their members.
   */
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private JavaNameProvider _javaNameProvider;
  
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  private TypesFactory _typesFactory;
  
  /**
   * Is called for each instance of the first argument's type contained in a resource.
   * 
   * @param element - the model to create one or more JvmDeclaredTypes from.
   * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
   *                   current resource.
   * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
   *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
   */
  protected void _infer(final SpecFile spec, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    EList<ExampleGroup> _elements = spec.getElements();
    for (final ExampleGroup exampleGroup : _elements) {
      {
        String _javaClassName = this._javaNameProvider.getJavaClassName(exampleGroup);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              {
                String _documentation = SpecJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(spec);
                SpecJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                String _packageName = spec.getPackageName();
                it.setPackageName(_packageName);
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(spec, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.JnarioRunner.class);
                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                SpecJvmModelInferrer.this.addAnnotations(it, exampleGroup);
                EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                String _javaClassAnnotationValue = SpecJvmModelInferrer.this._javaNameProvider.getJavaClassAnnotationValue(exampleGroup);
                JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(spec, de.bmw.carit.jnario.runner.Named.class, _javaClassAnnotationValue);
                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                EList<Member> _elements = exampleGroup.getElements();
                for (final Member element : _elements) {
                  final Member element_1 = element;
                  boolean matched = false;
                  if (!matched) {
                    if (element_1 instanceof Field) {
                      final Field element_2 = (Field) element_1;
                      matched=true;
                      {
                        String _name = element_2.getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name);
                        String _operator_plus = StringExtensions.operator_plus("create", _firstUpper);
                        final String initMethodName = _operator_plus;
                        String _name_1 = element_2.getName();
                        JvmTypeReference _type = element_2.getType();
                        JvmField _field = SpecJvmModelInferrer.this._jvmTypesBuilder.toField(element_2, _name_1, _type);
                        final JvmField field = _field;
                        EList<JvmMember> _members = it.getMembers();
                        CollectionExtensions.<JvmField>operator_add(_members, field);
                        XExpression _right = element_2.getRight();
                        final XExpression initCode = _right;
                        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(initCode, null);
                        if (_operator_notEquals) {
                          {
                            final Function1<ImportManager,String> _function = new Function1<ImportManager,String>() {
                                public String apply(final ImportManager im) {
                                  String _operator_plus = StringExtensions.operator_plus(initMethodName, "()");
                                  return _operator_plus;
                                }
                              };
                            SpecJvmModelInferrer.this._jvmTypesBuilder.initialization(field, _function);
                            EList<JvmMember> _members_1 = it.getMembers();
                            JvmTypeReference _expectedType = SpecJvmModelInferrer.this._iTypeProvider.getExpectedType(initCode);
                            final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                                public void apply(final JvmOperation it) {
                                  SpecJvmModelInferrer.this._jvmTypesBuilder.setBody(it, initCode);
                                }
                              };
                            JvmOperation _method = SpecJvmModelInferrer.this._jvmTypesBuilder.toMethod(initCode, initMethodName, _expectedType, _function_1);
                            CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
                          }
                        }
                        SpecJvmModelInferrer.this.addAnnotations(field, element_2);
                      }
                    }
                  }
                  if (!matched) {
                    if (element_1 instanceof Example) {
                      final Example element_3 = (Example) element_1;
                      matched=true;
                      {
                        String _exampleMethodName = SpecJvmModelInferrer.this._javaNameProvider.getExampleMethodName(element_3);
                        JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element_3);
                        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                            public void apply(final JvmOperation it) {
                              {
                                String _documentation = SpecJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element_3);
                                SpecJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                                String _name = element_3.getName();
                                JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(spec, de.bmw.carit.jnario.runner.Named.class, _name);
                                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                                EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                                JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(element_3, org.junit.Test.class);
                                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                                SpecJvmModelInferrer.this.addAnnotations(it, element_3);
                                XExpression _body = element_3.getBody();
                                SpecJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                              }
                            }
                          };
                        JvmOperation _method_1 = SpecJvmModelInferrer.this._jvmTypesBuilder.toMethod(element_3, _exampleMethodName, _typeForName, _function_2);
                        final JvmOperation method = _method_1;
                        EList<JvmTypeReference> _exceptions = method.getExceptions();
                        JvmTypeReference _typeForName_1 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Exception.class, element_3);
                        CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, _typeForName_1);
                        EList<JvmMember> _members_2 = it.getMembers();
                        CollectionExtensions.<JvmOperation>operator_add(_members_2, method);
                      }
                    }
                  }
                  if (!matched) {
                    if (element_1 instanceof Function) {
                      final Function element_4 = (Function) element_1;
                      matched=true;
                      {
                        JvmTypeReference _returnType = element_4.getReturnType();
                        JvmTypeReference returnType = _returnType;
                        String _name_2 = element_4.getName();
                        JvmTypeReference _returnType_1 = element_4.getReturnType();
                        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                            public void apply(final JvmOperation it) {
                              {
                                String _documentation = SpecJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element_4);
                                SpecJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                                EList<JvmTypeParameter> _typeParameters = element_4.getTypeParameters();
                                for (final JvmTypeParameter t : _typeParameters) {
                                  EList<JvmTypeParameter> _typeParameters_1 = it.getTypeParameters();
                                  CollectionExtensions.<JvmTypeParameter>operator_add(_typeParameters_1, t);
                                }
                                EList<Parameter> _parameters = element_4.getParameters();
                                for (final Parameter p : _parameters) {
                                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                                  String _name = p.getName();
                                  JvmTypeReference _parameterType = p.getParameterType();
                                  JvmFormalParameter _parameter = SpecJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                                  CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                                }
                                SpecJvmModelInferrer.this.addAnnotations(it, element_4);
                                XExpression _expression = element_4.getExpression();
                                SpecJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expression);
                                EList<JvmTypeReference> _exceptions = it.getExceptions();
                                JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Exception.class, element_4);
                                CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, _typeForName);
                              }
                            }
                          };
                        JvmOperation _method_2 = SpecJvmModelInferrer.this._jvmTypesBuilder.toMethod(element_4, _name_2, _returnType_1, _function_3);
                        final JvmOperation method_1 = _method_2;
                        EList<JvmMember> _members_3 = it.getMembers();
                        CollectionExtensions.<JvmOperation>operator_add(_members_3, method_1);
                      }
                    }
                  }
                }
              }
            }
          };
        JvmGenericType _class = this._jvmTypesBuilder.toClass(spec, _javaClassName, _function);
        final JvmGenericType newClass = _class;
        acceptor.accept(newClass);
        this.computeInferredReturnTypes(newClass);
      }
    }
  }
  
  public void addAnnotations(final JvmAnnotationTarget target, final Member member) {
      EList<XAnnotation> _annotations = member.getAnnotations();
      Iterable<XAnnotation> result = ((Iterable<XAnnotation>) _annotations);
      Member _annotationInfo = member.getAnnotationInfo();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_annotationInfo, null);
      if (_operator_notEquals) {
        Member _annotationInfo_1 = member.getAnnotationInfo();
        EList<XAnnotation> _annotations_1 = _annotationInfo_1.getAnnotations();
        Iterable<XAnnotation> _concat = Iterables.<XAnnotation>concat(result, _annotations_1);
        result = _concat;
      }
      this._jvmTypesBuilder.translateAnnotationsTo(result, target);
  }
  
  public void computeInferredReturnTypes(final JvmGenericType inferredJvmType) {
      Iterable<JvmOperation> _declaredOperations = inferredJvmType.getDeclaredOperations();
      Iterable<JvmOperation> operations = _declaredOperations;
      for (final JvmOperation jvmOperation : operations) {
        EReference _jvmOperation_ReturnType = TypesPackage.eINSTANCE.getJvmOperation_ReturnType();
        boolean _eIsSet = jvmOperation.eIsSet(_jvmOperation_ReturnType);
        boolean _operator_not = BooleanExtensions.operator_not(_eIsSet);
        if (_operator_not) {
          JvmParameterizedTypeReference _typeProxy = this.getTypeProxy(jvmOperation);
          jvmOperation.setReturnType(_typeProxy);
        }
      }
  }
  
  public JvmParameterizedTypeReference getTypeProxy(final EObject pointer) {
      JvmParameterizedTypeReference _createJvmParameterizedTypeReference = this._typesFactory.createJvmParameterizedTypeReference();
      JvmParameterizedTypeReference typeReference = _createJvmParameterizedTypeReference;
      Resource _eResource = pointer.eResource();
      final Resource eResource = _eResource;
      String _uRIFragment = eResource.getURIFragment(pointer);
      String fragment = _uRIFragment;
      URI _uRI = eResource.getURI();
      URI uri = _uRI;
      String _operator_plus = StringExtensions.operator_plus(Xtend2Resource.FRAGMENT_PREFIX, fragment);
      URI _appendFragment = uri.appendFragment(_operator_plus);
      uri = _appendFragment;
      InternalEObject internalEObject = ((InternalEObject) typeReference);
      internalEObject.eSetProxyURI(uri);
      return typeReference;
  }
  
  public void infer(final EObject spec, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (spec instanceof SpecFile) {
      _infer((SpecFile)spec, acceptor, isPrelinkingPhase);
    } else {
      _infer(spec, acceptor, isPrelinkingPhase);
    }
  }
}
