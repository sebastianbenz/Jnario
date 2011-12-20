package de.bmw.carit.jnario.jvmmodel;

import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import de.bmw.carit.jnario.jnario.And;
import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.ExampleTable;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.Given;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.Then;
import de.bmw.carit.jnario.jnario.When;
import de.bmw.carit.jnario.naming.JavaNameProvider;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
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
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class JnarioJvmModelInferrer extends Xtend2JvmModelInferrer {
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
  public void infer(final EObject object, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
      Jnario jnarioFile = ((Jnario) object);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(jnarioFile, null);
      if (_operator_notEquals) {
        {
          XtendClass _xtendClass = jnarioFile.getXtendClass();
          Feature feature = ((Feature) _xtendClass);
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(feature, null);
          if (_operator_notEquals_1) {
            EList<XtendMember> _members = feature.getMembers();
            for (final XtendMember member : _members) {
              {
                Scenario scenario = ((Scenario) member);
                String _name = feature.getName();
                String _javaClassName = this._javaNameProvider.getJavaClassName(_name);
                String _name_1 = scenario.getName();
                String _javaClassName_1 = this._javaNameProvider.getJavaClassName(_name_1);
                String _operator_plus = StringExtensions.operator_plus(_javaClassName, _javaClassName_1);
                final String className = _operator_plus;
                EList<ExampleTable> _examples = scenario.getExamples();
                boolean _isEmpty = _examples.isEmpty();
                boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
                if (_operator_not) {
                  String _operator_plus_1 = StringExtensions.operator_plus("Examples", className);
                  this.createExampleClass(scenario, jnarioFile, _operator_plus_1);
                }
                JvmGenericType _infer = this.infer(scenario, jnarioFile, className);
                acceptor.accept(_infer);
              }
            }
          }
        }
      }
  }
  
  public JvmGenericType infer(final Scenario scenario, final Jnario jnario, final String className) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(scenario, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.JnarioRunner.class);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            String _name = scenario.getName();
            String _trim = _name.trim();
            JvmAnnotationReference _annotation_1 = JnarioJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(scenario, de.bmw.carit.jnario.runner.Named.class, _trim);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
            String _package = jnario.getPackage();
            it.setPackageName(_package);
            String _documentation = JnarioJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(scenario);
            JnarioJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            boolean hasBackground = false;
            XtendClass _xtendClass = jnario.getXtendClass();
            Feature feature = ((Feature) _xtendClass);
            Background _background = feature.getBackground();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_background, null);
            if (_operator_notEquals) {
              hasBackground = true;
            }
            if (hasBackground) {
              {
                Background _background_1 = feature.getBackground();
                EList<XtendMember> _members = _background_1.getMembers();
                Iterator<XtendMember> _iterator = _members.iterator();
                UnmodifiableIterator<XtendField> _filter = Iterators.<XtendField>filter(_iterator, org.eclipse.xtext.xtend2.xtend2.XtendField.class);
                UnmodifiableIterator<XtendField> backgroundFields = _filter;
                Iterable<XtendField> _iterable = IteratorExtensions.<XtendField>toIterable(backgroundFields);
                for (final XtendField field : _iterable) {
                  JnarioJvmModelInferrer.this.transform(field, it);
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
                JvmTypeReference _type = field_1.getType();
                boolean _operator_equals = ObjectExtensions.operator_equals(_type, null);
                if (_operator_equals) {
                }
                JnarioJvmModelInferrer.this.transform(field_1, it);
              }
            }
            int order = 0;
            if (hasBackground) {
              Background _background_2 = feature.getBackground();
              EList<Given> _steps = _background_2.getSteps();
              for (final Given step : _steps) {
                {
                  int _transform = JnarioJvmModelInferrer.this.transform(step, it, order);
                  order = _transform;
                  EList<And> _and = step.getAnd();
                  for (final And and : _and) {
                    int _transform_1 = JnarioJvmModelInferrer.this.transform(and, it, order);
                    order = _transform_1;
                  }
                }
              }
            }
            EList<Step> _steps_1 = scenario.getSteps();
            for (final Step member : _steps_1) {
              {
                Step step_1 = ((Step) member);
                int _transform_2 = JnarioJvmModelInferrer.this.transform(step_1, it, order);
                order = _transform_2;
                if ((step_1 instanceof Given)) {
                  {
                    Given given = ((Given) step_1);
                    EList<And> _and_1 = given.getAnd();
                    for (final And and_1 : _and_1) {
                      int _transform_3 = JnarioJvmModelInferrer.this.transform(and_1, it, order);
                      order = _transform_3;
                    }
                  }
                } else {
                  if ((step_1 instanceof When)) {
                    {
                      When when = ((When) step_1);
                      EList<And> _and_2 = when.getAnd();
                      for (final And and_2 : _and_2) {
                        int _transform_4 = JnarioJvmModelInferrer.this.transform(and_2, it, order);
                        order = _transform_4;
                      }
                    }
                  } else {
                    {
                      Then then = ((Then) step_1);
                      EList<And> _and_3 = then.getAnd();
                      for (final And and_3 : _and_3) {
                        int _transform_5 = JnarioJvmModelInferrer.this.transform(and_3, it, order);
                        order = _transform_5;
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
    return _class;
  }
  
  public Object createExampleClass(final Scenario scenario, final Jnario jnario, final String className) {
    return null;
  }
  
  public int transform(final Step step, final JvmGenericType inferredJvmType, final int order) {
    int _xblockexpression = (int) 0;
    {
      Code _code = step.getCode();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_code, null);
      if (_operator_notEquals) {
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
          EList<JvmMember> _members = inferredJvmType.getMembers();
          CollectionExtensions.<JvmOperation>operator_add(_members, operation);
          EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
          JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(step, org.junit.Test.class);
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          EList<JvmAnnotationReference> _annotations_1 = operation.getAnnotations();
          int _intValue = Integer.valueOf(order).intValue();
          JvmAnnotationReference _annotation_1 = this._jvmTypesBuilder.toAnnotation(step, de.bmw.carit.jnario.runner.Order.class, Integer.valueOf(_intValue));
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
          EList<JvmAnnotationReference> _annotations_2 = operation.getAnnotations();
          String _name_1 = step.getName();
          String _trim = _name_1.trim();
          JvmAnnotationReference _annotation_2 = this._jvmTypesBuilder.toAnnotation(step, de.bmw.carit.jnario.runner.Named.class, _trim);
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_2);
        }
      }
      int _operator_plus = IntegerExtensions.operator_plus(order, 1);
      _xblockexpression = (_operator_plus);
    }
    return _xblockexpression;
  }
  
  public Object generateExampleConstructor() {
    return null;
  }
  
  public Object generateExampleClass() {
    return null;
  }
}
