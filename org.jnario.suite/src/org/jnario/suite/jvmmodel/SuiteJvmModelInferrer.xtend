package org.jnario.suite.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.jvmmodel.JunitAnnotationProvider
import org.jnario.runner.Contains
import org.jnario.runner.Named
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.SuiteFile

class SuiteJvmModelInferrer extends JnarioJvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension SuiteClassNameProvider
	@Inject extension JunitAnnotationProvider annotationProvider
	@Inject extension SpecificationResolver
	@Inject extension TypeReferences types
	
	override infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if(!checkClassPath(e, annotationProvider)){
			return
		}
		if (!(e instanceof SuiteFile)){
			return
		}
		val suiteFile = e as SuiteFile
		
		suiteFile.xtendClasses.filter(typeof(Suite)).forEach[
			infer(it, acceptor, preIndexingPhase)
		]
	}

   	def void infer(Suite suite, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(suite.toClass(suite.qualifiedClassName))
   			.initializeLater([
   				it.annotations += suite.exampleGroupRunnerAnnotation
				it.annotations += suite.toAnnotation(typeof(Named), suite.describe)
				if(!suite.children.empty){
					it.annotations += suite.toAnnotation(typeof(Contains), suite.children.toSet);
				}
   				suite.initialize(it)
   			])
   	}

   	def Iterable<JvmType> children(Suite suite){
   		val specs = suite.resolveSpecs
   		specs.map[
   			types.getTypeForName(it.qualifiedClassName, suite)?.type
   		]
   	}
}

