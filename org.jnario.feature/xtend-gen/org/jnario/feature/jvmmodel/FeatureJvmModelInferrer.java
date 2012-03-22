package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.And;
import org.jnario.feature.feature.AndReference;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.GivenReference;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.naming.JavaNameProvider;
import org.jnario.feature.naming.StepExpressionProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.JunitAnnotationProvider;
import org.jnario.lib.StepArguments;
import org.jnario.runner.Contains;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {
  public static String STEP_VALUES = "args";
  
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private JavaNameProvider _javaNameProvider;
  
  @Inject
  private StepNameProvider _stepNameProvider;
  
  @Inject
  private StepExpressionProvider _stepExpressionProvider;
  
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  private JunitAnnotationProvider annotationProvider;
  
  @Inject
  private IJvmModelAssociator associator;
  
  /**
   * Is called for each instance of the first argument's type contained in a resource.
   * 
   * @param element - the model to create one or more JvmDeclaredTypes from.
   * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
   *                   current resource.
   * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
   *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
   */
  public void infer(final EObject object, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    boolean _checkClassPath = this.checkClassPath(object, this.annotationProvider);
    boolean _not = (!_checkClassPath);
    if (_not) {
      return;
    }
    FeatureFile featureFile = ((FeatureFile) object);
    XtendClass _xtendClass = featureFile==null?(XtendClass)null:featureFile.getXtendClass();
    Feature feature = ((Feature) _xtendClass);
    boolean _equals = Objects.equal(feature, null);
    if (_equals) {
      return;
    }
    JvmGenericType backgroundClass = null;
    Background _background = feature.getBackground();
    boolean _notEquals = (!Objects.equal(_background, null));
    if (_notEquals) {
      JvmGenericType _generateBackground = this.generateBackground(feature, featureFile);
      backgroundClass = _generateBackground;
      acceptor.<JvmGenericType>accept(backgroundClass);
    }
    final List<JvmGenericType> scenarios = CollectionLiterals.<JvmGenericType>newArrayList();
    EList<XtendMember> _members = feature.getMembers();
    for (final XtendMember member : _members) {
      {
        final Scenario scenario = ((Scenario) member);
        String _name = feature.getName();
        String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
        String _name_1 = scenario.getName();
        String _scenarioClassName = this._javaNameProvider.getScenarioClassName(_name_1);
        final String className = (_featureClassName + _scenarioClassName);
        final JvmGenericType clazz = this.infer(scenario, featureFile, className, backgroundClass);
        EList<JvmAnnotationReference> _annotations = clazz.getAnnotations();
        JvmAnnotationReference _runnerAnnotations = this.runnerAnnotations(scenario);
        this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _runnerAnnotations);
        acceptor.<JvmGenericType>accept(clazz);
        scenarios.add(clazz);
      }
    }
    final JvmGenericType featureClazz = this.generateFeatureSuite(feature, featureFile, scenarios);
    acceptor.<JvmGenericType>accept(featureClazz);
  }
  
  public JvmGenericType generateFeatureSuite(final Feature feature, final FeatureFile featureFile, final List<JvmGenericType> scenarios) {
    String _name = feature.getName();
    String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          FeatureJvmModelInferrer.this.addDefaultConstructor(feature, it);
          Resource _eResource = featureFile.eResource();
          EList<EObject> _contents = _eResource.getContents();
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, it);
          String _package = featureFile.getPackage();
          it.setPackageName(_package);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _featureRunner = FeatureJvmModelInferrer.this.annotationProvider.getFeatureRunner(feature);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _featureRunner);
          boolean _isEmpty = scenarios.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(feature, Contains.class, scenarios);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
          }
          EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
          String _name = feature.getName();
          String _trim = _name.trim();
          JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(feature, Named.class, _trim);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(feature, _featureClassName, _function);
    return _class;
  }
  
  public JvmAnnotationReference runnerAnnotations(final Scenario scenario) {
    JvmAnnotationReference _xifexpression = null;
    EList<ExampleTable> _examples = scenario.getExamples();
    boolean _isEmpty = _examples.isEmpty();
    if (_isEmpty) {
      JvmAnnotationReference _featureRunner = this.annotationProvider.getFeatureRunner(scenario);
      _xifexpression = _featureRunner;
    } else {
      JvmAnnotationReference _featureExamplesRunner = this.annotationProvider.getFeatureExamplesRunner(scenario);
      _xifexpression = _featureExamplesRunner;
    }
    return _xifexpression;
  }
  
  public JvmGenericType generateBackground(final Feature feature, final FeatureFile featureFile) {
    JvmGenericType _xblockexpression = null;
    {
      Background _background = feature.getBackground();
      EList<XtendMember> _steps = _background.getSteps();
      this.generateStepValues(_steps);
      String _name = feature.getName();
      String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
      String _plus = (_featureClassName + "Background");
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, it);
            FeatureJvmModelInferrer.this.addDefaultConstructor(feature, it);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            it.setAbstract(true);
            Background _background = feature.getBackground();
            FeatureJvmModelInferrer.this.generateBackgroundVariables(_background, it);
            Background _background_1 = feature.getBackground();
            EList<XtendMember> _steps = _background_1.getSteps();
            FeatureJvmModelInferrer.this.generateSteps(_steps, it);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(feature, _plus, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType infer(final Scenario scenario, final FeatureFile featureFile, final String className, final JvmGenericType superClass) {
    JvmGenericType _xblockexpression = null;
    {
      EList<XtendMember> _steps = scenario.getSteps();
      this.generateStepValues(_steps);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, it);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            String _name = scenario.getName();
            String _trim = _name.trim();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, Named.class, _trim);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            String _documentation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(scenario);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
            boolean hasBackground = false;
            XtendClass _xtendClass = featureFile.getXtendClass();
            Feature feature = ((Feature) _xtendClass);
            int start = 0;
            Background _background = feature.getBackground();
            boolean _notEquals = (!Objects.equal(_background, null));
            if (_notEquals) {
              hasBackground = true;
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(superClass);
              FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
              Background _background_1 = feature.getBackground();
              EList<XtendMember> _steps = _background_1.getSteps();
              int _generateBackgroundStepCalls = FeatureJvmModelInferrer.this.generateBackgroundStepCalls(_steps, it);
              start = _generateBackgroundStepCalls;
            }
            FeatureJvmModelInferrer.this.generateVariables(scenario, feature, it);
            EList<XtendMember> _steps_1 = scenario.getSteps();
            FeatureJvmModelInferrer.this.generateSteps(_steps_1, it, start, scenario);
            EList<ExampleTable> _examples = scenario.getExamples();
            boolean _isEmpty = _examples.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              final List<JvmGenericType> exampleClasses = FeatureJvmModelInferrer.this.generateExampleClasses(scenario, featureFile, it);
              boolean _isEmpty_1 = exampleClasses.isEmpty();
              boolean _not_1 = (!_isEmpty_1);
              if (_not_1) {
                EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, Contains.class, exampleClasses);
                FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
              }
            }
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(scenario, className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public void generateStepValues(final EList<XtendMember> steps) {
    for (final XtendMember step : steps) {
      {
        TreeIterator<EObject> _eAllContents = step.eAllContents();
        UnmodifiableIterator<XVariableDeclaration> decs = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
        Iterable<XVariableDeclaration> _iterable = IteratorExtensions.<XVariableDeclaration>toIterable(decs);
        for (final XVariableDeclaration dec : _iterable) {
          String _name = dec.getName();
          boolean _equals = Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES);
          if (_equals) {
            this.setStepValueType(dec, ((Step) step));
            TreeIterator<EObject> _eAllContents_1 = step.eAllContents();
            UnmodifiableIterator<XMemberFeatureCall> calls = Iterators.<XMemberFeatureCall>filter(_eAllContents_1, XMemberFeatureCall.class);
            Iterable<XMemberFeatureCall> _iterable_1 = IteratorExtensions.<XMemberFeatureCall>toIterable(calls);
            for (final XMemberFeatureCall call : _iterable_1) {
              XExpression _memberCallTarget = call.getMemberCallTarget();
              if ((_memberCallTarget instanceof XFeatureCall)) {
                XExpression _memberCallTarget_1 = call.getMemberCallTarget();
                XFeatureCall featureCall = ((XFeatureCall) _memberCallTarget_1);
                boolean _and = false;
                JvmIdentifiableElement _feature = featureCall.getFeature();
                boolean _equals_1 = Objects.equal(_feature, dec);
                if (!_equals_1) {
                  _and = false;
                } else {
                  JvmIdentifiableElement _feature_1 = call.getFeature();
                  boolean _equals_2 = Objects.equal(_feature_1, null);
                  _and = (_equals_1 && _equals_2);
                }
                if (_and) {
                  this.addStepValue(call, dec, step);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void setStepValueType(final XVariableDeclaration variableDec, final Step step) {
    JvmTypeReference typeRef = this._typeReferences.getTypeForName(StepArguments.class, step);
    variableDec.setType(typeRef);
    JvmType _type = typeRef.getType();
    final JvmGenericType type = ((JvmGenericType) _type);
    this.associator.associate(step, type);
    XExpression _right = variableDec.getRight();
    XConstructorCall constructor = ((XConstructorCall) _right);
    EList<JvmMember> _members = type.getMembers();
    Iterator<JvmMember> _iterator = _members.iterator();
    UnmodifiableIterator<JvmConstructor> _filter = Iterators.<JvmConstructor>filter(_iterator, JvmConstructor.class);
    JvmConstructor _next = _filter.next();
    constructor.setConstructor(_next);
  }
  
  public void addStepValue(final XMemberFeatureCall featureCall, final XVariableDeclaration dec, final XtendMember step) {
    JvmTypeReference typeRef = this._typeReferences.getTypeForName(StepArguments.class, step);
    JvmType _type = typeRef.getType();
    JvmGenericType type = ((JvmGenericType) _type);
    EList<JvmMember> _members = type.getMembers();
    Iterator<JvmMember> _iterator = _members.iterator();
    UnmodifiableIterator<JvmOperation> operations = Iterators.<JvmOperation>filter(_iterator, JvmOperation.class);
    Iterable<JvmOperation> _iterable = IteratorExtensions.<JvmOperation>toIterable(operations);
    for (final JvmOperation operation : _iterable) {
      String _simpleName = operation.getSimpleName();
      boolean _equals = Objects.equal(_simpleName, "add");
      if (_equals) {
        featureCall.setFeature(operation);
      }
    }
  }
  
  public void generateVariables(final Scenario scenario, final Feature feature, final JvmGenericType inferredJvmType) {
    EList<ExampleTable> _examples = scenario.getExamples();
    boolean _isEmpty = _examples.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      ArrayList<String> _arrayList = new ArrayList<String>();
      ArrayList<String> fieldNames = _arrayList;
      EList<ExampleTable> _examples_1 = scenario.getExamples();
      for (final ExampleTable table : _examples_1) {
        {
          TreeIterator<EObject> _eAllContents = table.eAllContents();
          UnmodifiableIterator<ExampleColumn> allFields = Iterators.<ExampleColumn>filter(_eAllContents, ExampleColumn.class);
          Iterable<ExampleColumn> _iterable = IteratorExtensions.<ExampleColumn>toIterable(allFields);
          for (final ExampleColumn field : _iterable) {
            String _name = field.getName();
            boolean _contains = fieldNames.contains(_name);
            boolean _not_1 = (!_contains);
            if (_not_1) {
              EList<JvmMember> _members = inferredJvmType.getMembers();
              JvmField _field = this.toField(field);
              this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
              String _name_1 = field.getName();
              fieldNames.add(_name_1);
            }
          }
        }
      }
    }
    TreeIterator<EObject> _eAllContents = scenario.eAllContents();
    UnmodifiableIterator<XVariableDeclaration> variableDeclarations = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
    Iterable<XVariableDeclaration> _iterable = IteratorExtensions.<XVariableDeclaration>toIterable(variableDeclarations);
    this.generateXVariableDeclarations(_iterable, inferredJvmType, scenario);
  }
  
  public void generateBackgroundVariables(final Background background, final JvmGenericType inferredJvmType) {
    TreeIterator<EObject> _eAllContents = background.eAllContents();
    UnmodifiableIterator<XVariableDeclaration> variableDeclarations = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
    Iterable<XVariableDeclaration> _iterable = IteratorExtensions.<XVariableDeclaration>toIterable(variableDeclarations);
    this.generateXVariableDeclarations(_iterable, inferredJvmType, background);
  }
  
  public void generateXVariableDeclarations(final Iterable<XVariableDeclaration> varDecs, final JvmGenericType inferredJvmType, final EObject scenario) {
    for (final XVariableDeclaration variableDec : varDecs) {
      boolean _and = false;
      String _name = variableDec.getName();
      boolean _notEquals = (!Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name_1 = variableDec.getName();
        boolean _notEquals_1 = (!Objects.equal(_name_1, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        JvmTypeReference type = null;
        JvmTypeReference _type = variableDec.getType();
        boolean _notEquals_2 = (!Objects.equal(_type, null));
        if (_notEquals_2) {
          JvmTypeReference _type_1 = variableDec.getType();
          type = _type_1;
        } else {
          XExpression _right = variableDec.getRight();
          JvmTypeReference _type_2 = this._iTypeProvider.getType(_right);
          type = _type_2;
        }
        String _simpleName = variableDec.getSimpleName();
        JvmField field = this._extendedJvmTypesBuilder.toField(scenario, _simpleName, type);
        boolean _isWriteable = variableDec.isWriteable();
        boolean _not = (!_isWriteable);
        if (_not) {
          field.setFinal(true);
        }
        field.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmMember> _members = inferredJvmType.getMembers();
        this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, field);
      }
    }
  }
  
  public int generateBackgroundStepCalls(final EList<XtendMember> steps, final JvmGenericType inferredJvmType) {
    int _xblockexpression = (int) 0;
    {
      int order = 0;
      for (final XtendMember step : steps) {
        {
          int _transformCalls = this.transformCalls(((Step) step), inferredJvmType, order);
          order = _transformCalls;
          EList<XtendMember> _and = ((Step) step).getAnd();
          for (final XtendMember and : _and) {
            int _transformCalls_1 = this.transformCalls(((Step) and), inferredJvmType, order);
            order = _transformCalls_1;
          }
        }
      }
      _xblockexpression = (order);
    }
    return _xblockexpression;
  }
  
  public int transformCalls(final Step step, final JvmGenericType inferredJvmType, final int order) {
    int _xblockexpression = (int) 0;
    {
      String _nameOf = this._stepNameProvider.nameOf(step);
      final String methodName = this._javaNameProvider.getJavaMethodName(_nameOf);
      EList<JvmMember> _members = inferredJvmType.getMembers();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable a) {
                  String _plus = ("super." + methodName);
                  String _plus_1 = (_plus + "();");
                  a.append(_plus_1);
                }
              };
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            ArrayList<JvmAnnotationReference> _testAnnotations = FeatureJvmModelInferrer.this.annotationProvider.getTestAnnotations(step, false);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _testAnnotations);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            int _intValue = Integer.valueOf(order).intValue();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Order.class, Integer.valueOf(_intValue));
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
            EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
            String _nameOf = FeatureJvmModelInferrer.this._stepNameProvider.nameOf(step);
            JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, _nameOf);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, methodName, _typeForName, _function);
      this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      int _plus = (order + 1);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  public void generateSteps(final EList<XtendMember> steps, final JvmGenericType inferredJvmType, final int start, final Scenario scenario) {
    int order = start;
    for (final XtendMember step : steps) {
      {
        int _transform = this.transform(((Step) step), inferredJvmType, order, scenario);
        order = _transform;
        EList<XtendMember> _and = ((Step) step).getAnd();
        for (final XtendMember and : _and) {
          int _transform_1 = this.transform(((Step) and), inferredJvmType, order, scenario);
          order = _transform_1;
        }
      }
    }
  }
  
  public int transform(final Step step, final JvmGenericType inferredJvmType, final int order, final Scenario scenario) {
    int _xblockexpression = (int) 0;
    {
      EList<JvmMember> _members = inferredJvmType.getMembers();
      String _nameOf = this._stepNameProvider.nameOf(step);
      String _javaMethodName = this._javaNameProvider.getJavaMethodName(_nameOf);
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StepExpression _expressionOf = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
            XBlockExpression _blockExpression = _expressionOf==null?(XBlockExpression)null:_expressionOf.getBlockExpression();
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _blockExpression);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            ArrayList<JvmAnnotationReference> _testAnnotations = FeatureJvmModelInferrer.this.annotationProvider.getTestAnnotations(step, false);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _testAnnotations);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            int _intValue = Integer.valueOf(order).intValue();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Order.class, Integer.valueOf(_intValue));
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
            String name = FeatureJvmModelInferrer.this._stepNameProvider.nameOf(step);
            StepExpression _expressionOf_1 = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
            boolean _equals = Objects.equal(_expressionOf_1, null);
            if (_equals) {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _or_2 = false;
              if ((step instanceof Given)) {
                _or_2 = true;
              } else {
                _or_2 = ((step instanceof Given) || (step instanceof GivenReference));
              }
              if (_or_2) {
                _or_1 = true;
              } else {
                boolean _and = false;
                if (!(step instanceof And)) {
                  _and = false;
                } else {
                  boolean _or_3 = false;
                  EObject _eContainer = step.eContainer();
                  if ((_eContainer instanceof Given)) {
                    _or_3 = true;
                  } else {
                    EObject _eContainer_1 = step.eContainer();
                    _or_3 = ((_eContainer instanceof Given) || (_eContainer_1 instanceof GivenReference));
                  }
                  _and = ((step instanceof And) && _or_3);
                }
                _or_1 = (_or_2 || _and);
              }
              if (_or_1) {
                _or = true;
              } else {
                boolean _and_1 = false;
                if (!(step instanceof AndReference)) {
                  _and_1 = false;
                } else {
                  boolean _or_4 = false;
                  EObject _eContainer_2 = step.eContainer();
                  if ((_eContainer_2 instanceof Given)) {
                    _or_4 = true;
                  } else {
                    EObject _eContainer_3 = step.eContainer();
                    _or_4 = ((_eContainer_2 instanceof Given) || (_eContainer_3 instanceof GivenReference));
                  }
                  _and_1 = ((step instanceof AndReference) && _or_4);
                }
                _or = (_or_1 || _and_1);
              }
              boolean _not = (!_or);
              if (_not) {
                String _plus = ("[PENDING] " + name);
                name = _plus;
                EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
                JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Ignore.class);
                FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
              }
            }
            EList<JvmAnnotationReference> _annotations_3 = it.getAnnotations();
            JvmAnnotationReference _annotation_2 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, name);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_3, _annotation_2);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
      this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      int _plus = (order + 1);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  public void generateSteps(final EList<XtendMember> steps, final JvmGenericType inferredJvmType) {
    for (final XtendMember step : steps) {
      {
        this.transform(((Step) step), inferredJvmType);
        EList<XtendMember> _and = ((Step) step).getAnd();
        for (final XtendMember and : _and) {
          this.transform(((Step) and), inferredJvmType);
        }
      }
    }
  }
  
  public boolean transform(final Step step, final JvmGenericType inferredJvmType) {
    EList<JvmMember> _members = inferredJvmType.getMembers();
    String _nameOf = this._stepNameProvider.nameOf(step);
    String _javaMethodName = this._javaNameProvider.getJavaMethodName(_nameOf);
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          StepExpression _expressionOf = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
          XBlockExpression _blockExpression = _expressionOf==null?(XBlockExpression)null:_expressionOf.getBlockExpression();
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _blockExpression);
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
    boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    return _add;
  }
  
  public List<JvmGenericType> generateExampleClasses(final Scenario scenario, final FeatureFile featureFile, final JvmGenericType inferredJvmType) {
    List<JvmGenericType> _xblockexpression = null;
    {
      int exampleTable = 1;
      final List<JvmGenericType> exampleClasses = CollectionLiterals.<JvmGenericType>newArrayList();
      EList<ExampleTable> _examples = scenario.getExamples();
      for (final ExampleTable example : _examples) {
        {
          EList<ExampleColumn> fields = example.getColumns();
          int exampleNumber = 1;
          EList<ExampleRow> _rows = example.getRows();
          boolean _isEmpty = _rows.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<ExampleRow> _rows_1 = example.getRows();
            for (final ExampleRow row : _rows_1) {
              {
                JvmGenericType _createExampleClass = this.createExampleClass(scenario, featureFile, row, fields, exampleTable, exampleNumber, inferredJvmType);
                exampleClasses.add(_createExampleClass);
                int _plus = (exampleNumber + 1);
                exampleNumber = _plus;
              }
            }
          }
          int _plus = (exampleTable + 1);
          exampleTable = _plus;
        }
      }
      _xblockexpression = (exampleClasses);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType createExampleClass(final Scenario scenario, final FeatureFile featureFile, final ExampleRow row, final EList<ExampleColumn> fields, final int exampleTableNum, final int exampleNumber, final JvmGenericType inferredJvmType) {
    JvmGenericType _xblockexpression = null;
    {
      EObject _eContainer = row.eContainer();
      ExampleTable exampleTable = ((ExampleTable) _eContainer);
      String exampleTableName = "";
      String _name = exampleTable.getName();
      String _trim = _name.trim();
      boolean _equals = Objects.equal(_trim, "");
      if (_equals) {
        String _plus = ("Examples" + Integer.valueOf(exampleTableNum));
        exampleTableName = _plus;
      } else {
        String _name_1 = exampleTable.getName();
        String _javaClassName = this._javaNameProvider.getJavaClassName(_name_1);
        exampleTableName = _javaClassName;
      }
      XtendClass _xtendClass = featureFile.getXtendClass();
      String _name_2 = _xtendClass.getName();
      String _featureClassName = this._javaNameProvider.getFeatureClassName(_name_2);
      String _name_3 = scenario.getName();
      String _scenarioClassName = this._javaNameProvider.getScenarioClassName(_name_3);
      String _plus_1 = (_featureClassName + _scenarioClassName);
      String _plus_2 = (_plus_1 + "Row");
      final String className = (_plus_2 + Integer.valueOf(exampleNumber));
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, it);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            EList<JvmMember> _members = it.getMembers();
            JvmConstructor _generateExampleConstructor = FeatureJvmModelInferrer.this.generateExampleConstructor(row, fields, className);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members, _generateExampleConstructor);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _featureRunner = FeatureJvmModelInferrer.this.annotationProvider.getFeatureRunner(row);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _featureRunner);
            String description = "[";
            int i = 0;
            for (final ExampleColumn field : fields) {
              EList<XExpression> _cells = row.getCells();
              int _size = _cells.size();
              boolean _greaterThan = (_size > i);
              if (_greaterThan) {
                String _name = field.getName();
                String _plus = (description + _name);
                String _plus_1 = (_plus + " = ");
                EList<XExpression> _cells_1 = row.getCells();
                XExpression _get = _cells_1.get(i);
                String _serialize = FeatureJvmModelInferrer.this.serialize(_get);
                String _plus_2 = (_plus_1 + _serialize);
                String _plus_3 = (_plus_2 + ", ");
                description = _plus_3;
                int _plus_4 = (i + 1);
                i = _plus_4;
              }
            }
            int _length = description.length();
            int _minus = (_length - 1);
            int _minus_1 = (_minus - 1);
            String _substring = description.substring(0, _minus_1);
            String _plus_5 = (_substring + "]");
            description = _plus_5;
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(row, Named.class, description);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(row, className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable cellToAppendable(final ExampleRow row, final int i, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      EList<XExpression> _cells = row.getCells();
      int _size = _cells.size();
      boolean _greaterThan = (_size > i);
      if (_greaterThan) {
        EList<XExpression> _cells_1 = row.getCells();
        XExpression _get = _cells_1.get(i);
        this.compiler.toJavaExpression(_get, appendable);
      }
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
  }
  
  public JvmConstructor generateExampleConstructor(final ExampleRow row, final EList<ExampleColumn> fields, final String className) {
    final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
        public void apply(final JvmConstructor it) {
          it.setSimpleName(className);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable a) {
                int i = 0;
                for (final ExampleColumn field : fields) {
                  {
                    a.append("super.");
                    String _name = field.getName();
                    a.append(_name);
                    a.append(" = ");
                    FeatureJvmModelInferrer.this.cellToAppendable(row, i, a);
                    a.append(";\n");
                    int _plus = (i + 1);
                    i = _plus;
                  }
                }
              }
            };
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(row, _function);
    return _constructor;
  }
  
  public void transform(final XtendField source, final JvmGenericType container) {
    boolean _and = false;
    boolean _or = false;
    boolean _isExtension = source.isExtension();
    if (_isExtension) {
      _or = true;
    } else {
      String _name = source.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      _or = (_isExtension || _notEquals);
    }
    if (!_or) {
      _and = false;
    } else {
      JvmTypeReference _type = source.getType();
      boolean _notEquals_1 = (!Objects.equal(_type, null));
      _and = (_or && _notEquals_1);
    }
    if (_and) {
      JvmField field = this.typesFactory.createJvmField();
      String _computeFieldName = this.computeFieldName(source, container);
      field.setSimpleName(_computeFieldName);
      EList<JvmMember> _members = container.getMembers();
      this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, field);
      this.associator.associatePrimary(source, field);
      JvmVisibility _visibility = source.getVisibility();
      field.setVisibility(_visibility);
      boolean _isStatic = source.isStatic();
      field.setStatic(_isStatic);
      JvmTypeReference _type_1 = source.getType();
      JvmTypeReference _cloneWithProxies = this._extendedJvmTypesBuilder.cloneWithProxies(_type_1);
      field.setType(_cloneWithProxies);
      EList<XAnnotation> _annotations = source.getAnnotations();
      this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations, field);
      String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
      this._extendedJvmTypesBuilder.setDocumentation(field, _documentation);
      XExpression _initialValue = source.getInitialValue();
      this._extendedJvmTypesBuilder.setInitializer(field, _initialValue);
    }
  }
}
