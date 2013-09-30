/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;
import com.lowcoupling.mdpm.lng.pbs.services.PBSGrammarAccess;

public class PBSParser extends AbstractContentAssistParser {
	
	@Inject
	private PBSGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr.internal.InternalPBSParser createParser() {
		com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr.internal.InternalPBSParser result = new com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr.internal.InternalPBSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPartAccess().getAlternatives_3(), "rule__Part__Alternatives_3");
					put(grammarAccess.getProductAccess().getGroup(), "rule__Product__Group__0");
					put(grammarAccess.getPartAccess().getGroup(), "rule__Part__Group__0");
					put(grammarAccess.getPartAccess().getGroup_3_0(), "rule__Part__Group_3_0__0");
					put(grammarAccess.getProductAccess().getDescriptionAssignment_0(), "rule__Product__DescriptionAssignment_0");
					put(grammarAccess.getProductAccess().getNameAssignment_2(), "rule__Product__NameAssignment_2");
					put(grammarAccess.getProductAccess().getPartsAssignment_4(), "rule__Product__PartsAssignment_4");
					put(grammarAccess.getPartAccess().getDescriptionAssignment_0(), "rule__Part__DescriptionAssignment_0");
					put(grammarAccess.getPartAccess().getNameAssignment_2(), "rule__Part__NameAssignment_2");
					put(grammarAccess.getPartAccess().getPartsAssignment_3_0_1(), "rule__Part__PartsAssignment_3_0_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr.internal.InternalPBSParser typedParser = (com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr.internal.InternalPBSParser) parser;
			typedParser.entryRulePBS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public PBSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PBSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
