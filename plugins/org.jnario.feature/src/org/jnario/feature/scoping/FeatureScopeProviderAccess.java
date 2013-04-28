package org.jnario.feature.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.linking.lazy.LazyURIEncoder;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.internal.AbstractTypeComputationState;
import org.eclipse.xtext.xbase.typesystem.internal.AppliedFeatureLinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.internal.NullFeatureLinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.internal.ScopeProviderAccess;
import org.jnario.util.SourceAdapter;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class FeatureScopeProviderAccess extends ScopeProviderAccess {
	
	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private LazyURIEncoder encoder;
	
	@NonNullByDefault
	@Nullable
	protected IFeatureLinkingCandidate getKnownFeature(XAbstractFeatureCall featureCall, AbstractTypeComputationState state, ResolvedTypes resolvedTypes) {
		IFeatureLinkingCandidate result = super.getKnownFeature(featureCall, state, resolvedTypes);
		if(result instanceof NullFeatureLinkingCandidate){
			EObject source = SourceAdapter.find(featureCall);
			if(source == null){
				return result;
			}
			return super.getKnownFeature((XAbstractFeatureCall) source, state, resolvedTypes);
		}
		return result;
	}

	@NonNullByDefault
	public Iterable<IEObjectDescription> getCandidateDescriptions(XExpression expression, EReference reference, @Nullable EObject toBeLinked,
			IFeatureScopeSession session, IResolvedTypes types) throws IllegalNodeException {
		if (toBeLinked == null) {
			return Collections.emptyList();
		}
		if (!toBeLinked.eIsProxy()) {
			throw new IllegalStateException(expression + " was already linked to " + toBeLinked);
		}
		URI uri = EcoreUtil.getURI(toBeLinked);
		String fragment = uri.fragment();
		if (encoder.isCrossLinkFragment(expression.eResource(), fragment)) {
			List<String> split = Strings.split(fragment, LazyURIEncoder.SEP);
			INode compositeNode = NodeModelUtils.getNode(expression);
			if (compositeNode == null){
				EObject source = SourceAdapter.find(expression);
				if(source == null){
					throw new IllegalStateException("Couldn't resolve lazy link, because no node model is attached.");
				}
				compositeNode = NodeModelUtils.getNode(source);
			}
			INode node = encoder.getNode(compositeNode, split.get(3));
			final EClass requiredType = reference.getEReferenceType();
			if (requiredType == null)
				return Collections.emptyList();

			final String crossRefString = linkingHelper.getCrossRefNodeAsString(node, true);
			if (crossRefString != null && !crossRefString.equals("")) {
				final IScope scope = session.getScope(expression, reference, types);
				QualifiedName qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString);
				Iterable<IEObjectDescription> descriptions = scope.getElements(qualifiedLinkName);
				if (Iterables.isEmpty(descriptions)) {
					return Collections.<IEObjectDescription>singletonList(new ErrorDescription(node, qualifiedLinkName));
				}
				return descriptions;
			}
			return Collections.emptyList();
		} else {
			throw new IllegalStateException(expression + " uses unsupported uri fragment " + uri);
		}
	}
}
