package com.lowcoupling.mdpm.lng.plan.serializer;

import com.google.inject.Inject;
import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PlanSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PlanGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActivityGroup___DependsOnKeyword_4_0_ENDLINEParserRuleCall_4_2__q;
	protected AbstractElementAlias match_Activity___DependsOnKeyword_5_2_0_ENDLINEParserRuleCall_5_2_2__a;
	protected AbstractElementAlias match_Activity___ENDLINEParserRuleCall_5_2_2_DependsOnKeyword_5_2_0__a;
	protected AbstractElementAlias match_Activity___InvolvesKeyword_4_0_OPENCURLYTerminalRuleCall_4_1_CLOSEDCURLYTerminalRuleCall_4_3__q;
	protected AbstractElementAlias match_CheckPoint___DependsOnKeyword_4_2_0_ENDLINEParserRuleCall_4_2_2__a;
	protected AbstractElementAlias match_CheckPoint___ENDLINEParserRuleCall_4_2_2_DependsOnKeyword_4_2_0__a;
	protected AbstractElementAlias match_Project___AssumptionsKeyword_7_0_OPENCURLYTerminalRuleCall_7_1_CLOSEDCURLYTerminalRuleCall_7_3__q;
	protected AbstractElementAlias match_Project___ConstraintsKeyword_8_0_OPENCURLYTerminalRuleCall_8_1_CLOSEDCURLYTerminalRuleCall_8_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PlanGrammarAccess) access;
		match_ActivityGroup___DependsOnKeyword_4_0_ENDLINEParserRuleCall_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActivityGroupAccess().getDependsOnKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()));
		match_Activity___DependsOnKeyword_5_2_0_ENDLINEParserRuleCall_5_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getActivityAccess().getDependsOnKeyword_5_2_0()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_2_2()));
		match_Activity___ENDLINEParserRuleCall_5_2_2_DependsOnKeyword_5_2_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_2_2()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getDependsOnKeyword_5_2_0()));
		match_Activity___InvolvesKeyword_4_0_OPENCURLYTerminalRuleCall_4_1_CLOSEDCURLYTerminalRuleCall_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActivityAccess().getInvolvesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_4_3()));
		match_CheckPoint___DependsOnKeyword_4_2_0_ENDLINEParserRuleCall_4_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCheckPointAccess().getDependsOnKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2_2()));
		match_CheckPoint___ENDLINEParserRuleCall_4_2_2_DependsOnKeyword_4_2_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2_2()), new TokenAlias(false, false, grammarAccess.getCheckPointAccess().getDependsOnKeyword_4_2_0()));
		match_Project___AssumptionsKeyword_7_0_OPENCURLYTerminalRuleCall_7_1_CLOSEDCURLYTerminalRuleCall_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()));
		match_Project___ConstraintsKeyword_8_0_OPENCURLYTerminalRuleCall_8_1_CLOSEDCURLYTerminalRuleCall_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProjectAccess().getConstraintsKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCLOSEDCURLYRule())
			return getCLOSEDCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENDLINERule())
			return getENDLINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPENCURLYRule())
			return getOPENCURLYToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal CLOSEDCURLY :
	 * 	'}'
	 * ;
	 */
	protected String getCLOSEDCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * ENDLINE:
	 * 	";"
	 * ;
	 */
	protected String getENDLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal OPENCURLY :
	 * 	'{'
	 * ;
	 */
	protected String getOPENCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ActivityGroup___DependsOnKeyword_4_0_ENDLINEParserRuleCall_4_2__q.equals(syntax))
				emit_ActivityGroup___DependsOnKeyword_4_0_ENDLINEParserRuleCall_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Activity___DependsOnKeyword_5_2_0_ENDLINEParserRuleCall_5_2_2__a.equals(syntax))
				emit_Activity___DependsOnKeyword_5_2_0_ENDLINEParserRuleCall_5_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Activity___ENDLINEParserRuleCall_5_2_2_DependsOnKeyword_5_2_0__a.equals(syntax))
				emit_Activity___ENDLINEParserRuleCall_5_2_2_DependsOnKeyword_5_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Activity___InvolvesKeyword_4_0_OPENCURLYTerminalRuleCall_4_1_CLOSEDCURLYTerminalRuleCall_4_3__q.equals(syntax))
				emit_Activity___InvolvesKeyword_4_0_OPENCURLYTerminalRuleCall_4_1_CLOSEDCURLYTerminalRuleCall_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CheckPoint___DependsOnKeyword_4_2_0_ENDLINEParserRuleCall_4_2_2__a.equals(syntax))
				emit_CheckPoint___DependsOnKeyword_4_2_0_ENDLINEParserRuleCall_4_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CheckPoint___ENDLINEParserRuleCall_4_2_2_DependsOnKeyword_4_2_0__a.equals(syntax))
				emit_CheckPoint___ENDLINEParserRuleCall_4_2_2_DependsOnKeyword_4_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Project___AssumptionsKeyword_7_0_OPENCURLYTerminalRuleCall_7_1_CLOSEDCURLYTerminalRuleCall_7_3__q.equals(syntax))
				emit_Project___AssumptionsKeyword_7_0_OPENCURLYTerminalRuleCall_7_1_CLOSEDCURLYTerminalRuleCall_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Project___ConstraintsKeyword_8_0_OPENCURLYTerminalRuleCall_8_1_CLOSEDCURLYTerminalRuleCall_8_3__q.equals(syntax))
				emit_Project___ConstraintsKeyword_8_0_OPENCURLYTerminalRuleCall_8_1_CLOSEDCURLYTerminalRuleCall_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('dependsOn' ENDLINE)?
	 */
	protected void emit_ActivityGroup___DependsOnKeyword_4_0_ENDLINEParserRuleCall_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('dependsOn' ENDLINE)*
	 */
	protected void emit_Activity___DependsOnKeyword_5_2_0_ENDLINEParserRuleCall_5_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ENDLINE 'dependsOn')*
	 */
	protected void emit_Activity___ENDLINEParserRuleCall_5_2_2_DependsOnKeyword_5_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('involves' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_Activity___InvolvesKeyword_4_0_OPENCURLYTerminalRuleCall_4_1_CLOSEDCURLYTerminalRuleCall_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('dependsOn' ENDLINE)*
	 */
	protected void emit_CheckPoint___DependsOnKeyword_4_2_0_ENDLINEParserRuleCall_4_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ENDLINE 'dependsOn')*
	 */
	protected void emit_CheckPoint___ENDLINEParserRuleCall_4_2_2_DependsOnKeyword_4_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('assumptions' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_Project___AssumptionsKeyword_7_0_OPENCURLYTerminalRuleCall_7_1_CLOSEDCURLYTerminalRuleCall_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('constraints' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_Project___ConstraintsKeyword_8_0_OPENCURLYTerminalRuleCall_8_1_CLOSEDCURLYTerminalRuleCall_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
