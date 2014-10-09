/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.resource;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionManager;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.builder.clustering.CurrentDescriptions;
import org.eclipse.xtext.builder.impl.BuildData;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jnario.JnarioPackage;
import org.jnario.Specification;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage;

@SuppressWarnings("all")
public class SuiteResourceDescriptionManager extends XtendResourceDescriptionManager {
  private final static Logger logger = Logger.getLogger(SuiteResourceDescriptionManager.class);
  
  private final static HashSet<String> FILE_EXTENSIONS = CollectionLiterals.<String>newHashSet("suite", "spec", "feature");
  
  @Inject
  @Extension
  private IQualifiedNameConverter _iQualifiedNameConverter;
  
  private final WeakHashMap<Collection<IResourceDescription.Delta>, List<QualifiedName>> cachedDeltas = new WeakHashMap<Collection<IResourceDescription.Delta>, List<QualifiedName>>();
  
  /**
   * Every spec change means new potential matches for a regex in a spec PatternReference.
   */
  public boolean isAffected(final Collection<IResourceDescription.Delta> deltas, final IResourceDescription candidate, final IResourceDescriptions context) {
    boolean _isAffected = super.isAffected(deltas, candidate, context);
    if (_isAffected) {
      return true;
    }
    URI _uRI = candidate.getURI();
    String _string = _uRI.toString();
    boolean _endsWith = _string.endsWith(".suite");
    if (_endsWith) {
      URI _uRI_1 = candidate.getURI();
      String _plus = ("Considering suite: " + _uRI_1);
      SuiteResourceDescriptionManager.logger.debug(_plus);
      boolean _isTraceEnabled = SuiteResourceDescriptionManager.logger.isTraceEnabled();
      if (_isTraceEnabled) {
        SuiteResourceDescriptionManager.logger.debug(" Deltas to check: ");
        final Procedure1<IResourceDescription.Delta> _function = new Procedure1<IResourceDescription.Delta>() {
          public void apply(final IResourceDescription.Delta it) {
            SuiteResourceDescriptionManager.logger.debug(("  " + it));
          }
        };
        IterableExtensions.<IResourceDescription.Delta>forEach(deltas, _function);
      }
      ResourceSet _xifexpression = null;
      if ((context instanceof CurrentDescriptions)) {
        BuildData _buildData = ((CurrentDescriptions) context).getBuildData();
        _xifexpression = _buildData.getResourceSet();
      } else {
        return false;
      }
      final ResourceSet resourceSet = _xifexpression;
      List<QualifiedName> changedSpecs = this.cachedDeltas.get(deltas);
      boolean _equals = Objects.equal(changedSpecs, null);
      if (_equals) {
        final Function1<IResourceDescription.Delta, Boolean> _function_1 = new Function1<IResourceDescription.Delta, Boolean>() {
          public Boolean apply(final IResourceDescription.Delta it) {
            return Boolean.valueOf(SuiteResourceDescriptionManager.this.isSpecFile(it));
          }
        };
        Iterable<IResourceDescription.Delta> _filter = IterableExtensions.<IResourceDescription.Delta>filter(deltas, _function_1);
        final Function1<IResourceDescription.Delta, Iterable<QualifiedName>> _function_2 = new Function1<IResourceDescription.Delta, Iterable<QualifiedName>>() {
          public Iterable<QualifiedName> apply(final IResourceDescription.Delta it) {
            return SuiteResourceDescriptionManager.this.modifiedSpecs(it, resourceSet);
          }
        };
        Iterable<Iterable<QualifiedName>> _map = IterableExtensions.<IResourceDescription.Delta, Iterable<QualifiedName>>map(_filter, _function_2);
        Iterable<QualifiedName> _flatten = Iterables.<QualifiedName>concat(_map);
        List<QualifiedName> _list = IterableExtensions.<QualifiedName>toList(_flatten);
        changedSpecs = _list;
        this.cachedDeltas.put(deltas, changedSpecs);
      } else {
        SuiteResourceDescriptionManager.logger.trace(" using cached deltas");
      }
      boolean _isEmpty = changedSpecs.isEmpty();
      if (_isEmpty) {
        SuiteResourceDescriptionManager.logger.debug(" no relevant changes in delta");
        return false;
      }
      boolean _isDebugEnabled = SuiteResourceDescriptionManager.logger.isDebugEnabled();
      if (_isDebugEnabled) {
        SuiteResourceDescriptionManager.logger.debug(" Changed specs: ");
        final Procedure1<QualifiedName> _function_3 = new Procedure1<QualifiedName>() {
          public void apply(final QualifiedName it) {
            String _string = SuiteResourceDescriptionManager.this._iQualifiedNameConverter.toString(it);
            String _plus = ("  " + _string);
            SuiteResourceDescriptionManager.logger.debug(_plus);
          }
        };
        IterableExtensions.<QualifiedName>forEach(changedSpecs, _function_3);
      }
      final Iterable<IEObjectDescription> suites = candidate.getExportedObjectsByType(SuitePackage.Literals.SUITE);
      final Function1<IEObjectDescription, Suite> _function_4 = new Function1<IEObjectDescription, Suite>() {
        public Suite apply(final IEObjectDescription it) {
          EObject _eObjectOrProxy = it.getEObjectOrProxy();
          EObject _resolve = EcoreUtil.resolve(((Suite) _eObjectOrProxy), resourceSet);
          return ((Suite) _resolve);
        }
      };
      Iterable<Suite> _map_1 = IterableExtensions.<IEObjectDescription, Suite>map(suites, _function_4);
      final Function1<Suite, Boolean> _function_5 = new Function1<Suite, Boolean>() {
        public Boolean apply(final Suite it) {
          boolean _eIsProxy = it.eIsProxy();
          return Boolean.valueOf((!_eIsProxy));
        }
      };
      Iterable<Suite> _filter_1 = IterableExtensions.<Suite>filter(_map_1, _function_5);
      final Function1<Suite, List<Pattern>> _function_6 = new Function1<Suite, List<Pattern>>() {
        public List<Pattern> apply(final Suite it) {
          List<PatternReference> _resolvePatternReferences = SuiteResourceDescriptionManager.this.resolvePatternReferences(it);
          final Function1<PatternReference, Pattern> _function = new Function1<PatternReference, Pattern>() {
            public Pattern apply(final PatternReference it) {
              String _pattern = it.getPattern();
              return Pattern.compile(_pattern);
            }
          };
          return ListExtensions.<PatternReference, Pattern>map(_resolvePatternReferences, _function);
        }
      };
      Iterable<List<Pattern>> _map_2 = IterableExtensions.<Suite, List<Pattern>>map(_filter_1, _function_6);
      Iterable<Pattern> _flatten_1 = Iterables.<Pattern>concat(_map_2);
      final List<Pattern> matchers = IterableExtensions.<Pattern>toList(_flatten_1);
      int _size = matchers.size();
      String _plus_1 = (" " + Integer.valueOf(_size));
      String _plus_2 = (_plus_1 + " referenced matchers");
      SuiteResourceDescriptionManager.logger.debug(_plus_2);
      boolean _isTraceEnabled_1 = SuiteResourceDescriptionManager.logger.isTraceEnabled();
      if (_isTraceEnabled_1) {
        final Procedure1<Pattern> _function_7 = new Procedure1<Pattern>() {
          public void apply(final Pattern it) {
            String _pattern = it.pattern();
            String _plus = ("  " + _pattern);
            SuiteResourceDescriptionManager.logger.trace(_plus);
          }
        };
        IterableExtensions.<Pattern>forEach(matchers, _function_7);
      }
      final Function1<QualifiedName, Boolean> _function_8 = new Function1<QualifiedName, Boolean>() {
        public Boolean apply(final QualifiedName specName) {
          final Function1<Pattern, Boolean> _function = new Function1<Pattern, Boolean>() {
            public Boolean apply(final Pattern it) {
              String _string = SuiteResourceDescriptionManager.this._iQualifiedNameConverter.toString(specName);
              Matcher _matcher = it.matcher(_string);
              return Boolean.valueOf(_matcher.matches());
            }
          };
          Pattern _findFirst = IterableExtensions.<Pattern>findFirst(matchers, _function);
          return Boolean.valueOf((!Objects.equal(_findFirst, null)));
        }
      };
      final QualifiedName firstRelevant = IterableExtensions.<QualifiedName>findFirst(changedSpecs, _function_8);
      boolean _isDebugEnabled_1 = SuiteResourceDescriptionManager.logger.isDebugEnabled();
      if (_isDebugEnabled_1) {
        boolean _notEquals = (!Objects.equal(firstRelevant, null));
        if (_notEquals) {
          String _string_1 = this._iQualifiedNameConverter.toString(firstRelevant);
          String _plus_3 = (">>  relevant spec change: " + _string_1);
          SuiteResourceDescriptionManager.logger.debug(_plus_3);
        } else {
          SuiteResourceDescriptionManager.logger.debug("  no relevant spec changes");
        }
      }
      return (!Objects.equal(firstRelevant, null));
    }
    return false;
  }
  
