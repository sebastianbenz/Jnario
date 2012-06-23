package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteNode;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteElement;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class SuiteNodeBuilder {
  private final static char PREFIX = new Function0<Character>() {
    public Character apply() {
      char _charAt = "#".charAt(0);
      return _charAt;
    }
  }.apply();
  
  @Inject
  private SpecResolver _specResolver;
  
  public Iterable<SuiteNode> buildNodeModel(final SuiteFile suiteFile) {
    ArrayList<SuiteNode> _xblockexpression = null;
    {
      EList<XtendClass> _xtendClasses = suiteFile.getXtendClasses();
      Iterable<Suite> _filter = Iterables.<Suite>filter(_xtendClasses, Suite.class);
      final List<Suite> suites = IterableExtensions.<Suite>toList(_filter);
      final ArrayList<SuiteNode> result = CollectionLiterals.<SuiteNode>newArrayList();
      boolean _isEmpty = suites.isEmpty();
      if (_isEmpty) {
        return result;
      }
      final HashMap<SuiteElement,SuiteNode> mapping = CollectionLiterals.<SuiteElement, SuiteNode>newHashMap();
      int _size = suites.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        {
          final Suite current = suites.get((i).intValue());
          EList<SuiteElement> _elements = current.getElements();
          final Function1<SuiteElement,List<Specification>> _function = new Function1<SuiteElement,List<Specification>>() {
              public List<Specification> apply(final SuiteElement it) {
                List<Specification> _resolveSpecs = SuiteNodeBuilder.this._specResolver.resolveSpecs(it);
                return _resolveSpecs;
              }
            };
          List<List<Specification>> _map = ListExtensions.<SuiteElement, List<Specification>>map(_elements, _function);
          final Iterable<Specification> specs = Iterables.<Specification>concat(_map);
          SuiteNode _suiteNode = new SuiteNode(current, specs);
          final SuiteNode currentNode = _suiteNode;
          Suite _parent = this.parent(suites, (i).intValue());
          final SuiteNode parent = mapping.get(_parent);
          currentNode.setParent(parent);
          mapping.put(current, currentNode);
          boolean _equals = Objects.equal(parent, null);
          if (_equals) {
            result.add(currentNode);
          }
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public Suite parent(final List<Suite> suites, final int i) {
    boolean _equals = (i == 0);
    if (_equals) {
      return null;
    }
    Suite _get = suites.get(i);
    final Integer current = this.level(_get);
    int _minus = (i - 1);
    IntegerRange _upTo = new IntegerRange(_minus, 0);
    for (final Integer j : _upTo) {
      {
        final Suite candidate = suites.get((j).intValue());
        Integer _level = this.level(candidate);
        boolean _greaterThan = (current.compareTo(_level) > 0);
        if (_greaterThan) {
          return candidate;
        }
      }
    }
    return null;
  }
  
  public Integer level(final Suite suite) {
    final String name = suite.getName();
    int _length = name.length();
    IntegerRange _upTo = new IntegerRange(0, _length);
    for (final Integer i : _upTo) {
      char _charAt = name.charAt((i).intValue());
      boolean _notEquals = (_charAt != SuiteNodeBuilder.PREFIX);
      if (_notEquals) {
        return i;
      }
    }
    return Integer.valueOf((-1));
  }
}
