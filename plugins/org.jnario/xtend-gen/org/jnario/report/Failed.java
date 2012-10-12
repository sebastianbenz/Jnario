package org.jnario.report;

import com.google.common.collect.ImmutableList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;

@SuppressWarnings("all")
public class Failed extends SpecExecution {
  public static Failed failingSpec(final String className, final String name, final double executionTimeInSeconds, final SpecFailure... failures) {
    Failed _failed = new Failed(className, name, executionTimeInSeconds, ((Iterable<SpecFailure>)Conversions.doWrapArray(failures)));
    return _failed;
  }
  
  public Failed(final String className, final String name, final double executionTimeInSeconds, final Iterable<SpecFailure> failures) {
    super(className, name, executionTimeInSeconds, new Function0<ImmutableList<SpecFailure>>() {
      public ImmutableList<SpecFailure> apply() {
        ImmutableList<SpecFailure> _of = ImmutableList.<SpecFailure>of(((SpecFailure[])Conversions.unwrapArray(failures, SpecFailure.class)));
        return _of;
      }
    }.apply());
  }
}
