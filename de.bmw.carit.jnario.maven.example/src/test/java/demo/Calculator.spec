package demo

describe Calculator{
	
	it "should add two values"{
		new Calculator().add(1, 2).should.be(3)
	}
	
}