package org.jnario.report;

import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

import com.google.common.collect.ImmutableList;

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
