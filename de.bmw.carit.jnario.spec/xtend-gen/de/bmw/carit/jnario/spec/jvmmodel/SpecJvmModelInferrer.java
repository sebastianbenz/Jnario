package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.spec.naming.JavaNameProvider;
import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.Field;
import de.bmw.carit.jnario.spec.spec.Member;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

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
              EList<XAnnotation> _annotations_1 = exampleGroup.getAnnotations();
              for (final XAnnotation a : _annotations_1) {
                EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
                JvmAnnotationType _annotationType = a.getAnnotationType();
                String _qualifiedName = _annotationType.getQualifiedName();
                JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(spec, _qualifiedName);
                CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
              }
              EList<JvmAnnotationReference> _annotations_3 = it.getAnnotations();
              String _javaClassAnnotationValue = SpecJvmModelInferrer.this._javaNameProvider.getJavaClassAnnotationValue(exampleGroup);
              JvmAnnotationReference _annotation_2 = SpecJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(spec, de.bmw.carit.jnario.runner.Named.class, _javaClassAnnotationValue);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_3, _annotation_2);
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
                      field.setFinal(true);
                      final Function1<ImportManager,String> _function = new Function1<ImportManager,String>() {
                          public String apply(final ImportManager im) {
                            String _operator_plus = StringExtensions.operator_plus(initMethodName, "()");
                            return _operator_plus;
                          }
                        };
                      SpecJvmModelInferrer.this._jvmTypesBuilder.initialization(field, _function);
                      XExpression _right = element_2.getRight();
                      final XExpression initCode = _right;
                      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(initCode, null);
                      if (_operator_notEquals) {
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
                  }
                }
                if (!matched) {
                  if (element_1 instanceof Example) {
                    final Example element_3 = (Example) element_1;
                    matched=true;
                    EList<JvmMember> _members_2 = it.getMembers();
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
                            XExpression _body = element_3.getBody();
                            SpecJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                          }
                        }
                      };
                    JvmOperation _method_1 = SpecJvmModelInferrer.this._jvmTypesBuilder.toMethod(element_3, _exampleMethodName, _typeForName, _function_2);
                    CollectionExtensions.<JvmOperation>operator_add(_members_2, _method_1);
                  }
                }
              }
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(spec, _javaClassName, _function);
      acceptor.accept(_class);
    }
  }
  
  public void infer(final EObject spec, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (spec instanceof SpecFile) {
      _infer((SpecFile)spec, acceptor, isPrelinkingPhase);
    } else {
      _infer(spec, acceptor, isPrelinkingPhase);
    }
  }
}
