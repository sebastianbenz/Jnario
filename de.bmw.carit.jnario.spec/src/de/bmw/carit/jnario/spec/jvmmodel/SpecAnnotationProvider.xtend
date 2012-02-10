package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.spec.spec.Example
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.junit.Ignore
import org.junit.Test
import de.bmw.carit.jnario.spec.spec.Before
import org.junit.BeforeClass
import de.bmw.carit.jnario.spec.spec.After
import org.junit.AfterClass
import de.bmw.carit.jnario.runner.ExampleGroupRunner
import org.junit.runner.RunWith
/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecAnnotationProvider {
	
	@Inject extension ExtendedJvmTypesBuilder
	
	def getRunnerAnnotation(){
		return typeof(RunWith) -> typeof(ExampleGroupRunner)
	}
	
	def getTestAnnotations(Example element){
		val annotations = <JvmAnnotationReference>newArrayList()
		if(element.exception == null){
			annotations += element.toAnnotation(typeof(Test))
		}else{
			annotations += element.toAnnotation(typeof(Test).name, "expected", element.exception)
		}
		if(element.isPending()){
			annotations += element.toAnnotation(typeof(Ignore))
		}
		return annotations
	}
	
	def Class<?> getBeforeAnnotation(Before element){
		if(element.beforeAll) {
			return typeof(BeforeClass)
		} else{
			return getBeforeAnnotation
		}
	}
	
	def Class<?> getBeforeAnnotation(){
		return typeof(org.junit.Before)
	}
	
	def Class<?> getAfterAnnotation(After element){
		if(element.afterAll) {
			return typeof(AfterClass)
		} else{
			return typeof(org.junit.After)
		}
	}
	
}