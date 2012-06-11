package org.jnario.suite.jvmmodel;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage.Literals;

@SuppressWarnings("all")
public class SpecificationResolver {
  @Inject
  private IScopeProvider scopeProvider;
  
  @Inject
  private IQualifiedNameConverter _iQualifiedNameConverter;
  
  @Inject
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  protected List<Specification> _resolveSpecs(final Suite suite) {
    List<Specification> _xblockexpression = null;
    {
      final Predicate<Specification> notNull = Predicates.<Specification>notNull();
      EList<Reference> _specs = suite.getSpecs();
      final Function1<Reference,List<Specification>> _function = new Function1<Reference,List<Specification>>() {
          public List<Specification> apply(final Reference it) {
            List<Specification> _resolveSpecs = SpecificationResolver.this.resolveSpecs(it);
            return _resolveSpecs;
          }
        };
      List<List<Specification>> _map = ListExtensions.<Reference, List<Specification>>map(_specs, _function);
      Iterable<Specification> _flatten = Iterables.<Specification>concat(_map);
      Iterable<Specification> _filter = IterableExtensions.<Specification>filter(_flatten, new Function1<Specification,Boolean>() {
          public Boolean apply(Specification p) {
            return notNull.apply(p);
          }
      });
      List<Specification> _list = IterableExtensions.<Specification>toList(_filter);
      _xblockexpression = (_list);
    }
    return _xblockexpression;
  }
  
  protected List<Specification> _resolveSpecs(final SpecReference specRef) {
    Specification _spec = specRef.getSpec();
    List<Specification> _singletonList = Collections.<Specification>singletonList(_spec);
    return _singletonList;
  }
  
  protected List<Specification> _resolveSpecs(final PatternReference specRef) {
    List<Specification> _xblockexpression = null;
    {
      String _pattern = specRef.getPattern();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_pattern);
      if (_isNullOrEmpty) {
        return Collections.<Specification>emptyList();
      }
      final IScope scope = this.scopeProvider.getScope(specRef, Literals.SPEC_REFERENCE__SPEC);
      String _pattern_1 = specRef.getPattern();
      final Pattern pattern = Pattern.compile(_pattern_1);
      Iterable<IEObjectDescription> _allElements = scope.getAllElements();
      final Function1<IEObjectDescription,Boolean> _function = new Function1<IEObjectDescription,Boolean>() {
          public Boolean apply(final IEObjectDescription it) {
            QualifiedName _qualifiedName = it.getQualifiedName();
            String _string = SpecificationResolver.this._iQualifiedNameConverter.toString(_qualifiedName);
            Matcher _matcher = pattern.matcher(_string);
            boolean _matches = _matcher.matches();
            return Boolean.valueOf(_matches);
          }
        };
      final Iterable<IEObjectDescription> allElements = IterableExtensions.<IEObjectDescription>filter(_allElements, _function);
      final Function1<IEObjectDescription,EObject> _function_1 = new Function1<IEObjectDescription,EObject>() {
          public EObject apply(final IEObjectDescription it) {
            EObject _eObjectOrProxy = it.getEObjectOrProxy();
            EObject _resolve = EcoreUtil.resolve(_eObjectOrProxy, specRef);
            return _resolve;
          }
        };
      Iterable<EObject> _map = IterableExtensions.<IEObjectDescription, EObject>map(allElements, _function_1);
      final Iterable<Specification> specs = Iterables.<Specification>filter(_map, Specification.class);
      Function1<Specification,Boolean> _nonProxyAndRoot = this.nonProxyAndRoot();
      Iterable<Specification> _filter = IterableExtensions.<Specification>filter(specs, _nonProxyAndRoot);
      Collection<Specification> _filterDuplicates = this.filterDuplicates(_filter);
      List<Specification> _list = IterableExtensions.<Specification>toList(_filterDuplicates);
      _xblockexpression = (_list);
    }
    return _xblockexpression;
  }
  
  private Function1<Specification,Boolean> nonProxyAndRoot() {
    final Function1<Specification,Boolean> _function = new Function1<Specification,Boolean>() {
        public Boolean apply(final Specification s) {
          boolean _and = false;
          boolean _eIsProxy = s.eIsProxy();
          boolean _not = (!_eIsProxy);
          if (!_not) {
            _and = false;
          } else {
            EObject _eContainer = s.eContainer();
            _and = (_not && (_eContainer instanceof XtendFile));
          }
          return _and;
        }
      };
    return _function;
  }
  
  private Collection<Specification> filterDuplicates(final Iterable<Specification> specs) {
    final Function1<Specification,String> _function = new Function1<Specification,String>() {
        public String apply(final Specification it) {
          String _qualifiedClassName = SpecificationResolver.this._suiteClassNameProvider.getQualifiedClassName(it);
          return _qualifiedClassName;
        }
      };
    Map<String,Specification> _map = IterableExtensions.<String, Specification>toMap(specs, _function);
    Collection<Specification> _values = _map.values();
    return _values;
  }
  
  public List<Specification> resolveSpecs(final EObject suite) {
    if (suite instanceof Suite) {
      return _resolveSpecs((Suite)suite);
    } else if (suite instanceof PatternReference) {
      return _resolveSpecs((PatternReference)suite);
    } else if (suite instanceof SpecReference) {
      return _resolveSpecs((SpecReference)suite);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite).toString());
    }
  }
}
