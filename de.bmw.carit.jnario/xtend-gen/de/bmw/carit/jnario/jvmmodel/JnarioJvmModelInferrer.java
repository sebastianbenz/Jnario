package de.bmw.carit.jnario.jvmmodel;

import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.generator.JnarioCompiler;
import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.ExampleTable;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.naming.JavaNameProvider;
import de.bmw.carit.jnario.naming.StepExpressionProvider;
import de.bmw.carit.jnario.naming.StepNameProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
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
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendField;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * @author Birgit Engelmann
 */
@SuppressWarnings("all")
public class JnarioJvmModelInferrer extends Xtend2JvmModelInferrer {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private ITypeProvider _iTypeProvider;
  
  @Inject
  private JavaNameProvider _javaNameProvider;
  
  @Inject
  private JnarioCompiler _jnarioCompiler;
  
  @Inject
  private StepNameProvider _stepNameProvider;
  
  @Inject
  private StepExpressionProvider _stepExpressionProvider;
  
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
      Jnario jnarioFile = ((Jnario) object);
      XtendClass _xtendClass = jnarioFile==null?(XtendClass)null:jnarioFile.getXtendClass();
      Feature feature = ((Feature) _xtendClass);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(feature, null);
      if (_operator_notEquals) {
        EList<XtendMember> _members = feature.getMembers();
        for (final XtendMember member : _members) {
          {
            final Scenario scenario = ((Scenario) member);
            String _name = feature.getName();
            String _javaClassName = this._javaNameProvider.getJavaClassName(_name);
            String _name_1 = scenario.getName();
            String _javaClassName_1 = this._javaNameProvider.getJavaClassName(_name_1);
            String _operator_plus = StringExtensions.operator_plus(_javaClassName, _javaClassName_1);
            final String className = _operator_plus;
            JvmGenericType _infer = this.infer(scenario, jnarioFile, className);
            final JvmGenericType clazz = _infer;
            EList<ExampleTable> _examples = scenario.getExamples();
            boolean _isEmpty = _examples.isEmpty();
            if (_isEmpty) {
              EList<JvmAnnotationReference> _annotations = clazz.getAnnotations();
              JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(scenario, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.JnarioRunner.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            } else {
              EList<JvmAnnotationReference> _annotations_1 = clazz.getAnnotations();
              JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(scenario, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.JnarioExamplesRunner.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
            }
            acceptor.accept(clazz);
          }
        }
      }
  }
  
  public JvmGenericType infer(final Scenario scenario, final Jnario jnario, final String className) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            Resource _eResource = jnario.eResource();
            EList<EObject> _contents = _eResource.getContents();
            CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            String _name = scenario.getName();
            String _trim = _name.trim();
            JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, de.bmw.carit.jnario.runner.Named.class, _trim);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            String _package = jnario.getPackage();
            it.setPackageName(_package);
            String _documentation = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(scenario);
            JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
            boolean hasBackground = false;
            XtendClass _xtendClass = jnario.getXtendClass();
            Feature feature = ((Feature) _xtendClass);
            Background _background = feature.getBackground();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_background, null);
            if (_operator_notEquals) {
              hasBackground = true;
            }
            ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
            ArrayList<String> allVariables = _newArrayList;
            if (hasBackground) {
              {
                Background _background_1 = feature.getBackground();
                EList<XtendMember> _members = _background_1.getMembers();
                Iterator<XtendMember> _iterator = _members.iterator();
                UnmodifiableIterator<XtendField> _filter = Iterators.<XtendField>filter(_iterator, org.eclipse.xtext.xtend2.xtend2.XtendField.class);
                UnmodifiableIterator<XtendField> backgroundFields = _filter;
                Iterable<XtendField> _iterable = IteratorExtensions.<XtendField>toIterable(backgroundFields);
                for (final XtendField field : _iterable) {
                  {
                    JnarioJvmModelInferrer.this.transform(field, it);
                    String _name_1 = field.getName();
                    allVariables.add(_name_1);
                  }
                }
              }
            }
            TreeIterator<EObject> _eAllContents = scenario.eAllContents();
            TreeIterator<EObject> eAllContents = _eAllContents;
            UnmodifiableIterator<XtendField> _filter_1 = Iterators.<XtendField>filter(eAllContents, org.eclipse.xtext.xtend2.xtend2.XtendField.class);
            UnmodifiableIterator<XtendField> allFields = _filter_1;
            Iterable<XtendField> _iterable_1 = IteratorExtensions.<XtendField>toIterable(allFields);
            for (final XtendField field_1 : _iterable_1) {
              {
                boolean _operator_or = false;
                JvmTypeReference _type = field_1.getType();
                boolean _operator_equals = ObjectExtensions.operator_equals(_type, null);
                if (_operator_equals) {
                  _operator_or = true;
                } else {
                  JvmTypeReference _type_1 = field_1.getType();
                  JvmType _type_2 = _type_1.getType();
                  boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_2, null);
                  _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
                }
                if (_operator_or) {
                  JnarioJvmModelInferrer.this.checkIfExampleField(field_1);
                }
                String _name_2 = field_1.getName();
                boolean _contains = allVariables.contains(_name_2);
                boolean _operator_not = BooleanExtensions.operator_not(_contains);
                if (_operator_not) {
                  {
                    JnarioJvmModelInferrer.this.transform(field_1, it);
                    String _name_3 = field_1.getName();
                    allVariables.add(_name_3);
                  }
                }
              }
            }
            int order = 0;
            if (hasBackground) {
              Background _background_2 = feature.getBackground();
              EList<Step> _steps = _background_2.getSteps();
              for (final Step step : _steps) {
              }
            }
            EList<Step> _steps_1 = scenario.getSteps();
            for (final Step step_1 : _steps_1) {
              {
                int _transform = JnarioJvmModelInferrer.this.transform(step_1, it, order);
                order = _transform;
                EList<Step> _and = step_1.getAnd();
                for (final Step and : _and) {
                  int _transform_1 = JnarioJvmModelInferrer.this.transform(and, it, order);
                  order = _transform_1;
                }
              }
            }
            EList<ExampleTable> _examples = scenario.getExamples();
            boolean _isEmpty = _examples.isEmpty();
            boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty);
            if (_operator_not_1) {
              {
                List<JvmGenericType> _generateExampleClasses = JnarioJvmModelInferrer.this.generateExampleClasses(scenario, jnario, it);
                final List<JvmGenericType> exampleClasses = _generateExampleClasses;
                boolean _isEmpty_1 = exampleClasses.isEmpty();
                boolean _operator_not_2 = BooleanExtensions.operator_not(_isEmpty_1);
                if (_operator_not_2) {
                  EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                  JvmAnnotationReference _annotation_1 = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(scenario, de.bmw.carit.jnario.runner.Contains.class, exampleClasses);
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
              Code _expressionOf = JnarioJvmModelInferrer.this._stepExpressionProvider.expressionOf(step);
              XBlockExpression _blockExpression = _expressionOf==null?(XBlockExpression)null:_expressionOf.getBlockExpression();
              JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _blockExpression);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, org.junit.Test.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              int _intValue = Integer.valueOf(order).intValue();
              JvmAnnotationReference _annotation_1 = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, de.bmw.carit.jnario.runner.Order.class, Integer.valueOf(_intValue));
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
              EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
              String _nameOf = JnarioJvmModelInferrer.this._stepNameProvider.nameOf(step);
              JvmAnnotationReference _annotation_2 = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(step, de.bmw.carit.jnario.runner.Named.class, _nameOf);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_2);
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
  
  public void checkIfExampleField(final XtendField field) {
      ExampleTable _containerOfType = EcoreUtil2.<ExampleTable>getContainerOfType(field, de.bmw.carit.jnario.jnario.ExampleTable.class);
      ExampleTable examples = _containerOfType;
      boolean _operator_equals = ObjectExtensions.operator_equals(examples, null);
      if (_operator_equals) {
        return;
      }
      ExampleHeading _heading = examples.getHeading();
      ExampleHeading heading = _heading;
      EList<XtendField> _parts = heading.getParts();
      boolean _contains = _parts.contains(field);
      boolean _operator_not = BooleanExtensions.operator_not(_contains);
      if (_operator_not) {
        return;
      }
      EList<XtendField> _parts_1 = heading.getParts();
      int _indexOf = _parts_1.indexOf(field);
      int index = _indexOf;
      EList<ExampleRow> _rows = examples.getRows();
      boolean _isEmpty = _rows.isEmpty();
      if (_isEmpty) {
        return;
      }
      EList<ExampleRow> _rows_1 = examples.getRows();
      ExampleRow _get = _rows_1.get(0);
      ExampleRow exampleRow = _get;
      EList<ExampleCell> _parts_2 = exampleRow.getParts();
      int _size = _parts_2.size();
      boolean _operator_lessThan = IntegerExtensions.operator_lessThan(index, _size);
      if (_operator_lessThan) {
        {
          EList<ExampleCell> _parts_3 = exampleRow.getParts();
          ExampleCell _get_1 = _parts_3.get(index);
          ExampleCell exampleCell = _get_1;
          XExpression _name = exampleCell.getName();
          JvmTypeReference _type = this._iTypeProvider.getType(_name);
          field.setType(_type);
          field.setVisibility(JvmVisibility.PUBLIC);
        }
      }
  }
  
  public List<JvmGenericType> generateExampleClasses(final Scenario scenario, final Jnario jnario, final JvmGenericType inferredJvmType) {
    List<JvmGenericType> _xblockexpression = null;
    {
      int exampleTable = 1;
      ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
      final List<JvmGenericType> exampleClasses = _newArrayList;
      EList<ExampleTable> _examples = scenario.getExamples();
      for (final ExampleTable example : _examples) {
        {
          ExampleHeading _heading = example.getHeading();
          EList<XtendField> _parts = _heading.getParts();
          EList<XtendField> fields = _parts;
          int exampleNumber = 1;
          EList<ExampleRow> _rows = example.getRows();
          for (final ExampleRow row : _rows) {
            {
              JvmGenericType _createExampleClass = this.createExampleClass(scenario, jnario, row, fields, exampleTable, exampleNumber, inferredJvmType);
              CollectionExtensions.<JvmGenericType>operator_add(exampleClasses, _createExampleClass);
              int _operator_plus = IntegerExtensions.operator_plus(exampleNumber, 1);
              exampleNumber = _operator_plus;
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
  
  public JvmGenericType createExampleClass(final Scenario scenario, final Jnario jnario, final ExampleRow row, final EList<XtendField> fields, final int exampleTable, final int exampleNumber, final JvmGenericType inferredJvmType) {
    JvmGenericType _xblockexpression = null;
    {
      String _operator_plus = StringExtensions.operator_plus("ExampleTable", Integer.valueOf(exampleTable));
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "Example");
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, Integer.valueOf(exampleNumber));
      final String className = _operator_plus_2;
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmParameterizedTypeReference _createTypeRef = JnarioJvmModelInferrer.this._typeReferences.createTypeRef(inferredJvmType);
              CollectionExtensions.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
              Resource _eResource = jnario.eResource();
              EList<EObject> _contents = _eResource.getContents();
              CollectionExtensions.<JvmGenericType>operator_add(_contents, it);
              String _package = jnario.getPackage();
              it.setPackageName(_package);
              EList<JvmMember> _members = it.getMembers();
              JvmConstructor _generateExampleConstructor = JnarioJvmModelInferrer.this.generateExampleConstructor(row, fields, className);
              CollectionExtensions.<JvmConstructor>operator_add(_members, _generateExampleConstructor);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(row, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.JnarioRunner.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              String _operator_plus = StringExtensions.operator_plus("ExampleTable ", Integer.valueOf(exampleTable));
              String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ", ");
              String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Example ");
              String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, Integer.valueOf(exampleNumber));
              String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " [");
              String description = _operator_plus_4;
              int i = 0;
              for (final XtendField field : fields) {
                {
                  String _name = field.getName();
                  String _operator_plus_5 = StringExtensions.operator_plus(description, _name);
                  String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " = ");
                  StringBuilderBasedAppendable _cellToAppendable = JnarioJvmModelInferrer.this.cellToAppendable(row, i);
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
              JvmAnnotationReference _annotation_1 = JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(row, de.bmw.carit.jnario.runner.Named.class, description);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
            }
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(row, className, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public JvmConstructor generateExampleConstructor(final ExampleRow row, final EList<XtendField> fields, final String className) {
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
                    for (final XtendField field : fields) {
                      {
                        constructor.append("super.");
                        String _name = field.getName();
                        constructor.append(_name);
                        constructor.append(" = ");
                        StringBuilderBasedAppendable _cellToAppendable = JnarioJvmModelInferrer.this.cellToAppendable(row, i);
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
            JnarioJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        }
      };
    JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(row, className, _function);
    return _constructor;
  }
  
  public StringBuilderBasedAppendable cellToAppendable(final ExampleRow row, final int i) {
    StringBuilderBasedAppendable _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      EList<ExampleCell> _parts = row.getParts();
      ExampleCell _get = _parts.get(i);
      XExpression _name = _get.getName();
      this._jnarioCompiler.toJavaExpression(_name, appendable);
      _xblockexpression = (appendable);
    }
    return _xblockexpression;
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
