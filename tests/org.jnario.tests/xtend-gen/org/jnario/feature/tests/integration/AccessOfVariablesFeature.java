package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.AccessOfVariablesFeatureAccessAVariableDeclaredInBackgroundStep;
import org.jnario.feature.tests.integration.AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn;
import org.jnario.feature.tests.integration.AccessOfVariablesFeatureAccessAVariableReferencingAVariableFromBackgroundStep;
import org.jnario.feature.tests.integration.AccessOfVariablesFeatureAccessAVariableThatWasAssignedAValueOfAVariableDefinedInADifferentStep;
import org.jnario.feature.tests.integration.AccessOfVariablesFeatureAccessAVariableThatWasDeclaredInADifferentStep;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Contains({ AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn.class, AccessOfVariablesFeatureAccessAVariableThatWasDeclaredInADifferentStep.class, AccessOfVariablesFeatureAccessAVariableThatWasAssignedAValueOfAVariableDefinedInADifferentStep.class, AccessOfVariablesFeatureAccessAVariableDeclaredInBackgroundStep.class, AccessOfVariablesFeatureAccessAVariableReferencingAVariableFromBackgroundStep.class })
@Named("Access of variables")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class AccessOfVariablesFeature {
}
