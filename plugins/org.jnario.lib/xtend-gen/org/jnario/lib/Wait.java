package org.jnario.lib;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.jnario.lib.Clock;
import org.jnario.lib.Sleeper;
import org.jnario.lib.TimeoutError;

/**
 * A helper for automatically waiting until a condition turns true. Use it like this:
 * 
 * <code>
 * fact "Wait for something"{
 *   // define wait condition using lambdas
 *   waitUntil[1 > 0]
 *   // configuration options
 *   waitUntil[
 *     message = "Custom error message"
 *     duration = 100
 *     pollingInterval = 10
 *     1 > 0
 *   ]
 * }
 * </code>
 */
@SuppressWarnings("all")
public class Wait {
  /**
   * Wait until the provided function evaluates to true.
   */
  public static void waitUntil(final Function1<Wait, Boolean> initializer) {
    final Wait wait = new Wait(Sleeper.SYSTEM_SLEEPER, Clock.SYSTEM_CLOCK);
    final Function0<Boolean> _function = new Function0<Boolean>() {
      public Boolean apply() {
        return initializer.apply(wait);
      }
    };
    final Function0<Boolean> condition = _function;
    wait.until(condition);
  }
  
  private final Sleeper sleeper;
  
  private final Clock clock;
  
  private String message = "Timeout occurred";
  
  private long duration = 500l;
  
  private long pollingInterval = 50l;
  
  public Wait(final Sleeper sleeper, final Clock clock) {
    this.sleeper = sleeper;
    this.clock = clock;
  }
  
  public void until(final Function0<Boolean> condition) {
    try {
      final long start = this.clock.currentTime();
      Boolean _apply = condition.apply();
      boolean _not = (!(_apply).booleanValue());
      boolean _while = _not;
      while (_while) {
        {
          boolean _timeOut = this.timeOut(start);
          if (_timeOut) {
            throw new TimeoutError(this.message);
          }
          this.sleeper.sleep(this.pollingInterval);
        }
        Boolean _apply_1 = condition.apply();
        boolean _not_1 = (!(_apply_1).booleanValue());
        _while = _not_1;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean timeOut(final long start) {
    long _currentTime = this.clock.currentTime();
    return (_currentTime > (start + this.duration));
  }
  
  public String setMessage(final String message) {
    return this.message = message;
  }
  
  public long setDuration(final long duration) {
    return this.duration = duration;
  }
  
  public long setPollingInterval(final long pollingInterval) {
    return this.pollingInterval = pollingInterval;
  }
}
