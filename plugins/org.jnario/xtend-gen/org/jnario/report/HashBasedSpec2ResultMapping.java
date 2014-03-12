package org.jnario.report;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.Executable;
import org.jnario.jvmmodel.ExecutableProvider;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.report.Failed;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;

@SuppressWarnings("all")
public class HashBasedSpec2ResultMapping implements SpecExecutionAcceptor, Executable2ResultMapping {
  private final HashMap<Pair<String,String>,SpecExecution> results = CollectionLiterals.<Pair<String,String>, SpecExecution>newHashMap();
  
  @Extension
  private JnarioNameProvider nameProvider;
  
  @Inject
  public HashBasedSpec2ResultMapping(final JnarioNameProvider nameProvider) {
    this.nameProvider = nameProvider;
  }
  
  public SpecExecution getResult(final Executable executable) {
    SpecExecution _xblockexpression = null;
    {
      boolean _equals = Objects.equal(executable, null);
      if (_equals) {
        return new NotRun("", "");
      }
      Pair<String,String> _asKey = this.asKey(executable);
      SpecExecution result = this.results.get(_asKey);
      boolean _notEquals = (!Objects.equal(result, null));
      if (_notEquals) {
        return result;
      }
      SpecExecution _calculateResult = this.calculateResult(executable);
      result = _calculateResult;
      this.accept(result);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  private SpecExecution calculateResult(final Executable specification) {
    SpecExecution _xblockexpression = null;
    {
      final List<? extends Executable> children = this.executables(specification);
      final Function1<Executable,SpecExecution> _function = new Function1<Executable,SpecExecution>() {
        public SpecExecution apply(final Executable it) {
          return HashBasedSpec2ResultMapping.this.getResult(it);
        }
      };
      List<SpecExecution> _map = ListExtensions.map(children, _function);
      final List<SpecExecution> results = IterableExtensions.<SpecExecution>toList(_map);
      _xblockexpression = (this.createResult(specification, results));
    }
    return _xblockexpression;
  }
  
  private SpecExecution createResult(final Executable specification, final Iterable<SpecExecution> children) {
    SpecExecution _xblockexpression = null;
    {
      final Pair<String,String> specId = this.asKey(specification);
      boolean _areNotExecuted = this.areNotExecuted(children);
      if (_areNotExecuted) {
        return this.notRunOrPending(specification, specId);
      }
      final Double executionTime = this.executionTime(children);
      final Function1<SpecExecution,List<SpecFailure>> _function = new Function1<SpecExecution,List<SpecFailure>>() {
        public List<SpecFailure> apply(final SpecExecution it) {
          return it.getFailures();
        }
      };
      Iterable<List<SpecFailure>> _map = IterableExtensions.<SpecExecution, List<SpecFailure>>map(children, _function);
      final Iterable<SpecFailure> failures = Iterables.<SpecFailure>concat(_map);
      SpecExecution _xifexpression = null;
      boolean _isEmpty = IterableExtensions.isEmpty(failures);
      if (_isEmpty) {
        _xifexpression = this.passedOrPending(specification, specId, (executionTime).doubleValue());
      } else {
        String _key = specId.getKey();
        String _value = specId.getValue();
        _xifexpression = new Failed(_key, _value, (executionTime).doubleValue(), failures);
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  private SpecExecution notRunOrPending(final Executable executable, final Pair<String,String> specId) {
    SpecExecution _xifexpression = null;
    boolean _isPending = executable.isPending();
    if (_isPending) {
      String _key = specId.getKey();
      String _value = specId.getValue();
      _xifexpression = new Pending(_key, _value, 0.0);
    } else {
      String _key_1 = specId.getKey();
      String _value_1 = specId.getValue();
      _xifexpression = new NotRun(_key_1, _value_1);
    }
    return _xifexpression;
  }
  
  private SpecExecution passedOrPending(final Executable executable, final Pair<String,String> specId, final double executionTime) {
    SpecExecution _xifexpression = null;
    boolean _isPending = executable.isPending();
    if (_isPending) {
      String _key = specId.getKey();
      String _value = specId.getValue();
      _xifexpression = new Pending(_key, _value, executionTime);
    } else {
      String _key_1 = specId.getKey();
      String _value_1 = specId.getValue();
      _xifexpression = new Passed(_key_1, _value_1, executionTime);
    }
    return _xifexpression;
  }
  
  private Double executionTime(final Iterable<SpecExecution> results) {
    final Function2<Double,SpecExecution,Double> _function = new Function2<Double,SpecExecution,Double>() {
      public Double apply(final Double sum, final SpecExecution result) {
        double _executionTimeInSeconds = result.getExecutionTimeInSeconds();
        return Double.valueOf(((sum).doubleValue() + _executionTimeInSeconds));
      }
    };
    return IterableExtensions.<SpecExecution, Double>fold(results, Double.valueOf(0.0), _function);
  }
  
  private boolean areNotExecuted(final Iterable<SpecExecution> executions) {
    boolean _or = false;
    boolean _isEmpty = IterableExtensions.isEmpty(executions);
    if (_isEmpty) {
      _or = true;
    } else {
      Iterable<NotRun> _filter = Iterables.<NotRun>filter(executions, NotRun.class);
      boolean _isEmpty_1 = IterableExtensions.isEmpty(_filter);
      boolean _not = (!_isEmpty_1);
      _or = _not;
    }
    return _or;
  }
  
  private Pair<String,String> asKey(final Executable executable) {
    Pair<String,String> _xblockexpression = null;
    {
      String _qualifiedJavaClassName = this.nameProvider.toQualifiedJavaClassName(executable);
      String _convertFromJavaString = null;
      if (_qualifiedJavaClassName!=null) {
        _convertFromJavaString=Strings.convertFromJavaString(_qualifiedJavaClassName, true);
      }
      final String expectedClassName = _convertFromJavaString;
      String _describe = this.nameProvider.describe(executable);
      String _convertFromJavaString_1 = null;
      if (_describe!=null) {
        _convertFromJavaString_1=Strings.convertFromJavaString(_describe, true);
      }
      final String expectedName = _convertFromJavaString_1;
      final Pair<String,String> key = Pair.<String, String>of(expectedClassName, expectedName);
      _xblockexpression = (key);
    }
    return _xblockexpression;
  }
  
  private List<? extends Executable> executables(final Executable element) {
    List<? extends Executable> _xblockexpression = null;
    {
      Resource _eResource = element.eResource();
      final XtextResource resource = ((XtextResource) _eResource);
      boolean _equals = Objects.equal(resource, null);
      if (_equals) {
        return CollectionLiterals.<Executable>emptyList();
      }
      final IResourceServiceProvider resourceServiceProvider = resource.getResourceServiceProvider();
      ExecutableProvider _get = resourceServiceProvider.<ExecutableProvider>get(ExecutableProvider.class);
      _xblockexpression = (_get.getExecutables(element));
    }
    return _xblockexpression;
  }
  
  public void accept(final SpecExecution result) {
    String _className = result.getClassName();
    String _name = result.getName();
    final Pair<String,String> key = Pair.<String, String>of(_className, _name);
    this.results.put(key, result);
  }
}
