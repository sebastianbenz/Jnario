package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.spec.naming.JavaNameProvider;
import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.resource.Xtend2Resource;
import org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendField;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;
import org.eclipse.xtext.xtend2.xtend2.XtendParameter;

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
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
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
      XtendClass _xtendClass = spec.getXtendClass();
      boolean _operator_equals = ObjectExtensions.operator_equals(_xtendClass, null);
      if (_operator_equals) {
        return;
      }
      XtendClass _xtendClass_1 = spec.getXtendClass();
      JvmGenericType _infer = this.infer(spec, ((ExampleGroup) _xtendClass_1), null, acceptor);
      this._extendedJvmTypesBuilder.<JvmGenericType>associate(spec, _infer);
  }
  
  public JvmGenericType infer(final SpecFile spec, final ExampleGroup exampleGroup, final JvmGenericType superClass, final IAcceptor<JvmDeclaredType> acceptor) {
      ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
      final List<JvmGenericType> subExamples = _newArrayList;
      String _javaClassName = this._javaNameProvider.getJavaClassName(exampleGroup);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(exampleGroup);
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
              String _package = spec.getPackage();
              it.setPackageName(_package);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.ExampleGroupRunner.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              String _describe = SpecJvmModelInferrer.this._javaNameProvider.describe(exampleGroup);
              JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Named.class, _describe);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
              SpecJvmModelInferrer.this.addAnnotations(it, exampleGroup);
              EList<XtendMember> _members = exampleGroup.getMembers();
              for (final XtendMember element : _members) {
                boolean matched = false;
                if (!matched) {
                  if (element instanceof XtendField) {
                    final XtendField _xtendField = (XtendField)element;
                    matched=true;
                    {
                      String _name = _xtendField.getName();
                      JvmTypeReference _type = _xtendField.getType();
                      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                          public void apply(final JvmField it) {
                            {
                              it.setVisibility(JvmVisibility.PROTECTED);
                              SpecJvmModelInferrer.this.addAnnotations(it, _xtendField);
                              XExpression _initialValue = _xtendField.getInitialValue();
                              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setInitializer(it, _initialValue);
                            }
                          }
                        };
                      JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(_xtendField, _name, _type, _function);
                      final JvmField field = _field;
                      EList<JvmMember> _members_1 = it.getMembers();
                      CollectionExtensions.<JvmField>operator_add(_members_1, field);
                    }
                  }
                }
                if (!matched) {
                  if (element instanceof ExampleGroup) {
                    final ExampleGroup _exampleGroup = (ExampleGroup)element;
                    matched=true;
                    JvmGenericType _infer = SpecJvmModelInferrer.this.infer(spec, _exampleGroup, it, acceptor);
                    CollectionExtensions.<JvmGenericType>operator_add(subExamples, _infer);
                  }
                }
                if (!matched) {
                  if (element instanceof Example) {
                    final Example _example = (Example)element;
                    matched=true;
                    {
                      String _exampleMethodName = SpecJvmModelInferrer.this._javaNameProvider.getExampleMethodName(_example);
                      JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, _example);
                      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                          public void apply(final JvmOperation it) {
                            {
                              String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(_example);
                              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
                              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                              String _describe = SpecJvmModelInferrer.this._javaNameProvider.describe(_example);
                              JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Named.class, _describe);
                              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                              JvmDeclaredType _exception = _example.getException();
                              boolean _operator_equals = ObjectExtensions.operator_equals(_exception, null);
                              if (_operator_equals) {
                                EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                                JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, org.junit.Test.class);
                                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                              } else {
                                EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
                                String _name = org.junit.Test.class.getName();
                                JvmDeclaredType _exception_1 = _example.getException();
                                JvmAnnotationReference _annotation_2 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, _name, "expected", _exception_1);
                                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_2);
                              }
                              SpecJvmModelInferrer.this.addAnnotations(it, _example);
                              XExpression _body = _example.getBody();
                              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _body);
                            }
                          }
                        };
                      JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(_example, _exampleMethodName, _typeForName, _function);
                      final JvmOperation method = _method;
                      JvmTypeReference _typeForName_1 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Exception.class, _example);
                      final JvmTypeReference anyException = _typeForName_1;
                      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(anyException, null);
                      if (_operator_notEquals) {
                        EList<JvmTypeReference> _exceptions = method.getExceptions();
                        CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, anyException);
                      }
                      EList<JvmMember> _members_1 = it.getMembers();
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, method);
                    }
                  }
                }
                if (!matched) {
                  if (element instanceof XtendFunction) {
                    final XtendFunction _xtendFunction = (XtendFunction)element;
                    matched=true;
                    {
                      JvmTypeReference _returnType = _xtendFunction.getReturnType();
                      JvmTypeReference returnType = _returnType;
                      boolean _operator_equals = ObjectExtensions.operator_equals(returnType, null);
                      if (_operator_equals) {
                        XExpression _expression = _xtendFunction.getExpression();
                        JvmTypeReference _expectedType = SpecJvmModelInferrer.this._iTypeProvider.getExpectedType(_expression);
                        returnType = _expectedType;
                      }
                      String _name = _xtendFunction.getName();
                      JvmTypeReference _returnType_1 = _xtendFunction.getReturnType();
                      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                          public void apply(final JvmOperation it) {
                            {
                              String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(_xtendFunction);
                              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
                              EList<JvmTypeParameter> _typeParameters = _xtendFunction.getTypeParameters();
                              for (final JvmTypeParameter t : _typeParameters) {
                                EList<JvmTypeParameter> _typeParameters_1 = it.getTypeParameters();
                                CollectionExtensions.<JvmTypeParameter>operator_add(_typeParameters_1, t);
                              }
                              EList<XtendParameter> _parameters = _xtendFunction.getParameters();
                              for (final XtendParameter p : _parameters) {
                                EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                                String _name = p.getName();
                                JvmTypeReference _parameterType = p.getParameterType();
                                JvmFormalParameter _parameter = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toParameter(p, _name, _parameterType);
                                CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                              }
                              SpecJvmModelInferrer.this.addAnnotations(it, _xtendFunction);
                              XExpression _expression = _xtendFunction.getExpression();
                              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _expression);
                              JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Exception.class, _xtendFunction);
                              final JvmTypeReference anyException = _typeForName;
                              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(anyException, null);
                              if (_operator_notEquals) {
                                EList<JvmTypeReference> _exceptions = it.getExceptions();
                                CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, anyException);
                              }
                            }
                          }
                        };
                      JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(_xtendFunction, _name, _returnType_1, _function);
                      final JvmOperation method = _method;
                      EList<JvmMember> _members_1 = it.getMembers();
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, method);
                    }
                  }
                }
              }
            }
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, superClass, _function);
      final JvmGenericType newClass = _class;
      acceptor.accept(newClass);
      boolean _isEmpty = subExamples.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        EList<JvmAnnotationReference> _annotations = newClass.getAnnotations();
        JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Contains.class, subExamples);
        CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
      }
      this.computeInferredReturnTypes(newClass);
      return newClass;
  }
  
  public void addAnnotations(final JvmAnnotationTarget target, final XtendMember member) {
      EList<XAnnotation> _annotations = member.getAnnotations();
      Iterable<XAnnotation> result = ((Iterable<XAnnotation>) _annotations);
      boolean _operator_and = false;
      EList<XAnnotation> _annotations_1 = member.getAnnotations();
      boolean _isEmpty = _annotations_1.isEmpty();
      if (!_isEmpty) {
        _operator_and = false;
      } else {
        XtendAnnotationTarget _annotationInfo = member.getAnnotationInfo();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_annotationInfo, null);
        _operator_and = BooleanExtensions.operator_and(_isEmpty, _operator_notEquals);
      }
      if (_operator_and) {
        XtendAnnotationTarget _annotationInfo_1 = member.getAnnotationInfo();
        EList<XAnnotation> _annotations_2 = _annotationInfo_1.getAnnotations();
        Iterable<XAnnotation> _concat = Iterables.<XAnnotation>concat(result, _annotations_2);
        result = _concat;
      }
      this._extendedJvmTypesBuilder.translateAnnotationsTo(result, target);
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
    } else if (spec != null) {
      _infer(spec, acceptor, isPrelinkingPhase);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(spec, acceptor, isPrelinkingPhase).toString());
    }
  }
}
