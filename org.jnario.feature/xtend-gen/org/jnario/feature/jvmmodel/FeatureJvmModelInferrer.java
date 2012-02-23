package org.jnario.feature.jvmmodel;

import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
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
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendField;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.naming.JavaNameProvider;
import org.jnario.feature.naming.StepExpressionProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.jvmmodel.CommonJvmModelInferrer;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JunitAnnotationProvider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class FeatureJvmModelInferrer extends CommonJvmModelInferrer {
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
  public void infer(final EObject object, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
      boolean _checkClassPath = this.checkClassPath(object, this.annotationProvider);
      boolean _operator_not = BooleanExtensions.operator_not(_checkClassPath);
      if (_operator_not) {
        return;
      }
      FeatureFile featureFile = ((FeatureFile) object);
      XtendClass _xtendClass = featureFile==null?(XtendClass)null:featureFile.getXtendClass();
      Feature feature = ((Feature) _xtendClass);
      boolean _operator_equals = ObjectExtensions.operator_equals(feature, null);
      if (_operator_equals) {
        return;
      }
      JvmGenericType backgroundClass = null;
      Background _background = feature.getBackground();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_background, null);
      if (_operator_notEquals) {
        {
          JvmGenericType _generateBackground = this.generateBackground(feature, featureFile);
          backgroundClass = _generateBackground;
          acceptor.accept(backgroundClass);
        }
      }
      ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
      final List<JvmGenericType> scenarios = _newArrayList;
      EList<XtendMember> _members = feature.getMembers();
      for (final XtendMember member : _members) {
        {
          final Scenario scenario = ((Scenario) member);
          String _name = feature.getName();
          String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
          String _name_1 = scenario.getName();
          String _scenarioClassName = this._javaNameProvider.getScenarioClassName(_name_1);
          String _operator_plus = StringExtensions.operator_plus(_featureClassName, _scenarioClassName);
          final String className = _operator_plus;
          JvmGenericType _infer = this.infer(scenario, featureFile, className, backgroundClass);
          final JvmGenericType clazz = _infer;
          EList<JvmAnnotationReference> _annotations = clazz.getAnnotations();
          JvmAnnotationReference _runnerAnnotations = this.runnerAnnotations(scenario);
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _runnerAnnotations);
          acceptor.accept(clazz);
          scenarios.add(clazz);
        }
      }
      JvmGenericType _generateFeatureSuite = this.generateFeatureSuite(feature, featureFile, scenarios);
      final JvmGenericType featureClazz = _generateFeatureSuite;
      acceptor.accept(featureClazz);
  }
  
  public JvmGenericType generateFeatureSuite(final Feature feature, final FeatureFile featureFile, final List<JvmGenericType> scenarios) {
    String _name = feature.getName();
    String _featureClassName = this._javaNameProvider.getFeatureClassName(_name);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _featureRunner = FeatureJvmModelInferrer.this.annotationProvider.getFeatureRunner(feature);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _featureRunner);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(feature, org.jnario.runner.Contains.class, scenarios);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
          }
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
    String _operator_plus = StringExtensions.operator_plus(_featureClassName, "Background");
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            it.setAbstract(true);
            Background _background = feature.getBackground();
            FeatureJvmModelInferrer.this.generateBackgroundVariables(_background, it);
            Background _background_1 = feature.getBackground();
            EList<Step> _steps = _background_1.getSteps();
            FeatureJvmModelInferrer.this.generateSteps(_steps, it);
          }
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(feature, _operator_plus, _function);
    return _class;
  }
  
  public JvmGenericType infer(final Scenario scenario, final FeatureFile featureFile, final String className, final JvmGenericType superClass) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            Resource _eResource = featureFile.eResource();
            EList<EObject> _contents = _eResource.getContents();
            CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            String _name = scenario.getName();
            String _trim = _name.trim();
            JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, org.jnario.runner.Named.class, _trim);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            String _package = featureFile.getPackage();
            it.setPackageName(_package);
            String _documentation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(scenario);
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
            boolean hasBackground = false;
            XtendClass _xtendClass = featureFile.getXtendClass();
            Feature feature = ((Feature) _xtendClass);
            int start = 0;
            Background _background = feature.getBackground();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_background, null);
            if (_operator_notEquals) {
              {
                hasBackground = true;
                EList<JvmTypeReference> _superTypes = it.getSuperTypes();
                JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(superClass);
                CollectionExtensions.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
                Background _background_1 = feature.getBackground();
                EList<Step> _steps = _background_1.getSteps();
                int _generateBackgroundStepCalls = FeatureJvmModelInferrer.this.generateBackgroundStepCalls(_steps, it);
                start = _generateBackgroundStepCalls;
              }
            }
            FeatureJvmModelInferrer.this.generateVariables(scenario, feature, it);
            EList<Step> _steps_1 = scenario.getSteps();
            FeatureJvmModelInferrer.this.generateSteps(_steps_1, it, start);
            EList<ExampleTable> _examples = scenario.getExamples();
            boolean _isEmpty = _examples.isEmpty();
            boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
            if (_operator_not) {
              {
                List<JvmGenericType> _generateExampleClasses = FeatureJvmModelInferrer.this.generateExampleClasses(scenario, featureFile, it);
                final List<JvmGenericType> exampleClasses = _generateExampleClasses;
                boolean _isEmpty_1 = exampleClasses.isEmpty();
                boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty_1);
                if (_operator_not_1) {
                  EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                  JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, org.jnario.runner.Contains.class, exampleClasses);
                  CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                }
              }
            }
          }
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(scenario, className, _function);
    return _class;
  }
  
  public void generateVariables(final Scenario scenario, final Feature feature, final JvmGenericType inferredJvmType) {
      EList<ExampleTable> _examples = scenario.getExamples();
      boolean _isEmpty = _examples.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        {
          ArrayList<String> _arrayList = new ArrayList<String>();
          ArrayList<String> fieldNames = _arrayList;
          EList<ExampleTable> _examples_1 = scenario.getExamples();
          for (final ExampleTable table : _examples_1) {
            {
              TreeIterator<EObject> _eAllContents = table.eAllContents();
              UnmodifiableIterator<ExampleColumn> _filter = Iterators.<ExampleColumn>filter(_eAllContents, org.jnario.ExampleColumn.class);
              UnmodifiableIterator<ExampleColumn> allFields = _filter;
              Iterable<ExampleColumn> _iterable = IteratorExtensions.<ExampleColumn>toIterable(allFields);
              for (final ExampleColumn field : _iterable) {
                String _name = field.getName();
                boolean _contains = fieldNames.contains(_name);
                boolean _operator_not_1 = BooleanExtensions.operator_not(_contains);
                if (_operator_not_1) {
                  {
                    EList<JvmMember> _members = inferredJvmType.getMembers();
                    JvmField _field = this.toField(field);
                    CollectionExtensions.<JvmField>operator_add(_members, _field);
                    String _name_1 = field.getName();
                    fieldNames.add(_name_1);
                  }
                }
              }
            }
          }
        }
      }
      TreeIterator<EObject> _eAllContents_1 = scenario.eAllContents();
      UnmodifiableIterator<XVariableDeclaration> _filter_1 = Iterators.<XVariableDeclaration>filter(_eAllContents_1, org.eclipse.xtext.xbase.XVariableDeclaration.class);
      UnmodifiableIterator<XVariableDeclaration> variableDeclarations = _filter_1;
      Iterable<XVariableDeclaration> _iterable_1 = IteratorExtensions.<XVariableDeclaration>toIterable(variableDeclarations);
      this.generateXVariableDeclarations(_iterable_1, inferredJvmType, scenario);
  }
  
  public void generateBackgroundVariables(final Background background, final JvmGenericType inferredJvmType) {
      TreeIterator<EObject> _eAllContents = background.eAllContents();
      UnmodifiableIterator<XVariableDeclaration> _filter = Iterators.<XVariableDeclaration>filter(_eAllContents, org.eclipse.xtext.xbase.XVariableDeclaration.class);
      UnmodifiableIterator<XVariableDeclaration> variableDeclarations = _filter;
      Iterable<XVariableDeclaration> _iterable = IteratorExtensions.<XVariableDeclaration>toIterable(variableDeclarations);
      this.generateXVariableDeclarations(_iterable, inferredJvmType, background);
  }
  
  public void generateXVariableDeclarations(final Iterable<XVariableDeclaration> varDecs, final JvmGenericType inferredJvmType, final EObject scenario) {
    for (final XVariableDeclaration variableDec : varDecs) {
      {
        JvmTypeReference type = null;
        JvmTypeReference _type = variableDec.getType();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_type, null);
        if (_operator_notEquals) {
          JvmTypeReference _type_1 = variableDec.getType();
          type = _type_1;
        } else {
          XExpression _right = variableDec.getRight();
          JvmTypeReference _type_2 = this._iTypeProvider.getType(_right);
          type = _type_2;
        }
        String _simpleName = variableDec.getSimpleName();
        JvmField _field = this._extendedJvmTypesBuilder.toField(scenario, _simpleName, type);
        JvmField field = _field;
        boolean _isWriteable = variableDec.isWriteable();
        boolean _operator_not = BooleanExtensions.operator_not(_isWriteable);
        if (_operator_not) {
          field.setFinal(true);
        }
        field.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmMember> _members = inferredJvmType.getMembers();
        CollectionExtensions.<JvmField>operator_add(_members, field);
      }
    }
  }
  
  public int generateBackgroundStepCalls(final EList<Step> steps, final JvmGenericType inferredJvmType) {
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
      String _javaMethodName = this._javaNameProvider.getJavaMethodName(_nameOf);
      final String methodName = _javaMethodName;
      EList<JvmMember> _members = inferredJvmType.getMembers();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("super.");
                    _builder.append(methodName, "");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    return _builder;
                  }
                };
              FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              ArrayList<JvmAnnotationReference> _testAnnotations = FeatureJvmModelInferrer.this.annotationProvider.getTestAnnotations(step, null, false);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _testAnnotations);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              int _intValue = Integer.valueOf(order).intValue();
              JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, org.jnario.runner.Order.class, Integer.valueOf(_intValue));
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
              EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
              String _nameOf = FeatureJvmModelInferrer.this._stepNameProvider.nameOf(step);
              JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, org.jnario.runner.Named.class, _nameOf);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
            }
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, methodName, _typeForName, _function);
      CollectionExtensions.<JvmOperation>operator_add(_members, _method);
      int _operator_plus = IntegerExtensions.operator_plus(order, 1);
      _xblockexpression = (_operator_plus);
    }
    return _xblockexpression;
  }
  
  public void generateSteps(final EList<Step> steps, final JvmGenericType inferredJvmType, final int start) {
      int order = start;
      for (final Step step : steps) {
        {
          int _transform = this.transform(step, inferredJvmType, order);
          order = _transform;
          EList<Step> _and = step.getAnd();
          for (final Step and : _and) {
            int _transform_1 = this.transform(and, inferredJvmType, order);
            order = _transform_1;
          }
        }
      }
  }
  
  public int transform(final Step step, final JvmGenericType inferredJvmType, final int order) {
    int _xblockexpression = (int) 0;
    {
      EList<JvmMember> _members = inferredJvmType.getMembers();
      String _nameOf = this._stepNameProvider.nameOf(step);
      String _javaMethodName = this._javaNameProvider.getJavaMethodName(_nameOf);
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, step);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              StepExpression _expressionOf = FeatureJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
              XBlockExpression _blockExpression = _expressionOf==null?(XBlockExpression)null:_expressionOf.getBlockExpression();
              FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _blockExpression);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              ArrayList<JvmAnnotationReference> _testAnnotations = FeatureJvmModelInferrer.this.annotationProvider.getTestAnnotations(step, null, false);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _testAnnotations);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              int _intValue = Integer.valueOf(order).intValue();
              JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, org.jnario.runner.Order.class, Integer.valueOf(_intValue));
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
              EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
              String _nameOf = FeatureJvmModelInferrer.this._stepNameProvider.nameOf(step);
              JvmAnnotationReference _annotation_1 = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, org.jnario.runner.Named.class, _nameOf);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
            }
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
      CollectionExtensions.<JvmOperation>operator_add(_members, _method);
      int _operator_plus = IntegerExtensions.operator_plus(order, 1);
      _xblockexpression = (_operator_plus);
    }
    return _xblockexpression;
  }
  
  public void generateSteps(final EList<Step> steps, final JvmGenericType inferredJvmType) {
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
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(step, _javaMethodName, _typeForName, _function);
    boolean _operator_add = CollectionExtensions.<JvmOperation>operator_add(_members, _method);
    return _operator_add;
  }
  
  public List<JvmGenericType> generateExampleClasses(final Scenario scenario, final FeatureFile featureFile, final JvmGenericType inferredJvmType) {
    List<JvmGenericType> _xblockexpression = null;
    {
      int exampleTable = 1;
      ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
      final List<JvmGenericType> exampleClasses = _newArrayList;
      EList<ExampleTable> _examples = scenario.getExamples();
      for (final ExampleTable example : _examples) {
        {
          EList<ExampleColumn> _columns = example.getColumns();
          EList<ExampleColumn> fields = _columns;
          int exampleNumber = 1;
          EList<ExampleRow> _rows = example.getRows();
          boolean _isEmpty = _rows.isEmpty();
          boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
          if (_operator_not) {
            EList<ExampleRow> _rows_1 = example.getRows();
            for (final ExampleRow row : _rows_1) {
              {
                JvmGenericType _createExampleClass = this.createExampleClass(scenario, featureFile, row, fields, exampleTable, exampleNumber, inferredJvmType);
                CollectionExtensions.<JvmGenericType>operator_add(exampleClasses, _createExampleClass);
                int _operator_plus = IntegerExtensions.operator_plus(exampleNumber, 1);
                exampleNumber = _operator_plus;
              }
            }
          }
          int _operator_plus_1 = IntegerExtensions.operator_plus(exampleTable, 1);
          exampleTable = _operator_plus_1;
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
      String _operator_plus = StringExtensions.operator_plus(_featureClassName, _scenarioClassName);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "ExampleTable");
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, Integer.valueOf(exampleTable));
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "Example");
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, Integer.valueOf(exampleNumber));
      final String className = _operator_plus_4;
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmParameterizedTypeReference _createTypeRef = FeatureJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
              CollectionExtensions.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
              Resource _eResource = featureFile.eResource();
              EList<EObject> _contents = _eResource.getContents();
              CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
              String _package = featureFile.getPackage();
              it.setPackageName(_package);
              EList<JvmMember> _members = it.getMembers();
              JvmConstructor _generateExampleConstructor = FeatureJvmModelInferrer.this.generateExampleConstructor(row, fields, className);
              CollectionExtensions.<JvmConstructor>operator_add(_members, _generateExampleConstructor);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _featureRunner = FeatureJvmModelInferrer.this.annotationProvider.getFeatureRunner(row);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _featureRunner);
              String _operator_plus = StringExtensions.operator_plus("ExampleTable ", Integer.valueOf(exampleTable));
              String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ", ");
              String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Example ");
              String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, Integer.valueOf(exampleNumber));
              String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " [");
              String description = _operator_plus_4;
              int i = 0;
              for (final ExampleColumn field : fields) {
                {
                  String _name = field.getName();
                  String _operator_plus_5 = StringExtensions.operator_plus(description, _name);
                  String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " = ");
                  StringBuilderBasedAppendable _cellToAppendable = FeatureJvmModelInferrer.this.cellToAppendable(row, i);
                  String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, _cellToAppendable);
                  String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, ", ");
                  description = _operator_plus_8;
                  int _operator_plus_9 = IntegerExtensions.operator_plus(i, 1);
                  i = _operator_plus_9;
                }
              }
              int _length = description.length();
              int _operator_minus = IntegerExtensions.operator_minus(_length, 1);
              int _operator_minus_1 = IntegerExtensions.operator_minus(_operator_minus, 1);
              String _substring = description.substring(0, _operator_minus_1);
              String _operator_plus_10 = StringExtensions.operator_plus(_substring, "]");
              description = _operator_plus_10;
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              String _replace = description.replace("\"", "\\\"");
              JvmAnnotationReference _annotation = FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(row, org.jnario.runner.Named.class, _replace);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
            }
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
          {
            it.setVisibility(JvmVisibility.PUBLIC);
            final Function1<ImportManager,String> _function = new Function1<ImportManager,String>() {
                public String apply(final ImportManager it) {
                  String _xblockexpression = null;
                  {
                    StringBuilder _stringBuilder = new StringBuilder();
                    StringBuilder constructor = _stringBuilder;
                    int i = 0;
                    for (final ExampleColumn field : fields) {
                      {
                        constructor.append("super.");
                        String _name = field.getName();
                        constructor.append(_name);
                        constructor.append(" = ");
                        StringBuilderBasedAppendable _cellToAppendable = FeatureJvmModelInferrer.this.cellToAppendable(row, i);
                        String _string = _cellToAppendable.toString();
                        constructor.append(_string);
                        constructor.append(";\n");
                        int _operator_plus = IntegerExtensions.operator_plus(i, 1);
                        i = _operator_plus;
                      }
                    }
                    String _string_1 = constructor.toString();
                    _xblockexpression = (_string_1);
                  }
                  return _xblockexpression;
                }
              };
            FeatureJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        }
      };
    JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(row, className, _function);
    return _constructor;
  }
  
  public void transform(final XtendField source, final JvmGenericType container) {
    boolean _operator_and = false;
    boolean _operator_or = false;
    boolean _isExtension = source.isExtension();
    if (_isExtension) {
      _operator_or = true;
    } else {
      String _name = source.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      _operator_or = BooleanExtensions.operator_or(_isExtension, _operator_notEquals);
    }
    if (!_operator_or) {
      _operator_and = false;
    } else {
      JvmTypeReference _type = source.getType();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_type, null);
      _operator_and = BooleanExtensions.operator_and(_operator_or, _operator_notEquals_1);
    }
    if (_operator_and) {
      {
        JvmField _createJvmField = this.typesFactory.createJvmField();
        JvmField field = _createJvmField;
        String _computeFieldName = this.computeFieldName(source, container);
        field.setSimpleName(_computeFieldName);
        EList<JvmMember> _members = container.getMembers();
        CollectionExtensions.<JvmField>operator_add(_members, field);
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
}
