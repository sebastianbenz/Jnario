package org.jnario.report;

import java.util.List;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.SpecFailure;

@Data
@SuppressWarnings("all")
public abstract class SpecExecution {
  public static Passed passingSpec(final String className, final String name, final double executionTimeInSeconds) {
    Passed _passed = new Passed(className, name, executionTimeInSeconds);
    return _passed;
  }
  
  public static Failed failingSpec(final String className, final String name, final double executionTimeInSeconds, final SpecFailure... failures) {
    Failed _failed = new Failed(className, name, executionTimeInSeconds, ((Iterable<SpecFailure>)Conversions.doWrapArray(failures)));
    return _failed;
  }
  
  private final String _className;
  
  public String getClassName() {
    return this._className;
  }
  
  private final String _name;
  
  public String getName() {
    return this._name;
  }
  
  private final double _executionTimeInSeconds;
  
  public double getExecutionTimeInSeconds() {
    return this._executionTimeInSeconds;
  }
  
  private final List<SpecFailure> _failures;
  
  public List<SpecFailure> getFailures() {
    return this._failures;
  }
  
  public SpecExecution(final String className, final String name, final double executionTimeInSeconds, final List<SpecFailure> failures) {
    super();
    this._className = className;
    this._name = name;
    this._executionTimeInSeconds = executionTimeInSeconds;
    this._failures = failures;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_className== null) ? 0 : _className.hashCode());
    result = prime * result + ((_name== null) ? 0 : _name.hashCode());
    result = prime * result + (int) (Double.doubleToLongBits(_executionTimeInSeconds) ^ (Double.doubleToLongBits(_executionTimeInSeconds) >>> 32));
    result = prime * result + ((_failures== null) ? 0 : _failures.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SpecExecution other = (SpecExecution) obj;
    if (_className == null) {
      if (other._className != null)
        return false;
    } else if (!_className.equals(other._className))
      return false;
    if (_name == null) {
      if (other._name != null)
        return false;
    } else if (!_name.equals(other._name))
      return false;
    if (Double.doubleToLongBits(other._executionTimeInSeconds) != Double.doubleToLongBits(_executionTimeInSeconds))
      return false;
    if (_failures == null) {
      if (other._failures != null)
        return false;
    } else if (!_failures.equals(other._failures))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
