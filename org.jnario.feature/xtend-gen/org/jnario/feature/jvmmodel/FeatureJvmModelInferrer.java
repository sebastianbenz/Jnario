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
import org.eclipse.xtend.core.xtend.XtendFile;
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
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.feature.jvmmodel.StepReferenceFieldCreator;
import org.jnario.feature.naming.FeatureClassNameProvider;
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
  private FeatureClassNameProvider _featureClassNameProvider;
  
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
  
  public void infer(final EObject object, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    boolean _checkClassPath = this.checkClassPath(object, this.annotationProvider);
    boolean _not = (!_checkClassPath);
    if (_not) {
      return;
    }
    final Feature feature = this.resolveFeature(object);
    boolean _equals = Objects.equal(feature, null);
    if (_equals) {
      return;
    }
    Background _background = feature.getBackground();
    final JvmGenericType background = this.toClass(_background, acceptor);
    EList<Scenario> _scenarios = feature.getScenarios();
    final ArrayList<JvmGenericType> scenarios = this.toClass(_scenarios, acceptor, background);
    this.toClass(feature, acceptor, scenarios);
  }
  
  public Feature resolveFeature(final EObject root) {
    final FeatureFile featureFile = ((FeatureFile) root);
    EList<XtendClass> _xtendClasses = featureFile.getXtendClasses();
    boolean _isEmpty = _xtendClasses.isEmpty();
    if (_isEmpty) {
      return null;
    }
    EList<XtendClass> _xtendClasses_1 = featureFile.getXtendClasses();
    final XtendClass xtendClass = _xtendClasses_1.get(0);
    return ((Feature) xtendClass);
  }
  
  public JvmGenericType toClass(final Background background, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xblockexpression = null;
    {
      boolean _equals = Objects.equal(background, null);
      if (_equals) {
        return null;
      }
      final JvmGenericType backgroundClass = this.toClass(background);
      backgroundClass.setAbstract(true);
      List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
      this.register(acceptor, background, backgroundClass, _emptyList);
      _xblockexpression = (backgroundClass);
    }
    return _xblockexpression;
  }
  
  public ArrayList<JvmGenericType> toClass(final List<Scenario> scenarios, final IJvmDeclaredTypeAcceptor acceptor, final JvmGenericType backgroundType) {
    final ArrayList<JvmGenericType> result = CollectionLiterals.<JvmGenericType>newArrayList();
    final Procedure1<Scenario> _function = new Procedure1<Scenario>() {
        public void apply(final Scenario it) {
          final JvmGenericType inferredJvmType = FeatureJvmModelInferrer.this.toClass(it, backgroundType);
          List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
          FeatureJvmModelInferrer.this.register(acceptor, it, inferredJvmType, _emptyList);
          result.add(inferredJvmType);
        }
      };
    IterableExtensions.<Scenario>forEach(scenarios, _function);
    return result;
  }
  
  public void toClass(final Feature feature, final IJvmDeclaredTypeAcceptor acceptor, final List<JvmGenericType> scenarios) {
    final JvmGenericType inferredJvmType = this.toClass(feature);
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
  
  public JvmGenericType toClass(final XtendClass xtendClass) {
    JvmGenericType _class = this.toClass(xtendClass, null);
    return _class;
  }
  
  public JvmGenericType toClass(final XtendClass xtendClass, final JvmGenericType superClass) {
    JvmGenericType _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(superClass, null));
      if (_notEquals) {
        JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(superClass);
        xtendClass.setExtends(_createTypeRef);
      }
      String _className = this._featureClassNameProvider.getClassName(xtendClass);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            String _packageName = xtendClass.getPackageName();
            it.setPackageName(_packageName);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(xtendClass, _className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
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
    final Procedure1<Step> _function = new Procedure1<Step>() {
        public void apply(final Step it) {
          FeatureJvmModelInferrer.this.generateStepValues(it);
        }
      };
    IterableExtensions.<Step>forEach(_steps, _function);
    this._stepReferenceFieldCreator.copyXtendMemberForReferences(scenario);
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    JvmAnnotationReference _runnerAnnotations = this.runnerAnnotations(scenario);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _runnerAnnotations);
    String _name = scenario.getName();
    String _trim = _name.trim();
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(scenario, Named.class, _trim);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation);
    final Feature feature = this.feature(scenario);
    int start = 0;
    final Background background = feature.getBackground();
    boolean _and = false;
    boolean _not = (!(scenario instanceof Background));
    if (!_not) {
      _and = false;
    } else {
      boolean _notEquals = (!Objects.equal(background, null));
      _and = (_not && _notEquals);
    }
    if (_and) {
      EList<Step> _steps_1 = background.getSteps();
      int _generateBackgroundStepCalls = this.generateBackgroundStepCalls(_steps_1, inferredJvmType);
      start = _generateBackgroundStepCalls;
    }
    this.generateVariables(scenario, feature, inferredJvmType);
    EList<Step> _steps_2 = scenario.getSteps();
    this.generateSteps(_steps_2, inferredJvmType, start, scenario);
    EList<ExampleTable> _examples = scenario.getExamples();
    boolean _isEmpty = _examples.isEmpty();
    boolean _not_1 = (!_isEmpty);
    if (_not_1) {
      final List<JvmGenericType> exampleClasses = this.generateExampleClasses(scenario, inferredJvmType);
      boolean _isEmpty_1 = exampleClasses.isEmpty();
      boolean _not_2 = (!_isEmpty_1);
      if (_not_2) {
        JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(scenario, Contains.class, exampleClasses);
        this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation_1);
      }
    }
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
  
  public void generateStepValues(final Step step) {
    TreeIterator<EObject> _eAllContents = step.eAllContents();
    UnmodifiableIterator<XVariableDeclaration> decs = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
    final List<String> arguments = this.stepArgumentsProvider.findStepArguments(step);
    boolean _isEmpty = arguments.isEmpty();
    if (_isEmpty) {
      return;
    }
    final Procedure1<XVariableDeclaration> _function = new Procedure1<XVariableDeclaration>() {
        public void apply(final XVariableDeclaration dec) {
          String _name = dec.getName();
          boolean _equals = Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES);
          if (_equals) {
            boolean _not = (!(step instanceof StepReference));
            if (_not) {
              FeatureJvmModelInferrer.this.setStepValueType(dec, ((Step) step));
            }
            TreeIterator<EObject> _eAllContents = step.eAllContents();
            UnmodifiableIterator<XMemberFeatureCall> calls = Iterators.<XMemberFeatureCall>filter(_eAllContents, XMemberFeatureCall.class);
            int index = 0;
            Iterable<XMemberFeatureCall> _iterable = IteratorExtensions.<XMemberFeatureCall>toIterable(calls);
            for (final XMemberFeatureCall call : _iterable) {
              boolean _and = false;
              int _size = arguments.size();
              boolean _greaterThan = (_size > index);
              if (!_greaterThan) {
                _and = false;
              } else {
                XExpression _memberCallTarget = call.getMemberCallTarget();
                _and = (_greaterThan && (_memberCallTarget instanceof XFeatureCall));
              }
              if (_and) {
                XExpression _memberCallTarget_1 = call.getMemberCallTarget();
                XFeatureCall featureCall = ((XFeatureCall) _memberCallTarget_1);
                boolean _and_1 = false;
                JvmIdentifiableElement _feature = featureCall.getFeature();
                boolean _equals_1 = Objects.equal(_feature, dec);
                if (!_equals_1) {
                  _and_1 = false;
                } else {
                  boolean _or = false;
                  if ((step instanceof StepReference)) {
                    _or = true;
                  } else {
                    JvmIdentifiableElement _feature_1 = call.getFeature();
                    boolean _equals_2 = Objects.equal(_feature_1, null);
                    _or = ((step instanceof StepReference) || _equals_2);
                  }
                  _and_1 = (_equals_1 && _or);
                }
                if (_and_1) {
                  String _get = arguments.get(index);
                  FeatureJvmModelInferrer.this.addStepValue(call, dec, step, _get);
                  int _plus = (index + 1);
                  index = _plus;
                }
              }
            }
          }
        }
      };
    IteratorExtensions.<XVariableDeclaration>forEach(decs, _function);
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
  
  public void addStepValue(final XMemberFeatureCall featureCall, final XVariableDeclaration dec, final XtendMember step, final String arg) {
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
          EList<XExpression> _memberCallArguments = featureCall.getMemberCallArguments();
          for (final XExpression ref : _memberCallArguments) {
            {
              final XStringLiteral argument = ((XStringLiteral) ref);
              argument.setValue(arg);
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
      final String methodName = this._stepNameProvider.getMethodName(step);
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
            String _describe = FeatureJvmModelInferrer.this._stepNameProvider.describe(step);
            JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, _describe);
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
      String _methodName = this._stepNameProvider.getMethodName(step);
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
            String name = FeatureJvmModelInferrer.this._stepNameProvider.describe(step);
            boolean _and = false;
            boolean _not = (!(step instanceof Given));
            if (!_not) {
              _and = false;
            } else {
              StepExpression _expressionOf_1 = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
              boolean _equals = Objects.equal(_expressionOf_1, null);
              _and = (_not && _equals);
            }
            if (_and) {
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
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _methodName, _typeForName, _function);
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
    String _methodName = this._stepNameProvider.getMethodName(step);
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          StepExpression _expressionOf = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
          XBlockExpression _blockExpression = _expressionOf==null?(XBlockExpression)null:_expressionOf.getBlockExpression();
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _blockExpression);
          FeatureJvmModelInferrer.this.generateStepValues(step);
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _methodName, _typeForName, _function);
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
        EList<ExampleColumn> _columns = table.getColumns();
        for (final ExampleColumn field : _columns) {
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
  
  public List<JvmGenericType> generateExampleClasses(final Scenario scenario, final JvmGenericType inferredJvmType) {
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
              JvmGenericType _createExampleClass = this.createExampleClass(scenario, row, fields, inferredJvmType);
              exampleClasses.add(_createExampleClass);
            }
          }
        }
      }
      _xblockexpression = (exampleClasses);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType createExampleClass(final Scenario scenario, final ExampleRow row, final EList<ExampleColumn> fields, final JvmGenericType inferredJvmType) {
    JvmGenericType _xblockexpression = null;
    {
      final String className = this._featureClassNameProvider.getClassName(row);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
            final XtendFile featureFile = FeatureJvmModelInferrer.this.xtendFile(scenario);
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
  
  public Feature feature(final EObject context) {
    Feature _containerOfType = EcoreUtil2.<Feature>getContainerOfType(context, Feature.class);
    return _containerOfType;
  }
  
  public void init(final XtendClass feature, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    if (feature instanceof Feature) {
      _init((Feature)feature, inferredJvmType, scenarios);
      return;
    } else if (feature instanceof Scenario) {
      _init((Scenario)feature, inferredJvmType, scenarios);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature, inferredJvmType, scenarios).toString());
    }
  }
}
