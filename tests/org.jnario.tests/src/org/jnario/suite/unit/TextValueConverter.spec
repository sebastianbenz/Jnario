/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import org.jnario.suite.conversion.TextValueConverter
import org.jnario.suite.conversion.SuiteValueConverterService

describe TextValueConverter {
	
	val subject = new SuiteValueConverterService().textValueConverter
	
	context toString{
		fact "adds colon"{
			subject.toString("suite - with dash") => ":suite \\- with dash"
		}
		fact "escapes dashes"{
			subject.toString("suite - with dash") => ":suite \\- with dash"
		}
		fact "escapes hashs"{
			subject.toString("suite # with hash") => ":suite \\# with hash"
		}
	}
	
	context toValue{
		fact "removes colon"{
			subject.toValue(":suite", null) => "suite"
		}
		fact "removes whitespace after colon"{
			subject.toValue(": suite", null) => "suite"
		}
		fact "removes escape character for dashes"{
			subject.toValue(":suite \\- with dash", null) => "suite - with dash"
		}
		fact "removes escape character for  hashs"{
			subject.toValue(":suite \\# with hash", null) => "suite # with hash"
		}
	}

}