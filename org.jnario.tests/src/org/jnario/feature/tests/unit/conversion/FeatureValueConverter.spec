package org.jnario.feature.tests.unit.conversion

import org.jnario.feature.conversion.FeatureValueConverter

describe FeatureValueConverter{
	FeatureValueConverter subject = FeatureValueConverter::create("Prefix:")
	
	context toValue{
		fact subject.toValue("Prefix: text\n", null) => "text"
		fact subject.toValue(null, null) => null
		fact subject.toValue("xxx", null) => "xxx"
	}
	
	context toString{
		fact subject.toString("text") => "Prefix:text\n"
		fact subject.toString(null) => null
	}
	

} 