package org.jnario.jnario.tests.unit

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.jnario.jnario.test.util.JavaElementFinderStub
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.runner.CreateWith
import org.jnario.ui.quickfix.CreateMissingMethod

import static extension org.jnario.lib.Should.*
import org.jnario.ui.quickfix.CreateJavaMethod
import org.jnario.ui.quickfix.CreateXtendMethod
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations
import org.jnario.ui.quickfix.MethodBuilderProvider

@CreateWith(typeof(SpecTestCreator))
describe CreateMissingMethod{

	@Inject ModelStore m
	JavaElementFinderStub javaElementProvider = new JavaElementFinderStub
	CreateMissingMethod subject
	
	@Inject
	def createSubject(ITypeProvider typeProvider, IXtendJvmAssociations jvmAssociations, MethodBuilderProvider builderProvider){
		subject = new CreateMissingMethod(javaElementProvider, typeProvider, jvmAssociations, builderProvider)
	}

	context hasMissingMethod{
		
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
		
		def hasMissingMethod(CharSequence s){
			parseSpec(s)
			subject.hasMissingMethod(firstFeatureCall)
		}
	}
	
	context receiverIsReadOnly(XMemberFeatureCall){
		
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
	
	context createModification{
		
		fact "creates CreateJavaMethod modification for Java class"{
			'''
			describe "Something"{
				String x
				fact x.unresolved
			}
			'''.createModification => typeof(CreateJavaMethod)
		}
		
		fact "creates CreateXtendMethod modification for Xtend class"{
			m.parseXtend('''
				class Example{
					
				}
			''')
			
			'''
			describe "Something"{
				Example x
				fact x.unresolved
			}
			'''.createModification => typeof(CreateXtendMethod)
		} 
		
		def createModification(CharSequence s){
			parseSpec(s)
			return subject.createModification(firstFeatureCall, "unresolved")
		} 
		
	}
	
	def parseSpec(CharSequence content){
		m.parseSpec(content)
	}
	
	def firstFeatureCall(){
		m.first(typeof(XMemberFeatureCall))
	}	
	
}