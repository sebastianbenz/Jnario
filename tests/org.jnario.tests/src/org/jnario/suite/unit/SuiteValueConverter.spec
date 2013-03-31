/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.conversion.SuiteValueConverter
import org.jnario.suite.conversion.SuiteValueConverterService

describe SuiteValueConverter {

	val subject = new SuiteValueConverterService().suiteValueConverter
	
	context toString{
		fact "escapes dashes"{
			subject.toString("##suite - with dash") => "##suite \\- with dash"
		}
		fact "escapes hashs"{
			subject.toString("##suite # with hash") => "##suite \\# with hash"
		}
	}
	
	context toValue{
		fact "removes escape character for dashes"{
			subject.toValue("##suite \\- with dash", null) => "##suite - with dash"
		}
		fact "removes escape character for  hashs"{
			subject.toValue("##suite \\# with hash", null) => "##suite # with hash"
		}
	}

}