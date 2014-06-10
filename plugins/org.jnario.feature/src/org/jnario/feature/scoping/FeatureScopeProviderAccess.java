package org.jnario.feature.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.linking.lazy.LazyURIEncoder;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.computation.IFeatureLinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.internal.AbstractTypeComputationState;
import org.eclipse.xtext.xbase.typesystem.internal.NullFeatureLinkingCandidate;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.internal.ScopeProviderAccess;
import org.jnario.util.SourceAdapter;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class FeatureScopeProviderAccess extends ScopeProviderAccess {
	
	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private LazyURIEncoder encoder;
	
	@NonNullByDefault
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

	public Iterable<IEObjectDescription> getCandidateDescriptions(XExpression expression, EReference reference, EObject toBeLinked,
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
			INode node;
			try{
				node = encoder.getNode(expression, fragment);
			}catch(IllegalStateException e){
				EObject source = SourceAdapter.find(expression);
				node = encoder.getNode(source, fragment);
			}
			final EClass requiredType = reference.getEReferenceType();
			if (requiredType == null)
				return Collections.emptyList();

			final String crossRefString = linkingHelper.getCrossRefNodeAsString(node, true);
			if (crossRefString != null && !crossRefString.equals("")) {
				final IScope scope = session.getScope(expression, reference, types);
				QualifiedName qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString);
				Iterable<IEObjectDescription> descriptions = scope.getElements(qualifiedLinkName);
				if (Iterables.isEmpty(descriptions)) {
					INode errorNode = getErrorNode(expression, node);
					if (errorNode != node) {
						qualifiedLinkName = getErrorName(errorNode);
					}
					return Collections.<IEObjectDescription>singletonList(new ErrorDescription(getErrorNode(expression, node), qualifiedLinkName));
				}
				return descriptions;
			}
			return Collections.emptyList();
		} else {
			throw new IllegalStateException(expression + " uses unsupported uri fragment " + uri);
		}
		
		
	}
	
	/**
	 * Returns the node that best describes the error, e.g. if there is an expression
	 * <code>com::foo::DoesNotExist::method()</code> the error will be rooted at <code>com</code>, but
	 * the real problem is <code>com::foo::DoesNotExist</code>.
	 */
	private INode getErrorNode(XExpression expression, INode node) {
		if (expression instanceof XFeatureCall) {
			XFeatureCall featureCall = (XFeatureCall) expression;
			if (!canBeTypeLiteral(featureCall)) {
				return node;
			}
			if (featureCall.eContainingFeature() == XbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET) {
				XMemberFeatureCall container = (XMemberFeatureCall) featureCall.eContainer();
				if (canBeTypeLiteral(container)) {
					boolean explicitStatic = container.isExplicitStatic();
					XMemberFeatureCall outerMost = getLongestTypeLiteralCandidate(container, explicitStatic);
					if (outerMost != null)
						return NodeModelUtils.getNode(outerMost);
				}
			}
		}
		return node;
	}
	
	private XMemberFeatureCall getLongestTypeLiteralCandidate(XMemberFeatureCall current, boolean mustBeStatic) {
		if (current.eContainingFeature() == XbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET) {
			XMemberFeatureCall container = (XMemberFeatureCall) current.eContainer();
			if (canBeTypeLiteral(container)) {
				if (!mustBeStatic && !container.isExplicitStatic()) {
					return null;
				}
				if (mustBeStatic != container.isExplicitStatic()) {
					return current;
				}
				if (mustBeStatic && container.eContainingFeature() != XbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET) {
					return current;
				}
				return getLongestTypeLiteralCandidate(container, mustBeStatic);
			}
		}
		if (mustBeStatic) {
			return null;
		}
		if (!mustBeStatic && !current.isExplicitStatic()) {
			return null;
		}
		return current;
	}
	
	private boolean canBeTypeLiteral(XAbstractFeatureCall featureCall) {
		return !featureCall.isExplicitOperationCallOrBuilderSyntax() && featureCall.getTypeArguments().isEmpty();
	}
	
	private QualifiedName getErrorName(INode errorNode) {
		List<String> segments = Lists.newArrayListWithCapacity(4);
		for(ILeafNode leaf: errorNode.getLeafNodes()) {
			if (!leaf.isHidden()) {
				String text = leaf.getText();
				// XParenthesizedExpression
				if (text.equals("(") || text.equals(")")) {
					continue;
				}
				if (!text.equals(".") && !text.equals("::")) {
					if (text.charAt(0) == '^')
						segments.add(text.substring(1));
					else
						segments.add(text);
				}
			}
		}
		return QualifiedName.create(segments);
	}
}
