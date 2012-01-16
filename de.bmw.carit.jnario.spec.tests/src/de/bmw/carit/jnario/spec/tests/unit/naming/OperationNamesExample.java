package de.bmw.carit.jnario.spec.tests.unit.naming;

import java.util.List;

public class OperationNamesExample {

	public void simpleOperation(){
	}
	
	public void operationWithSingleArgument(String arg){
	}
	
	public void operationWithMultipleArguments(String arg, Object o, int i){
	}
	
	public void operationWithTypedArguments(List<String> arg, List<? extends String> arg2){
	}
	
	public void operationWithVarArg(String...strings){
	}
	
}
