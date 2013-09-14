package com.lowcoupling.mdpm.lng.wbs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWBSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ENDLINE", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program '", "'Project '", "'Activity '", "'WorkPackage '", "'Deliverable '"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CLOSEDCURLY=7;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=6;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ENDLINE=8;
    public static final int RULE_ML_COMMENT=4;

    // delegates
    // delegators


        public InternalWBSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWBSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWBSParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g"; }



     	private WBSGrammarAccess grammarAccess;
     	
        public InternalWBSParser(TokenStream input, WBSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "WBS";	
       	}
       	
       	@Override
       	protected WBSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:67:1: entryRuleWBS returns [EObject current=null] : iv_ruleWBS= ruleWBS EOF ;
    public final EObject entryRuleWBS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBS = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:68:2: (iv_ruleWBS= ruleWBS EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:69:2: iv_ruleWBS= ruleWBS EOF
            {
             newCompositeNode(grammarAccess.getWBSRule()); 
            pushFollow(FOLLOW_ruleWBS_in_entryRuleWBS75);
            iv_ruleWBS=ruleWBS();

            state._fsp--;

             current =iv_ruleWBS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBS85); 

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
    // $ANTLR end "entryRuleWBS"


    // $ANTLR start "ruleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:76:1: ruleWBS returns [EObject current=null] : (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject ) ;
    public final EObject ruleWBS() throws RecognitionException {
        EObject current = null;

        EObject this_WBSProgram_0 = null;

        EObject this_WBSProject_1 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:79:28: ( (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:80:1: (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:80:1: (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==14) ) {
                    alt1=1;
                }
                else if ( (LA1_1==15) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:81:5: this_WBSProgram_0= ruleWBSProgram
                    {
                     
                            newCompositeNode(grammarAccess.getWBSAccess().getWBSProgramParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWBSProgram_in_ruleWBS132);
                    this_WBSProgram_0=ruleWBSProgram();

                    state._fsp--;

                     
                            current = this_WBSProgram_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:91:5: this_WBSProject_1= ruleWBSProject
                    {
                     
                            newCompositeNode(grammarAccess.getWBSAccess().getWBSProjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWBSProject_in_ruleWBS159);
                    this_WBSProject_1=ruleWBSProject();

                    state._fsp--;

                     
                            current = this_WBSProject_1; 
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
    // $ANTLR end "ruleWBS"


    // $ANTLR start "entryRuleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:107:1: entryRuleWBSProgram returns [EObject current=null] : iv_ruleWBSProgram= ruleWBSProgram EOF ;
    public final EObject entryRuleWBSProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSProgram = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:108:2: (iv_ruleWBSProgram= ruleWBSProgram EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:109:2: iv_ruleWBSProgram= ruleWBSProgram EOF
            {
             newCompositeNode(grammarAccess.getWBSProgramRule()); 
            pushFollow(FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram194);
            iv_ruleWBSProgram=ruleWBSProgram();

            state._fsp--;

             current =iv_ruleWBSProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProgram204); 

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
    // $ANTLR end "entryRuleWBSProgram"


    // $ANTLR start "ruleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:116:1: ruleWBSProgram returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_projects_4_0= ruleWBSProject ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) ;
    public final EObject ruleWBSProgram() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        EObject lv_projects_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:119:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_projects_4_0= ruleWBSProject ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_projects_4_0= ruleWBSProject ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_projects_4_0= ruleWBSProject ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_projects_4_0= ruleWBSProject ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:121:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:121:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:122:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSProgram246); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSProgramRule());
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleWBSProgram264); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSProgramAccess().getProgramKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:142:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:143:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:143:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:144:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSProgram281); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSProgramAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSProgram297); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:164:1: ( (lv_projects_4_0= ruleWBSProject ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ML_COMMENT||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:165:1: (lv_projects_4_0= ruleWBSProject )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:165:1: (lv_projects_4_0= ruleWBSProject )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:166:3: lv_projects_4_0= ruleWBSProject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWBSProgramAccess().getProjectsWBSProjectParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWBSProject_in_ruleWBSProgram317);
            	    lv_projects_4_0=ruleWBSProject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWBSProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"projects",
            	            		lv_projects_4_0, 
            	            		"WBSProject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProgram329); 
             
                newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleWBSProgram"


    // $ANTLR start "entryRuleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:194:1: entryRuleWBSProject returns [EObject current=null] : iv_ruleWBSProject= ruleWBSProject EOF ;
    public final EObject entryRuleWBSProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSProject = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:195:2: (iv_ruleWBSProject= ruleWBSProject EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:196:2: iv_ruleWBSProject= ruleWBSProject EOF
            {
             newCompositeNode(grammarAccess.getWBSProjectRule()); 
            pushFollow(FOLLOW_ruleWBSProject_in_entryRuleWBSProject364);
            iv_ruleWBSProject=ruleWBSProject();

            state._fsp--;

             current =iv_ruleWBSProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProject374); 

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
    // $ANTLR end "entryRuleWBSProject"


    // $ANTLR start "ruleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:203:1: ruleWBSProject returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) ;
    public final EObject ruleWBSProject() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:206:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:207:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:207:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:207:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:207:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:208:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:208:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:209:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSProject416); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSProjectRule());
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWBSProject434); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSProjectAccess().getProjectKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:229:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:230:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:230:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:231:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSProject451); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSProject467); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:251:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ML_COMMENT||(LA5_0>=16 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:252:1: (lv_wbsNodes_4_0= ruleWBSNode )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:252:1: (lv_wbsNodes_4_0= ruleWBSNode )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:253:3: lv_wbsNodes_4_0= ruleWBSNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWBSProjectAccess().getWbsNodesWBSNodeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSProject487);
            	    lv_wbsNodes_4_0=ruleWBSNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWBSProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wbsNodes",
            	            		lv_wbsNodes_4_0, 
            	            		"WBSNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProject499); 
             
                newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleWBSProject"


    // $ANTLR start "entryRuleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:281:1: entryRuleWBSNode returns [EObject current=null] : iv_ruleWBSNode= ruleWBSNode EOF ;
    public final EObject entryRuleWBSNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSNode = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:282:2: (iv_ruleWBSNode= ruleWBSNode EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:283:2: iv_ruleWBSNode= ruleWBSNode EOF
            {
             newCompositeNode(grammarAccess.getWBSNodeRule()); 
            pushFollow(FOLLOW_ruleWBSNode_in_entryRuleWBSNode534);
            iv_ruleWBSNode=ruleWBSNode();

            state._fsp--;

             current =iv_ruleWBSNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSNode544); 

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
    // $ANTLR end "entryRuleWBSNode"


    // $ANTLR start "ruleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:290:1: ruleWBSNode returns [EObject current=null] : (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable ) ;
    public final EObject ruleWBSNode() throws RecognitionException {
        EObject current = null;

        EObject this_WBSActivity_0 = null;

        EObject this_WBSWorkPackage_1 = null;

        EObject this_WBSDeliverable_2 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:293:28: ( (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:294:1: (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:294:1: (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case 18:
                    {
                    alt6=3;
                    }
                    break;
                case 16:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:295:5: this_WBSActivity_0= ruleWBSActivity
                    {
                     
                            newCompositeNode(grammarAccess.getWBSNodeAccess().getWBSActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWBSActivity_in_ruleWBSNode591);
                    this_WBSActivity_0=ruleWBSActivity();

                    state._fsp--;

                     
                            current = this_WBSActivity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:305:5: this_WBSWorkPackage_1= ruleWBSWorkPackage
                    {
                     
                            newCompositeNode(grammarAccess.getWBSNodeAccess().getWBSWorkPackageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWBSWorkPackage_in_ruleWBSNode618);
                    this_WBSWorkPackage_1=ruleWBSWorkPackage();

                    state._fsp--;

                     
                            current = this_WBSWorkPackage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:315:5: this_WBSDeliverable_2= ruleWBSDeliverable
                    {
                     
                            newCompositeNode(grammarAccess.getWBSNodeAccess().getWBSDeliverableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWBSDeliverable_in_ruleWBSNode645);
                    this_WBSDeliverable_2=ruleWBSDeliverable();

                    state._fsp--;

                     
                            current = this_WBSDeliverable_2; 
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
    // $ANTLR end "ruleWBSNode"


    // $ANTLR start "entryRuleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:331:1: entryRuleWBSActivity returns [EObject current=null] : iv_ruleWBSActivity= ruleWBSActivity EOF ;
    public final EObject entryRuleWBSActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSActivity = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:332:2: (iv_ruleWBSActivity= ruleWBSActivity EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:333:2: iv_ruleWBSActivity= ruleWBSActivity EOF
            {
             newCompositeNode(grammarAccess.getWBSActivityRule()); 
            pushFollow(FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity680);
            iv_ruleWBSActivity=ruleWBSActivity();

            state._fsp--;

             current =iv_ruleWBSActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSActivity690); 

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
    // $ANTLR end "entryRuleWBSActivity"


    // $ANTLR start "ruleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:340:1: ruleWBSActivity returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) ;
    public final EObject ruleWBSActivity() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        Token this_ENDLINE_6=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:343:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:344:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:344:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:344:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:344:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:345:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:345:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:346:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSActivity732); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSActivityRule());
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleWBSActivity750); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSActivityAccess().getActivityKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:366:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:367:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:367:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:368:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSActivity767); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:384:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OPENCURLY) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ENDLINE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:384:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:384:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:384:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSActivity785); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:388:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ML_COMMENT||(LA8_0>=16 && LA8_0<=18)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:389:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:389:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:390:3: lv_wbsNodes_4_0= ruleWBSNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWBSActivityAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSActivity805);
                    	    lv_wbsNodes_4_0=ruleWBSNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWBSActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"wbsNodes",
                    	            		lv_wbsNodes_4_0, 
                    	            		"WBSNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSActivity817); 
                     
                        newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:411:6: this_ENDLINE_6= RULE_ENDLINE
                    {
                    this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSActivity834); 
                     
                        newLeafNode(this_ENDLINE_6, grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleWBSActivity"


    // $ANTLR start "entryRuleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:423:1: entryRuleWBSWorkPackage returns [EObject current=null] : iv_ruleWBSWorkPackage= ruleWBSWorkPackage EOF ;
    public final EObject entryRuleWBSWorkPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSWorkPackage = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:424:2: (iv_ruleWBSWorkPackage= ruleWBSWorkPackage EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:425:2: iv_ruleWBSWorkPackage= ruleWBSWorkPackage EOF
            {
             newCompositeNode(grammarAccess.getWBSWorkPackageRule()); 
            pushFollow(FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage870);
            iv_ruleWBSWorkPackage=ruleWBSWorkPackage();

            state._fsp--;

             current =iv_ruleWBSWorkPackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSWorkPackage880); 

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
    // $ANTLR end "entryRuleWBSWorkPackage"


    // $ANTLR start "ruleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:432:1: ruleWBSWorkPackage returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) ;
    public final EObject ruleWBSWorkPackage() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        Token this_ENDLINE_6=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:435:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:436:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:436:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:436:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:436:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:437:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:437:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:438:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSWorkPackage922); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSWorkPackageAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSWorkPackageRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleWBSWorkPackage940); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSWorkPackageAccess().getWorkPackageKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:458:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:459:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:459:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:460:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSWorkPackage957); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSWorkPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSWorkPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:476:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OPENCURLY) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ENDLINE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:476:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:476:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:476:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSWorkPackage975); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:480:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ML_COMMENT||(LA11_0>=16 && LA11_0<=18)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:481:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:481:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:482:3: lv_wbsNodes_4_0= ruleWBSNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWBSWorkPackageAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSWorkPackage995);
                    	    lv_wbsNodes_4_0=ruleWBSNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWBSWorkPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"wbsNodes",
                    	            		lv_wbsNodes_4_0, 
                    	            		"WBSNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSWorkPackage1007); 
                     
                        newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:503:6: this_ENDLINE_6= RULE_ENDLINE
                    {
                    this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSWorkPackage1024); 
                     
                        newLeafNode(this_ENDLINE_6, grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleWBSWorkPackage"


    // $ANTLR start "entryRuleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:515:1: entryRuleWBSDeliverable returns [EObject current=null] : iv_ruleWBSDeliverable= ruleWBSDeliverable EOF ;
    public final EObject entryRuleWBSDeliverable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSDeliverable = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:516:2: (iv_ruleWBSDeliverable= ruleWBSDeliverable EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:517:2: iv_ruleWBSDeliverable= ruleWBSDeliverable EOF
            {
             newCompositeNode(grammarAccess.getWBSDeliverableRule()); 
            pushFollow(FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable1060);
            iv_ruleWBSDeliverable=ruleWBSDeliverable();

            state._fsp--;

             current =iv_ruleWBSDeliverable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSDeliverable1070); 

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
    // $ANTLR end "entryRuleWBSDeliverable"


    // $ANTLR start "ruleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:524:1: ruleWBSDeliverable returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) ;
    public final EObject ruleWBSDeliverable() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        Token this_ENDLINE_6=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:527:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:528:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:528:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:528:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:528:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ML_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:529:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:529:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:530:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSDeliverable1112); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSDeliverableAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSDeliverableRule());
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleWBSDeliverable1130); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSDeliverableAccess().getDeliverableKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:550:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:551:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:551:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:552:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSDeliverable1147); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSDeliverableAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSDeliverableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:568:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_OPENCURLY) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ENDLINE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:568:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:568:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:568:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSDeliverable1165); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:572:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ML_COMMENT||(LA14_0>=16 && LA14_0<=18)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:573:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:573:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:574:3: lv_wbsNodes_4_0= ruleWBSNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWBSDeliverableAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSDeliverable1185);
                    	    lv_wbsNodes_4_0=ruleWBSNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWBSDeliverableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"wbsNodes",
                    	            		lv_wbsNodes_4_0, 
                    	            		"WBSNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSDeliverable1197); 
                     
                        newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:595:6: this_ENDLINE_6= RULE_ENDLINE
                    {
                    this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSDeliverable1214); 
                     
                        newLeafNode(this_ENDLINE_6, grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleWBSDeliverable"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWBS_in_entryRuleWBS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_ruleWBS132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_ruleWBS159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProgram204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSProgram246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWBSProgram264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSProgram281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSProgram297 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_ruleWBSProject_in_ruleWBSProgram317 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProgram329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_entryRuleWBSProject364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProject374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSProject416 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWBSProject434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSProject451 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSProject467 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSProject487 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProject499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_entryRuleWBSNode534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSNode544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_ruleWBSNode591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_ruleWBSNode618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_ruleWBSNode645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSActivity690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSActivity732 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWBSActivity750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSActivity767 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSActivity785 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSActivity805 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSActivity817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSActivity834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSWorkPackage880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSWorkPackage922 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWBSWorkPackage940 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSWorkPackage957 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSWorkPackage975 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSWorkPackage995 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSWorkPackage1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSWorkPackage1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSDeliverable1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSDeliverable1112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWBSDeliverable1130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSDeliverable1147 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSDeliverable1165 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSDeliverable1185 = new BitSet(new long[]{0x0000000000070090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSDeliverable1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSDeliverable1214 = new BitSet(new long[]{0x0000000000000002L});

}