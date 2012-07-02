package org.jnario.jnario.documentation;

import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.documentation._21FactsAboutXtendExtensionMethodsSpec;
import org.jnario.jnario.documentation._21FactsAboutXtendFunctionalProgrammingFTWSpec;
import org.jnario.jnario.documentation._21FactsAboutXtendSyntaxSpec;
import org.jnario.jnario.documentation._21FactsAboutXtendTheUberSwitchExpressionSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * This document will teach you all
 * you need to know about Xtend to use [Jnario](http://www.jnario.org). All the
 * shown examples work also in Jnario specifications. For a more detailed
 * introduction see the offical
 * [Xtend documentation](http://www.eclipse.org/xtend/documentation.html).
 */
@Contains({ _21FactsAboutXtendSyntaxSpec.class, _21FactsAboutXtendExtensionMethodsSpec.class, _21FactsAboutXtendTheUberSwitchExpressionSpec.class, _21FactsAboutXtendFunctionalProgrammingFTWSpec.class })
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
