/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ExtensionsFeatureDefiningOwnExtensions;
import org.jnario.feature.tests.integration.ExtensionsFeatureReferencingMultipleExtensions;
import org.jnario.feature.tests.integration.ExtensionsFeatureReferencingStepsWithExtensions;
import org.jnario.feature.tests.integration.ExtensionsFeatureReferencingStepsWithImportedExtensions;
import org.jnario.feature.tests.integration.ExtensionsFeatureUsingJnarioPredefinedExtensions;
import org.jnario.feature.tests.integration.ExtensionsFeatureUsingMultipleExtensions;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ ExtensionsFeatureUsingJnarioPredefinedExtensions.class, ExtensionsFeatureReferencingStepsWithExtensions.class, ExtensionsFeatureDefiningOwnExtensions.class, ExtensionsFeatureReferencingStepsWithImportedExtensions.class, ExtensionsFeatureUsingMultipleExtensions.class, ExtensionsFeatureReferencingMultipleExtensions.class })
@Named("Extensions")
@SuppressWarnings("all")
public class ExtensionsFeature {
}
