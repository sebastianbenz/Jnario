package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
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
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
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
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.jvmmodel.StepArguments;
import org.jnario.feature.naming.JavaNameProvider;
import org.jnario.feature.naming.StepExpressionProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.JunitAnnotationProvider;
import org.jnario.runner.Contains;
import org.jnario.runner.Named;
import org.jnario.runner.Order;

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
        _annotations.add(_runnerAnnotations);
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
          _contents.add(it);
          String _package = featureFile.getPackage();
          it.setPackageName(_package);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _featureRunner = FeatureJvmModelInferrer.this.annotationProvider.getFeatureRunner(feature);
          _annotations.add(_featureRunner);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(feature, Contains.class, scenarios);
          _annotations_1.add(_annotation);
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
    String _name = feature.getName();
    String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
    String _plus = (_featureClassName + "Background");
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          Resource _eResource = featureFile.eResource();
          EList<EObject> _contents = _eResource.getContents();
          _contents.add(it);
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
    return _class;
  }
  
  public JvmGenericType infer(final Scenario scenario, final FeatureFile featureFile, final String className, final JvmGenericType superClass) {
    JvmGenericType _xblockexpression = null;
    {
      this.generateStepValues(scenario);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            _contents.add(it);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            String _name = scenario.getName();
            String _trim = _name.trim();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, Named.class, _trim);
            _annotations.add(_annotation);
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
              _superTypes.add(_createTypeRef);
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
                _annotations_1.add(_annotation_1);
              }
            }
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(scenario, className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public void generateStepValues(final Scenario scenario) {
    EList<XtendMember> steps = scenario.getSteps();
    for (final XtendMember step : steps) {
      {
        TreeIterator<EObject> _eAllContents = step.eAllContents();
        UnmodifiableIterator<XVariableDeclaration> decs = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
        Iterable<XVariableDeclaration> _iterable = IteratorExtensions.<XVariableDeclaration>toIterable(decs);
        for (final XVariableDeclaration dec : _iterable) {
          String _name = dec.getName();
          boolean _equals = Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES);
          if (_equals) {
            this.setStepValueType(dec, scenario);
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
                  this.addStepValue(call, dec, scenario);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void setStepValueType(final XVariableDeclaration variableDec, final Scenario scenario) {
    JvmTypeReference typeRef = this._typeReferences.getTypeForName(StepArguments.class, scenario);
    variableDec.setType(typeRef);
    JvmType _type = typeRef.getType();
    final JvmGenericType declaringType = ((JvmGenericType) _type);
    this.associator.associate(scenario, declaringType);
    XExpression _right = variableDec.getRight();
    XConstructorCall constructor = ((XConstructorCall) _right);
    EList<JvmMember> _members = declaringType.getMembers();
    Iterator<JvmMember> _iterator = _members.iterator();
    UnmodifiableIterator<JvmConstructor> _filter = Iterators.<JvmConstructor>filter(_iterator, JvmConstructor.class);
    JvmConstructor _next = _filter.next();
    constructor.setConstructor(_next);
  }
  
  public void addStepValue(final XMemberFeatureCall featureCall, final XVariableDeclaration dec, final Scenario scenario) {
    JvmTypeReference typeRef = this._typeReferences.getTypeForName(StepArguments.class, scenario);
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
              _members.add(_field);
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
      String _name = variableDec.getName();
      boolean _notEquals = (!Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES));
      if (_notEquals) {
        JvmTypeReference type = null;
        JvmTypeReference _type = variableDec.getType();
        boolean _notEquals_1 = (!Objects.equal(_type, null));
        if (_notEquals_1) {
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
        _members.add(field);
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
            ArrayList<JvmAnnotationReference> _testAnnotations = FeatureJvmModelInferrer.this.annotationProvider.getTestAnnotations(step, null, false);
            Iterables.<JvmAnnotationReference>addAll(_annotations, _testAnnotations);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            int _intValue = Integer.valueOf(order).intValue();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Order.class, Integer.valueOf(_intValue));
            _annotations_1.add(_annotation);
            EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
            String _nameOf = FeatureJvmModelInferrer.this._stepNameProvider.nameOf(step);
            JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, _nameOf);
            _annotations_2.add(_annotation_1);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, methodName, _typeForName, _function);
      _members.add(_method);
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
            ArrayList<JvmAnnotationReference> _testAnnotations = FeatureJvmModelInferrer.this.annotationProvider.getTestAnnotations(step, null, false);
            Iterables.<JvmAnnotationReference>addAll(_annotations, _testAnnotations);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            int _intValue = Integer.valueOf(order).intValue();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Order.class, Integer.valueOf(_intValue));
            _annotations_1.add(_annotation);
            EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
            String _nameOf = FeatureJvmModelInferrer.this._stepNameProvider.nameOf(step);
            JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, _nameOf);
            _annotations_2.add(_annotation_1);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
      _members.add(_method);
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
    boolean _add = _members.add(_method);
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
  
  public JvmGenericType createExampleClass(final Scenario scenario, final FeatureFile featureFile, final ExampleRow row, final EList<ExampleColumn> fields, final int exampleTable, final int exampleNumber, final JvmGenericType inferredJvmType) {
    JvmGenericType _xblockexpression = null;
    {
      XtendClass _xtendClass = featureFile.getXtendClass();
      String _name = _xtendClass.getName();
      String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
      String _name_1 = scenario.getName();
      String _scenarioClassName = this._javaNameProvider.getScenarioClassName(_name_1);
      String _plus = (_featureClassName + _scenarioClassName);
      String _plus_1 = (_plus + "ExampleTable");
      String _plus_2 = (_plus_1 + Integer.valueOf(exampleTable));
      String _plus_3 = (_plus_2 + "Example");
      final String className = (_plus_3 + Integer.valueOf(exampleNumber));
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
            _superTypes.add(_createTypeRef);
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            _contents.add(it);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            EList<JvmMember> _members = it.getMembers();
            JvmConstructor _generateExampleConstructor = FeatureJvmModelInferrer.this.generateExampleConstructor(row, fields, className);
            _members.add(_generateExampleConstructor);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _featureRunner = FeatureJvmModelInferrer.this.annotationProvider.getFeatureRunner(row);
            _annotations.add(_featureRunner);
            String _plus = ("ExampleTable " + Integer.valueOf(exampleTable));
            String _plus_1 = (_plus + ", ");
            String _plus_2 = (_plus_1 + "Example ");
            String _plus_3 = (_plus_2 + Integer.valueOf(exampleNumber));
            String description = (_plus_3 + " [");
            int i = 0;
            for (final ExampleColumn field : fields) {
              {
                FakeTreeAppendable _fakeTreeAppendable = new FakeTreeAppendable(null);
                final ITreeAppendable appendable = _fakeTreeAppendable;
                String _name = field.getName();
                String _plus_4 = (description + _name);
                String _plus_5 = (_plus_4 + " = ");
                ITreeAppendable _cellToAppendable = FeatureJvmModelInferrer.this.cellToAppendable(row, i, appendable);
                String _plus_6 = (_plus_5 + _cellToAppendable);
                String _plus_7 = (_plus_6 + ", ");
                description = _plus_7;
                int _plus_8 = (i + 1);
                i = _plus_8;
              }
            }
            int _length = description.length();
            int _minus = (_length - 1);
            int _minus_1 = (_minus - 1);
            String _substring = description.substring(0, _minus_1);
            String _plus_4 = (_substring + "]");
            description = _plus_4;
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            String _replace = description.replace("\"", "\\\"");
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(row, Named.class, _replace);
            _annotations_1.add(_annotation);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(row, className, _function);
      _xblockexpression = (_class);
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
      _members.add(field);
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
