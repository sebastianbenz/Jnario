package org.jnario.report;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.Executable;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;

@SuppressWarnings("all")
public class HashBasedSpec2ResultMapping implements SpecExecutionAcceptor {
  private final Map<Pair<String,String>,SpecExecution> results = new Function0<Map<Pair<String,String>,SpecExecution>>() {
    public Map<Pair<String,String>,SpecExecution> apply() {
      HashMap<Pair<String,String>,SpecExecution> _newHashMap = CollectionLiterals.<Pair<String,String>, SpecExecution>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  private JnarioNameProvider nameProvider;
  
  @Inject
  public HashBasedSpec2ResultMapping(final JnarioNameProvider nameProvider) {
    this.nameProvider = nameProvider;
  }
  
  public SpecExecution getResult(final Executable executable) {
    SpecExecution _xblockexpression = null;
    {
      Pair<String,String> _asKey = executable==null?(Pair<String,String>)null:this.asKey(executable);
      final SpecExecution result = this.results.get(_asKey);
      SpecExecution _xifexpression = null;
      boolean _equals = Objects.equal(result, null);
      if (_equals) {
        _xifexpression = SpecExecution.NO_EXECUTION;
      } else {
        _xifexpression = result;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  private Pair<String,String> asKey(final Executable executable) {
    Pair<String,String> _xblockexpression = null;
    {
      EObject _eContainer = executable.eContainer();
      final String expectedClassName = this.nameProvider.toQualifiedJavaClassName(_eContainer);
      String _describe = this.nameProvider.describe(executable);
      final String expectedName = StringEscapeUtils.escapeXml(_describe);
      Pair<String,String> _mappedTo = Pair.<String, String>of(expectedClassName, expectedName);
      _xblockexpression = (_mappedTo);
    }
    return _xblockexpression;
  }
  
  public void accept(final SpecExecution result) {
    String _className = result.getClassName();
    String _name = result.getName();
    Pair<String,String> _mappedTo = Pair.<String, String>of(_className, _name);
    this.results.put(_mappedTo, result);
  }
}
