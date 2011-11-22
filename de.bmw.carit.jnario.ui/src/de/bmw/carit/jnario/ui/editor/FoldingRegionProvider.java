package de.bmw.carit.jnario.ui.editor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xtend2.xtend2.XtendImport;

import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.Step;

public class FoldingRegionProvider extends DefaultFoldingRegionProvider {

	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		if(eObject instanceof Feature){
			Feature feature = (Feature)eObject;
			calculateFolding(feature, foldingRegionAcceptor);
		}else if(eObject instanceof Step){
			Step step = (Step)eObject;
			calculateFolding(step, foldingRegionAcceptor);
		}
	}

	private void calculateFolding(Feature feature, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		int startFeature = getBegin(feature);
		if(startFeature >= 0 && !feature.getImports().isEmpty()){
			EList<XtendImport> imports = feature.getImports();
			XtendImport xtendImport = imports.get(imports.size()-1);
			setFoldingRegion(xtendImport, startFeature, foldingRegionAcceptor);
		}
	}

	private void calculateFolding(Step step, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		int begin = getBegin(step);
		if(begin >= 0 && step.getCode() != null){
			Code code = step.getCode();
			setFoldingRegion(code, begin, foldingRegionAcceptor);
		}
	}

	private int getBegin(EObject object){
		ITextRegion beginRegion = getLocationInFileProvider().getSignificantTextRegion(object);
		if(beginRegion == null){
			return -1;
		}
		return beginRegion.getOffset();
	}

	private void setFoldingRegion(EObject object, int begin, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor){
		ICompositeNode node = NodeModelUtils.getNode(object);
		int offset = node.getOffset() + node.getLength() - begin;
		foldingRegionAcceptor.accept(begin, offset);
	}
}