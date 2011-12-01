package de.bmw.carit.jnario.jvmmodel;

import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import de.bmw.carit.jnario.jnario.And;
import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.Examples;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.Given;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.Then;
import de.bmw.carit.jnario.jnario.When;
import de.bmw.carit.jnario.naming.JavaNameProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
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
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class JnarioJvmModelInferrer extends AbstractModelInferrer {
  /**
   * conveninence API to build and initialize JvmTypes and their members.
   */
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  private JavaNameProvider _javaNameProvider;
  
  /**
   * Is called for each instance of the first argument's type contained in a resource.
   * 
   * @param element - the model to create one or more JvmDeclaredTypes from.
   * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
   *                   current resource.
   * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
   *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
   */
  protected void _infer(final Jnario jnario, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    Feature _feature = jnario.getFeature();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_feature, null);
    if (_operator_notEquals) {
      Feature _feature_1 = jnario.getFeature();
      EList<Scenario> _scenarios = _feature_1.getScenarios();
      for (final Scenario scenario : _scenarios) {
        {
          Feature _feature_2 = jnario.getFeature();
          String _name = _feature_2.getName();
          String _javaClassName = this._javaNameProvider.getJavaClassName(_name);
          String _name_1 = scenario.getName();
          String _javaClassName_1 = this._javaNameProvider.getJavaClassName(_name_1);
          String _operator_plus = StringExtensions.operator_plus(_javaClassName, _javaClassName_1);
          final String className = _operator_plus;
          final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
              public void apply(final JvmGenericType it) {
                {
                  EList<Examples> _examples = scenario.getExamples();
                  boolean _isEmpty = _examples.isEmpty();
                  if (_isEmpty) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(scenario, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.JnarioRunner.class);
                    CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                  } else {
                  }
                  EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                  String _name = scenario.getName();
                  String _trim = _name.trim();
                  JvmAnnotationReference _annotation_1 = JnarioJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(scenario, de.bmw.carit.jnario.runner.Named.class, _trim);
                  CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                  Feature _feature = jnario.getFeature();
                  String _packageName = _feature.getPackageName();
                  it.setPackageName(_packageName);
                  String _documentation = JnarioJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(scenario);
                  JnarioJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  HashMap<String,JvmTypeReference> _generateVariables = JnarioJvmModelInferrer.this.generateVariables(scenario);
                  final HashMap<String,JvmTypeReference> variables = _generateVariables;
                  boolean hasBackground = false;
                  Feature _feature_1 = jnario.getFeature();
                  Background _background = _feature_1.getBackground();
                  boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_background, null);
                  if (_operator_notEquals) {
                    hasBackground = true;
                  }
                  if (hasBackground) {
                    {
                      Feature _feature_2 = jnario.getFeature();
                      Background _background_1 = _feature_2.getBackground();
                      HashMap<String,JvmTypeReference> _generateVariables_1 = JnarioJvmModelInferrer.this.generateVariables(_background_1);
                      final HashMap<String,JvmTypeReference> backgroundVariables = _generateVariables_1;
                      variables.putAll(backgroundVariables);
                    }
                  }
                  Set<String> _keySet = variables.keySet();
                  for (final String variable : _keySet) {
                    {
                      JvmTypeReference _get = variables.get(variable);
                      JvmTypeReference type = _get;
                      EList<JvmMember> _members = it.getMembers();
                      JvmField _field = JnarioJvmModelInferrer.this._jvmTypesBuilder.toField(scenario, variable, type);
                      CollectionExtensions.<JvmField>operator_add(_members, _field);
                    }
                  }
                  EList<Examples> _examples_1 = scenario.getExamples();
                  boolean _isEmpty_1 = _examples_1.isEmpty();
                  boolean _operator_not = BooleanExtensions.operator_not(_isEmpty_1);
                  if (_operator_not) {
                    {
                      JvmTypeReference _typeForName = JnarioJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Object.class, scenario);
                      JvmTypeReference _addArrayTypeDimension = JnarioJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeForName);
                      JvmTypeReference _addArrayTypeDimension_1 = JnarioJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_addArrayTypeDimension);
                      JvmTypeReference arrayRef = _addArrayTypeDimension_1;
                      JvmField _field_1 = JnarioJvmModelInferrer.this._jvmTypesBuilder.toField(scenario, "exampleData", arrayRef);
                      JvmField field = _field_1;
                      EList<JvmMember> _members_1 = it.getMembers();
                      CollectionExtensions.<JvmField>operator_add(_members_1, field);
                      final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
                          public void apply(final JvmConstructor it) {
                            Set<String> _keySet = variables.keySet();
                            for (final String variable : _keySet) {
                              {
                                JvmTypeReference _get = variables.get(variable);
                                JvmTypeReference type = _get;
                                EList<JvmFormalParameter> _parameters = it.getParameters();
                                JvmFormalParameter _parameter = JnarioJvmModelInferrer.this._jvmTypesBuilder.toParameter(scenario, variable, type);
                                CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                              }
                            }
                          }
                        };
                      JvmConstructor _constructor = JnarioJvmModelInferrer.this._jvmTypesBuilder.toConstructor(scenario, className, _function);
                      JvmConstructor constructor = _constructor;
                      final Function1<ImportManager,StringConcatenation> _function_1 = new Function1<ImportManager,StringConcatenation>() {
                          public StringConcatenation apply(final ImportManager it) {
                            StringConcatenation _builder = new StringConcatenation();
                            {
                              Set<String> _keySet = variables.keySet();
                              for(final String variable : _keySet) {
                                _builder.append("this.");
                                _builder.append(variable, "");
                                _builder.append(" = ");
                                _builder.append(variable, "");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            return _builder;
                          }
                        };
                      JnarioJvmModelInferrer.this._jvmTypesBuilder.setBody(constructor, _function_1);
                      EList<JvmMember> _members_2 = it.getMembers();
                      CollectionExtensions.<JvmConstructor>operator_add(_members_2, constructor);
                    }
                  }
                  if (hasBackground) {
                    Feature _feature_3 = jnario.getFeature();
                    Background _background_2 = _feature_3.getBackground();
                    EList<Given> _steps = _background_2.getSteps();
                    for (final Given step : _steps) {
                      {
                        JnarioJvmModelInferrer.this.transform(step, it);
                        EList<And> _and = step.getAnd();
                        for (final And and : _and) {
                          JnarioJvmModelInferrer.this.transform(and, it);
                        }
                      }
                    }
                  }
                  EList<Step> _steps_1 = scenario.getSteps();
                  for (final Step step_1 : _steps_1) {
                    {
                      JnarioJvmModelInferrer.this.transform(step_1, it);
                      if ((step_1 instanceof Given)) {
                        {
                          Given given = ((Given) step_1);
                          EList<And> _and_1 = given.getAnd();
                          for (final And and_1 : _and_1) {
                            JnarioJvmModelInferrer.this.transform(and_1, it);
                          }
                        }
                      } else {
                        if ((step_1 instanceof When)) {
                          {
                            When when = ((When) step_1);
                            EList<And> _and_2 = when.getAnd();
                            for (final And and_2 : _and_2) {
                              JnarioJvmModelInferrer.this.transform(and_2, it);
                            }
                          }
                        } else {
                          {
                            Then then = ((Then) step_1);
                            EList<And> _and_3 = then.getAnd();
                            for (final And and_3 : _and_3) {
                              JnarioJvmModelInferrer.this.transform(and_3, it);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            };
          JvmGenericType _class = this._jvmTypesBuilder.toClass(scenario, className, _function);
          acceptor.accept(_class);
        }
      }
    }
  }
  
  public HashMap<String,JvmTypeReference> generateVariables(final EObject object) {
    HashMap<String,JvmTypeReference> _xblockexpression = null;
    {
      TreeIterator<EObject> _eAllContents = object.eAllContents();
      TreeIterator<EObject> eAllContents = _eAllContents;
      UnmodifiableIterator<XVariableDeclaration> _filter = Iterators.<XVariableDeclaration>filter(eAllContents, org.eclipse.xtext.xbase.XVariableDeclaration.class);
      UnmodifiableIterator<XVariableDeclaration> allVariables = _filter;
      HashSet<String> _newHashSet = Sets.<String>newHashSet("");
      HashSet<String> declaredVariables = _newHashSet;
      HashMap<String,JvmTypeReference> _hashMap = new HashMap<String,JvmTypeReference>();
      HashMap<String,JvmTypeReference> variablesMap = _hashMap;
      boolean _hasNext = allVariables.hasNext();
      Boolean _xwhileexpression = _hasNext;
      while (_xwhileexpression) {
        {
          XVariableDeclaration _next = allVariables.next();
          XVariableDeclaration currentDec = _next;
          String _qualifiedName = currentDec.getQualifiedName();
          boolean _contains = declaredVariables.contains(_qualifiedName);
          boolean _operator_not = BooleanExtensions.operator_not(_contains);
          if (_operator_not) {
            {
              String _qualifiedName_1 = currentDec.getQualifiedName();
              declaredVariables.add(_qualifiedName_1);
              JvmTypeReference type = null;
              JvmTypeReference _type = currentDec.getType();
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_type, null);
              if (_operator_notEquals) {
                JvmTypeReference _type_1 = currentDec.getType();
                type = _type_1;
              } else {
                XExpression _right = currentDec.getRight();
                boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_right, null);
                if (_operator_notEquals_1) {
                  XExpression _right_1 = currentDec.getRight();
                  JvmTypeReference _type_2 = this._iTypeProvider.getType(_right_1);
                  type = _type_2;
                } else {
                  JvmTypeReference _type_3 = this._iTypeProvider.getType(currentDec, true);
                  type = _type_3;
                }
              }
              boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(type, null);
              if (_operator_notEquals_2) {
                String _simpleName = currentDec.getSimpleName();
                variablesMap.put(_simpleName, type);
              }
            }
          }
        }
        boolean _hasNext_1 = allVariables.hasNext();
        _xwhileexpression = _hasNext_1;
      }
      _xblockexpression = (variablesMap);
    }
    return _xblockexpression;
  }
  
  public Boolean transform(final Step step, final JvmGenericType inferredJvmType) {
    Boolean _xifexpression = null;
    Code _code = step.getCode();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_code, null);
    if (_operator_notEquals) {
      boolean _xblockexpression = false;
      {
        String _name = step.getName();
        String _javaMethodName = this._javaNameProvider.getJavaMethodName(_name);
        JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              Code _code = step.getCode();
              XBlockExpression _blockExpression = _code.getBlockExpression();
              JnarioJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _blockExpression);
            }
          };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
        JvmOperation operation = _method;
        Code _code_1 = step.getCode();
        XBlockExpression _blockExpression = _code_1.getBlockExpression();
        XBlockExpression _copy = EcoreUtil.<XBlockExpression>copy(_blockExpression);
        final XBlockExpression copiedExpression = _copy;
        EList<JvmMember> _members = inferredJvmType.getMembers();
        CollectionExtensions.<JvmOperation>operator_add(_members, operation);
        EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
        JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(step, org.junit.Test.class);
        CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
        EList<JvmAnnotationReference> _annotations_1 = operation.getAnnotations();
        String _name_1 = step.getName();
        String _trim = _name_1.trim();
        JvmAnnotationReference _annotation_1 = this._jvmTypesBuilder.toAnnotation(step, de.bmw.carit.jnario.runner.Named.class, _trim);
        boolean _operator_add = CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
        _xblockexpression = (_operator_add);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public Object generateExampleConstructor() {
    return null;
  }
  
  public Object generateExampleClass() {
    return null;
  }
  
  public void infer(final EObject jnario, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (jnario instanceof Jnario) {
      _infer((Jnario)jnario, acceptor, isPrelinkingPhase);
    } else {
      _infer(jnario, acceptor, isPrelinkingPhase);
    }
  }
}
