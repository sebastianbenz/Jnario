package org.jnario.lib.tests;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.Clock;
import org.jnario.lib.Sleeper;
import org.jnario.lib.Wait;
import org.jnario.lib.tests.MockInjector;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.verification.VerificationMode;

@Named("Wait")
@RunWith(ExampleGroupRunner.class)
@CreateWith(MockInjector.class)
@SuppressWarnings("all")
public class WaitSpec {
  public Wait subject;
  
  @Mock
  Sleeper sleeper;
  
  @Mock
  Clock clock;
  
  @Mock
  Function0<Boolean> condition;
  
  @Before
  public void before() throws Exception {
    Wait _wait = new Wait(this.sleeper, this.clock);
    this.subject = _wait;
  }
  
  @Test
  @Named("waits until condition is true")
  @Order(1)
  public void _waitsUntilConditionIsTrue() throws Exception {
    Boolean _apply = this.condition.apply();
    OngoingStubbing<Boolean> _when = Mockito.<Boolean>when(_apply);
    _when.thenReturn(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true));
    this.waitFor(this.condition);
    VerificationMode _times = Mockito.times(3);
    Function0<Boolean> _verify = Mockito.<Function0<Boolean>>verify(this.condition, _times);
    _verify.apply();
  }
  
  @Test
  @Named("tries every specified polling frequency")
  @Order(2)
  public void _triesEverySpecifiedPollingFrequency() throws Exception {
    this.subject.setPollingInterval(10l);
    Boolean _apply = this.condition.apply();
    OngoingStubbing<Boolean> _when = Mockito.<Boolean>when(_apply);
    _when.thenReturn(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true));
    this.waitFor(this.condition);
    VerificationMode _times = Mockito.times(2);
    Sleeper _verify = Mockito.<Sleeper>verify(this.sleeper, _times);
    _verify.sleep(10l);
  }
  
  @Test
  @Named("throws TimeoutError after specified time")
  @Order(3)
  public void _throwsTimeoutErrorAfterSpecifiedTime() throws Exception {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from void to Throwable");
  }
  
  public void waitFor(final Function0<Boolean> condition) {
    this.subject.until(condition);
  }
}
