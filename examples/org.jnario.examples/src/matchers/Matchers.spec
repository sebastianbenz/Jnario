package matchers

describe "Matchers"{
	
	fact "Using Hamcrest"{
		val personOfAgeFour = new Person("Frodo", 4)
		val personOfAgeFive = new Person("Bilbo", 5)
		personOfAgeFour should not be underAge
		personOfAgeFour should be olderThan(personOfAgeFive)
	}
	
	def olderThan(Person p){
		[Person other | other.age > p.age]
	}
	
	def underAge() {
		[Person p | p.age < 18]
	}
	
	def <T> should_be(T obj, Functions$Function1<T, Boolean> func){
		func.apply(obj)
	}

}