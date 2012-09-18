package features;

import features.AdditionFeatureAddTwoNumbers;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
@RunWith(FeatureRunner.class)
@Contains(AdditionFeatureAddTwoNumbers.class)
@Named("Addition")
@SuppressWarnings("all")
public class AdditionFeature {
}
