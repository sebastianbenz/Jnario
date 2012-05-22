package calculator

describe "Additions"{

  def examples{
  		|  a  |  b  |  sum  |
  		|  1  |  2  |   3   |
  		|  4  |  5  |   9   |
  		| 10  | 11  |  20   | 
  		| 21  | 21  |  42   | 
  }
  fact examples.forEach[a + b => sum]
  
  fact "examples"{
  	val name = "Sebastian"
  	sayHello(name) => "Hello Sebastian"
  }
  
  def sayHello(String name){
  	return "Hello " + name.toUpperCase
  }
  
}