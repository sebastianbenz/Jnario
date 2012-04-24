package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Objects;

/**
 * Jnario provides syntactic sugar for creating matchers.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Matcher")
public class MatcherSpec {
  @Test
  @Named("returns the boolean result of the evaluated expression")
  @Order(99)
  public void returnsTheBooleanResultOfTheEvaluatedExpression() throws Exception {
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
        public Boolean apply(final String input) {
          boolean _equals = Objects.equal(input, "true");
          return _equals;
        }
      };
    final Matcher<String> myMatcher = org.jnario.lib.Should.matches("[String input | input == \"true\"]", _function);
    boolean _matches = myMatcher.matches("true");
    Assert.assertTrue("\nExpected myMatcher.matches(\"true\") but:"
     + "\n     myMatcher is " + myMatcher + "\n", _matches);
    
    boolean _matches_1 = myMatcher.matches("false");
    boolean _not = (!_matches_1);
    Assert.assertTrue("\nExpected !myMatcher.matches(\"false\") but:"
     + "\n     myMatcher.matches(\"false\") is " + _matches_1
     + "\n     myMatcher is " + myMatcher + "\n", _not);
    
  }
  
  @Test
  @Named("type can be coerced from the context")
  @Order(99)
  public void typeCanBeCoercedFromTheContext() throws Exception {
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
        public Boolean apply(final String it) {
          boolean _equals = Objects.equal(it, "true");
          return Boolean.valueOf(_equals);
        }
      };
    final Matcher<String> myMatcher = org.jnario.lib.Should.matches("[it  == \"true\"]", _function);
    boolean _matches = myMatcher.matches("true");
    Assert.assertTrue("\nExpected myMatcher.matches(\"true\") but:"
     + "\n     myMatcher is " + myMatcher + "\n", _matches);
    
    boolean _matches_1 = myMatcher.matches("false");
    boolean _not = (!_matches_1);
    Assert.assertTrue("\nExpected !myMatcher.matches(\"false\") but:"
     + "\n     myMatcher.matches(\"false\") is " + _matches_1
     + "\n     myMatcher is " + myMatcher + "\n", _not);
    
  }
  
  @Test
  @Named("works with should")
  @Order(99)
  public void worksWithShould() throws Exception {
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
        public Boolean apply(final String it) {
          boolean _startsWith = it.startsWith("H");
          return Boolean.valueOf(_startsWith);
        }
      };
    boolean _should_be = Should.<String>should_be(
      "Hello", new Function0<Matcher<String>>() {
      public Matcher<String> apply() {
        final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
            public Boolean apply(final String it) {
              boolean _startsWith = it.startsWith("H");
              return Boolean.valueOf(_startsWith);
            }
          };
        return org.jnario.lib.Should.matches("[it.startsWith(\"H\")]", _function);
      }
    }.apply());Assert
    .assertTrue("\nExpected \"Hello\" => #[it.startsWith(\"H\")] but:"
     + "\n     #[it.startsWith(\"H\")] is " + org.jnario.lib.Should.matches("[it.startsWith(\"H\")]", _function) + "\n", _should_be);
    
  }
  
  @Test
  @Named("uses the closure\\\'s code as description")
  @Order(99)
  public void usesTheClosureSCodeAsDescription() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
              public Boolean apply(final String it) {
                boolean _startsWith = it.startsWith("b");
                return Boolean.valueOf(_startsWith);
              }
            };
          boolean _should_be = Should.<String>should_be(
            "a", new Function0<Matcher<String>>() {
            public Matcher<String> apply() {
              final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
                  public Boolean apply(final String it) {
                    boolean _startsWith = it.startsWith("b");
                    return Boolean.valueOf(_startsWith);
                  }
                };
              return org.jnario.lib.Should.matches("[it.startsWith(\"b\")]", _function);
            }
          }.apply());Assert
          .assertTrue("\nExpected \"a\" => #[it.startsWith(\"b\")] but:"
           + "\n     #[it.startsWith(\"b\")] is " + org.jnario.lib.Should.matches("[it.startsWith(\"b\")]", _function) + "\n", _should_be);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected \"a\" => #[it.startsWith(\"b\")] but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("#[it.startsWith(\"b\")] is [it.startsWith(\"b\")]");
    Helpers.is(_errorMessage, _builder);
  }
}
