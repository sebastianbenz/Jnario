/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.resource

import com.google.inject.Inject
import java.util.Collection
import java.util.List
import java.util.WeakHashMap
import java.util.regex.Pattern
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.core.resource.XtendResourceDescriptionManager
import org.eclipse.xtext.builder.clustering.CurrentDescriptions
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.xtext.resource.IResourceDescriptions
import org.jnario.JnarioPackage
import org.jnario.Specification
import org.jnario.suite.suite.PatternReference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.SuitePackage

import static java.util.Collections.*
import static org.eclipse.emf.ecore.util.EcoreUtil.resolve

class SuiteResourceDescriptionManager extends XtendResourceDescriptionManager {

	static val Logger logger = Logger.getLogger(SuiteResourceDescriptionManager);

	static val FILE_EXTENSIONS = newHashSet("suite", "spec", "feature") 
	
	@Inject extension IQualifiedNameConverter 

	val cachedDeltas = new WeakHashMap<Collection<Delta>,List<QualifiedName>>()

	/*
	 * Every spec change means new potential matches for a regex in a spec PatternReference.  
	 */
	override isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) {
		if(super.isAffected(deltas, candidate, context)){
			return true
		}
		if (candidate.URI.toString.endsWith(".suite")) {
			logger.debug("Considering suite: " + candidate.URI)
			if (logger.isTraceEnabled) {
				logger.debug(" Deltas to check: ")
				deltas.forEach[logger.debug("  " + it)]
			}

			val ResourceSet resourceSet = if (context instanceof CurrentDescriptions) {
				(context as CurrentDescriptions).buildData.resourceSet
			} else {
				return false
			}

			var changedSpecs = cachedDeltas.get(deltas)
			if (changedSpecs == null) {
				changedSpecs = deltas.filter[isSpecFile].map[modifiedSpecs(resourceSet)].flatten.toList
				cachedDeltas.put(deltas, changedSpecs)
			} else {
				logger.trace(" using cached deltas")
			}

			if (changedSpecs.empty) {
				logger.debug(" no relevant changes in delta")
				return false
			}

			if (logger.debugEnabled) {
				logger.debug(" Changed specs: ")
				changedSpecs.forEach[logger.debug("  " + toString(it))]
			}

			val suites = candidate.getExportedObjectsByType(SuitePackage.Literals.SUITE)
			val matchers = suites
				.map[resolve(it.EObjectOrProxy as Suite, resourceSet) as Suite]
				.filter[!it.eIsProxy]
				.map [resolvePatternReferences.map[Pattern::compile(pattern)]]
				.flatten
				.toList

			logger.debug(" " + matchers.size + " referenced matchers")
			if (logger.traceEnabled) {
				matchers.forEach[logger.trace("  " + it.pattern)]
			}

			val firstRelevant = changedSpecs.findFirst[specName|matchers.findFirst[it.matcher(toString(specName)).matches] != null]

			if (logger.debugEnabled) {
				if (firstRelevant != null) {
					logger.debug(">>  relevant spec change: " + toString(firstRelevant))
				} else {
					logger.debug("  no relevant spec changes")
				}
				
			}
			return (firstRelevant != null)
		}
		return false
	}

	def dispatch List<PatternReference> resolvePatternReferences(Suite suite) {
		suite.elements.map[resolvePatternReferences].flatten.toList
	}

	def dispatch List<PatternReference> resolvePatternReferences(SpecReference specRef) {
		emptyList
	}

	def dispatch List<PatternReference> resolvePatternReferences(PatternReference specRef) {
		if(specRef.pattern.isNullOrEmpty) return emptyList
		singletonList(specRef)
	}

	def isSpecFile(Delta delta) {
		FILE_EXTENSIONS.contains(delta.uri.fileExtension)
	}

	def modifiedSpecs(Delta delta, ResourceSet resourceSet) {
		val old = delta.old
		val _new = delta.^new

		val oldEObjects = if (old == null) emptyList else old.topLevelSpecs(resourceSet)
		val newEObjects = if (_new == null) emptyList else _new.topLevelSpecs(resourceSet)

		val before = oldEObjects.toMap[qualifiedName]
		val after = newEObjects.toMap[qualifiedName]
	
		val deleted = before.keySet.filter[!after.containsKey(it)].toSet 
		val added = after.keySet.filter[!before.containsKey(it)].toSet

		val kept = (before.keySet + after.keySet).filter[!(deleted.contains(it) || added.contains(it))]
		val changed = kept.filter[!equals(before.get(it), after.get(it))]

		deleted + added + changed
	}

	def topLevelSpecs(IResourceDescription resource, ResourceSet resourceSet) {
		resource.getExportedObjectsByType(JnarioPackage.Literals.SPECIFICATION)
		.filter[
			val spec = resolve(it.EObjectOrProxy, resourceSet) as Specification
			spec.declaringType == null
		]
	}

	def equals(IEObjectDescription oldObj, IEObjectDescription newObj) {
		// Adapted from org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta.equals
		//  to only compare name/location
		if (oldObj == newObj)
			return true;
		if (oldObj.getEClass() != newObj.getEClass())
			return false;
		if (oldObj.getName() != null && !oldObj.getName().equals(newObj.getName()))
			return false;
		if (!oldObj.getEObjectURI().equals(newObj.getEObjectURI()))
			return false;
		return true
	}

}