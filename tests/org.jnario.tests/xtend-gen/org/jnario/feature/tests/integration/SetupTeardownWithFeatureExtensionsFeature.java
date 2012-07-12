/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains(SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension.class)
@Named("Setup & Teardown with Feature Extensions")
@SuppressWarnings("all")
public class SetupTeardownWithFeatureExtensionsFeature {
}
