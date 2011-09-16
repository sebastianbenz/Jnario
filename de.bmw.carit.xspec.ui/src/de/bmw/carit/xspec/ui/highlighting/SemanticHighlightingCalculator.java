package de.bmw.carit.xspec.ui.highlighting;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.bmw.carit.xspec.xspec.Step;
import de.bmw.carit.xspec.xspec.XspecPackage;
import de.bmw.carit.xspec.xspec.util.XspecSwitch;

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	private static final Pattern PLACEHOLDER = Pattern.compile("<[^<\\r\\n]*>");

	private class Implementation extends XspecSwitch<Boolean> {

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseStep(Step object) {
			String desc = object.getDesc();
			highlightFirstWord(object, desc);
			return Boolean.TRUE;
		}


		private void highlightFirstWord(Step object, String desc) {
			int begin = 0;
			for (; isWhiteSpace(desc, begin); begin++) {
			}
			int end = desc.indexOf(' ', begin);
			if (end > 0) {
				highlight(desc.substring(begin, end), object);
			}
		}

		private boolean isWhiteSpace(String desc, int begin) {
			return desc.charAt(begin) == ' ' || desc.charAt(begin) == '\t';
		}

		private void highlight(String string, Step object) {
			acceptor.addPosition(offset(object), string.length(),
					HighlightingConfiguration.KEYWORD_ID);
		}

		private int offset(Step content) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content,
					XspecPackage.Literals.STEP__DESC);
			return nodes.iterator().next().getOffset();
		}
	}

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (noNodeModel(resource)) {
			return;
		}

		Implementation highlighter = new Implementation(acceptor);
		Iterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			highlighter.doSwitch((EObject) contents.next());
		}
	}

	protected EObject root(XtextResource resource) {
		return resource.getParseResult().getRootASTElement();
	}

	protected boolean noNodeModel(XtextResource resource) {
		return resource == null || resource.getParseResult() == null
				|| root(resource) == null;
	}

}
