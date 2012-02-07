package de.bmw.carit.jnario.spec.tests.unit.doc

import de.bmw.carit.jnario.spec.doc.WhiteSpaceNormalizer

describe WhiteSpaceNormalizer{
	
	it "should remove trailing whitespace"{
		subject.normalize(null).should.be("")
		subject.normalize("\thello").should.be("hello")
		subject.normalize("\thello\n\tworld").should.be("hello\nworld")
		subject.normalize("\t\thello\n\t\tworld").should.be("hello\nworld")
		subject.normalize("\t\thello\n\tworld").should.be("hello\n\tworld")
	}
	
}