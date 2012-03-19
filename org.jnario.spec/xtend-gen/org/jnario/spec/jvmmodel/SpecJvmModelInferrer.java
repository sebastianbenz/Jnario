package org.jnario.spec.jvmmodel;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.CollectionLiteral;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.ListLiteral;
import org.jnario.SetLiteral;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.JunitAnnotationProvider;
import org.jnario.lib.ExampleTableRow;
import org.jnario.runner.Contains;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
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
    boolean _not = (!_checkClassPath);
    if (_not) {
      return;
    }
    boolean _not_1 = (!(e instanceof SpecFile));
    if (_not_1) {
      return;
    }
    final SpecFile specFile = ((SpecFile) e);
    XtendClass _xtendClass = specFile.getXtendClass();
    boolean _equals = Objects.equal(_xtendClass, null);
    if (_equals) {
      return;
    }
    XtendClass _xtendClass_1 = specFile.getXtendClass();
    this.transform(((SpecFile) specFile), ((ExampleGroup) _xtendClass_1), null, preIndexingPhase);
  }
  
  public void addListLiterals(final EObject context) {
    TreeIterator<EObject> _eAllContents = context.eAllContents();
    final Iterator<CollectionLiteral> literals = Iterators.<CollectionLiteral>filter(_eAllContents, CollectionLiteral.class);
    final Procedure1<CollectionLiteral> _function = new Procedure1<CollectionLiteral>() {
        public void apply(final CollectionLiteral it) {
          SpecJvmModelInferrer.this.setFeature(it);
        }
      };
    IteratorExtensions.<CollectionLiteral>forEach(literals, _function);
  }
  
  protected void _setFeature(final SetLiteral literal) {
    this.setFeature(literal, "newHashSet");
  }
  
  protected void _setFeature(final ListLiteral literal) {
    this.setFeature(literal, "newArrayList");
  }
  
  public void setFeature(final CollectionLiteral literal, final String name) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(CollectionLiterals.class, literal);
    JvmType _type = _typeForName.getType();
    final JvmGenericType collections = ((JvmGenericType) _type);
    EList<JvmMember> _members = collections.getMembers();
    final Iterable<JvmOperation> operations = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Function1<JvmOperation,Boolean> _function = new Function1<JvmOperation,Boolean>() {
        public Boolean apply(final JvmOperation it) {
          String _simpleName = it.getSimpleName();
          boolean _equals = Objects.equal(_simpleName, name);
          return Boolean.valueOf(_equals);
        }
      };
    JvmOperation _findFirst = IterableExtensions.<JvmOperation>findFirst(operations, _function);
    literal.setFeature(_findFirst);
  }
  
  public JvmGenericType transform(final SpecFile spec, final ExampleGroup exampleGroup, final JvmGenericType superClass, final boolean isPrelinkingPhase) {
    String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleGroup);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          SpecJvmModelInferrer.this.configureWith(it, exampleGroup, spec, superClass);
          if (isPrelinkingPhase) {
            return;
          }
          SpecJvmModelInferrer.this.addAnnotations(it, exampleGroup);
          SpecJvmModelInferrer.this.addFields(it, exampleGroup);
          SpecJvmModelInferrer.this.addDefaultConstructor(exampleGroup, it);
          int index = 0;
          final List<JvmGenericType> subExamples = CollectionLiterals.<JvmGenericType>newArrayList();
          EList<XtendMember> _members = exampleGroup.getMembers();
          for (final XtendMember element : _members) {
            {
              boolean _matched = false;
              if (!_matched) {
                if (element instanceof ExampleGroup) {
                  final ExampleGroup _exampleGroup = (ExampleGroup)element;
                  _matched=true;
                  JvmGenericType _transform = SpecJvmModelInferrer.this.transform(spec, _exampleGroup, it, isPrelinkingPhase);
                  subExamples.add(_transform);
                }
              }
              if (!_matched) {
                if (element instanceof ExampleTable) {
                  final ExampleTable _exampleTable = (ExampleTable)element;
                  _matched=true;
                  SpecJvmModelInferrer.this.transform(it, _exampleTable, spec);
                }
              }
              if (!_matched) {
                if (element instanceof Example) {
                  final Example _example = (Example)element;
                  _matched=true;
                  JvmDeclaredType _exception = _example.getException();
                  boolean _isPending = _example.isPending();
                  final ArrayList<JvmAnnotationReference> annotations = SpecJvmModelInferrer.this.annotationProvider.getTestAnnotations(_example, _exception, _isPending);
                  String _describe = SpecJvmModelInferrer.this._exampleNameProvider.describe(_example);
                  JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, Named.class, _describe);
                  annotations.add(_annotation);
                  JvmAnnotationReference _annotation_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(_example, Order.class, Integer.valueOf(index));
                  annotations.add(_annotation_1);
                  EList<JvmMember> _members_1 = it.getMembers();
                  JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_example, annotations);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                }
              }
              if (!_matched) {
                if (element instanceof XtendFunction) {
                  final XtendFunction _xtendFunction = (XtendFunction)element;
                  _matched=true;
                  SpecJvmModelInferrer.this.transform(_xtendFunction, it);
                }
              }
              if (!_matched) {
                if (element instanceof Before) {
                  final Before _before = (Before)element;
                  _matched=true;
                  boolean _isBeforeAll = _before.isBeforeAll();
                  final JvmAnnotationReference annotationType = SpecJvmModelInferrer.this.annotationProvider.getBeforeAnnotation(it, _isBeforeAll);
                  EList<JvmMember> _members_1 = it.getMembers();
                  boolean _isBeforeAll_1 = _before.isBeforeAll();
                  JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_before, annotationType, _isBeforeAll_1);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                }
              }
              if (!_matched) {
                if (element instanceof After) {
                  final After _after = (After)element;
                  _matched=true;
                  boolean _isAfterAll = _after.isAfterAll();
                  final JvmAnnotationReference annotationType = SpecJvmModelInferrer.this.annotationProvider.getAfterAnnotation(it, _isAfterAll);
                  EList<JvmMember> _members_1 = it.getMembers();
                  boolean _isAfterAll_1 = _after.isAfterAll();
                  JvmOperation _method = SpecJvmModelInferrer.this.toMethod(_after, annotationType, _isAfterAll_1);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                }
              }
              int _plus = (index + 1);
              index = _plus;
            }
          }
          boolean _isEmpty = subExamples.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, Contains.class, subExamples);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          }
          SpecJvmModelInferrer.this.computeInferredReturnTypes(it);
        }
      };
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, _function);
    return _class;
  }
  
  protected void transform(final XtendField source, final JvmGenericType container) {
    super.transform(source, container);
    boolean _isExtension = source.isExtension();
    if (_isExtension) {
      Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(source);
      EObject _head = IterableExtensions.<EObject>head(_jvmElements);
      final JvmField field = ((JvmField) _head);
      field.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmAnnotationReference> _annotations = field.getAnnotations();
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(source, Extension.class);
      this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
    }
  }
  
  public JvmOperation toMethod(final TestFunction element, final JvmAnnotationReference annotation, final boolean isStatic) {
    ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList(annotation);
    final JvmOperation result = this.toMethod(element, _newArrayList);
    result.setStatic(isStatic);
    return result;
  }
  
  public JvmOperation toMethod(final TestFunction element, final List<JvmAnnotationReference> annotations) {
    String _methodName = this._exampleNameProvider.toMethodName(element);
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, element);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(element);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
          XExpression _body = element.getBody();
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _body);
          EList<XAnnotation> _annotations = element.getAnnotations();
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations, it);
          EList<JvmTypeReference> _exceptions = it.getExceptions();
          JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Exception.class, element);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          _annotations_1.addAll(annotations);
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(element, _methodName, _typeForName, _function);
    return _method;
  }
  
  public void configureWith(final JvmGenericType type, final EObject source, final SpecFile spec) {
    Resource _eResource = spec.eResource();
    EList<EObject> _contents = _eResource.getContents();
    this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, type);
    String _package = spec.getPackage();
    type.setPackageName(_package);
    String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
    this._extendedJvmTypesBuilder.setDocumentation(type, _documentation);
  }
  
  public void configureWith(final JvmGenericType type, final EObject source, final SpecFile spec, final JvmGenericType superType) {
    this.configureWith(type, source, spec);
    boolean _notEquals = (!Objects.equal(superType, null));
    if (_notEquals) {
      EList<JvmTypeReference> _superTypes = type.getSuperTypes();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(superType);
      this._extendedJvmTypesBuilder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
    }
  }
  
  public void addFields(final JvmGenericType type, final ExampleGroup exampleGroup) {
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<XtendField> _filter = Iterables.<XtendField>filter(_members, XtendField.class);
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
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _exampleGroupRunnerAnnotation);
    EList<JvmAnnotationReference> _annotations_1 = type.getAnnotations();
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
    EList<XAnnotation> _annotations_2 = exampleGroup.getAnnotations();
    this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations_2, type);
  }
  
  public JvmGenericType transform(final JvmGenericType specType, final ExampleTable table, final SpecFile spec) {
    JvmGenericType _xblockexpression = null;
    {
      this.associateTableWithSpec(specType, table);
      String _javaClassName = this._exampleNameProvider.toJavaClassName(table);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType exampleTableType) {
            EList<JvmTypeReference> _superTypes = exampleTableType.getSuperTypes();
            JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(ExampleTableRow.class, table);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
            SpecJvmModelInferrer.this.configureWith(exampleTableType, table, spec);
            JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(exampleTableType);
            final JvmTypeReference type = SpecJvmModelInferrer.this._typeReferences.getTypeForName(org.jnario.lib.ExampleTable.class, table, _createTypeRef);
            EList<JvmMember> _members = specType.getMembers();
            String _javaClassName = SpecJvmModelInferrer.this._exampleNameProvider.toJavaClassName(table);
            String _plus = ("_init" + _javaClassName);
            JvmTypeReference _typeForName_1 = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, table);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                  JvmAnnotationReference _beforeAnnotation = SpecJvmModelInferrer.this.annotationProvider.getBeforeAnnotation(table);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _beforeAnnotation);
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable a) {
                        SpecJvmModelInferrer.this.generateInitializationMethod(exampleTableType, table, a);
                      }
                    };
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, _plus, _typeForName_1, _function);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
            EList<JvmMember> _members_1 = specType.getMembers();
            String _fieldName = SpecJvmModelInferrer.this._exampleNameProvider.toFieldName(table);
            final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
                public void apply(final JvmField it) {
                  it.setVisibility(JvmVisibility.PROTECTED);
                }
              };
            JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(table, _fieldName, type, _function_1);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
            final Procedure1<JvmConstructor> _function_2 = new Procedure1<JvmConstructor>() {
                public void apply(final JvmConstructor it) {
                  String _simpleName = exampleTableType.getSimpleName();
                  it.setSimpleName(_simpleName);
                }
              };
            final JvmConstructor constructor = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toConstructor(table, _function_2);
            EList<JvmMember> _members_2 = exampleTableType.getMembers();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_2, constructor);
            final ArrayList<String> assignments = CollectionLiterals.<String>newArrayList();
            final JvmTypeReference stringType = SpecJvmModelInferrer.this._typeReferences.getTypeForName(String.class, table);
            final JvmTypeReference listType = SpecJvmModelInferrer.this._typeReferences.getTypeForName(List.class, table, stringType);
            final JvmFormalParameter cellNames = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
            cellNames.setName("cellNames");
            cellNames.setParameterType(listType);
            EList<JvmFormalParameter> _parameters = constructor.getParameters();
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, cellNames);
            assignments.add("super(cellNames);");
            EList<ExampleColumn> _columns = table.getColumns();
            final Procedure1<ExampleColumn> _function_3 = new Procedure1<ExampleColumn>() {
                public void apply(final ExampleColumn column) {
                  EList<JvmMember> _members = exampleTableType.getMembers();
                  JvmField _field = SpecJvmModelInferrer.this.toField(column);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
                  final JvmFormalParameter jvmParam = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
                  String _name = column.getName();
                  jvmParam.setName(_name);
                  JvmTypeReference _type = column.getType();
                  JvmTypeReference _cloneWithProxies = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(_type);
                  jvmParam.setParameterType(_cloneWithProxies);
                  EList<JvmFormalParameter> _parameters = constructor.getParameters();
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, jvmParam);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>associate(table, jvmParam);
                  String _name_1 = column.getName();
                  String _plus = ("this." + _name_1);
                  String _plus_1 = (_plus + " = ");
                  String _name_2 = column.getName();
                  String _plus_2 = (_plus_1 + _name_2);
                  String _plus_3 = (_plus_2 + ";");
                  assignments.add(_plus_3);
                  EList<JvmMember> _members_1 = exampleTableType.getMembers();
                  String _name_3 = column.getName();
                  String _firstUpper = Strings.toFirstUpper(_name_3);
                  String _plus_4 = ("get" + _firstUpper);
                  JvmTypeReference _type_1 = column.getType();
                  final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                            public void apply(final ITreeAppendable a) {
                              String _name = column.getName();
                              String _plus = ("return " + _name);
                              String _plus_1 = (_plus + ";");
                              a.append(_plus_1);
                            }
                          };
                        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                      }
                    };
                  JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, _plus_4, _type_1, _function);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                }
              };
            IterableExtensions.<ExampleColumn>forEach(_columns, _function_3);
            final Procedure1<ITreeAppendable> _function_4 = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable a) {
                  String _newLine = Strings.newLine();
                  Joiner _on = Joiner.on(_newLine);
                  String _join = _on.join(assignments);
                  a.append(_join);
                }
              };
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(constructor, _function_4);
            EList<JvmMember> _members_3 = exampleTableType.getMembers();
            final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable a) {
                        List<String> _columnNames = SpecJvmModelInferrer.this.columnNames(table);
                        String _join = IterableExtensions.join(_columnNames, ") , String.valueOf(");
                        String _plus = ("return java.util.Arrays.asList(String.valueOf(" + _join);
                        String _plus_1 = (_plus + "));");
                        a.append(_plus_1);
                      }
                    };
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, "getCells", listType, _function_5);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(spec, _javaClassName, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public void associateTableWithSpec(final JvmGenericType type, final ExampleTable table) {
    EList<ExampleRow> _rows = table.getRows();
    for (final ExampleRow row : _rows) {
      this._extendedJvmTypesBuilder.<JvmGenericType>associate(row, type);
    }
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
      String _plus = (" = ExampleTable.create(\"" + _fieldName_1);
      String _plus_1 = (_plus + "\", \n");
      appendable.append(_plus_1);
      List<String> _columnNames = this.columnNames(exampleTable);
      String _join = IterableExtensions.join(_columnNames, "\", \"");
      String _plus_2 = ("  java.util.Arrays.asList(\"" + _join);
      String _plus_3 = (_plus_2 + "\"), ");
      appendable.append(_plus_3);
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
          String _plus_4 = ("  java.util.Arrays.asList(\"" + _join_1);
          String _plus_5 = (_plus_4 + "\"), ");
          appendable.append(_plus_5);
          EList<XExpression> _cells_2 = row_1.getCells();
          for (final XExpression cell_1 : _cells_2) {
            {
              this.compiler.toJavaExpression(cell_1, appendable);
              EList<XExpression> _cells_3 = row_1.getCells();
              XExpression _last = IterableExtensions.<XExpression>last(_cells_3);
              boolean _notEquals = (!Objects.equal(_last, cell_1));
              if (_notEquals) {
                appendable.append(", ");
              }
            }
          }
          appendable.append(")");
          EList<ExampleRow> _rows_2 = exampleTable.getRows();
          ExampleRow _last = IterableExtensions.<ExampleRow>last(_rows_2);
          boolean _notEquals = (!Objects.equal(_last, row_1));
          if (_notEquals) {
            appendable.append(",\n");
          }
        }
      }
      appendable.decreaseIndentation();
      ITreeAppendable _append = appendable.append("\n);");
      _xblockexpression = (_append);
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
  
  public void setFeature(final CollectionLiteral literal) {
    if (literal instanceof ListLiteral) {
      _setFeature((ListLiteral)literal);
      return;
    } else if (literal instanceof SetLiteral) {
      _setFeature((SetLiteral)literal);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(literal).toString());
    }
  }
}
