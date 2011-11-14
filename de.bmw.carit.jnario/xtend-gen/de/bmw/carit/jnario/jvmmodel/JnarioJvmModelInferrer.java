package de.bmw.carit.jnario.jvmmodel;

import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.naming.JavaNameProvider;
import java.util.HashSet;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class JnarioJvmModelInferrer extends AbstractModelInferrer {
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
  protected void _infer(final Jnario jnario, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    EList<Scenario> _scenarios = jnario.getScenarios();
    for (final Scenario scenario : _scenarios) {
      String _name = scenario.getName();
      String _javaClassName = this._javaNameProvider.getJavaClassName(_name);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = JnarioJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(scenario, org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.ScenarioRunner.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              String _packageName = jnario.getPackageName();
              it.setPackageName(_packageName);
              String _documentation = JnarioJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(scenario);
              JnarioJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              JnarioJvmModelInferrer.this.generateVariables(scenario, it);
              EList<Step> _steps = scenario.getSteps();
              for (final Step step : _steps) {
                JnarioJvmModelInferrer.this.transform(step, it);
              }
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(scenario, _javaClassName, _function);
      acceptor.accept(_class);
    }
  }
  
  public void generateVariables(final Scenario scenario, final JvmGenericType inferredJvmType) {
      TreeIterator<EObject> _eAllContents = scenario.eAllContents();
      Iterator<EObject> eAllContents = _eAllContents;
      UnmodifiableIterator<XVariableDeclaration> _filter = Iterators.<XVariableDeclaration>filter(eAllContents, org.eclipse.xtext.xbase.XVariableDeclaration.class);
      UnmodifiableIterator<XVariableDeclaration> allVariables = _filter;
      HashSet<String> _newHashSet = Sets.<String>newHashSet("");
      HashSet<String> declaredVariables = _newHashSet;
      boolean _hasNext = allVariables.hasNext();
      Boolean _xwhileexpression = _hasNext;
      while (_xwhileexpression) {
        {
          XVariableDeclaration _next = allVariables.next();
          XVariableDeclaration currentDec = _next;
          String _qualifiedName = currentDec.getQualifiedName();
          boolean _contains = declaredVariables.contains(_qualifiedName);
          boolean _operator_not = BooleanExtensions.operator_not(_contains);
          if (_operator_not) {
            {
              String _qualifiedName_1 = currentDec.getQualifiedName();
              declaredVariables.add(_qualifiedName_1);
              JvmTypeReference type = null;
              JvmTypeReference _type = currentDec.getType();
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_type, null);
              if (_operator_notEquals) {
                JvmTypeReference _type_1 = currentDec.getType();
                type = _type_1;
              } else {
                XExpression _right = currentDec.getRight();
                JvmTypeReference _type_2 = this._iTypeProvider.getType(_right);
                type = _type_2;
              }
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(type, null);
              if (_operator_notEquals_1) {
                EList<JvmMember> _members = inferredJvmType.getMembers();
                String _simpleName = currentDec.getSimpleName();
                JvmField _field = this._jvmTypesBuilder.toField(scenario, _simpleName, type);
                CollectionExtensions.<JvmField>operator_add(_members, _field);
              }
            }
          }
        }
        boolean _hasNext_1 = allVariables.hasNext();
        _xwhileexpression = _hasNext_1;
      }
  }
  
  public Boolean transform(final Step step, final JvmGenericType inferredJvmType) {
    Boolean _xifexpression = null;
    Code _code = step.getCode();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_code, null);
    if (_operator_notEquals) {
      boolean _xblockexpression = false;
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
        String _name_1 = step.getName();
        String _trim = _name_1.trim();
        JvmAnnotationReference _annotation_1 = this._jvmTypesBuilder.toAnnotation(step, de.bmw.carit.jnario.runner.Named.class, _trim);
        boolean _operator_add = CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
        _xblockexpression = (_operator_add);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public void infer(final EObject jnario, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (jnario instanceof Jnario) {
      _infer((Jnario)jnario, acceptor, isPrelinkingPhase);
    } else {
      _infer(jnario, acceptor, isPrelinkingPhase);
    }
  }
}
