package demo

import java.util.Stack
import java.util.EmptyStackException

describe Stack{
  
  context "empty"{
    val emptyStack = new Stack<String>
    
    fact emptyStack.size should be 0
    fact emptyStack.pop throws EmptyStackException
    
  }
  
  context "not empty"{
    
    fact "pop removes last element"{
      val stack = new Stack<String>
      stack.add("something")
      stack.pop => "something"
    }
    
  }
}