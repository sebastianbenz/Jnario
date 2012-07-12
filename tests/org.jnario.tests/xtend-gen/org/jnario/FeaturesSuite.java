/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeature;
import org.jnario.feature.tests.unit.linking.ReferencingOtherStepsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.ExtensionsSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Features")
@Contains({ ExtensionsSpec.class, UsingJUnitRulesInFeaturesFeature.class, ReferencingOtherStepsSpec.class })
@SuppressWarnings("all")
public class FeaturesSuite {
}
