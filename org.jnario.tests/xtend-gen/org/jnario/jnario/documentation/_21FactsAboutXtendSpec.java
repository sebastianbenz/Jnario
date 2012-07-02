package org.jnario.jnario.documentation;

import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.documentation._21FactsAboutXtendAModernizedJavaSpec;
import org.jnario.jnario.documentation._21FactsAboutXtendFunctionalProgrammingFTWSpec;
import org.jnario.jnario.documentation._21FactsAboutXtendReadableCodeWithExtensionMethodsSpec;
import org.jnario.jnario.documentation._21FactsAboutXtendTheUberSwitchExpressionSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * This document teaches you everything
 * you need to know about Xtend in order to successfully use
 * [Jnario](http://www.jnario.org). For a more detailed
 * introduction see the offical
 * [Xtend documentation](http://www.eclipse.org/xtend/documentation.html).
 */
@Contains({ _21FactsAboutXtendAModernizedJavaSpec.class, _21FactsAboutXtendTheUberSwitchExpressionSpec.class, _21FactsAboutXtendReadableCodeWithExtensionMethodsSpec.class, _21FactsAboutXtendFunctionalProgrammingFTWSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("21 Facts about Xtend")
public class _21FactsAboutXtendSpec {
  public <T extends Object> Iterable<T> iterable(final T... elements) {
    final Function0<Iterator<T>> _function = new Function0<Iterator<T>>() {
        public Iterator<T> apply() {
          Iterator<T> _iterator = ((List<T>)Conversions.doWrapArray(elements)).iterator();
          return _iterator;
        }
      };
    return new Iterable<T>() {
        public Iterator<T> iterator() {
          return _function.apply();
        }
    };
  }
  
  public <T extends Object> boolean operator_doubleArrow(final Iterable<T> actual, final Iterable<T> expected) {
    List<T> _list = IterableExtensions.<T>toList(actual);
    List<T> _list_1 = IterableExtensions.<T>toList(expected);
    boolean _equals = Objects.equal(_list, _list_1);
    return _equals;
  }
}
