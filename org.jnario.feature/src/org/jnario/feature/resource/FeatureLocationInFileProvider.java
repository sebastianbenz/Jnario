package org.jnario.feature.resource;

import static org.jnario.util.Strings.trimWhitespaceAtEnd;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.resource.XtendLocationInFileProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.StepImplementation;

public class FeatureLocationInFileProvider extends XtendLocationInFileProvider {

	protected ITextRegion getTextRegion(EObject obj, boolean isSignificant) {
		if(isSignificant && obj instanceof StepImplementation){
			return getSignificantTextRegionStep((StepImplementation) obj);
		}
		return super.getTextRegion(obj, isSignificant);
	}
	
	private ITextRegion getSignificantTextRegionStep(StepImplementation element) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(element, FeaturePackage.Literals.STEP__NAME);
		if (!nodes.isEmpty()) {
			ITextRegion result = ITextRegion.EMPTY_REGION;
			for (int i=0; i<nodes.size(); i++) {
				INode node = nodes.get(i);
				if (!isHidden(node)) {
					int length = node.getLength();
					if (length != 0){
						if(isLastNode(nodes, i)){
							length = length - trimWhitespaceAtEnd(node.getText());
						}
						result = result.merge(new TextRegion(node.getOffset(), length));
					}
				}
			}
			return result;
		}
		return createRegion(Collections.<INode>emptyList());
	}

	private boolean isLastNode(List<INode> nodes, int i){
		return nodes.size() == i + 1;
	}
	
}
