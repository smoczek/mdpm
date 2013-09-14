/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.wbs.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class WBSGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class WBSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWBSProgramParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWBSProjectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//WBS:
		//	WBSProgram | WBSProject;
		public ParserRule getRule() { return rule; }

		//WBSProgram | WBSProject
		public Alternatives getAlternatives() { return cAlternatives; }

		//WBSProgram
		public RuleCall getWBSProgramParserRuleCall_0() { return cWBSProgramParserRuleCall_0; }

		//WBSProject
		public RuleCall getWBSProjectParserRuleCall_1() { return cWBSProjectParserRuleCall_1; }
	}

	public class WBSProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBSProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cProgramKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cOPENCURLYTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cProjectsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProjectsWBSProjectParserRuleCall_4_0 = (RuleCall)cProjectsAssignment_4.eContents().get(0);
		private final RuleCall cCLOSEDCURLYTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//WBSProgram:
		//	description=ML_COMMENT? "Program " name=ID OPENCURLY projects+=WBSProject* CLOSEDCURLY;
		public ParserRule getRule() { return rule; }

		//description=ML_COMMENT? "Program " name=ID OPENCURLY projects+=WBSProject* CLOSEDCURLY
		public Group getGroup() { return cGroup; }

		//description=ML_COMMENT?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//ML_COMMENT
		public RuleCall getDescriptionML_COMMENTTerminalRuleCall_0_0() { return cDescriptionML_COMMENTTerminalRuleCall_0_0; }

		//"Program "
		public Keyword getProgramKeyword_1() { return cProgramKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//OPENCURLY
		public RuleCall getOPENCURLYTerminalRuleCall_3() { return cOPENCURLYTerminalRuleCall_3; }

		//projects+=WBSProject*
		public Assignment getProjectsAssignment_4() { return cProjectsAssignment_4; }

		//WBSProject
		public RuleCall getProjectsWBSProjectParserRuleCall_4_0() { return cProjectsWBSProjectParserRuleCall_4_0; }

		//CLOSEDCURLY
		public RuleCall getCLOSEDCURLYTerminalRuleCall_5() { return cCLOSEDCURLYTerminalRuleCall_5; }
	}

	public class WBSProjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBSProject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cProjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cOPENCURLYTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cWbsNodesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cWbsNodesWBSNodeParserRuleCall_4_0 = (RuleCall)cWbsNodesAssignment_4.eContents().get(0);
		private final RuleCall cCLOSEDCURLYTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//WBSProject:
		//	description=ML_COMMENT? "Project " name=ID OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY;
		public ParserRule getRule() { return rule; }

		//description=ML_COMMENT? "Project " name=ID OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY
		public Group getGroup() { return cGroup; }

		//description=ML_COMMENT?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//ML_COMMENT
		public RuleCall getDescriptionML_COMMENTTerminalRuleCall_0_0() { return cDescriptionML_COMMENTTerminalRuleCall_0_0; }

		//"Project "
		public Keyword getProjectKeyword_1() { return cProjectKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//OPENCURLY
		public RuleCall getOPENCURLYTerminalRuleCall_3() { return cOPENCURLYTerminalRuleCall_3; }

		//wbsNodes+=WBSNode*
		public Assignment getWbsNodesAssignment_4() { return cWbsNodesAssignment_4; }

		//WBSNode
		public RuleCall getWbsNodesWBSNodeParserRuleCall_4_0() { return cWbsNodesWBSNodeParserRuleCall_4_0; }

		//CLOSEDCURLY
		public RuleCall getCLOSEDCURLYTerminalRuleCall_5() { return cCLOSEDCURLYTerminalRuleCall_5; }
	}

	public class WBSNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBSNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWBSActivityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWBSWorkPackageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cWBSDeliverableParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//WBSNode:
		//	WBSActivity | WBSWorkPackage | WBSDeliverable;
		public ParserRule getRule() { return rule; }

		//WBSActivity | WBSWorkPackage | WBSDeliverable
		public Alternatives getAlternatives() { return cAlternatives; }

		//WBSActivity
		public RuleCall getWBSActivityParserRuleCall_0() { return cWBSActivityParserRuleCall_0; }

		//WBSWorkPackage
		public RuleCall getWBSWorkPackageParserRuleCall_1() { return cWBSWorkPackageParserRuleCall_1; }

		//WBSDeliverable
		public RuleCall getWBSDeliverableParserRuleCall_2() { return cWBSDeliverableParserRuleCall_2; }
	}

	public class WBSActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBSActivity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cActivityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final RuleCall cOPENCURLYTerminalRuleCall_3_0_0 = (RuleCall)cGroup_3_0.eContents().get(0);
		private final Assignment cWbsNodesAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cWbsNodesWBSNodeParserRuleCall_3_0_1_0 = (RuleCall)cWbsNodesAssignment_3_0_1.eContents().get(0);
		private final RuleCall cCLOSEDCURLYTerminalRuleCall_3_0_2 = (RuleCall)cGroup_3_0.eContents().get(2);
		private final RuleCall cENDLINETerminalRuleCall_3_1 = (RuleCall)cAlternatives_3.eContents().get(1);
		
		//WBSActivity:
		//	description=ML_COMMENT? "Activity " name=ID (OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE);
		public ParserRule getRule() { return rule; }

		//description=ML_COMMENT? "Activity " name=ID (OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE)
		public Group getGroup() { return cGroup; }

		//description=ML_COMMENT?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//ML_COMMENT
		public RuleCall getDescriptionML_COMMENTTerminalRuleCall_0_0() { return cDescriptionML_COMMENTTerminalRuleCall_0_0; }

		//"Activity "
		public Keyword getActivityKeyword_1() { return cActivityKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY
		public Group getGroup_3_0() { return cGroup_3_0; }

		//OPENCURLY
		public RuleCall getOPENCURLYTerminalRuleCall_3_0_0() { return cOPENCURLYTerminalRuleCall_3_0_0; }

		//wbsNodes+=WBSNode*
		public Assignment getWbsNodesAssignment_3_0_1() { return cWbsNodesAssignment_3_0_1; }

		//WBSNode
		public RuleCall getWbsNodesWBSNodeParserRuleCall_3_0_1_0() { return cWbsNodesWBSNodeParserRuleCall_3_0_1_0; }

		//CLOSEDCURLY
		public RuleCall getCLOSEDCURLYTerminalRuleCall_3_0_2() { return cCLOSEDCURLYTerminalRuleCall_3_0_2; }

		//ENDLINE
		public RuleCall getENDLINETerminalRuleCall_3_1() { return cENDLINETerminalRuleCall_3_1; }
	}

	public class WBSWorkPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBSWorkPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cWorkPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final RuleCall cOPENCURLYTerminalRuleCall_3_0_0 = (RuleCall)cGroup_3_0.eContents().get(0);
		private final Assignment cWbsNodesAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cWbsNodesWBSNodeParserRuleCall_3_0_1_0 = (RuleCall)cWbsNodesAssignment_3_0_1.eContents().get(0);
		private final RuleCall cCLOSEDCURLYTerminalRuleCall_3_0_2 = (RuleCall)cGroup_3_0.eContents().get(2);
		private final RuleCall cENDLINETerminalRuleCall_3_1 = (RuleCall)cAlternatives_3.eContents().get(1);
		
		//WBSWorkPackage:
		//	description=ML_COMMENT? "WorkPackage " name=ID (OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE);
		public ParserRule getRule() { return rule; }

		//description=ML_COMMENT? "WorkPackage " name=ID (OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE)
		public Group getGroup() { return cGroup; }

		//description=ML_COMMENT?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//ML_COMMENT
		public RuleCall getDescriptionML_COMMENTTerminalRuleCall_0_0() { return cDescriptionML_COMMENTTerminalRuleCall_0_0; }

		//"WorkPackage "
		public Keyword getWorkPackageKeyword_1() { return cWorkPackageKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY
		public Group getGroup_3_0() { return cGroup_3_0; }

		//OPENCURLY
		public RuleCall getOPENCURLYTerminalRuleCall_3_0_0() { return cOPENCURLYTerminalRuleCall_3_0_0; }

		//wbsNodes+=WBSNode*
		public Assignment getWbsNodesAssignment_3_0_1() { return cWbsNodesAssignment_3_0_1; }

		//WBSNode
		public RuleCall getWbsNodesWBSNodeParserRuleCall_3_0_1_0() { return cWbsNodesWBSNodeParserRuleCall_3_0_1_0; }

		//CLOSEDCURLY
		public RuleCall getCLOSEDCURLYTerminalRuleCall_3_0_2() { return cCLOSEDCURLYTerminalRuleCall_3_0_2; }

		//ENDLINE
		public RuleCall getENDLINETerminalRuleCall_3_1() { return cENDLINETerminalRuleCall_3_1; }
	}

	public class WBSDeliverableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WBSDeliverable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDescriptionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDescriptionML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDescriptionAssignment_0.eContents().get(0);
		private final Keyword cDeliverableKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final RuleCall cOPENCURLYTerminalRuleCall_3_0_0 = (RuleCall)cGroup_3_0.eContents().get(0);
		private final Assignment cWbsNodesAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cWbsNodesWBSNodeParserRuleCall_3_0_1_0 = (RuleCall)cWbsNodesAssignment_3_0_1.eContents().get(0);
		private final RuleCall cCLOSEDCURLYTerminalRuleCall_3_0_2 = (RuleCall)cGroup_3_0.eContents().get(2);
		private final RuleCall cENDLINETerminalRuleCall_3_1 = (RuleCall)cAlternatives_3.eContents().get(1);
		
		//WBSDeliverable:
		//	description=ML_COMMENT? "Deliverable " name=ID (OPENCURLY //(workpackages+=WorkPackage*)
		//	wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE);
		public ParserRule getRule() { return rule; }

		//description=ML_COMMENT? "Deliverable " name=ID (OPENCURLY //(workpackages+=WorkPackage*)
		//wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE)
		public Group getGroup() { return cGroup; }

		//description=ML_COMMENT?
		public Assignment getDescriptionAssignment_0() { return cDescriptionAssignment_0; }

		//ML_COMMENT
		public RuleCall getDescriptionML_COMMENTTerminalRuleCall_0_0() { return cDescriptionML_COMMENTTerminalRuleCall_0_0; }

		//"Deliverable "
		public Keyword getDeliverableKeyword_1() { return cDeliverableKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//OPENCURLY //(workpackages+=WorkPackage*)
		//wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//OPENCURLY //(workpackages+=WorkPackage*)
		//wbsNodes+=WBSNode* CLOSEDCURLY
		public Group getGroup_3_0() { return cGroup_3_0; }

		//OPENCURLY
		public RuleCall getOPENCURLYTerminalRuleCall_3_0_0() { return cOPENCURLYTerminalRuleCall_3_0_0; }

		//wbsNodes+=WBSNode*
		public Assignment getWbsNodesAssignment_3_0_1() { return cWbsNodesAssignment_3_0_1; }

		//WBSNode
		public RuleCall getWbsNodesWBSNodeParserRuleCall_3_0_1_0() { return cWbsNodesWBSNodeParserRuleCall_3_0_1_0; }

		//CLOSEDCURLY
		public RuleCall getCLOSEDCURLYTerminalRuleCall_3_0_2() { return cCLOSEDCURLYTerminalRuleCall_3_0_2; }

		//ENDLINE
		public RuleCall getENDLINETerminalRuleCall_3_1() { return cENDLINETerminalRuleCall_3_1; }
	}
	
	
	private WBSElements pWBS;
	private WBSProgramElements pWBSProgram;
	private WBSProjectElements pWBSProject;
	private WBSNodeElements pWBSNode;
	private WBSActivityElements pWBSActivity;
	private WBSWorkPackageElements pWBSWorkPackage;
	private WBSDeliverableElements pWBSDeliverable;
	private TerminalRule tENDLINE;
	private TerminalRule tOPENCURLY;
	private TerminalRule tCLOSEDCURLY;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public WBSGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.lowcoupling.mdpm.lng.wbs.WBS".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//WBS:
	//	WBSProgram | WBSProject;
	public WBSElements getWBSAccess() {
		return (pWBS != null) ? pWBS : (pWBS = new WBSElements());
	}
	
	public ParserRule getWBSRule() {
		return getWBSAccess().getRule();
	}

	//WBSProgram:
	//	description=ML_COMMENT? "Program " name=ID OPENCURLY projects+=WBSProject* CLOSEDCURLY;
	public WBSProgramElements getWBSProgramAccess() {
		return (pWBSProgram != null) ? pWBSProgram : (pWBSProgram = new WBSProgramElements());
	}
	
	public ParserRule getWBSProgramRule() {
		return getWBSProgramAccess().getRule();
	}

	//WBSProject:
	//	description=ML_COMMENT? "Project " name=ID OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY;
	public WBSProjectElements getWBSProjectAccess() {
		return (pWBSProject != null) ? pWBSProject : (pWBSProject = new WBSProjectElements());
	}
	
	public ParserRule getWBSProjectRule() {
		return getWBSProjectAccess().getRule();
	}

	//WBSNode:
	//	WBSActivity | WBSWorkPackage | WBSDeliverable;
	public WBSNodeElements getWBSNodeAccess() {
		return (pWBSNode != null) ? pWBSNode : (pWBSNode = new WBSNodeElements());
	}
	
	public ParserRule getWBSNodeRule() {
		return getWBSNodeAccess().getRule();
	}

	//WBSActivity:
	//	description=ML_COMMENT? "Activity " name=ID (OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE);
	public WBSActivityElements getWBSActivityAccess() {
		return (pWBSActivity != null) ? pWBSActivity : (pWBSActivity = new WBSActivityElements());
	}
	
	public ParserRule getWBSActivityRule() {
		return getWBSActivityAccess().getRule();
	}

	//WBSWorkPackage:
	//	description=ML_COMMENT? "WorkPackage " name=ID (OPENCURLY wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE);
	public WBSWorkPackageElements getWBSWorkPackageAccess() {
		return (pWBSWorkPackage != null) ? pWBSWorkPackage : (pWBSWorkPackage = new WBSWorkPackageElements());
	}
	
	public ParserRule getWBSWorkPackageRule() {
		return getWBSWorkPackageAccess().getRule();
	}

	//WBSDeliverable:
	//	description=ML_COMMENT? "Deliverable " name=ID (OPENCURLY //(workpackages+=WorkPackage*)
	//	wbsNodes+=WBSNode* CLOSEDCURLY | ENDLINE);
	public WBSDeliverableElements getWBSDeliverableAccess() {
		return (pWBSDeliverable != null) ? pWBSDeliverable : (pWBSDeliverable = new WBSDeliverableElements());
	}
	
	public ParserRule getWBSDeliverableRule() {
		return getWBSDeliverableAccess().getRule();
	}

	//terminal ENDLINE:
	//	";";
	public TerminalRule getENDLINERule() {
		return (tENDLINE != null) ? tENDLINE : (tENDLINE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ENDLINE"));
	} 

	//terminal OPENCURLY:
	//	"{";
	public TerminalRule getOPENCURLYRule() {
		return (tOPENCURLY != null) ? tOPENCURLY : (tOPENCURLY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "OPENCURLY"));
	} 

	//terminal CLOSEDCURLY:
	//	"}";
	public TerminalRule getCLOSEDCURLYRule() {
		return (tCLOSEDCURLY != null) ? tCLOSEDCURLY : (tCLOSEDCURLY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CLOSEDCURLY"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}