package com.lowcoupling.mdpm.lng.plan.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_STRING", "RULE_CLOSEDCURLY", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'name'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'dependsOn'", "'wbs'", "'resources'", "'plan'", "'.'", "';'", "'CheckPoint'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'"
    };
    public static final int RULE_ID=5;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_CLOSEDCURLY=8;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:77:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_9=null;
        Token this_CLOSEDCURLY_13=null;
        EObject lv_plans_7_0 = null;

        EObject lv_projects_12_0 = null;

        EObject lv_projects_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:80:28: ( ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==13) ) {
                    alt6=1;
                }
                else if ( (LA6_1==16) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )
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

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:99:3: (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:99:5: otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY
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
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProgram192); 

                                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0());
                                
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:129:1: ( (lv_longName_5_0= RULE_STRING ) )
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:130:1: (lv_longName_5_0= RULE_STRING )
                            {
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:130:1: (lv_longName_5_0= RULE_STRING )
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:131:3: lv_longName_5_0= RULE_STRING
                            {
                            lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProgram209); 

                            			newLeafNode(lv_longName_5_0, grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProgramRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_5_0, 
                                    		"STRING");
                            	    

                            }


                            }

                             
                                    newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 
                                
                            pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram230);
                            ruleENDLINE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:3: ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==24) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:4: ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:4: ( (lv_plans_7_0= rulePlanImport ) )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: (lv_plans_7_0= rulePlanImport )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: (lv_plans_7_0= rulePlanImport )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:157:3: lv_plans_7_0= rulePlanImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePlanImport_in_ruleProgram253);
                    	    lv_plans_7_0=rulePlanImport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"plans",
                    	            		lv_plans_7_0, 
                    	            		"PlanImport");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram269);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:181:3: (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:181:5: otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleProgram283); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0());
                    	        
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:185:1: ( ( ruleQualifiedName ) )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:186:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:186:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:187:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProgramRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProgram306);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram322);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:208:3: ( (lv_projects_12_0= ruleProject ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ML_COMMENT||LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:209:1: (lv_projects_12_0= ruleProject )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:209:1: (lv_projects_12_0= ruleProject )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:210:3: lv_projects_12_0= ruleProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProject_in_ruleProgram344);
                    	    lv_projects_12_0=ruleProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_12_0, 
                    	            		"Project");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_CLOSEDCURLY_13=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram356); 
                     
                        newLeafNode(this_CLOSEDCURLY_13, grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:231:6: ( (lv_projects_14_0= ruleProject ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:231:6: ( (lv_projects_14_0= ruleProject ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:232:1: (lv_projects_14_0= ruleProject )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:232:1: (lv_projects_14_0= ruleProject )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:233:3: lv_projects_14_0= ruleProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProject_in_ruleProgram384);
                    lv_projects_14_0=ruleProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_14_0, 
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:257:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:258:2: (iv_ruleProject= ruleProject EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:259:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject420);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject430); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:266:1: ruleProject returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY )? (otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )? ( (lv_activities_21_0= ruleActivityElement ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_13=null;
        Token this_OPENCURLY_14=null;
        Token this_CLOSEDCURLY_16=null;
        Token otherlv_17=null;
        Token this_OPENCURLY_18=null;
        Token this_CLOSEDCURLY_20=null;
        Token this_CLOSEDCURLY_22=null;
        EObject lv_wbs_7_0 = null;

        EObject lv_resources_9_0 = null;

        EObject lv_plans_11_0 = null;

        EObject lv_assumptions_15_0 = null;

        EObject lv_constraints_19_0 = null;

        EObject lv_activities_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:269:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY )? (otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )? ( (lv_activities_21_0= ruleActivityElement ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY )? (otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )? ( (lv_activities_21_0= ruleActivityElement ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY )? (otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )? ( (lv_activities_21_0= ruleActivityElement ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE )? ( ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY )? (otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )? ( (lv_activities_21_0= ruleActivityElement ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:271:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:271:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:272:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProject472); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProject490); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:292:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:293:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:293:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:294:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject507); 

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

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject523); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:314:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:314:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProject535); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:318:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:319:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:319:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:320:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject552); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject573);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:344:3: ( ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:344:4: ( (lv_wbs_7_0= ruleWBSImport ) ) ruleENDLINE
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:344:4: ( (lv_wbs_7_0= ruleWBSImport ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:345:1: (lv_wbs_7_0= ruleWBSImport )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:345:1: (lv_wbs_7_0= ruleWBSImport )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:346:3: lv_wbs_7_0= ruleWBSImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWBSImport_in_ruleProject596);
                    lv_wbs_7_0=ruleWBSImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"wbs",
                            		lv_wbs_7_0, 
                            		"WBSImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject612);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:370:3: ( ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:370:4: ( (lv_resources_9_0= ruleResourcesImport ) ) ruleENDLINE
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:370:4: ( (lv_resources_9_0= ruleResourcesImport ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:371:1: (lv_resources_9_0= ruleResourcesImport )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:371:1: (lv_resources_9_0= ruleResourcesImport )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:372:3: lv_resources_9_0= ruleResourcesImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourcesImport_in_ruleProject635);
                    lv_resources_9_0=ruleResourcesImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"resources",
                            		lv_resources_9_0, 
                            		"ResourcesImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject651);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:396:3: ( ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:396:4: ( (lv_plans_11_0= rulePlanImport ) ) ruleENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:396:4: ( (lv_plans_11_0= rulePlanImport ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:397:1: (lv_plans_11_0= rulePlanImport )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:397:1: (lv_plans_11_0= rulePlanImport )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:398:3: lv_plans_11_0= rulePlanImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlanImport_in_ruleProject674);
            	    lv_plans_11_0=rulePlanImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_11_0, 
            	            		"PlanImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	     
            	            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_7_1()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject690);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:422:3: (otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:422:5: otherlv_13= 'assumptions' this_OPENCURLY_14= RULE_OPENCURLY ( (lv_assumptions_15_0= ruleAssumption ) )* this_CLOSEDCURLY_16= RULE_CLOSEDCURLY
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleProject704); 

                        	newLeafNode(otherlv_13, grammarAccess.getProjectAccess().getAssumptionsKeyword_8_0());
                        
                    this_OPENCURLY_14=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject715); 
                     
                        newLeafNode(this_OPENCURLY_14, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:430:1: ( (lv_assumptions_15_0= ruleAssumption ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:431:1: (lv_assumptions_15_0= ruleAssumption )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:431:1: (lv_assumptions_15_0= ruleAssumption )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:432:3: lv_assumptions_15_0= ruleAssumption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssumption_in_ruleProject735);
                    	    lv_assumptions_15_0=ruleAssumption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assumptions",
                    	            		lv_assumptions_15_0, 
                    	            		"Assumption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    this_CLOSEDCURLY_16=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject747); 
                     
                        newLeafNode(this_CLOSEDCURLY_16, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:452:3: (otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:452:5: otherlv_17= 'constraints' this_OPENCURLY_18= RULE_OPENCURLY ( (lv_constraints_19_0= ruleConstraint ) )* this_CLOSEDCURLY_20= RULE_CLOSEDCURLY
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleProject761); 

                        	newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getConstraintsKeyword_9_0());
                        
                    this_OPENCURLY_18=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject772); 
                     
                        newLeafNode(this_OPENCURLY_18, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_9_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:460:1: ( (lv_constraints_19_0= ruleConstraint ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:461:1: (lv_constraints_19_0= ruleConstraint )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:461:1: (lv_constraints_19_0= ruleConstraint )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:462:3: lv_constraints_19_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleProject792);
                    	    lv_constraints_19_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_19_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_CLOSEDCURLY_20=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject804); 
                     
                        newLeafNode(this_CLOSEDCURLY_20, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_9_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:482:3: ( (lv_activities_21_0= ruleActivityElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ML_COMMENT||LA16_0==20||LA16_0==27||LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:483:1: (lv_activities_21_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:483:1: (lv_activities_21_0= ruleActivityElement )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:484:3: lv_activities_21_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleProject826);
            	    lv_activities_21_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_21_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            this_CLOSEDCURLY_22=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject838); 
             
                newLeafNode(this_CLOSEDCURLY_22, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_11()); 
                

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:512:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:513:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:514:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption873);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption883); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:521:1: ruleAssumption returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:524:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:525:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:525:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:525:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAssumption920); 

                	newLeafNode(otherlv_0, grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:529:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:530:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:530:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:531:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssumption937); 

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
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleAssumption958);
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:563:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:564:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:565:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint993);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1003); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:572:1: ruleConstraint returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:575:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:576:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:576:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:576:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleConstraint1040); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:580:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:581:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:581:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:582:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1057); 

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
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleConstraint1078);
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:614:1: entryRuleActivityGroup returns [EObject current=null] : iv_ruleActivityGroup= ruleActivityGroup EOF ;
    public final EObject entryRuleActivityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityGroup = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:615:2: (iv_ruleActivityGroup= ruleActivityGroup EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:616:2: iv_ruleActivityGroup= ruleActivityGroup EOF
            {
             newCompositeNode(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1113);
            iv_ruleActivityGroup=ruleActivityGroup();

            state._fsp--;

             current =iv_ruleActivityGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup1123); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:623:1: ruleActivityGroup returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivityGroup() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_7=null;
        Token this_CLOSEDCURLY_11=null;
        EObject lv_activities_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:626:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:627:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:627:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:627:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:627:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ML_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:628:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:628:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:629:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1165); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleActivityGroup1183); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityGroupAccess().getGroupKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:649:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:650:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:650:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:651:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityGroup1200); 

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

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1216); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:671:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:671:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleActivityGroup1228); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityGroupAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:675:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:676:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:676:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:677:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityGroup1245); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1266);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:701:3: (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:701:5: otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleActivityGroup1280); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityGroupAccess().getDependsOnKeyword_5_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:705:1: ( ( ruleQualifiedName ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:706:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:706:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:707:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityGroup1303);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1320);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:728:3: ( (lv_activities_10_0= ruleActivityElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ML_COMMENT||LA21_0==20||LA21_0==27||LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:729:1: (lv_activities_10_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:729:1: (lv_activities_10_0= ruleActivityElement )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:730:3: lv_activities_10_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleActivityGroup1342);
            	    lv_activities_10_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_10_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            this_CLOSEDCURLY_11=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1354); 
             
                newLeafNode(this_CLOSEDCURLY_11, grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
                

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:758:1: entryRuleWBSImport returns [EObject current=null] : iv_ruleWBSImport= ruleWBSImport EOF ;
    public final EObject entryRuleWBSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:759:2: (iv_ruleWBSImport= ruleWBSImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:760:2: iv_ruleWBSImport= ruleWBSImport EOF
            {
             newCompositeNode(grammarAccess.getWBSImportRule()); 
            pushFollow(FOLLOW_ruleWBSImport_in_entryRuleWBSImport1389);
            iv_ruleWBSImport=ruleWBSImport();

            state._fsp--;

             current =iv_ruleWBSImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSImport1399); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:767:1: ruleWBSImport returns [EObject current=null] : (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWBSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:770:28: ( (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:771:1: (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:771:1: (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:771:3: otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleWBSImport1436); 

                	newLeafNode(otherlv_0, grammarAccess.getWBSImportAccess().getWbsKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:775:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:776:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:776:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:777:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWBSImport1453); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:801:1: entryRuleResourcesImport returns [EObject current=null] : iv_ruleResourcesImport= ruleResourcesImport EOF ;
    public final EObject entryRuleResourcesImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourcesImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:802:2: (iv_ruleResourcesImport= ruleResourcesImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:803:2: iv_ruleResourcesImport= ruleResourcesImport EOF
            {
             newCompositeNode(grammarAccess.getResourcesImportRule()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport1494);
            iv_ruleResourcesImport=ruleResourcesImport();

            state._fsp--;

             current =iv_ruleResourcesImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourcesImport1504); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:810:1: ruleResourcesImport returns [EObject current=null] : (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleResourcesImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:813:28: ( (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:814:1: (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:814:1: (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:814:3: otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleResourcesImport1541); 

                	newLeafNode(otherlv_0, grammarAccess.getResourcesImportAccess().getResourcesKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:818:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:819:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:819:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:820:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourcesImport1558); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:844:1: entryRulePlanImport returns [EObject current=null] : iv_rulePlanImport= rulePlanImport EOF ;
    public final EObject entryRulePlanImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:845:2: (iv_rulePlanImport= rulePlanImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:846:2: iv_rulePlanImport= rulePlanImport EOF
            {
             newCompositeNode(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport1599);
            iv_rulePlanImport=rulePlanImport();

            state._fsp--;

             current =iv_rulePlanImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport1609); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:853:1: rulePlanImport returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePlanImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:856:28: ( (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:857:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:857:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:857:3: otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePlanImport1646); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanImportAccess().getPlanKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:861:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:862:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:862:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:863:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlanImport1663); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:887:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:888:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:889:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1705);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1716); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:896:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:899:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:900:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:900:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:900:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1756); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:907:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:908:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedName1775); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1790); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:930:1: entryRuleActivityElement returns [EObject current=null] : iv_ruleActivityElement= ruleActivityElement EOF ;
    public final EObject entryRuleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityElement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:931:2: (iv_ruleActivityElement= ruleActivityElement EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:932:2: iv_ruleActivityElement= ruleActivityElement EOF
            {
             newCompositeNode(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement1839);
            iv_ruleActivityElement=ruleActivityElement();

            state._fsp--;

             current =iv_ruleActivityElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement1849); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:939:1: ruleActivityElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) ;
    public final EObject ruleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_CheckPoint_1 = null;

        EObject this_ActivityGroup_2 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:942:28: ( (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:943:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:943:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt23=2;
                    }
                    break;
                case 20:
                    {
                    alt23=3;
                    }
                    break;
                case 35:
                    {
                    alt23=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                alt23=1;
                }
                break;
            case 27:
                {
                alt23=2;
                }
                break;
            case 20:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:944:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleActivityElement1896);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:954:5: this_CheckPoint_1= ruleCheckPoint
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckPoint_in_ruleActivityElement1923);
                    this_CheckPoint_1=ruleCheckPoint();

                    state._fsp--;

                     
                            current = this_CheckPoint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:964:5: this_ActivityGroup_2= ruleActivityGroup
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActivityGroup_in_ruleActivityElement1950);
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:980:1: entryRuleENDLINE returns [String current=null] : iv_ruleENDLINE= ruleENDLINE EOF ;
    public final String entryRuleENDLINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENDLINE = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:981:2: (iv_ruleENDLINE= ruleENDLINE EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:982:2: iv_ruleENDLINE= ruleENDLINE EOF
            {
             newCompositeNode(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE1986);
            iv_ruleENDLINE=ruleENDLINE();

            state._fsp--;

             current =iv_ruleENDLINE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE1997); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:989:1: ruleENDLINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleENDLINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:992:28: (kw= ';' )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:994:2: kw= ';'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleENDLINE2034); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1007:1: entryRuleCheckPoint returns [EObject current=null] : iv_ruleCheckPoint= ruleCheckPoint EOF ;
    public final EObject entryRuleCheckPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckPoint = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1008:2: (iv_ruleCheckPoint= ruleCheckPoint EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1009:2: iv_ruleCheckPoint= ruleCheckPoint EOF
            {
             newCompositeNode(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint2073);
            iv_ruleCheckPoint=ruleCheckPoint();

            state._fsp--;

             current =iv_ruleCheckPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint2083); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1016:1: ruleCheckPoint returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY ) ;
    public final EObject ruleCheckPoint() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_8=null;
        Token lv_end_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_offset_14_0=null;
        Token otherlv_16=null;
        Token lv_completeness_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token this_CLOSEDCURLY_23=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1019:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1020:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1020:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1020:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1020:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ML_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1021:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1021:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1022:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint2125); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCheckPoint2143); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckPointAccess().getCheckPointKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1042:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1043:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1043:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1044:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckPoint2160); 

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

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2176); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1064:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1064:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCheckPoint2188); 

                        	newLeafNode(otherlv_4, grammarAccess.getCheckPointAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1068:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1069:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1069:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1070:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2205); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2226);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1094:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1096:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1096:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1097:2: ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1100:2: ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1101:3: ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1101:3: ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=4;
                int LA28_0 = input.LA(1);

                if ( LA28_0 >=28 && LA28_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2) ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1103:4: ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1103:4: ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1104:5: {...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1104:107: ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1105:6: ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1108:6: ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1108:7: {...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1108:16: ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==28) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==29) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1108:17: (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1108:17: (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1108:19: otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleCheckPoint2286); 

            	                	newLeafNode(otherlv_8, grammarAccess.getCheckPointAccess().getDateKeyword_5_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1112:1: ( (lv_end_9_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1113:1: (lv_end_9_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1113:1: (lv_end_9_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1114:3: lv_end_9_0= RULE_STRING
            	            {
            	            lv_end_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2303); 

            	            			newLeafNode(lv_end_9_0, grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_5_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_9_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2324);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1139:6: (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1139:6: (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1139:8: otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleCheckPoint2343); 

            	                	newLeafNode(otherlv_11, grammarAccess.getCheckPointAccess().getAfterKeyword_5_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1143:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1144:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1144:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1145:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2366);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleCheckPoint2378); 

            	                	newLeafNode(otherlv_13, grammarAccess.getCheckPointAccess().getOffsetKeyword_5_0_1_2());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1162:1: ( (lv_offset_14_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1163:1: (lv_offset_14_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1163:1: (lv_offset_14_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1164:3: lv_offset_14_0= RULE_INT
            	            {
            	            lv_offset_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2395); 

            	            			newLeafNode(lv_offset_14_0, grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_14_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2416);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1195:4: ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1195:4: ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1196:5: {...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1196:107: ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1197:6: ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1200:6: ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1200:7: {...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1200:16: (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1200:18: otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleCheckPoint2484); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCheckPointAccess().getCompletenessKeyword_5_1_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1204:1: ( (lv_completeness_17_0= RULE_INT ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1205:1: (lv_completeness_17_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1205:1: (lv_completeness_17_0= RULE_INT )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1206:3: lv_completeness_17_0= RULE_INT
            	    {
            	    lv_completeness_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2501); 

            	    			newLeafNode(lv_completeness_17_0, grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_5_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_17_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleCheckPoint2518); 

            	        	newLeafNode(otherlv_18, grammarAccess.getCheckPointAccess().getPercentSignKeyword_5_1_2());
            	        
            	     
            	            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_3()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2534);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1241:4: ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1241:4: ({...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1242:5: {...}? => ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1242:107: ( ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1243:6: ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1246:6: ({...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1246:7: {...}? => (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1246:16: (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1246:18: otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    {
            	    otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleCheckPoint2601); 

            	        	newLeafNode(otherlv_20, grammarAccess.getCheckPointAccess().getDependsOnKeyword_5_2_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1250:1: ( ( ruleQualifiedName ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==RULE_ID) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1251:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1251:1: ( ruleQualifiedName )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1252:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_5_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2624);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_2_2()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2641);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	

            }

            this_CLOSEDCURLY_23=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2698); 
             
                newLeafNode(this_CLOSEDCURLY_23, grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
                

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1300:1: entryRuleResourceInvolvement returns [EObject current=null] : iv_ruleResourceInvolvement= ruleResourceInvolvement EOF ;
    public final EObject entryRuleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceInvolvement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1301:2: (iv_ruleResourceInvolvement= ruleResourceInvolvement EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1302:2: iv_ruleResourceInvolvement= ruleResourceInvolvement EOF
            {
             newCompositeNode(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2733);
            iv_ruleResourceInvolvement=ruleResourceInvolvement();

            state._fsp--;

             current =iv_ruleResourceInvolvement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement2743); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1309:1: ruleResourceInvolvement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) ;
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
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1312:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1313:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1313:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1313:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1313:2: ( (otherlv_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1314:1: (otherlv_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1314:1: (otherlv_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1315:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceInvolvement2788); 

            		newLeafNode(otherlv_0, grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            	

            }


            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1326:2: (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1326:4: otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleResourceInvolvement2801); 

                        	newLeafNode(otherlv_1, grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1330:1: ( (lv_occupation_2_0= RULE_INT ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1331:1: (lv_occupation_2_0= RULE_INT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1331:1: (lv_occupation_2_0= RULE_INT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1332:3: lv_occupation_2_0= RULE_INT
                    {
                    lv_occupation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResourceInvolvement2818); 

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

                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleResourceInvolvement2835); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2());
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1352:3: (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1352:5: otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleResourceInvolvement2850); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1356:1: ( (lv_responsibility_5_0= ruleResponsibility ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1357:1: (lv_responsibility_5_0= ruleResponsibility )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1357:1: (lv_responsibility_5_0= ruleResponsibility )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1358:3: lv_responsibility_5_0= ruleResponsibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponsibility_in_ruleResourceInvolvement2871);
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
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleResourceInvolvement2889);
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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1390:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1391:2: (iv_ruleActivity= ruleActivity EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1392:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity2924);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity2934); 

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1399:1: ruleActivity returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_7=null;
        Token this_OPENCURLY_8=null;
        Token this_CLOSEDCURLY_10=null;
        Token otherlv_12=null;
        Token lv_start_13_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_offset_18_0=null;
        Token otherlv_20=null;
        Token lv_end_21_0=null;
        Token otherlv_23=null;
        Token lv_duration_24_0=null;
        Token otherlv_26=null;
        Token lv_completeness_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token this_CLOSEDCURLY_33=null;
        EObject lv_involvedResources_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1402:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1403:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1403:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1403:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1403:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ML_COMMENT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1404:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1404:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1405:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivity2976); 

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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleActivity2994); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1425:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1426:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1426:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1427:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity3011); 

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

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity3027); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1447:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==14) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1447:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleActivity3039); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1451:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1452:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1452:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1453:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3056); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3077);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1477:3: (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1477:5: otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleActivity3091); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getInvolvesKeyword_5_0());
                        
                    this_OPENCURLY_8=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity3102); 
                     
                        newLeafNode(this_OPENCURLY_8, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1485:1: ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1486:1: (lv_involvedResources_9_0= ruleResourceInvolvement )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1486:1: (lv_involvedResources_9_0= ruleResourceInvolvement )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1487:3: lv_involvedResources_9_0= ruleResourceInvolvement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceInvolvement_in_ruleActivity3122);
                    	    lv_involvedResources_9_0=ruleResourceInvolvement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"involvedResources",
                    	            		lv_involvedResources_9_0, 
                    	            		"ResourceInvolvement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3134); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1507:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1509:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1509:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1510:2: ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1513:2: ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1514:3: ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1514:3: ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==29||LA38_0==37) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 >=38 && LA38_0<=39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1516:4: ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1516:4: ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1517:5: {...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1517:105: ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1518:6: ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1521:6: ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1521:7: {...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1521:16: ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==37) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==29) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1521:17: (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1521:17: (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1521:19: otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleActivity3194); 

            	                	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getStartsKeyword_6_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1525:1: ( (lv_start_13_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1526:1: (lv_start_13_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1526:1: (lv_start_13_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1527:3: lv_start_13_0= RULE_STRING
            	            {
            	            lv_start_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3211); 

            	            			newLeafNode(lv_start_13_0, grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_6_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"start",
            	                    		lv_start_13_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3232);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1552:6: (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1552:6: (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1552:8: otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleActivity3251); 

            	                	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getAfterKeyword_6_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1556:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1557:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1557:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1558:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_6_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3274);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleActivity3286); 

            	                	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getOffsetKeyword_6_0_1_2());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1575:1: ( (lv_offset_18_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1576:1: (lv_offset_18_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1576:1: (lv_offset_18_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1577:3: lv_offset_18_0= RULE_INT
            	            {
            	            lv_offset_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3303); 

            	            			newLeafNode(lv_offset_18_0, grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_6_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_18_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3324);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1608:4: ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1608:4: ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1609:5: {...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1609:105: ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1610:6: ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:6: ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:7: {...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:16: ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:17: ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:17: ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==38) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==39) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:18: (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:18: (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:20: otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_20=(Token)match(input,38,FOLLOW_38_in_ruleActivity3394); 

            	                	newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getEndsKeyword_6_1_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1617:1: ( (lv_end_21_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1618:1: (lv_end_21_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1618:1: (lv_end_21_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1619:3: lv_end_21_0= RULE_STRING
            	            {
            	            lv_end_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3411); 

            	            			newLeafNode(lv_end_21_0, grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_6_1_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_21_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3432);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1644:6: (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1644:6: (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1644:8: otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_23=(Token)match(input,39,FOLLOW_39_in_ruleActivity3451); 

            	                	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getDurationKeyword_6_1_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1648:1: ( (lv_duration_24_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1649:1: (lv_duration_24_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1649:1: (lv_duration_24_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:3: lv_duration_24_0= RULE_INT
            	            {
            	            lv_duration_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3468); 

            	            			newLeafNode(lv_duration_24_0, grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_6_1_0_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"duration",
            	                    		lv_duration_24_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_1_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3489);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_26=(Token)match(input,31,FOLLOW_31_in_ruleActivity3502); 

            	        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getCompletenessKeyword_6_1_1());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1678:1: ( (lv_completeness_27_0= RULE_INT ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1679:1: (lv_completeness_27_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1679:1: (lv_completeness_27_0= RULE_INT )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1680:3: lv_completeness_27_0= RULE_INT
            	    {
            	    lv_completeness_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3519); 

            	    			newLeafNode(lv_completeness_27_0, grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_6_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_27_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_28=(Token)match(input,32,FOLLOW_32_in_ruleActivity3536); 

            	        	newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getPercentSignKeyword_6_1_3());
            	        
            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_4()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3552);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1715:4: ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1715:4: ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1716:5: {...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1716:105: ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1717:6: ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1720:6: ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1720:7: {...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1720:16: (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1720:18: otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    {
            	    otherlv_30=(Token)match(input,21,FOLLOW_21_in_ruleActivity3619); 

            	        	newLeafNode(otherlv_30, grammarAccess.getActivityAccess().getDependsOnKeyword_6_2_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1724:1: ( ( ruleQualifiedName ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==RULE_ID) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1725:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1725:1: ( ruleQualifiedName )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1726:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3642);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2_2()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3659);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6()) ) {
                throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	

            }

            this_CLOSEDCURLY_33=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3716); 
             
                newLeafNode(this_CLOSEDCURLY_33, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
                

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
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1776:1: ruleResponsibility returns [Enumerator current=null] : ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) ;
    public final Enumerator ruleResponsibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1778:28: ( ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1779:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1779:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt39=1;
                }
                break;
            case 41:
                {
                alt39=2;
                }
                break;
            case 42:
                {
                alt39=3;
                }
                break;
            case 43:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1779:2: (enumLiteral_0= 'RESPONSIBLE' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1779:2: (enumLiteral_0= 'RESPONSIBLE' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1779:4: enumLiteral_0= 'RESPONSIBLE'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleResponsibility3767); 

                            current = grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1785:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1785:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1785:8: enumLiteral_1= 'ACCOUNTABLE'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleResponsibility3784); 

                            current = grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1791:6: (enumLiteral_2= 'CONSULTED' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1791:6: (enumLiteral_2= 'CONSULTED' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1791:8: enumLiteral_2= 'CONSULTED'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleResponsibility3801); 

                            current = grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1797:6: (enumLiteral_3= 'INFORMED' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1797:6: (enumLiteral_3= 'INFORMED' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1797:8: enumLiteral_3= 'INFORMED'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleResponsibility3818); 

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
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProgram180 = new BitSet(new long[]{0x000000000101C110L});
    public static final BitSet FOLLOW_14_in_ruleProgram192 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProgram209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram230 = new BitSet(new long[]{0x0000000001018110L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProgram253 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram269 = new BitSet(new long[]{0x0000000001018110L});
    public static final BitSet FOLLOW_15_in_ruleProgram283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProgram306 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram322 = new BitSet(new long[]{0x0000000000018110L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram344 = new BitSet(new long[]{0x0000000000010110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProject472 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject523 = new BitSet(new long[]{0x0000000809D64110L});
    public static final BitSet FOLLOW_14_in_ruleProject535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject552 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject573 = new BitSet(new long[]{0x0000000809D60110L});
    public static final BitSet FOLLOW_ruleWBSImport_in_ruleProject596 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject612 = new BitSet(new long[]{0x0000000809960110L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_ruleProject635 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject651 = new BitSet(new long[]{0x0000000809160110L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProject674 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject690 = new BitSet(new long[]{0x0000000809160110L});
    public static final BitSet FOLLOW_17_in_ruleProject704 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject715 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_ruleAssumption_in_ruleProject735 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject747 = new BitSet(new long[]{0x0000000808140110L});
    public static final BitSet FOLLOW_18_in_ruleProject761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject772 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleProject792 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject804 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleProject826 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssumption920 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssumption937 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleAssumption958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConstraint1040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1057 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleConstraint1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1165 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivityGroup1183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityGroup1200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1216 = new BitSet(new long[]{0x0000000808304110L});
    public static final BitSet FOLLOW_14_in_ruleActivityGroup1228 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityGroup1245 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1266 = new BitSet(new long[]{0x0000000808300110L});
    public static final BitSet FOLLOW_21_in_ruleActivityGroup1280 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityGroup1303 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1320 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleActivityGroup1342 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_entryRuleWBSImport1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSImport1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWBSImport1436 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWBSImport1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourcesImport1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResourcesImport1541 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourcesImport1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePlanImport1646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlanImport1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1756 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedName1775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1790 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleActivityElement1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_ruleActivityElement1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_ruleActivityElement1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleENDLINE2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint2073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint2125 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCheckPoint2143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckPoint2160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2176 = new BitSet(new long[]{0x00000000B0204000L});
    public static final BitSet FOLLOW_14_in_ruleCheckPoint2188 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2205 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2226 = new BitSet(new long[]{0x00000000B0200000L});
    public static final BitSet FOLLOW_28_in_ruleCheckPoint2286 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2303 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2324 = new BitSet(new long[]{0x00000000B0200100L});
    public static final BitSet FOLLOW_29_in_ruleCheckPoint2343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCheckPoint2378 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2395 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2416 = new BitSet(new long[]{0x00000000B0200100L});
    public static final BitSet FOLLOW_31_in_ruleCheckPoint2484 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2501 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCheckPoint2518 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2534 = new BitSet(new long[]{0x00000000B0200100L});
    public static final BitSet FOLLOW_21_in_ruleCheckPoint2601 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2624 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2641 = new BitSet(new long[]{0x00000000B0200100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceInvolvement2788 = new BitSet(new long[]{0x0000000604000000L});
    public static final BitSet FOLLOW_33_in_ruleResourceInvolvement2801 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResourceInvolvement2818 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleResourceInvolvement2835 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_34_in_ruleResourceInvolvement2850 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleResponsibility_in_ruleResourceInvolvement2871 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleResourceInvolvement2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity2924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivity2976 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActivity2994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity3011 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity3027 = new BitSet(new long[]{0x000000F020204000L});
    public static final BitSet FOLLOW_14_in_ruleActivity3039 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3056 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3077 = new BitSet(new long[]{0x000000F020200000L});
    public static final BitSet FOLLOW_36_in_ruleActivity3091 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity3102 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_ruleActivity3122 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3134 = new BitSet(new long[]{0x000000E020200000L});
    public static final BitSet FOLLOW_37_in_ruleActivity3194 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3211 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3232 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_29_in_ruleActivity3251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActivity3286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3303 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3324 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_38_in_ruleActivity3394 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3411 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3432 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39_in_ruleActivity3451 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3468 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3489 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleActivity3502 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3519 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleActivity3536 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3552 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_21_in_ruleActivity3619 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3642 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3659 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleResponsibility3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleResponsibility3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleResponsibility3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleResponsibility3818 = new BitSet(new long[]{0x0000000000000002L});

}
