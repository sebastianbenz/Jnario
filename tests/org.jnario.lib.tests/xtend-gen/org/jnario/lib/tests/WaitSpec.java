package org.jnario.lib.tests;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.Clock;
import org.jnario.lib.Sleeper;
import org.jnario.lib.TimeoutError;
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

@SuppressWarnings("all")
@Named("Wait")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = MockInjector.class)
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
    this.subject.setDuration(100l);
    Boolean _apply = this.condition.apply();
    OngoingStubbing<Boolean> _when = Mockito.<Boolean>when(_apply);
    _when.thenReturn(Boolean.valueOf(false));
    long _currentTime = this.clock.currentTime();
    OngoingStubbing<Long> _when_1 = Mockito.<Long>when(Long.valueOf(_currentTime));
    _when_1.thenReturn(Long.valueOf(0l), Long.valueOf(50l), Long.valueOf(100l), Long.valueOf(150l));
    boolean expectedException = false;
    String message = "";
    try{
      this.waitFor(this.condition);
      message = "Expected " + TimeoutError.class.getName() + " for \n     waitFor(condition)\n with:"
       + "\n     condition is " + new StringDescription().appendValue(this.condition).toString();
    }catch(TimeoutError e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
  
  public void waitFor(final Function0<Boolean> condition) {
    this.subject.until(condition);
  }
}
