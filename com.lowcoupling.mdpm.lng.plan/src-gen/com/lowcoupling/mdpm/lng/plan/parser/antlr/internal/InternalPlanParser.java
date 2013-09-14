package com.lowcoupling.mdpm.lng.plan.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'dependsOn'", "'wbs'", "'resources'", "'plan'", "'.'", "';'", "'CheckPoint'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_CLOSEDCURLY=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=6;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPlanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlanParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g"; }



     	private PlanGrammarAccess grammarAccess;
     	
        public InternalPlanParser(TokenStream input, PlanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected PlanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:70:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:77:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) ) | ( (lv_projects_11_0= ruleProject ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_6=null;
        Token this_CLOSEDCURLY_10=null;
        EObject lv_plans_4_0 = null;

        EObject lv_projects_9_0 = null;

        EObject lv_projects_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:80:28: ( ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) ) | ( (lv_projects_11_0= ruleProject ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) ) | ( (lv_projects_11_0= ruleProject ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) ) | ( (lv_projects_11_0= ruleProject ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==13) ) {
                    alt5=1;
                }
                else if ( (LA5_1==15) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ML_COMMENT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:82:1: (lv_description_0_0= RULE_ML_COMMENT )
                            {
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:82:1: (lv_description_0_0= RULE_ML_COMMENT )
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:83:3: lv_description_0_0= RULE_ML_COMMENT
                            {
                            lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProgram128); 

                            			newLeafNode(lv_description_0_0, grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProgramRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_0_0, 
                                    		"ML_COMMENT");
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:99:3: (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:99:5: otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_9_0= ruleProject ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProgram147); 

                        	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_0_1_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:103:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:104:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:104:1: (lv_name_2_0= RULE_ID )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:105:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram164); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProgram180); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:1: ( ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==23) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:2: ( (lv_plans_4_0= rulePlanImport ) ) ruleENDLINE
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:2: ( (lv_plans_4_0= rulePlanImport ) )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:126:1: (lv_plans_4_0= rulePlanImport )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:126:1: (lv_plans_4_0= rulePlanImport )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:127:3: lv_plans_4_0= rulePlanImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_3_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePlanImport_in_ruleProgram201);
                    	    lv_plans_4_0=rulePlanImport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"plans",
                    	            		lv_plans_4_0, 
                    	            		"PlanImport");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram217);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:151:3: (otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:151:5: otherlv_6= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleProgram231); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getProjectKeyword_0_1_4_0());
                    	        
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:1: ( ( ruleQualifiedName ) )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:157:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProgramRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProgram254);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram270);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:178:3: ( (lv_projects_9_0= ruleProject ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ML_COMMENT||LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:179:1: (lv_projects_9_0= ruleProject )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:179:1: (lv_projects_9_0= ruleProject )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:180:3: lv_projects_9_0= ruleProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProject_in_ruleProgram292);
                    	    lv_projects_9_0=ruleProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_9_0, 
                    	            		"Project");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram304); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_6()); 
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:201:6: ( (lv_projects_11_0= ruleProject ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:201:6: ( (lv_projects_11_0= ruleProject ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:202:1: (lv_projects_11_0= ruleProject )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:202:1: (lv_projects_11_0= ruleProject )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:203:3: lv_projects_11_0= ruleProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProject_in_ruleProgram332);
                    lv_projects_11_0=ruleProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_11_0, 
                            		"Project");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProject"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:227:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:228:2: (iv_ruleProject= ruleProject EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:229:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject368);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:236:1: ruleProject returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_10=null;
        Token this_OPENCURLY_11=null;
        Token this_CLOSEDCURLY_13=null;
        Token otherlv_14=null;
        Token this_OPENCURLY_15=null;
        Token this_CLOSEDCURLY_17=null;
        Token this_CLOSEDCURLY_19=null;
        EObject lv_wbs_4_0 = null;

        EObject lv_resources_6_0 = null;

        EObject lv_plans_8_0 = null;

        EObject lv_assumptions_12_0 = null;

        EObject lv_constraints_16_0 = null;

        EObject lv_activities_18_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:239:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:240:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:240:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:240:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:240:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ML_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:241:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:241:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:242:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProject420); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleProject438); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:262:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:263:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:263:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:264:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject455); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject471); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:284:1: ( ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:284:2: ( (lv_wbs_4_0= ruleWBSImport ) ) ruleENDLINE
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:284:2: ( (lv_wbs_4_0= ruleWBSImport ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:285:1: (lv_wbs_4_0= ruleWBSImport )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:285:1: (lv_wbs_4_0= ruleWBSImport )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:286:3: lv_wbs_4_0= ruleWBSImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWBSImport_in_ruleProject492);
                    lv_wbs_4_0=ruleWBSImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"wbs",
                            		lv_wbs_4_0, 
                            		"WBSImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject508);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:310:3: ( ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:310:4: ( (lv_resources_6_0= ruleResourcesImport ) ) ruleENDLINE
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:310:4: ( (lv_resources_6_0= ruleResourcesImport ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:311:1: (lv_resources_6_0= ruleResourcesImport )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:311:1: (lv_resources_6_0= ruleResourcesImport )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:312:3: lv_resources_6_0= ruleResourcesImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourcesImport_in_ruleProject531);
                    lv_resources_6_0=ruleResourcesImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"resources",
                            		lv_resources_6_0, 
                            		"ResourcesImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject547);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:336:3: ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:336:4: ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:336:4: ( (lv_plans_8_0= rulePlanImport ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:337:1: (lv_plans_8_0= rulePlanImport )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:337:1: (lv_plans_8_0= rulePlanImport )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:338:3: lv_plans_8_0= rulePlanImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlanImport_in_ruleProject570);
            	    lv_plans_8_0=rulePlanImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_8_0, 
            	            		"PlanImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	     
            	            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject586);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:362:3: (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:362:5: otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleProject600); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0());
                        
                    this_OPENCURLY_11=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject611); 
                     
                        newLeafNode(this_OPENCURLY_11, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:370:1: ( (lv_assumptions_12_0= ruleAssumption ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:371:1: (lv_assumptions_12_0= ruleAssumption )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:371:1: (lv_assumptions_12_0= ruleAssumption )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:372:3: lv_assumptions_12_0= ruleAssumption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssumption_in_ruleProject631);
                    	    lv_assumptions_12_0=ruleAssumption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assumptions",
                    	            		lv_assumptions_12_0, 
                    	            		"Assumption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    this_CLOSEDCURLY_13=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject643); 
                     
                        newLeafNode(this_CLOSEDCURLY_13, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:392:3: (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:392:5: otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleProject657); 

                        	newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getConstraintsKeyword_8_0());
                        
                    this_OPENCURLY_15=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject668); 
                     
                        newLeafNode(this_OPENCURLY_15, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:400:1: ( (lv_constraints_16_0= ruleConstraint ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:401:1: (lv_constraints_16_0= ruleConstraint )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:401:1: (lv_constraints_16_0= ruleConstraint )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:402:3: lv_constraints_16_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleProject688);
                    	    lv_constraints_16_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_16_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    this_CLOSEDCURLY_17=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject700); 
                     
                        newLeafNode(this_CLOSEDCURLY_17, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:422:3: ( (lv_activities_18_0= ruleActivityElement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ML_COMMENT||LA14_0==19||LA14_0==26||LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:423:1: (lv_activities_18_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:423:1: (lv_activities_18_0= ruleActivityElement )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:424:3: lv_activities_18_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleProject722);
            	    lv_activities_18_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_18_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_CLOSEDCURLY_19=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject734); 
             
                newLeafNode(this_CLOSEDCURLY_19, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_10()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:452:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:453:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:454:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption769);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption779); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:461:1: ruleAssumption returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:464:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:465:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:465:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:465:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAssumption816); 

                	newLeafNode(otherlv_0, grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:469:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:470:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:470:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:471:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssumption833); 

            			newLeafNode(lv_value_1_0, grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssumptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleAssumption854);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:503:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:504:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:505:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint889);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:512:1: ruleConstraint returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:515:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:516:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:516:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:516:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleConstraint936); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:520:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:521:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:521:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:522:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint953); 

            			newLeafNode(lv_value_1_0, grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleConstraint974);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:554:1: entryRuleActivityGroup returns [EObject current=null] : iv_ruleActivityGroup= ruleActivityGroup EOF ;
    public final EObject entryRuleActivityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityGroup = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:555:2: (iv_ruleActivityGroup= ruleActivityGroup EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:556:2: iv_ruleActivityGroup= ruleActivityGroup EOF
            {
             newCompositeNode(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1009);
            iv_ruleActivityGroup=ruleActivityGroup();

            state._fsp--;

             current =iv_ruleActivityGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup1019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:563:1: ruleActivityGroup returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_7_0= ruleActivityElement ) )* this_CLOSEDCURLY_8= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivityGroup() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token this_CLOSEDCURLY_8=null;
        EObject lv_activities_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:566:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_7_0= ruleActivityElement ) )* this_CLOSEDCURLY_8= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:567:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_7_0= ruleActivityElement ) )* this_CLOSEDCURLY_8= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:567:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_7_0= ruleActivityElement ) )* this_CLOSEDCURLY_8= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:567:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_7_0= ruleActivityElement ) )* this_CLOSEDCURLY_8= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:567:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ML_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:568:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:568:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:569:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1061); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleActivityGroup1079); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityGroupAccess().getGroupKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:589:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:590:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:590:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:591:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityGroup1096); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1112); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:611:1: (otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:611:3: otherlv_4= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleActivityGroup1124); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityGroupAccess().getDependsOnKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:615:1: ( ( ruleQualifiedName ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:616:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:616:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:617:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityGroup1147);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1164);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:638:3: ( (lv_activities_7_0= ruleActivityElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ML_COMMENT||LA18_0==19||LA18_0==26||LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:639:1: (lv_activities_7_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:639:1: (lv_activities_7_0= ruleActivityElement )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:640:3: lv_activities_7_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleActivityGroup1186);
            	    lv_activities_7_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_7_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            this_CLOSEDCURLY_8=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1198); 
             
                newLeafNode(this_CLOSEDCURLY_8, grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRuleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:668:1: entryRuleWBSImport returns [EObject current=null] : iv_ruleWBSImport= ruleWBSImport EOF ;
    public final EObject entryRuleWBSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:669:2: (iv_ruleWBSImport= ruleWBSImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:670:2: iv_ruleWBSImport= ruleWBSImport EOF
            {
             newCompositeNode(grammarAccess.getWBSImportRule()); 
            pushFollow(FOLLOW_ruleWBSImport_in_entryRuleWBSImport1233);
            iv_ruleWBSImport=ruleWBSImport();

            state._fsp--;

             current =iv_ruleWBSImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSImport1243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWBSImport"


    // $ANTLR start "ruleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:677:1: ruleWBSImport returns [EObject current=null] : (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWBSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:680:28: ( (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:681:1: (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:681:1: (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:681:3: otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleWBSImport1280); 

                	newLeafNode(otherlv_0, grammarAccess.getWBSImportAccess().getWbsKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:685:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:686:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:686:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:687:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWBSImport1297); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWBSImport"


    // $ANTLR start "entryRuleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:711:1: entryRuleResourcesImport returns [EObject current=null] : iv_ruleResourcesImport= ruleResourcesImport EOF ;
    public final EObject entryRuleResourcesImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourcesImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:712:2: (iv_ruleResourcesImport= ruleResourcesImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:713:2: iv_ruleResourcesImport= ruleResourcesImport EOF
            {
             newCompositeNode(grammarAccess.getResourcesImportRule()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport1338);
            iv_ruleResourcesImport=ruleResourcesImport();

            state._fsp--;

             current =iv_ruleResourcesImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourcesImport1348); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourcesImport"


    // $ANTLR start "ruleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:720:1: ruleResourcesImport returns [EObject current=null] : (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleResourcesImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:723:28: ( (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:724:1: (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:724:1: (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:724:3: otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleResourcesImport1385); 

                	newLeafNode(otherlv_0, grammarAccess.getResourcesImportAccess().getResourcesKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:728:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:729:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:729:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:730:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourcesImport1402); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourcesImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourcesImport"


    // $ANTLR start "entryRulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:754:1: entryRulePlanImport returns [EObject current=null] : iv_rulePlanImport= rulePlanImport EOF ;
    public final EObject entryRulePlanImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:755:2: (iv_rulePlanImport= rulePlanImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:756:2: iv_rulePlanImport= rulePlanImport EOF
            {
             newCompositeNode(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport1443);
            iv_rulePlanImport=rulePlanImport();

            state._fsp--;

             current =iv_rulePlanImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport1453); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlanImport"


    // $ANTLR start "rulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:763:1: rulePlanImport returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePlanImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:766:28: ( (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:767:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:767:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:767:3: otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePlanImport1490); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanImportAccess().getPlanKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:771:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:772:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:772:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:773:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlanImport1507); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlanImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:797:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:798:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:799:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1549);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1560); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:806:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:809:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:810:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:810:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:810:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1600); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:817:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:818:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifiedName1619); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1634); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:840:1: entryRuleActivityElement returns [EObject current=null] : iv_ruleActivityElement= ruleActivityElement EOF ;
    public final EObject entryRuleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityElement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:841:2: (iv_ruleActivityElement= ruleActivityElement EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:842:2: iv_ruleActivityElement= ruleActivityElement EOF
            {
             newCompositeNode(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement1683);
            iv_ruleActivityElement=ruleActivityElement();

            state._fsp--;

             current =iv_ruleActivityElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement1693); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:849:1: ruleActivityElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) ;
    public final EObject ruleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_CheckPoint_1 = null;

        EObject this_ActivityGroup_2 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:852:28: ( (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:853:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:853:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt20=1;
                    }
                    break;
                case 19:
                    {
                    alt20=3;
                    }
                    break;
                case 26:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                alt20=1;
                }
                break;
            case 26:
                {
                alt20=2;
                }
                break;
            case 19:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:854:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleActivityElement1740);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:864:5: this_CheckPoint_1= ruleCheckPoint
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckPoint_in_ruleActivityElement1767);
                    this_CheckPoint_1=ruleCheckPoint();

                    state._fsp--;

                     
                            current = this_CheckPoint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:874:5: this_ActivityGroup_2= ruleActivityGroup
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActivityGroup_in_ruleActivityElement1794);
                    this_ActivityGroup_2=ruleActivityGroup();

                    state._fsp--;

                     
                            current = this_ActivityGroup_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:890:1: entryRuleENDLINE returns [String current=null] : iv_ruleENDLINE= ruleENDLINE EOF ;
    public final String entryRuleENDLINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENDLINE = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:891:2: (iv_ruleENDLINE= ruleENDLINE EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:892:2: iv_ruleENDLINE= ruleENDLINE EOF
            {
             newCompositeNode(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE1830);
            iv_ruleENDLINE=ruleENDLINE();

            state._fsp--;

             current =iv_ruleENDLINE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE1841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENDLINE"


    // $ANTLR start "ruleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:899:1: ruleENDLINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleENDLINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:902:28: (kw= ';' )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:904:2: kw= ';'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleENDLINE1878); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENDLINE"


    // $ANTLR start "entryRuleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:917:1: entryRuleCheckPoint returns [EObject current=null] : iv_ruleCheckPoint= ruleCheckPoint EOF ;
    public final EObject entryRuleCheckPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckPoint = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:918:2: (iv_ruleCheckPoint= ruleCheckPoint EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:919:2: iv_ruleCheckPoint= ruleCheckPoint EOF
            {
             newCompositeNode(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint1917);
            iv_ruleCheckPoint=ruleCheckPoint();

            state._fsp--;

             current =iv_ruleCheckPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint1927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckPoint"


    // $ANTLR start "ruleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:926:1: ruleCheckPoint returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_20= RULE_CLOSEDCURLY ) ;
    public final EObject ruleCheckPoint() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_5=null;
        Token lv_end_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_offset_11_0=null;
        Token otherlv_13=null;
        Token lv_completeness_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token this_CLOSEDCURLY_20=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:929:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_20= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:930:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:930:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:930:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_20= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:930:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ML_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:931:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:931:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:932:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint1969); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCheckPoint1987); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckPointAccess().getCheckPointKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:952:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:953:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:953:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:954:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckPoint2004); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2020); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:974:1: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:976:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:976:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:977:2: ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:980:2: ( ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:981:3: ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:981:3: ( ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                int LA24_0 = input.LA(1);

                if ( LA24_0 >=27 && LA24_0<=28 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2) ) {
                    alt24=3;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:983:4: ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:983:4: ({...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:984:5: {...}? => ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:984:107: ( ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:985:6: ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:6: ({...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:7: {...}? => ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:16: ( (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==27) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==28) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:17: (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:17: (otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:19: otherlv_5= 'date' ( (lv_end_6_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleCheckPoint2078); 

            	                	newLeafNode(otherlv_5, grammarAccess.getCheckPointAccess().getDateKeyword_4_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:992:1: ( (lv_end_6_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:993:1: (lv_end_6_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:993:1: (lv_end_6_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:994:3: lv_end_6_0= RULE_STRING
            	            {
            	            lv_end_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2095); 

            	            			newLeafNode(lv_end_6_0, grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_4_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_6_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2116);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1019:6: (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1019:6: (otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1019:8: otherlv_8= 'after' ( ( ruleQualifiedName ) ) otherlv_10= 'offset' ( (lv_offset_11_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleCheckPoint2135); 

            	                	newLeafNode(otherlv_8, grammarAccess.getCheckPointAccess().getAfterKeyword_4_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1023:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1024:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1024:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1025:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_4_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2158);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleCheckPoint2170); 

            	                	newLeafNode(otherlv_10, grammarAccess.getCheckPointAccess().getOffsetKeyword_4_0_1_2());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1042:1: ( (lv_offset_11_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1043:1: (lv_offset_11_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1043:1: (lv_offset_11_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1044:3: lv_offset_11_0= RULE_INT
            	            {
            	            lv_offset_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2187); 

            	            			newLeafNode(lv_offset_11_0, grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_4_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_11_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2208);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1075:4: ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1075:4: ({...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1076:5: {...}? => ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1076:107: ( ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1077:6: ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:6: ({...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:7: {...}? => (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:16: (otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:18: otherlv_13= 'completeness' ( (lv_completeness_14_0= RULE_INT ) ) otherlv_15= '%' ruleENDLINE
            	    {
            	    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleCheckPoint2276); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCheckPointAccess().getCompletenessKeyword_4_1_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1084:1: ( (lv_completeness_14_0= RULE_INT ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1085:1: (lv_completeness_14_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1085:1: (lv_completeness_14_0= RULE_INT )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1086:3: lv_completeness_14_0= RULE_INT
            	    {
            	    lv_completeness_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2293); 

            	    			newLeafNode(lv_completeness_14_0, grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_4_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_14_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleCheckPoint2310); 

            	        	newLeafNode(otherlv_15, grammarAccess.getCheckPointAccess().getPercentSignKeyword_4_1_2());
            	        
            	     
            	            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_1_3()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2326);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1121:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1121:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1122:5: {...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1122:107: ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1123:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1126:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1126:7: {...}? => (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1126:16: (otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1126:18: otherlv_17= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    {
            	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleCheckPoint2393); 

            	        	newLeafNode(otherlv_17, grammarAccess.getCheckPointAccess().getDependsOnKeyword_4_2_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1130:1: ( ( ruleQualifiedName ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_ID) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1131:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1131:1: ( ruleQualifiedName )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1132:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_4_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2416);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2_2()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2433);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	

            }

            this_CLOSEDCURLY_20=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2490); 
             
                newLeafNode(this_CLOSEDCURLY_20, grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckPoint"


    // $ANTLR start "entryRuleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1180:1: entryRuleResourceInvolvement returns [EObject current=null] : iv_ruleResourceInvolvement= ruleResourceInvolvement EOF ;
    public final EObject entryRuleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceInvolvement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1181:2: (iv_ruleResourceInvolvement= ruleResourceInvolvement EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1182:2: iv_ruleResourceInvolvement= ruleResourceInvolvement EOF
            {
             newCompositeNode(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2525);
            iv_ruleResourceInvolvement=ruleResourceInvolvement();

            state._fsp--;

             current =iv_ruleResourceInvolvement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement2535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceInvolvement"


    // $ANTLR start "ruleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1189:1: ruleResourceInvolvement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) ;
    public final EObject ruleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_occupation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_responsibility_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1192:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:2: ( (otherlv_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1194:1: (otherlv_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1194:1: (otherlv_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1195:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceInvolvement2580); 

            		newLeafNode(otherlv_0, grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            	

            }


            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1206:2: (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1206:4: otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleResourceInvolvement2593); 

                        	newLeafNode(otherlv_1, grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1210:1: ( (lv_occupation_2_0= RULE_INT ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1211:1: (lv_occupation_2_0= RULE_INT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1211:1: (lv_occupation_2_0= RULE_INT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1212:3: lv_occupation_2_0= RULE_INT
                    {
                    lv_occupation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResourceInvolvement2610); 

                    			newLeafNode(lv_occupation_2_0, grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"occupation",
                            		lv_occupation_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleResourceInvolvement2627); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2());
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1232:3: (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1232:5: otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleResourceInvolvement2642); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1236:1: ( (lv_responsibility_5_0= ruleResponsibility ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1237:1: (lv_responsibility_5_0= ruleResponsibility )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1237:1: (lv_responsibility_5_0= ruleResponsibility )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1238:3: lv_responsibility_5_0= ruleResponsibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponsibility_in_ruleResourceInvolvement2663);
                    lv_responsibility_5_0=ruleResponsibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResourceInvolvementRule());
                    	        }
                           		set(
                           			current, 
                           			"responsibility",
                            		lv_responsibility_5_0, 
                            		"Responsibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleResourceInvolvement2681);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceInvolvement"


    // $ANTLR start "entryRuleActivity"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1270:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1271:2: (iv_ruleActivity= ruleActivity EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1272:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity2716);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity2726); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1279:1: ruleActivity returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_30= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token this_OPENCURLY_5=null;
        Token this_CLOSEDCURLY_7=null;
        Token otherlv_9=null;
        Token lv_start_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_offset_15_0=null;
        Token otherlv_17=null;
        Token lv_end_18_0=null;
        Token otherlv_20=null;
        Token lv_duration_21_0=null;
        Token otherlv_23=null;
        Token lv_completeness_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token this_CLOSEDCURLY_30=null;
        EObject lv_involvedResources_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1282:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_30= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1283:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_30= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1283:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_30= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1283:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_30= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1283:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ML_COMMENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1284:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1284:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1285:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivity2768); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleActivity2786); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1305:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1306:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1306:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1307:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity2803); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity2819); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1327:1: (otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1327:3: otherlv_4= 'involves' this_OPENCURLY_5= RULE_OPENCURLY ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_7= RULE_CLOSEDCURLY
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleActivity2831); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getInvolvesKeyword_4_0());
                        
                    this_OPENCURLY_5=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity2842); 
                     
                        newLeafNode(this_OPENCURLY_5, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_4_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1335:1: ( (lv_involvedResources_6_0= ruleResourceInvolvement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1336:1: (lv_involvedResources_6_0= ruleResourceInvolvement )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1336:1: (lv_involvedResources_6_0= ruleResourceInvolvement )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1337:3: lv_involvedResources_6_0= ruleResourceInvolvement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceInvolvement_in_ruleActivity2862);
                    	    lv_involvedResources_6_0=ruleResourceInvolvement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"involvedResources",
                    	            		lv_involvedResources_6_0, 
                    	            		"ResourceInvolvement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    this_CLOSEDCURLY_7=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity2874); 
                     
                        newLeafNode(this_CLOSEDCURLY_7, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_4_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1357:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1359:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1359:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1360:2: ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1363:2: ( ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1364:3: ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1364:3: ( ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28||LA33_0==36) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 >=37 && LA33_0<=38 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1366:4: ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1366:4: ({...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1367:5: {...}? => ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1367:105: ( ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1368:6: ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1371:6: ({...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1371:7: {...}? => ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1371:16: ( (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==36) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==28) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1371:17: (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1371:17: (otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1371:19: otherlv_9= 'starts' ( (lv_start_10_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleActivity2934); 

            	                	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getStartsKeyword_5_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1375:1: ( (lv_start_10_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1376:1: (lv_start_10_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1376:1: (lv_start_10_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1377:3: lv_start_10_0= RULE_STRING
            	            {
            	            lv_start_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity2951); 

            	            			newLeafNode(lv_start_10_0, grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_5_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"start",
            	                    		lv_start_10_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity2972);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1402:6: (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1402:6: (otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1402:8: otherlv_12= 'after' ( ( ruleQualifiedName ) ) otherlv_14= 'offset' ( (lv_offset_15_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleActivity2991); 

            	                	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getAfterKeyword_5_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1406:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1407:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1407:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1408:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3014);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleActivity3026); 

            	                	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getOffsetKeyword_5_0_1_2());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1425:1: ( (lv_offset_15_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1426:1: (lv_offset_15_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1426:1: (lv_offset_15_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1427:3: lv_offset_15_0= RULE_INT
            	            {
            	            lv_offset_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3043); 

            	            			newLeafNode(lv_offset_15_0, grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_15_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3064);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1458:4: ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1458:4: ({...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1459:5: {...}? => ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1459:105: ( ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1460:6: ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:6: ({...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:7: {...}? => ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:16: ( ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:17: ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_23= 'completeness' ( (lv_completeness_24_0= RULE_INT ) ) otherlv_25= '%' ruleENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:17: ( (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==37) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==38) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:18: (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:18: (otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1463:20: otherlv_17= 'ends' ( (lv_end_18_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_17=(Token)match(input,37,FOLLOW_37_in_ruleActivity3134); 

            	                	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getEndsKeyword_5_1_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1467:1: ( (lv_end_18_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1468:1: (lv_end_18_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1468:1: (lv_end_18_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1469:3: lv_end_18_0= RULE_STRING
            	            {
            	            lv_end_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3151); 

            	            			newLeafNode(lv_end_18_0, grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_5_1_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_18_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3172);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1494:6: (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1494:6: (otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1494:8: otherlv_20= 'duration' ( (lv_duration_21_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_20=(Token)match(input,38,FOLLOW_38_in_ruleActivity3191); 

            	                	newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getDurationKeyword_5_1_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1498:1: ( (lv_duration_21_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1499:1: (lv_duration_21_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1499:1: (lv_duration_21_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1500:3: lv_duration_21_0= RULE_INT
            	            {
            	            lv_duration_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3208); 

            	            			newLeafNode(lv_duration_21_0, grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_5_1_0_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"duration",
            	                    		lv_duration_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_0_1_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3229);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_23=(Token)match(input,30,FOLLOW_30_in_ruleActivity3242); 

            	        	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getCompletenessKeyword_5_1_1());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1528:1: ( (lv_completeness_24_0= RULE_INT ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1529:1: (lv_completeness_24_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1529:1: (lv_completeness_24_0= RULE_INT )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1530:3: lv_completeness_24_0= RULE_INT
            	    {
            	    lv_completeness_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3259); 

            	    			newLeafNode(lv_completeness_24_0, grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_5_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_24_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_25=(Token)match(input,31,FOLLOW_31_in_ruleActivity3276); 

            	        	newLeafNode(otherlv_25, grammarAccess.getActivityAccess().getPercentSignKeyword_5_1_3());
            	        
            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_4()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3292);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1565:4: ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1565:4: ({...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1566:5: {...}? => ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1566:105: ( ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1567:6: ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1570:6: ({...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1570:7: {...}? => (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1570:16: (otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1570:18: otherlv_27= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    {
            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleActivity3359); 

            	        	newLeafNode(otherlv_27, grammarAccess.getActivityAccess().getDependsOnKeyword_5_2_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1574:1: ( ( ruleQualifiedName ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==RULE_ID) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1575:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1575:1: ( ruleQualifiedName )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1576:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_5_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3382);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_2_2()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3399);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	

            }

            this_CLOSEDCURLY_30=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3456); 
             
                newLeafNode(this_CLOSEDCURLY_30, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "ruleResponsibility"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1626:1: ruleResponsibility returns [Enumerator current=null] : ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) ;
    public final Enumerator ruleResponsibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1628:28: ( ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1629:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1629:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt34=1;
                }
                break;
            case 40:
                {
                alt34=2;
                }
                break;
            case 41:
                {
                alt34=3;
                }
                break;
            case 42:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1629:2: (enumLiteral_0= 'RESPONSIBLE' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1629:2: (enumLiteral_0= 'RESPONSIBLE' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1629:4: enumLiteral_0= 'RESPONSIBLE'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleResponsibility3507); 

                            current = grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1635:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1635:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1635:8: enumLiteral_1= 'ACCOUNTABLE'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleResponsibility3524); 

                            current = grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1641:6: (enumLiteral_2= 'CONSULTED' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1641:6: (enumLiteral_2= 'CONSULTED' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1641:8: enumLiteral_2= 'CONSULTED'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleResponsibility3541); 

                            current = grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1647:6: (enumLiteral_3= 'INFORMED' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1647:6: (enumLiteral_3= 'INFORMED' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1647:8: enumLiteral_3= 'INFORMED'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleResponsibility3558); 

                            current = grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponsibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProgram128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProgram180 = new BitSet(new long[]{0x000000000080C090L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProgram201 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram217 = new BitSet(new long[]{0x000000000080C090L});
    public static final BitSet FOLLOW_14_in_ruleProgram231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProgram254 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram270 = new BitSet(new long[]{0x000000000000C090L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram292 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProject420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProject438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject455 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject471 = new BitSet(new long[]{0x0000000404EB0090L});
    public static final BitSet FOLLOW_ruleWBSImport_in_ruleProject492 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject508 = new BitSet(new long[]{0x0000000404CB0090L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_ruleProject531 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject547 = new BitSet(new long[]{0x00000004048B0090L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProject570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject586 = new BitSet(new long[]{0x00000004048B0090L});
    public static final BitSet FOLLOW_16_in_ruleProject600 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject611 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_ruleAssumption_in_ruleProject631 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject643 = new BitSet(new long[]{0x00000004040A0090L});
    public static final BitSet FOLLOW_17_in_ruleProject657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject668 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleProject688 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject700 = new BitSet(new long[]{0x0000000404080090L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleProject722 = new BitSet(new long[]{0x0000000404080090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssumption816 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssumption833 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleAssumption854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleConstraint936 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint953 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleConstraint974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1061 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActivityGroup1079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityGroup1096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1112 = new BitSet(new long[]{0x0000000404180090L});
    public static final BitSet FOLLOW_20_in_ruleActivityGroup1124 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityGroup1147 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1164 = new BitSet(new long[]{0x0000000404080090L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleActivityGroup1186 = new BitSet(new long[]{0x0000000404080090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_entryRuleWBSImport1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSImport1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWBSImport1280 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWBSImport1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourcesImport1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResourcesImport1385 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourcesImport1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePlanImport1490 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlanImport1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1600 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifiedName1619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1634 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleActivityElement1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_ruleActivityElement1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_ruleActivityElement1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleENDLINE1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint1969 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCheckPoint1987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckPoint2004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2020 = new BitSet(new long[]{0x0000000058100000L});
    public static final BitSet FOLLOW_27_in_ruleCheckPoint2078 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2095 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2116 = new BitSet(new long[]{0x0000000058100080L});
    public static final BitSet FOLLOW_28_in_ruleCheckPoint2135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2158 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCheckPoint2170 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2187 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2208 = new BitSet(new long[]{0x0000000058100080L});
    public static final BitSet FOLLOW_30_in_ruleCheckPoint2276 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2293 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCheckPoint2310 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2326 = new BitSet(new long[]{0x0000000058100080L});
    public static final BitSet FOLLOW_20_in_ruleCheckPoint2393 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2416 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2433 = new BitSet(new long[]{0x0000000058100080L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceInvolvement2580 = new BitSet(new long[]{0x0000000302000000L});
    public static final BitSet FOLLOW_32_in_ruleResourceInvolvement2593 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResourceInvolvement2610 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleResourceInvolvement2627 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_ruleResourceInvolvement2642 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleResponsibility_in_ruleResourceInvolvement2663 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleResourceInvolvement2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity2716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivity2768 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActivity2786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity2803 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity2819 = new BitSet(new long[]{0x0000007810100000L});
    public static final BitSet FOLLOW_35_in_ruleActivity2831 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity2842 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_ruleActivity2862 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity2874 = new BitSet(new long[]{0x0000007010100000L});
    public static final BitSet FOLLOW_36_in_ruleActivity2934 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity2951 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity2972 = new BitSet(new long[]{0x0000007010100080L});
    public static final BitSet FOLLOW_28_in_ruleActivity2991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3014 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleActivity3026 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3043 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3064 = new BitSet(new long[]{0x0000007010100080L});
    public static final BitSet FOLLOW_37_in_ruleActivity3134 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3151 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3172 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38_in_ruleActivity3191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3208 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3229 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActivity3242 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3259 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleActivity3276 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3292 = new BitSet(new long[]{0x0000007010100080L});
    public static final BitSet FOLLOW_20_in_ruleActivity3359 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3382 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3399 = new BitSet(new long[]{0x0000007010100080L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleResponsibility3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleResponsibility3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleResponsibility3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleResponsibility3558 = new BitSet(new long[]{0x0000000000000002L});

}
