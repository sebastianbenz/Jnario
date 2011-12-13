package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.After;
import de.bmw.carit.jnario.spec.spec.Before;
import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import de.bmw.carit.jnario.spec.spec.TestFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
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
  private ExampleNameProvider _exampleNameProvider;
  
  public void infer(final EObject e, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
      boolean _operator_not = BooleanExtensions.operator_not((e instanceof SpecFile));
      if (_operator_not) {
        return;
      }
      final SpecFile specFile = ((SpecFile) e);
      XtendClass _xtendClass = specFile.getXtendClass();
      boolean _operator_equals = ObjectExtensions.operator_equals(_xtendClass, null);
      if (_operator_equals) {
        return;
      }
      XtendClass _xtendClass_1 = specFile.getXtendClass();
      this.transform(((SpecFile) specFile), ((ExampleGroup) _xtendClass_1), null, isPrelinkingPhase);
  }
  
  public JvmGenericType transform(final SpecFile spec, final ExampleGroup exampleGroup, final JvmGenericType superClass, final boolean isPrelinkingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
      final List<JvmGenericType> subExamples = _newArrayList;
      String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleGroup);
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
              String _describe = SpecJvmModelInferrer.this._exampleNameProvider.describe(exampleGroup);
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
                    JvmGenericType _transform = SpecJvmModelInferrer.this.transform(spec, _exampleGroup, it, isPrelinkingPhase);
                    CollectionExtensions.<JvmGenericType>operator_add(subExamples, _transform);
                  }
                }
                if (!matched) {
                  if (element instanceof Example) {
                    final Example _example = (Example)element;
                    matched=true;
                    {
                      ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList();
                      final ArrayList<JvmAnnotationReference> annotations = _newArrayList;
                      JvmDeclaredType _exception = _example.getException();
                      boolean _operator_equals = ObjectExtensions.operator_equals(_exception, null);
                      if (_operator_equals) {
                        JvmAnnotationReference _annotation_2 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, org.junit.Test.class);
                        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_2);
                      } else {
                        String _name = org.junit.Test.class.getName();
                        JvmDeclaredType _exception_1 = _example.getException();
                        JvmAnnotationReference _annotation_3 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, _name, "expected", _exception_1);
                        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_3);
                      }
                      String _describe_1 = SpecJvmModelInferrer.this._exampleNameProvider.describe(_example);
                      JvmAnnotationReference _annotation_4 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, de.bmw.carit.jnario.runner.Named.class, _describe_1);
                      CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_4);
                      EList<JvmMember> _members_1 = it.getMembers();
                      JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_example, annotations);
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
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
                if (!matched) {
                  if (element instanceof Before) {
                    final Before _before = (Before)element;
                    matched=true;
                    {
                      Class<?> annotationType = org.junit.Before.class;
                      boolean isStatic = false;
                      boolean _isBeforeAll = _before.isBeforeAll();
                      if (_isBeforeAll) {
                        {
                          annotationType = org.junit.BeforeClass.class;
                          isStatic = true;
                        }
                      }
                      EList<JvmMember> _members_1 = it.getMembers();
                      JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_before, annotationType, isStatic);
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
                    }
                  }
                }
                if (!matched) {
                  if (element instanceof After) {
                    final After _after = (After)element;
                    matched=true;
                    {
                      Class<?> annotationType = org.junit.After.class;
                      boolean isStatic = false;
                      boolean _isAfterAll = _after.isAfterAll();
                      if (_isAfterAll) {
                        {
                          annotationType = org.junit.AfterClass.class;
                          isStatic = true;
                        }
                      }
                      EList<JvmMember> _members_1 = it.getMembers();
                      JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_after, annotationType, isStatic);
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
                    }
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
              SpecJvmModelInferrer.this.addImplicitSubject(it, exampleGroup);
            }
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, superClass, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public JvmOperation toMethod(final TestFunction element, final Class<?> annotation, final boolean isStatic) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(element, annotation);
      ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList(_annotation);
      JvmOperation _method = this.toMethod(element, _newArrayList);
      final JvmOperation result = _method;
      result.setStatic(isStatic);
      return result;
  }
  
  public JvmOperation toMethod(final TestFunction element, final List<JvmAnnotationReference> annotations) {
    String _methodName = this._exampleNameProvider.toMethodName(element);
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, element);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          {
            String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(element);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
            XExpression _body = element.getBody();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _body);
            EList<XAnnotation> _annotations = element.getAnnotations();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations, it);
            EList<JvmTypeReference> _exceptions = it.getExceptions();
            JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Exception.class, element);
            CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, _typeForName);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            _annotations_1.addAll(annotations);
          }
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(element, _methodName, _typeForName, _function);
    return _method;
  }
  
  public void addImplicitSubject(final JvmGenericType type, final ExampleGroup exampleGroup) {
      JvmDeclaredType _targetType = exampleGroup.getTargetType();
      final JvmDeclaredType targetType = _targetType;
      boolean _operator_equals = ObjectExtensions.operator_equals(targetType, null);
      if (_operator_equals) {
        return;
      }
      boolean _eIsProxy = targetType.eIsProxy();
      if (_eIsProxy) {
        return;
      }
      boolean _hasSubject = this.hasSubject(type);
      if (_hasSubject) {
        return;
      }
      boolean _neverUsesSubject = this.neverUsesSubject(exampleGroup);
      if (_neverUsesSubject) {
        return;
      }
      EList<JvmMember> _members = type.getMembers();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(targetType);
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            {
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Subject.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              it.setVisibility(JvmVisibility.PUBLIC);
            }
          }
        };
      JvmField _field = this._extendedJvmTypesBuilder.toField(exampleGroup, "subject", _createTypeRef, _function);
      _members.add(0, _field);
  }
  
  public boolean hasSubject(final JvmGenericType type) {
    EList<JvmMember> _members = type.getMembers();
    Iterable<JvmField> _filter = IterableExtensions.<JvmField>filter(_members, org.eclipse.xtext.common.types.JvmField.class);
    final Function1<JvmField,Boolean> _function = new Function1<JvmField,Boolean>() {
        public Boolean apply(final JvmField it) {
          String _simpleName = it.getSimpleName();
          boolean _operator_equals = ObjectExtensions.operator_equals(_simpleName, "subject");
          return Boolean.valueOf(_operator_equals);
        }
      };
    JvmField _findFirst = IterableExtensions.<JvmField>findFirst(_filter, _function);
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_findFirst, null);
    return _operator_notEquals;
  }
  
  public boolean neverUsesSubject(final ExampleGroup exampleGroup) {
    boolean _xblockexpression = false;
    {
      TreeIterator<EObject> _eAllContents = exampleGroup.eAllContents();
      Iterator<XMemberFeatureCall> _filter = IteratorExtensions.<XMemberFeatureCall>filter(_eAllContents, org.eclipse.xtext.xbase.XMemberFeatureCall.class);
      final Iterator<XMemberFeatureCall> allFeatureCalls = _filter;
      final Function1<XMemberFeatureCall,Boolean> _function = new Function1<XMemberFeatureCall,Boolean>() {
          public Boolean apply(final XMemberFeatureCall call) {
            {
              XExpression _memberCallTarget = call.getMemberCallTarget();
              boolean _operator_equals = ObjectExtensions.operator_equals(_memberCallTarget, null);
              if (_operator_equals) {
                return Boolean.valueOf(false);
              }
              XExpression _memberCallTarget_1 = call.getMemberCallTarget();
              boolean _operator_not = BooleanExtensions.operator_not((_memberCallTarget_1 instanceof XFeatureCall));
              if (_operator_not) {
                return Boolean.valueOf(false);
              }
              XExpression _memberCallTarget_2 = call.getMemberCallTarget();
              final XFeatureCall featureCall = ((XFeatureCall) _memberCallTarget_2);
              String _concreteSyntaxFeatureName = featureCall.getConcreteSyntaxFeatureName();
              boolean _operator_equals_1 = ObjectExtensions.operator_equals(_concreteSyntaxFeatureName, "subject");
              return Boolean.valueOf(_operator_equals_1);
            }
          }
        };
      XMemberFeatureCall _findFirst = IteratorExtensions.<XMemberFeatureCall>findFirst(allFeatureCalls, _function);
      boolean _operator_equals = ObjectExtensions.operator_equals(null, _findFirst);
      _xblockexpression = (_operator_equals);
    }
    return _xblockexpression;
  }
}
