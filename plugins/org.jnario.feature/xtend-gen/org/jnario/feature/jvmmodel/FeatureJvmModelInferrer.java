/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.JvmFieldReferenceUpdater;
import org.jnario.feature.jvmmodel.PendingStepsCalculator;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.feature.jvmmodel.StepReferenceFieldCreator;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.lib.StepArguments;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.SourceAdapter;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {
  public final static String STEP_VALUES = "args";
  
  @Inject
  @Extension
  private PendingStepsCalculator pendingStepsCalculator;
  
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private StepNameProvider _stepNameProvider;
  
  @Inject
  @Extension
  private StepExpressionProvider _stepExpressionProvider;
  
  @Inject
  @Extension
  private StepReferenceFieldCreator _stepReferenceFieldCreator;
  
  @Inject
  @Extension
  private StepArgumentsProvider stepArgumentsProvider;
  
  @Inject
  @Extension
  private IJvmModelAssociator _iJvmModelAssociator;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private JvmFieldReferenceUpdater _jvmFieldReferenceUpdater;
  
  @Inject
  private TypesFactory typesFactory;
  
  public void doInfer(final EObject object, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if ((!(object instanceof XtendFile))) {
      return;
    }
    final ArrayList<Runnable> doLater = CollectionLiterals.<Runnable>newArrayList();
    final Feature feature = this.resolveFeature(object);
    boolean _or = false;
    boolean _equals = Objects.equal(feature, null);
    if (_equals) {
      _or = true;
    } else {
      String _name = feature.getName();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_name);
      _or = _isNullOrEmpty;
    }
    if (_or) {
      return;
    }
    Background _background = feature.getBackground();
    final JvmGenericType background = this.toClass(_background, acceptor, doLater, preIndexingPhase);
    EList<Scenario> _scenarios = feature.getScenarios();
    final ArrayList<JvmGenericType> scenarios = this.toClass(_scenarios, acceptor, background, doLater, preIndexingPhase);
    this.toClass(feature, acceptor, scenarios, background, doLater, preIndexingPhase);
    if ((!preIndexingPhase)) {
      for (final Runnable runnable : doLater) {
        runnable.run();
      }
    }
  }
  
  public Feature resolveFeature(final EObject root) {
    final FeatureFile featureFile = ((FeatureFile) root);
    EList<XtendTypeDeclaration> _xtendTypes = featureFile.getXtendTypes();
    boolean _isEmpty = _xtendTypes.isEmpty();
    if (_isEmpty) {
      return null;
    }
    EList<XtendTypeDeclaration> _xtendTypes_1 = featureFile.getXtendTypes();
    final XtendTypeDeclaration xtendClass = _xtendTypes_1.get(0);
    return ((Feature) xtendClass);
  }
  
  public JvmGenericType toClass(final Background background, final IJvmDeclaredTypeAcceptor acceptor, final List<Runnable> doLater, final boolean preIndexingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      boolean _equals = Objects.equal(background, null);
      if (_equals) {
        return null;
      }
      List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
      _xblockexpression = this.toClass(background, _emptyList, acceptor, doLater, preIndexingPhase);
    }
    return _xblockexpression;
  }
  
  public ArrayList<JvmGenericType> toClass(final List<Scenario> scenarios, final IJvmDeclaredTypeAcceptor acceptor, final JvmGenericType backgroundType, final List<Runnable> doLater, final boolean preIndexingPhase) {
    final ArrayList<JvmGenericType> result = CollectionLiterals.<JvmGenericType>newArrayList();
    final Procedure1<Scenario> _function = new Procedure1<Scenario>() {
      public void apply(final Scenario it) {
        List<JvmGenericType> _emptyList = CollectionLiterals.<JvmGenericType>emptyList();
        final JvmGenericType inferredJvmType = FeatureJvmModelInferrer.this.toClass(it, _emptyList, acceptor, doLater, preIndexingPhase);
        result.add(inferredJvmType);
      }
    };
    IterableExtensions.<Scenario>forEach(scenarios, _function);
    return result;
  }
  
  public void toClass(final Feature feature, final IJvmDeclaredTypeAcceptor acceptor, final List<JvmGenericType> scenarios, final JvmGenericType background, final List<Runnable> doLater, final boolean preIndexingPhase) {
    this.addSuperClass(feature);
    final JvmGenericType inferredJvmType = this.toClass(feature, scenarios, acceptor, doLater, preIndexingPhase);
    boolean _equals = Objects.equal(background, null);
    if (_equals) {
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
        }
      };
      IterableExtensions.<JvmGenericType>forEach(scenarios, _function);
    } else {
      EList<JvmTypeReference> _superTypes = background.getSuperTypes();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(inferredJvmType);
      this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
      final Procedure1<JvmGenericType> _function_1 = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(background);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
        }
      };
      IterableExtensions.<JvmGenericType>forEach(scenarios, _function_1);
    }
  }
  
  public boolean register(final IJvmDeclaredTypeAcceptor acceptor, final XtendClass source, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios, final List<Runnable> doLater, final boolean preIndexingPhase) {
    boolean _xifexpression = false;
    if ((!preIndexingPhase)) {
      final Runnable _function = new Runnable() {
        public void run() {
          FeatureJvmModelInferrer.this.init(source, inferredJvmType, scenarios);
        }
      };
      _xifexpression = doLater.add(_function);
    }
    return _xifexpression;
  }
  
  public JvmGenericType toClass(final XtendClass xtendClass, final List<JvmGenericType> scenarios, final IJvmDeclaredTypeAcceptor acceptor, final List<Runnable> doLater, final boolean preIndexingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      final JvmGenericType javaType = this.typesFactory.createJvmGenericType();
      XtendFile _xtendFile = this.xtendFile(xtendClass);
      this.setNameAndAssociate(_xtendFile, xtendClass, javaType);
      acceptor.<JvmGenericType>accept(javaType);
      if ((!preIndexingPhase)) {
        final Runnable _function = new Runnable() {
          public void run() {
            FeatureJvmModelInferrer.this.init(xtendClass, javaType, scenarios);
          }
        };
        doLater.add(_function);
      }
      _xblockexpression = javaType;
    }
    return _xblockexpression;
  }
  
  protected void _init(final Feature feature, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    boolean _isEmpty = scenarios.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      final Function1<JvmGenericType, JvmTypeReference> _function = new Function1<JvmGenericType, JvmTypeReference>() {
        public JvmTypeReference apply(final JvmGenericType it) {
          return FeatureJvmModelInferrer.this._typeReferences.createTypeRef(it);
        }
      };
      List<JvmTypeReference> _map = ListExtensions.<JvmGenericType, JvmTypeReference>map(scenarios, _function);
      _testRuntime.addChildren(feature, inferredJvmType, _map);
    }
    String _describe = this._stepNameProvider.describe(feature);
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(feature, Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation);
    super.initialize(feature, inferredJvmType);
    TestRuntimeSupport _testRuntime_1 = this.getTestRuntime();
    final Function1<JvmGenericType, JvmTypeReference> _function_1 = new Function1<JvmGenericType, JvmTypeReference>() {
      public JvmTypeReference apply(final JvmGenericType it) {
        return FeatureJvmModelInferrer.this._typeReferences.createTypeRef(it);
      }
    };
    List<JvmTypeReference> _map_1 = ListExtensions.<JvmGenericType, JvmTypeReference>map(scenarios, _function_1);
    _testRuntime_1.updateFeature(feature, inferredJvmType, _map_1);
  }
  
  protected void _init(final Scenario scenario, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
    this._stepReferenceFieldCreator.copyXtendMemberForReferences(scenario);
    EList<XtendMember> _members = scenario.getMembers();
    Iterable<XtendField> _filter = Iterables.<XtendField>filter(_members, XtendField.class);
    final Procedure1<XtendField> _function = new Procedure1<XtendField>() {
      public void apply(final XtendField it) {
        FeatureJvmModelInferrer.this.transform2(it, inferredJvmType);
      }
    };
    IterableExtensions.<XtendField>forEach(_filter, _function);
    final EList<JvmAnnotationReference> annotations = inferredJvmType.getAnnotations();
    TestRuntimeSupport _testRuntime = this.getTestRuntime();
    _testRuntime.updateScenario(scenario, inferredJvmType);
    String _describe = this._stepNameProvider.describe(scenario);
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(scenario, Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(annotations, _annotation);
    final Feature feature = this.feature(scenario);
    int start = 0;
    EList<XAnnotation> _annotations = feature.getAnnotations();
    this.translateAnnotationsTo(_annotations, inferredJvmType);
    final Background background = feature.getBackground();
    ArrayList<Step> allSteps = CollectionLiterals.<Step>newArrayList();
    boolean _notEquals = (!Objects.equal(background, null));
    if (_notEquals) {
      EList<Step> _steps = background.getSteps();
      allSteps.addAll(_steps);
    }
    EList<Step> _steps_1 = scenario.getSteps();
    allSteps.addAll(_steps_1);
    this.pendingStepsCalculator.setSteps(allSteps);
    boolean _and = false;
    if (!(!(scenario instanceof Background))) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(background, null));
      _and = _notEquals_1;
    }
    if (_and) {
      EList<Step> _steps_2 = background.getSteps();
      int _generateBackgroundStepCalls = this.generateBackgroundStepCalls(_steps_2, inferredJvmType);
      start = _generateBackgroundStepCalls;
    }
    EList<Step> _steps_3 = scenario.getSteps();
    this.generateSteps(_steps_3, inferredJvmType, start, scenario);
    super.initialize(scenario, inferredJvmType);
    EList<Step> _steps_4 = scenario.getSteps();
    Iterable<StepReference> _filter_1 = Iterables.<StepReference>filter(_steps_4, StepReference.class);
    final Procedure1<StepReference> _function_1 = new Procedure1<StepReference>() {
      public void apply(final StepReference it) {
        StepImplementation _reference = it.getReference();
        boolean _equals = Objects.equal(_reference, null);
        if (_equals) {
          return;
        }
        StepImplementation _reference_1 = it.getReference();
        final Scenario original = EcoreUtil2.<Scenario>getContainerOfType(_reference_1, Scenario.class);
        boolean _equals_1 = Objects.equal(original, null);
        if (_equals_1) {
          return;
        }
        final XExpression expr = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(it);
        FeatureJvmModelInferrer.this.updateReferences(original, expr, inferredJvmType);
      }
    };
    IterableExtensions.<StepReference>forEach(_filter_1, _function_1);
    EList<XtendMember> _members_1 = scenario.getMembers();
    Iterable<XtendField> _filter_2 = Iterables.<XtendField>filter(_members_1, XtendField.class);
    final Function1<XtendField, Boolean> _function_2 = new Function1<XtendField, Boolean>() {
      public Boolean apply(final XtendField it) {
        XExpression _initialValue = it.getInitialValue();
        return Boolean.valueOf((!Objects.equal(_initialValue, null)));
      }
    };
    Iterable<XtendField> _filter_3 = IterableExtensions.<XtendField>filter(_filter_2, _function_2);
    final Procedure1<XtendField> _function_3 = new Procedure1<XtendField>() {
      public void apply(final XtendField it) {
        final EObject source = SourceAdapter.find(it);
        boolean _equals = Objects.equal(source, null);
        if (_equals) {
          return;
        }
        final Scenario original = EcoreUtil2.<Scenario>getContainerOfType(source, Scenario.class);
        XExpression _initialValue = it.getInitialValue();
        FeatureJvmModelInferrer.this.updateReferences(original, _initialValue, inferredJvmType);
      }
    };
    IterableExtensions.<XtendField>forEach(_filter_3, _function_3);
  }
  
  public void updateReferences(final Scenario original, final XExpression expr, final JvmGenericType inferredJvmType) {
    Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(original);
    Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(_jvmElements, JvmGenericType.class);
    final Function1<JvmGenericType, Boolean> _function = new Function1<JvmGenericType, Boolean>() {
      public Boolean apply(final JvmGenericType it) {
        EObject _primarySourceElement = FeatureJvmModelInferrer.this._iJvmModelAssociations.getPrimarySourceElement(it);
        return Boolean.valueOf(Objects.equal(_primarySourceElement, original));
      }
    };
    final JvmGenericType originalType = IterableExtensions.<JvmGenericType>findFirst(_filter, _function);
    this._jvmFieldReferenceUpdater.updateReferences(expr, originalType, inferredJvmType);
  }
  
  protected void transform(final XtendField source, final JvmGenericType container) {
  }
  
  protected void transform2(final XtendField source, final JvmGenericType container) {
    super.transform(source, container);
  }
  
  protected void transform(final XtendFunction source, final JvmGenericType container, final boolean allowDispatch) {
  }
  
  protected String computeFieldName(final XtendField field) {
    String _xblockexpression = null;
    {
      XtendField source = field;
      boolean _and = false;
      ICompositeNode _node = NodeModelUtils.getNode(source);
      boolean _equals = Objects.equal(_node, null);
      if (!_equals) {
        _and = false;
      } else {
        boolean _notEquals = (!Objects.equal(source, null));
        _and = _notEquals;
      }
      boolean _while = _and;
      while (_while) {
        EObject _find = SourceAdapter.find(source);
        source = ((XtendField) _find);
        boolean _and_1 = false;
        ICompositeNode _node_1 = NodeModelUtils.getNode(source);
        boolean _equals_1 = Objects.equal(_node_1, null);
        if (!_equals_1) {
          _and_1 = false;
        } else {
          boolean _notEquals_1 = (!Objects.equal(source, null));
          _and_1 = _notEquals_1;
        }
        _while = _and_1;
      }
      _xblockexpression = super.computeFieldName(((XtendField) source));
    }
    return _xblockexpression;
  }
  
  public void generateStepValues(final Step step) {
    final List<String> arguments = this.stepArgumentsProvider.findStepArguments(step);
    final XExpression stepExpression = step.getExpression();
    boolean _or = false;
    boolean _isEmpty = arguments.isEmpty();
    if (_isEmpty) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(stepExpression, null);
      _or = _equals;
    }
    if (_or) {
      return;
    }
    TreeIterator<EObject> _eAllContents = stepExpression.eAllContents();
    Iterator<XVariableDeclaration> _filter = Iterators.<XVariableDeclaration>filter(_eAllContents, XVariableDeclaration.class);
    final Function1<XVariableDeclaration, Boolean> _function = new Function1<XVariableDeclaration, Boolean>() {
      public Boolean apply(final XVariableDeclaration it) {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, FeatureJvmModelInferrer.STEP_VALUES));
      }
    };
    Iterator<XVariableDeclaration> decs = IteratorExtensions.<XVariableDeclaration>filter(_filter, _function);
    boolean _isEmpty_1 = IteratorExtensions.isEmpty(decs);
    if (_isEmpty_1) {
      return;
    }
    final XVariableDeclaration dec = IteratorExtensions.<XVariableDeclaration>head(decs);
    this.setStepValueType(dec, ((Step) step));
    if ((step instanceof StepImplementation)) {
      return;
    }
    TreeIterator<EObject> _eAllContents_1 = stepExpression.eAllContents();
    Iterator<XConstructorCall> calls = Iterators.<XConstructorCall>filter(_eAllContents_1, XConstructorCall.class);
    final XConstructorCall argsConstructor = IteratorExtensions.<XConstructorCall>head(calls);
    EList<XExpression> _arguments = argsConstructor.getArguments();
    _arguments.clear();
    final Procedure1<String> _function_1 = new Procedure1<String>() {
      public void apply(final String it) {
        final XStringLiteral arg = XbaseFactory.eINSTANCE.createXStringLiteral();
        arg.setValue(it);
        EList<XExpression> _arguments = argsConstructor.getArguments();
        FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<XStringLiteral>operator_add(_arguments, arg);
      }
    };
    IterableExtensions.<String>forEach(arguments, _function_1);
  }
  
  public void setStepValueType(final XVariableDeclaration variableDec, final Step step) {
    JvmTypeReference typeRef = this._typeReferences.getTypeForName(StepArguments.class, step);
    boolean _or = false;
    boolean _equals = Objects.equal(typeRef, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _eIsProxy = typeRef.eIsProxy();
      _or = _eIsProxy;
    }
    if (_or) {
      return;
    }
    variableDec.setType(typeRef);
    JvmType _type = typeRef.getType();
    final JvmGenericType type = ((JvmGenericType) _type);
    boolean _or_1 = false;
    boolean _equals_1 = Objects.equal(type, null);
    if (_equals_1) {
      _or_1 = true;
    } else {
      boolean _eIsProxy_1 = type.eIsProxy();
      _or_1 = _eIsProxy_1;
    }
    if (_or_1) {
      return;
    }
    XExpression _right = variableDec.getRight();
    XConstructorCall constructor = ((XConstructorCall) _right);
    EList<JvmMember> _members = type.getMembers();
    Iterator<JvmMember> _iterator = _members.iterator();
    final UnmodifiableIterator<JvmConstructor> constructors = Iterators.<JvmConstructor>filter(_iterator, JvmConstructor.class);
    JvmConstructor _next = constructors.next();
    constructor.setConstructor(_next);
  }
  
  public int generateBackgroundStepCalls(final Iterable<Step> steps, final JvmGenericType inferredJvmType) {
    int _xblockexpression = (int) 0;
    {
      int order = 0;
      for (final Step step : steps) {
        int _transformCalls = this.transformCalls(step, inferredJvmType, order);
        order = _transformCalls;
      }
      _xblockexpression = order;
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
              a.append((("super." + methodName) + "();"));
            }
          };
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
          FeatureJvmModelInferrer.this.markAsPending(it, step);
          FeatureJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(step, it);
          TestRuntimeSupport _testRuntime = FeatureJvmModelInferrer.this.getTestRuntime();
          _testRuntime.markAsTestMethod(step, it);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          int _intValue = Integer.valueOf(order).intValue();
          JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Order.class, Integer.valueOf(_intValue));
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          String _describe = FeatureJvmModelInferrer.this._stepNameProvider.describe(step);
          JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, _describe);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, methodName, _typeForName, _function);
      this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (order + 1);
    }
    return _xblockexpression;
  }
  
  public void generateSteps(final Iterable<Step> steps, final JvmGenericType inferredJvmType, final int start, final Scenario scenario) {
    int order = start;
    for (final Step step : steps) {
      int _transform = this.transform(step, inferredJvmType, order, scenario);
      order = _transform;
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
          it.setDeclaringType(inferredJvmType);
          final XExpression stepExpression = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
          FeatureJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(step, it);
          FeatureJvmModelInferrer.this.generateStepValues(step);
          FeatureJvmModelInferrer.this.setBody(it, stepExpression);
          TestRuntimeSupport _testRuntime = FeatureJvmModelInferrer.this.getTestRuntime();
          _testRuntime.markAsTestMethod(step, it);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          int _intValue = Integer.valueOf(order).intValue();
          JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Order.class, Integer.valueOf(_intValue));
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          String name = FeatureJvmModelInferrer.this._stepNameProvider.describe(step);
          FeatureJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(step, it);
          FeatureJvmModelInferrer.this.markAsPending(it, step);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, Named.class, name);
          FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
        }
      };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _methodName, _typeForName, _function);
      this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (order + 1);
    }
    return _xblockexpression;
  }
  
  public Feature feature(final EObject context) {
    return EcoreUtil2.<Feature>getContainerOfType(context, Feature.class);
  }
  
  public void markAsPending(final JvmOperation operation, final Step step) {
    Boolean _isPendingOrAPreviousStepIsPending = this.pendingStepsCalculator.isPendingOrAPreviousStepIsPending(step);
    if ((_isPendingOrAPreviousStepIsPending).booleanValue()) {
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      _testRuntime.markAsPending(step, operation);
    }
  }
  
  public void init(final EObject feature, final JvmGenericType inferredJvmType, final List<JvmGenericType> scenarios) {
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
