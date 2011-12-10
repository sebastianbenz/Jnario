package de.bmw.carit.jnario.spec.jvmmodel;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendField;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends Xtend2JvmModelInferrer {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private JavaNameProvider _javaNameProvider;
  
  protected void _infer(final EObject e, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
    EList<EObject> _eContents = e.eContents();
    for (final EObject child : _eContents) {
      this.infer(child, acceptor, prelinkingPhase);
    }
  }
  
  protected void _infer(final SpecFile spec, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
      XtendClass _xtendClass = spec.getXtendClass();
      boolean _operator_equals = ObjectExtensions.operator_equals(_xtendClass, null);
      if (_operator_equals) {
        return;
      }
      XtendClass _xtendClass_1 = spec.getXtendClass();
      this.infer(spec, ((ExampleGroup) _xtendClass_1), null, isPrelinkingPhase);
  }
  
  public JvmGenericType infer(final SpecFile spec, final ExampleGroup exampleGroup, final JvmGenericType superClass, final boolean isPrelinkingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
      final List<JvmGenericType> subExamples = _newArrayList;
      String _javaClassName = this._javaNameProvider.getJavaClassName(exampleGroup);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              Resource _eResource = spec.eResource();
              EList<EObject> _contents = _eResource.getContents();
              CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
              String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(exampleGroup);
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
              String _package = spec.getPackage();
              it.setPackageName(_package);
              if (isPrelinkingPhase) {
                return;
              }
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.ExampleGroupRunner.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              String _describe = SpecJvmModelInferrer.this._javaNameProvider.describe(exampleGroup);
              JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Named.class, _describe);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
              EList<XAnnotation> _annotations_2 = exampleGroup.getAnnotations();
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations_2, it);
              EList<XtendMember> _members = exampleGroup.getMembers();
              for (final XtendMember element : _members) {
                boolean matched = false;
                if (!matched) {
                  if (element instanceof XtendField) {
                    final XtendField _xtendField = (XtendField)element;
                    matched=true;
                    {
                      _xtendField.setVisibility(JvmVisibility.PROTECTED);
                      SpecJvmModelInferrer.this.transform(_xtendField, it);
                    }
                  }
                }
                if (!matched) {
                  if (element instanceof ExampleGroup) {
                    final ExampleGroup _exampleGroup = (ExampleGroup)element;
                    matched=true;
                    JvmGenericType _infer = SpecJvmModelInferrer.this.infer(spec, _exampleGroup, it, isPrelinkingPhase);
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
                              EList<XAnnotation> _annotations_3 = _example.getAnnotations();
                              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations_3, it);
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
                    SpecJvmModelInferrer.this.transform(_xtendFunction, it);
                  }
                }
              }
              boolean _isEmpty = subExamples.isEmpty();
              boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
              if (_operator_not) {
                EList<JvmAnnotationReference> _annotations_3 = it.getAnnotations();
                JvmAnnotationReference _annotation_2 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Contains.class, subExamples);
                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_3, _annotation_2);
              }
              SpecJvmModelInferrer.this.computeInferredReturnTypes(it);
            }
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, superClass, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
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
