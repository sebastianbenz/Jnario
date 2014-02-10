/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.documentation._20FactsAboutXtendAModernizedJavaSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendFunctionalProgrammingFTWSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendReadableCodeWithExtensionMethodsSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendSomeImportantDifferencesSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendTheUberSwitchExpressionSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * This document teaches you everything
 * you need to know about Xtend to effectively use
 * [Jnario](http://www.jnario.org). For a more detailed
 * introduction see the offical [Xtend documentation]
 * (http://www.eclipse.org/xtend/documentation.html).
 * This document is automatically generated from a specification
 * written in Jnario. You can see the original source code
 * by clicking on **source** in the upper right corner.
 */
@Contains({ _20FactsAboutXtendAModernizedJavaSpec.class, _20FactsAboutXtendSomeImportantDifferencesSpec.class, _20FactsAboutXtendTheUberSwitchExpressionSpec.class, _20FactsAboutXtendReadableCodeWithExtensionMethodsSpec.class, _20FactsAboutXtendFunctionalProgrammingFTWSpec.class })
@Named("20 Facts about Xtend")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class _20FactsAboutXtendSpec {
  public <T extends Object> boolean operator_doubleArrow(final Iterable<T> actual, final Iterable<T> expected) {
    List<T> _list = IterableExtensions.<T>toList(actual);
    List<T> _list_1 = IterableExtensions.<T>toList(expected);
    return Objects.equal(_list, _list_1);
  }
}
