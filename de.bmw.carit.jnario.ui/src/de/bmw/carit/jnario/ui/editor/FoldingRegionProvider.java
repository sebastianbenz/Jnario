package de.bmw.carit.jnario.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;

public class FoldingRegionProvider extends DefaultFoldingRegionProvider {

	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
//		if(eObject instanceof XtendImport){
//			XtendImport imports = (XtendImport)eObject;
//			
//			// fold imports		
//			if(!imports.ge){
//				ITextRegion beginRegion = getLocationInFileProvider().getFullTextRegion(jnario);
//				if(beginRegion != null){
//					int begin = beginRegion.getOffset() + beginRegion.getLength();
//					Scenario scenario = jnario.getScenarios().get(0);
//					if(scenario != null){
//						ITextRegion endRegion = getLocationInFileProvider().getFullTextRegion(scenario);
//						int end = endRegion.getOffset() - 1;
//						foldingRegionAcceptor.accept(begin, end);
//					}
//				}
//			}
//		}
		
//		if(eObject instanceof File){
//			File file = (File) eObject;
//			ITextRegion beginRegion = getLocationInFileProvider().getSignificantTextRegion(file);
//			if(beginRegion != null){
//				int begin = beginRegion.getLength() - 1;
//				if(!file.getScenarios().isEmpty()){
//				Scenario scenario = file.;
//					if(scenario != null){
//						ICompositeNode node = NodeModelUtils.getNode(scenario);
//						int end = node.getOffset() - 10;
//						foldingRegionAcceptor.accept(begin, end);
//						return;
//					}
//				}
//			}
//		}
		
//		// don't fold examples
//		ITextRegion region = locationInFileProvider.getFullTextRegion(eObject);
//		if (region != null) {
//			ITextRegion significant = locationInFileProvider.getSignificantTextRegion(eObject);
//			if (significant == null)
//				throw new NullPointerException("significant region may not be null");
//			int offset = region.getOffset();
//			foldingRegionAcceptor.accept(offset, region.getLength(), significant);
//		}
//		
//		if(container.getChildren().isEmpty()){
//			return;
//		}
		super.computeObjectFolding(eObject, foldingRegionAcceptor);
	}
	
	@Override
	protected boolean shouldProcessContent(EObject object) {
		return false;
	}
}