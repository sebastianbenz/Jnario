package org.jnario.feature.ui.autoedit;

import java.util.Set;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextUtilities;

import com.google.common.collect.Sets;


public class FeatureIndentLineAutoEditStrategy extends DefaultIndentLineAutoEditStrategy {

	private static final Set<String> KEYWORDS_WITH_AUTOINDENT = Sets.newHashSet("Feature: ", "Scenario: ", "Background: ");
	
	private void autoIndentAfterNewLine(IDocument d, DocumentCommand c) {
		if (c.offset == -1 || d.getLength() == 0)
			return;

		try {
			// find start of line
			int p= (c.offset == d.getLength() ? c.offset  - 1 : c.offset);
			IRegion info= d.getLineInformationOfOffset(p);
			
			int start= info.getOffset();

			// find white spaces
			int end= findEndOfWhiteSpace(d, start, c.offset);

			StringBuffer buf= new StringBuffer(c.text);
			if (end > start) {
				// append to input
				buf.append(d.get(start, end - start));
			}
			String line = d.get(info.getOffset(), info.getLength()).trim();
			for (String prefix : KEYWORDS_WITH_AUTOINDENT) {
				if(line.startsWith(prefix)){
					buf.append("\t");
					break;
				}
			}
			
			c.text= buf.toString();

		} catch (BadLocationException excp) {
			// stop work
		}
	}

	/*
	 * @see org.eclipse.jface.text.IAutoEditStrategy#customizeDocumentCommand(org.eclipse.jface.text.IDocument, org.eclipse.jface.text.DocumentCommand)
	 */
	public void customizeDocumentCommand(IDocument d, DocumentCommand c) {
		if (c.length == 0 && c.text != null && TextUtilities.endsWith(d.getLegalLineDelimiters(), c.text) != -1)
			autoIndentAfterNewLine(d, c);
	}
	
}
