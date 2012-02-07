package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.spec.jvmmodel.ImplicitSubject;
import de.bmw.carit.jnario.spec.jvmmodel.SpecAnnotationProvider;
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.After;
import de.bmw.carit.jnario.spec.spec.Before;
import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import de.bmw.carit.jnario.spec.spec.TestFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendField;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends Xtend2JvmModelInferrer {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  private SpecAnnotationProvider annotationProvider;
  
  @Inject
  private ImplicitSubject _implicitSubject;
  
  @Inject
  private IJvmModelAssociations _iJvmModelAssociations;
  
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
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(superClass, null);
              if (_operator_notEquals) {
                EList<JvmTypeReference> _superTypes = it.getSuperTypes();
                JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(superClass);
                CollectionExtensions.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
              }
              if (isPrelinkingPhase) {
                return;
              }
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              Pair<Class<RunWith>,Class<ExampleGroupRunner>> _runnerAnnotation = SpecJvmModelInferrer.this.annotationProvider.getRunnerAnnotation();
              Class<RunWith> _key = _runnerAnnotation.getKey();
              Pair<Class<RunWith>,Class<ExampleGroupRunner>> _runnerAnnotation_1 = SpecJvmModelInferrer.this.annotationProvider.getRunnerAnnotation();
              Class<ExampleGroupRunner> _value = _runnerAnnotation_1.getValue();
              JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, _key, _value);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              String _describe = SpecJvmModelInferrer.this._exampleNameProvider.describe(exampleGroup);
              JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Named.class, _describe);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
              EList<XAnnotation> _annotations_2 = exampleGroup.getAnnotations();
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations_2, it);
              EList<XtendMember> _members = exampleGroup.getMembers();
              Iterable<XtendField> _filter = IterableExtensions.<XtendField>filter(_members, org.eclipse.xtext.xtend2.xtend2.XtendField.class);
              for (final XtendField field : _filter) {
                {
                  field.setVisibility(JvmVisibility.PROTECTED);
                  SpecJvmModelInferrer.this.transform(field, it);
                }
              }
              SpecJvmModelInferrer.this._implicitSubject.addImplicitSubject(it, exampleGroup);
              int index = 0;
              EList<XtendMember> _members_1 = exampleGroup.getMembers();
              for (final XtendMember element : _members_1) {
                {
                  boolean matched = false;
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
                        ArrayList<JvmAnnotationReference> _testAnnotations = SpecJvmModelInferrer.this.annotationProvider.getTestAnnotations(_example);
                        final ArrayList<JvmAnnotationReference> annotations = _testAnnotations;
                        String _describe_1 = SpecJvmModelInferrer.this._exampleNameProvider.describe(_example);
                        JvmAnnotationReference _annotation_2 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, de.bmw.carit.jnario.runner.Named.class, _describe_1);
                        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_2);
                        JvmAnnotationReference _annotation_3 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, de.bmw.carit.jnario.runner.Order.class, Integer.valueOf(index));
                        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_3);
                        EList<JvmMember> _members_2 = it.getMembers();
                        JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_example, annotations);
                        CollectionExtensions.<JvmOperation>operator_add(_members_2, _method);
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
                        Class<?> _beforeAnnotation = SpecJvmModelInferrer.this.annotationProvider.getBeforeAnnotation(_before);
                        final Class<?> annotationType = _beforeAnnotation;
                        EList<JvmMember> _members_2 = it.getMembers();
                        boolean _isBeforeAll = _before.isBeforeAll();
                        JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_before, annotationType, _isBeforeAll);
                        CollectionExtensions.<JvmOperation>operator_add(_members_2, _method);
                      }
                    }
                  }
                  if (!matched) {
                    if (element instanceof After) {
                      final After _after = (After)element;
                      matched=true;
                      {
                        Class<?> _afterAnnotation = SpecJvmModelInferrer.this.annotationProvider.getAfterAnnotation(_after);
                        final Class<?> annotationType = _afterAnnotation;
                        EList<JvmMember> _members_2 = it.getMembers();
                        boolean _isAfterAll = _after.isAfterAll();
                        JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_after, annotationType, _isAfterAll);
                        CollectionExtensions.<JvmOperation>operator_add(_members_2, _method);
                      }
                    }
                  }
                  int _operator_plus = IntegerExtensions.operator_plus(index, 1);
                  index = _operator_plus;
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
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  protected void transform(final XtendField source, final JvmGenericType container) {
      super.transform(source, container);
      boolean _isExtension = source.isExtension();
      if (_isExtension) {
        {
          Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(source);
          EObject _head = IterableExtensions.<EObject>head(_jvmElements);
          final JvmField field = ((JvmField) _head);
          field.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmAnnotationReference> _annotations = field.getAnnotations();
          JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(source, de.bmw.carit.jnario.runner.Extension.class);
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
        }
      }
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
}
