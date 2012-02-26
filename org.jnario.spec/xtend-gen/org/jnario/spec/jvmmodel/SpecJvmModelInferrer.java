package org.jnario.spec.jvmmodel;

import com.google.common.base.Joiner;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.JunitAnnotationProvider;
import org.jnario.spec.jvmmodel.ImplicitSubject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.jnario.spec.spec.TestFunction;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  private JunitAnnotationProvider annotationProvider;
  
  @Inject
  private ImplicitSubject _implicitSubject;
  
  @Inject
  private IJvmModelAssociations _iJvmModelAssociations;
  
  public void infer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
      boolean _checkClassPath = this.checkClassPath(e, this.annotationProvider);
      boolean _operator_not = BooleanExtensions.operator_not(_checkClassPath);
      if (_operator_not) {
        return;
      }
      boolean _operator_not_1 = BooleanExtensions.operator_not((e instanceof SpecFile));
      if (_operator_not_1) {
        return;
      }
      final SpecFile specFile = ((SpecFile) e);
      XtendClass _xtendClass = specFile.getXtendClass();
      boolean _operator_equals = ObjectExtensions.operator_equals(_xtendClass, null);
      if (_operator_equals) {
        return;
      }
      XtendClass _xtendClass_1 = specFile.getXtendClass();
      this.transform(((SpecFile) specFile), ((ExampleGroup) _xtendClass_1), null, preIndexingPhase);
  }
  
  public JvmGenericType transform(final SpecFile spec, final ExampleGroup exampleGroup, final JvmGenericType superClass, final boolean isPrelinkingPhase) {
    String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleGroup);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            SpecJvmModelInferrer.this.configureWith(it, exampleGroup, spec, superClass);
            if (isPrelinkingPhase) {
              return;
            }
            SpecJvmModelInferrer.this.addAnnotations(it, exampleGroup);
            SpecJvmModelInferrer.this.addFields(it, exampleGroup);
            int index = 0;
            ArrayList<JvmGenericType> _newArrayList = CollectionLiterals.<JvmGenericType>newArrayList();
            final List<JvmGenericType> subExamples = _newArrayList;
            EList<XtendMember> _members = exampleGroup.getMembers();
            for (final XtendMember element : _members) {
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
                  if (element instanceof ExampleTable) {
                    final ExampleTable _exampleTable = (ExampleTable)element;
                    matched=true;
                    SpecJvmModelInferrer.this.transform(it, _exampleTable, spec);
                  }
                }
                if (!matched) {
                  if (element instanceof Example) {
                    final Example _example = (Example)element;
                    matched=true;
                    {
                      JvmDeclaredType _exception = _example.getException();
                      boolean _isPending = _example.isPending();
                      ArrayList<JvmAnnotationReference> _testAnnotations = SpecJvmModelInferrer.this.annotationProvider.getTestAnnotations(_example, _exception, _isPending);
                      final ArrayList<JvmAnnotationReference> annotations = _testAnnotations;
                      String _describe = SpecJvmModelInferrer.this._exampleNameProvider.describe(_example);
                      JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, org.jnario.runner.Named.class, _describe);
                      CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation);
                      JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, org.jnario.runner.Order.class, Integer.valueOf(index));
                      CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_1);
                      EList<JvmMember> _members_1 = it.getMembers();
                      JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_example, annotations);
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
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
                      boolean _isBeforeAll = _before.isBeforeAll();
                      JvmAnnotationReference _beforeAnnotation = SpecJvmModelInferrer.this.annotationProvider.getBeforeAnnotation(it, _isBeforeAll);
                      final JvmAnnotationReference annotationType = _beforeAnnotation;
                      EList<JvmMember> _members_1 = it.getMembers();
                      boolean _isBeforeAll_1 = _before.isBeforeAll();
                      JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_before, annotationType, _isBeforeAll_1);
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
                    }
                  }
                }
                if (!matched) {
                  if (element instanceof After) {
                    final After _after = (After)element;
                    matched=true;
                    {
                      boolean _isAfterAll = _after.isAfterAll();
                      JvmAnnotationReference _afterAnnotation = SpecJvmModelInferrer.this.annotationProvider.getAfterAnnotation(it, _isAfterAll);
                      final JvmAnnotationReference annotationType = _afterAnnotation;
                      EList<JvmMember> _members_1 = it.getMembers();
                      boolean _isAfterAll_1 = _after.isAfterAll();
                      JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_after, annotationType, _isAfterAll_1);
                      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
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
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, org.jnario.runner.Contains.class, subExamples);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            }
            SpecJvmModelInferrer.this.computeInferredReturnTypes(it);
          }
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, _function);
    return _class;
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
          JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(source, org.jnario.runner.Extension.class);
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
        }
      }
  }
  
  public JvmOperation toMethod(final TestFunction element, final JvmAnnotationReference annotation, final boolean isStatic) {
      ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList(annotation);
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
  
  public void configureWith(final JvmGenericType type, final EObject source, final SpecFile spec) {
      Resource _eResource = spec.eResource();
      EList<EObject> _contents = _eResource.getContents();
      CollectionExtensions.<JvmGenericType>operator_add(_contents, type);
      String _package = spec.getPackage();
      type.setPackageName(_package);
      String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
      this._extendedJvmTypesBuilder.setDocumentation(type, _documentation);
  }
  
  public void configureWith(final JvmGenericType type, final EObject source, final SpecFile spec, final JvmGenericType superType) {
      this.configureWith(type, source, spec);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(superType, null);
      if (_operator_notEquals) {
        EList<JvmTypeReference> _superTypes = type.getSuperTypes();
        JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(superType);
        CollectionExtensions.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
      }
  }
  
  public void addFields(final JvmGenericType type, final ExampleGroup exampleGroup) {
      EList<XtendMember> _members = exampleGroup.getMembers();
      Iterable<XtendField> _filter = IterableExtensions.<XtendField>filter(_members, org.eclipse.xtend.core.xtend.XtendField.class);
      for (final XtendField field : _filter) {
        {
          field.setVisibility(JvmVisibility.PROTECTED);
          this.transform(field, type);
        }
      }
      this._implicitSubject.addImplicitSubject(type, exampleGroup);
  }
  
  public void addAnnotations(final JvmGenericType type, final ExampleGroup exampleGroup) {
      EList<JvmAnnotationReference> _annotations = type.getAnnotations();
      JvmAnnotationReference _exampleGroupRunnerAnnotation = this.annotationProvider.getExampleGroupRunnerAnnotation(exampleGroup);
      CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _exampleGroupRunnerAnnotation);
      EList<JvmAnnotationReference> _annotations_1 = type.getAnnotations();
      String _describe = this._exampleNameProvider.describe(exampleGroup);
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, org.jnario.runner.Named.class, _describe);
      CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
      EList<XAnnotation> _annotations_2 = exampleGroup.getAnnotations();
      this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations_2, type);
  }
  
  public JvmGenericType transform(final JvmGenericType specType, final ExampleTable element, final SpecFile spec) {
    String _javaClassName = this._exampleNameProvider.toJavaClassName(element);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType exampleTableType) {
          {
            EList<JvmTypeReference> _superTypes = exampleTableType.getSuperTypes();
            JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(org.jnario.lib.ExampleTableRow.class, element);
            CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, _typeForName);
            SpecJvmModelInferrer.this.configureWith(exampleTableType, element, spec);
            JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(exampleTableType);
            JvmTypeReference _typeForName_1 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(org.jnario.lib.ExampleTable.class, element, _createTypeRef);
            final JvmTypeReference type = _typeForName_1;
            EList<JvmMember> _members = specType.getMembers();
            String _javaClassName = SpecJvmModelInferrer.this._exampleNameProvider.toJavaClassName(element);
            String _operator_plus = StringExtensions.operator_plus("_init", _javaClassName);
            JvmTypeReference _typeForName_2 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _beforeAnnotation = SpecJvmModelInferrer.this.annotationProvider.getBeforeAnnotation(element);
                    CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _beforeAnnotation);
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable a) {
                          SpecJvmModelInferrer.this.generateInitializationMethod(exampleTableType, element, a);
                        }
                      };
                    SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                  }
                }
              };
            JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(element, _operator_plus, _typeForName_2, _function);
            CollectionExtensions.<JvmOperation>operator_add(_members, _method);
            EList<JvmMember> _members_1 = specType.getMembers();
            String _fieldName = SpecJvmModelInferrer.this._exampleNameProvider.toFieldName(element);
            JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(element, _fieldName, type);
            CollectionExtensions.<JvmField>operator_add(_members_1, _field);
            String _simpleName = exampleTableType.getSimpleName();
            final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
                public void apply(final JvmConstructor it) {
                }
              };
            JvmConstructor _constructor = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toConstructor(element, _simpleName, _function_1);
            final JvmConstructor constructor = _constructor;
            EList<JvmMember> _members_2 = exampleTableType.getMembers();
            CollectionExtensions.<JvmConstructor>operator_add(_members_2, constructor);
            ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
            final ArrayList<String> assignments = _newArrayList;
            JvmTypeReference _typeForName_3 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.String.class, element);
            final JvmTypeReference stringType = _typeForName_3;
            JvmTypeReference _typeForName_4 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(java.util.List.class, element, stringType);
            final JvmTypeReference listType = _typeForName_4;
            JvmFormalParameter _createJvmFormalParameter = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
            final JvmFormalParameter cellNames = _createJvmFormalParameter;
            cellNames.setName("cellNames");
            cellNames.setParameterType(listType);
            EList<JvmFormalParameter> _parameters = constructor.getParameters();
            CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, cellNames);
            CollectionExtensions.<String>operator_add(assignments, "super(cellNames);");
            EList<ExampleColumn> _columns = element.getColumns();
            final Procedure1<ExampleColumn> _function_2 = new Procedure1<ExampleColumn>() {
                public void apply(final ExampleColumn column) {
                  {
                    EList<JvmMember> _members = exampleTableType.getMembers();
                    JvmField _field = SpecJvmModelInferrer.this.toField(column);
                    CollectionExtensions.<JvmField>operator_add(_members, _field);
                    JvmFormalParameter _createJvmFormalParameter = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
                    final JvmFormalParameter jvmParam = _createJvmFormalParameter;
                    String _name = column.getName();
                    jvmParam.setName(_name);
                    JvmTypeReference _type = column.getType();
                    JvmTypeReference _cloneWithProxies = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(_type);
                    jvmParam.setParameterType(_cloneWithProxies);
                    EList<JvmFormalParameter> _parameters = constructor.getParameters();
                    CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, jvmParam);
                    SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>associate(element, jvmParam);
                    String _name_1 = column.getName();
                    String _operator_plus = StringExtensions.operator_plus("this.", _name_1);
                    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " = ");
                    String _name_2 = column.getName();
                    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _name_2);
                    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ";");
                    CollectionExtensions.<String>operator_add(assignments, _operator_plus_3);
                    EList<JvmMember> _members_1 = exampleTableType.getMembers();
                    String _name_3 = column.getName();
                    String _firstUpper = Strings.toFirstUpper(_name_3);
                    String _operator_plus_4 = StringExtensions.operator_plus("get", _firstUpper);
                    JvmTypeReference _type_1 = column.getType();
                    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                              public void apply(final ITreeAppendable a) {
                                String _name = column.getName();
                                String _operator_plus = StringExtensions.operator_plus("return ", _name);
                                String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ";");
                                a.append(_operator_plus_1);
                              }
                            };
                          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                        }
                      };
                    JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(element, _operator_plus_4, _type_1, _function);
                    CollectionExtensions.<JvmOperation>operator_add(_members_1, _method);
                  }
                }
              };
            IterableExtensions.<ExampleColumn>forEach(_columns, _function_2);
            final Procedure1<ITreeAppendable> _function_3 = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable a) {
                  String _newLine = Strings.newLine();
                  Joiner _on = Joiner.on(_newLine);
                  String _join = _on.join(assignments);
                  a.append(_join);
                }
              };
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(constructor, _function_3);
            EList<JvmMember> _members_3 = exampleTableType.getMembers();
            final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable a) {
                        List<String> _columnNames = SpecJvmModelInferrer.this.columnNames(element);
                        String _join = IterableExtensions.join(_columnNames, ") , String.valueOf(");
                        String _operator_plus = StringExtensions.operator_plus("return java.util.Arrays.asList(String.valueOf(", _join);
                        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "));");
                        a.append(_operator_plus_1);
                      }
                    };
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(element, "getCells", listType, _function_4);
            CollectionExtensions.<JvmOperation>operator_add(_members_3, _method_1);
          }
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(element, _javaClassName, _function);
    return _class;
  }
  
  public ITreeAppendable generateInitializationMethod(final JvmGenericType exampleTableType, final ExampleTable exampleTable, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      EList<ExampleRow> _rows = exampleTable.getRows();
      for (final ExampleRow row : _rows) {
        EList<XExpression> _cells = row.getCells();
        for (final XExpression cell : _cells) {
          this.compiler.toJavaStatement(cell, appendable, true);
        }
      }
      String _fieldName = this._exampleNameProvider.toFieldName(exampleTable);
      appendable.append(_fieldName);
      String _fieldName_1 = this._exampleNameProvider.toFieldName(exampleTable);
      String _operator_plus = StringExtensions.operator_plus(" = ExampleTable.create(\"", _fieldName_1);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\", \n");
      appendable.append(_operator_plus_1);
      List<String> _columnNames = this.columnNames(exampleTable);
      String _join = IterableExtensions.join(_columnNames, "\", \"");
      String _operator_plus_2 = StringExtensions.operator_plus("  java.util.Arrays.asList(\"", _join);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "\"), ");
      appendable.append(_operator_plus_3);
      appendable.increaseIndentation();
      appendable.append("\n");
      EList<ExampleRow> _rows_1 = exampleTable.getRows();
      for (final ExampleRow row_1 : _rows_1) {
        {
          ITreeAppendable _append = appendable.append("new ");
          String _simpleName = exampleTableType.getSimpleName();
          ITreeAppendable _append_1 = _append.append(_simpleName);
          _append_1.append("(");
          EList<XExpression> _cells_1 = row_1.getCells();
          final Function1<XExpression,String> _function = new Function1<XExpression,String>() {
              public String apply(final XExpression it) {
                String _serialize = SpecJvmModelInferrer.this.serialize(it);
                String _trim = _serialize.trim();
                String _convertToJavaString = Strings.convertToJavaString(_trim);
                return _convertToJavaString;
              }
            };
          List<String> _map = ListExtensions.<XExpression, String>map(_cells_1, _function);
          String _join_1 = IterableExtensions.join(_map, "\", \"");
          String _operator_plus_4 = StringExtensions.operator_plus("  java.util.Arrays.asList(\"", _join_1);
          String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "\"), ");
          appendable.append(_operator_plus_5);
          EList<XExpression> _cells_2 = row_1.getCells();
          for (final XExpression cell_1 : _cells_2) {
            {
              this.compiler.toJavaExpression(cell_1, appendable);
              EList<XExpression> _cells_3 = row_1.getCells();
              XExpression _last = IterableExtensions.<XExpression>last(_cells_3);
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_last, cell_1);
              if (_operator_notEquals) {
                appendable.append(", ");
              }
            }
          }
          appendable.append(")");
          EList<ExampleRow> _rows_2 = exampleTable.getRows();
          ExampleRow _last_1 = IterableExtensions.<ExampleRow>last(_rows_2);
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_last_1, row_1);
          if (_operator_notEquals_1) {
            appendable.append(",\n");
          }
        }
      }
      appendable.decreaseIndentation();
      ITreeAppendable _append_2 = appendable.append("\n);");
      _xblockexpression = (_append_2);
    }
    return _xblockexpression;
  }
  
  public List<String> columnNames(final ExampleTable exampleTable) {
    EList<ExampleColumn> _columns = exampleTable.getColumns();
    final Function1<ExampleColumn,String> _function = new Function1<ExampleColumn,String>() {
        public String apply(final ExampleColumn it) {
          String _name = it==null?(String)null:it.getName();
          return _name;
        }
      };
    List<String> _map = ListExtensions.<ExampleColumn, String>map(_columns, _function);
    return _map;
  }
  
  public String serialize(final EObject obj) {
    ICompositeNode _node = NodeModelUtils.getNode(obj);
    String _text = _node==null?(String)null:_node.getText();
    return _text;
  }
}
