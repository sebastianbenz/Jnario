/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.conversion;

import org.jnario.feature.conversion.FeatureValueConverter;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterToStringSpec;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterToValueSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ FeatureValueConverterToValueSpec.class, FeatureValueConverterToStringSpec.class })
@Named("FeatureValueConverter")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureValueConverterSpec {
  FeatureValueConverter subject = FeatureValueConverter.create("Prefix:");
}
