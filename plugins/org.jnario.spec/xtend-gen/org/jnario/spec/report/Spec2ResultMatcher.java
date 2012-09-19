package org.jnario.spec.report;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.jnario.Executable;
import org.jnario.report.Executable2ResultMatcher;
import org.jnario.report.SpecExecution;
import org.jnario.spec.naming.ExampleNameProvider;

@SuppressWarnings("all")
public class Spec2ResultMatcher implements Executable2ResultMatcher {
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  public boolean matches(final Executable executable, final SpecExecution input) {
    boolean _xblockexpression = false;
    {
      EObject _eContainer = executable.eContainer();
      final String expectedClassName = this._exampleNameProvider.toQualifiedJavaClassName(_eContainer);
      String _describe = this._exampleNameProvider.describe(executable);
      final String expectedName = StringEscapeUtils.escapeXml(_describe);
      boolean _and = false;
      String _className = input.getClassName();
      boolean _equals = Objects.equal(_className, expectedClassName);
      if (!_equals) {
        _and = false;
      } else {
        String _name = input.getName();
        boolean _equals_1 = Objects.equal(_name, expectedName);
        _and = (_equals && _equals_1);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
}
