/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.jnario.feature.parser.FeatureTokenSource;
import org.jnario.suite.parser.antlr.SuiteParser;

public class CustomSuiteParser extends SuiteParser{

	@Override
	protected TokenSource createLexer(CharStream stream) {
		FeatureTokenSource tokenSource = new SuiteTokenSource();
		TokenSource delegate = super.createLexer(stream);
		tokenSource.setDelegate(delegate);
		return tokenSource;
	}
}
