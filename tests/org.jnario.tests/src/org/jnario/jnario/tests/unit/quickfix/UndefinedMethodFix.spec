package org.jnario.jnario.tests.unit.quickfix

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.jnario.jnario.test.util.JavaElementFinderStub
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.ui.quickfix.CallsReadOnlyType
import org.jnario.ui.quickfix.FeatureCallTargetTypeProvider
import org.jnario.ui.quickfix.IsUndefinedMethod
import org.jnario.ui.quickfix.UndefinedMethodFix

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe UndefinedMethodFix{

	@Inject extension ModelStore m
	@Inject FeatureCallTargetTypeProvider targetTypeProvider
	
	describe IsUndefinedMethod{
		
		fact "false if method can be resolved"{
			'''
			describe "Something"{
				String x
				fact x.toString
			}
			'''.hasMissingMethod => false
		}
		
		fact "false if method receiver cannot be resolved"{
			'''
			describe "Something"{
				fact x.toString
			}
			'''.hasMissingMethod => false
		}
		
		fact "false if method receiver has unknown type"{
			'''
			describe "Something"{
				Unknown x
				fact x.unresolved
			}
			'''.hasMissingMethod => false
		}
		
		fact "false if method receiver is literal"{
			'''
			describe "Something"{
				fact 9.toString
			}
			'''.hasMissingMethod => false
		}
		
		fact "true if method cannot be resolved"{
			'''
			describe "Something"{
				String x
				fact x.unresolved
			}
			'''.hasMissingMethod => true
		}
		
		fact "true if method exists with different parameter count"{
			'''
			describe "Something"{
				String x
				fact x.toString("hello")
			}
			'''.hasMissingMethod => true
		}
		
		fact "true if method exists with different parameter types"{
			'''
			describe "Something"{
				String x
				fact x.concat(4)
			}
			'''.hasMissingMethod => true
		}
		
		def hasMissingMethod(CharSequence s){
			parseSpec(s)
			subject.callsUndefinedMethod(firstFeatureCall)
		}
	}
	
	describe CallsReadOnlyType{
		
		JavaElementFinderStub javaElementProvider = new JavaElementFinderStub
		
		before subject = new CallsReadOnlyType(javaElementProvider, targetTypeProvider)
		
		fact "true if java element is read-only"{
			javaElementProvider.setReadOnly
			'''
			describe "Something"{
				String x
				fact x.unresolved
			}
			'''.receiverIsReadOnly => true
		}
		
		fact "false if java element is changeable"{
			'''
			describe "Something"{
				SomethingSpec x
				fact x.unresolved
			}
			'''.receiverIsReadOnly => false
		}
		 
		def receiverIsReadOnly(CharSequence s){
			parseSpec(s)
			return subject.receiverIsReadOnly(firstFeatureCall)
		} 
	}
	
	def parseSpec(CharSequence content){
		m.parseSpec(content)
	}
	
	def firstFeatureCall(){
		first(typeof(XMemberFeatureCall))
	}	
}

