package org.jnario.jnario.test.util;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.junit.Assert;

public abstract class AbstractContentAssistProcessorTest2 extends AbstractContentAssistProcessorTest {
	
	public class ContentAssistProcessorTestBuilder2 extends ContentAssistProcessorTestBuilder {
		public class ProposalTester {
			
			private ICompletionProposal proposal;
	
			protected ProposalTester(ICompletionProposal proposal) {
				this.proposal = proposal;
			}
			
			public ProposalTester withDisplayString(String displayString) {
				Assert.assertEquals("displayString", displayString, proposal.getDisplayString());
				return this;
			}
			
			public ContentAssistProcessorTestBuilder apply() throws Exception {
				return ContentAssistProcessorTestBuilder2.this.applyProposal(proposal);
			}
			
		}

		public ContentAssistProcessorTestBuilder2(ISetup setupClazz, AbstractXtextTests tests) throws Exception {
			super(setupClazz, tests);
		}
		
		public void assertProposalsContainNot(String expectedText) throws Exception {
			String currentModelToParse = getModel();

			ICompletionProposal[] proposals = computeCompletionProposals(currentModelToParse, getCursorPosition());

			if (proposals == null)
				proposals = new ICompletionProposal[0];
			for(ICompletionProposal proposal: proposals) {
				if (expectedText.equals(toString(proposal))) {
					Assert.fail("Unexpected proposal: " + expectedText + " Found: " + toString(proposals));
				}
			}
		}
		
		@Override
		public ContentAssistProcessorTestBuilder2 append(String model)
				throws Exception {
			return (ContentAssistProcessorTestBuilder2) super.append(model);
		}
	}

	@Override
	protected ContentAssistProcessorTestBuilder2 newBuilder() throws Exception {
		return (ContentAssistProcessorTestBuilder2) super.newBuilder();
	}
	
	@Override
	protected ContentAssistProcessorTestBuilder2 newBuilder(ISetup setup) throws Exception {
		return new ContentAssistProcessorTestBuilder2(setup, this);
	}
	
}
