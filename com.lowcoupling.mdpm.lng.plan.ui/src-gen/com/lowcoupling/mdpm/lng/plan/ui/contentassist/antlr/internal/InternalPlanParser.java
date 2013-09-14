package com.lowcoupling.mdpm.lng.plan.ui.contentassist.antlr.internal; 

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
import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'", "'Program'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'dependsOn'", "'wbs'", "'resources'", "'plan'", "'.'", "'CheckPoint'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=6;
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
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_CLOSEDCURLY=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=4;
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
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g"; }


     
     	private PlanGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PlanGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:61:1: ( ruleProgram EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:69:1: ruleProgram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:73:2: ( ( ( rule__Program__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:74:1: ( ( rule__Program__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:74:1: ( ( rule__Program__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:75:1: ( rule__Program__Alternatives )
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:76:1: ( rule__Program__Alternatives )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:76:2: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_rule__Program__Alternatives_in_ruleProgram94);
            rule__Program__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProject"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:88:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:89:1: ( ruleProject EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:90:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject121);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject128); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:97:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:101:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:102:1: ( ( rule__Project__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:102:1: ( ( rule__Project__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:103:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:104:1: ( rule__Project__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:104:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject154);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:116:1: entryRuleAssumption : ruleAssumption EOF ;
    public final void entryRuleAssumption() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:117:1: ( ruleAssumption EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:118:1: ruleAssumption EOF
            {
             before(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption181);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getAssumptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption188); 

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
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:125:1: ruleAssumption : ( ( rule__Assumption__Group__0 ) ) ;
    public final void ruleAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:129:2: ( ( ( rule__Assumption__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:130:1: ( ( rule__Assumption__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:130:1: ( ( rule__Assumption__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:131:1: ( rule__Assumption__Group__0 )
            {
             before(grammarAccess.getAssumptionAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:132:1: ( rule__Assumption__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:132:2: rule__Assumption__Group__0
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0_in_ruleAssumption214);
            rule__Assumption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssumptionAccess().getGroup()); 

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
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:144:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:145:1: ( ruleConstraint EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:146:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint241);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint248); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:153:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:157:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:158:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:158:1: ( ( rule__Constraint__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:159:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:160:1: ( rule__Constraint__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:160:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:172:1: entryRuleActivityGroup : ruleActivityGroup EOF ;
    public final void entryRuleActivityGroup() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:173:1: ( ruleActivityGroup EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:174:1: ruleActivityGroup EOF
            {
             before(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup301);
            ruleActivityGroup();

            state._fsp--;

             after(grammarAccess.getActivityGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup308); 

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
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:181:1: ruleActivityGroup : ( ( rule__ActivityGroup__Group__0 ) ) ;
    public final void ruleActivityGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:185:2: ( ( ( rule__ActivityGroup__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:186:1: ( ( rule__ActivityGroup__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:186:1: ( ( rule__ActivityGroup__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:187:1: ( rule__ActivityGroup__Group__0 )
            {
             before(grammarAccess.getActivityGroupAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:188:1: ( rule__ActivityGroup__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:188:2: rule__ActivityGroup__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0_in_ruleActivityGroup334);
            rule__ActivityGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRuleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:200:1: entryRuleWBSImport : ruleWBSImport EOF ;
    public final void entryRuleWBSImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:201:1: ( ruleWBSImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:202:1: ruleWBSImport EOF
            {
             before(grammarAccess.getWBSImportRule()); 
            pushFollow(FOLLOW_ruleWBSImport_in_entryRuleWBSImport361);
            ruleWBSImport();

            state._fsp--;

             after(grammarAccess.getWBSImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSImport368); 

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
    // $ANTLR end "entryRuleWBSImport"


    // $ANTLR start "ruleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:209:1: ruleWBSImport : ( ( rule__WBSImport__Group__0 ) ) ;
    public final void ruleWBSImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:213:2: ( ( ( rule__WBSImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:214:1: ( ( rule__WBSImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:214:1: ( ( rule__WBSImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:215:1: ( rule__WBSImport__Group__0 )
            {
             before(grammarAccess.getWBSImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:216:1: ( rule__WBSImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:216:2: rule__WBSImport__Group__0
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__0_in_ruleWBSImport394);
            rule__WBSImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSImportAccess().getGroup()); 

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
    // $ANTLR end "ruleWBSImport"


    // $ANTLR start "entryRuleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:228:1: entryRuleResourcesImport : ruleResourcesImport EOF ;
    public final void entryRuleResourcesImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:229:1: ( ruleResourcesImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:230:1: ruleResourcesImport EOF
            {
             before(grammarAccess.getResourcesImportRule()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport421);
            ruleResourcesImport();

            state._fsp--;

             after(grammarAccess.getResourcesImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourcesImport428); 

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
    // $ANTLR end "entryRuleResourcesImport"


    // $ANTLR start "ruleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:237:1: ruleResourcesImport : ( ( rule__ResourcesImport__Group__0 ) ) ;
    public final void ruleResourcesImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:241:2: ( ( ( rule__ResourcesImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:242:1: ( ( rule__ResourcesImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:242:1: ( ( rule__ResourcesImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:243:1: ( rule__ResourcesImport__Group__0 )
            {
             before(grammarAccess.getResourcesImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:244:1: ( rule__ResourcesImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:244:2: rule__ResourcesImport__Group__0
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__0_in_ruleResourcesImport454);
            rule__ResourcesImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesImportAccess().getGroup()); 

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
    // $ANTLR end "ruleResourcesImport"


    // $ANTLR start "entryRulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:256:1: entryRulePlanImport : rulePlanImport EOF ;
    public final void entryRulePlanImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:257:1: ( rulePlanImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:258:1: rulePlanImport EOF
            {
             before(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport481);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getPlanImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport488); 

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
    // $ANTLR end "entryRulePlanImport"


    // $ANTLR start "rulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:265:1: rulePlanImport : ( ( rule__PlanImport__Group__0 ) ) ;
    public final void rulePlanImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:269:2: ( ( ( rule__PlanImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:270:1: ( ( rule__PlanImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:270:1: ( ( rule__PlanImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:271:1: ( rule__PlanImport__Group__0 )
            {
             before(grammarAccess.getPlanImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:272:1: ( rule__PlanImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:272:2: rule__PlanImport__Group__0
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0_in_rulePlanImport514);
            rule__PlanImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanImportAccess().getGroup()); 

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
    // $ANTLR end "rulePlanImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:284:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:285:1: ( ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:286:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName541);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName548); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:293:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:297:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:298:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:298:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:299:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:300:1: ( rule__QualifiedName__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:300:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName574);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:314:1: entryRuleActivityElement : ruleActivityElement EOF ;
    public final void entryRuleActivityElement() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:315:1: ( ruleActivityElement EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:316:1: ruleActivityElement EOF
            {
             before(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement603);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement610); 

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
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:323:1: ruleActivityElement : ( ( rule__ActivityElement__Alternatives ) ) ;
    public final void ruleActivityElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:327:2: ( ( ( rule__ActivityElement__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:328:1: ( ( rule__ActivityElement__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:328:1: ( ( rule__ActivityElement__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:329:1: ( rule__ActivityElement__Alternatives )
            {
             before(grammarAccess.getActivityElementAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:330:1: ( rule__ActivityElement__Alternatives )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:330:2: rule__ActivityElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityElement__Alternatives_in_ruleActivityElement636);
            rule__ActivityElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:342:1: entryRuleENDLINE : ruleENDLINE EOF ;
    public final void entryRuleENDLINE() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:343:1: ( ruleENDLINE EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:344:1: ruleENDLINE EOF
            {
             before(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE663);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getENDLINERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE670); 

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
    // $ANTLR end "entryRuleENDLINE"


    // $ANTLR start "ruleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:351:1: ruleENDLINE : ( ';' ) ;
    public final void ruleENDLINE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:355:2: ( ( ';' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:356:1: ( ';' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:356:1: ( ';' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:357:1: ';'
            {
             before(grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 
            match(input,13,FOLLOW_13_in_ruleENDLINE697); 
             after(grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 

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
    // $ANTLR end "ruleENDLINE"


    // $ANTLR start "entryRuleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:372:1: entryRuleCheckPoint : ruleCheckPoint EOF ;
    public final void entryRuleCheckPoint() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:373:1: ( ruleCheckPoint EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:374:1: ruleCheckPoint EOF
            {
             before(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint725);
            ruleCheckPoint();

            state._fsp--;

             after(grammarAccess.getCheckPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint732); 

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
    // $ANTLR end "entryRuleCheckPoint"


    // $ANTLR start "ruleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:381:1: ruleCheckPoint : ( ( rule__CheckPoint__Group__0 ) ) ;
    public final void ruleCheckPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:385:2: ( ( ( rule__CheckPoint__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:386:1: ( ( rule__CheckPoint__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:386:1: ( ( rule__CheckPoint__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:387:1: ( rule__CheckPoint__Group__0 )
            {
             before(grammarAccess.getCheckPointAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:388:1: ( rule__CheckPoint__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:388:2: rule__CheckPoint__Group__0
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__0_in_ruleCheckPoint758);
            rule__CheckPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getGroup()); 

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
    // $ANTLR end "ruleCheckPoint"


    // $ANTLR start "entryRuleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:400:1: entryRuleResourceInvolvement : ruleResourceInvolvement EOF ;
    public final void entryRuleResourceInvolvement() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:401:1: ( ruleResourceInvolvement EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:402:1: ruleResourceInvolvement EOF
            {
             before(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement785);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement792); 

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
    // $ANTLR end "entryRuleResourceInvolvement"


    // $ANTLR start "ruleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:409:1: ruleResourceInvolvement : ( ( rule__ResourceInvolvement__Group__0 ) ) ;
    public final void ruleResourceInvolvement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:413:2: ( ( ( rule__ResourceInvolvement__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:414:1: ( ( rule__ResourceInvolvement__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:414:1: ( ( rule__ResourceInvolvement__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:415:1: ( rule__ResourceInvolvement__Group__0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:416:1: ( rule__ResourceInvolvement__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:416:2: rule__ResourceInvolvement__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0_in_ruleResourceInvolvement818);
            rule__ResourceInvolvement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceInvolvement"


    // $ANTLR start "entryRuleActivity"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:428:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:429:1: ( ruleActivity EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:430:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity845);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity852); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:437:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:441:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:442:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:442:1: ( ( rule__Activity__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:443:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:444:1: ( rule__Activity__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:444:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity878);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "ruleResponsibility"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:459:1: ruleResponsibility : ( ( rule__Responsibility__Alternatives ) ) ;
    public final void ruleResponsibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:463:1: ( ( ( rule__Responsibility__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:464:1: ( ( rule__Responsibility__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:464:1: ( ( rule__Responsibility__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:465:1: ( rule__Responsibility__Alternatives )
            {
             before(grammarAccess.getResponsibilityAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:466:1: ( rule__Responsibility__Alternatives )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:466:2: rule__Responsibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Responsibility__Alternatives_in_ruleResponsibility917);
            rule__Responsibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResponsibilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleResponsibility"


    // $ANTLR start "rule__Program__Alternatives"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:477:1: rule__Program__Alternatives : ( ( ( rule__Program__Group_0__0 ) ) | ( ( rule__Program__ProjectsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:481:1: ( ( ( rule__Program__Group_0__0 ) ) | ( ( rule__Program__ProjectsAssignment_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    alt1=2;
                }
                else if ( (LA1_1==18) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt1=1;
                }
                break;
            case 20:
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
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:482:1: ( ( rule__Program__Group_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:482:1: ( ( rule__Program__Group_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:483:1: ( rule__Program__Group_0__0 )
                    {
                     before(grammarAccess.getProgramAccess().getGroup_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:484:1: ( rule__Program__Group_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:484:2: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_0__0_in_rule__Program__Alternatives952);
                    rule__Program__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:488:6: ( ( rule__Program__ProjectsAssignment_1 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:488:6: ( ( rule__Program__ProjectsAssignment_1 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:489:1: ( rule__Program__ProjectsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getProjectsAssignment_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:490:1: ( rule__Program__ProjectsAssignment_1 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:490:2: rule__Program__ProjectsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_1_in_rule__Program__Alternatives970);
                    rule__Program__ProjectsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getProjectsAssignment_1()); 

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
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__ActivityElement__Alternatives"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:499:1: rule__ActivityElement__Alternatives : ( ( ruleActivity ) | ( ruleCheckPoint ) | ( ruleActivityGroup ) );
    public final void rule__ActivityElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:503:1: ( ( ruleActivity ) | ( ruleCheckPoint ) | ( ruleActivityGroup ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case 38:
                    {
                    alt2=1;
                    }
                    break;
                case 30:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:504:1: ( ruleActivity )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:504:1: ( ruleActivity )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:505:1: ruleActivity
                    {
                     before(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ActivityElement__Alternatives1003);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:510:6: ( ruleCheckPoint )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:510:6: ( ruleCheckPoint )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:511:1: ruleCheckPoint
                    {
                     before(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCheckPoint_in_rule__ActivityElement__Alternatives1020);
                    ruleCheckPoint();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:516:6: ( ruleActivityGroup )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:516:6: ( ruleActivityGroup )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:517:1: ruleActivityGroup
                    {
                     before(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActivityGroup_in_rule__ActivityElement__Alternatives1037);
                    ruleActivityGroup();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 

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
    // $ANTLR end "rule__ActivityElement__Alternatives"


    // $ANTLR start "rule__CheckPoint__Alternatives_4_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:527:1: rule__CheckPoint__Alternatives_4_0 : ( ( ( rule__CheckPoint__Group_4_0_0__0 ) ) | ( ( rule__CheckPoint__Group_4_0_1__0 ) ) );
    public final void rule__CheckPoint__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:531:1: ( ( ( rule__CheckPoint__Group_4_0_0__0 ) ) | ( ( rule__CheckPoint__Group_4_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:532:1: ( ( rule__CheckPoint__Group_4_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:532:1: ( ( rule__CheckPoint__Group_4_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:533:1: ( rule__CheckPoint__Group_4_0_0__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_4_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:534:1: ( rule__CheckPoint__Group_4_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:534:2: rule__CheckPoint__Group_4_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_0__0_in_rule__CheckPoint__Alternatives_4_01069);
                    rule__CheckPoint__Group_4_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:6: ( ( rule__CheckPoint__Group_4_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:6: ( ( rule__CheckPoint__Group_4_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:539:1: ( rule__CheckPoint__Group_4_0_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_4_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:540:1: ( rule__CheckPoint__Group_4_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:540:2: rule__CheckPoint__Group_4_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__0_in_rule__CheckPoint__Alternatives_4_01087);
                    rule__CheckPoint__Group_4_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_4_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Alternatives_4_0"


    // $ANTLR start "rule__Activity__Alternatives_5_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:549:1: rule__Activity__Alternatives_5_0 : ( ( ( rule__Activity__Group_5_0_0__0 ) ) | ( ( rule__Activity__Group_5_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:553:1: ( ( ( rule__Activity__Group_5_0_0__0 ) ) | ( ( rule__Activity__Group_5_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:554:1: ( ( rule__Activity__Group_5_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:554:1: ( ( rule__Activity__Group_5_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:555:1: ( rule__Activity__Group_5_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_5_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:556:1: ( rule__Activity__Group_5_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:556:2: rule__Activity__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5_0_0__0_in_rule__Activity__Alternatives_5_01120);
                    rule__Activity__Group_5_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:6: ( ( rule__Activity__Group_5_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:6: ( ( rule__Activity__Group_5_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:561:1: ( rule__Activity__Group_5_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_5_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:562:1: ( rule__Activity__Group_5_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:562:2: rule__Activity__Group_5_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5_0_1__0_in_rule__Activity__Alternatives_5_01138);
                    rule__Activity__Group_5_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_5_0_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives_5_0"


    // $ANTLR start "rule__Activity__Alternatives_5_1_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:571:1: rule__Activity__Alternatives_5_1_0 : ( ( ( rule__Activity__Group_5_1_0_0__0 ) ) | ( ( rule__Activity__Group_5_1_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:575:1: ( ( ( rule__Activity__Group_5_1_0_0__0 ) ) | ( ( rule__Activity__Group_5_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:576:1: ( ( rule__Activity__Group_5_1_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:576:1: ( ( rule__Activity__Group_5_1_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:577:1: ( rule__Activity__Group_5_1_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_5_1_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:578:1: ( rule__Activity__Group_5_1_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:578:2: rule__Activity__Group_5_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5_1_0_0__0_in_rule__Activity__Alternatives_5_1_01171);
                    rule__Activity__Group_5_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_5_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:6: ( ( rule__Activity__Group_5_1_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:6: ( ( rule__Activity__Group_5_1_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:583:1: ( rule__Activity__Group_5_1_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_5_1_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:584:1: ( rule__Activity__Group_5_1_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:584:2: rule__Activity__Group_5_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5_1_0_1__0_in_rule__Activity__Alternatives_5_1_01189);
                    rule__Activity__Group_5_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_5_1_0_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives_5_1_0"


    // $ANTLR start "rule__Responsibility__Alternatives"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:593:1: rule__Responsibility__Alternatives : ( ( ( 'RESPONSIBLE' ) ) | ( ( 'ACCOUNTABLE' ) ) | ( ( 'CONSULTED' ) ) | ( ( 'INFORMED' ) ) );
    public final void rule__Responsibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:597:1: ( ( ( 'RESPONSIBLE' ) ) | ( ( 'ACCOUNTABLE' ) ) | ( ( 'CONSULTED' ) ) | ( ( 'INFORMED' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:598:1: ( ( 'RESPONSIBLE' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:598:1: ( ( 'RESPONSIBLE' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:599:1: ( 'RESPONSIBLE' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:600:1: ( 'RESPONSIBLE' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:600:3: 'RESPONSIBLE'
                    {
                    match(input,14,FOLLOW_14_in_rule__Responsibility__Alternatives1223); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:605:6: ( ( 'ACCOUNTABLE' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:605:6: ( ( 'ACCOUNTABLE' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:606:1: ( 'ACCOUNTABLE' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:607:1: ( 'ACCOUNTABLE' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:607:3: 'ACCOUNTABLE'
                    {
                    match(input,15,FOLLOW_15_in_rule__Responsibility__Alternatives1244); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:612:6: ( ( 'CONSULTED' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:612:6: ( ( 'CONSULTED' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:613:1: ( 'CONSULTED' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:614:1: ( 'CONSULTED' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:614:3: 'CONSULTED'
                    {
                    match(input,16,FOLLOW_16_in_rule__Responsibility__Alternatives1265); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:619:6: ( ( 'INFORMED' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:619:6: ( ( 'INFORMED' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:620:1: ( 'INFORMED' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:621:1: ( 'INFORMED' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:621:3: 'INFORMED'
                    {
                    match(input,17,FOLLOW_17_in_rule__Responsibility__Alternatives1286); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Responsibility__Alternatives"


    // $ANTLR start "rule__Program__Group_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:633:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:637:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:638:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__01319);
            rule__Program__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__01322);
            rule__Program__Group_0__1();

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
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:645:1: rule__Program__Group_0__0__Impl : ( ( rule__Program__DescriptionAssignment_0_0 )? ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:649:1: ( ( ( rule__Program__DescriptionAssignment_0_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:650:1: ( ( rule__Program__DescriptionAssignment_0_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:650:1: ( ( rule__Program__DescriptionAssignment_0_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:651:1: ( rule__Program__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:652:1: ( rule__Program__DescriptionAssignment_0_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:652:2: rule__Program__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Program__DescriptionAssignment_0_0_in_rule__Program__Group_0__0__Impl1349);
                    rule__Program__DescriptionAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0()); 

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
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:662:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:666:1: ( rule__Program__Group_0__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:667:2: rule__Program__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__11380);
            rule__Program__Group_0__1__Impl();

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
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:673:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__Group_0_1__0 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:677:1: ( ( ( rule__Program__Group_0_1__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:678:1: ( ( rule__Program__Group_0_1__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:678:1: ( ( rule__Program__Group_0_1__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:679:1: ( rule__Program__Group_0_1__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:680:1: ( rule__Program__Group_0_1__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:680:2: rule__Program__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__0_in_rule__Program__Group_0__1__Impl1407);
            rule__Program__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:694:1: rule__Program__Group_0_1__0 : rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1 ;
    public final void rule__Program__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:698:1: ( rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:699:2: rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__0__Impl_in_rule__Program__Group_0_1__01441);
            rule__Program__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__1_in_rule__Program__Group_0_1__01444);
            rule__Program__Group_0_1__1();

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
    // $ANTLR end "rule__Program__Group_0_1__0"


    // $ANTLR start "rule__Program__Group_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:706:1: rule__Program__Group_0_1__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:710:1: ( ( 'Program' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:711:1: ( 'Program' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:711:1: ( 'Program' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:712:1: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group_0_1__0__Impl1472); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:725:1: rule__Program__Group_0_1__1 : rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2 ;
    public final void rule__Program__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:729:1: ( rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:730:2: rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__1__Impl_in_rule__Program__Group_0_1__11503);
            rule__Program__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__2_in_rule__Program__Group_0_1__11506);
            rule__Program__Group_0_1__2();

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
    // $ANTLR end "rule__Program__Group_0_1__1"


    // $ANTLR start "rule__Program__Group_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:737:1: rule__Program__Group_0_1__1__Impl : ( ( rule__Program__NameAssignment_0_1_1 ) ) ;
    public final void rule__Program__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:741:1: ( ( ( rule__Program__NameAssignment_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:742:1: ( ( rule__Program__NameAssignment_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:742:1: ( ( rule__Program__NameAssignment_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:743:1: ( rule__Program__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:744:1: ( rule__Program__NameAssignment_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:744:2: rule__Program__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_0_1_1_in_rule__Program__Group_0_1__1__Impl1533);
            rule__Program__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:754:1: rule__Program__Group_0_1__2 : rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3 ;
    public final void rule__Program__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:758:1: ( rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:759:2: rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21563);
            rule__Program__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21566);
            rule__Program__Group_0_1__3();

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
    // $ANTLR end "rule__Program__Group_0_1__2"


    // $ANTLR start "rule__Program__Group_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:766:1: rule__Program__Group_0_1__2__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Program__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:770:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:771:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:771:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:772:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1593); 
             after(grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1__2__Impl"


    // $ANTLR start "rule__Program__Group_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:783:1: rule__Program__Group_0_1__3 : rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4 ;
    public final void rule__Program__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:787:1: ( rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:788:2: rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31622);
            rule__Program__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31625);
            rule__Program__Group_0_1__4();

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
    // $ANTLR end "rule__Program__Group_0_1__3"


    // $ANTLR start "rule__Program__Group_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:795:1: rule__Program__Group_0_1__3__Impl : ( ( rule__Program__Group_0_1_3__0 )* ) ;
    public final void rule__Program__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:799:1: ( ( ( rule__Program__Group_0_1_3__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:800:1: ( ( rule__Program__Group_0_1_3__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:800:1: ( ( rule__Program__Group_0_1_3__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:801:1: ( rule__Program__Group_0_1_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:802:1: ( rule__Program__Group_0_1_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:802:2: rule__Program__Group_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1652);
            	    rule__Program__Group_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_3()); 

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
    // $ANTLR end "rule__Program__Group_0_1__3__Impl"


    // $ANTLR start "rule__Program__Group_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:812:1: rule__Program__Group_0_1__4 : rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5 ;
    public final void rule__Program__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:816:1: ( rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:817:2: rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41683);
            rule__Program__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41686);
            rule__Program__Group_0_1__5();

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
    // $ANTLR end "rule__Program__Group_0_1__4"


    // $ANTLR start "rule__Program__Group_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:824:1: rule__Program__Group_0_1__4__Impl : ( ( rule__Program__Group_0_1_4__0 )* ) ;
    public final void rule__Program__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:828:1: ( ( ( rule__Program__Group_0_1_4__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:829:1: ( ( rule__Program__Group_0_1_4__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:829:1: ( ( rule__Program__Group_0_1_4__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:830:1: ( rule__Program__Group_0_1_4__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:831:1: ( rule__Program__Group_0_1_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:831:2: rule__Program__Group_0_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1713);
            	    rule__Program__Group_0_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_4()); 

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
    // $ANTLR end "rule__Program__Group_0_1__4__Impl"


    // $ANTLR start "rule__Program__Group_0_1__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:841:1: rule__Program__Group_0_1__5 : rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6 ;
    public final void rule__Program__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:845:1: ( rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:846:2: rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51744);
            rule__Program__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51747);
            rule__Program__Group_0_1__6();

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
    // $ANTLR end "rule__Program__Group_0_1__5"


    // $ANTLR start "rule__Program__Group_0_1__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:853:1: rule__Program__Group_0_1__5__Impl : ( ( rule__Program__ProjectsAssignment_0_1_5 )* ) ;
    public final void rule__Program__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:857:1: ( ( ( rule__Program__ProjectsAssignment_0_1_5 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:858:1: ( ( rule__Program__ProjectsAssignment_0_1_5 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:858:1: ( ( rule__Program__ProjectsAssignment_0_1_5 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:859:1: ( rule__Program__ProjectsAssignment_0_1_5 )*
            {
             before(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:860:1: ( rule__Program__ProjectsAssignment_0_1_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ML_COMMENT||LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:860:2: rule__Program__ProjectsAssignment_0_1_5
            	    {
            	    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_0_1_5_in_rule__Program__Group_0_1__5__Impl1774);
            	    rule__Program__ProjectsAssignment_0_1_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_5()); 

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
    // $ANTLR end "rule__Program__Group_0_1__5__Impl"


    // $ANTLR start "rule__Program__Group_0_1__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:870:1: rule__Program__Group_0_1__6 : rule__Program__Group_0_1__6__Impl ;
    public final void rule__Program__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:874:1: ( rule__Program__Group_0_1__6__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:875:2: rule__Program__Group_0_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61805);
            rule__Program__Group_0_1__6__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1__6"


    // $ANTLR start "rule__Program__Group_0_1__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:881:1: rule__Program__Group_0_1__6__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Program__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:885:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:886:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:886:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:887:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_6()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__6__Impl1832); 
             after(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_6()); 

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
    // $ANTLR end "rule__Program__Group_0_1__6__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:912:1: rule__Program__Group_0_1_3__0 : rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 ;
    public final void rule__Program__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:916:1: ( rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:917:2: rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01875);
            rule__Program__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01878);
            rule__Program__Group_0_1_3__1();

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
    // $ANTLR end "rule__Program__Group_0_1_3__0"


    // $ANTLR start "rule__Program__Group_0_1_3__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:924:1: rule__Program__Group_0_1_3__0__Impl : ( ( rule__Program__PlansAssignment_0_1_3_0 ) ) ;
    public final void rule__Program__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:928:1: ( ( ( rule__Program__PlansAssignment_0_1_3_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:929:1: ( ( rule__Program__PlansAssignment_0_1_3_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:929:1: ( ( rule__Program__PlansAssignment_0_1_3_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:930:1: ( rule__Program__PlansAssignment_0_1_3_0 )
            {
             before(grammarAccess.getProgramAccess().getPlansAssignment_0_1_3_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:931:1: ( rule__Program__PlansAssignment_0_1_3_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:931:2: rule__Program__PlansAssignment_0_1_3_0
            {
            pushFollow(FOLLOW_rule__Program__PlansAssignment_0_1_3_0_in_rule__Program__Group_0_1_3__0__Impl1905);
            rule__Program__PlansAssignment_0_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPlansAssignment_0_1_3_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:941:1: rule__Program__Group_0_1_3__1 : rule__Program__Group_0_1_3__1__Impl ;
    public final void rule__Program__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:945:1: ( rule__Program__Group_0_1_3__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:946:2: rule__Program__Group_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__11935);
            rule__Program__Group_0_1_3__1__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_3__1"


    // $ANTLR start "rule__Program__Group_0_1_3__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:952:1: rule__Program__Group_0_1_3__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:956:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:957:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:957:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:958:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__1__Impl1962);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:973:1: rule__Program__Group_0_1_4__0 : rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 ;
    public final void rule__Program__Group_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:977:1: ( rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:978:2: rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__01995);
            rule__Program__Group_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__01998);
            rule__Program__Group_0_1_4__1();

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
    // $ANTLR end "rule__Program__Group_0_1_4__0"


    // $ANTLR start "rule__Program__Group_0_1_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:985:1: rule__Program__Group_0_1_4__0__Impl : ( 'project' ) ;
    public final void rule__Program__Group_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:989:1: ( ( 'project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:990:1: ( 'project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:990:1: ( 'project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:991:1: 'project'
            {
             before(grammarAccess.getProgramAccess().getProjectKeyword_0_1_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group_0_1_4__0__Impl2026); 
             after(grammarAccess.getProgramAccess().getProjectKeyword_0_1_4_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1_4__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1004:1: rule__Program__Group_0_1_4__1 : rule__Program__Group_0_1_4__1__Impl rule__Program__Group_0_1_4__2 ;
    public final void rule__Program__Group_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1008:1: ( rule__Program__Group_0_1_4__1__Impl rule__Program__Group_0_1_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1009:2: rule__Program__Group_0_1_4__1__Impl rule__Program__Group_0_1_4__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12057);
            rule__Program__Group_0_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_4__2_in_rule__Program__Group_0_1_4__12060);
            rule__Program__Group_0_1_4__2();

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
    // $ANTLR end "rule__Program__Group_0_1_4__1"


    // $ANTLR start "rule__Program__Group_0_1_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1016:1: rule__Program__Group_0_1_4__1__Impl : ( ( rule__Program__ReferencedProjectsAssignment_0_1_4_1 ) ) ;
    public final void rule__Program__Group_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1020:1: ( ( ( rule__Program__ReferencedProjectsAssignment_0_1_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1021:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1021:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1022:1: ( rule__Program__ReferencedProjectsAssignment_0_1_4_1 )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1023:1: ( rule__Program__ReferencedProjectsAssignment_0_1_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1023:2: rule__Program__ReferencedProjectsAssignment_0_1_4_1
            {
            pushFollow(FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_4_1_in_rule__Program__Group_0_1_4__1__Impl2087);
            rule__Program__ReferencedProjectsAssignment_0_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_4_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1_4__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1033:1: rule__Program__Group_0_1_4__2 : rule__Program__Group_0_1_4__2__Impl ;
    public final void rule__Program__Group_0_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1037:1: ( rule__Program__Group_0_1_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1038:2: rule__Program__Group_0_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__2__Impl_in_rule__Program__Group_0_1_4__22117);
            rule__Program__Group_0_1_4__2__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_4__2"


    // $ANTLR start "rule__Program__Group_0_1_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1044:1: rule__Program__Group_0_1_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1048:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1049:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1049:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1050:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__2__Impl2144);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1_4__2__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1067:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1071:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1072:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02179);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02182);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1079:1: rule__Project__Group__0__Impl : ( ( rule__Project__DescriptionAssignment_0 )? ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1083:1: ( ( ( rule__Project__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1084:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1084:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1085:1: ( rule__Project__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1086:1: ( rule__Project__DescriptionAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ML_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1086:2: rule__Project__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2209);
                    rule__Project__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1096:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1100:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1101:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12240);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12243);
            rule__Project__Group__2();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1108:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1112:1: ( ( 'Project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1113:1: ( 'Project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1113:1: ( 'Project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1114:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Project__Group__1__Impl2271); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_1()); 

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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1127:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1131:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1132:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22302);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22305);
            rule__Project__Group__3();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1139:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1143:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1144:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1144:1: ( ( rule__Project__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1145:1: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1146:1: ( rule__Project__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1146:2: rule__Project__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2332);
            rule__Project__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1156:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1160:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1161:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32362);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32365);
            rule__Project__Group__4();

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
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1168:1: rule__Project__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1172:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1173:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1173:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1174:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2392); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1185:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1189:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1190:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42421);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42424);
            rule__Project__Group__5();

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
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1197:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1201:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1202:1: ( ( rule__Project__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1202:1: ( ( rule__Project__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1203:1: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1204:1: ( rule__Project__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1204:2: rule__Project__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2451);
                    rule__Project__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1214:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1218:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1219:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52482);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52485);
            rule__Project__Group__6();

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
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1226:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1230:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1231:1: ( ( rule__Project__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1231:1: ( ( rule__Project__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1232:1: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1233:1: ( rule__Project__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1233:2: rule__Project__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl2512);
                    rule__Project__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1243:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1247:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1248:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62543);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62546);
            rule__Project__Group__7();

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
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1255:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )* ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1259:1: ( ( ( rule__Project__Group_6__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1260:1: ( ( rule__Project__Group_6__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1260:1: ( ( rule__Project__Group_6__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1261:1: ( rule__Project__Group_6__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1262:1: ( rule__Project__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1262:2: rule__Project__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2573);
            	    rule__Project__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1272:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1276:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1277:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72604);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72607);
            rule__Project__Group__8();

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
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1284:1: rule__Project__Group__7__Impl : ( ( rule__Project__Group_7__0 )? ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1288:1: ( ( ( rule__Project__Group_7__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1289:1: ( ( rule__Project__Group_7__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1289:1: ( ( rule__Project__Group_7__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1290:1: ( rule__Project__Group_7__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_7()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1291:1: ( rule__Project__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1291:2: rule__Project__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2634);
                    rule__Project__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group__8"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1301:1: rule__Project__Group__8 : rule__Project__Group__8__Impl rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1305:1: ( rule__Project__Group__8__Impl rule__Project__Group__9 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1306:2: rule__Project__Group__8__Impl rule__Project__Group__9
            {
            pushFollow(FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82665);
            rule__Project__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82668);
            rule__Project__Group__9();

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
    // $ANTLR end "rule__Project__Group__8"


    // $ANTLR start "rule__Project__Group__8__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1313:1: rule__Project__Group__8__Impl : ( ( rule__Project__Group_8__0 )? ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1317:1: ( ( ( rule__Project__Group_8__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1318:1: ( ( rule__Project__Group_8__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1318:1: ( ( rule__Project__Group_8__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1319:1: ( rule__Project__Group_8__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_8()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1320:1: ( rule__Project__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1320:2: rule__Project__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2695);
                    rule__Project__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Project__Group__8__Impl"


    // $ANTLR start "rule__Project__Group__9"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1330:1: rule__Project__Group__9 : rule__Project__Group__9__Impl rule__Project__Group__10 ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1334:1: ( rule__Project__Group__9__Impl rule__Project__Group__10 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1335:2: rule__Project__Group__9__Impl rule__Project__Group__10
            {
            pushFollow(FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92726);
            rule__Project__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92729);
            rule__Project__Group__10();

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
    // $ANTLR end "rule__Project__Group__9"


    // $ANTLR start "rule__Project__Group__9__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1342:1: rule__Project__Group__9__Impl : ( ( rule__Project__ActivitiesAssignment_9 )* ) ;
    public final void rule__Project__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1346:1: ( ( ( rule__Project__ActivitiesAssignment_9 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1347:1: ( ( rule__Project__ActivitiesAssignment_9 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1347:1: ( ( rule__Project__ActivitiesAssignment_9 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1348:1: ( rule__Project__ActivitiesAssignment_9 )*
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_9()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1349:1: ( rule__Project__ActivitiesAssignment_9 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ML_COMMENT||LA17_0==24||LA17_0==30||LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1349:2: rule__Project__ActivitiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Project__ActivitiesAssignment_9_in_rule__Project__Group__9__Impl2756);
            	    rule__Project__ActivitiesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_9()); 

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
    // $ANTLR end "rule__Project__Group__9__Impl"


    // $ANTLR start "rule__Project__Group__10"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1359:1: rule__Project__Group__10 : rule__Project__Group__10__Impl ;
    public final void rule__Project__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1363:1: ( rule__Project__Group__10__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1364:2: rule__Project__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__102787);
            rule__Project__Group__10__Impl();

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
    // $ANTLR end "rule__Project__Group__10"


    // $ANTLR start "rule__Project__Group__10__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1370:1: rule__Project__Group__10__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1374:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1375:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1375:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1376:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_10()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__10__Impl2814); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Project__Group__10__Impl"


    // $ANTLR start "rule__Project__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1409:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1413:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1414:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__02865);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__02868);
            rule__Project__Group_4__1();

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
    // $ANTLR end "rule__Project__Group_4__0"


    // $ANTLR start "rule__Project__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1421:1: rule__Project__Group_4__0__Impl : ( ( rule__Project__WbsAssignment_4_0 ) ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1425:1: ( ( ( rule__Project__WbsAssignment_4_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1426:1: ( ( rule__Project__WbsAssignment_4_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1426:1: ( ( rule__Project__WbsAssignment_4_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1427:1: ( rule__Project__WbsAssignment_4_0 )
            {
             before(grammarAccess.getProjectAccess().getWbsAssignment_4_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1428:1: ( rule__Project__WbsAssignment_4_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1428:2: rule__Project__WbsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Project__WbsAssignment_4_0_in_rule__Project__Group_4__0__Impl2895);
            rule__Project__WbsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getWbsAssignment_4_0()); 

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
    // $ANTLR end "rule__Project__Group_4__0__Impl"


    // $ANTLR start "rule__Project__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1438:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1442:1: ( rule__Project__Group_4__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1443:2: rule__Project__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__12925);
            rule__Project__Group_4__1__Impl();

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
    // $ANTLR end "rule__Project__Group_4__1"


    // $ANTLR start "rule__Project__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1449:1: rule__Project__Group_4__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1453:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1454:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1454:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1455:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_4__1__Impl2952);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__Project__Group_4__1__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1470:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1474:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1475:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__02985);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__02988);
            rule__Project__Group_5__1();

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
    // $ANTLR end "rule__Project__Group_5__0"


    // $ANTLR start "rule__Project__Group_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1482:1: rule__Project__Group_5__0__Impl : ( ( rule__Project__ResourcesAssignment_5_0 ) ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1486:1: ( ( ( rule__Project__ResourcesAssignment_5_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1487:1: ( ( rule__Project__ResourcesAssignment_5_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1487:1: ( ( rule__Project__ResourcesAssignment_5_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1488:1: ( rule__Project__ResourcesAssignment_5_0 )
            {
             before(grammarAccess.getProjectAccess().getResourcesAssignment_5_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1489:1: ( rule__Project__ResourcesAssignment_5_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1489:2: rule__Project__ResourcesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Project__ResourcesAssignment_5_0_in_rule__Project__Group_5__0__Impl3015);
            rule__Project__ResourcesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getResourcesAssignment_5_0()); 

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
    // $ANTLR end "rule__Project__Group_5__0__Impl"


    // $ANTLR start "rule__Project__Group_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1499:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1503:1: ( rule__Project__Group_5__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1504:2: rule__Project__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__13045);
            rule__Project__Group_5__1__Impl();

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
    // $ANTLR end "rule__Project__Group_5__1"


    // $ANTLR start "rule__Project__Group_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1510:1: rule__Project__Group_5__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1514:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1515:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1515:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1516:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_5__1__Impl3072);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__Project__Group_5__1__Impl"


    // $ANTLR start "rule__Project__Group_6__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1531:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1535:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1536:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03105);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03108);
            rule__Project__Group_6__1();

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
    // $ANTLR end "rule__Project__Group_6__0"


    // $ANTLR start "rule__Project__Group_6__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1543:1: rule__Project__Group_6__0__Impl : ( ( rule__Project__PlansAssignment_6_0 ) ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1547:1: ( ( ( rule__Project__PlansAssignment_6_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1548:1: ( ( rule__Project__PlansAssignment_6_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1548:1: ( ( rule__Project__PlansAssignment_6_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1549:1: ( rule__Project__PlansAssignment_6_0 )
            {
             before(grammarAccess.getProjectAccess().getPlansAssignment_6_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1550:1: ( rule__Project__PlansAssignment_6_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1550:2: rule__Project__PlansAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Project__PlansAssignment_6_0_in_rule__Project__Group_6__0__Impl3135);
            rule__Project__PlansAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPlansAssignment_6_0()); 

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
    // $ANTLR end "rule__Project__Group_6__0__Impl"


    // $ANTLR start "rule__Project__Group_6__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1560:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1564:1: ( rule__Project__Group_6__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1565:2: rule__Project__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13165);
            rule__Project__Group_6__1__Impl();

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
    // $ANTLR end "rule__Project__Group_6__1"


    // $ANTLR start "rule__Project__Group_6__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1571:1: rule__Project__Group_6__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1575:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1576:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1576:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1577:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3192);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__Project__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group_7__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1592:1: rule__Project__Group_7__0 : rule__Project__Group_7__0__Impl rule__Project__Group_7__1 ;
    public final void rule__Project__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1596:1: ( rule__Project__Group_7__0__Impl rule__Project__Group_7__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1597:2: rule__Project__Group_7__0__Impl rule__Project__Group_7__1
            {
            pushFollow(FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03225);
            rule__Project__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03228);
            rule__Project__Group_7__1();

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
    // $ANTLR end "rule__Project__Group_7__0"


    // $ANTLR start "rule__Project__Group_7__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1604:1: rule__Project__Group_7__0__Impl : ( 'assumptions' ) ;
    public final void rule__Project__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1608:1: ( ( 'assumptions' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1609:1: ( 'assumptions' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1609:1: ( 'assumptions' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1610:1: 'assumptions'
            {
             before(grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group_7__0__Impl3256); 
             after(grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0()); 

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
    // $ANTLR end "rule__Project__Group_7__0__Impl"


    // $ANTLR start "rule__Project__Group_7__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1623:1: rule__Project__Group_7__1 : rule__Project__Group_7__1__Impl rule__Project__Group_7__2 ;
    public final void rule__Project__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1627:1: ( rule__Project__Group_7__1__Impl rule__Project__Group_7__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1628:2: rule__Project__Group_7__1__Impl rule__Project__Group_7__2
            {
            pushFollow(FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13287);
            rule__Project__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__2_in_rule__Project__Group_7__13290);
            rule__Project__Group_7__2();

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
    // $ANTLR end "rule__Project__Group_7__1"


    // $ANTLR start "rule__Project__Group_7__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1635:1: rule__Project__Group_7__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1639:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1640:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1640:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1641:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_7__1__Impl3317); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()); 

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
    // $ANTLR end "rule__Project__Group_7__1__Impl"


    // $ANTLR start "rule__Project__Group_7__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1652:1: rule__Project__Group_7__2 : rule__Project__Group_7__2__Impl rule__Project__Group_7__3 ;
    public final void rule__Project__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1656:1: ( rule__Project__Group_7__2__Impl rule__Project__Group_7__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1657:2: rule__Project__Group_7__2__Impl rule__Project__Group_7__3
            {
            pushFollow(FOLLOW_rule__Project__Group_7__2__Impl_in_rule__Project__Group_7__23346);
            rule__Project__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__3_in_rule__Project__Group_7__23349);
            rule__Project__Group_7__3();

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
    // $ANTLR end "rule__Project__Group_7__2"


    // $ANTLR start "rule__Project__Group_7__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1664:1: rule__Project__Group_7__2__Impl : ( ( rule__Project__AssumptionsAssignment_7_2 )* ) ;
    public final void rule__Project__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1668:1: ( ( ( rule__Project__AssumptionsAssignment_7_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1669:1: ( ( rule__Project__AssumptionsAssignment_7_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1669:1: ( ( rule__Project__AssumptionsAssignment_7_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1670:1: ( rule__Project__AssumptionsAssignment_7_2 )*
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssignment_7_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1671:1: ( rule__Project__AssumptionsAssignment_7_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1671:2: rule__Project__AssumptionsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__AssumptionsAssignment_7_2_in_rule__Project__Group_7__2__Impl3376);
            	    rule__Project__AssumptionsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getAssumptionsAssignment_7_2()); 

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
    // $ANTLR end "rule__Project__Group_7__2__Impl"


    // $ANTLR start "rule__Project__Group_7__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1681:1: rule__Project__Group_7__3 : rule__Project__Group_7__3__Impl ;
    public final void rule__Project__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1685:1: ( rule__Project__Group_7__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1686:2: rule__Project__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_7__3__Impl_in_rule__Project__Group_7__33407);
            rule__Project__Group_7__3__Impl();

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
    // $ANTLR end "rule__Project__Group_7__3"


    // $ANTLR start "rule__Project__Group_7__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1692:1: rule__Project__Group_7__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1696:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1697:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1697:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1698:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_7__3__Impl3434); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()); 

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
    // $ANTLR end "rule__Project__Group_7__3__Impl"


    // $ANTLR start "rule__Project__Group_8__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1717:1: rule__Project__Group_8__0 : rule__Project__Group_8__0__Impl rule__Project__Group_8__1 ;
    public final void rule__Project__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1721:1: ( rule__Project__Group_8__0__Impl rule__Project__Group_8__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1722:2: rule__Project__Group_8__0__Impl rule__Project__Group_8__1
            {
            pushFollow(FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03471);
            rule__Project__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03474);
            rule__Project__Group_8__1();

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
    // $ANTLR end "rule__Project__Group_8__0"


    // $ANTLR start "rule__Project__Group_8__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1729:1: rule__Project__Group_8__0__Impl : ( 'constraints' ) ;
    public final void rule__Project__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1733:1: ( ( 'constraints' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1734:1: ( 'constraints' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1734:1: ( 'constraints' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1735:1: 'constraints'
            {
             before(grammarAccess.getProjectAccess().getConstraintsKeyword_8_0()); 
            match(input,22,FOLLOW_22_in_rule__Project__Group_8__0__Impl3502); 
             after(grammarAccess.getProjectAccess().getConstraintsKeyword_8_0()); 

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
    // $ANTLR end "rule__Project__Group_8__0__Impl"


    // $ANTLR start "rule__Project__Group_8__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1748:1: rule__Project__Group_8__1 : rule__Project__Group_8__1__Impl rule__Project__Group_8__2 ;
    public final void rule__Project__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1752:1: ( rule__Project__Group_8__1__Impl rule__Project__Group_8__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1753:2: rule__Project__Group_8__1__Impl rule__Project__Group_8__2
            {
            pushFollow(FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13533);
            rule__Project__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13536);
            rule__Project__Group_8__2();

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
    // $ANTLR end "rule__Project__Group_8__1"


    // $ANTLR start "rule__Project__Group_8__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1760:1: rule__Project__Group_8__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1764:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1765:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1765:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1766:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3563); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 

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
    // $ANTLR end "rule__Project__Group_8__1__Impl"


    // $ANTLR start "rule__Project__Group_8__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1777:1: rule__Project__Group_8__2 : rule__Project__Group_8__2__Impl rule__Project__Group_8__3 ;
    public final void rule__Project__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1781:1: ( rule__Project__Group_8__2__Impl rule__Project__Group_8__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1782:2: rule__Project__Group_8__2__Impl rule__Project__Group_8__3
            {
            pushFollow(FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23592);
            rule__Project__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23595);
            rule__Project__Group_8__3();

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
    // $ANTLR end "rule__Project__Group_8__2"


    // $ANTLR start "rule__Project__Group_8__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1789:1: rule__Project__Group_8__2__Impl : ( ( rule__Project__ConstraintsAssignment_8_2 )* ) ;
    public final void rule__Project__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1793:1: ( ( ( rule__Project__ConstraintsAssignment_8_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1794:1: ( ( rule__Project__ConstraintsAssignment_8_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1794:1: ( ( rule__Project__ConstraintsAssignment_8_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1795:1: ( rule__Project__ConstraintsAssignment_8_2 )*
            {
             before(grammarAccess.getProjectAccess().getConstraintsAssignment_8_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1796:1: ( rule__Project__ConstraintsAssignment_8_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1796:2: rule__Project__ConstraintsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__ConstraintsAssignment_8_2_in_rule__Project__Group_8__2__Impl3622);
            	    rule__Project__ConstraintsAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getConstraintsAssignment_8_2()); 

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
    // $ANTLR end "rule__Project__Group_8__2__Impl"


    // $ANTLR start "rule__Project__Group_8__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1806:1: rule__Project__Group_8__3 : rule__Project__Group_8__3__Impl ;
    public final void rule__Project__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1810:1: ( rule__Project__Group_8__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1811:2: rule__Project__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__33653);
            rule__Project__Group_8__3__Impl();

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
    // $ANTLR end "rule__Project__Group_8__3"


    // $ANTLR start "rule__Project__Group_8__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1817:1: rule__Project__Group_8__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1821:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1822:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1822:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1823:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl3680); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 

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
    // $ANTLR end "rule__Project__Group_8__3__Impl"


    // $ANTLR start "rule__Assumption__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1842:1: rule__Assumption__Group__0 : rule__Assumption__Group__0__Impl rule__Assumption__Group__1 ;
    public final void rule__Assumption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1846:1: ( rule__Assumption__Group__0__Impl rule__Assumption__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1847:2: rule__Assumption__Group__0__Impl rule__Assumption__Group__1
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__03717);
            rule__Assumption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__03720);
            rule__Assumption__Group__1();

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
    // $ANTLR end "rule__Assumption__Group__0"


    // $ANTLR start "rule__Assumption__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1854:1: rule__Assumption__Group__0__Impl : ( '-' ) ;
    public final void rule__Assumption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1858:1: ( ( '-' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1859:1: ( '-' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1859:1: ( '-' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1860:1: '-'
            {
             before(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Assumption__Group__0__Impl3748); 
             after(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Assumption__Group__0__Impl"


    // $ANTLR start "rule__Assumption__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1873:1: rule__Assumption__Group__1 : rule__Assumption__Group__1__Impl rule__Assumption__Group__2 ;
    public final void rule__Assumption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1877:1: ( rule__Assumption__Group__1__Impl rule__Assumption__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1878:2: rule__Assumption__Group__1__Impl rule__Assumption__Group__2
            {
            pushFollow(FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__13779);
            rule__Assumption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__13782);
            rule__Assumption__Group__2();

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
    // $ANTLR end "rule__Assumption__Group__1"


    // $ANTLR start "rule__Assumption__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1885:1: rule__Assumption__Group__1__Impl : ( ( rule__Assumption__ValueAssignment_1 ) ) ;
    public final void rule__Assumption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1889:1: ( ( ( rule__Assumption__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1891:1: ( rule__Assumption__ValueAssignment_1 )
            {
             before(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1892:1: ( rule__Assumption__ValueAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1892:2: rule__Assumption__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl3809);
            rule__Assumption__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Assumption__Group__1__Impl"


    // $ANTLR start "rule__Assumption__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1902:1: rule__Assumption__Group__2 : rule__Assumption__Group__2__Impl ;
    public final void rule__Assumption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1906:1: ( rule__Assumption__Group__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1907:2: rule__Assumption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__23839);
            rule__Assumption__Group__2__Impl();

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
    // $ANTLR end "rule__Assumption__Group__2"


    // $ANTLR start "rule__Assumption__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1913:1: rule__Assumption__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Assumption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1917:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1918:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1918:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1919:1: ruleENDLINE
            {
             before(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl3866);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 

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
    // $ANTLR end "rule__Assumption__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1936:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1940:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1941:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03901);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03904);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1948:1: rule__Constraint__Group__0__Impl : ( '-' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1952:1: ( ( '-' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1953:1: ( '-' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1953:1: ( '-' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1954:1: '-'
            {
             before(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Constraint__Group__0__Impl3932); 
             after(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1967:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1971:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1972:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13963);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13966);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1979:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ValueAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1983:1: ( ( ( rule__Constraint__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1984:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1984:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1985:1: ( rule__Constraint__ValueAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1986:1: ( rule__Constraint__ValueAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1986:2: rule__Constraint__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl3993);
            rule__Constraint__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1996:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2000:1: ( rule__Constraint__Group__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2001:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24023);
            rule__Constraint__Group__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2007:1: rule__Constraint__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2011:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2012:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2012:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2013:1: ruleENDLINE
            {
             before(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4050);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 

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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2030:1: rule__ActivityGroup__Group__0 : rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 ;
    public final void rule__ActivityGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2034:1: ( rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2035:2: rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04085);
            rule__ActivityGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04088);
            rule__ActivityGroup__Group__1();

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
    // $ANTLR end "rule__ActivityGroup__Group__0"


    // $ANTLR start "rule__ActivityGroup__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2042:1: rule__ActivityGroup__Group__0__Impl : ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) ;
    public final void rule__ActivityGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2046:1: ( ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2047:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2047:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2048:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2049:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ML_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2049:2: rule__ActivityGroup__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4115);
                    rule__ActivityGroup__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2059:1: rule__ActivityGroup__Group__1 : rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 ;
    public final void rule__ActivityGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2063:1: ( rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2064:2: rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14146);
            rule__ActivityGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14149);
            rule__ActivityGroup__Group__2();

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
    // $ANTLR end "rule__ActivityGroup__Group__1"


    // $ANTLR start "rule__ActivityGroup__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2071:1: rule__ActivityGroup__Group__1__Impl : ( 'Group' ) ;
    public final void rule__ActivityGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2075:1: ( ( 'Group' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2076:1: ( 'Group' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2076:1: ( 'Group' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2077:1: 'Group'
            {
             before(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ActivityGroup__Group__1__Impl4177); 
             after(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2090:1: rule__ActivityGroup__Group__2 : rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 ;
    public final void rule__ActivityGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2094:1: ( rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2095:2: rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24208);
            rule__ActivityGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24211);
            rule__ActivityGroup__Group__3();

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
    // $ANTLR end "rule__ActivityGroup__Group__2"


    // $ANTLR start "rule__ActivityGroup__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2102:1: rule__ActivityGroup__Group__2__Impl : ( ( rule__ActivityGroup__NameAssignment_2 ) ) ;
    public final void rule__ActivityGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2106:1: ( ( ( rule__ActivityGroup__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2107:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2107:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2108:1: ( rule__ActivityGroup__NameAssignment_2 )
            {
             before(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2109:1: ( rule__ActivityGroup__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2109:2: rule__ActivityGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4238);
            rule__ActivityGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2119:1: rule__ActivityGroup__Group__3 : rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 ;
    public final void rule__ActivityGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2123:1: ( rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2124:2: rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34268);
            rule__ActivityGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34271);
            rule__ActivityGroup__Group__4();

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
    // $ANTLR end "rule__ActivityGroup__Group__3"


    // $ANTLR start "rule__ActivityGroup__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2131:1: rule__ActivityGroup__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__ActivityGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2135:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2136:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2136:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2137:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4298); 
             after(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__3__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2148:1: rule__ActivityGroup__Group__4 : rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 ;
    public final void rule__ActivityGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2152:1: ( rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2153:2: rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44327);
            rule__ActivityGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44330);
            rule__ActivityGroup__Group__5();

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
    // $ANTLR end "rule__ActivityGroup__Group__4"


    // $ANTLR start "rule__ActivityGroup__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2160:1: rule__ActivityGroup__Group__4__Impl : ( ( rule__ActivityGroup__Group_4__0 )? ) ;
    public final void rule__ActivityGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2164:1: ( ( ( rule__ActivityGroup__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2165:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2165:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2166:1: ( rule__ActivityGroup__Group_4__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2167:1: ( rule__ActivityGroup__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2167:2: rule__ActivityGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4357);
                    rule__ActivityGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__4__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2177:1: rule__ActivityGroup__Group__5 : rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 ;
    public final void rule__ActivityGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2181:1: ( rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2182:2: rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__54388);
            rule__ActivityGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__54391);
            rule__ActivityGroup__Group__6();

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
    // $ANTLR end "rule__ActivityGroup__Group__5"


    // $ANTLR start "rule__ActivityGroup__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2189:1: rule__ActivityGroup__Group__5__Impl : ( ( rule__ActivityGroup__ActivitiesAssignment_5 )* ) ;
    public final void rule__ActivityGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2193:1: ( ( ( rule__ActivityGroup__ActivitiesAssignment_5 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2194:1: ( ( rule__ActivityGroup__ActivitiesAssignment_5 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2194:1: ( ( rule__ActivityGroup__ActivitiesAssignment_5 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2195:1: ( rule__ActivityGroup__ActivitiesAssignment_5 )*
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2196:1: ( rule__ActivityGroup__ActivitiesAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ML_COMMENT||LA22_0==24||LA22_0==30||LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2196:2: rule__ActivityGroup__ActivitiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__ActivitiesAssignment_5_in_rule__ActivityGroup__Group__5__Impl4418);
            	    rule__ActivityGroup__ActivitiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_5()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__5__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2206:1: rule__ActivityGroup__Group__6 : rule__ActivityGroup__Group__6__Impl ;
    public final void rule__ActivityGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2210:1: ( rule__ActivityGroup__Group__6__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2211:2: rule__ActivityGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__64449);
            rule__ActivityGroup__Group__6__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group__6"


    // $ANTLR start "rule__ActivityGroup__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2217:1: rule__ActivityGroup__Group__6__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__ActivityGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2221:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2222:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2222:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2223:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__6__Impl4476); 
             after(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__6__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2248:1: rule__ActivityGroup__Group_4__0 : rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 ;
    public final void rule__ActivityGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2252:1: ( rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2253:2: rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__04519);
            rule__ActivityGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__04522);
            rule__ActivityGroup__Group_4__1();

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
    // $ANTLR end "rule__ActivityGroup__Group_4__0"


    // $ANTLR start "rule__ActivityGroup__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2260:1: rule__ActivityGroup__Group_4__0__Impl : ( 'dependsOn' ) ;
    public final void rule__ActivityGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2264:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2265:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2265:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2266:1: 'dependsOn'
            {
             before(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__ActivityGroup__Group_4__0__Impl4550); 
             after(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_4_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2279:1: rule__ActivityGroup__Group_4__1 : rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 ;
    public final void rule__ActivityGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2283:1: ( rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2284:2: rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__14581);
            rule__ActivityGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__14584);
            rule__ActivityGroup__Group_4__2();

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
    // $ANTLR end "rule__ActivityGroup__Group_4__1"


    // $ANTLR start "rule__ActivityGroup__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2291:1: rule__ActivityGroup__Group_4__1__Impl : ( ( rule__ActivityGroup__DependenciesAssignment_4_1 )* ) ;
    public final void rule__ActivityGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2295:1: ( ( ( rule__ActivityGroup__DependenciesAssignment_4_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2296:1: ( ( rule__ActivityGroup__DependenciesAssignment_4_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2296:1: ( ( rule__ActivityGroup__DependenciesAssignment_4_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2297:1: ( rule__ActivityGroup__DependenciesAssignment_4_1 )*
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2298:1: ( rule__ActivityGroup__DependenciesAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2298:2: rule__ActivityGroup__DependenciesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__DependenciesAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl4611);
            	    rule__ActivityGroup__DependenciesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_4_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2308:1: rule__ActivityGroup__Group_4__2 : rule__ActivityGroup__Group_4__2__Impl ;
    public final void rule__ActivityGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2312:1: ( rule__ActivityGroup__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2313:2: rule__ActivityGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__24642);
            rule__ActivityGroup__Group_4__2__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group_4__2"


    // $ANTLR start "rule__ActivityGroup__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2319:1: rule__ActivityGroup__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2323:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2324:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2324:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2325:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl4669);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_4__2__Impl"


    // $ANTLR start "rule__WBSImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2342:1: rule__WBSImport__Group__0 : rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1 ;
    public final void rule__WBSImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2346:1: ( rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2347:2: rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__0__Impl_in_rule__WBSImport__Group__04704);
            rule__WBSImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSImport__Group__1_in_rule__WBSImport__Group__04707);
            rule__WBSImport__Group__1();

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
    // $ANTLR end "rule__WBSImport__Group__0"


    // $ANTLR start "rule__WBSImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2354:1: rule__WBSImport__Group__0__Impl : ( 'wbs' ) ;
    public final void rule__WBSImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2358:1: ( ( 'wbs' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2359:1: ( 'wbs' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2359:1: ( 'wbs' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2360:1: 'wbs'
            {
             before(grammarAccess.getWBSImportAccess().getWbsKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__WBSImport__Group__0__Impl4735); 
             after(grammarAccess.getWBSImportAccess().getWbsKeyword_0()); 

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
    // $ANTLR end "rule__WBSImport__Group__0__Impl"


    // $ANTLR start "rule__WBSImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2373:1: rule__WBSImport__Group__1 : rule__WBSImport__Group__1__Impl ;
    public final void rule__WBSImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2377:1: ( rule__WBSImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2378:2: rule__WBSImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__1__Impl_in_rule__WBSImport__Group__14766);
            rule__WBSImport__Group__1__Impl();

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
    // $ANTLR end "rule__WBSImport__Group__1"


    // $ANTLR start "rule__WBSImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2384:1: rule__WBSImport__Group__1__Impl : ( ( rule__WBSImport__ImportURIAssignment_1 ) ) ;
    public final void rule__WBSImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2388:1: ( ( ( rule__WBSImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2389:1: ( ( rule__WBSImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2389:1: ( ( rule__WBSImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2390:1: ( rule__WBSImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getWBSImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2391:1: ( rule__WBSImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2391:2: rule__WBSImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__WBSImport__ImportURIAssignment_1_in_rule__WBSImport__Group__1__Impl4793);
            rule__WBSImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWBSImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__WBSImport__Group__1__Impl"


    // $ANTLR start "rule__ResourcesImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2405:1: rule__ResourcesImport__Group__0 : rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1 ;
    public final void rule__ResourcesImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2409:1: ( rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2410:2: rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__0__Impl_in_rule__ResourcesImport__Group__04827);
            rule__ResourcesImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourcesImport__Group__1_in_rule__ResourcesImport__Group__04830);
            rule__ResourcesImport__Group__1();

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
    // $ANTLR end "rule__ResourcesImport__Group__0"


    // $ANTLR start "rule__ResourcesImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2417:1: rule__ResourcesImport__Group__0__Impl : ( 'resources' ) ;
    public final void rule__ResourcesImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2421:1: ( ( 'resources' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2422:1: ( 'resources' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2422:1: ( 'resources' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2423:1: 'resources'
            {
             before(grammarAccess.getResourcesImportAccess().getResourcesKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ResourcesImport__Group__0__Impl4858); 
             after(grammarAccess.getResourcesImportAccess().getResourcesKeyword_0()); 

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
    // $ANTLR end "rule__ResourcesImport__Group__0__Impl"


    // $ANTLR start "rule__ResourcesImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2436:1: rule__ResourcesImport__Group__1 : rule__ResourcesImport__Group__1__Impl ;
    public final void rule__ResourcesImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2440:1: ( rule__ResourcesImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2441:2: rule__ResourcesImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__1__Impl_in_rule__ResourcesImport__Group__14889);
            rule__ResourcesImport__Group__1__Impl();

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
    // $ANTLR end "rule__ResourcesImport__Group__1"


    // $ANTLR start "rule__ResourcesImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2447:1: rule__ResourcesImport__Group__1__Impl : ( ( rule__ResourcesImport__ImportURIAssignment_1 ) ) ;
    public final void rule__ResourcesImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2451:1: ( ( ( rule__ResourcesImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2452:1: ( ( rule__ResourcesImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2452:1: ( ( rule__ResourcesImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2453:1: ( rule__ResourcesImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getResourcesImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2454:1: ( rule__ResourcesImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2454:2: rule__ResourcesImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourcesImport__ImportURIAssignment_1_in_rule__ResourcesImport__Group__1__Impl4916);
            rule__ResourcesImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourcesImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__ResourcesImport__Group__1__Impl"


    // $ANTLR start "rule__PlanImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2468:1: rule__PlanImport__Group__0 : rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 ;
    public final void rule__PlanImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2472:1: ( rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2473:2: rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__04950);
            rule__PlanImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__04953);
            rule__PlanImport__Group__1();

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
    // $ANTLR end "rule__PlanImport__Group__0"


    // $ANTLR start "rule__PlanImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2480:1: rule__PlanImport__Group__0__Impl : ( 'plan' ) ;
    public final void rule__PlanImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2484:1: ( ( 'plan' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2485:1: ( 'plan' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2485:1: ( 'plan' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2486:1: 'plan'
            {
             before(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__PlanImport__Group__0__Impl4981); 
             after(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 

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
    // $ANTLR end "rule__PlanImport__Group__0__Impl"


    // $ANTLR start "rule__PlanImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2499:1: rule__PlanImport__Group__1 : rule__PlanImport__Group__1__Impl ;
    public final void rule__PlanImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2503:1: ( rule__PlanImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2504:2: rule__PlanImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__15012);
            rule__PlanImport__Group__1__Impl();

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
    // $ANTLR end "rule__PlanImport__Group__1"


    // $ANTLR start "rule__PlanImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2510:1: rule__PlanImport__Group__1__Impl : ( ( rule__PlanImport__ImportURIAssignment_1 ) ) ;
    public final void rule__PlanImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2514:1: ( ( ( rule__PlanImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2515:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2515:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2516:1: ( rule__PlanImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2517:1: ( rule__PlanImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2517:2: rule__PlanImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl5039);
            rule__PlanImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__PlanImport__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2531:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2535:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2536:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05073);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05076);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2543:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2547:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2548:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2548:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2549:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5103); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2560:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2564:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2565:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15132);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2571:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2575:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2576:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2576:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2577:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2578:1: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2578:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5159);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2592:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2596:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2597:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05194);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05197);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2604:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2608:1: ( ( '.' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2609:1: ( '.' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2609:1: ( '.' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2610:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl5225); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2623:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2627:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2628:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15256);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2634:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2638:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2639:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2639:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2640:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5283); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2656:1: rule__CheckPoint__Group__0 : rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1 ;
    public final void rule__CheckPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2660:1: ( rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2661:2: rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__0__Impl_in_rule__CheckPoint__Group__05317);
            rule__CheckPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__1_in_rule__CheckPoint__Group__05320);
            rule__CheckPoint__Group__1();

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
    // $ANTLR end "rule__CheckPoint__Group__0"


    // $ANTLR start "rule__CheckPoint__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2668:1: rule__CheckPoint__Group__0__Impl : ( ( rule__CheckPoint__DescriptionAssignment_0 )? ) ;
    public final void rule__CheckPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2672:1: ( ( ( rule__CheckPoint__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2673:1: ( ( rule__CheckPoint__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2673:1: ( ( rule__CheckPoint__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2674:1: ( rule__CheckPoint__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2675:1: ( rule__CheckPoint__DescriptionAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ML_COMMENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2675:2: rule__CheckPoint__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__DescriptionAssignment_0_in_rule__CheckPoint__Group__0__Impl5347);
                    rule__CheckPoint__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2685:1: rule__CheckPoint__Group__1 : rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2 ;
    public final void rule__CheckPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2689:1: ( rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2690:2: rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__1__Impl_in_rule__CheckPoint__Group__15378);
            rule__CheckPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__2_in_rule__CheckPoint__Group__15381);
            rule__CheckPoint__Group__2();

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
    // $ANTLR end "rule__CheckPoint__Group__1"


    // $ANTLR start "rule__CheckPoint__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2697:1: rule__CheckPoint__Group__1__Impl : ( 'CheckPoint' ) ;
    public final void rule__CheckPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2701:1: ( ( 'CheckPoint' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2702:1: ( 'CheckPoint' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2702:1: ( 'CheckPoint' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2703:1: 'CheckPoint'
            {
             before(grammarAccess.getCheckPointAccess().getCheckPointKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__CheckPoint__Group__1__Impl5409); 
             after(grammarAccess.getCheckPointAccess().getCheckPointKeyword_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2716:1: rule__CheckPoint__Group__2 : rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3 ;
    public final void rule__CheckPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2720:1: ( rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2721:2: rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__2__Impl_in_rule__CheckPoint__Group__25440);
            rule__CheckPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__3_in_rule__CheckPoint__Group__25443);
            rule__CheckPoint__Group__3();

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
    // $ANTLR end "rule__CheckPoint__Group__2"


    // $ANTLR start "rule__CheckPoint__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2728:1: rule__CheckPoint__Group__2__Impl : ( ( rule__CheckPoint__NameAssignment_2 ) ) ;
    public final void rule__CheckPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2732:1: ( ( ( rule__CheckPoint__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2733:1: ( ( rule__CheckPoint__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2733:1: ( ( rule__CheckPoint__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2734:1: ( rule__CheckPoint__NameAssignment_2 )
            {
             before(grammarAccess.getCheckPointAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2735:1: ( rule__CheckPoint__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2735:2: rule__CheckPoint__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckPoint__NameAssignment_2_in_rule__CheckPoint__Group__2__Impl5470);
            rule__CheckPoint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2745:1: rule__CheckPoint__Group__3 : rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4 ;
    public final void rule__CheckPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2749:1: ( rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2750:2: rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__3__Impl_in_rule__CheckPoint__Group__35500);
            rule__CheckPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__4_in_rule__CheckPoint__Group__35503);
            rule__CheckPoint__Group__4();

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
    // $ANTLR end "rule__CheckPoint__Group__3"


    // $ANTLR start "rule__CheckPoint__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2757:1: rule__CheckPoint__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__CheckPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2761:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2762:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2762:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2763:1: RULE_OPENCURLY
            {
             before(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group__3__Impl5530); 
             after(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2774:1: rule__CheckPoint__Group__4 : rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5 ;
    public final void rule__CheckPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2778:1: ( rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2779:2: rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__4__Impl_in_rule__CheckPoint__Group__45559);
            rule__CheckPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__5_in_rule__CheckPoint__Group__45562);
            rule__CheckPoint__Group__5();

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
    // $ANTLR end "rule__CheckPoint__Group__4"


    // $ANTLR start "rule__CheckPoint__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2786:1: rule__CheckPoint__Group__4__Impl : ( ( rule__CheckPoint__UnorderedGroup_4 ) ) ;
    public final void rule__CheckPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2790:1: ( ( ( rule__CheckPoint__UnorderedGroup_4 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2791:1: ( ( rule__CheckPoint__UnorderedGroup_4 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2791:1: ( ( rule__CheckPoint__UnorderedGroup_4 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2792:1: ( rule__CheckPoint__UnorderedGroup_4 )
            {
             before(grammarAccess.getCheckPointAccess().getUnorderedGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2793:1: ( rule__CheckPoint__UnorderedGroup_4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2793:2: rule__CheckPoint__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4_in_rule__CheckPoint__Group__4__Impl5589);
            rule__CheckPoint__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getUnorderedGroup_4()); 

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
    // $ANTLR end "rule__CheckPoint__Group__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2803:1: rule__CheckPoint__Group__5 : rule__CheckPoint__Group__5__Impl ;
    public final void rule__CheckPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2807:1: ( rule__CheckPoint__Group__5__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2808:2: rule__CheckPoint__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__5__Impl_in_rule__CheckPoint__Group__55619);
            rule__CheckPoint__Group__5__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group__5"


    // $ANTLR start "rule__CheckPoint__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2814:1: rule__CheckPoint__Group__5__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__CheckPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2818:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2819:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2819:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2820:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group__5__Impl5646); 
             after(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__CheckPoint__Group__5__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2843:1: rule__CheckPoint__Group_4_0_0__0 : rule__CheckPoint__Group_4_0_0__0__Impl rule__CheckPoint__Group_4_0_0__1 ;
    public final void rule__CheckPoint__Group_4_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2847:1: ( rule__CheckPoint__Group_4_0_0__0__Impl rule__CheckPoint__Group_4_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2848:2: rule__CheckPoint__Group_4_0_0__0__Impl rule__CheckPoint__Group_4_0_0__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_0__0__Impl_in_rule__CheckPoint__Group_4_0_0__05687);
            rule__CheckPoint__Group_4_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_0__1_in_rule__CheckPoint__Group_4_0_0__05690);
            rule__CheckPoint__Group_4_0_0__1();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_0__0"


    // $ANTLR start "rule__CheckPoint__Group_4_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2855:1: rule__CheckPoint__Group_4_0_0__0__Impl : ( 'date' ) ;
    public final void rule__CheckPoint__Group_4_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2859:1: ( ( 'date' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2860:1: ( 'date' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2860:1: ( 'date' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2861:1: 'date'
            {
             before(grammarAccess.getCheckPointAccess().getDateKeyword_4_0_0_0()); 
            match(input,31,FOLLOW_31_in_rule__CheckPoint__Group_4_0_0__0__Impl5718); 
             after(grammarAccess.getCheckPointAccess().getDateKeyword_4_0_0_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_0__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2874:1: rule__CheckPoint__Group_4_0_0__1 : rule__CheckPoint__Group_4_0_0__1__Impl rule__CheckPoint__Group_4_0_0__2 ;
    public final void rule__CheckPoint__Group_4_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2878:1: ( rule__CheckPoint__Group_4_0_0__1__Impl rule__CheckPoint__Group_4_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2879:2: rule__CheckPoint__Group_4_0_0__1__Impl rule__CheckPoint__Group_4_0_0__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_0__1__Impl_in_rule__CheckPoint__Group_4_0_0__15749);
            rule__CheckPoint__Group_4_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_0__2_in_rule__CheckPoint__Group_4_0_0__15752);
            rule__CheckPoint__Group_4_0_0__2();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_0__1"


    // $ANTLR start "rule__CheckPoint__Group_4_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2886:1: rule__CheckPoint__Group_4_0_0__1__Impl : ( ( rule__CheckPoint__EndAssignment_4_0_0_1 ) ) ;
    public final void rule__CheckPoint__Group_4_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2890:1: ( ( ( rule__CheckPoint__EndAssignment_4_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2891:1: ( ( rule__CheckPoint__EndAssignment_4_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2891:1: ( ( rule__CheckPoint__EndAssignment_4_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2892:1: ( rule__CheckPoint__EndAssignment_4_0_0_1 )
            {
             before(grammarAccess.getCheckPointAccess().getEndAssignment_4_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2893:1: ( rule__CheckPoint__EndAssignment_4_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2893:2: rule__CheckPoint__EndAssignment_4_0_0_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__EndAssignment_4_0_0_1_in_rule__CheckPoint__Group_4_0_0__1__Impl5779);
            rule__CheckPoint__EndAssignment_4_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getEndAssignment_4_0_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_0__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2903:1: rule__CheckPoint__Group_4_0_0__2 : rule__CheckPoint__Group_4_0_0__2__Impl ;
    public final void rule__CheckPoint__Group_4_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2907:1: ( rule__CheckPoint__Group_4_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2908:2: rule__CheckPoint__Group_4_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_0__2__Impl_in_rule__CheckPoint__Group_4_0_0__25809);
            rule__CheckPoint__Group_4_0_0__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_0__2"


    // $ANTLR start "rule__CheckPoint__Group_4_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2914:1: rule__CheckPoint__Group_4_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_4_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2918:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2919:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2919:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2920:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_0_0__2__Impl5836);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_0_0_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_0__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2937:1: rule__CheckPoint__Group_4_0_1__0 : rule__CheckPoint__Group_4_0_1__0__Impl rule__CheckPoint__Group_4_0_1__1 ;
    public final void rule__CheckPoint__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2941:1: ( rule__CheckPoint__Group_4_0_1__0__Impl rule__CheckPoint__Group_4_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2942:2: rule__CheckPoint__Group_4_0_1__0__Impl rule__CheckPoint__Group_4_0_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__0__Impl_in_rule__CheckPoint__Group_4_0_1__05871);
            rule__CheckPoint__Group_4_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__1_in_rule__CheckPoint__Group_4_0_1__05874);
            rule__CheckPoint__Group_4_0_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__0"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2949:1: rule__CheckPoint__Group_4_0_1__0__Impl : ( 'after' ) ;
    public final void rule__CheckPoint__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2953:1: ( ( 'after' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2954:1: ( 'after' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2954:1: ( 'after' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2955:1: 'after'
            {
             before(grammarAccess.getCheckPointAccess().getAfterKeyword_4_0_1_0()); 
            match(input,32,FOLLOW_32_in_rule__CheckPoint__Group_4_0_1__0__Impl5902); 
             after(grammarAccess.getCheckPointAccess().getAfterKeyword_4_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2968:1: rule__CheckPoint__Group_4_0_1__1 : rule__CheckPoint__Group_4_0_1__1__Impl rule__CheckPoint__Group_4_0_1__2 ;
    public final void rule__CheckPoint__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2972:1: ( rule__CheckPoint__Group_4_0_1__1__Impl rule__CheckPoint__Group_4_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2973:2: rule__CheckPoint__Group_4_0_1__1__Impl rule__CheckPoint__Group_4_0_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__1__Impl_in_rule__CheckPoint__Group_4_0_1__15933);
            rule__CheckPoint__Group_4_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__2_in_rule__CheckPoint__Group_4_0_1__15936);
            rule__CheckPoint__Group_4_0_1__2();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__1"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2980:1: rule__CheckPoint__Group_4_0_1__1__Impl : ( ( rule__CheckPoint__AfterAssignment_4_0_1_1 ) ) ;
    public final void rule__CheckPoint__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2984:1: ( ( ( rule__CheckPoint__AfterAssignment_4_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2985:1: ( ( rule__CheckPoint__AfterAssignment_4_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2985:1: ( ( rule__CheckPoint__AfterAssignment_4_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2986:1: ( rule__CheckPoint__AfterAssignment_4_0_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getAfterAssignment_4_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2987:1: ( rule__CheckPoint__AfterAssignment_4_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2987:2: rule__CheckPoint__AfterAssignment_4_0_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__AfterAssignment_4_0_1_1_in_rule__CheckPoint__Group_4_0_1__1__Impl5963);
            rule__CheckPoint__AfterAssignment_4_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getAfterAssignment_4_0_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2997:1: rule__CheckPoint__Group_4_0_1__2 : rule__CheckPoint__Group_4_0_1__2__Impl rule__CheckPoint__Group_4_0_1__3 ;
    public final void rule__CheckPoint__Group_4_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3001:1: ( rule__CheckPoint__Group_4_0_1__2__Impl rule__CheckPoint__Group_4_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3002:2: rule__CheckPoint__Group_4_0_1__2__Impl rule__CheckPoint__Group_4_0_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__2__Impl_in_rule__CheckPoint__Group_4_0_1__25993);
            rule__CheckPoint__Group_4_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__3_in_rule__CheckPoint__Group_4_0_1__25996);
            rule__CheckPoint__Group_4_0_1__3();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__2"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3009:1: rule__CheckPoint__Group_4_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__CheckPoint__Group_4_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3013:1: ( ( 'offset' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3014:1: ( 'offset' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3014:1: ( 'offset' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3015:1: 'offset'
            {
             before(grammarAccess.getCheckPointAccess().getOffsetKeyword_4_0_1_2()); 
            match(input,33,FOLLOW_33_in_rule__CheckPoint__Group_4_0_1__2__Impl6024); 
             after(grammarAccess.getCheckPointAccess().getOffsetKeyword_4_0_1_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3028:1: rule__CheckPoint__Group_4_0_1__3 : rule__CheckPoint__Group_4_0_1__3__Impl rule__CheckPoint__Group_4_0_1__4 ;
    public final void rule__CheckPoint__Group_4_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3032:1: ( rule__CheckPoint__Group_4_0_1__3__Impl rule__CheckPoint__Group_4_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3033:2: rule__CheckPoint__Group_4_0_1__3__Impl rule__CheckPoint__Group_4_0_1__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__3__Impl_in_rule__CheckPoint__Group_4_0_1__36055);
            rule__CheckPoint__Group_4_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__4_in_rule__CheckPoint__Group_4_0_1__36058);
            rule__CheckPoint__Group_4_0_1__4();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__3"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3040:1: rule__CheckPoint__Group_4_0_1__3__Impl : ( ( rule__CheckPoint__OffsetAssignment_4_0_1_3 ) ) ;
    public final void rule__CheckPoint__Group_4_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3044:1: ( ( ( rule__CheckPoint__OffsetAssignment_4_0_1_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3045:1: ( ( rule__CheckPoint__OffsetAssignment_4_0_1_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3045:1: ( ( rule__CheckPoint__OffsetAssignment_4_0_1_3 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3046:1: ( rule__CheckPoint__OffsetAssignment_4_0_1_3 )
            {
             before(grammarAccess.getCheckPointAccess().getOffsetAssignment_4_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3047:1: ( rule__CheckPoint__OffsetAssignment_4_0_1_3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3047:2: rule__CheckPoint__OffsetAssignment_4_0_1_3
            {
            pushFollow(FOLLOW_rule__CheckPoint__OffsetAssignment_4_0_1_3_in_rule__CheckPoint__Group_4_0_1__3__Impl6085);
            rule__CheckPoint__OffsetAssignment_4_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getOffsetAssignment_4_0_1_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3057:1: rule__CheckPoint__Group_4_0_1__4 : rule__CheckPoint__Group_4_0_1__4__Impl ;
    public final void rule__CheckPoint__Group_4_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3061:1: ( rule__CheckPoint__Group_4_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3062:2: rule__CheckPoint__Group_4_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_0_1__4__Impl_in_rule__CheckPoint__Group_4_0_1__46115);
            rule__CheckPoint__Group_4_0_1__4__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__4"


    // $ANTLR start "rule__CheckPoint__Group_4_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3068:1: rule__CheckPoint__Group_4_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_4_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3072:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3073:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3073:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3074:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_0_1__4__Impl6142);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_0_1_4()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_0_1__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3095:1: rule__CheckPoint__Group_4_1__0 : rule__CheckPoint__Group_4_1__0__Impl rule__CheckPoint__Group_4_1__1 ;
    public final void rule__CheckPoint__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3099:1: ( rule__CheckPoint__Group_4_1__0__Impl rule__CheckPoint__Group_4_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3100:2: rule__CheckPoint__Group_4_1__0__Impl rule__CheckPoint__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__0__Impl_in_rule__CheckPoint__Group_4_1__06181);
            rule__CheckPoint__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__1_in_rule__CheckPoint__Group_4_1__06184);
            rule__CheckPoint__Group_4_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__0"


    // $ANTLR start "rule__CheckPoint__Group_4_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3107:1: rule__CheckPoint__Group_4_1__0__Impl : ( 'completeness' ) ;
    public final void rule__CheckPoint__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3111:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3112:1: ( 'completeness' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3112:1: ( 'completeness' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3113:1: 'completeness'
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessKeyword_4_1_0()); 
            match(input,34,FOLLOW_34_in_rule__CheckPoint__Group_4_1__0__Impl6212); 
             after(grammarAccess.getCheckPointAccess().getCompletenessKeyword_4_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3126:1: rule__CheckPoint__Group_4_1__1 : rule__CheckPoint__Group_4_1__1__Impl rule__CheckPoint__Group_4_1__2 ;
    public final void rule__CheckPoint__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3130:1: ( rule__CheckPoint__Group_4_1__1__Impl rule__CheckPoint__Group_4_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3131:2: rule__CheckPoint__Group_4_1__1__Impl rule__CheckPoint__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__1__Impl_in_rule__CheckPoint__Group_4_1__16243);
            rule__CheckPoint__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__2_in_rule__CheckPoint__Group_4_1__16246);
            rule__CheckPoint__Group_4_1__2();

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__1"


    // $ANTLR start "rule__CheckPoint__Group_4_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3138:1: rule__CheckPoint__Group_4_1__1__Impl : ( ( rule__CheckPoint__CompletenessAssignment_4_1_1 ) ) ;
    public final void rule__CheckPoint__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3142:1: ( ( ( rule__CheckPoint__CompletenessAssignment_4_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3143:1: ( ( rule__CheckPoint__CompletenessAssignment_4_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3143:1: ( ( rule__CheckPoint__CompletenessAssignment_4_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3144:1: ( rule__CheckPoint__CompletenessAssignment_4_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessAssignment_4_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3145:1: ( rule__CheckPoint__CompletenessAssignment_4_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3145:2: rule__CheckPoint__CompletenessAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__CompletenessAssignment_4_1_1_in_rule__CheckPoint__Group_4_1__1__Impl6273);
            rule__CheckPoint__CompletenessAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getCompletenessAssignment_4_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3155:1: rule__CheckPoint__Group_4_1__2 : rule__CheckPoint__Group_4_1__2__Impl rule__CheckPoint__Group_4_1__3 ;
    public final void rule__CheckPoint__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3159:1: ( rule__CheckPoint__Group_4_1__2__Impl rule__CheckPoint__Group_4_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3160:2: rule__CheckPoint__Group_4_1__2__Impl rule__CheckPoint__Group_4_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__2__Impl_in_rule__CheckPoint__Group_4_1__26303);
            rule__CheckPoint__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__3_in_rule__CheckPoint__Group_4_1__26306);
            rule__CheckPoint__Group_4_1__3();

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__2"


    // $ANTLR start "rule__CheckPoint__Group_4_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3167:1: rule__CheckPoint__Group_4_1__2__Impl : ( '%' ) ;
    public final void rule__CheckPoint__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3171:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3172:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3172:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3173:1: '%'
            {
             before(grammarAccess.getCheckPointAccess().getPercentSignKeyword_4_1_2()); 
            match(input,35,FOLLOW_35_in_rule__CheckPoint__Group_4_1__2__Impl6334); 
             after(grammarAccess.getCheckPointAccess().getPercentSignKeyword_4_1_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3186:1: rule__CheckPoint__Group_4_1__3 : rule__CheckPoint__Group_4_1__3__Impl ;
    public final void rule__CheckPoint__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3190:1: ( rule__CheckPoint__Group_4_1__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3191:2: rule__CheckPoint__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__3__Impl_in_rule__CheckPoint__Group_4_1__36365);
            rule__CheckPoint__Group_4_1__3__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__3"


    // $ANTLR start "rule__CheckPoint__Group_4_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3197:1: rule__CheckPoint__Group_4_1__3__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3201:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3202:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3202:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3203:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_1_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_1__3__Impl6392);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_1_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3222:1: rule__CheckPoint__Group_4_2__0 : rule__CheckPoint__Group_4_2__0__Impl rule__CheckPoint__Group_4_2__1 ;
    public final void rule__CheckPoint__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3226:1: ( rule__CheckPoint__Group_4_2__0__Impl rule__CheckPoint__Group_4_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3227:2: rule__CheckPoint__Group_4_2__0__Impl rule__CheckPoint__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_2__0__Impl_in_rule__CheckPoint__Group_4_2__06429);
            rule__CheckPoint__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_2__1_in_rule__CheckPoint__Group_4_2__06432);
            rule__CheckPoint__Group_4_2__1();

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
    // $ANTLR end "rule__CheckPoint__Group_4_2__0"


    // $ANTLR start "rule__CheckPoint__Group_4_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3234:1: rule__CheckPoint__Group_4_2__0__Impl : ( 'dependsOn' ) ;
    public final void rule__CheckPoint__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3238:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3239:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3239:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3240:1: 'dependsOn'
            {
             before(grammarAccess.getCheckPointAccess().getDependsOnKeyword_4_2_0()); 
            match(input,25,FOLLOW_25_in_rule__CheckPoint__Group_4_2__0__Impl6460); 
             after(grammarAccess.getCheckPointAccess().getDependsOnKeyword_4_2_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_2__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3253:1: rule__CheckPoint__Group_4_2__1 : rule__CheckPoint__Group_4_2__1__Impl rule__CheckPoint__Group_4_2__2 ;
    public final void rule__CheckPoint__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3257:1: ( rule__CheckPoint__Group_4_2__1__Impl rule__CheckPoint__Group_4_2__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3258:2: rule__CheckPoint__Group_4_2__1__Impl rule__CheckPoint__Group_4_2__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_2__1__Impl_in_rule__CheckPoint__Group_4_2__16491);
            rule__CheckPoint__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4_2__2_in_rule__CheckPoint__Group_4_2__16494);
            rule__CheckPoint__Group_4_2__2();

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
    // $ANTLR end "rule__CheckPoint__Group_4_2__1"


    // $ANTLR start "rule__CheckPoint__Group_4_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3265:1: rule__CheckPoint__Group_4_2__1__Impl : ( ( rule__CheckPoint__DependenciesAssignment_4_2_1 )* ) ;
    public final void rule__CheckPoint__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3269:1: ( ( ( rule__CheckPoint__DependenciesAssignment_4_2_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3270:1: ( ( rule__CheckPoint__DependenciesAssignment_4_2_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3270:1: ( ( rule__CheckPoint__DependenciesAssignment_4_2_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3271:1: ( rule__CheckPoint__DependenciesAssignment_4_2_1 )*
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesAssignment_4_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3272:1: ( rule__CheckPoint__DependenciesAssignment_4_2_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3272:2: rule__CheckPoint__DependenciesAssignment_4_2_1
            	    {
            	    pushFollow(FOLLOW_rule__CheckPoint__DependenciesAssignment_4_2_1_in_rule__CheckPoint__Group_4_2__1__Impl6521);
            	    rule__CheckPoint__DependenciesAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCheckPointAccess().getDependenciesAssignment_4_2_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_2__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4_2__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3282:1: rule__CheckPoint__Group_4_2__2 : rule__CheckPoint__Group_4_2__2__Impl ;
    public final void rule__CheckPoint__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3286:1: ( rule__CheckPoint__Group_4_2__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3287:2: rule__CheckPoint__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4_2__2__Impl_in_rule__CheckPoint__Group_4_2__26552);
            rule__CheckPoint__Group_4_2__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_4_2__2"


    // $ANTLR start "rule__CheckPoint__Group_4_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3293:1: rule__CheckPoint__Group_4_2__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3297:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3298:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3298:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3299:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_2__2__Impl6579);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4_2__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3316:1: rule__ResourceInvolvement__Group__0 : rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 ;
    public final void rule__ResourceInvolvement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3320:1: ( rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3321:2: rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__06614);
            rule__ResourceInvolvement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__06617);
            rule__ResourceInvolvement__Group__1();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__0"


    // $ANTLR start "rule__ResourceInvolvement__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3328:1: rule__ResourceInvolvement__Group__0__Impl : ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) ;
    public final void rule__ResourceInvolvement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3332:1: ( ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3333:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3333:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3334:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3335:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3335:2: rule__ResourceInvolvement__ResourceAssignment_0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl6644);
            rule__ResourceInvolvement__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3345:1: rule__ResourceInvolvement__Group__1 : rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 ;
    public final void rule__ResourceInvolvement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3349:1: ( rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3350:2: rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__16674);
            rule__ResourceInvolvement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__16677);
            rule__ResourceInvolvement__Group__2();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__1"


    // $ANTLR start "rule__ResourceInvolvement__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3357:1: rule__ResourceInvolvement__Group__1__Impl : ( ( rule__ResourceInvolvement__Group_1__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3361:1: ( ( ( rule__ResourceInvolvement__Group_1__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3362:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3362:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3363:1: ( rule__ResourceInvolvement__Group_1__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3364:1: ( rule__ResourceInvolvement__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3364:2: rule__ResourceInvolvement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl6704);
                    rule__ResourceInvolvement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__1__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3374:1: rule__ResourceInvolvement__Group__2 : rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 ;
    public final void rule__ResourceInvolvement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3378:1: ( rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3379:2: rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__26735);
            rule__ResourceInvolvement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__26738);
            rule__ResourceInvolvement__Group__3();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__2"


    // $ANTLR start "rule__ResourceInvolvement__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3386:1: rule__ResourceInvolvement__Group__2__Impl : ( ( rule__ResourceInvolvement__Group_2__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3390:1: ( ( ( rule__ResourceInvolvement__Group_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3391:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3391:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3392:1: ( rule__ResourceInvolvement__Group_2__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3393:1: ( rule__ResourceInvolvement__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3393:2: rule__ResourceInvolvement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl6765);
                    rule__ResourceInvolvement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3403:1: rule__ResourceInvolvement__Group__3 : rule__ResourceInvolvement__Group__3__Impl ;
    public final void rule__ResourceInvolvement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3407:1: ( rule__ResourceInvolvement__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3408:2: rule__ResourceInvolvement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__36796);
            rule__ResourceInvolvement__Group__3__Impl();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__3"


    // $ANTLR start "rule__ResourceInvolvement__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3414:1: rule__ResourceInvolvement__Group__3__Impl : ( ruleENDLINE ) ;
    public final void rule__ResourceInvolvement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3418:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3419:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3419:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3420:1: ruleENDLINE
            {
             before(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl6823);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__3__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3439:1: rule__ResourceInvolvement__Group_1__0 : rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 ;
    public final void rule__ResourceInvolvement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3443:1: ( rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3444:2: rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__06860);
            rule__ResourceInvolvement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__06863);
            rule__ResourceInvolvement__Group_1__1();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__0"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3451:1: rule__ResourceInvolvement__Group_1__0__Impl : ( 'at' ) ;
    public final void rule__ResourceInvolvement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3455:1: ( ( 'at' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3456:1: ( 'at' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3456:1: ( 'at' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3457:1: 'at'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__ResourceInvolvement__Group_1__0__Impl6891); 
             after(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3470:1: rule__ResourceInvolvement__Group_1__1 : rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 ;
    public final void rule__ResourceInvolvement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3474:1: ( rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3475:2: rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__16922);
            rule__ResourceInvolvement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__16925);
            rule__ResourceInvolvement__Group_1__2();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__1"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3482:1: rule__ResourceInvolvement__Group_1__1__Impl : ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3486:1: ( ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3487:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3487:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3488:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3489:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3489:2: rule__ResourceInvolvement__OccupationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl6952);
            rule__ResourceInvolvement__OccupationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__1__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3499:1: rule__ResourceInvolvement__Group_1__2 : rule__ResourceInvolvement__Group_1__2__Impl ;
    public final void rule__ResourceInvolvement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3503:1: ( rule__ResourceInvolvement__Group_1__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3504:2: rule__ResourceInvolvement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__26982);
            rule__ResourceInvolvement__Group_1__2__Impl();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__2"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3510:1: rule__ResourceInvolvement__Group_1__2__Impl : ( '%' ) ;
    public final void rule__ResourceInvolvement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3514:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3515:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3515:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3516:1: '%'
            {
             before(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__ResourceInvolvement__Group_1__2__Impl7010); 
             after(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3535:1: rule__ResourceInvolvement__Group_2__0 : rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 ;
    public final void rule__ResourceInvolvement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3539:1: ( rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3540:2: rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__07047);
            rule__ResourceInvolvement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__07050);
            rule__ResourceInvolvement__Group_2__1();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__0"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3547:1: rule__ResourceInvolvement__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ResourceInvolvement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3551:1: ( ( 'as' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3552:1: ( 'as' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3552:1: ( 'as' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3553:1: 'as'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__ResourceInvolvement__Group_2__0__Impl7078); 
             after(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3566:1: rule__ResourceInvolvement__Group_2__1 : rule__ResourceInvolvement__Group_2__1__Impl ;
    public final void rule__ResourceInvolvement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3570:1: ( rule__ResourceInvolvement__Group_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3571:2: rule__ResourceInvolvement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__17109);
            rule__ResourceInvolvement__Group_2__1__Impl();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__1"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3577:1: rule__ResourceInvolvement__Group_2__1__Impl : ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3581:1: ( ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3582:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3582:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3583:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3584:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3584:2: rule__ResourceInvolvement__ResponsibilityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl7136);
            rule__ResourceInvolvement__ResponsibilityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3598:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3602:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3603:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__07170);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__07173);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3610:1: rule__Activity__Group__0__Impl : ( ( rule__Activity__DescriptionAssignment_0 )? ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3614:1: ( ( ( rule__Activity__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3615:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3615:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3616:1: ( rule__Activity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3617:1: ( rule__Activity__DescriptionAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ML_COMMENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3617:2: rule__Activity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl7200);
                    rule__Activity__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3627:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3631:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3632:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__17231);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__17234);
            rule__Activity__Group__2();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3639:1: rule__Activity__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3643:1: ( ( 'Activity' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3644:1: ( 'Activity' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3644:1: ( 'Activity' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3645:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Activity__Group__1__Impl7262); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 

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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3658:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3662:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3663:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__27293);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__27296);
            rule__Activity__Group__3();

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
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3670:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3674:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3675:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3675:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3676:1: ( rule__Activity__NameAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3677:1: ( rule__Activity__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3677:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl7323);
            rule__Activity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3687:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3691:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3692:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__37353);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__37356);
            rule__Activity__Group__4();

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
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3699:1: rule__Activity__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3703:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3704:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3704:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3705:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl7383); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3716:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3720:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3721:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__47412);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__47415);
            rule__Activity__Group__5();

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
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3728:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3732:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3733:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3733:1: ( ( rule__Activity__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3734:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3735:1: ( rule__Activity__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3735:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl7442);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3745:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3749:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3750:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__57473);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__57476);
            rule__Activity__Group__6();

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
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3757:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__UnorderedGroup_5 ) ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3761:1: ( ( ( rule__Activity__UnorderedGroup_5 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3762:1: ( ( rule__Activity__UnorderedGroup_5 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3762:1: ( ( rule__Activity__UnorderedGroup_5 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3763:1: ( rule__Activity__UnorderedGroup_5 )
            {
             before(grammarAccess.getActivityAccess().getUnorderedGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3764:1: ( rule__Activity__UnorderedGroup_5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3764:2: rule__Activity__UnorderedGroup_5
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5_in_rule__Activity__Group__5__Impl7503);
            rule__Activity__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getUnorderedGroup_5()); 

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
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3774:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3778:1: ( rule__Activity__Group__6__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3779:2: rule__Activity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__67533);
            rule__Activity__Group__6__Impl();

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
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3785:1: rule__Activity__Group__6__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3789:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3790:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3790:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3791:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__6__Impl7560); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3816:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3820:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3821:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__07603);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__07606);
            rule__Activity__Group_4__1();

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
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3828:1: rule__Activity__Group_4__0__Impl : ( 'involves' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3832:1: ( ( 'involves' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3833:1: ( 'involves' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3833:1: ( 'involves' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3834:1: 'involves'
            {
             before(grammarAccess.getActivityAccess().getInvolvesKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__Activity__Group_4__0__Impl7634); 
             after(grammarAccess.getActivityAccess().getInvolvesKeyword_4_0()); 

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
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3847:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3851:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3852:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17665);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__17668);
            rule__Activity__Group_4__2();

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
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3859:1: rule__Activity__Group_4__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3863:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3864:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3864:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3865:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_4_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_4__1__Impl7695); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3876:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3880:1: ( rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3881:2: rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__27724);
            rule__Activity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__3_in_rule__Activity__Group_4__27727);
            rule__Activity__Group_4__3();

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
    // $ANTLR end "rule__Activity__Group_4__2"


    // $ANTLR start "rule__Activity__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3888:1: rule__Activity__Group_4__2__Impl : ( ( rule__Activity__InvolvedResourcesAssignment_4_2 )* ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3892:1: ( ( ( rule__Activity__InvolvedResourcesAssignment_4_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3893:1: ( ( rule__Activity__InvolvedResourcesAssignment_4_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3893:1: ( ( rule__Activity__InvolvedResourcesAssignment_4_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3894:1: ( rule__Activity__InvolvedResourcesAssignment_4_2 )*
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_4_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3895:1: ( rule__Activity__InvolvedResourcesAssignment_4_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3895:2: rule__Activity__InvolvedResourcesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InvolvedResourcesAssignment_4_2_in_rule__Activity__Group_4__2__Impl7754);
            	    rule__Activity__InvolvedResourcesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_4_2()); 

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
    // $ANTLR end "rule__Activity__Group_4__2__Impl"


    // $ANTLR start "rule__Activity__Group_4__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3905:1: rule__Activity__Group_4__3 : rule__Activity__Group_4__3__Impl ;
    public final void rule__Activity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3909:1: ( rule__Activity__Group_4__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3910:2: rule__Activity__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__3__Impl_in_rule__Activity__Group_4__37785);
            rule__Activity__Group_4__3__Impl();

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
    // $ANTLR end "rule__Activity__Group_4__3"


    // $ANTLR start "rule__Activity__Group_4__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3916:1: rule__Activity__Group_4__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3920:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3921:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3921:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3922:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_4_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_4__3__Impl7812); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_4_3()); 

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
    // $ANTLR end "rule__Activity__Group_4__3__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3941:1: rule__Activity__Group_5_0_0__0 : rule__Activity__Group_5_0_0__0__Impl rule__Activity__Group_5_0_0__1 ;
    public final void rule__Activity__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3945:1: ( rule__Activity__Group_5_0_0__0__Impl rule__Activity__Group_5_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3946:2: rule__Activity__Group_5_0_0__0__Impl rule__Activity__Group_5_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_0__0__Impl_in_rule__Activity__Group_5_0_0__07849);
            rule__Activity__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_0_0__1_in_rule__Activity__Group_5_0_0__07852);
            rule__Activity__Group_5_0_0__1();

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
    // $ANTLR end "rule__Activity__Group_5_0_0__0"


    // $ANTLR start "rule__Activity__Group_5_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3953:1: rule__Activity__Group_5_0_0__0__Impl : ( 'starts' ) ;
    public final void rule__Activity__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3957:1: ( ( 'starts' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3958:1: ( 'starts' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3958:1: ( 'starts' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3959:1: 'starts'
            {
             before(grammarAccess.getActivityAccess().getStartsKeyword_5_0_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Activity__Group_5_0_0__0__Impl7880); 
             after(grammarAccess.getActivityAccess().getStartsKeyword_5_0_0_0()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3972:1: rule__Activity__Group_5_0_0__1 : rule__Activity__Group_5_0_0__1__Impl rule__Activity__Group_5_0_0__2 ;
    public final void rule__Activity__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3976:1: ( rule__Activity__Group_5_0_0__1__Impl rule__Activity__Group_5_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3977:2: rule__Activity__Group_5_0_0__1__Impl rule__Activity__Group_5_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_0__1__Impl_in_rule__Activity__Group_5_0_0__17911);
            rule__Activity__Group_5_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_0_0__2_in_rule__Activity__Group_5_0_0__17914);
            rule__Activity__Group_5_0_0__2();

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
    // $ANTLR end "rule__Activity__Group_5_0_0__1"


    // $ANTLR start "rule__Activity__Group_5_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3984:1: rule__Activity__Group_5_0_0__1__Impl : ( ( rule__Activity__StartAssignment_5_0_0_1 ) ) ;
    public final void rule__Activity__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3988:1: ( ( ( rule__Activity__StartAssignment_5_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3989:1: ( ( rule__Activity__StartAssignment_5_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3989:1: ( ( rule__Activity__StartAssignment_5_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3990:1: ( rule__Activity__StartAssignment_5_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getStartAssignment_5_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3991:1: ( rule__Activity__StartAssignment_5_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3991:2: rule__Activity__StartAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__StartAssignment_5_0_0_1_in_rule__Activity__Group_5_0_0__1__Impl7941);
            rule__Activity__StartAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getStartAssignment_5_0_0_1()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4001:1: rule__Activity__Group_5_0_0__2 : rule__Activity__Group_5_0_0__2__Impl ;
    public final void rule__Activity__Group_5_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4005:1: ( rule__Activity__Group_5_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4006:2: rule__Activity__Group_5_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_0__2__Impl_in_rule__Activity__Group_5_0_0__27971);
            rule__Activity__Group_5_0_0__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_5_0_0__2"


    // $ANTLR start "rule__Activity__Group_5_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4012:1: rule__Activity__Group_5_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_5_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4016:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4017:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4017:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4018:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_0_0__2__Impl7998);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_0_0_2()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4035:1: rule__Activity__Group_5_0_1__0 : rule__Activity__Group_5_0_1__0__Impl rule__Activity__Group_5_0_1__1 ;
    public final void rule__Activity__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4039:1: ( rule__Activity__Group_5_0_1__0__Impl rule__Activity__Group_5_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4040:2: rule__Activity__Group_5_0_1__0__Impl rule__Activity__Group_5_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__0__Impl_in_rule__Activity__Group_5_0_1__08033);
            rule__Activity__Group_5_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__1_in_rule__Activity__Group_5_0_1__08036);
            rule__Activity__Group_5_0_1__1();

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
    // $ANTLR end "rule__Activity__Group_5_0_1__0"


    // $ANTLR start "rule__Activity__Group_5_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4047:1: rule__Activity__Group_5_0_1__0__Impl : ( 'after' ) ;
    public final void rule__Activity__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4051:1: ( ( 'after' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4052:1: ( 'after' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4052:1: ( 'after' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4053:1: 'after'
            {
             before(grammarAccess.getActivityAccess().getAfterKeyword_5_0_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Activity__Group_5_0_1__0__Impl8064); 
             after(grammarAccess.getActivityAccess().getAfterKeyword_5_0_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4066:1: rule__Activity__Group_5_0_1__1 : rule__Activity__Group_5_0_1__1__Impl rule__Activity__Group_5_0_1__2 ;
    public final void rule__Activity__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4070:1: ( rule__Activity__Group_5_0_1__1__Impl rule__Activity__Group_5_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4071:2: rule__Activity__Group_5_0_1__1__Impl rule__Activity__Group_5_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__1__Impl_in_rule__Activity__Group_5_0_1__18095);
            rule__Activity__Group_5_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__2_in_rule__Activity__Group_5_0_1__18098);
            rule__Activity__Group_5_0_1__2();

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
    // $ANTLR end "rule__Activity__Group_5_0_1__1"


    // $ANTLR start "rule__Activity__Group_5_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4078:1: rule__Activity__Group_5_0_1__1__Impl : ( ( rule__Activity__AfterAssignment_5_0_1_1 ) ) ;
    public final void rule__Activity__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4082:1: ( ( ( rule__Activity__AfterAssignment_5_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4083:1: ( ( rule__Activity__AfterAssignment_5_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4083:1: ( ( rule__Activity__AfterAssignment_5_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4084:1: ( rule__Activity__AfterAssignment_5_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getAfterAssignment_5_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4085:1: ( rule__Activity__AfterAssignment_5_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4085:2: rule__Activity__AfterAssignment_5_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__AfterAssignment_5_0_1_1_in_rule__Activity__Group_5_0_1__1__Impl8125);
            rule__Activity__AfterAssignment_5_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAfterAssignment_5_0_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4095:1: rule__Activity__Group_5_0_1__2 : rule__Activity__Group_5_0_1__2__Impl rule__Activity__Group_5_0_1__3 ;
    public final void rule__Activity__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4099:1: ( rule__Activity__Group_5_0_1__2__Impl rule__Activity__Group_5_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4100:2: rule__Activity__Group_5_0_1__2__Impl rule__Activity__Group_5_0_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__2__Impl_in_rule__Activity__Group_5_0_1__28155);
            rule__Activity__Group_5_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__3_in_rule__Activity__Group_5_0_1__28158);
            rule__Activity__Group_5_0_1__3();

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
    // $ANTLR end "rule__Activity__Group_5_0_1__2"


    // $ANTLR start "rule__Activity__Group_5_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4107:1: rule__Activity__Group_5_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__Activity__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4111:1: ( ( 'offset' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4112:1: ( 'offset' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4112:1: ( 'offset' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4113:1: 'offset'
            {
             before(grammarAccess.getActivityAccess().getOffsetKeyword_5_0_1_2()); 
            match(input,33,FOLLOW_33_in_rule__Activity__Group_5_0_1__2__Impl8186); 
             after(grammarAccess.getActivityAccess().getOffsetKeyword_5_0_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4126:1: rule__Activity__Group_5_0_1__3 : rule__Activity__Group_5_0_1__3__Impl rule__Activity__Group_5_0_1__4 ;
    public final void rule__Activity__Group_5_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4130:1: ( rule__Activity__Group_5_0_1__3__Impl rule__Activity__Group_5_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4131:2: rule__Activity__Group_5_0_1__3__Impl rule__Activity__Group_5_0_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__3__Impl_in_rule__Activity__Group_5_0_1__38217);
            rule__Activity__Group_5_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__4_in_rule__Activity__Group_5_0_1__38220);
            rule__Activity__Group_5_0_1__4();

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
    // $ANTLR end "rule__Activity__Group_5_0_1__3"


    // $ANTLR start "rule__Activity__Group_5_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4138:1: rule__Activity__Group_5_0_1__3__Impl : ( ( rule__Activity__OffsetAssignment_5_0_1_3 ) ) ;
    public final void rule__Activity__Group_5_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4142:1: ( ( ( rule__Activity__OffsetAssignment_5_0_1_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4143:1: ( ( rule__Activity__OffsetAssignment_5_0_1_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4143:1: ( ( rule__Activity__OffsetAssignment_5_0_1_3 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4144:1: ( rule__Activity__OffsetAssignment_5_0_1_3 )
            {
             before(grammarAccess.getActivityAccess().getOffsetAssignment_5_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4145:1: ( rule__Activity__OffsetAssignment_5_0_1_3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4145:2: rule__Activity__OffsetAssignment_5_0_1_3
            {
            pushFollow(FOLLOW_rule__Activity__OffsetAssignment_5_0_1_3_in_rule__Activity__Group_5_0_1__3__Impl8247);
            rule__Activity__OffsetAssignment_5_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getOffsetAssignment_5_0_1_3()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_5_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4155:1: rule__Activity__Group_5_0_1__4 : rule__Activity__Group_5_0_1__4__Impl ;
    public final void rule__Activity__Group_5_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4159:1: ( rule__Activity__Group_5_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4160:2: rule__Activity__Group_5_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_0_1__4__Impl_in_rule__Activity__Group_5_0_1__48277);
            rule__Activity__Group_5_0_1__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_5_0_1__4"


    // $ANTLR start "rule__Activity__Group_5_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4166:1: rule__Activity__Group_5_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_5_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4170:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4171:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4171:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4172:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_0_1__4__Impl8304);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_0_1_4()); 

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
    // $ANTLR end "rule__Activity__Group_5_0_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_5_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4193:1: rule__Activity__Group_5_1__0 : rule__Activity__Group_5_1__0__Impl rule__Activity__Group_5_1__1 ;
    public final void rule__Activity__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4197:1: ( rule__Activity__Group_5_1__0__Impl rule__Activity__Group_5_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4198:2: rule__Activity__Group_5_1__0__Impl rule__Activity__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1__0__Impl_in_rule__Activity__Group_5_1__08343);
            rule__Activity__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1__1_in_rule__Activity__Group_5_1__08346);
            rule__Activity__Group_5_1__1();

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
    // $ANTLR end "rule__Activity__Group_5_1__0"


    // $ANTLR start "rule__Activity__Group_5_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4205:1: rule__Activity__Group_5_1__0__Impl : ( ( rule__Activity__Alternatives_5_1_0 ) ) ;
    public final void rule__Activity__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4209:1: ( ( ( rule__Activity__Alternatives_5_1_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4210:1: ( ( rule__Activity__Alternatives_5_1_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4210:1: ( ( rule__Activity__Alternatives_5_1_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4211:1: ( rule__Activity__Alternatives_5_1_0 )
            {
             before(grammarAccess.getActivityAccess().getAlternatives_5_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4212:1: ( rule__Activity__Alternatives_5_1_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4212:2: rule__Activity__Alternatives_5_1_0
            {
            pushFollow(FOLLOW_rule__Activity__Alternatives_5_1_0_in_rule__Activity__Group_5_1__0__Impl8373);
            rule__Activity__Alternatives_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives_5_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_5_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4222:1: rule__Activity__Group_5_1__1 : rule__Activity__Group_5_1__1__Impl rule__Activity__Group_5_1__2 ;
    public final void rule__Activity__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4226:1: ( rule__Activity__Group_5_1__1__Impl rule__Activity__Group_5_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4227:2: rule__Activity__Group_5_1__1__Impl rule__Activity__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1__1__Impl_in_rule__Activity__Group_5_1__18403);
            rule__Activity__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1__2_in_rule__Activity__Group_5_1__18406);
            rule__Activity__Group_5_1__2();

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
    // $ANTLR end "rule__Activity__Group_5_1__1"


    // $ANTLR start "rule__Activity__Group_5_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4234:1: rule__Activity__Group_5_1__1__Impl : ( 'completeness' ) ;
    public final void rule__Activity__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4238:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4239:1: ( 'completeness' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4239:1: ( 'completeness' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4240:1: 'completeness'
            {
             before(grammarAccess.getActivityAccess().getCompletenessKeyword_5_1_1()); 
            match(input,34,FOLLOW_34_in_rule__Activity__Group_5_1__1__Impl8434); 
             after(grammarAccess.getActivityAccess().getCompletenessKeyword_5_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_5_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_5_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4253:1: rule__Activity__Group_5_1__2 : rule__Activity__Group_5_1__2__Impl rule__Activity__Group_5_1__3 ;
    public final void rule__Activity__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4257:1: ( rule__Activity__Group_5_1__2__Impl rule__Activity__Group_5_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4258:2: rule__Activity__Group_5_1__2__Impl rule__Activity__Group_5_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1__2__Impl_in_rule__Activity__Group_5_1__28465);
            rule__Activity__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1__3_in_rule__Activity__Group_5_1__28468);
            rule__Activity__Group_5_1__3();

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
    // $ANTLR end "rule__Activity__Group_5_1__2"


    // $ANTLR start "rule__Activity__Group_5_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4265:1: rule__Activity__Group_5_1__2__Impl : ( ( rule__Activity__CompletenessAssignment_5_1_2 ) ) ;
    public final void rule__Activity__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4269:1: ( ( ( rule__Activity__CompletenessAssignment_5_1_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4270:1: ( ( rule__Activity__CompletenessAssignment_5_1_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4270:1: ( ( rule__Activity__CompletenessAssignment_5_1_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4271:1: ( rule__Activity__CompletenessAssignment_5_1_2 )
            {
             before(grammarAccess.getActivityAccess().getCompletenessAssignment_5_1_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4272:1: ( rule__Activity__CompletenessAssignment_5_1_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4272:2: rule__Activity__CompletenessAssignment_5_1_2
            {
            pushFollow(FOLLOW_rule__Activity__CompletenessAssignment_5_1_2_in_rule__Activity__Group_5_1__2__Impl8495);
            rule__Activity__CompletenessAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getCompletenessAssignment_5_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_5_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_5_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4282:1: rule__Activity__Group_5_1__3 : rule__Activity__Group_5_1__3__Impl rule__Activity__Group_5_1__4 ;
    public final void rule__Activity__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4286:1: ( rule__Activity__Group_5_1__3__Impl rule__Activity__Group_5_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4287:2: rule__Activity__Group_5_1__3__Impl rule__Activity__Group_5_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1__3__Impl_in_rule__Activity__Group_5_1__38525);
            rule__Activity__Group_5_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1__4_in_rule__Activity__Group_5_1__38528);
            rule__Activity__Group_5_1__4();

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
    // $ANTLR end "rule__Activity__Group_5_1__3"


    // $ANTLR start "rule__Activity__Group_5_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4294:1: rule__Activity__Group_5_1__3__Impl : ( '%' ) ;
    public final void rule__Activity__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4298:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4299:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4299:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4300:1: '%'
            {
             before(grammarAccess.getActivityAccess().getPercentSignKeyword_5_1_3()); 
            match(input,35,FOLLOW_35_in_rule__Activity__Group_5_1__3__Impl8556); 
             after(grammarAccess.getActivityAccess().getPercentSignKeyword_5_1_3()); 

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
    // $ANTLR end "rule__Activity__Group_5_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_5_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4313:1: rule__Activity__Group_5_1__4 : rule__Activity__Group_5_1__4__Impl ;
    public final void rule__Activity__Group_5_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4317:1: ( rule__Activity__Group_5_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4318:2: rule__Activity__Group_5_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1__4__Impl_in_rule__Activity__Group_5_1__48587);
            rule__Activity__Group_5_1__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_5_1__4"


    // $ANTLR start "rule__Activity__Group_5_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4324:1: rule__Activity__Group_5_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_5_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4328:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4329:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4329:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4330:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_1__4__Impl8614);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_4()); 

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
    // $ANTLR end "rule__Activity__Group_5_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_5_1_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4351:1: rule__Activity__Group_5_1_0_0__0 : rule__Activity__Group_5_1_0_0__0__Impl rule__Activity__Group_5_1_0_0__1 ;
    public final void rule__Activity__Group_5_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4355:1: ( rule__Activity__Group_5_1_0_0__0__Impl rule__Activity__Group_5_1_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4356:2: rule__Activity__Group_5_1_0_0__0__Impl rule__Activity__Group_5_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_0__0__Impl_in_rule__Activity__Group_5_1_0_0__08653);
            rule__Activity__Group_5_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_0__1_in_rule__Activity__Group_5_1_0_0__08656);
            rule__Activity__Group_5_1_0_0__1();

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
    // $ANTLR end "rule__Activity__Group_5_1_0_0__0"


    // $ANTLR start "rule__Activity__Group_5_1_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4363:1: rule__Activity__Group_5_1_0_0__0__Impl : ( 'ends' ) ;
    public final void rule__Activity__Group_5_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4367:1: ( ( 'ends' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4368:1: ( 'ends' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4368:1: ( 'ends' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4369:1: 'ends'
            {
             before(grammarAccess.getActivityAccess().getEndsKeyword_5_1_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Activity__Group_5_1_0_0__0__Impl8684); 
             after(grammarAccess.getActivityAccess().getEndsKeyword_5_1_0_0_0()); 

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
    // $ANTLR end "rule__Activity__Group_5_1_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_1_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4382:1: rule__Activity__Group_5_1_0_0__1 : rule__Activity__Group_5_1_0_0__1__Impl rule__Activity__Group_5_1_0_0__2 ;
    public final void rule__Activity__Group_5_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4386:1: ( rule__Activity__Group_5_1_0_0__1__Impl rule__Activity__Group_5_1_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4387:2: rule__Activity__Group_5_1_0_0__1__Impl rule__Activity__Group_5_1_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_0__1__Impl_in_rule__Activity__Group_5_1_0_0__18715);
            rule__Activity__Group_5_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_0__2_in_rule__Activity__Group_5_1_0_0__18718);
            rule__Activity__Group_5_1_0_0__2();

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
    // $ANTLR end "rule__Activity__Group_5_1_0_0__1"


    // $ANTLR start "rule__Activity__Group_5_1_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4394:1: rule__Activity__Group_5_1_0_0__1__Impl : ( ( rule__Activity__EndAssignment_5_1_0_0_1 ) ) ;
    public final void rule__Activity__Group_5_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4398:1: ( ( ( rule__Activity__EndAssignment_5_1_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4399:1: ( ( rule__Activity__EndAssignment_5_1_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4399:1: ( ( rule__Activity__EndAssignment_5_1_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4400:1: ( rule__Activity__EndAssignment_5_1_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getEndAssignment_5_1_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4401:1: ( rule__Activity__EndAssignment_5_1_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4401:2: rule__Activity__EndAssignment_5_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__EndAssignment_5_1_0_0_1_in_rule__Activity__Group_5_1_0_0__1__Impl8745);
            rule__Activity__EndAssignment_5_1_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getEndAssignment_5_1_0_0_1()); 

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
    // $ANTLR end "rule__Activity__Group_5_1_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_5_1_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4411:1: rule__Activity__Group_5_1_0_0__2 : rule__Activity__Group_5_1_0_0__2__Impl ;
    public final void rule__Activity__Group_5_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4415:1: ( rule__Activity__Group_5_1_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4416:2: rule__Activity__Group_5_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_0__2__Impl_in_rule__Activity__Group_5_1_0_0__28775);
            rule__Activity__Group_5_1_0_0__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_5_1_0_0__2"


    // $ANTLR start "rule__Activity__Group_5_1_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4422:1: rule__Activity__Group_5_1_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_5_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4426:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4427:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4427:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4428:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_1_0_0__2__Impl8802);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_0_0_2()); 

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
    // $ANTLR end "rule__Activity__Group_5_1_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_5_1_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4445:1: rule__Activity__Group_5_1_0_1__0 : rule__Activity__Group_5_1_0_1__0__Impl rule__Activity__Group_5_1_0_1__1 ;
    public final void rule__Activity__Group_5_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4449:1: ( rule__Activity__Group_5_1_0_1__0__Impl rule__Activity__Group_5_1_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4450:2: rule__Activity__Group_5_1_0_1__0__Impl rule__Activity__Group_5_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_1__0__Impl_in_rule__Activity__Group_5_1_0_1__08837);
            rule__Activity__Group_5_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_1__1_in_rule__Activity__Group_5_1_0_1__08840);
            rule__Activity__Group_5_1_0_1__1();

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
    // $ANTLR end "rule__Activity__Group_5_1_0_1__0"


    // $ANTLR start "rule__Activity__Group_5_1_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4457:1: rule__Activity__Group_5_1_0_1__0__Impl : ( 'duration' ) ;
    public final void rule__Activity__Group_5_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4461:1: ( ( 'duration' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4462:1: ( 'duration' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4462:1: ( 'duration' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4463:1: 'duration'
            {
             before(grammarAccess.getActivityAccess().getDurationKeyword_5_1_0_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Activity__Group_5_1_0_1__0__Impl8868); 
             after(grammarAccess.getActivityAccess().getDurationKeyword_5_1_0_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_5_1_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_1_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4476:1: rule__Activity__Group_5_1_0_1__1 : rule__Activity__Group_5_1_0_1__1__Impl rule__Activity__Group_5_1_0_1__2 ;
    public final void rule__Activity__Group_5_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4480:1: ( rule__Activity__Group_5_1_0_1__1__Impl rule__Activity__Group_5_1_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4481:2: rule__Activity__Group_5_1_0_1__1__Impl rule__Activity__Group_5_1_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_1__1__Impl_in_rule__Activity__Group_5_1_0_1__18899);
            rule__Activity__Group_5_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_1__2_in_rule__Activity__Group_5_1_0_1__18902);
            rule__Activity__Group_5_1_0_1__2();

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
    // $ANTLR end "rule__Activity__Group_5_1_0_1__1"


    // $ANTLR start "rule__Activity__Group_5_1_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4488:1: rule__Activity__Group_5_1_0_1__1__Impl : ( ( rule__Activity__DurationAssignment_5_1_0_1_1 ) ) ;
    public final void rule__Activity__Group_5_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4492:1: ( ( ( rule__Activity__DurationAssignment_5_1_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4493:1: ( ( rule__Activity__DurationAssignment_5_1_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4493:1: ( ( rule__Activity__DurationAssignment_5_1_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4494:1: ( rule__Activity__DurationAssignment_5_1_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getDurationAssignment_5_1_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4495:1: ( rule__Activity__DurationAssignment_5_1_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4495:2: rule__Activity__DurationAssignment_5_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__DurationAssignment_5_1_0_1_1_in_rule__Activity__Group_5_1_0_1__1__Impl8929);
            rule__Activity__DurationAssignment_5_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDurationAssignment_5_1_0_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_5_1_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_5_1_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4505:1: rule__Activity__Group_5_1_0_1__2 : rule__Activity__Group_5_1_0_1__2__Impl ;
    public final void rule__Activity__Group_5_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4509:1: ( rule__Activity__Group_5_1_0_1__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4510:2: rule__Activity__Group_5_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_1_0_1__2__Impl_in_rule__Activity__Group_5_1_0_1__28959);
            rule__Activity__Group_5_1_0_1__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_5_1_0_1__2"


    // $ANTLR start "rule__Activity__Group_5_1_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4516:1: rule__Activity__Group_5_1_0_1__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_5_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4520:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4521:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4521:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4522:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_0_1_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_1_0_1__2__Impl8986);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_1_0_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_5_1_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_5_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4539:1: rule__Activity__Group_5_2__0 : rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 ;
    public final void rule__Activity__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4543:1: ( rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4544:2: rule__Activity__Group_5_2__0__Impl rule__Activity__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__09021);
            rule__Activity__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__09024);
            rule__Activity__Group_5_2__1();

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
    // $ANTLR end "rule__Activity__Group_5_2__0"


    // $ANTLR start "rule__Activity__Group_5_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4551:1: rule__Activity__Group_5_2__0__Impl : ( 'dependsOn' ) ;
    public final void rule__Activity__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4555:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4556:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4556:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4557:1: 'dependsOn'
            {
             before(grammarAccess.getActivityAccess().getDependsOnKeyword_5_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group_5_2__0__Impl9052); 
             after(grammarAccess.getActivityAccess().getDependsOnKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Activity__Group_5_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_5_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4570:1: rule__Activity__Group_5_2__1 : rule__Activity__Group_5_2__1__Impl rule__Activity__Group_5_2__2 ;
    public final void rule__Activity__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4574:1: ( rule__Activity__Group_5_2__1__Impl rule__Activity__Group_5_2__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4575:2: rule__Activity__Group_5_2__1__Impl rule__Activity__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__19083);
            rule__Activity__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5_2__2_in_rule__Activity__Group_5_2__19086);
            rule__Activity__Group_5_2__2();

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
    // $ANTLR end "rule__Activity__Group_5_2__1"


    // $ANTLR start "rule__Activity__Group_5_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4582:1: rule__Activity__Group_5_2__1__Impl : ( ( rule__Activity__DependenciesAssignment_5_2_1 )* ) ;
    public final void rule__Activity__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4586:1: ( ( ( rule__Activity__DependenciesAssignment_5_2_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4587:1: ( ( rule__Activity__DependenciesAssignment_5_2_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4587:1: ( ( rule__Activity__DependenciesAssignment_5_2_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4588:1: ( rule__Activity__DependenciesAssignment_5_2_1 )*
            {
             before(grammarAccess.getActivityAccess().getDependenciesAssignment_5_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4589:1: ( rule__Activity__DependenciesAssignment_5_2_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4589:2: rule__Activity__DependenciesAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Activity__DependenciesAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl9113);
            	    rule__Activity__DependenciesAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getDependenciesAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Activity__Group_5_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_5_2__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4599:1: rule__Activity__Group_5_2__2 : rule__Activity__Group_5_2__2__Impl ;
    public final void rule__Activity__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4603:1: ( rule__Activity__Group_5_2__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4604:2: rule__Activity__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5_2__2__Impl_in_rule__Activity__Group_5_2__29144);
            rule__Activity__Group_5_2__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_5_2__2"


    // $ANTLR start "rule__Activity__Group_5_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4610:1: rule__Activity__Group_5_2__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4614:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4615:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4615:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4616:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_2_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_2__2__Impl9171);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_5_2_2()); 

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
    // $ANTLR end "rule__Activity__Group_5_2__2__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4635:1: rule__CheckPoint__UnorderedGroup_4 : rule__CheckPoint__UnorderedGroup_4__0 {...}?;
    public final void rule__CheckPoint__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4640:1: ( rule__CheckPoint__UnorderedGroup_4__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4641:2: rule__CheckPoint__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4__0_in_rule__CheckPoint__UnorderedGroup_49208);
            rule__CheckPoint__UnorderedGroup_4__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_4"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4652:1: rule__CheckPoint__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__CheckPoint__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4657:1: ( ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4658:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4658:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) ) ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( LA33_0 >=31 && LA33_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1) ) {
                alt33=2;
            }
            else if ( LA33_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2) ) {
                alt33=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4660:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4660:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4661:5: {...}? => ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4661:107: ( ( ( rule__CheckPoint__Alternatives_4_0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4662:6: ( ( rule__CheckPoint__Alternatives_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4668:6: ( ( rule__CheckPoint__Alternatives_4_0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4670:7: ( rule__CheckPoint__Alternatives_4_0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getAlternatives_4_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4671:7: ( rule__CheckPoint__Alternatives_4_0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4671:8: rule__CheckPoint__Alternatives_4_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Alternatives_4_0_in_rule__CheckPoint__UnorderedGroup_4__Impl9297);
                    rule__CheckPoint__Alternatives_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getAlternatives_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4677:4: ({...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4677:4: ({...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4678:5: {...}? => ( ( ( rule__CheckPoint__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4678:107: ( ( ( rule__CheckPoint__Group_4_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4679:6: ( ( rule__CheckPoint__Group_4_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4685:6: ( ( rule__CheckPoint__Group_4_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4687:7: ( rule__CheckPoint__Group_4_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_4_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4688:7: ( rule__CheckPoint__Group_4_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4688:8: rule__CheckPoint__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_4_1__0_in_rule__CheckPoint__UnorderedGroup_4__Impl9388);
                    rule__CheckPoint__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4694:4: ({...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4694:4: ({...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4695:5: {...}? => ( ( ( rule__CheckPoint__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4695:107: ( ( ( rule__CheckPoint__Group_4_2__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4696:6: ( ( rule__CheckPoint__Group_4_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4702:6: ( ( rule__CheckPoint__Group_4_2__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4704:7: ( rule__CheckPoint__Group_4_2__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_4_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4705:7: ( rule__CheckPoint__Group_4_2__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4705:8: rule__CheckPoint__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_4_2__0_in_rule__CheckPoint__UnorderedGroup_4__Impl9479);
                    rule__CheckPoint__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_4_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4720:1: rule__CheckPoint__UnorderedGroup_4__0 : rule__CheckPoint__UnorderedGroup_4__Impl ( rule__CheckPoint__UnorderedGroup_4__1 )? ;
    public final void rule__CheckPoint__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4724:1: ( rule__CheckPoint__UnorderedGroup_4__Impl ( rule__CheckPoint__UnorderedGroup_4__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4725:2: rule__CheckPoint__UnorderedGroup_4__Impl ( rule__CheckPoint__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4__Impl_in_rule__CheckPoint__UnorderedGroup_4__09538);
            rule__CheckPoint__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4726:2: ( rule__CheckPoint__UnorderedGroup_4__1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 >=31 && LA34_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4726:2: rule__CheckPoint__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4__1_in_rule__CheckPoint__UnorderedGroup_4__09541);
                    rule__CheckPoint__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_4__0"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4733:1: rule__CheckPoint__UnorderedGroup_4__1 : rule__CheckPoint__UnorderedGroup_4__Impl ( rule__CheckPoint__UnorderedGroup_4__2 )? ;
    public final void rule__CheckPoint__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4737:1: ( rule__CheckPoint__UnorderedGroup_4__Impl ( rule__CheckPoint__UnorderedGroup_4__2 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4738:2: rule__CheckPoint__UnorderedGroup_4__Impl ( rule__CheckPoint__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4__Impl_in_rule__CheckPoint__UnorderedGroup_4__19566);
            rule__CheckPoint__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4739:2: ( rule__CheckPoint__UnorderedGroup_4__2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 >=31 && LA35_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_4(), 2) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4739:2: rule__CheckPoint__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4__2_in_rule__CheckPoint__UnorderedGroup_4__19569);
                    rule__CheckPoint__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_4__1"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4746:1: rule__CheckPoint__UnorderedGroup_4__2 : rule__CheckPoint__UnorderedGroup_4__Impl ;
    public final void rule__CheckPoint__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4750:1: ( rule__CheckPoint__UnorderedGroup_4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4751:2: rule__CheckPoint__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_4__Impl_in_rule__CheckPoint__UnorderedGroup_4__29594);
            rule__CheckPoint__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_4__2"


    // $ANTLR start "rule__Activity__UnorderedGroup_5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4764:1: rule__Activity__UnorderedGroup_5 : rule__Activity__UnorderedGroup_5__0 {...}?;
    public final void rule__Activity__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4769:1: ( rule__Activity__UnorderedGroup_5__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4770:2: rule__Activity__UnorderedGroup_5__0 {...}?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5__0_in_rule__Activity__UnorderedGroup_59624);
            rule__Activity__UnorderedGroup_5__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_5", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_5())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_5"


    // $ANTLR start "rule__Activity__UnorderedGroup_5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4781:1: rule__Activity__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) ) ) ) ;
    public final void rule__Activity__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4786:1: ( ( ({...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4787:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4787:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) ) ) )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32||LA36_0==40) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 >=41 && LA36_0<=42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1) ) {
                alt36=2;
            }
            else if ( LA36_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2) ) {
                alt36=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4789:4: ({...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4789:4: ({...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4790:5: {...}? => ( ( ( rule__Activity__Alternatives_5_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4790:105: ( ( ( rule__Activity__Alternatives_5_0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4791:6: ( ( rule__Activity__Alternatives_5_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4797:6: ( ( rule__Activity__Alternatives_5_0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4799:7: ( rule__Activity__Alternatives_5_0 )
                    {
                     before(grammarAccess.getActivityAccess().getAlternatives_5_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4800:7: ( rule__Activity__Alternatives_5_0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4800:8: rule__Activity__Alternatives_5_0
                    {
                    pushFollow(FOLLOW_rule__Activity__Alternatives_5_0_in_rule__Activity__UnorderedGroup_5__Impl9713);
                    rule__Activity__Alternatives_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getAlternatives_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4806:4: ({...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4806:4: ({...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4807:5: {...}? => ( ( ( rule__Activity__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4807:105: ( ( ( rule__Activity__Group_5_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4808:6: ( ( rule__Activity__Group_5_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4814:6: ( ( rule__Activity__Group_5_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4816:7: ( rule__Activity__Group_5_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_5_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4817:7: ( rule__Activity__Group_5_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4817:8: rule__Activity__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5_1__0_in_rule__Activity__UnorderedGroup_5__Impl9804);
                    rule__Activity__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4823:4: ({...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4823:4: ({...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4824:5: {...}? => ( ( ( rule__Activity__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4824:105: ( ( ( rule__Activity__Group_5_2__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4825:6: ( ( rule__Activity__Group_5_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4831:6: ( ( rule__Activity__Group_5_2__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4833:7: ( rule__Activity__Group_5_2__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_5_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4834:7: ( rule__Activity__Group_5_2__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4834:8: rule__Activity__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__UnorderedGroup_5__Impl9895);
                    rule__Activity__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_5_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__Activity__UnorderedGroup_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4849:1: rule__Activity__UnorderedGroup_5__0 : rule__Activity__UnorderedGroup_5__Impl ( rule__Activity__UnorderedGroup_5__1 )? ;
    public final void rule__Activity__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4853:1: ( rule__Activity__UnorderedGroup_5__Impl ( rule__Activity__UnorderedGroup_5__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4854:2: rule__Activity__UnorderedGroup_5__Impl ( rule__Activity__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5__Impl_in_rule__Activity__UnorderedGroup_5__09954);
            rule__Activity__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4855:2: ( rule__Activity__UnorderedGroup_5__1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32||LA37_0==40) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 >=41 && LA37_0<=42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4855:2: rule__Activity__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5__1_in_rule__Activity__UnorderedGroup_5__09957);
                    rule__Activity__UnorderedGroup_5__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Activity__UnorderedGroup_5__0"


    // $ANTLR start "rule__Activity__UnorderedGroup_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4862:1: rule__Activity__UnorderedGroup_5__1 : rule__Activity__UnorderedGroup_5__Impl ( rule__Activity__UnorderedGroup_5__2 )? ;
    public final void rule__Activity__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4866:1: ( rule__Activity__UnorderedGroup_5__Impl ( rule__Activity__UnorderedGroup_5__2 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4867:2: rule__Activity__UnorderedGroup_5__Impl ( rule__Activity__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5__Impl_in_rule__Activity__UnorderedGroup_5__19982);
            rule__Activity__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4868:2: ( rule__Activity__UnorderedGroup_5__2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32||LA38_0==40) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 >=41 && LA38_0<=42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_5(), 2) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4868:2: rule__Activity__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5__2_in_rule__Activity__UnorderedGroup_5__19985);
                    rule__Activity__UnorderedGroup_5__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Activity__UnorderedGroup_5__1"


    // $ANTLR start "rule__Activity__UnorderedGroup_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4875:1: rule__Activity__UnorderedGroup_5__2 : rule__Activity__UnorderedGroup_5__Impl ;
    public final void rule__Activity__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4879:1: ( rule__Activity__UnorderedGroup_5__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4880:2: rule__Activity__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_5__Impl_in_rule__Activity__UnorderedGroup_5__210010);
            rule__Activity__UnorderedGroup_5__Impl();

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
    // $ANTLR end "rule__Activity__UnorderedGroup_5__2"


    // $ANTLR start "rule__Program__DescriptionAssignment_0_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4893:1: rule__Program__DescriptionAssignment_0_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Program__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4897:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4898:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4898:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4899:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_010044); 
             after(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Program__DescriptionAssignment_0_0"


    // $ANTLR start "rule__Program__NameAssignment_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4908:1: rule__Program__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4912:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4913:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4913:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4914:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_110075); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__Program__NameAssignment_0_1_1"


    // $ANTLR start "rule__Program__PlansAssignment_0_1_3_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4923:1: rule__Program__PlansAssignment_0_1_3_0 : ( rulePlanImport ) ;
    public final void rule__Program__PlansAssignment_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4927:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4928:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4928:1: ( rulePlanImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4929:1: rulePlanImport
            {
             before(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_3_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_3_010106);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_3_0_0()); 

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
    // $ANTLR end "rule__Program__PlansAssignment_0_1_3_0"


    // $ANTLR start "rule__Program__ReferencedProjectsAssignment_0_1_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4938:1: rule__Program__ReferencedProjectsAssignment_0_1_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Program__ReferencedProjectsAssignment_0_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4942:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4943:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4943:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4944:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_4_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4945:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4946:1: ruleQualifiedName
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_4_110141);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_4_1_0_1()); 

            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_4_1_0()); 

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
    // $ANTLR end "rule__Program__ReferencedProjectsAssignment_0_1_4_1"


    // $ANTLR start "rule__Program__ProjectsAssignment_0_1_5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4957:1: rule__Program__ProjectsAssignment_0_1_5 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4961:1: ( ( ruleProject ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4962:1: ( ruleProject )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4962:1: ( ruleProject )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4963:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_5_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_510176);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_5_0()); 

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
    // $ANTLR end "rule__Program__ProjectsAssignment_0_1_5"


    // $ANTLR start "rule__Program__ProjectsAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4972:1: rule__Program__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4976:1: ( ( ruleProject ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4977:1: ( ruleProject )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4977:1: ( ruleProject )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4978:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_110207);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__ProjectsAssignment_1"


    // $ANTLR start "rule__Project__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4987:1: rule__Project__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Project__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4991:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4992:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4992:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4993:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_010238); 
             after(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Project__DescriptionAssignment_0"


    // $ANTLR start "rule__Project__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5002:1: rule__Project__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5006:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5007:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5007:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5008:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Project__NameAssignment_210269); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Project__NameAssignment_2"


    // $ANTLR start "rule__Project__WbsAssignment_4_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5017:1: rule__Project__WbsAssignment_4_0 : ( ruleWBSImport ) ;
    public final void rule__Project__WbsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5021:1: ( ( ruleWBSImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5022:1: ( ruleWBSImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5022:1: ( ruleWBSImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5023:1: ruleWBSImport
            {
             before(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleWBSImport_in_rule__Project__WbsAssignment_4_010300);
            ruleWBSImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Project__WbsAssignment_4_0"


    // $ANTLR start "rule__Project__ResourcesAssignment_5_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5032:1: rule__Project__ResourcesAssignment_5_0 : ( ruleResourcesImport ) ;
    public final void rule__Project__ResourcesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5036:1: ( ( ruleResourcesImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5037:1: ( ruleResourcesImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5037:1: ( ruleResourcesImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5038:1: ruleResourcesImport
            {
             before(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_rule__Project__ResourcesAssignment_5_010331);
            ruleResourcesImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Project__ResourcesAssignment_5_0"


    // $ANTLR start "rule__Project__PlansAssignment_6_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5047:1: rule__Project__PlansAssignment_6_0 : ( rulePlanImport ) ;
    public final void rule__Project__PlansAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5051:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:1: ( rulePlanImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5053:1: rulePlanImport
            {
             before(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_6_010362);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Project__PlansAssignment_6_0"


    // $ANTLR start "rule__Project__AssumptionsAssignment_7_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5062:1: rule__Project__AssumptionsAssignment_7_2 : ( ruleAssumption ) ;
    public final void rule__Project__AssumptionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5066:1: ( ( ruleAssumption ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5067:1: ( ruleAssumption )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5067:1: ( ruleAssumption )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5068:1: ruleAssumption
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_7_210393);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Project__AssumptionsAssignment_7_2"


    // $ANTLR start "rule__Project__ConstraintsAssignment_8_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5077:1: rule__Project__ConstraintsAssignment_8_2 : ( ruleConstraint ) ;
    public final void rule__Project__ConstraintsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5081:1: ( ( ruleConstraint ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5082:1: ( ruleConstraint )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5082:1: ( ruleConstraint )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5083:1: ruleConstraint
            {
             before(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_8_210424);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Project__ConstraintsAssignment_8_2"


    // $ANTLR start "rule__Project__ActivitiesAssignment_9"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5092:1: rule__Project__ActivitiesAssignment_9 : ( ruleActivityElement ) ;
    public final void rule__Project__ActivitiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5096:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5097:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5097:1: ( ruleActivityElement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5098:1: ruleActivityElement
            {
             before(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_910455);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Project__ActivitiesAssignment_9"


    // $ANTLR start "rule__Assumption__ValueAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5107:1: rule__Assumption__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Assumption__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5111:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5112:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5112:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5113:1: RULE_STRING
            {
             before(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_110486); 
             after(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Assumption__ValueAssignment_1"


    // $ANTLR start "rule__Constraint__ValueAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5122:1: rule__Constraint__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5126:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5127:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5127:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5128:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_110517); 
             after(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraint__ValueAssignment_1"


    // $ANTLR start "rule__ActivityGroup__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5137:1: rule__ActivityGroup__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__ActivityGroup__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5141:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5142:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5142:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5143:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_010548); 
             after(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ActivityGroup__DescriptionAssignment_0"


    // $ANTLR start "rule__ActivityGroup__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5152:1: rule__ActivityGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActivityGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5156:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5157:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5157:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5158:1: RULE_ID
            {
             before(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_210579); 
             after(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActivityGroup__NameAssignment_2"


    // $ANTLR start "rule__ActivityGroup__DependenciesAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5167:1: rule__ActivityGroup__DependenciesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ActivityGroup__DependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5171:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5172:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5172:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5173:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_4_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5174:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5175:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_4_110614);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__ActivityGroup__DependenciesAssignment_4_1"


    // $ANTLR start "rule__ActivityGroup__ActivitiesAssignment_5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5186:1: rule__ActivityGroup__ActivitiesAssignment_5 : ( ruleActivityElement ) ;
    public final void rule__ActivityGroup__ActivitiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5190:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5191:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5191:1: ( ruleActivityElement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5192:1: ruleActivityElement
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_510649);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ActivityGroup__ActivitiesAssignment_5"


    // $ANTLR start "rule__WBSImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5201:1: rule__WBSImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WBSImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5205:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5206:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5206:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5207:1: RULE_STRING
            {
             before(grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WBSImport__ImportURIAssignment_110680); 
             after(grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WBSImport__ImportURIAssignment_1"


    // $ANTLR start "rule__ResourcesImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5216:1: rule__ResourcesImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResourcesImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5220:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5221:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5221:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5222:1: RULE_STRING
            {
             before(grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourcesImport__ImportURIAssignment_110711); 
             after(grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ResourcesImport__ImportURIAssignment_1"


    // $ANTLR start "rule__PlanImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5231:1: rule__PlanImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PlanImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5235:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5236:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5236:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5237:1: RULE_STRING
            {
             before(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_110742); 
             after(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PlanImport__ImportURIAssignment_1"


    // $ANTLR start "rule__CheckPoint__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5246:1: rule__CheckPoint__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__CheckPoint__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5250:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5251:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5251:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5252:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_010773); 
             after(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CheckPoint__DescriptionAssignment_0"


    // $ANTLR start "rule__CheckPoint__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5261:1: rule__CheckPoint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CheckPoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5265:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5266:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5266:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5267:1: RULE_ID
            {
             before(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_210804); 
             after(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CheckPoint__NameAssignment_2"


    // $ANTLR start "rule__CheckPoint__EndAssignment_4_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5276:1: rule__CheckPoint__EndAssignment_4_0_0_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__EndAssignment_4_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5280:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5281:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5281:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5282:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_4_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_4_0_0_110835); 
             after(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_4_0_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__EndAssignment_4_0_0_1"


    // $ANTLR start "rule__CheckPoint__AfterAssignment_4_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5291:1: rule__CheckPoint__AfterAssignment_4_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__AfterAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5295:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5296:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5296:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5297:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_4_0_1_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5298:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5299:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_4_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_4_0_1_110870);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_4_0_1_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_4_0_1_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__AfterAssignment_4_0_1_1"


    // $ANTLR start "rule__CheckPoint__OffsetAssignment_4_0_1_3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5310:1: rule__CheckPoint__OffsetAssignment_4_0_1_3 : ( RULE_INT ) ;
    public final void rule__CheckPoint__OffsetAssignment_4_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5314:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5315:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5315:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5316:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_4_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_4_0_1_310905); 
             after(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_4_0_1_3_0()); 

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
    // $ANTLR end "rule__CheckPoint__OffsetAssignment_4_0_1_3"


    // $ANTLR start "rule__CheckPoint__CompletenessAssignment_4_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5325:1: rule__CheckPoint__CompletenessAssignment_4_1_1 : ( RULE_INT ) ;
    public final void rule__CheckPoint__CompletenessAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5329:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5330:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5330:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5331:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_4_1_110936); 
             after(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__CompletenessAssignment_4_1_1"


    // $ANTLR start "rule__CheckPoint__DependenciesAssignment_4_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5340:1: rule__CheckPoint__DependenciesAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__DependenciesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5344:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5345:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5345:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5346:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_4_2_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5347:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5348:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_4_2_110971);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_4_2_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__DependenciesAssignment_4_2_1"


    // $ANTLR start "rule__ResourceInvolvement__ResourceAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5359:1: rule__ResourceInvolvement__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceInvolvement__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5363:1: ( ( ( RULE_ID ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5364:1: ( ( RULE_ID ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5364:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5365:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5366:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5367:1: RULE_ID
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_011010); 
             after(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__ResourceAssignment_0"


    // $ANTLR start "rule__ResourceInvolvement__OccupationAssignment_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5378:1: rule__ResourceInvolvement__OccupationAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ResourceInvolvement__OccupationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5382:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5383:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5383:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5384:1: RULE_INT
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_111045); 
             after(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__OccupationAssignment_1_1"


    // $ANTLR start "rule__ResourceInvolvement__ResponsibilityAssignment_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5393:1: rule__ResourceInvolvement__ResponsibilityAssignment_2_1 : ( ruleResponsibility ) ;
    public final void rule__ResourceInvolvement__ResponsibilityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5397:1: ( ( ruleResponsibility ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5398:1: ( ruleResponsibility )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5398:1: ( ruleResponsibility )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5399:1: ruleResponsibility
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_111076);
            ruleResponsibility();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__ResponsibilityAssignment_2_1"


    // $ANTLR start "rule__Activity__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5408:1: rule__Activity__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Activity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5412:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5413:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5413:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5414:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_011107); 
             after(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Activity__DescriptionAssignment_0"


    // $ANTLR start "rule__Activity__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5423:1: rule__Activity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5427:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5428:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5428:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5429:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_211138); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Activity__NameAssignment_2"


    // $ANTLR start "rule__Activity__InvolvedResourcesAssignment_4_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5438:1: rule__Activity__InvolvedResourcesAssignment_4_2 : ( ruleResourceInvolvement ) ;
    public final void rule__Activity__InvolvedResourcesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5442:1: ( ( ruleResourceInvolvement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5443:1: ( ruleResourceInvolvement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5443:1: ( ruleResourceInvolvement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5444:1: ruleResourceInvolvement
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_4_211169);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Activity__InvolvedResourcesAssignment_4_2"


    // $ANTLR start "rule__Activity__StartAssignment_5_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5453:1: rule__Activity__StartAssignment_5_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__StartAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5457:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5458:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5458:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5459:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_5_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_5_0_0_111200); 
             after(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_5_0_0_1_0()); 

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
    // $ANTLR end "rule__Activity__StartAssignment_5_0_0_1"


    // $ANTLR start "rule__Activity__AfterAssignment_5_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5468:1: rule__Activity__AfterAssignment_5_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__AfterAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5472:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5473:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5473:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5474:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5475:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5476:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_5_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_5_0_1_111235);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_5_0_1_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 

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
    // $ANTLR end "rule__Activity__AfterAssignment_5_0_1_1"


    // $ANTLR start "rule__Activity__OffsetAssignment_5_0_1_3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5487:1: rule__Activity__OffsetAssignment_5_0_1_3 : ( RULE_INT ) ;
    public final void rule__Activity__OffsetAssignment_5_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5491:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5492:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5492:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5493:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_5_0_1_311270); 
             after(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 

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
    // $ANTLR end "rule__Activity__OffsetAssignment_5_0_1_3"


    // $ANTLR start "rule__Activity__EndAssignment_5_1_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5502:1: rule__Activity__EndAssignment_5_1_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__EndAssignment_5_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5506:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5507:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5507:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5508:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_5_1_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_5_1_0_0_111301); 
             after(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_5_1_0_0_1_0()); 

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
    // $ANTLR end "rule__Activity__EndAssignment_5_1_0_0_1"


    // $ANTLR start "rule__Activity__DurationAssignment_5_1_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5517:1: rule__Activity__DurationAssignment_5_1_0_1_1 : ( RULE_INT ) ;
    public final void rule__Activity__DurationAssignment_5_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5521:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5522:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5522:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5523:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_5_1_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_5_1_0_1_111332); 
             after(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_5_1_0_1_1_0()); 

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
    // $ANTLR end "rule__Activity__DurationAssignment_5_1_0_1_1"


    // $ANTLR start "rule__Activity__CompletenessAssignment_5_1_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5532:1: rule__Activity__CompletenessAssignment_5_1_2 : ( RULE_INT ) ;
    public final void rule__Activity__CompletenessAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5536:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5537:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5537:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5538:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_5_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_5_1_211363); 
             after(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_5_1_2_0()); 

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
    // $ANTLR end "rule__Activity__CompletenessAssignment_5_1_2"


    // $ANTLR start "rule__Activity__DependenciesAssignment_5_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5547:1: rule__Activity__DependenciesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__DependenciesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5551:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5552:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5552:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5553:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_5_2_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5554:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5555:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_5_2_111398);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__Activity__DependenciesAssignment_5_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Alternatives_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0_in_ruleAssumption214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0_in_ruleActivityGroup334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_entryRuleWBSImport361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSImport368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__0_in_ruleWBSImport394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourcesImport428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__0_in_ruleResourcesImport454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0_in_rulePlanImport514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityElement__Alternatives_in_ruleActivityElement636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleENDLINE697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__0_in_ruleCheckPoint758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0_in_ruleResourceInvolvement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Responsibility__Alternatives_in_ruleResponsibility917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0_in_rule__Program__Alternatives952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_1_in_rule__Program__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ActivityElement__Alternatives1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_rule__ActivityElement__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_rule__ActivityElement__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_0__0_in_rule__CheckPoint__Alternatives_4_01069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__0_in_rule__CheckPoint__Alternatives_4_01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_0__0_in_rule__Activity__Alternatives_5_01120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__0_in_rule__Activity__Alternatives_5_01138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_0__0_in_rule__Activity__Alternatives_5_1_01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_1__0_in_rule__Activity__Alternatives_5_1_01189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Responsibility__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Responsibility__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Responsibility__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Responsibility__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__01319 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__DescriptionAssignment_0_0_in_rule__Program__Group_0__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__0_in_rule__Program__Group_0__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__0__Impl_in_rule__Program__Group_0_1__01441 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__1_in_rule__Program__Group_0_1__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group_0_1__0__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__1__Impl_in_rule__Program__Group_0_1__11503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2_in_rule__Program__Group_0_1__11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_0_1_1_in_rule__Program__Group_0_1__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21563 = new BitSet(new long[]{0x00000000101800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31622 = new BitSet(new long[]{0x00000000101800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1652 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41683 = new BitSet(new long[]{0x00000000101800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1713 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51744 = new BitSet(new long[]{0x00000000101800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_0_1_5_in_rule__Program__Group_0_1__5__Impl1774 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__6__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01875 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PlansAssignment_0_1_3_0_in_rule__Program__Group_0_1_3__0__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__1__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__01995 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__01998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group_0_1_4__0__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12057 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__2_in_rule__Program__Group_0_1_4__12060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_4_1_in_rule__Program__Group_0_1_4__1__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__2__Impl_in_rule__Program__Group_0_1_4__22117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__2__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02179 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12240 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Project__Group__1__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32362 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42421 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52482 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62543 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2573 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72604 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82665 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92726 = new BitSet(new long[]{0x000000405D6000A0L});
    public static final BitSet FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_9_in_rule__Project__Group__9__Impl2756 = new BitSet(new long[]{0x0000004041000082L});
    public static final BitSet FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__102787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__10__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__02865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__02868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__WbsAssignment_4_0_in_rule__Project__Group_4__0__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__12925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_4__1__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__02985 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__02988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ResourcesAssignment_5_0_in_rule__Project__Group_5__0__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__13045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_5__1__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03105 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__PlansAssignment_6_0_in_rule__Project__Group_6__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group_7__0__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13287 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Project__Group_7__2_in_rule__Project__Group_7__13290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_7__1__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__2__Impl_in_rule__Project__Group_7__23346 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Project__Group_7__3_in_rule__Project__Group_7__23349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__AssumptionsAssignment_7_2_in_rule__Project__Group_7__2__Impl3376 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__3__Impl_in_rule__Project__Group_7__33407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_7__3__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Project__Group_8__0__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13533 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23592 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ConstraintsAssignment_8_2_in_rule__Project__Group_8__2__Impl3622 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__33653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__03717 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__03720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Assumption__Group__0__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__13779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__13782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__23839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03901 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Constraint__Group__0__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13963 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04085 = new BitSet(new long[]{0x0000004041000080L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ActivityGroup__Group__1__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34268 = new BitSet(new long[]{0x00000040430000A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44327 = new BitSet(new long[]{0x00000040430000A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__54388 = new BitSet(new long[]{0x00000040430000A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__54391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__ActivitiesAssignment_5_in_rule__ActivityGroup__Group__5__Impl4418 = new BitSet(new long[]{0x0000004041000082L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__64449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__6__Impl4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__04519 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__04522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActivityGroup__Group_4__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__14581 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__14584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DependenciesAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl4611 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__24642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__0__Impl_in_rule__WBSImport__Group__04704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__1_in_rule__WBSImport__Group__04707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__WBSImport__Group__0__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__1__Impl_in_rule__WBSImport__Group__14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__ImportURIAssignment_1_in_rule__WBSImport__Group__1__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__0__Impl_in_rule__ResourcesImport__Group__04827 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__1_in_rule__ResourcesImport__Group__04830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ResourcesImport__Group__0__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__1__Impl_in_rule__ResourcesImport__Group__14889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__ImportURIAssignment_1_in_rule__ResourcesImport__Group__1__Impl4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__04950 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__04953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PlanImport__Group__0__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__15012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05073 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5159 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__0__Impl_in_rule__CheckPoint__Group__05317 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__1_in_rule__CheckPoint__Group__05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DescriptionAssignment_0_in_rule__CheckPoint__Group__0__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__1__Impl_in_rule__CheckPoint__Group__15378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__2_in_rule__CheckPoint__Group__15381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CheckPoint__Group__1__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__2__Impl_in_rule__CheckPoint__Group__25440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__3_in_rule__CheckPoint__Group__25443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__NameAssignment_2_in_rule__CheckPoint__Group__2__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__3__Impl_in_rule__CheckPoint__Group__35500 = new BitSet(new long[]{0x0000000582000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__4_in_rule__CheckPoint__Group__35503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group__3__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__4__Impl_in_rule__CheckPoint__Group__45559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__5_in_rule__CheckPoint__Group__45562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4_in_rule__CheckPoint__Group__4__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__5__Impl_in_rule__CheckPoint__Group__55619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group__5__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_0__0__Impl_in_rule__CheckPoint__Group_4_0_0__05687 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_0__1_in_rule__CheckPoint__Group_4_0_0__05690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CheckPoint__Group_4_0_0__0__Impl5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_0__1__Impl_in_rule__CheckPoint__Group_4_0_0__15749 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_0__2_in_rule__CheckPoint__Group_4_0_0__15752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__EndAssignment_4_0_0_1_in_rule__CheckPoint__Group_4_0_0__1__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_0__2__Impl_in_rule__CheckPoint__Group_4_0_0__25809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_0_0__2__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__0__Impl_in_rule__CheckPoint__Group_4_0_1__05871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__1_in_rule__CheckPoint__Group_4_0_1__05874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CheckPoint__Group_4_0_1__0__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__1__Impl_in_rule__CheckPoint__Group_4_0_1__15933 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__2_in_rule__CheckPoint__Group_4_0_1__15936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__AfterAssignment_4_0_1_1_in_rule__CheckPoint__Group_4_0_1__1__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__2__Impl_in_rule__CheckPoint__Group_4_0_1__25993 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__3_in_rule__CheckPoint__Group_4_0_1__25996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CheckPoint__Group_4_0_1__2__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__3__Impl_in_rule__CheckPoint__Group_4_0_1__36055 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__4_in_rule__CheckPoint__Group_4_0_1__36058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__OffsetAssignment_4_0_1_3_in_rule__CheckPoint__Group_4_0_1__3__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_0_1__4__Impl_in_rule__CheckPoint__Group_4_0_1__46115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_0_1__4__Impl6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__0__Impl_in_rule__CheckPoint__Group_4_1__06181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__1_in_rule__CheckPoint__Group_4_1__06184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CheckPoint__Group_4_1__0__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__1__Impl_in_rule__CheckPoint__Group_4_1__16243 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__2_in_rule__CheckPoint__Group_4_1__16246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__CompletenessAssignment_4_1_1_in_rule__CheckPoint__Group_4_1__1__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__2__Impl_in_rule__CheckPoint__Group_4_1__26303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__3_in_rule__CheckPoint__Group_4_1__26306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CheckPoint__Group_4_1__2__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__3__Impl_in_rule__CheckPoint__Group_4_1__36365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_1__3__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_2__0__Impl_in_rule__CheckPoint__Group_4_2__06429 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_2__1_in_rule__CheckPoint__Group_4_2__06432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CheckPoint__Group_4_2__0__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_2__1__Impl_in_rule__CheckPoint__Group_4_2__16491 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_2__2_in_rule__CheckPoint__Group_4_2__16494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DependenciesAssignment_4_2_1_in_rule__CheckPoint__Group_4_2__1__Impl6521 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_2__2__Impl_in_rule__CheckPoint__Group_4_2__26552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4_2__2__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__06614 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__06617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__16674 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__16677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__26735 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__26738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__36796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__06860 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__06863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ResourceInvolvement__Group_1__0__Impl6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__16922 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__16925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__26982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ResourceInvolvement__Group_1__2__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__07047 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__07050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ResourceInvolvement__Group_2__0__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__17109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__07170 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__07173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__17231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Activity__Group__1__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__27293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__27296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__37353 = new BitSet(new long[]{0x0000078102000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__37356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__47412 = new BitSet(new long[]{0x0000078102000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__47415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__57473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__57476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5_in_rule__Activity__Group__5__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__67533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__6__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__07603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__07606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Activity__Group_4__0__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__17665 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__17668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_4__1__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__27724 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__3_in_rule__Activity__Group_4__27727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InvolvedResourcesAssignment_4_2_in_rule__Activity__Group_4__2__Impl7754 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__3__Impl_in_rule__Activity__Group_4__37785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_4__3__Impl7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_0__0__Impl_in_rule__Activity__Group_5_0_0__07849 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_0__1_in_rule__Activity__Group_5_0_0__07852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Activity__Group_5_0_0__0__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_0__1__Impl_in_rule__Activity__Group_5_0_0__17911 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_0__2_in_rule__Activity__Group_5_0_0__17914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StartAssignment_5_0_0_1_in_rule__Activity__Group_5_0_0__1__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_0__2__Impl_in_rule__Activity__Group_5_0_0__27971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_0_0__2__Impl7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__0__Impl_in_rule__Activity__Group_5_0_1__08033 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__1_in_rule__Activity__Group_5_0_1__08036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Activity__Group_5_0_1__0__Impl8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__1__Impl_in_rule__Activity__Group_5_0_1__18095 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__2_in_rule__Activity__Group_5_0_1__18098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AfterAssignment_5_0_1_1_in_rule__Activity__Group_5_0_1__1__Impl8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__2__Impl_in_rule__Activity__Group_5_0_1__28155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__3_in_rule__Activity__Group_5_0_1__28158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Activity__Group_5_0_1__2__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__3__Impl_in_rule__Activity__Group_5_0_1__38217 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__4_in_rule__Activity__Group_5_0_1__38220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OffsetAssignment_5_0_1_3_in_rule__Activity__Group_5_0_1__3__Impl8247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_0_1__4__Impl_in_rule__Activity__Group_5_0_1__48277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_0_1__4__Impl8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__0__Impl_in_rule__Activity__Group_5_1__08343 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__1_in_rule__Activity__Group_5_1__08346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_5_1_0_in_rule__Activity__Group_5_1__0__Impl8373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__1__Impl_in_rule__Activity__Group_5_1__18403 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__2_in_rule__Activity__Group_5_1__18406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Activity__Group_5_1__1__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__2__Impl_in_rule__Activity__Group_5_1__28465 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__3_in_rule__Activity__Group_5_1__28468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__CompletenessAssignment_5_1_2_in_rule__Activity__Group_5_1__2__Impl8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__3__Impl_in_rule__Activity__Group_5_1__38525 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__4_in_rule__Activity__Group_5_1__38528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Activity__Group_5_1__3__Impl8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__4__Impl_in_rule__Activity__Group_5_1__48587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_1__4__Impl8614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_0__0__Impl_in_rule__Activity__Group_5_1_0_0__08653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_0__1_in_rule__Activity__Group_5_1_0_0__08656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Activity__Group_5_1_0_0__0__Impl8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_0__1__Impl_in_rule__Activity__Group_5_1_0_0__18715 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_0__2_in_rule__Activity__Group_5_1_0_0__18718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__EndAssignment_5_1_0_0_1_in_rule__Activity__Group_5_1_0_0__1__Impl8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_0__2__Impl_in_rule__Activity__Group_5_1_0_0__28775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_1_0_0__2__Impl8802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_1__0__Impl_in_rule__Activity__Group_5_1_0_1__08837 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_1__1_in_rule__Activity__Group_5_1_0_1__08840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Activity__Group_5_1_0_1__0__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_1__1__Impl_in_rule__Activity__Group_5_1_0_1__18899 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_1__2_in_rule__Activity__Group_5_1_0_1__18902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DurationAssignment_5_1_0_1_1_in_rule__Activity__Group_5_1_0_1__1__Impl8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1_0_1__2__Impl_in_rule__Activity__Group_5_1_0_1__28959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_1_0_1__2__Impl8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0__Impl_in_rule__Activity__Group_5_2__09021 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1_in_rule__Activity__Group_5_2__09024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group_5_2__0__Impl9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__1__Impl_in_rule__Activity__Group_5_2__19083 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__2_in_rule__Activity__Group_5_2__19086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DependenciesAssignment_5_2_1_in_rule__Activity__Group_5_2__1__Impl9113 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__2__Impl_in_rule__Activity__Group_5_2__29144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_5_2__2__Impl9171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4__0_in_rule__CheckPoint__UnorderedGroup_49208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Alternatives_4_0_in_rule__CheckPoint__UnorderedGroup_4__Impl9297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_1__0_in_rule__CheckPoint__UnorderedGroup_4__Impl9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4_2__0_in_rule__CheckPoint__UnorderedGroup_4__Impl9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4__Impl_in_rule__CheckPoint__UnorderedGroup_4__09538 = new BitSet(new long[]{0x0000000582000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4__1_in_rule__CheckPoint__UnorderedGroup_4__09541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4__Impl_in_rule__CheckPoint__UnorderedGroup_4__19566 = new BitSet(new long[]{0x0000000582000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4__2_in_rule__CheckPoint__UnorderedGroup_4__19569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_4__Impl_in_rule__CheckPoint__UnorderedGroup_4__29594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5__0_in_rule__Activity__UnorderedGroup_59624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_5_0_in_rule__Activity__UnorderedGroup_5__Impl9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_1__0_in_rule__Activity__UnorderedGroup_5__Impl9804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5_2__0_in_rule__Activity__UnorderedGroup_5__Impl9895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5__Impl_in_rule__Activity__UnorderedGroup_5__09954 = new BitSet(new long[]{0x0000078102000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5__1_in_rule__Activity__UnorderedGroup_5__09957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5__Impl_in_rule__Activity__UnorderedGroup_5__19982 = new BitSet(new long[]{0x0000078102000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5__2_in_rule__Activity__UnorderedGroup_5__19985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_5__Impl_in_rule__Activity__UnorderedGroup_5__210010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_010044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_110075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_3_010106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_4_110141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_510176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_110207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_010238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_210269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_rule__Project__WbsAssignment_4_010300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_rule__Project__ResourcesAssignment_5_010331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_6_010362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_7_210393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_8_210424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_910455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_110486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_110517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_010548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_210579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_4_110614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_510649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WBSImport__ImportURIAssignment_110680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourcesImport__ImportURIAssignment_110711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_110742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_010773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_210804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_4_0_0_110835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_4_0_1_110870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_4_0_1_310905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_4_1_110936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_4_2_110971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_011010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_111045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_111076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_011107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_211138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_4_211169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_5_0_0_111200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_5_0_1_111235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_5_0_1_311270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_5_1_0_0_111301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_5_1_0_1_111332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_5_1_211363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_5_2_111398 = new BitSet(new long[]{0x0000000000000002L});

}
