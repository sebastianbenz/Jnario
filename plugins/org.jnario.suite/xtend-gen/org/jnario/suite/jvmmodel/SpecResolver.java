/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.JnarioPackage;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage;

@SuppressWarnings("all")
public class SpecResolver {
  @Inject
  @Extension
  private IScopeProvider scopeProvider;
  
  @Inject
  @Extension
  private IQualifiedNameConverter _iQualifiedNameConverter;
  
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  protected List<Specification> _resolveSpecs(final Suite suite) {
    EList<Reference> _elements = suite.getElements();
    final Function1<Reference, List<Specification>> _function = new Function1<Reference, List<Specification>>() {
      public List<Specification> apply(final Reference it) {
        return SpecResolver.this.resolveSpecs(it);
      }
    };
    List<List<Specification>> _map = ListExtensions.<Reference, List<Specification>>map(_elements, _function);
    Iterable<Specification> _flatten = Iterables.<Specification>concat(_map);
    return this.sort(_flatten);
  }
  
  protected List<Specification> _resolveSpecs(final SpecReference specRef) {
    Specification _spec = specRef.getSpec();
    return Collections.<Specification>singletonList(_spec);
  }
  
  protected List<Specification> _resolveSpecs(final PatternReference specRef) {
    List<Specification> _xblockexpression = null;
    {
      String _pattern = specRef.getPattern();
      boolean _isNullOrEmpty = Strings.isNullOrEmpty(_pattern);
      if (_isNullOrEmpty) {
        return Collections.<Specification>emptyList();
      }
      final IScope scope = this.scopeProvider.getScope(specRef, SuitePackage.Literals.SPEC_REFERENCE__SPEC);
      Iterable<IEObjectDescription> _allElements = scope.getAllElements();
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription it) {
          EClass _eClass = it.getEClass();
          return Boolean.valueOf(JnarioPackage.Literals.SPECIFICATION.isSuperTypeOf(_eClass));
        }
      };
      Iterable<IEObjectDescription> specs = IterableExtensions.<IEObjectDescription>filter(_allElements, _function);
      String _pattern_1 = specRef.getPattern();
      final Pattern pattern = Pattern.compile(_pattern_1);
      final Function1<IEObjectDescription, Boolean> _function_1 = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription it) {
          QualifiedName _qualifiedName = it.getQualifiedName();
          String _string = SpecResolver.this._iQualifiedNameConverter.toString(_qualifiedName);
          Matcher _matcher = pattern.matcher(_string);
          return Boolean.valueOf(_matcher.matches());
        }
      };
      Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(specs, _function_1);
      specs = _filter;
      final Resource suiteResource = specRef.eResource();
      final Function1<IEObjectDescription, EObject> _function_2 = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription it) {
          EObject _eObjectOrProxy = it.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, specRef);
        }
      };
      Iterable<EObject> _map = IterableExtensions.<IEObjectDescription, EObject>map(specs, _function_2);
      Iterable<Specification> _filter_1 = Iterables.<Specification>filter(_map, Specification.class);
      final Iterable<Specification> resolvedSpecs = IterableExtensions.<Specification>filterNull(_filter_1);
      final Function1<Specification, Boolean> _function_3 = new Function1<Specification, Boolean>() {
        public Boolean apply(final Specification it) {
          Resource _eResource = it.eResource();
          return Boolean.valueOf((!Objects.equal(_eResource, suiteResource)));
        }
      };
      final Iterable<Specification> withoutSuites = IterableExtensions.<Specification>filter(resolvedSpecs, _function_3);
      final Function1<Specification, String> _function_4 = new Function1<Specification, String>() {
        public String apply(final Specification it) {
          return SpecResolver.this._suiteClassNameProvider.toQualifiedJavaClassName(it);
        }
      };
      final Map<String, Specification> classNames = IterableExtensions.<String, Specification>toMap(withoutSuites, _function_4);
      Collection<Specification> _values = classNames.values();
      _xblockexpression = this.sort(_values);
    }
    return _xblockexpression;
  }
  
  private List<Specification> sort(final Iterable<Specification> specs) {
    final Function1<Specification, Boolean> _function = new Function1<Specification, Boolean>() {
      public Boolean apply(final Specification it) {
        return Boolean.valueOf((!Objects.equal(it, null)));
      }
    };
    Iterable<Specification> _filter = IterableExtensions.<Specification>filter(specs, _function);
    final Comparator<Specification> _function_1 = new Comparator<Specification>() {
      public int compare(final Specification left, final Specification right) {
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
            _or = _equals_1;
          }
          if (_or) {
            return 0;
          }
          _xblockexpression = leftName.compareToIgnoreCase(rightName);
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<Specification>sort(_filter, _function_1);
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
