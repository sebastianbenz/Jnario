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
@RunWith(FeatureRunner.class)
@Contains({ AccessOfVariablesFeatureAccessAVariableInTheSameStepItWasDeclaredIn.class, AccessOfVariablesFeatureAccessAVariableThatWasDeclaredInADifferentStep.class, AccessOfVariablesFeatureAccessAVariableThatWasAssignedAValueOfAVariableDefinedInADifferentStep.class, AccessOfVariablesFeatureAccessAVariableDeclaredInBackgroundStep.class, AccessOfVariablesFeatureAccessAVariableReferencingAVariableFromBackgroundStep.class })
@Named("Feature: Access of variables")
@SuppressWarnings("all")
public class AccessOfVariablesFeature {
}
