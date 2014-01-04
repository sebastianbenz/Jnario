package org.jnario.ui.editor

import org.eclipse.xtext.xbase.ui.editor.copyqualifiedname.XbaseCopyQualifiedNameService
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendConstructor

class XtendCopyQualifiedNameService extends XbaseCopyQualifiedNameService {

	def dispatch String getQualifiedName(XtendFunction it, EObject context) {
		toQualifiedName
	}

	def dispatch String getQualifiedName(XtendFunction it, Void context) {
		toQualifiedName
	}

	protected def String toQualifiedName(XtendFunction it) {
		'''´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)'''
	}

	def dispatch String getQualifiedName(XtendConstructor it, EObject context) {
		toQualifiedName
	}

	def dispatch String getQualifiedName(XtendConstructor it, Void context) {
		toQualifiedName
	}

	protected def String toQualifiedName(XtendConstructor it) {
		'''´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)'''
	}

}