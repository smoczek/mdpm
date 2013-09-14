package com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWBSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program '", "'Project '", "'Activity '", "'WorkPackage '", "'Deliverable '"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CLOSEDCURLY=6;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ENDLINE=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalWBSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWBSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWBSParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g"; }


     
     	private WBSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WBSGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:60:1: entryRuleWBS : ruleWBS EOF ;
    public final void entryRuleWBS() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:61:1: ( ruleWBS EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:62:1: ruleWBS EOF
            {
             before(grammarAccess.getWBSRule()); 
            pushFollow(FOLLOW_ruleWBS_in_entryRuleWBS61);
            ruleWBS();

            state._fsp--;

             after(grammarAccess.getWBSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBS68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBS"


    // $ANTLR start "ruleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:69:1: ruleWBS : ( ( rule__WBS__Alternatives ) ) ;
    public final void ruleWBS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:73:2: ( ( ( rule__WBS__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:74:1: ( ( rule__WBS__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:74:1: ( ( rule__WBS__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:75:1: ( rule__WBS__Alternatives )
            {
             before(grammarAccess.getWBSAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:76:1: ( rule__WBS__Alternatives )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:76:2: rule__WBS__Alternatives
            {
            pushFollow(FOLLOW_rule__WBS__Alternatives_in_ruleWBS94);
            rule__WBS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWBSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBS"


    // $ANTLR start "entryRuleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:88:1: entryRuleWBSProgram : ruleWBSProgram EOF ;
    public final void entryRuleWBSProgram() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:89:1: ( ruleWBSProgram EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:90:1: ruleWBSProgram EOF
            {
             before(grammarAccess.getWBSProgramRule()); 
            pushFollow(FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram121);
            ruleWBSProgram();

            state._fsp--;

             after(grammarAccess.getWBSProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProgram128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSProgram"


    // $ANTLR start "ruleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:97:1: ruleWBSProgram : ( ( rule__WBSProgram__Group__0 ) ) ;
    public final void ruleWBSProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:101:2: ( ( ( rule__WBSProgram__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:102:1: ( ( rule__WBSProgram__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:102:1: ( ( rule__WBSProgram__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:103:1: ( rule__WBSProgram__Group__0 )
            {
             before(grammarAccess.getWBSProgramAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:104:1: ( rule__WBSProgram__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:104:2: rule__WBSProgram__Group__0
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__0_in_ruleWBSProgram154);
            rule__WBSProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSProgram"


    // $ANTLR start "entryRuleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:116:1: entryRuleWBSProject : ruleWBSProject EOF ;
    public final void entryRuleWBSProject() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:117:1: ( ruleWBSProject EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:118:1: ruleWBSProject EOF
            {
             before(grammarAccess.getWBSProjectRule()); 
            pushFollow(FOLLOW_ruleWBSProject_in_entryRuleWBSProject181);
            ruleWBSProject();

            state._fsp--;

             after(grammarAccess.getWBSProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProject188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSProject"


    // $ANTLR start "ruleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:125:1: ruleWBSProject : ( ( rule__WBSProject__Group__0 ) ) ;
    public final void ruleWBSProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:129:2: ( ( ( rule__WBSProject__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:130:1: ( ( rule__WBSProject__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:130:1: ( ( rule__WBSProject__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:131:1: ( rule__WBSProject__Group__0 )
            {
             before(grammarAccess.getWBSProjectAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:132:1: ( rule__WBSProject__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:132:2: rule__WBSProject__Group__0
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__0_in_ruleWBSProject214);
            rule__WBSProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSProject"


    // $ANTLR start "entryRuleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:144:1: entryRuleWBSNode : ruleWBSNode EOF ;
    public final void entryRuleWBSNode() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:145:1: ( ruleWBSNode EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:146:1: ruleWBSNode EOF
            {
             before(grammarAccess.getWBSNodeRule()); 
            pushFollow(FOLLOW_ruleWBSNode_in_entryRuleWBSNode241);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSNode248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSNode"


    // $ANTLR start "ruleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:153:1: ruleWBSNode : ( ( rule__WBSNode__Alternatives ) ) ;
    public final void ruleWBSNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:157:2: ( ( ( rule__WBSNode__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:158:1: ( ( rule__WBSNode__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:158:1: ( ( rule__WBSNode__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:159:1: ( rule__WBSNode__Alternatives )
            {
             before(grammarAccess.getWBSNodeAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:160:1: ( rule__WBSNode__Alternatives )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:160:2: rule__WBSNode__Alternatives
            {
            pushFollow(FOLLOW_rule__WBSNode__Alternatives_in_ruleWBSNode274);
            rule__WBSNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWBSNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSNode"


    // $ANTLR start "entryRuleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:172:1: entryRuleWBSActivity : ruleWBSActivity EOF ;
    public final void entryRuleWBSActivity() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:173:1: ( ruleWBSActivity EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:174:1: ruleWBSActivity EOF
            {
             before(grammarAccess.getWBSActivityRule()); 
            pushFollow(FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity301);
            ruleWBSActivity();

            state._fsp--;

             after(grammarAccess.getWBSActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSActivity308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSActivity"


    // $ANTLR start "ruleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:181:1: ruleWBSActivity : ( ( rule__WBSActivity__Group__0 ) ) ;
    public final void ruleWBSActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:185:2: ( ( ( rule__WBSActivity__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:186:1: ( ( rule__WBSActivity__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:186:1: ( ( rule__WBSActivity__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:187:1: ( rule__WBSActivity__Group__0 )
            {
             before(grammarAccess.getWBSActivityAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:188:1: ( rule__WBSActivity__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:188:2: rule__WBSActivity__Group__0
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__0_in_ruleWBSActivity334);
            rule__WBSActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSActivity"


    // $ANTLR start "entryRuleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:200:1: entryRuleWBSWorkPackage : ruleWBSWorkPackage EOF ;
    public final void entryRuleWBSWorkPackage() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:201:1: ( ruleWBSWorkPackage EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:202:1: ruleWBSWorkPackage EOF
            {
             before(grammarAccess.getWBSWorkPackageRule()); 
            pushFollow(FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage361);
            ruleWBSWorkPackage();

            state._fsp--;

             after(grammarAccess.getWBSWorkPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSWorkPackage368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSWorkPackage"


    // $ANTLR start "ruleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:209:1: ruleWBSWorkPackage : ( ( rule__WBSWorkPackage__Group__0 ) ) ;
    public final void ruleWBSWorkPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:213:2: ( ( ( rule__WBSWorkPackage__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:214:1: ( ( rule__WBSWorkPackage__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:214:1: ( ( rule__WBSWorkPackage__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:215:1: ( rule__WBSWorkPackage__Group__0 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:216:1: ( rule__WBSWorkPackage__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:216:2: rule__WBSWorkPackage__Group__0
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__0_in_ruleWBSWorkPackage394);
            rule__WBSWorkPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSWorkPackage"


    // $ANTLR start "entryRuleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:228:1: entryRuleWBSDeliverable : ruleWBSDeliverable EOF ;
    public final void entryRuleWBSDeliverable() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:229:1: ( ruleWBSDeliverable EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:230:1: ruleWBSDeliverable EOF
            {
             before(grammarAccess.getWBSDeliverableRule()); 
            pushFollow(FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable421);
            ruleWBSDeliverable();

            state._fsp--;

             after(grammarAccess.getWBSDeliverableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSDeliverable428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSDeliverable"


    // $ANTLR start "ruleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:237:1: ruleWBSDeliverable : ( ( rule__WBSDeliverable__Group__0 ) ) ;
    public final void ruleWBSDeliverable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:241:2: ( ( ( rule__WBSDeliverable__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:242:1: ( ( rule__WBSDeliverable__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:242:1: ( ( rule__WBSDeliverable__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:243:1: ( rule__WBSDeliverable__Group__0 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:244:1: ( rule__WBSDeliverable__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:244:2: rule__WBSDeliverable__Group__0
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__0_in_ruleWBSDeliverable454);
            rule__WBSDeliverable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSDeliverable"


    // $ANTLR start "rule__WBS__Alternatives"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:256:1: rule__WBS__Alternatives : ( ( ruleWBSProgram ) | ( ruleWBSProject ) );
    public final void rule__WBS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:260:1: ( ( ruleWBSProgram ) | ( ruleWBSProject ) )
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
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:261:1: ( ruleWBSProgram )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:261:1: ( ruleWBSProgram )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:262:1: ruleWBSProgram
                    {
                     before(grammarAccess.getWBSAccess().getWBSProgramParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWBSProgram_in_rule__WBS__Alternatives490);
                    ruleWBSProgram();

                    state._fsp--;

                     after(grammarAccess.getWBSAccess().getWBSProgramParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:267:6: ( ruleWBSProject )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:267:6: ( ruleWBSProject )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:268:1: ruleWBSProject
                    {
                     before(grammarAccess.getWBSAccess().getWBSProjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWBSProject_in_rule__WBS__Alternatives507);
                    ruleWBSProject();

                    state._fsp--;

                     after(grammarAccess.getWBSAccess().getWBSProjectParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBS__Alternatives"


    // $ANTLR start "rule__WBSNode__Alternatives"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:278:1: rule__WBSNode__Alternatives : ( ( ruleWBSActivity ) | ( ruleWBSWorkPackage ) | ( ruleWBSDeliverable ) );
    public final void rule__WBSNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:282:1: ( ( ruleWBSActivity ) | ( ruleWBSWorkPackage ) | ( ruleWBSDeliverable ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt2=3;
                    }
                    break;
                case 17:
                    {
                    alt2=2;
                    }
                    break;
                case 16:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:283:1: ( ruleWBSActivity )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:283:1: ( ruleWBSActivity )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:284:1: ruleWBSActivity
                    {
                     before(grammarAccess.getWBSNodeAccess().getWBSActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWBSActivity_in_rule__WBSNode__Alternatives539);
                    ruleWBSActivity();

                    state._fsp--;

                     after(grammarAccess.getWBSNodeAccess().getWBSActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:289:6: ( ruleWBSWorkPackage )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:289:6: ( ruleWBSWorkPackage )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:290:1: ruleWBSWorkPackage
                    {
                     before(grammarAccess.getWBSNodeAccess().getWBSWorkPackageParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWBSWorkPackage_in_rule__WBSNode__Alternatives556);
                    ruleWBSWorkPackage();

                    state._fsp--;

                     after(grammarAccess.getWBSNodeAccess().getWBSWorkPackageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:295:6: ( ruleWBSDeliverable )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:295:6: ( ruleWBSDeliverable )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:296:1: ruleWBSDeliverable
                    {
                     before(grammarAccess.getWBSNodeAccess().getWBSDeliverableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleWBSDeliverable_in_rule__WBSNode__Alternatives573);
                    ruleWBSDeliverable();

                    state._fsp--;

                     after(grammarAccess.getWBSNodeAccess().getWBSDeliverableParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSNode__Alternatives"


    // $ANTLR start "rule__WBSActivity__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:306:1: rule__WBSActivity__Alternatives_3 : ( ( ( rule__WBSActivity__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__WBSActivity__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:310:1: ( ( ( rule__WBSActivity__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_OPENCURLY) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ENDLINE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:311:1: ( ( rule__WBSActivity__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:311:1: ( ( rule__WBSActivity__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:312:1: ( rule__WBSActivity__Group_3_0__0 )
                    {
                     before(grammarAccess.getWBSActivityAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:313:1: ( rule__WBSActivity__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:313:2: rule__WBSActivity__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__0_in_rule__WBSActivity__Alternatives_3605);
                    rule__WBSActivity__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWBSActivityAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:317:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:317:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:318:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSActivity__Alternatives_3623); 
                     after(grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Alternatives_3"


    // $ANTLR start "rule__WBSWorkPackage__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:328:1: rule__WBSWorkPackage__Alternatives_3 : ( ( ( rule__WBSWorkPackage__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__WBSWorkPackage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:332:1: ( ( ( rule__WBSWorkPackage__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_OPENCURLY) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ENDLINE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:333:1: ( ( rule__WBSWorkPackage__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:333:1: ( ( rule__WBSWorkPackage__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:334:1: ( rule__WBSWorkPackage__Group_3_0__0 )
                    {
                     before(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:335:1: ( rule__WBSWorkPackage__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:335:2: rule__WBSWorkPackage__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__0_in_rule__WBSWorkPackage__Alternatives_3655);
                    rule__WBSWorkPackage__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:339:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:339:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:340:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSWorkPackage__Alternatives_3673); 
                     after(grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Alternatives_3"


    // $ANTLR start "rule__WBSDeliverable__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:350:1: rule__WBSDeliverable__Alternatives_3 : ( ( ( rule__WBSDeliverable__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__WBSDeliverable__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:354:1: ( ( ( rule__WBSDeliverable__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_OPENCURLY) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ENDLINE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:355:1: ( ( rule__WBSDeliverable__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:355:1: ( ( rule__WBSDeliverable__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:356:1: ( rule__WBSDeliverable__Group_3_0__0 )
                    {
                     before(grammarAccess.getWBSDeliverableAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:357:1: ( rule__WBSDeliverable__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:357:2: rule__WBSDeliverable__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__0_in_rule__WBSDeliverable__Alternatives_3705);
                    rule__WBSDeliverable__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWBSDeliverableAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:361:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:361:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:362:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSDeliverable__Alternatives_3723); 
                     after(grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Alternatives_3"


    // $ANTLR start "rule__WBSProgram__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:374:1: rule__WBSProgram__Group__0 : rule__WBSProgram__Group__0__Impl rule__WBSProgram__Group__1 ;
    public final void rule__WBSProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:378:1: ( rule__WBSProgram__Group__0__Impl rule__WBSProgram__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:379:2: rule__WBSProgram__Group__0__Impl rule__WBSProgram__Group__1
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__0__Impl_in_rule__WBSProgram__Group__0753);
            rule__WBSProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__1_in_rule__WBSProgram__Group__0756);
            rule__WBSProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__0"


    // $ANTLR start "rule__WBSProgram__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:386:1: rule__WBSProgram__Group__0__Impl : ( ( rule__WBSProgram__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:390:1: ( ( ( rule__WBSProgram__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:391:1: ( ( rule__WBSProgram__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:391:1: ( ( rule__WBSProgram__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:392:1: ( rule__WBSProgram__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSProgramAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:393:1: ( rule__WBSProgram__DescriptionAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ML_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:393:2: rule__WBSProgram__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSProgram__DescriptionAssignment_0_in_rule__WBSProgram__Group__0__Impl783);
                    rule__WBSProgram__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProgramAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__0__Impl"


    // $ANTLR start "rule__WBSProgram__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:403:1: rule__WBSProgram__Group__1 : rule__WBSProgram__Group__1__Impl rule__WBSProgram__Group__2 ;
    public final void rule__WBSProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:407:1: ( rule__WBSProgram__Group__1__Impl rule__WBSProgram__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:408:2: rule__WBSProgram__Group__1__Impl rule__WBSProgram__Group__2
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__1__Impl_in_rule__WBSProgram__Group__1814);
            rule__WBSProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__2_in_rule__WBSProgram__Group__1817);
            rule__WBSProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__1"


    // $ANTLR start "rule__WBSProgram__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:415:1: rule__WBSProgram__Group__1__Impl : ( 'Program ' ) ;
    public final void rule__WBSProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:419:1: ( ( 'Program ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:420:1: ( 'Program ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:420:1: ( 'Program ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:421:1: 'Program '
            {
             before(grammarAccess.getWBSProgramAccess().getProgramKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__WBSProgram__Group__1__Impl845); 
             after(grammarAccess.getWBSProgramAccess().getProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__1__Impl"


    // $ANTLR start "rule__WBSProgram__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:434:1: rule__WBSProgram__Group__2 : rule__WBSProgram__Group__2__Impl rule__WBSProgram__Group__3 ;
    public final void rule__WBSProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:438:1: ( rule__WBSProgram__Group__2__Impl rule__WBSProgram__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:439:2: rule__WBSProgram__Group__2__Impl rule__WBSProgram__Group__3
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__2__Impl_in_rule__WBSProgram__Group__2876);
            rule__WBSProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__3_in_rule__WBSProgram__Group__2879);
            rule__WBSProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__2"


    // $ANTLR start "rule__WBSProgram__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:446:1: rule__WBSProgram__Group__2__Impl : ( ( rule__WBSProgram__NameAssignment_2 ) ) ;
    public final void rule__WBSProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:450:1: ( ( ( rule__WBSProgram__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:451:1: ( ( rule__WBSProgram__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:451:1: ( ( rule__WBSProgram__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:452:1: ( rule__WBSProgram__NameAssignment_2 )
            {
             before(grammarAccess.getWBSProgramAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:453:1: ( rule__WBSProgram__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:453:2: rule__WBSProgram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSProgram__NameAssignment_2_in_rule__WBSProgram__Group__2__Impl906);
            rule__WBSProgram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSProgramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__2__Impl"


    // $ANTLR start "rule__WBSProgram__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:463:1: rule__WBSProgram__Group__3 : rule__WBSProgram__Group__3__Impl rule__WBSProgram__Group__4 ;
    public final void rule__WBSProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:467:1: ( rule__WBSProgram__Group__3__Impl rule__WBSProgram__Group__4 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:468:2: rule__WBSProgram__Group__3__Impl rule__WBSProgram__Group__4
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__3__Impl_in_rule__WBSProgram__Group__3936);
            rule__WBSProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__4_in_rule__WBSProgram__Group__3939);
            rule__WBSProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__3"


    // $ANTLR start "rule__WBSProgram__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:475:1: rule__WBSProgram__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:479:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:480:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:480:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:481:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSProgram__Group__3__Impl966); 
             after(grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__3__Impl"


    // $ANTLR start "rule__WBSProgram__Group__4"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:492:1: rule__WBSProgram__Group__4 : rule__WBSProgram__Group__4__Impl rule__WBSProgram__Group__5 ;
    public final void rule__WBSProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:496:1: ( rule__WBSProgram__Group__4__Impl rule__WBSProgram__Group__5 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:497:2: rule__WBSProgram__Group__4__Impl rule__WBSProgram__Group__5
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__4__Impl_in_rule__WBSProgram__Group__4995);
            rule__WBSProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__5_in_rule__WBSProgram__Group__4998);
            rule__WBSProgram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__4"


    // $ANTLR start "rule__WBSProgram__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:504:1: rule__WBSProgram__Group__4__Impl : ( ( rule__WBSProgram__ProjectsAssignment_4 )* ) ;
    public final void rule__WBSProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:508:1: ( ( ( rule__WBSProgram__ProjectsAssignment_4 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:509:1: ( ( rule__WBSProgram__ProjectsAssignment_4 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:509:1: ( ( rule__WBSProgram__ProjectsAssignment_4 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:510:1: ( rule__WBSProgram__ProjectsAssignment_4 )*
            {
             before(grammarAccess.getWBSProgramAccess().getProjectsAssignment_4()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:511:1: ( rule__WBSProgram__ProjectsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ML_COMMENT||LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:511:2: rule__WBSProgram__ProjectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__WBSProgram__ProjectsAssignment_4_in_rule__WBSProgram__Group__4__Impl1025);
            	    rule__WBSProgram__ProjectsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWBSProgramAccess().getProjectsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__4__Impl"


    // $ANTLR start "rule__WBSProgram__Group__5"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:521:1: rule__WBSProgram__Group__5 : rule__WBSProgram__Group__5__Impl ;
    public final void rule__WBSProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:525:1: ( rule__WBSProgram__Group__5__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:526:2: rule__WBSProgram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__5__Impl_in_rule__WBSProgram__Group__51056);
            rule__WBSProgram__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__5"


    // $ANTLR start "rule__WBSProgram__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:532:1: rule__WBSProgram__Group__5__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:536:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:537:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:537:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:538:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProgram__Group__5__Impl1083); 
             after(grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__5__Impl"


    // $ANTLR start "rule__WBSProject__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:561:1: rule__WBSProject__Group__0 : rule__WBSProject__Group__0__Impl rule__WBSProject__Group__1 ;
    public final void rule__WBSProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:565:1: ( rule__WBSProject__Group__0__Impl rule__WBSProject__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:566:2: rule__WBSProject__Group__0__Impl rule__WBSProject__Group__1
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__0__Impl_in_rule__WBSProject__Group__01124);
            rule__WBSProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__1_in_rule__WBSProject__Group__01127);
            rule__WBSProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__0"


    // $ANTLR start "rule__WBSProject__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:573:1: rule__WBSProject__Group__0__Impl : ( ( rule__WBSProject__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:577:1: ( ( ( rule__WBSProject__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:578:1: ( ( rule__WBSProject__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:578:1: ( ( rule__WBSProject__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:579:1: ( rule__WBSProject__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSProjectAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:580:1: ( rule__WBSProject__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ML_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:580:2: rule__WBSProject__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSProject__DescriptionAssignment_0_in_rule__WBSProject__Group__0__Impl1154);
                    rule__WBSProject__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProjectAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__0__Impl"


    // $ANTLR start "rule__WBSProject__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:590:1: rule__WBSProject__Group__1 : rule__WBSProject__Group__1__Impl rule__WBSProject__Group__2 ;
    public final void rule__WBSProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:594:1: ( rule__WBSProject__Group__1__Impl rule__WBSProject__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:595:2: rule__WBSProject__Group__1__Impl rule__WBSProject__Group__2
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__1__Impl_in_rule__WBSProject__Group__11185);
            rule__WBSProject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__2_in_rule__WBSProject__Group__11188);
            rule__WBSProject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__1"


    // $ANTLR start "rule__WBSProject__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:602:1: rule__WBSProject__Group__1__Impl : ( 'Project ' ) ;
    public final void rule__WBSProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:606:1: ( ( 'Project ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:607:1: ( 'Project ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:607:1: ( 'Project ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:608:1: 'Project '
            {
             before(grammarAccess.getWBSProjectAccess().getProjectKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__WBSProject__Group__1__Impl1216); 
             after(grammarAccess.getWBSProjectAccess().getProjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__1__Impl"


    // $ANTLR start "rule__WBSProject__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:621:1: rule__WBSProject__Group__2 : rule__WBSProject__Group__2__Impl rule__WBSProject__Group__3 ;
    public final void rule__WBSProject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:625:1: ( rule__WBSProject__Group__2__Impl rule__WBSProject__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:626:2: rule__WBSProject__Group__2__Impl rule__WBSProject__Group__3
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__2__Impl_in_rule__WBSProject__Group__21247);
            rule__WBSProject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__3_in_rule__WBSProject__Group__21250);
            rule__WBSProject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__2"


    // $ANTLR start "rule__WBSProject__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:633:1: rule__WBSProject__Group__2__Impl : ( ( rule__WBSProject__NameAssignment_2 ) ) ;
    public final void rule__WBSProject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:637:1: ( ( ( rule__WBSProject__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:638:1: ( ( rule__WBSProject__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:638:1: ( ( rule__WBSProject__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:639:1: ( rule__WBSProject__NameAssignment_2 )
            {
             before(grammarAccess.getWBSProjectAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:640:1: ( rule__WBSProject__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:640:2: rule__WBSProject__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSProject__NameAssignment_2_in_rule__WBSProject__Group__2__Impl1277);
            rule__WBSProject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSProjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__2__Impl"


    // $ANTLR start "rule__WBSProject__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:650:1: rule__WBSProject__Group__3 : rule__WBSProject__Group__3__Impl rule__WBSProject__Group__4 ;
    public final void rule__WBSProject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:654:1: ( rule__WBSProject__Group__3__Impl rule__WBSProject__Group__4 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:655:2: rule__WBSProject__Group__3__Impl rule__WBSProject__Group__4
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__3__Impl_in_rule__WBSProject__Group__31307);
            rule__WBSProject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__4_in_rule__WBSProject__Group__31310);
            rule__WBSProject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__3"


    // $ANTLR start "rule__WBSProject__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:662:1: rule__WBSProject__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSProject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:666:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:667:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:667:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:668:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSProject__Group__3__Impl1337); 
             after(grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__3__Impl"


    // $ANTLR start "rule__WBSProject__Group__4"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:679:1: rule__WBSProject__Group__4 : rule__WBSProject__Group__4__Impl rule__WBSProject__Group__5 ;
    public final void rule__WBSProject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:683:1: ( rule__WBSProject__Group__4__Impl rule__WBSProject__Group__5 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:684:2: rule__WBSProject__Group__4__Impl rule__WBSProject__Group__5
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__4__Impl_in_rule__WBSProject__Group__41366);
            rule__WBSProject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__5_in_rule__WBSProject__Group__41369);
            rule__WBSProject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__4"


    // $ANTLR start "rule__WBSProject__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:691:1: rule__WBSProject__Group__4__Impl : ( ( rule__WBSProject__WbsNodesAssignment_4 )* ) ;
    public final void rule__WBSProject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:695:1: ( ( ( rule__WBSProject__WbsNodesAssignment_4 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:696:1: ( ( rule__WBSProject__WbsNodesAssignment_4 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:696:1: ( ( rule__WBSProject__WbsNodesAssignment_4 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:697:1: ( rule__WBSProject__WbsNodesAssignment_4 )*
            {
             before(grammarAccess.getWBSProjectAccess().getWbsNodesAssignment_4()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:698:1: ( rule__WBSProject__WbsNodesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ML_COMMENT||(LA9_0>=16 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:698:2: rule__WBSProject__WbsNodesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__WBSProject__WbsNodesAssignment_4_in_rule__WBSProject__Group__4__Impl1396);
            	    rule__WBSProject__WbsNodesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWBSProjectAccess().getWbsNodesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__4__Impl"


    // $ANTLR start "rule__WBSProject__Group__5"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:708:1: rule__WBSProject__Group__5 : rule__WBSProject__Group__5__Impl ;
    public final void rule__WBSProject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:712:1: ( rule__WBSProject__Group__5__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:713:2: rule__WBSProject__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__5__Impl_in_rule__WBSProject__Group__51427);
            rule__WBSProject__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__5"


    // $ANTLR start "rule__WBSProject__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:719:1: rule__WBSProject__Group__5__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSProject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:723:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:724:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:724:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:725:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProject__Group__5__Impl1454); 
             after(grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__5__Impl"


    // $ANTLR start "rule__WBSActivity__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:748:1: rule__WBSActivity__Group__0 : rule__WBSActivity__Group__0__Impl rule__WBSActivity__Group__1 ;
    public final void rule__WBSActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:752:1: ( rule__WBSActivity__Group__0__Impl rule__WBSActivity__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:753:2: rule__WBSActivity__Group__0__Impl rule__WBSActivity__Group__1
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__0__Impl_in_rule__WBSActivity__Group__01495);
            rule__WBSActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group__1_in_rule__WBSActivity__Group__01498);
            rule__WBSActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__0"


    // $ANTLR start "rule__WBSActivity__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:760:1: rule__WBSActivity__Group__0__Impl : ( ( rule__WBSActivity__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:764:1: ( ( ( rule__WBSActivity__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:765:1: ( ( rule__WBSActivity__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:765:1: ( ( rule__WBSActivity__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:766:1: ( rule__WBSActivity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSActivityAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:767:1: ( rule__WBSActivity__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:767:2: rule__WBSActivity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSActivity__DescriptionAssignment_0_in_rule__WBSActivity__Group__0__Impl1525);
                    rule__WBSActivity__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSActivityAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__0__Impl"


    // $ANTLR start "rule__WBSActivity__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:777:1: rule__WBSActivity__Group__1 : rule__WBSActivity__Group__1__Impl rule__WBSActivity__Group__2 ;
    public final void rule__WBSActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:781:1: ( rule__WBSActivity__Group__1__Impl rule__WBSActivity__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:782:2: rule__WBSActivity__Group__1__Impl rule__WBSActivity__Group__2
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__1__Impl_in_rule__WBSActivity__Group__11556);
            rule__WBSActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group__2_in_rule__WBSActivity__Group__11559);
            rule__WBSActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__1"


    // $ANTLR start "rule__WBSActivity__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:789:1: rule__WBSActivity__Group__1__Impl : ( 'Activity ' ) ;
    public final void rule__WBSActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:793:1: ( ( 'Activity ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:794:1: ( 'Activity ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:794:1: ( 'Activity ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:795:1: 'Activity '
            {
             before(grammarAccess.getWBSActivityAccess().getActivityKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__WBSActivity__Group__1__Impl1587); 
             after(grammarAccess.getWBSActivityAccess().getActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__1__Impl"


    // $ANTLR start "rule__WBSActivity__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:808:1: rule__WBSActivity__Group__2 : rule__WBSActivity__Group__2__Impl rule__WBSActivity__Group__3 ;
    public final void rule__WBSActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:812:1: ( rule__WBSActivity__Group__2__Impl rule__WBSActivity__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:813:2: rule__WBSActivity__Group__2__Impl rule__WBSActivity__Group__3
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__2__Impl_in_rule__WBSActivity__Group__21618);
            rule__WBSActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group__3_in_rule__WBSActivity__Group__21621);
            rule__WBSActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__2"


    // $ANTLR start "rule__WBSActivity__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:820:1: rule__WBSActivity__Group__2__Impl : ( ( rule__WBSActivity__NameAssignment_2 ) ) ;
    public final void rule__WBSActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:824:1: ( ( ( rule__WBSActivity__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:825:1: ( ( rule__WBSActivity__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:825:1: ( ( rule__WBSActivity__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:826:1: ( rule__WBSActivity__NameAssignment_2 )
            {
             before(grammarAccess.getWBSActivityAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:827:1: ( rule__WBSActivity__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:827:2: rule__WBSActivity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSActivity__NameAssignment_2_in_rule__WBSActivity__Group__2__Impl1648);
            rule__WBSActivity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__2__Impl"


    // $ANTLR start "rule__WBSActivity__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:837:1: rule__WBSActivity__Group__3 : rule__WBSActivity__Group__3__Impl ;
    public final void rule__WBSActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:841:1: ( rule__WBSActivity__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:842:2: rule__WBSActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__3__Impl_in_rule__WBSActivity__Group__31678);
            rule__WBSActivity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__3"


    // $ANTLR start "rule__WBSActivity__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:848:1: rule__WBSActivity__Group__3__Impl : ( ( rule__WBSActivity__Alternatives_3 ) ) ;
    public final void rule__WBSActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:852:1: ( ( ( rule__WBSActivity__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:853:1: ( ( rule__WBSActivity__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:853:1: ( ( rule__WBSActivity__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:854:1: ( rule__WBSActivity__Alternatives_3 )
            {
             before(grammarAccess.getWBSActivityAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:855:1: ( rule__WBSActivity__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:855:2: rule__WBSActivity__Alternatives_3
            {
            pushFollow(FOLLOW_rule__WBSActivity__Alternatives_3_in_rule__WBSActivity__Group__3__Impl1705);
            rule__WBSActivity__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__3__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:873:1: rule__WBSActivity__Group_3_0__0 : rule__WBSActivity__Group_3_0__0__Impl rule__WBSActivity__Group_3_0__1 ;
    public final void rule__WBSActivity__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:877:1: ( rule__WBSActivity__Group_3_0__0__Impl rule__WBSActivity__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:878:2: rule__WBSActivity__Group_3_0__0__Impl rule__WBSActivity__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__0__Impl_in_rule__WBSActivity__Group_3_0__01743);
            rule__WBSActivity__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__1_in_rule__WBSActivity__Group_3_0__01746);
            rule__WBSActivity__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__0"


    // $ANTLR start "rule__WBSActivity__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:885:1: rule__WBSActivity__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSActivity__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:889:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:890:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:890:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:891:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSActivity__Group_3_0__0__Impl1773); 
             after(grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__0__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:902:1: rule__WBSActivity__Group_3_0__1 : rule__WBSActivity__Group_3_0__1__Impl rule__WBSActivity__Group_3_0__2 ;
    public final void rule__WBSActivity__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:906:1: ( rule__WBSActivity__Group_3_0__1__Impl rule__WBSActivity__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:907:2: rule__WBSActivity__Group_3_0__1__Impl rule__WBSActivity__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__1__Impl_in_rule__WBSActivity__Group_3_0__11802);
            rule__WBSActivity__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__2_in_rule__WBSActivity__Group_3_0__11805);
            rule__WBSActivity__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__1"


    // $ANTLR start "rule__WBSActivity__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:914:1: rule__WBSActivity__Group_3_0__1__Impl : ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* ) ;
    public final void rule__WBSActivity__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:918:1: ( ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:919:1: ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:919:1: ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:920:1: ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )*
            {
             before(grammarAccess.getWBSActivityAccess().getWbsNodesAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:921:1: ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||(LA11_0>=16 && LA11_0<=18)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:921:2: rule__WBSActivity__WbsNodesAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WBSActivity__WbsNodesAssignment_3_0_1_in_rule__WBSActivity__Group_3_0__1__Impl1832);
            	    rule__WBSActivity__WbsNodesAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWBSActivityAccess().getWbsNodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__1__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:931:1: rule__WBSActivity__Group_3_0__2 : rule__WBSActivity__Group_3_0__2__Impl ;
    public final void rule__WBSActivity__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:935:1: ( rule__WBSActivity__Group_3_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:936:2: rule__WBSActivity__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__2__Impl_in_rule__WBSActivity__Group_3_0__21863);
            rule__WBSActivity__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__2"


    // $ANTLR start "rule__WBSActivity__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:942:1: rule__WBSActivity__Group_3_0__2__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSActivity__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:946:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:947:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:947:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:948:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSActivity__Group_3_0__2__Impl1890); 
             after(grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__2__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:965:1: rule__WBSWorkPackage__Group__0 : rule__WBSWorkPackage__Group__0__Impl rule__WBSWorkPackage__Group__1 ;
    public final void rule__WBSWorkPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:969:1: ( rule__WBSWorkPackage__Group__0__Impl rule__WBSWorkPackage__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:970:2: rule__WBSWorkPackage__Group__0__Impl rule__WBSWorkPackage__Group__1
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__0__Impl_in_rule__WBSWorkPackage__Group__01925);
            rule__WBSWorkPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__1_in_rule__WBSWorkPackage__Group__01928);
            rule__WBSWorkPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__0"


    // $ANTLR start "rule__WBSWorkPackage__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:977:1: rule__WBSWorkPackage__Group__0__Impl : ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSWorkPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:981:1: ( ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:982:1: ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:982:1: ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:983:1: ( rule__WBSWorkPackage__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSWorkPackageAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:984:1: ( rule__WBSWorkPackage__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ML_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:984:2: rule__WBSWorkPackage__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSWorkPackage__DescriptionAssignment_0_in_rule__WBSWorkPackage__Group__0__Impl1955);
                    rule__WBSWorkPackage__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSWorkPackageAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__0__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:994:1: rule__WBSWorkPackage__Group__1 : rule__WBSWorkPackage__Group__1__Impl rule__WBSWorkPackage__Group__2 ;
    public final void rule__WBSWorkPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:998:1: ( rule__WBSWorkPackage__Group__1__Impl rule__WBSWorkPackage__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:999:2: rule__WBSWorkPackage__Group__1__Impl rule__WBSWorkPackage__Group__2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__1__Impl_in_rule__WBSWorkPackage__Group__11986);
            rule__WBSWorkPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__2_in_rule__WBSWorkPackage__Group__11989);
            rule__WBSWorkPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__1"


    // $ANTLR start "rule__WBSWorkPackage__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1006:1: rule__WBSWorkPackage__Group__1__Impl : ( 'WorkPackage ' ) ;
    public final void rule__WBSWorkPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1010:1: ( ( 'WorkPackage ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1011:1: ( 'WorkPackage ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1011:1: ( 'WorkPackage ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1012:1: 'WorkPackage '
            {
             before(grammarAccess.getWBSWorkPackageAccess().getWorkPackageKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__WBSWorkPackage__Group__1__Impl2017); 
             after(grammarAccess.getWBSWorkPackageAccess().getWorkPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__1__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1025:1: rule__WBSWorkPackage__Group__2 : rule__WBSWorkPackage__Group__2__Impl rule__WBSWorkPackage__Group__3 ;
    public final void rule__WBSWorkPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1029:1: ( rule__WBSWorkPackage__Group__2__Impl rule__WBSWorkPackage__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1030:2: rule__WBSWorkPackage__Group__2__Impl rule__WBSWorkPackage__Group__3
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__2__Impl_in_rule__WBSWorkPackage__Group__22048);
            rule__WBSWorkPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__3_in_rule__WBSWorkPackage__Group__22051);
            rule__WBSWorkPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__2"


    // $ANTLR start "rule__WBSWorkPackage__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1037:1: rule__WBSWorkPackage__Group__2__Impl : ( ( rule__WBSWorkPackage__NameAssignment_2 ) ) ;
    public final void rule__WBSWorkPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1041:1: ( ( ( rule__WBSWorkPackage__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1042:1: ( ( rule__WBSWorkPackage__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1042:1: ( ( rule__WBSWorkPackage__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1043:1: ( rule__WBSWorkPackage__NameAssignment_2 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1044:1: ( rule__WBSWorkPackage__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1044:2: rule__WBSWorkPackage__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__NameAssignment_2_in_rule__WBSWorkPackage__Group__2__Impl2078);
            rule__WBSWorkPackage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__2__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1054:1: rule__WBSWorkPackage__Group__3 : rule__WBSWorkPackage__Group__3__Impl ;
    public final void rule__WBSWorkPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1058:1: ( rule__WBSWorkPackage__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1059:2: rule__WBSWorkPackage__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__3__Impl_in_rule__WBSWorkPackage__Group__32108);
            rule__WBSWorkPackage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__3"


    // $ANTLR start "rule__WBSWorkPackage__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1065:1: rule__WBSWorkPackage__Group__3__Impl : ( ( rule__WBSWorkPackage__Alternatives_3 ) ) ;
    public final void rule__WBSWorkPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1069:1: ( ( ( rule__WBSWorkPackage__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1070:1: ( ( rule__WBSWorkPackage__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1070:1: ( ( rule__WBSWorkPackage__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1071:1: ( rule__WBSWorkPackage__Alternatives_3 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1072:1: ( rule__WBSWorkPackage__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1072:2: rule__WBSWorkPackage__Alternatives_3
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Alternatives_3_in_rule__WBSWorkPackage__Group__3__Impl2135);
            rule__WBSWorkPackage__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__3__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1090:1: rule__WBSWorkPackage__Group_3_0__0 : rule__WBSWorkPackage__Group_3_0__0__Impl rule__WBSWorkPackage__Group_3_0__1 ;
    public final void rule__WBSWorkPackage__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1094:1: ( rule__WBSWorkPackage__Group_3_0__0__Impl rule__WBSWorkPackage__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1095:2: rule__WBSWorkPackage__Group_3_0__0__Impl rule__WBSWorkPackage__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__0__Impl_in_rule__WBSWorkPackage__Group_3_0__02173);
            rule__WBSWorkPackage__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__1_in_rule__WBSWorkPackage__Group_3_0__02176);
            rule__WBSWorkPackage__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__0"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1102:1: rule__WBSWorkPackage__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSWorkPackage__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1106:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1107:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1107:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1108:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSWorkPackage__Group_3_0__0__Impl2203); 
             after(grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__0__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1119:1: rule__WBSWorkPackage__Group_3_0__1 : rule__WBSWorkPackage__Group_3_0__1__Impl rule__WBSWorkPackage__Group_3_0__2 ;
    public final void rule__WBSWorkPackage__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1123:1: ( rule__WBSWorkPackage__Group_3_0__1__Impl rule__WBSWorkPackage__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1124:2: rule__WBSWorkPackage__Group_3_0__1__Impl rule__WBSWorkPackage__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__1__Impl_in_rule__WBSWorkPackage__Group_3_0__12232);
            rule__WBSWorkPackage__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__2_in_rule__WBSWorkPackage__Group_3_0__12235);
            rule__WBSWorkPackage__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__1"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1131:1: rule__WBSWorkPackage__Group_3_0__1__Impl : ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* ) ;
    public final void rule__WBSWorkPackage__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1135:1: ( ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1136:1: ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1136:1: ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1137:1: ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )*
            {
             before(grammarAccess.getWBSWorkPackageAccess().getWbsNodesAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1138:1: ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ML_COMMENT||(LA13_0>=16 && LA13_0<=18)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1138:2: rule__WBSWorkPackage__WbsNodesAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WBSWorkPackage__WbsNodesAssignment_3_0_1_in_rule__WBSWorkPackage__Group_3_0__1__Impl2262);
            	    rule__WBSWorkPackage__WbsNodesAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWBSWorkPackageAccess().getWbsNodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__1__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1148:1: rule__WBSWorkPackage__Group_3_0__2 : rule__WBSWorkPackage__Group_3_0__2__Impl ;
    public final void rule__WBSWorkPackage__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1152:1: ( rule__WBSWorkPackage__Group_3_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1153:2: rule__WBSWorkPackage__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__2__Impl_in_rule__WBSWorkPackage__Group_3_0__22293);
            rule__WBSWorkPackage__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__2"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1159:1: rule__WBSWorkPackage__Group_3_0__2__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSWorkPackage__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1163:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1164:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1164:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1165:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSWorkPackage__Group_3_0__2__Impl2320); 
             after(grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__2__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1182:1: rule__WBSDeliverable__Group__0 : rule__WBSDeliverable__Group__0__Impl rule__WBSDeliverable__Group__1 ;
    public final void rule__WBSDeliverable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1186:1: ( rule__WBSDeliverable__Group__0__Impl rule__WBSDeliverable__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1187:2: rule__WBSDeliverable__Group__0__Impl rule__WBSDeliverable__Group__1
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__0__Impl_in_rule__WBSDeliverable__Group__02355);
            rule__WBSDeliverable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group__1_in_rule__WBSDeliverable__Group__02358);
            rule__WBSDeliverable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__0"


    // $ANTLR start "rule__WBSDeliverable__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1194:1: rule__WBSDeliverable__Group__0__Impl : ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSDeliverable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1198:1: ( ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1199:1: ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1199:1: ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1200:1: ( rule__WBSDeliverable__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSDeliverableAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1201:1: ( rule__WBSDeliverable__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ML_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1201:2: rule__WBSDeliverable__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSDeliverable__DescriptionAssignment_0_in_rule__WBSDeliverable__Group__0__Impl2385);
                    rule__WBSDeliverable__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSDeliverableAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__0__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1211:1: rule__WBSDeliverable__Group__1 : rule__WBSDeliverable__Group__1__Impl rule__WBSDeliverable__Group__2 ;
    public final void rule__WBSDeliverable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1215:1: ( rule__WBSDeliverable__Group__1__Impl rule__WBSDeliverable__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1216:2: rule__WBSDeliverable__Group__1__Impl rule__WBSDeliverable__Group__2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__1__Impl_in_rule__WBSDeliverable__Group__12416);
            rule__WBSDeliverable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group__2_in_rule__WBSDeliverable__Group__12419);
            rule__WBSDeliverable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__1"


    // $ANTLR start "rule__WBSDeliverable__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1223:1: rule__WBSDeliverable__Group__1__Impl : ( 'Deliverable ' ) ;
    public final void rule__WBSDeliverable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1227:1: ( ( 'Deliverable ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1228:1: ( 'Deliverable ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1228:1: ( 'Deliverable ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1229:1: 'Deliverable '
            {
             before(grammarAccess.getWBSDeliverableAccess().getDeliverableKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__WBSDeliverable__Group__1__Impl2447); 
             after(grammarAccess.getWBSDeliverableAccess().getDeliverableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__1__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1242:1: rule__WBSDeliverable__Group__2 : rule__WBSDeliverable__Group__2__Impl rule__WBSDeliverable__Group__3 ;
    public final void rule__WBSDeliverable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1246:1: ( rule__WBSDeliverable__Group__2__Impl rule__WBSDeliverable__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1247:2: rule__WBSDeliverable__Group__2__Impl rule__WBSDeliverable__Group__3
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__2__Impl_in_rule__WBSDeliverable__Group__22478);
            rule__WBSDeliverable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group__3_in_rule__WBSDeliverable__Group__22481);
            rule__WBSDeliverable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__2"


    // $ANTLR start "rule__WBSDeliverable__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1254:1: rule__WBSDeliverable__Group__2__Impl : ( ( rule__WBSDeliverable__NameAssignment_2 ) ) ;
    public final void rule__WBSDeliverable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1258:1: ( ( ( rule__WBSDeliverable__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1259:1: ( ( rule__WBSDeliverable__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1259:1: ( ( rule__WBSDeliverable__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1260:1: ( rule__WBSDeliverable__NameAssignment_2 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1261:1: ( rule__WBSDeliverable__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1261:2: rule__WBSDeliverable__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__NameAssignment_2_in_rule__WBSDeliverable__Group__2__Impl2508);
            rule__WBSDeliverable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__2__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1271:1: rule__WBSDeliverable__Group__3 : rule__WBSDeliverable__Group__3__Impl ;
    public final void rule__WBSDeliverable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1275:1: ( rule__WBSDeliverable__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1276:2: rule__WBSDeliverable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__3__Impl_in_rule__WBSDeliverable__Group__32538);
            rule__WBSDeliverable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__3"


    // $ANTLR start "rule__WBSDeliverable__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1282:1: rule__WBSDeliverable__Group__3__Impl : ( ( rule__WBSDeliverable__Alternatives_3 ) ) ;
    public final void rule__WBSDeliverable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1286:1: ( ( ( rule__WBSDeliverable__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1287:1: ( ( rule__WBSDeliverable__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1287:1: ( ( rule__WBSDeliverable__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1288:1: ( rule__WBSDeliverable__Alternatives_3 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1289:1: ( rule__WBSDeliverable__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1289:2: rule__WBSDeliverable__Alternatives_3
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Alternatives_3_in_rule__WBSDeliverable__Group__3__Impl2565);
            rule__WBSDeliverable__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__3__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1307:1: rule__WBSDeliverable__Group_3_0__0 : rule__WBSDeliverable__Group_3_0__0__Impl rule__WBSDeliverable__Group_3_0__1 ;
    public final void rule__WBSDeliverable__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1311:1: ( rule__WBSDeliverable__Group_3_0__0__Impl rule__WBSDeliverable__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1312:2: rule__WBSDeliverable__Group_3_0__0__Impl rule__WBSDeliverable__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__0__Impl_in_rule__WBSDeliverable__Group_3_0__02603);
            rule__WBSDeliverable__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__1_in_rule__WBSDeliverable__Group_3_0__02606);
            rule__WBSDeliverable__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__0"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1319:1: rule__WBSDeliverable__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSDeliverable__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1323:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1324:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1324:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1325:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSDeliverable__Group_3_0__0__Impl2633); 
             after(grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__0__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1336:1: rule__WBSDeliverable__Group_3_0__1 : rule__WBSDeliverable__Group_3_0__1__Impl rule__WBSDeliverable__Group_3_0__2 ;
    public final void rule__WBSDeliverable__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1340:1: ( rule__WBSDeliverable__Group_3_0__1__Impl rule__WBSDeliverable__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1341:2: rule__WBSDeliverable__Group_3_0__1__Impl rule__WBSDeliverable__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__1__Impl_in_rule__WBSDeliverable__Group_3_0__12662);
            rule__WBSDeliverable__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__2_in_rule__WBSDeliverable__Group_3_0__12665);
            rule__WBSDeliverable__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__1"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1348:1: rule__WBSDeliverable__Group_3_0__1__Impl : ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* ) ;
    public final void rule__WBSDeliverable__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1352:1: ( ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1353:1: ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1353:1: ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1354:1: ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )*
            {
             before(grammarAccess.getWBSDeliverableAccess().getWbsNodesAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1355:1: ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ML_COMMENT||(LA15_0>=16 && LA15_0<=18)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1355:2: rule__WBSDeliverable__WbsNodesAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WBSDeliverable__WbsNodesAssignment_3_0_1_in_rule__WBSDeliverable__Group_3_0__1__Impl2692);
            	    rule__WBSDeliverable__WbsNodesAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getWBSDeliverableAccess().getWbsNodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__1__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1365:1: rule__WBSDeliverable__Group_3_0__2 : rule__WBSDeliverable__Group_3_0__2__Impl ;
    public final void rule__WBSDeliverable__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1369:1: ( rule__WBSDeliverable__Group_3_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1370:2: rule__WBSDeliverable__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__2__Impl_in_rule__WBSDeliverable__Group_3_0__22723);
            rule__WBSDeliverable__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__2"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1376:1: rule__WBSDeliverable__Group_3_0__2__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSDeliverable__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1380:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1381:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1381:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1382:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSDeliverable__Group_3_0__2__Impl2750); 
             after(grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__2__Impl"


    // $ANTLR start "rule__WBSProgram__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1400:1: rule__WBSProgram__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSProgram__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1404:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1405:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1405:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1406:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSProgram__DescriptionAssignment_02790); 
             after(grammarAccess.getWBSProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSProgram__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1415:1: rule__WBSProgram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1419:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1420:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1420:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1421:1: RULE_ID
            {
             before(grammarAccess.getWBSProgramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSProgram__NameAssignment_22821); 
             after(grammarAccess.getWBSProgramAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__NameAssignment_2"


    // $ANTLR start "rule__WBSProgram__ProjectsAssignment_4"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1430:1: rule__WBSProgram__ProjectsAssignment_4 : ( ruleWBSProject ) ;
    public final void rule__WBSProgram__ProjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1434:1: ( ( ruleWBSProject ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1435:1: ( ruleWBSProject )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1435:1: ( ruleWBSProject )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1436:1: ruleWBSProject
            {
             before(grammarAccess.getWBSProgramAccess().getProjectsWBSProjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleWBSProject_in_rule__WBSProgram__ProjectsAssignment_42852);
            ruleWBSProject();

            state._fsp--;

             after(grammarAccess.getWBSProgramAccess().getProjectsWBSProjectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__ProjectsAssignment_4"


    // $ANTLR start "rule__WBSProject__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1445:1: rule__WBSProject__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSProject__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1449:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1450:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1450:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1451:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSProject__DescriptionAssignment_02883); 
             after(grammarAccess.getWBSProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSProject__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1460:1: rule__WBSProject__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSProject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1464:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1465:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1465:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1466:1: RULE_ID
            {
             before(grammarAccess.getWBSProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSProject__NameAssignment_22914); 
             after(grammarAccess.getWBSProjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__NameAssignment_2"


    // $ANTLR start "rule__WBSProject__WbsNodesAssignment_4"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1475:1: rule__WBSProject__WbsNodesAssignment_4 : ( ruleWBSNode ) ;
    public final void rule__WBSProject__WbsNodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1479:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1480:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1480:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1481:1: ruleWBSNode
            {
             before(grammarAccess.getWBSProjectAccess().getWbsNodesWBSNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSProject__WbsNodesAssignment_42945);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSProjectAccess().getWbsNodesWBSNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__WbsNodesAssignment_4"


    // $ANTLR start "rule__WBSActivity__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1490:1: rule__WBSActivity__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSActivity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1494:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1495:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1495:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1496:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSActivity__DescriptionAssignment_02976); 
             after(grammarAccess.getWBSActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSActivity__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1505:1: rule__WBSActivity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1509:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1510:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1510:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1511:1: RULE_ID
            {
             before(grammarAccess.getWBSActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSActivity__NameAssignment_23007); 
             after(grammarAccess.getWBSActivityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__NameAssignment_2"


    // $ANTLR start "rule__WBSActivity__WbsNodesAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1520:1: rule__WBSActivity__WbsNodesAssignment_3_0_1 : ( ruleWBSNode ) ;
    public final void rule__WBSActivity__WbsNodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1524:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1525:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1525:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1526:1: ruleWBSNode
            {
             before(grammarAccess.getWBSActivityAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSActivity__WbsNodesAssignment_3_0_13038);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSActivityAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__WbsNodesAssignment_3_0_1"


    // $ANTLR start "rule__WBSWorkPackage__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1535:1: rule__WBSWorkPackage__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSWorkPackage__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1539:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1540:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1540:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1541:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSWorkPackageAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSWorkPackage__DescriptionAssignment_03069); 
             after(grammarAccess.getWBSWorkPackageAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSWorkPackage__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1550:1: rule__WBSWorkPackage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSWorkPackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1554:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1555:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1555:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1556:1: RULE_ID
            {
             before(grammarAccess.getWBSWorkPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSWorkPackage__NameAssignment_23100); 
             after(grammarAccess.getWBSWorkPackageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__NameAssignment_2"


    // $ANTLR start "rule__WBSWorkPackage__WbsNodesAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1565:1: rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 : ( ruleWBSNode ) ;
    public final void rule__WBSWorkPackage__WbsNodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1569:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1570:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1570:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1571:1: ruleWBSNode
            {
             before(grammarAccess.getWBSWorkPackageAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSWorkPackage__WbsNodesAssignment_3_0_13131);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSWorkPackageAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__WbsNodesAssignment_3_0_1"


    // $ANTLR start "rule__WBSDeliverable__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1580:1: rule__WBSDeliverable__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSDeliverable__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1584:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1585:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1585:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1586:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSDeliverableAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSDeliverable__DescriptionAssignment_03162); 
             after(grammarAccess.getWBSDeliverableAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSDeliverable__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1595:1: rule__WBSDeliverable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSDeliverable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1599:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1600:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1600:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1601:1: RULE_ID
            {
             before(grammarAccess.getWBSDeliverableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSDeliverable__NameAssignment_23193); 
             after(grammarAccess.getWBSDeliverableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__NameAssignment_2"


    // $ANTLR start "rule__WBSDeliverable__WbsNodesAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1610:1: rule__WBSDeliverable__WbsNodesAssignment_3_0_1 : ( ruleWBSNode ) ;
    public final void rule__WBSDeliverable__WbsNodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1614:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1615:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1615:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1616:1: ruleWBSNode
            {
             before(grammarAccess.getWBSDeliverableAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSDeliverable__WbsNodesAssignment_3_0_13224);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSDeliverableAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__WbsNodesAssignment_3_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWBS_in_entryRuleWBS61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBS68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBS__Alternatives_in_ruleWBS94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__0_in_ruleWBSProgram154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_entryRuleWBSProject181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProject188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__0_in_ruleWBSProject214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_entryRuleWBSNode241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSNode248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSNode__Alternatives_in_ruleWBSNode274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSActivity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__0_in_ruleWBSActivity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSWorkPackage368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__0_in_ruleWBSWorkPackage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSDeliverable428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__0_in_ruleWBSDeliverable454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_rule__WBS__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_rule__WBS__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_rule__WBSNode__Alternatives539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_rule__WBSNode__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_rule__WBSNode__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__0_in_rule__WBSActivity__Alternatives_3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSActivity__Alternatives_3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__0_in_rule__WBSWorkPackage__Alternatives_3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSWorkPackage__Alternatives_3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__0_in_rule__WBSDeliverable__Alternatives_3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSDeliverable__Alternatives_3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__0__Impl_in_rule__WBSProgram__Group__0753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__1_in_rule__WBSProgram__Group__0756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__DescriptionAssignment_0_in_rule__WBSProgram__Group__0__Impl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__1__Impl_in_rule__WBSProgram__Group__1814 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__2_in_rule__WBSProgram__Group__1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WBSProgram__Group__1__Impl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__2__Impl_in_rule__WBSProgram__Group__2876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__3_in_rule__WBSProgram__Group__2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__NameAssignment_2_in_rule__WBSProgram__Group__2__Impl906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__3__Impl_in_rule__WBSProgram__Group__3936 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__4_in_rule__WBSProgram__Group__3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSProgram__Group__3__Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__4__Impl_in_rule__WBSProgram__Group__4995 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__5_in_rule__WBSProgram__Group__4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__ProjectsAssignment_4_in_rule__WBSProgram__Group__4__Impl1025 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__5__Impl_in_rule__WBSProgram__Group__51056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProgram__Group__5__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__0__Impl_in_rule__WBSProject__Group__01124 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__1_in_rule__WBSProject__Group__01127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__DescriptionAssignment_0_in_rule__WBSProject__Group__0__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__1__Impl_in_rule__WBSProject__Group__11185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__2_in_rule__WBSProject__Group__11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WBSProject__Group__1__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__2__Impl_in_rule__WBSProject__Group__21247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__3_in_rule__WBSProject__Group__21250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__NameAssignment_2_in_rule__WBSProject__Group__2__Impl1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__3__Impl_in_rule__WBSProject__Group__31307 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__4_in_rule__WBSProject__Group__31310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSProject__Group__3__Impl1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__4__Impl_in_rule__WBSProject__Group__41366 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__5_in_rule__WBSProject__Group__41369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__WbsNodesAssignment_4_in_rule__WBSProject__Group__4__Impl1396 = new BitSet(new long[]{0x0000000000070082L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__5__Impl_in_rule__WBSProject__Group__51427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProject__Group__5__Impl1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__0__Impl_in_rule__WBSActivity__Group__01495 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__1_in_rule__WBSActivity__Group__01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__DescriptionAssignment_0_in_rule__WBSActivity__Group__0__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__1__Impl_in_rule__WBSActivity__Group__11556 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__2_in_rule__WBSActivity__Group__11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WBSActivity__Group__1__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__2__Impl_in_rule__WBSActivity__Group__21618 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__3_in_rule__WBSActivity__Group__21621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__NameAssignment_2_in_rule__WBSActivity__Group__2__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__3__Impl_in_rule__WBSActivity__Group__31678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Alternatives_3_in_rule__WBSActivity__Group__3__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__0__Impl_in_rule__WBSActivity__Group_3_0__01743 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__1_in_rule__WBSActivity__Group_3_0__01746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSActivity__Group_3_0__0__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__1__Impl_in_rule__WBSActivity__Group_3_0__11802 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__2_in_rule__WBSActivity__Group_3_0__11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__WbsNodesAssignment_3_0_1_in_rule__WBSActivity__Group_3_0__1__Impl1832 = new BitSet(new long[]{0x0000000000070082L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__2__Impl_in_rule__WBSActivity__Group_3_0__21863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSActivity__Group_3_0__2__Impl1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__0__Impl_in_rule__WBSWorkPackage__Group__01925 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__1_in_rule__WBSWorkPackage__Group__01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__DescriptionAssignment_0_in_rule__WBSWorkPackage__Group__0__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__1__Impl_in_rule__WBSWorkPackage__Group__11986 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__2_in_rule__WBSWorkPackage__Group__11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WBSWorkPackage__Group__1__Impl2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__2__Impl_in_rule__WBSWorkPackage__Group__22048 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__3_in_rule__WBSWorkPackage__Group__22051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__NameAssignment_2_in_rule__WBSWorkPackage__Group__2__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__3__Impl_in_rule__WBSWorkPackage__Group__32108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Alternatives_3_in_rule__WBSWorkPackage__Group__3__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__0__Impl_in_rule__WBSWorkPackage__Group_3_0__02173 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__1_in_rule__WBSWorkPackage__Group_3_0__02176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSWorkPackage__Group_3_0__0__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__1__Impl_in_rule__WBSWorkPackage__Group_3_0__12232 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__2_in_rule__WBSWorkPackage__Group_3_0__12235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__WbsNodesAssignment_3_0_1_in_rule__WBSWorkPackage__Group_3_0__1__Impl2262 = new BitSet(new long[]{0x0000000000070082L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__2__Impl_in_rule__WBSWorkPackage__Group_3_0__22293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSWorkPackage__Group_3_0__2__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__0__Impl_in_rule__WBSDeliverable__Group__02355 = new BitSet(new long[]{0x0000000000070080L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__1_in_rule__WBSDeliverable__Group__02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__DescriptionAssignment_0_in_rule__WBSDeliverable__Group__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__1__Impl_in_rule__WBSDeliverable__Group__12416 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__2_in_rule__WBSDeliverable__Group__12419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WBSDeliverable__Group__1__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__2__Impl_in_rule__WBSDeliverable__Group__22478 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__3_in_rule__WBSDeliverable__Group__22481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__NameAssignment_2_in_rule__WBSDeliverable__Group__2__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__3__Impl_in_rule__WBSDeliverable__Group__32538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Alternatives_3_in_rule__WBSDeliverable__Group__3__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__0__Impl_in_rule__WBSDeliverable__Group_3_0__02603 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__1_in_rule__WBSDeliverable__Group_3_0__02606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSDeliverable__Group_3_0__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__1__Impl_in_rule__WBSDeliverable__Group_3_0__12662 = new BitSet(new long[]{0x00000000000700C0L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__2_in_rule__WBSDeliverable__Group_3_0__12665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__WbsNodesAssignment_3_0_1_in_rule__WBSDeliverable__Group_3_0__1__Impl2692 = new BitSet(new long[]{0x0000000000070082L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__2__Impl_in_rule__WBSDeliverable__Group_3_0__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSDeliverable__Group_3_0__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSProgram__DescriptionAssignment_02790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSProgram__NameAssignment_22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_rule__WBSProgram__ProjectsAssignment_42852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSProject__DescriptionAssignment_02883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSProject__NameAssignment_22914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSProject__WbsNodesAssignment_42945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSActivity__DescriptionAssignment_02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSActivity__NameAssignment_23007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSActivity__WbsNodesAssignment_3_0_13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSWorkPackage__DescriptionAssignment_03069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSWorkPackage__NameAssignment_23100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSWorkPackage__WbsNodesAssignment_3_0_13131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSDeliverable__DescriptionAssignment_03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSDeliverable__NameAssignment_23193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSDeliverable__WbsNodesAssignment_3_0_13224 = new BitSet(new long[]{0x0000000000000002L});

}