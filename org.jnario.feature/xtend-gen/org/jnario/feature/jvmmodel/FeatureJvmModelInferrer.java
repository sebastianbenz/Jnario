package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.EcoreUtil2;
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
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.feature.jvmmodel.StepReferenceFieldCreator;
import org.jnario.feature.naming.JavaNameProvider;
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
 * @author Sebastian Benz
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
  private JunitAnnotationProvider annotationProvider;
  
  @Inject
  private StepReferenceFieldCreator _stepReferenceFieldCreator;
  
  @Inject
  private StepArgumentsProvider stepArgumentsProvider;
  
  @Inject
  private IJvmModelAssociator _iJvmModelAssociator;
  
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
    final FeatureFile featureFile = ((FeatureFile) object);
    XtendClass _xtendClass = featureFile==null?(XtendClass)null:featureFile.getXtendClass();
    final Feature feature = ((Feature) _xtendClass);
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
      Background _background_1 = feature.getBackground();
      List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
      this.register(acceptor, _background_1, backgroundClass, _emptyList);
    }
    final ArrayList<JvmGenericType> scenarios = CollectionLiterals.<JvmGenericType>newArrayList();
    EList<Scenario> _scenarios = feature.getScenarios();
    for (final Scenario scenario : _scenarios) {
      {
        final String className = this._javaNameProvider.getClassName(scenario);
        final JvmGenericType inferredJvmType = this.infer(scenario, featureFile, className, backgroundClass);
        List<JvmGenericType> _emptyList_1 = CollectionLiterals.<JvmGenericType>emptyList();
        this.register(acceptor, scenario, inferredJvmType, _emptyList_1);
        scenarios.add(inferredJvmType);
      }
    }
    final JvmGenericType inferredJvmType = this.generateFeatureSuite(feature, featureFile, scenarios);
    this.register(acceptor, feature, inferredJvmType, scenarios);
  }
  
  public void register(final IJvmDeclaredTypeAcceptor acceptor, final XtendClass source, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    this._iJvmModelAssociator.associatePrimary(source, inferredJvmType);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(inferredJvmType);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          FeatureJvmModelInferrer.this.initialize(source, inferredJvmType, scenarios);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public void initialize(final XtendClass source, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    this.init(source, inferredJvmType, scenarios);
    super.initialize(source, inferredJvmType);
  }
  
  protected void _init(final Feature feature, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    JvmAnnotationReference _featureRunner = this.annotationProvider.getFeatureRunner(feature);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _featureRunner);
    boolean _isEmpty = scenarios.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(feature, Contains.class, scenarios);
      this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation);
    }
    String _name = feature.getName();
    String _trim = _name.trim();
    JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(feature, Named.class, _trim);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation_1);
  }
  
  protected void _init(final Scenario scenario, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    EList<Step> _steps = scenario.getSteps();
    this.generateStepValues(_steps);
    this._stepReferenceFieldCreator.copyXtendMemberForReferences(scenario);
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    final Feature feature = this.feature(scenario);
    final Background background = feature.getBackground();
    EList<JvmAnnotationReference> _annotations = inferredJvmType.getAnnotations();
    JvmAnnotationReference _runnerAnnotations = this.runnerAnnotations(scenario);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _runnerAnnotations);
    String _name = scenario.getName();
    String _trim = _name.trim();
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(scenario, Named.class, _trim);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation);
    int start = 0;
    boolean _notEquals = (!Objects.equal(background, null));
    if (_notEquals) {
      EList<Step> _steps_1 = background.getSteps();
      int _generateBackgroundStepCalls = this.generateBackgroundStepCalls(_steps_1, inferredJvmType);
      start = _generateBackgroundStepCalls;
    }
    this.generateVariables(scenario, feature, inferredJvmType);
    EList<Step> _steps_2 = scenario.getSteps();
    this.generateSteps(_steps_2, inferredJvmType, start, scenario);
    EList<ExampleTable> _examples = scenario.getExamples();
    boolean _isEmpty = _examples.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EObject _eContainer = feature.eContainer();
      final List<JvmGenericType> exampleClasses = this.generateExampleClasses(scenario, ((FeatureFile) _eContainer), inferredJvmType);
      boolean _isEmpty_1 = exampleClasses.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(scenario, Contains.class, exampleClasses);
        this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation_1);
      }
    }
  }
  
  protected void _init(final Background background, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    EList<Step> _steps = background.getSteps();
    this.generateStepValues(_steps);
    this._stepReferenceFieldCreator.copyXtendMemberForReferences(background);
    EList<Step> _steps_1 = background.getSteps();
    this.generateSteps(_steps_1, inferredJvmType);
  }
  
  public JvmGenericType generateFeatureSuite(final Feature feature, final FeatureFile featureFile, final List<JvmGenericType> scenarios) {
    String _className = this._javaNameProvider.getClassName(feature);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _package = featureFile.getPackage();
          it.setPackageName(_package);
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(feature, _className, _function);
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
      final Background background = feature.getBackground();
      String _className = this._javaNameProvider.getClassName(background);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            it.setAbstract(true);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(background, _className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType infer(final Scenario scenario, final FeatureFile featureFile, final String className, final JvmGenericType superClass) {
    JvmGenericType _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = superClass==null?(JvmParameterizedTypeReference)null:this._typeReferences.createTypeRef(superClass);
      scenario.setExtends(_createTypeRef);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(scenario, className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public void generateStepValues(final Iterable<Step> steps) {
    final Procedure1<Step> _function = new Procedure1<Step>() {
        public void apply(final Step it) {
          FeatureJvmModelInferrer.this.generateStepValues(it);
        }
      };
    IterableExtensions.<Step>forEach(steps, _function);
  }
  
  public void generateStepValues(final Step step) {
    TreeIterator<EObject> _eAllContents = step.eAllContents();
    UnmodifiableIterator<XVariableDeclaration> decs = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
    Iterable<XVariableDeclaration> _iterable = IteratorExtensions.<XVariableDeclaration>toIterable(decs);
    for (final XVariableDeclaration dec : _iterable) {
      String _name = dec.getName();
      boolean _equals = Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES);
      if (_equals) {
        boolean _not = (!(step instanceof StepReference));
        if (_not) {
          this.setStepValueType(dec, ((Step) step));
        }
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
              boolean _or = false;
              if ((step instanceof StepReference)) {
                _or = true;
              } else {
                JvmIdentifiableElement _feature_1 = call.getFeature();
                boolean _equals_2 = Objects.equal(_feature_1, null);
                _or = ((step instanceof StepReference) || _equals_2);
              }
              _and = (_equals_1 && _or);
            }
            if (_and) {
              this.addStepValue(call, dec, step);
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
        boolean _not = (!(step instanceof StepReference));
        if (_not) {
          featureCall.setFeature(operation);
        } else {
          final StepReference stepRef = ((StepReference) step);
          final List<String> arguments = this.stepArgumentsProvider.findStepArguments(stepRef);
          int i = 0;
          boolean _isEmpty = arguments.isEmpty();
          boolean _not_1 = (!_isEmpty);
          if (_not_1) {
            EList<XExpression> _memberCallArguments = featureCall.getMemberCallArguments();
            for (final XExpression ref : _memberCallArguments) {
              {
                final XStringLiteral argument = ((XStringLiteral) ref);
                String _get = arguments.get(i);
                argument.setValue(_get);
                int _plus = (i + 1);
                i = _plus;
              }
            }
          }
        }
      }
    }
  }
  
  public int generateBackgroundStepCalls(final Iterable<Step> steps, final JvmGenericType inferredJvmType) {
    int _xblockexpression = (int) 0;
    {
      int order = 0;
      for (final Step step : steps) {
        {
          int _transformCalls = this.transformCalls(step, inferredJvmType, order);
          order = _transformCalls;
          EList<Step> _and = step.getAnd();
          for (final Step and : _and) {
            int _transformCalls_1 = this.transformCalls(and, inferredJvmType, order);
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
  
  public void generateSteps(final Iterable<Step> steps, final JvmGenericType inferredJvmType, final int start, final Scenario scenario) {
    int order = start;
    for (final Step step : steps) {
      {
        int _transform = this.transform(step, inferredJvmType, order, scenario);
        order = _transform;
        EList<Step> _and = step.getAnd();
        for (final Step and : _and) {
          int _transform_1 = this.transform(and, inferredJvmType, order, scenario);
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
            FeatureJvmModelInferrer.this.generateStepValues(step);
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
              String _plus = ("[PENDING] " + name);
              name = _plus;
              EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
              JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Ignore.class);
              FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
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
  
  public void generateSteps(final Iterable<Step> steps, final JvmGenericType inferredJvmType) {
    for (final Step step : steps) {
      {
        this.transform(step, inferredJvmType);
        EList<Step> _and = step.getAnd();
        for (final Step and : _and) {
          this.transform(and, inferredJvmType);
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
          FeatureJvmModelInferrer.this.generateStepValues(step);
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
    boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    return _add;
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
  }
  
  public List<JvmGenericType> generateExampleClasses(final Scenario scenario, final FeatureFile featureFile, final JvmGenericType inferredJvmType) {
    List<JvmGenericType> _xblockexpression = null;
    {
      final List<JvmGenericType> exampleClasses = CollectionLiterals.<JvmGenericType>newArrayList();
      EList<ExampleTable> _examples = scenario.getExamples();
      for (final ExampleTable example : _examples) {
        {
          EList<ExampleColumn> fields = example.getColumns();
          EList<ExampleRow> _rows = example.getRows();
          boolean _isEmpty = _rows.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<ExampleRow> _rows_1 = example.getRows();
            for (final ExampleRow row : _rows_1) {
              JvmGenericType _createExampleClass = this.createExampleClass(scenario, featureFile, row, fields, inferredJvmType);
              exampleClasses.add(_createExampleClass);
            }
          }
        }
      }
      _xblockexpression = (exampleClasses);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType createExampleClass(final Scenario scenario, final FeatureFile featureFile, final ExampleRow row, final EList<ExampleColumn> fields, final JvmGenericType inferredJvmType) {
    JvmGenericType _xblockexpression = null;
    {
      final String className = this._javaNameProvider.getClassName(row);
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
    JvmVisibility _visibility = source.getVisibility();
    boolean _equals = Objects.equal(_visibility, JvmVisibility.PRIVATE);
    if (_equals) {
      source.setVisibility(JvmVisibility.DEFAULT);
    }
    super.transform(source, container);
  }
  
  public Feature feature(final EObject context) {
    Feature _containerOfType = EcoreUtil2.<Feature>getContainerOfType(context, Feature.class);
    return _containerOfType;
  }
  
  public void init(final XtendClass background, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    if (background instanceof Background) {
      _init((Background)background, inferredJvmType, scenarios);
      return;
    } else if (background instanceof Feature) {
      _init((Feature)background, inferredJvmType, scenarios);
      return;
    } else if (background instanceof Scenario) {
      _init((Scenario)background, inferredJvmType, scenarios);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(background, inferredJvmType, scenarios).toString());
    }
  }
}
