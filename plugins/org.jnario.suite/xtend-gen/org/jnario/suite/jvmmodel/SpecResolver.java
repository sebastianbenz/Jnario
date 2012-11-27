package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
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
public class SpecResolver {
  @Inject
  private IScopeProvider scopeProvider;
  
  @Inject
  private IQualifiedNameConverter _iQualifiedNameConverter;
  
  @Inject
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  protected List<Specification> _resolveSpecs(final Suite suite) {
    EList<Reference> _elements = suite.getElements();
    final Function1<Reference,List<Specification>> _function = new Function1<Reference,List<Specification>>() {
        public List<Specification> apply(final Reference it) {
          List<Specification> _resolveSpecs = SpecResolver.this.resolveSpecs(it);
          return _resolveSpecs;
        }
      };
    List<List<Specification>> _map = ListExtensions.<Reference, List<Specification>>map(_elements, _function);
    Iterable<Specification> _flatten = Iterables.<Specification>concat(_map);
    List<Specification> _sort = this.sort(_flatten);
    return _sort;
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
            String _string = SpecResolver.this._iQualifiedNameConverter.toString(_qualifiedName);
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
      Iterable<Specification> _filter = Iterables.<Specification>filter(_map, Specification.class);
      final Function1<Specification,Boolean> _function_2 = new Function1<Specification,Boolean>() {
          public Boolean apply(final Specification it) {
            Resource _eResource = it.eResource();
            URI _uRI = _eResource==null?(URI)null:_eResource.getURI();
            Resource _eResource_1 = specRef.eResource();
            URI _uRI_1 = _eResource_1==null?(URI)null:_eResource_1.getURI();
            boolean _notEquals = (!Objects.equal(_uRI, _uRI_1));
            return Boolean.valueOf(_notEquals);
          }
        };
      final Iterable<Specification> specs = IterableExtensions.<Specification>filter(_filter, _function_2);
      final Function1<Specification,String> _function_3 = new Function1<Specification,String>() {
          public String apply(final Specification it) {
            String _qualifiedJavaClassName = SpecResolver.this._suiteClassNameProvider.toQualifiedJavaClassName(it);
            return _qualifiedJavaClassName;
          }
        };
      Map<String,Specification> _map_1 = IterableExtensions.<String, Specification>toMap(specs, _function_3);
      Collection<Specification> _values = _map_1.values();
      List<Specification> _sort = this.sort(_values);
      _xblockexpression = (_sort);
    }
    return _xblockexpression;
  }
  
  private List<Specification> sort(final Iterable<Specification> specs) {
    final Function1<Specification,Boolean> _function = new Function1<Specification,Boolean>() {
        public Boolean apply(final Specification it) {
          boolean _notEquals = (!Objects.equal(it, null));
          return Boolean.valueOf(_notEquals);
        }
      };
    Iterable<Specification> _filter = IterableExtensions.<Specification>filter(specs, _function);
    final Function2<Specification,Specification,Integer> _function_1 = new Function2<Specification,Specification,Integer>() {
        public Integer apply(final Specification left, final Specification right) {
          int _xblockexpression = (int) 0;
          {
            final String leftName = SpecResolver.this._suiteClassNameProvider.describe(left);
            final String rightName = SpecResolver.this._suiteClassNameProvider.describe(right);
            boolean _or = false;
            boolean _equals = Objects.equal(leftName, null);
            if (_equals) {
              _or = true;
            } else {
              boolean _equals_1 = Objects.equal(rightName, null);
              _or = (_equals || _equals_1);
            }
            if (_or) {
              return 0;
            }
            int _compareToIgnoreCase = leftName.compareToIgnoreCase(rightName);
            _xblockexpression = (_compareToIgnoreCase);
          }
          return _xblockexpression;
        }
      };
    List<Specification> _sort = IterableExtensions.<Specification>sort(_filter, new Comparator<Specification>() {
        public int compare(Specification o1,Specification o2) {
          return _function_1.apply(o1,o2);
        }
    });
    return _sort;
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
