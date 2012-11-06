package org.jnario.lib;

@SuppressWarnings("all")
public class TimeoutError extends AssertionError {
  public TimeoutError(final String message) {
    super(message);
  }
}
