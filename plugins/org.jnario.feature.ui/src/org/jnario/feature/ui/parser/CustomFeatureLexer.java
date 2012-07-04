/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.jnario.feature.parser.FeatureTokenSource;
import org.jnario.feature.ui.contentassist.antlr.internal.InternalFeatureLexer;

import com.google.inject.Inject;

public class CustomFeatureLexer extends InternalFeatureLexer {
	
	private final FeatureTokenSource tokenSource;
	
	private class Delegate implements TokenSource{

		public Token nextToken() {
			return CustomFeatureLexer.super.nextToken();
		}

		public String getSourceName() {
			return CustomFeatureLexer.super.getSourceName();
		}
		
	}
	
	@Inject
	public CustomFeatureLexer(ContentAssistFeatureTokenSource tokenSource){
		this.tokenSource = tokenSource;
		tokenSource.setDelegate(new Delegate());
	}
	
	public Token nextToken(){
		return tokenSource.nextToken();
	}

	public String getSourceName(){
		return tokenSource.getSourceName();
	}
	
	
	
}
