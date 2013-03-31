/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.parser;

import static org.jnario.feature.ui.contentassist.antlr.internal.InternalFeatureLexer.RULE_BACKGROUND_TEXT;
import static org.jnario.feature.ui.contentassist.antlr.internal.InternalFeatureLexer.RULE_FEATURE_TEXT;
import static org.jnario.feature.ui.contentassist.antlr.internal.InternalFeatureLexer.RULE_SCENARIO_TEXT;
import static org.jnario.feature.ui.contentassist.antlr.internal.InternalFeatureLexer.RULE_TEXT;

import org.jnario.feature.parser.FeatureTokenSource;
public class ContentAssistFeatureTokenSource extends FeatureTokenSource {

	protected int ruleScenario() {
		return RULE_SCENARIO_TEXT;
	}

	protected int ruleBackground() {
		return RULE_BACKGROUND_TEXT;
	}

	protected int ruleText() {
		return RULE_TEXT;
	}

	protected int ruleFeatureText() {
		return RULE_FEATURE_TEXT;
	}
	
}
