package matchers

@Data class Person {
	String name
	int age
	override toString(){
		name + "(" + age + ")"
	}
}