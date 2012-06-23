package org.jnario.suite.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.Specification;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.JunitAnnotationProvider;
import org.jnario.runner.Contains;
import org.jnario.runner.Named;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class SuiteJvmModelInferrer extends JnarioJvmModelInferrer {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  private JunitAnnotationProvider annotationProvider;
  
  @Inject
  private SpecResolver _specResolver;
  
  @Inject
  private TypeReferences types;
  
  public void infer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    boolean _checkClassPath = this.checkClassPath(e, this.annotationProvider);
    boolean _not = (!_checkClassPath);
    if (_not) {
      return;
    }
    boolean _not_1 = (!(e instanceof SuiteFile));
    if (_not_1) {
      return;
    }
    final SuiteFile suiteFile = ((SuiteFile) e);
    EList<XtendClass> _xtendClasses = suiteFile.getXtendClasses();
    Iterable<Suite> _filter = Iterables.<Suite>filter(_xtendClasses, Suite.class);
    final Procedure1<Suite> _function = new Procedure1<Suite>() {
        public void apply(final Suite it) {
          SuiteJvmModelInferrer.this.infer(it, acceptor, preIndexingPhase);
        }
      };
    IterableExtensions.<Suite>forEach(_filter, _function);
  }
  
  public void infer(final Suite suite, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _qualifiedClassName = this._suiteClassNameProvider.getQualifiedClassName(suite);
    JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(suite, _qualifiedClassName);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _exampleGroupRunnerAnnotation = SuiteJvmModelInferrer.this.annotationProvider.getExampleGroupRunnerAnnotation(suite);
          SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _exampleGroupRunnerAnnotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          String _describe = SuiteJvmModelInferrer.this._suiteClassNameProvider.describe(suite);
          JvmAnnotationReference _annotation = SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(suite, Named.class, _describe);
          SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
          Iterable<JvmType> _children = SuiteJvmModelInferrer.this.children(suite);
          boolean _isEmpty = IterableExtensions.isEmpty(_children);
          boolean _not = (!_isEmpty);
          if (_not) {
            EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
            Iterable<JvmType> _children_1 = SuiteJvmModelInferrer.this.children(suite);
            Set<JvmType> _set = IterableExtensions.<JvmType>toSet(_children_1);
            JvmAnnotationReference _annotation_1 = SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(suite, Contains.class, _set);
            SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_1);
          }
          SuiteJvmModelInferrer.this.initialize(suite, it);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public Iterable<JvmType> children(final Suite suite) {
    List<JvmType> _xblockexpression = null;
    {
      final List<Specification> specs = this._specResolver.resolveSpecs(suite);
      final Function1<Specification,JvmType> _function = new Function1<Specification,JvmType>() {
          public JvmType apply(final Specification it) {
            String _qualifiedClassName = SuiteJvmModelInferrer.this._suiteClassNameProvider.getQualifiedClassName(it);
            JvmTypeReference _typeForName = SuiteJvmModelInferrer.this.types.getTypeForName(_qualifiedClassName, suite);
            JvmType _type = _typeForName==null?(JvmType)null:_typeForName.getType();
            return _type;
          }
        };
      List<JvmType> _map = ListExtensions.<Specification, JvmType>map(specs, _function);
      _xblockexpression = (_map);
    }
    return _xblockexpression;
  }
}