  protected List<PatternReference> _resolvePatternReferences(final Suite suite) {
    EList<Reference> _elements = suite.getElements();
    final Function1<Reference, List<PatternReference>> _function = new Function1<Reference, List<PatternReference>>() {
      public List<PatternReference> apply(final Reference it) {
        return SuiteResourceDescriptionManager.this.resolvePatternReferences(it);
      }
    };
    List<List<PatternReference>> _map = ListExtensions.<Reference, List<PatternReference>>map(_elements, _function);
    Iterable<PatternReference> _flatten = Iterables.<PatternReference>concat(_map);
    return IterableExtensions.<PatternReference>toList(_flatten);
  }
  
  protected List<PatternReference> _resolvePatternReferences(final SpecReference specRef) {
    return Collections.<PatternReference>emptyList();
  }
  
  protected List<PatternReference> _resolvePatternReferences(final PatternReference specRef) {
    List<PatternReference> _xblockexpression = null;
    {
      String _pattern = specRef.getPattern();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_pattern);
      if (_isNullOrEmpty) {
        return Collections.<PatternReference>emptyList();
      }
      _xblockexpression = Collections.<PatternReference>singletonList(specRef);
    }
    return _xblockexpression;
  }
  
  public boolean isSpecFile(final IResourceDescription.Delta delta) {
    URI _uri = delta.getUri();
    String _fileExtension = _uri.fileExtension();
    return SuiteResourceDescriptionManager.FILE_EXTENSIONS.contains(_fileExtension);
  }
  
  public Iterable<QualifiedName> modifiedSpecs(final IResourceDescription.Delta delta, final ResourceSet resourceSet) {
    Iterable<QualifiedName> _xblockexpression = null;
    {
      final IResourceDescription old = delta.getOld();
      final IResourceDescription _new = delta.getNew();
      Iterable<IEObjectDescription> _xifexpression = null;
      boolean _equals = Objects.equal(old, null);
      if (_equals) {
        _xifexpression = Collections.<IEObjectDescription>emptyList();
      } else {
        _xifexpression = this.topLevelSpecs(old, resourceSet);
      }
      final Iterable<IEObjectDescription> oldEObjects = _xifexpression;
      Iterable<IEObjectDescription> _xifexpression_1 = null;
      boolean _equals_1 = Objects.equal(_new, null);
      if (_equals_1) {
        _xifexpression_1 = Collections.<IEObjectDescription>emptyList();
      } else {
        _xifexpression_1 = this.topLevelSpecs(_new, resourceSet);
      }
      final Iterable<IEObjectDescription> newEObjects = _xifexpression_1;
      final Function1<IEObjectDescription, QualifiedName> _function = new Function1<IEObjectDescription, QualifiedName>() {
        public QualifiedName apply(final IEObjectDescription it) {
          return it.getQualifiedName();
        }
      };
      final Map<QualifiedName, IEObjectDescription> before = IterableExtensions.<QualifiedName, IEObjectDescription>toMap(oldEObjects, _function);
      final Function1<IEObjectDescription, QualifiedName> _function_1 = new Function1<IEObjectDescription, QualifiedName>() {
        public QualifiedName apply(final IEObjectDescription it) {
          return it.getQualifiedName();
        }
      };
      final Map<QualifiedName, IEObjectDescription> after = IterableExtensions.<QualifiedName, IEObjectDescription>toMap(newEObjects, _function_1);
      Set<QualifiedName> _keySet = before.keySet();
      final Function1<QualifiedName, Boolean> _function_2 = new Function1<QualifiedName, Boolean>() {
        public Boolean apply(final QualifiedName it) {
          boolean _containsKey = after.containsKey(it);
          return Boolean.valueOf((!_containsKey));
        }
      };
      Iterable<QualifiedName> _filter = IterableExtensions.<QualifiedName>filter(_keySet, _function_2);
      final Set<QualifiedName> deleted = IterableExtensions.<QualifiedName>toSet(_filter);
      Set<QualifiedName> _keySet_1 = after.keySet();
      final Function1<QualifiedName, Boolean> _function_3 = new Function1<QualifiedName, Boolean>() {
        public Boolean apply(final QualifiedName it) {
          boolean _containsKey = before.containsKey(it);
          return Boolean.valueOf((!_containsKey));
        }
      };
      Iterable<QualifiedName> _filter_1 = IterableExtensions.<QualifiedName>filter(_keySet_1, _function_3);
      final Set<QualifiedName> added = IterableExtensions.<QualifiedName>toSet(_filter_1);
      Set<QualifiedName> _keySet_2 = before.keySet();
      Set<QualifiedName> _keySet_3 = after.keySet();
      Iterable<QualifiedName> _plus = Iterables.<QualifiedName>concat(_keySet_2, _keySet_3);
      final Function1<QualifiedName, Boolean> _function_4 = new Function1<QualifiedName, Boolean>() {
        public Boolean apply(final QualifiedName it) {
          boolean _or = false;
          boolean _contains = deleted.contains(it);
          if (_contains) {
            _or = true;
          } else {
            boolean _contains_1 = added.contains(it);
            _or = _contains_1;
          }
          return Boolean.valueOf((!_or));
        }
      };
      final Iterable<QualifiedName> kept = IterableExtensions.<QualifiedName>filter(_plus, _function_4);
      final Function1<QualifiedName, Boolean> _function_5 = new Function1<QualifiedName, Boolean>() {
        public Boolean apply(final QualifiedName it) {
          IEObjectDescription _get = before.get(it);
          IEObjectDescription _get_1 = after.get(it);
          boolean _equals = SuiteResourceDescriptionManager.this.equals(_get, _get_1);
          return Boolean.valueOf((!_equals));
        }
      };
      final Iterable<QualifiedName> changed = IterableExtensions.<QualifiedName>filter(kept, _function_5);
      Iterable<QualifiedName> _plus_1 = Iterables.<QualifiedName>concat(deleted, added);
      _xblockexpression = Iterables.<QualifiedName>concat(_plus_1, changed);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> topLevelSpecs(final IResourceDescription resource, final ResourceSet resourceSet) {
    Iterable<IEObjectDescription> _exportedObjectsByType = resource.getExportedObjectsByType(JnarioPackage.Literals.SPECIFICATION);
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        boolean _xblockexpression = false;
        {
          EObject _eObjectOrProxy = it.getEObjectOrProxy();
          EObject _resolve = EcoreUtil.resolve(_eObjectOrProxy, resourceSet);
          final Specification spec = ((Specification) _resolve);
          XtendTypeDeclaration _declaringType = spec.getDeclaringType();
          _xblockexpression = Objects.equal(_declaringType, null);
        }
        return Boolean.valueOf(_xblockexpression);
      }
    };
    return IterableExtensions.<IEObjectDescription>filter(_exportedObjectsByType, _function);
  }
  
  public boolean equals(final IEObjectDescription oldObj, final IEObjectDescription newObj) {
    boolean _equals = Objects.equal(oldObj, newObj);
    if (_equals) {
      return true;
    }
    EClass _eClass = oldObj.getEClass();
    EClass _eClass_1 = newObj.getEClass();
    boolean _notEquals = (!Objects.equal(_eClass, _eClass_1));
    if (_notEquals) {
      return false;
    }
    boolean _and = false;
    QualifiedName _name = oldObj.getName();
    boolean _notEquals_1 = (!Objects.equal(_name, null));
    if (!_notEquals_1) {
      _and = false;
    } else {
      QualifiedName _name_1 = oldObj.getName();
      QualifiedName _name_2 = newObj.getName();
      boolean _equals_1 = _name_1.equals(_name_2);
      boolean _not = (!_equals_1);
      _and = _not;
    }
    if (_and) {
      return false;
    }
    URI _eObjectURI = oldObj.getEObjectURI();
    URI _eObjectURI_1 = newObj.getEObjectURI();
    boolean _equals_2 = _eObjectURI.equals(_eObjectURI_1);
    boolean _not_1 = (!_equals_2);
    if (_not_1) {
      return false;
    }
    return true;
  }
  
  public List<PatternReference> resolvePatternReferences(final EObject suite) {
    if (suite instanceof Suite) {
      return _resolvePatternReferences((Suite)suite);
    } else if (suite instanceof PatternReference) {
      return _resolvePatternReferences((PatternReference)suite);
    } else if (suite instanceof SpecReference) {
      return _resolvePatternReferences((SpecReference)suite);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite).toString());
    }
  }
}
