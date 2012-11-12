package org.jnario.jnario.ui.tests.unit.quickfix

import com.google.inject.Inject
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecUiTestCreator
import org.jnario.runner.CreateWith
import org.jnario.spec.SpecStandaloneSetup
import org.jnario.ui.quickfix.CreateJavaMethod
import org.jnario.ui.quickfix.CreateXtendMethod
import org.jnario.ui.quickfix.FeatureCallTargetTypeProvider
import org.jnario.ui.quickfix.NewMethodModificationProvider

@CreateWith(typeof(SpecUiTestCreator))
describe NewMethodModificationProvider{
		
	@Inject extension ModelStore
	@Inject extension FeatureCallTargetTypeProvider
	
	before {
		SpecStandaloneSetup::doSetup
	}
	
	fact "creates CreateJavaMethod modification for Java class"{
		'''
		class Something{
			String x
			def method(){
				fact x.unresolved
			}
		}
		'''.createModification => typeof(CreateJavaMethod)
	}
	
	fact "creates CreateXtendMethod modification for Xtend class"{
		parseXtend('''
			class Example{
				
			}
		''')
		
		'''
		class Something{
			Example example
			def method(){
				 example.unresolved
			}
		}
		'''.createModification => typeof(CreateXtendMethod)
	} 

	def createModification(CharSequence s){
		parseXtend(s)
		subject.createModification(firstFeatureCall, "unresolved")
	} 

	def firstFeatureCall(){
		first(typeof(XMemberFeatureCall))
	}		
}