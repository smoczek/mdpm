package com.lowcoupling.mdpm.lng.plan.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'", "'Program'", "'name'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'dependsOn'", "'wbs'", "'resources'", "'plan'", "'.'", "'CheckPoint'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_CLOSEDCURLY=5;
    public static final int T__38=38;
    public static final int T__39=39;
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

                if ( (LA1_1==18) ) {
                    alt1=1;
                }
                else if ( (LA1_1==21) ) {
                    alt1=2;
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
            case 21:
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
                case 31:
                    {
                    alt2=2;
                    }
                    break;
                case 39:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 25:
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


    // $ANTLR start "rule__CheckPoint__Alternatives_5_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:527:1: rule__CheckPoint__Alternatives_5_0 : ( ( ( rule__CheckPoint__Group_5_0_0__0 ) ) | ( ( rule__CheckPoint__Group_5_0_1__0 ) ) );
    public final void rule__CheckPoint__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:531:1: ( ( ( rule__CheckPoint__Group_5_0_0__0 ) ) | ( ( rule__CheckPoint__Group_5_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:532:1: ( ( rule__CheckPoint__Group_5_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:532:1: ( ( rule__CheckPoint__Group_5_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:533:1: ( rule__CheckPoint__Group_5_0_0__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:534:1: ( rule__CheckPoint__Group_5_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:534:2: rule__CheckPoint__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__0_in_rule__CheckPoint__Alternatives_5_01069);
                    rule__CheckPoint__Group_5_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:6: ( ( rule__CheckPoint__Group_5_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:6: ( ( rule__CheckPoint__Group_5_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:539:1: ( rule__CheckPoint__Group_5_0_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:540:1: ( rule__CheckPoint__Group_5_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:540:2: rule__CheckPoint__Group_5_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__0_in_rule__CheckPoint__Alternatives_5_01087);
                    rule__CheckPoint__Group_5_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Alternatives_5_0"


    // $ANTLR start "rule__Activity__Alternatives_6_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:549:1: rule__Activity__Alternatives_6_0 : ( ( ( rule__Activity__Group_6_0_0__0 ) ) | ( ( rule__Activity__Group_6_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:553:1: ( ( ( rule__Activity__Group_6_0_0__0 ) ) | ( ( rule__Activity__Group_6_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:554:1: ( ( rule__Activity__Group_6_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:554:1: ( ( rule__Activity__Group_6_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:555:1: ( rule__Activity__Group_6_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:556:1: ( rule__Activity__Group_6_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:556:2: rule__Activity__Group_6_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_0_0__0_in_rule__Activity__Alternatives_6_01120);
                    rule__Activity__Group_6_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:6: ( ( rule__Activity__Group_6_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:6: ( ( rule__Activity__Group_6_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:561:1: ( rule__Activity__Group_6_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:562:1: ( rule__Activity__Group_6_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:562:2: rule__Activity__Group_6_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_0_1__0_in_rule__Activity__Alternatives_6_01138);
                    rule__Activity__Group_6_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_0_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives_6_0"


    // $ANTLR start "rule__Activity__Alternatives_6_1_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:571:1: rule__Activity__Alternatives_6_1_0 : ( ( ( rule__Activity__Group_6_1_0_0__0 ) ) | ( ( rule__Activity__Group_6_1_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:575:1: ( ( ( rule__Activity__Group_6_1_0_0__0 ) ) | ( ( rule__Activity__Group_6_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:576:1: ( ( rule__Activity__Group_6_1_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:576:1: ( ( rule__Activity__Group_6_1_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:577:1: ( rule__Activity__Group_6_1_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_1_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:578:1: ( rule__Activity__Group_6_1_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:578:2: rule__Activity__Group_6_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__0_in_rule__Activity__Alternatives_6_1_01171);
                    rule__Activity__Group_6_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:6: ( ( rule__Activity__Group_6_1_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:6: ( ( rule__Activity__Group_6_1_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:583:1: ( rule__Activity__Group_6_1_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_1_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:584:1: ( rule__Activity__Group_6_1_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:584:2: rule__Activity__Group_6_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__0_in_rule__Activity__Alternatives_6_1_01189);
                    rule__Activity__Group_6_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_1_0_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives_6_1_0"


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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:795:1: rule__Program__Group_0_1__3__Impl : ( ( rule__Program__Group_0_1_3__0 )? ) ;
    public final void rule__Program__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:799:1: ( ( ( rule__Program__Group_0_1_3__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:800:1: ( ( rule__Program__Group_0_1_3__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:800:1: ( ( rule__Program__Group_0_1_3__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:801:1: ( rule__Program__Group_0_1_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:802:1: ( rule__Program__Group_0_1_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
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

            }

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

                if ( (LA9_0==29) ) {
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:853:1: rule__Program__Group_0_1__5__Impl : ( ( rule__Program__Group_0_1_5__0 )* ) ;
    public final void rule__Program__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:857:1: ( ( ( rule__Program__Group_0_1_5__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:858:1: ( ( rule__Program__Group_0_1_5__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:858:1: ( ( rule__Program__Group_0_1_5__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:859:1: ( rule__Program__Group_0_1_5__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:860:1: ( rule__Program__Group_0_1_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:860:2: rule__Program__Group_0_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_5__0_in_rule__Program__Group_0_1__5__Impl1774);
            	    rule__Program__Group_0_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_5()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:870:1: rule__Program__Group_0_1__6 : rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7 ;
    public final void rule__Program__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:874:1: ( rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:875:2: rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61805);
            rule__Program__Group_0_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__7_in_rule__Program__Group_0_1__61808);
            rule__Program__Group_0_1__7();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:882:1: rule__Program__Group_0_1__6__Impl : ( ( rule__Program__ProjectsAssignment_0_1_6 )* ) ;
    public final void rule__Program__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:886:1: ( ( ( rule__Program__ProjectsAssignment_0_1_6 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:887:1: ( ( rule__Program__ProjectsAssignment_0_1_6 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:887:1: ( ( rule__Program__ProjectsAssignment_0_1_6 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:888:1: ( rule__Program__ProjectsAssignment_0_1_6 )*
            {
             before(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:889:1: ( rule__Program__ProjectsAssignment_0_1_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:889:2: rule__Program__ProjectsAssignment_0_1_6
            	    {
            	    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_0_1_6_in_rule__Program__Group_0_1__6__Impl1835);
            	    rule__Program__ProjectsAssignment_0_1_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6()); 

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


    // $ANTLR start "rule__Program__Group_0_1__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:899:1: rule__Program__Group_0_1__7 : rule__Program__Group_0_1__7__Impl ;
    public final void rule__Program__Group_0_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:903:1: ( rule__Program__Group_0_1__7__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:904:2: rule__Program__Group_0_1__7__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__7__Impl_in_rule__Program__Group_0_1__71866);
            rule__Program__Group_0_1__7__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1__7"


    // $ANTLR start "rule__Program__Group_0_1__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:910:1: rule__Program__Group_0_1__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Program__Group_0_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:914:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:915:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:915:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:916:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__7__Impl1893); 
             after(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 

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
    // $ANTLR end "rule__Program__Group_0_1__7__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:943:1: rule__Program__Group_0_1_3__0 : rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 ;
    public final void rule__Program__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:947:1: ( rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:948:2: rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01938);
            rule__Program__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01941);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:955:1: rule__Program__Group_0_1_3__0__Impl : ( 'name' ) ;
    public final void rule__Program__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:959:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:960:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:960:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:961:1: 'name'
            {
             before(grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group_0_1_3__0__Impl1969); 
             after(grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:974:1: rule__Program__Group_0_1_3__1 : rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2 ;
    public final void rule__Program__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:978:1: ( rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:979:2: rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__12000);
            rule__Program__Group_0_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__2_in_rule__Program__Group_0_1_3__12003);
            rule__Program__Group_0_1_3__2();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:986:1: rule__Program__Group_0_1_3__1__Impl : ( ( rule__Program__LongNameAssignment_0_1_3_1 ) ) ;
    public final void rule__Program__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:990:1: ( ( ( rule__Program__LongNameAssignment_0_1_3_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:991:1: ( ( rule__Program__LongNameAssignment_0_1_3_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:991:1: ( ( rule__Program__LongNameAssignment_0_1_3_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:992:1: ( rule__Program__LongNameAssignment_0_1_3_1 )
            {
             before(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:993:1: ( rule__Program__LongNameAssignment_0_1_3_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:993:2: rule__Program__LongNameAssignment_0_1_3_1
            {
            pushFollow(FOLLOW_rule__Program__LongNameAssignment_0_1_3_1_in_rule__Program__Group_0_1_3__1__Impl2030);
            rule__Program__LongNameAssignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1()); 

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


    // $ANTLR start "rule__Program__Group_0_1_3__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1003:1: rule__Program__Group_0_1_3__2 : rule__Program__Group_0_1_3__2__Impl ;
    public final void rule__Program__Group_0_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1007:1: ( rule__Program__Group_0_1_3__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1008:2: rule__Program__Group_0_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__2__Impl_in_rule__Program__Group_0_1_3__22060);
            rule__Program__Group_0_1_3__2__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_3__2"


    // $ANTLR start "rule__Program__Group_0_1_3__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1014:1: rule__Program__Group_0_1_3__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1018:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1019:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1019:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1020:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__2__Impl2087);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1_3__2__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1037:1: rule__Program__Group_0_1_4__0 : rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 ;
    public final void rule__Program__Group_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1041:1: ( rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1042:2: rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__02122);
            rule__Program__Group_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__02125);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1049:1: rule__Program__Group_0_1_4__0__Impl : ( ( rule__Program__PlansAssignment_0_1_4_0 ) ) ;
    public final void rule__Program__Group_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1053:1: ( ( ( rule__Program__PlansAssignment_0_1_4_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1054:1: ( ( rule__Program__PlansAssignment_0_1_4_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1054:1: ( ( rule__Program__PlansAssignment_0_1_4_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1055:1: ( rule__Program__PlansAssignment_0_1_4_0 )
            {
             before(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1056:1: ( rule__Program__PlansAssignment_0_1_4_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1056:2: rule__Program__PlansAssignment_0_1_4_0
            {
            pushFollow(FOLLOW_rule__Program__PlansAssignment_0_1_4_0_in_rule__Program__Group_0_1_4__0__Impl2152);
            rule__Program__PlansAssignment_0_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1066:1: rule__Program__Group_0_1_4__1 : rule__Program__Group_0_1_4__1__Impl ;
    public final void rule__Program__Group_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1070:1: ( rule__Program__Group_0_1_4__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1071:2: rule__Program__Group_0_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12182);
            rule__Program__Group_0_1_4__1__Impl();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1077:1: rule__Program__Group_0_1_4__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1081:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1082:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1082:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1083:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__1__Impl2209);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 

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


    // $ANTLR start "rule__Program__Group_0_1_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1098:1: rule__Program__Group_0_1_5__0 : rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1 ;
    public final void rule__Program__Group_0_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1102:1: ( rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1103:2: rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__0__Impl_in_rule__Program__Group_0_1_5__02242);
            rule__Program__Group_0_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_5__1_in_rule__Program__Group_0_1_5__02245);
            rule__Program__Group_0_1_5__1();

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
    // $ANTLR end "rule__Program__Group_0_1_5__0"


    // $ANTLR start "rule__Program__Group_0_1_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1110:1: rule__Program__Group_0_1_5__0__Impl : ( 'project' ) ;
    public final void rule__Program__Group_0_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1114:1: ( ( 'project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1115:1: ( 'project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1115:1: ( 'project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1116:1: 'project'
            {
             before(grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Program__Group_0_1_5__0__Impl2273); 
             after(grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1_5__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1129:1: rule__Program__Group_0_1_5__1 : rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2 ;
    public final void rule__Program__Group_0_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1133:1: ( rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1134:2: rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__1__Impl_in_rule__Program__Group_0_1_5__12304);
            rule__Program__Group_0_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_5__2_in_rule__Program__Group_0_1_5__12307);
            rule__Program__Group_0_1_5__2();

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
    // $ANTLR end "rule__Program__Group_0_1_5__1"


    // $ANTLR start "rule__Program__Group_0_1_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1141:1: rule__Program__Group_0_1_5__1__Impl : ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) ) ;
    public final void rule__Program__Group_0_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1145:1: ( ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1146:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1146:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1147:1: ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1148:1: ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1148:2: rule__Program__ReferencedProjectsAssignment_0_1_5_1
            {
            pushFollow(FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_5_1_in_rule__Program__Group_0_1_5__1__Impl2334);
            rule__Program__ReferencedProjectsAssignment_0_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1_5__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1158:1: rule__Program__Group_0_1_5__2 : rule__Program__Group_0_1_5__2__Impl ;
    public final void rule__Program__Group_0_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1162:1: ( rule__Program__Group_0_1_5__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1163:2: rule__Program__Group_0_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__2__Impl_in_rule__Program__Group_0_1_5__22364);
            rule__Program__Group_0_1_5__2__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_5__2"


    // $ANTLR start "rule__Program__Group_0_1_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1169:1: rule__Program__Group_0_1_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1173:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1174:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1174:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1175:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_5__2__Impl2391);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1_5__2__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1192:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1196:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1197:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02426);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02429);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1204:1: rule__Project__Group__0__Impl : ( ( rule__Project__DescriptionAssignment_0 )? ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1208:1: ( ( ( rule__Project__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1209:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1209:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1210:1: ( rule__Project__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1211:1: ( rule__Project__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ML_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1211:2: rule__Project__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2456);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1221:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1225:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1226:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12487);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12490);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1233:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1237:1: ( ( 'Project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1238:1: ( 'Project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1238:1: ( 'Project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1239:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group__1__Impl2518); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1252:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1256:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1257:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22549);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22552);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1264:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1268:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1269:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1269:1: ( ( rule__Project__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1270:1: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1271:1: ( rule__Project__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1271:2: rule__Project__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2579);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1281:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1285:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1286:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32609);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32612);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1293:1: rule__Project__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1297:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1298:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1298:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1299:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2639); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1310:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1314:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1315:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42668);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42671);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1322:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1326:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1327:1: ( ( rule__Project__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1327:1: ( ( rule__Project__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1328:1: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1329:1: ( rule__Project__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1329:2: rule__Project__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2698);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1339:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1343:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1344:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52729);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52732);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1351:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1355:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1356:1: ( ( rule__Project__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1356:1: ( ( rule__Project__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1357:1: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1358:1: ( rule__Project__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1358:2: rule__Project__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl2759);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1368:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1372:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1373:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62790);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62793);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1380:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1384:1: ( ( ( rule__Project__Group_6__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1385:1: ( ( rule__Project__Group_6__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1385:1: ( ( rule__Project__Group_6__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1386:1: ( rule__Project__Group_6__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1387:1: ( rule__Project__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1387:2: rule__Project__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2820);
                    rule__Project__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1397:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1401:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1402:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72851);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72854);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1409:1: rule__Project__Group__7__Impl : ( ( rule__Project__Group_7__0 )* ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1413:1: ( ( ( rule__Project__Group_7__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1414:1: ( ( rule__Project__Group_7__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1414:1: ( ( rule__Project__Group_7__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1415:1: ( rule__Project__Group_7__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_7()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1416:1: ( rule__Project__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1416:2: rule__Project__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2881);
            	    rule__Project__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1426:1: rule__Project__Group__8 : rule__Project__Group__8__Impl rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1430:1: ( rule__Project__Group__8__Impl rule__Project__Group__9 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1431:2: rule__Project__Group__8__Impl rule__Project__Group__9
            {
            pushFollow(FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82912);
            rule__Project__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82915);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1438:1: rule__Project__Group__8__Impl : ( ( rule__Project__Group_8__0 )? ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1442:1: ( ( ( rule__Project__Group_8__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1443:1: ( ( rule__Project__Group_8__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1443:1: ( ( rule__Project__Group_8__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1444:1: ( rule__Project__Group_8__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_8()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1445:1: ( rule__Project__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1445:2: rule__Project__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2942);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1455:1: rule__Project__Group__9 : rule__Project__Group__9__Impl rule__Project__Group__10 ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1459:1: ( rule__Project__Group__9__Impl rule__Project__Group__10 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1460:2: rule__Project__Group__9__Impl rule__Project__Group__10
            {
            pushFollow(FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92973);
            rule__Project__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92976);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1467:1: rule__Project__Group__9__Impl : ( ( rule__Project__Group_9__0 )? ) ;
    public final void rule__Project__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1471:1: ( ( ( rule__Project__Group_9__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1472:1: ( ( rule__Project__Group_9__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1472:1: ( ( rule__Project__Group_9__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1473:1: ( rule__Project__Group_9__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_9()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1474:1: ( rule__Project__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1474:2: rule__Project__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_9__0_in_rule__Project__Group__9__Impl3003);
                    rule__Project__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_9()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1484:1: rule__Project__Group__10 : rule__Project__Group__10__Impl rule__Project__Group__11 ;
    public final void rule__Project__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1488:1: ( rule__Project__Group__10__Impl rule__Project__Group__11 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1489:2: rule__Project__Group__10__Impl rule__Project__Group__11
            {
            pushFollow(FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__103034);
            rule__Project__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__11_in_rule__Project__Group__103037);
            rule__Project__Group__11();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1496:1: rule__Project__Group__10__Impl : ( ( rule__Project__ActivitiesAssignment_10 )* ) ;
    public final void rule__Project__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1500:1: ( ( ( rule__Project__ActivitiesAssignment_10 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1501:1: ( ( rule__Project__ActivitiesAssignment_10 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1501:1: ( ( rule__Project__ActivitiesAssignment_10 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1502:1: ( rule__Project__ActivitiesAssignment_10 )*
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_10()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1503:1: ( rule__Project__ActivitiesAssignment_10 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ML_COMMENT||LA19_0==25||LA19_0==31||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1503:2: rule__Project__ActivitiesAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Project__ActivitiesAssignment_10_in_rule__Project__Group__10__Impl3064);
            	    rule__Project__ActivitiesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_10()); 

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


    // $ANTLR start "rule__Project__Group__11"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1513:1: rule__Project__Group__11 : rule__Project__Group__11__Impl ;
    public final void rule__Project__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1517:1: ( rule__Project__Group__11__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1518:2: rule__Project__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__11__Impl_in_rule__Project__Group__113095);
            rule__Project__Group__11__Impl();

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
    // $ANTLR end "rule__Project__Group__11"


    // $ANTLR start "rule__Project__Group__11__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1524:1: rule__Project__Group__11__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1528:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1529:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1529:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1530:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_11()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__11__Impl3122); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_11()); 

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
    // $ANTLR end "rule__Project__Group__11__Impl"


    // $ANTLR start "rule__Project__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1565:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1569:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1570:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__03175);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__03178);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1577:1: rule__Project__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1581:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1582:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1582:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1583:1: 'name'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group_4__0__Impl3206); 
             after(grammarAccess.getProjectAccess().getNameKeyword_4_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1596:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl rule__Project__Group_4__2 ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1600:1: ( rule__Project__Group_4__1__Impl rule__Project__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1601:2: rule__Project__Group_4__1__Impl rule__Project__Group_4__2
            {
            pushFollow(FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__13237);
            rule__Project__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__13240);
            rule__Project__Group_4__2();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1608:1: rule__Project__Group_4__1__Impl : ( ( rule__Project__LongNameAssignment_4_1 ) ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1612:1: ( ( ( rule__Project__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1613:1: ( ( rule__Project__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1613:1: ( ( rule__Project__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1614:1: ( rule__Project__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getProjectAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1615:1: ( rule__Project__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1615:2: rule__Project__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Project__LongNameAssignment_4_1_in_rule__Project__Group_4__1__Impl3267);
            rule__Project__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getLongNameAssignment_4_1()); 

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


    // $ANTLR start "rule__Project__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1625:1: rule__Project__Group_4__2 : rule__Project__Group_4__2__Impl ;
    public final void rule__Project__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1629:1: ( rule__Project__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1630:2: rule__Project__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__23297);
            rule__Project__Group_4__2__Impl();

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
    // $ANTLR end "rule__Project__Group_4__2"


    // $ANTLR start "rule__Project__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1636:1: rule__Project__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1640:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1641:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1641:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1642:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_4__2__Impl3324);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 

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
    // $ANTLR end "rule__Project__Group_4__2__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1659:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1663:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1664:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__03359);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__03362);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1671:1: rule__Project__Group_5__0__Impl : ( ( rule__Project__WbsAssignment_5_0 ) ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1675:1: ( ( ( rule__Project__WbsAssignment_5_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1676:1: ( ( rule__Project__WbsAssignment_5_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1676:1: ( ( rule__Project__WbsAssignment_5_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1677:1: ( rule__Project__WbsAssignment_5_0 )
            {
             before(grammarAccess.getProjectAccess().getWbsAssignment_5_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1678:1: ( rule__Project__WbsAssignment_5_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1678:2: rule__Project__WbsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Project__WbsAssignment_5_0_in_rule__Project__Group_5__0__Impl3389);
            rule__Project__WbsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getWbsAssignment_5_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1688:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1692:1: ( rule__Project__Group_5__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1693:2: rule__Project__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__13419);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1699:1: rule__Project__Group_5__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1703:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1704:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1704:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1705:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_5__1__Impl3446);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1720:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1724:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1725:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03479);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03482);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1732:1: rule__Project__Group_6__0__Impl : ( ( rule__Project__ResourcesAssignment_6_0 ) ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1736:1: ( ( ( rule__Project__ResourcesAssignment_6_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1737:1: ( ( rule__Project__ResourcesAssignment_6_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1737:1: ( ( rule__Project__ResourcesAssignment_6_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1738:1: ( rule__Project__ResourcesAssignment_6_0 )
            {
             before(grammarAccess.getProjectAccess().getResourcesAssignment_6_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1739:1: ( rule__Project__ResourcesAssignment_6_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1739:2: rule__Project__ResourcesAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Project__ResourcesAssignment_6_0_in_rule__Project__Group_6__0__Impl3509);
            rule__Project__ResourcesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getResourcesAssignment_6_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1749:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1753:1: ( rule__Project__Group_6__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1754:2: rule__Project__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13539);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1760:1: rule__Project__Group_6__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1764:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1765:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1765:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1766:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3566);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1781:1: rule__Project__Group_7__0 : rule__Project__Group_7__0__Impl rule__Project__Group_7__1 ;
    public final void rule__Project__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1785:1: ( rule__Project__Group_7__0__Impl rule__Project__Group_7__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1786:2: rule__Project__Group_7__0__Impl rule__Project__Group_7__1
            {
            pushFollow(FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03599);
            rule__Project__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03602);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1793:1: rule__Project__Group_7__0__Impl : ( ( rule__Project__PlansAssignment_7_0 ) ) ;
    public final void rule__Project__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1797:1: ( ( ( rule__Project__PlansAssignment_7_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1798:1: ( ( rule__Project__PlansAssignment_7_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1798:1: ( ( rule__Project__PlansAssignment_7_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1799:1: ( rule__Project__PlansAssignment_7_0 )
            {
             before(grammarAccess.getProjectAccess().getPlansAssignment_7_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1800:1: ( rule__Project__PlansAssignment_7_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1800:2: rule__Project__PlansAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Project__PlansAssignment_7_0_in_rule__Project__Group_7__0__Impl3629);
            rule__Project__PlansAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPlansAssignment_7_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1810:1: rule__Project__Group_7__1 : rule__Project__Group_7__1__Impl ;
    public final void rule__Project__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1814:1: ( rule__Project__Group_7__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1815:2: rule__Project__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13659);
            rule__Project__Group_7__1__Impl();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1821:1: rule__Project__Group_7__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1825:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1826:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1826:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1827:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_7_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_7__1__Impl3686);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_7_1()); 

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


    // $ANTLR start "rule__Project__Group_8__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1842:1: rule__Project__Group_8__0 : rule__Project__Group_8__0__Impl rule__Project__Group_8__1 ;
    public final void rule__Project__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1846:1: ( rule__Project__Group_8__0__Impl rule__Project__Group_8__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1847:2: rule__Project__Group_8__0__Impl rule__Project__Group_8__1
            {
            pushFollow(FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03719);
            rule__Project__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03722);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1854:1: rule__Project__Group_8__0__Impl : ( 'assumptions' ) ;
    public final void rule__Project__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1858:1: ( ( 'assumptions' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1859:1: ( 'assumptions' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1859:1: ( 'assumptions' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1860:1: 'assumptions'
            {
             before(grammarAccess.getProjectAccess().getAssumptionsKeyword_8_0()); 
            match(input,22,FOLLOW_22_in_rule__Project__Group_8__0__Impl3750); 
             after(grammarAccess.getProjectAccess().getAssumptionsKeyword_8_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1873:1: rule__Project__Group_8__1 : rule__Project__Group_8__1__Impl rule__Project__Group_8__2 ;
    public final void rule__Project__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1877:1: ( rule__Project__Group_8__1__Impl rule__Project__Group_8__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1878:2: rule__Project__Group_8__1__Impl rule__Project__Group_8__2
            {
            pushFollow(FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13781);
            rule__Project__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13784);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1885:1: rule__Project__Group_8__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1889:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1891:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3811); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1902:1: rule__Project__Group_8__2 : rule__Project__Group_8__2__Impl rule__Project__Group_8__3 ;
    public final void rule__Project__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1906:1: ( rule__Project__Group_8__2__Impl rule__Project__Group_8__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1907:2: rule__Project__Group_8__2__Impl rule__Project__Group_8__3
            {
            pushFollow(FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23840);
            rule__Project__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23843);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1914:1: rule__Project__Group_8__2__Impl : ( ( rule__Project__AssumptionsAssignment_8_2 )* ) ;
    public final void rule__Project__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1918:1: ( ( ( rule__Project__AssumptionsAssignment_8_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1919:1: ( ( rule__Project__AssumptionsAssignment_8_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1919:1: ( ( rule__Project__AssumptionsAssignment_8_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1920:1: ( rule__Project__AssumptionsAssignment_8_2 )*
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssignment_8_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1921:1: ( rule__Project__AssumptionsAssignment_8_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1921:2: rule__Project__AssumptionsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__AssumptionsAssignment_8_2_in_rule__Project__Group_8__2__Impl3870);
            	    rule__Project__AssumptionsAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getAssumptionsAssignment_8_2()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1931:1: rule__Project__Group_8__3 : rule__Project__Group_8__3__Impl ;
    public final void rule__Project__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1935:1: ( rule__Project__Group_8__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1936:2: rule__Project__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__33901);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1942:1: rule__Project__Group_8__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1946:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1947:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1947:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1948:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl3928); 
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


    // $ANTLR start "rule__Project__Group_9__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1967:1: rule__Project__Group_9__0 : rule__Project__Group_9__0__Impl rule__Project__Group_9__1 ;
    public final void rule__Project__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1971:1: ( rule__Project__Group_9__0__Impl rule__Project__Group_9__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1972:2: rule__Project__Group_9__0__Impl rule__Project__Group_9__1
            {
            pushFollow(FOLLOW_rule__Project__Group_9__0__Impl_in_rule__Project__Group_9__03965);
            rule__Project__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_9__1_in_rule__Project__Group_9__03968);
            rule__Project__Group_9__1();

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
    // $ANTLR end "rule__Project__Group_9__0"


    // $ANTLR start "rule__Project__Group_9__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1979:1: rule__Project__Group_9__0__Impl : ( 'constraints' ) ;
    public final void rule__Project__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1983:1: ( ( 'constraints' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1984:1: ( 'constraints' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1984:1: ( 'constraints' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1985:1: 'constraints'
            {
             before(grammarAccess.getProjectAccess().getConstraintsKeyword_9_0()); 
            match(input,23,FOLLOW_23_in_rule__Project__Group_9__0__Impl3996); 
             after(grammarAccess.getProjectAccess().getConstraintsKeyword_9_0()); 

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
    // $ANTLR end "rule__Project__Group_9__0__Impl"


    // $ANTLR start "rule__Project__Group_9__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1998:1: rule__Project__Group_9__1 : rule__Project__Group_9__1__Impl rule__Project__Group_9__2 ;
    public final void rule__Project__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2002:1: ( rule__Project__Group_9__1__Impl rule__Project__Group_9__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2003:2: rule__Project__Group_9__1__Impl rule__Project__Group_9__2
            {
            pushFollow(FOLLOW_rule__Project__Group_9__1__Impl_in_rule__Project__Group_9__14027);
            rule__Project__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_9__2_in_rule__Project__Group_9__14030);
            rule__Project__Group_9__2();

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
    // $ANTLR end "rule__Project__Group_9__1"


    // $ANTLR start "rule__Project__Group_9__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2010:1: rule__Project__Group_9__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2014:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2015:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2015:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2016:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_9_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_9__1__Impl4057); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_9_1()); 

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
    // $ANTLR end "rule__Project__Group_9__1__Impl"


    // $ANTLR start "rule__Project__Group_9__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2027:1: rule__Project__Group_9__2 : rule__Project__Group_9__2__Impl rule__Project__Group_9__3 ;
    public final void rule__Project__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2031:1: ( rule__Project__Group_9__2__Impl rule__Project__Group_9__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2032:2: rule__Project__Group_9__2__Impl rule__Project__Group_9__3
            {
            pushFollow(FOLLOW_rule__Project__Group_9__2__Impl_in_rule__Project__Group_9__24086);
            rule__Project__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_9__3_in_rule__Project__Group_9__24089);
            rule__Project__Group_9__3();

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
    // $ANTLR end "rule__Project__Group_9__2"


    // $ANTLR start "rule__Project__Group_9__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2039:1: rule__Project__Group_9__2__Impl : ( ( rule__Project__ConstraintsAssignment_9_2 )* ) ;
    public final void rule__Project__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2043:1: ( ( ( rule__Project__ConstraintsAssignment_9_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2044:1: ( ( rule__Project__ConstraintsAssignment_9_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2044:1: ( ( rule__Project__ConstraintsAssignment_9_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2045:1: ( rule__Project__ConstraintsAssignment_9_2 )*
            {
             before(grammarAccess.getProjectAccess().getConstraintsAssignment_9_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2046:1: ( rule__Project__ConstraintsAssignment_9_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2046:2: rule__Project__ConstraintsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__ConstraintsAssignment_9_2_in_rule__Project__Group_9__2__Impl4116);
            	    rule__Project__ConstraintsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getConstraintsAssignment_9_2()); 

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
    // $ANTLR end "rule__Project__Group_9__2__Impl"


    // $ANTLR start "rule__Project__Group_9__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2056:1: rule__Project__Group_9__3 : rule__Project__Group_9__3__Impl ;
    public final void rule__Project__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2060:1: ( rule__Project__Group_9__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2061:2: rule__Project__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_9__3__Impl_in_rule__Project__Group_9__34147);
            rule__Project__Group_9__3__Impl();

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
    // $ANTLR end "rule__Project__Group_9__3"


    // $ANTLR start "rule__Project__Group_9__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2067:1: rule__Project__Group_9__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2071:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2072:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2072:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2073:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_9_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_9__3__Impl4174); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_9_3()); 

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
    // $ANTLR end "rule__Project__Group_9__3__Impl"


    // $ANTLR start "rule__Assumption__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2092:1: rule__Assumption__Group__0 : rule__Assumption__Group__0__Impl rule__Assumption__Group__1 ;
    public final void rule__Assumption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2096:1: ( rule__Assumption__Group__0__Impl rule__Assumption__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2097:2: rule__Assumption__Group__0__Impl rule__Assumption__Group__1
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__04211);
            rule__Assumption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__04214);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2104:1: rule__Assumption__Group__0__Impl : ( '-' ) ;
    public final void rule__Assumption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2108:1: ( ( '-' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2109:1: ( '-' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2109:1: ( '-' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2110:1: '-'
            {
             before(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Assumption__Group__0__Impl4242); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2123:1: rule__Assumption__Group__1 : rule__Assumption__Group__1__Impl rule__Assumption__Group__2 ;
    public final void rule__Assumption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2127:1: ( rule__Assumption__Group__1__Impl rule__Assumption__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2128:2: rule__Assumption__Group__1__Impl rule__Assumption__Group__2
            {
            pushFollow(FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__14273);
            rule__Assumption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__14276);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2135:1: rule__Assumption__Group__1__Impl : ( ( rule__Assumption__ValueAssignment_1 ) ) ;
    public final void rule__Assumption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2139:1: ( ( ( rule__Assumption__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2140:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2140:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2141:1: ( rule__Assumption__ValueAssignment_1 )
            {
             before(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2142:1: ( rule__Assumption__ValueAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2142:2: rule__Assumption__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl4303);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2152:1: rule__Assumption__Group__2 : rule__Assumption__Group__2__Impl ;
    public final void rule__Assumption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2156:1: ( rule__Assumption__Group__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2157:2: rule__Assumption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__24333);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2163:1: rule__Assumption__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Assumption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2167:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2168:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2168:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2169:1: ruleENDLINE
            {
             before(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl4360);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2186:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2190:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2191:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04395);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04398);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2198:1: rule__Constraint__Group__0__Impl : ( '-' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2202:1: ( ( '-' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2203:1: ( '-' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2203:1: ( '-' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2204:1: '-'
            {
             before(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__0__Impl4426); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2217:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2221:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2222:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14457);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14460);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2229:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ValueAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2233:1: ( ( ( rule__Constraint__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2234:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2234:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2235:1: ( rule__Constraint__ValueAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2236:1: ( rule__Constraint__ValueAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2236:2: rule__Constraint__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl4487);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2246:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2250:1: ( rule__Constraint__Group__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2251:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24517);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2257:1: rule__Constraint__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2261:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2262:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2262:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2263:1: ruleENDLINE
            {
             before(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4544);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2280:1: rule__ActivityGroup__Group__0 : rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 ;
    public final void rule__ActivityGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2284:1: ( rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2285:2: rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04579);
            rule__ActivityGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04582);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2292:1: rule__ActivityGroup__Group__0__Impl : ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) ;
    public final void rule__ActivityGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2296:1: ( ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2297:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2297:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2298:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2299:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ML_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2299:2: rule__ActivityGroup__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4609);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2309:1: rule__ActivityGroup__Group__1 : rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 ;
    public final void rule__ActivityGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2313:1: ( rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2314:2: rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14640);
            rule__ActivityGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14643);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2321:1: rule__ActivityGroup__Group__1__Impl : ( 'Group' ) ;
    public final void rule__ActivityGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2325:1: ( ( 'Group' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2326:1: ( 'Group' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2326:1: ( 'Group' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2327:1: 'Group'
            {
             before(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ActivityGroup__Group__1__Impl4671); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2340:1: rule__ActivityGroup__Group__2 : rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 ;
    public final void rule__ActivityGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2344:1: ( rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2345:2: rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24702);
            rule__ActivityGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24705);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2352:1: rule__ActivityGroup__Group__2__Impl : ( ( rule__ActivityGroup__NameAssignment_2 ) ) ;
    public final void rule__ActivityGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2356:1: ( ( ( rule__ActivityGroup__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2357:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2357:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2358:1: ( rule__ActivityGroup__NameAssignment_2 )
            {
             before(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2359:1: ( rule__ActivityGroup__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2359:2: rule__ActivityGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4732);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2369:1: rule__ActivityGroup__Group__3 : rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 ;
    public final void rule__ActivityGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2373:1: ( rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2374:2: rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34762);
            rule__ActivityGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34765);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2381:1: rule__ActivityGroup__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__ActivityGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2385:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2386:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2386:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2387:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4792); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2398:1: rule__ActivityGroup__Group__4 : rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 ;
    public final void rule__ActivityGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2402:1: ( rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2403:2: rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44821);
            rule__ActivityGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44824);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2410:1: rule__ActivityGroup__Group__4__Impl : ( ( rule__ActivityGroup__Group_4__0 )? ) ;
    public final void rule__ActivityGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2414:1: ( ( ( rule__ActivityGroup__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2415:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2415:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2416:1: ( rule__ActivityGroup__Group_4__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2417:1: ( rule__ActivityGroup__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2417:2: rule__ActivityGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4851);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2427:1: rule__ActivityGroup__Group__5 : rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 ;
    public final void rule__ActivityGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2431:1: ( rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2432:2: rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__54882);
            rule__ActivityGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__54885);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2439:1: rule__ActivityGroup__Group__5__Impl : ( ( rule__ActivityGroup__Group_5__0 )? ) ;
    public final void rule__ActivityGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2443:1: ( ( ( rule__ActivityGroup__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2444:1: ( ( rule__ActivityGroup__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2444:1: ( ( rule__ActivityGroup__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2445:1: ( rule__ActivityGroup__Group_5__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2446:1: ( rule__ActivityGroup__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2446:2: rule__ActivityGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_5__0_in_rule__ActivityGroup__Group__5__Impl4912);
                    rule__ActivityGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_5()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2456:1: rule__ActivityGroup__Group__6 : rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7 ;
    public final void rule__ActivityGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2460:1: ( rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2461:2: rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__64943);
            rule__ActivityGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__7_in_rule__ActivityGroup__Group__64946);
            rule__ActivityGroup__Group__7();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2468:1: rule__ActivityGroup__Group__6__Impl : ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* ) ;
    public final void rule__ActivityGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2472:1: ( ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2473:1: ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2473:1: ( ( rule__ActivityGroup__ActivitiesAssignment_6 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2474:1: ( rule__ActivityGroup__ActivitiesAssignment_6 )*
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2475:1: ( rule__ActivityGroup__ActivitiesAssignment_6 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ML_COMMENT||LA25_0==25||LA25_0==31||LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2475:2: rule__ActivityGroup__ActivitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__ActivitiesAssignment_6_in_rule__ActivityGroup__Group__6__Impl4973);
            	    rule__ActivityGroup__ActivitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_6()); 

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


    // $ANTLR start "rule__ActivityGroup__Group__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2485:1: rule__ActivityGroup__Group__7 : rule__ActivityGroup__Group__7__Impl ;
    public final void rule__ActivityGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2489:1: ( rule__ActivityGroup__Group__7__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2490:2: rule__ActivityGroup__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__7__Impl_in_rule__ActivityGroup__Group__75004);
            rule__ActivityGroup__Group__7__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group__7"


    // $ANTLR start "rule__ActivityGroup__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2496:1: rule__ActivityGroup__Group__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__ActivityGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2500:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2501:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2501:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2502:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__7__Impl5031); 
             after(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__7__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2529:1: rule__ActivityGroup__Group_4__0 : rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 ;
    public final void rule__ActivityGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2533:1: ( rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2534:2: rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__05076);
            rule__ActivityGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__05079);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2541:1: rule__ActivityGroup__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__ActivityGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2545:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2546:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2546:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2547:1: 'name'
            {
             before(grammarAccess.getActivityGroupAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__ActivityGroup__Group_4__0__Impl5107); 
             after(grammarAccess.getActivityGroupAccess().getNameKeyword_4_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2560:1: rule__ActivityGroup__Group_4__1 : rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 ;
    public final void rule__ActivityGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2564:1: ( rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2565:2: rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__15138);
            rule__ActivityGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__15141);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2572:1: rule__ActivityGroup__Group_4__1__Impl : ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) ) ;
    public final void rule__ActivityGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2576:1: ( ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2577:1: ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2577:1: ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2578:1: ( rule__ActivityGroup__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2579:1: ( rule__ActivityGroup__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2579:2: rule__ActivityGroup__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__LongNameAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl5168);
            rule__ActivityGroup__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2589:1: rule__ActivityGroup__Group_4__2 : rule__ActivityGroup__Group_4__2__Impl ;
    public final void rule__ActivityGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2593:1: ( rule__ActivityGroup__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2594:2: rule__ActivityGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__25198);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2600:1: rule__ActivityGroup__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2604:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2605:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2605:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2606:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl5225);
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


    // $ANTLR start "rule__ActivityGroup__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2623:1: rule__ActivityGroup__Group_5__0 : rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1 ;
    public final void rule__ActivityGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2627:1: ( rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2628:2: rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__0__Impl_in_rule__ActivityGroup__Group_5__05260);
            rule__ActivityGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__1_in_rule__ActivityGroup__Group_5__05263);
            rule__ActivityGroup__Group_5__1();

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
    // $ANTLR end "rule__ActivityGroup__Group_5__0"


    // $ANTLR start "rule__ActivityGroup__Group_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2635:1: rule__ActivityGroup__Group_5__0__Impl : ( 'dependsOn' ) ;
    public final void rule__ActivityGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2639:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2640:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2640:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2641:1: 'dependsOn'
            {
             before(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__ActivityGroup__Group_5__0__Impl5291); 
             after(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_5_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_5__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2654:1: rule__ActivityGroup__Group_5__1 : rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2 ;
    public final void rule__ActivityGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2658:1: ( rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2659:2: rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__1__Impl_in_rule__ActivityGroup__Group_5__15322);
            rule__ActivityGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__2_in_rule__ActivityGroup__Group_5__15325);
            rule__ActivityGroup__Group_5__2();

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
    // $ANTLR end "rule__ActivityGroup__Group_5__1"


    // $ANTLR start "rule__ActivityGroup__Group_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2666:1: rule__ActivityGroup__Group_5__1__Impl : ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* ) ;
    public final void rule__ActivityGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2670:1: ( ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2671:1: ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2671:1: ( ( rule__ActivityGroup__DependenciesAssignment_5_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2672:1: ( rule__ActivityGroup__DependenciesAssignment_5_1 )*
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_5_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2673:1: ( rule__ActivityGroup__DependenciesAssignment_5_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2673:2: rule__ActivityGroup__DependenciesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__DependenciesAssignment_5_1_in_rule__ActivityGroup__Group_5__1__Impl5352);
            	    rule__ActivityGroup__DependenciesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_5_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_5__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2683:1: rule__ActivityGroup__Group_5__2 : rule__ActivityGroup__Group_5__2__Impl ;
    public final void rule__ActivityGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2687:1: ( rule__ActivityGroup__Group_5__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2688:2: rule__ActivityGroup__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__2__Impl_in_rule__ActivityGroup__Group_5__25383);
            rule__ActivityGroup__Group_5__2__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group_5__2"


    // $ANTLR start "rule__ActivityGroup__Group_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2694:1: rule__ActivityGroup__Group_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2698:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2699:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2699:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2700:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_5__2__Impl5410);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_5__2__Impl"


    // $ANTLR start "rule__WBSImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2717:1: rule__WBSImport__Group__0 : rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1 ;
    public final void rule__WBSImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2721:1: ( rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2722:2: rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__0__Impl_in_rule__WBSImport__Group__05445);
            rule__WBSImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSImport__Group__1_in_rule__WBSImport__Group__05448);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2729:1: rule__WBSImport__Group__0__Impl : ( 'wbs' ) ;
    public final void rule__WBSImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2733:1: ( ( 'wbs' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2734:1: ( 'wbs' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2734:1: ( 'wbs' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2735:1: 'wbs'
            {
             before(grammarAccess.getWBSImportAccess().getWbsKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__WBSImport__Group__0__Impl5476); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2748:1: rule__WBSImport__Group__1 : rule__WBSImport__Group__1__Impl ;
    public final void rule__WBSImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2752:1: ( rule__WBSImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2753:2: rule__WBSImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__1__Impl_in_rule__WBSImport__Group__15507);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2759:1: rule__WBSImport__Group__1__Impl : ( ( rule__WBSImport__ImportURIAssignment_1 ) ) ;
    public final void rule__WBSImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2763:1: ( ( ( rule__WBSImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2764:1: ( ( rule__WBSImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2764:1: ( ( rule__WBSImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2765:1: ( rule__WBSImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getWBSImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2766:1: ( rule__WBSImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2766:2: rule__WBSImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__WBSImport__ImportURIAssignment_1_in_rule__WBSImport__Group__1__Impl5534);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2780:1: rule__ResourcesImport__Group__0 : rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1 ;
    public final void rule__ResourcesImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2784:1: ( rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2785:2: rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__0__Impl_in_rule__ResourcesImport__Group__05568);
            rule__ResourcesImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourcesImport__Group__1_in_rule__ResourcesImport__Group__05571);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2792:1: rule__ResourcesImport__Group__0__Impl : ( 'resources' ) ;
    public final void rule__ResourcesImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2796:1: ( ( 'resources' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2797:1: ( 'resources' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2797:1: ( 'resources' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2798:1: 'resources'
            {
             before(grammarAccess.getResourcesImportAccess().getResourcesKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ResourcesImport__Group__0__Impl5599); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2811:1: rule__ResourcesImport__Group__1 : rule__ResourcesImport__Group__1__Impl ;
    public final void rule__ResourcesImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2815:1: ( rule__ResourcesImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2816:2: rule__ResourcesImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__1__Impl_in_rule__ResourcesImport__Group__15630);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2822:1: rule__ResourcesImport__Group__1__Impl : ( ( rule__ResourcesImport__ImportURIAssignment_1 ) ) ;
    public final void rule__ResourcesImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2826:1: ( ( ( rule__ResourcesImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2827:1: ( ( rule__ResourcesImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2827:1: ( ( rule__ResourcesImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2828:1: ( rule__ResourcesImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getResourcesImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2829:1: ( rule__ResourcesImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2829:2: rule__ResourcesImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourcesImport__ImportURIAssignment_1_in_rule__ResourcesImport__Group__1__Impl5657);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2843:1: rule__PlanImport__Group__0 : rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 ;
    public final void rule__PlanImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2847:1: ( rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2848:2: rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__05691);
            rule__PlanImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__05694);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2855:1: rule__PlanImport__Group__0__Impl : ( 'plan' ) ;
    public final void rule__PlanImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2859:1: ( ( 'plan' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2860:1: ( 'plan' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2860:1: ( 'plan' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2861:1: 'plan'
            {
             before(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__PlanImport__Group__0__Impl5722); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2874:1: rule__PlanImport__Group__1 : rule__PlanImport__Group__1__Impl ;
    public final void rule__PlanImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2878:1: ( rule__PlanImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2879:2: rule__PlanImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__15753);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2885:1: rule__PlanImport__Group__1__Impl : ( ( rule__PlanImport__ImportURIAssignment_1 ) ) ;
    public final void rule__PlanImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2889:1: ( ( ( rule__PlanImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2890:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2890:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2891:1: ( rule__PlanImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2892:1: ( rule__PlanImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2892:2: rule__PlanImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl5780);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2906:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2910:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2911:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05814);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05817);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2918:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2922:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2923:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2923:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2924:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5844); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2935:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2939:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2940:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15873);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2946:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2950:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2951:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2951:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2952:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2953:1: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2953:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5900);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2967:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2971:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2972:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05935);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05938);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2979:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2983:1: ( ( '.' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2984:1: ( '.' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2984:1: ( '.' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2985:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl5966); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2998:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3002:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3003:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15997);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3009:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3013:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3014:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3014:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3015:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6024); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3031:1: rule__CheckPoint__Group__0 : rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1 ;
    public final void rule__CheckPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3035:1: ( rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3036:2: rule__CheckPoint__Group__0__Impl rule__CheckPoint__Group__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__0__Impl_in_rule__CheckPoint__Group__06058);
            rule__CheckPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__1_in_rule__CheckPoint__Group__06061);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3043:1: rule__CheckPoint__Group__0__Impl : ( ( rule__CheckPoint__DescriptionAssignment_0 )? ) ;
    public final void rule__CheckPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3047:1: ( ( ( rule__CheckPoint__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3048:1: ( ( rule__CheckPoint__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3048:1: ( ( rule__CheckPoint__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3049:1: ( rule__CheckPoint__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3050:1: ( rule__CheckPoint__DescriptionAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ML_COMMENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3050:2: rule__CheckPoint__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__DescriptionAssignment_0_in_rule__CheckPoint__Group__0__Impl6088);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3060:1: rule__CheckPoint__Group__1 : rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2 ;
    public final void rule__CheckPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3064:1: ( rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3065:2: rule__CheckPoint__Group__1__Impl rule__CheckPoint__Group__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__1__Impl_in_rule__CheckPoint__Group__16119);
            rule__CheckPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__2_in_rule__CheckPoint__Group__16122);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3072:1: rule__CheckPoint__Group__1__Impl : ( 'CheckPoint' ) ;
    public final void rule__CheckPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3076:1: ( ( 'CheckPoint' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3077:1: ( 'CheckPoint' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3077:1: ( 'CheckPoint' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3078:1: 'CheckPoint'
            {
             before(grammarAccess.getCheckPointAccess().getCheckPointKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__CheckPoint__Group__1__Impl6150); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3091:1: rule__CheckPoint__Group__2 : rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3 ;
    public final void rule__CheckPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3095:1: ( rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3096:2: rule__CheckPoint__Group__2__Impl rule__CheckPoint__Group__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__2__Impl_in_rule__CheckPoint__Group__26181);
            rule__CheckPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__3_in_rule__CheckPoint__Group__26184);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3103:1: rule__CheckPoint__Group__2__Impl : ( ( rule__CheckPoint__NameAssignment_2 ) ) ;
    public final void rule__CheckPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3107:1: ( ( ( rule__CheckPoint__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3108:1: ( ( rule__CheckPoint__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3108:1: ( ( rule__CheckPoint__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3109:1: ( rule__CheckPoint__NameAssignment_2 )
            {
             before(grammarAccess.getCheckPointAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3110:1: ( rule__CheckPoint__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3110:2: rule__CheckPoint__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CheckPoint__NameAssignment_2_in_rule__CheckPoint__Group__2__Impl6211);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3120:1: rule__CheckPoint__Group__3 : rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4 ;
    public final void rule__CheckPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3124:1: ( rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3125:2: rule__CheckPoint__Group__3__Impl rule__CheckPoint__Group__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__3__Impl_in_rule__CheckPoint__Group__36241);
            rule__CheckPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__4_in_rule__CheckPoint__Group__36244);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3132:1: rule__CheckPoint__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__CheckPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3136:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3137:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3137:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3138:1: RULE_OPENCURLY
            {
             before(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group__3__Impl6271); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3149:1: rule__CheckPoint__Group__4 : rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5 ;
    public final void rule__CheckPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3153:1: ( rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3154:2: rule__CheckPoint__Group__4__Impl rule__CheckPoint__Group__5
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__4__Impl_in_rule__CheckPoint__Group__46300);
            rule__CheckPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__5_in_rule__CheckPoint__Group__46303);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3161:1: rule__CheckPoint__Group__4__Impl : ( ( rule__CheckPoint__Group_4__0 )? ) ;
    public final void rule__CheckPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3165:1: ( ( ( rule__CheckPoint__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3166:1: ( ( rule__CheckPoint__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3166:1: ( ( rule__CheckPoint__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3167:1: ( rule__CheckPoint__Group_4__0 )?
            {
             before(grammarAccess.getCheckPointAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3168:1: ( rule__CheckPoint__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3168:2: rule__CheckPoint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_4__0_in_rule__CheckPoint__Group__4__Impl6330);
                    rule__CheckPoint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getGroup_4()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3178:1: rule__CheckPoint__Group__5 : rule__CheckPoint__Group__5__Impl rule__CheckPoint__Group__6 ;
    public final void rule__CheckPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3182:1: ( rule__CheckPoint__Group__5__Impl rule__CheckPoint__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3183:2: rule__CheckPoint__Group__5__Impl rule__CheckPoint__Group__6
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__5__Impl_in_rule__CheckPoint__Group__56361);
            rule__CheckPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group__6_in_rule__CheckPoint__Group__56364);
            rule__CheckPoint__Group__6();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3190:1: rule__CheckPoint__Group__5__Impl : ( ( rule__CheckPoint__UnorderedGroup_5 ) ) ;
    public final void rule__CheckPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3194:1: ( ( ( rule__CheckPoint__UnorderedGroup_5 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3195:1: ( ( rule__CheckPoint__UnorderedGroup_5 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3195:1: ( ( rule__CheckPoint__UnorderedGroup_5 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3196:1: ( rule__CheckPoint__UnorderedGroup_5 )
            {
             before(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3197:1: ( rule__CheckPoint__UnorderedGroup_5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3197:2: rule__CheckPoint__UnorderedGroup_5
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5_in_rule__CheckPoint__Group__5__Impl6391);
            rule__CheckPoint__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()); 

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


    // $ANTLR start "rule__CheckPoint__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3207:1: rule__CheckPoint__Group__6 : rule__CheckPoint__Group__6__Impl ;
    public final void rule__CheckPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3211:1: ( rule__CheckPoint__Group__6__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3212:2: rule__CheckPoint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group__6__Impl_in_rule__CheckPoint__Group__66421);
            rule__CheckPoint__Group__6__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group__6"


    // $ANTLR start "rule__CheckPoint__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3218:1: rule__CheckPoint__Group__6__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__CheckPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3222:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3223:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3223:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3224:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group__6__Impl6448); 
             after(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__CheckPoint__Group__6__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3249:1: rule__CheckPoint__Group_4__0 : rule__CheckPoint__Group_4__0__Impl rule__CheckPoint__Group_4__1 ;
    public final void rule__CheckPoint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3253:1: ( rule__CheckPoint__Group_4__0__Impl rule__CheckPoint__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3254:2: rule__CheckPoint__Group_4__0__Impl rule__CheckPoint__Group_4__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4__0__Impl_in_rule__CheckPoint__Group_4__06491);
            rule__CheckPoint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4__1_in_rule__CheckPoint__Group_4__06494);
            rule__CheckPoint__Group_4__1();

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
    // $ANTLR end "rule__CheckPoint__Group_4__0"


    // $ANTLR start "rule__CheckPoint__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3261:1: rule__CheckPoint__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__CheckPoint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3265:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3266:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3266:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3267:1: 'name'
            {
             before(grammarAccess.getCheckPointAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__CheckPoint__Group_4__0__Impl6522); 
             after(grammarAccess.getCheckPointAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3280:1: rule__CheckPoint__Group_4__1 : rule__CheckPoint__Group_4__1__Impl rule__CheckPoint__Group_4__2 ;
    public final void rule__CheckPoint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3284:1: ( rule__CheckPoint__Group_4__1__Impl rule__CheckPoint__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3285:2: rule__CheckPoint__Group_4__1__Impl rule__CheckPoint__Group_4__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4__1__Impl_in_rule__CheckPoint__Group_4__16553);
            rule__CheckPoint__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_4__2_in_rule__CheckPoint__Group_4__16556);
            rule__CheckPoint__Group_4__2();

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
    // $ANTLR end "rule__CheckPoint__Group_4__1"


    // $ANTLR start "rule__CheckPoint__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3292:1: rule__CheckPoint__Group_4__1__Impl : ( ( rule__CheckPoint__LongNameAssignment_4_1 ) ) ;
    public final void rule__CheckPoint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3296:1: ( ( ( rule__CheckPoint__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3297:1: ( ( rule__CheckPoint__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3297:1: ( ( rule__CheckPoint__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3298:1: ( rule__CheckPoint__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getCheckPointAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3299:1: ( rule__CheckPoint__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3299:2: rule__CheckPoint__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__LongNameAssignment_4_1_in_rule__CheckPoint__Group_4__1__Impl6583);
            rule__CheckPoint__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getLongNameAssignment_4_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3309:1: rule__CheckPoint__Group_4__2 : rule__CheckPoint__Group_4__2__Impl ;
    public final void rule__CheckPoint__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3313:1: ( rule__CheckPoint__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3314:2: rule__CheckPoint__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_4__2__Impl_in_rule__CheckPoint__Group_4__26613);
            rule__CheckPoint__Group_4__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_4__2"


    // $ANTLR start "rule__CheckPoint__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3320:1: rule__CheckPoint__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3324:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3325:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3325:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3326:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4__2__Impl6640);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_4__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3343:1: rule__CheckPoint__Group_5_0_0__0 : rule__CheckPoint__Group_5_0_0__0__Impl rule__CheckPoint__Group_5_0_0__1 ;
    public final void rule__CheckPoint__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3347:1: ( rule__CheckPoint__Group_5_0_0__0__Impl rule__CheckPoint__Group_5_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3348:2: rule__CheckPoint__Group_5_0_0__0__Impl rule__CheckPoint__Group_5_0_0__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__0__Impl_in_rule__CheckPoint__Group_5_0_0__06675);
            rule__CheckPoint__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__1_in_rule__CheckPoint__Group_5_0_0__06678);
            rule__CheckPoint__Group_5_0_0__1();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__0"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3355:1: rule__CheckPoint__Group_5_0_0__0__Impl : ( 'date' ) ;
    public final void rule__CheckPoint__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3359:1: ( ( 'date' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3360:1: ( 'date' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3360:1: ( 'date' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3361:1: 'date'
            {
             before(grammarAccess.getCheckPointAccess().getDateKeyword_5_0_0_0()); 
            match(input,32,FOLLOW_32_in_rule__CheckPoint__Group_5_0_0__0__Impl6706); 
             after(grammarAccess.getCheckPointAccess().getDateKeyword_5_0_0_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3374:1: rule__CheckPoint__Group_5_0_0__1 : rule__CheckPoint__Group_5_0_0__1__Impl rule__CheckPoint__Group_5_0_0__2 ;
    public final void rule__CheckPoint__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3378:1: ( rule__CheckPoint__Group_5_0_0__1__Impl rule__CheckPoint__Group_5_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3379:2: rule__CheckPoint__Group_5_0_0__1__Impl rule__CheckPoint__Group_5_0_0__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__1__Impl_in_rule__CheckPoint__Group_5_0_0__16737);
            rule__CheckPoint__Group_5_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__2_in_rule__CheckPoint__Group_5_0_0__16740);
            rule__CheckPoint__Group_5_0_0__2();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__1"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3386:1: rule__CheckPoint__Group_5_0_0__1__Impl : ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) ) ;
    public final void rule__CheckPoint__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3390:1: ( ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3391:1: ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3391:1: ( ( rule__CheckPoint__EndAssignment_5_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3392:1: ( rule__CheckPoint__EndAssignment_5_0_0_1 )
            {
             before(grammarAccess.getCheckPointAccess().getEndAssignment_5_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3393:1: ( rule__CheckPoint__EndAssignment_5_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3393:2: rule__CheckPoint__EndAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__EndAssignment_5_0_0_1_in_rule__CheckPoint__Group_5_0_0__1__Impl6767);
            rule__CheckPoint__EndAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getEndAssignment_5_0_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3403:1: rule__CheckPoint__Group_5_0_0__2 : rule__CheckPoint__Group_5_0_0__2__Impl ;
    public final void rule__CheckPoint__Group_5_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3407:1: ( rule__CheckPoint__Group_5_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3408:2: rule__CheckPoint__Group_5_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_0__2__Impl_in_rule__CheckPoint__Group_5_0_0__26797);
            rule__CheckPoint__Group_5_0_0__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__2"


    // $ANTLR start "rule__CheckPoint__Group_5_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3414:1: rule__CheckPoint__Group_5_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3418:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3419:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3419:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3420:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_0__2__Impl6824);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_0_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_0__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3437:1: rule__CheckPoint__Group_5_0_1__0 : rule__CheckPoint__Group_5_0_1__0__Impl rule__CheckPoint__Group_5_0_1__1 ;
    public final void rule__CheckPoint__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3441:1: ( rule__CheckPoint__Group_5_0_1__0__Impl rule__CheckPoint__Group_5_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3442:2: rule__CheckPoint__Group_5_0_1__0__Impl rule__CheckPoint__Group_5_0_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__0__Impl_in_rule__CheckPoint__Group_5_0_1__06859);
            rule__CheckPoint__Group_5_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__1_in_rule__CheckPoint__Group_5_0_1__06862);
            rule__CheckPoint__Group_5_0_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__0"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3449:1: rule__CheckPoint__Group_5_0_1__0__Impl : ( 'after' ) ;
    public final void rule__CheckPoint__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3453:1: ( ( 'after' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3454:1: ( 'after' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3454:1: ( 'after' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3455:1: 'after'
            {
             before(grammarAccess.getCheckPointAccess().getAfterKeyword_5_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__CheckPoint__Group_5_0_1__0__Impl6890); 
             after(grammarAccess.getCheckPointAccess().getAfterKeyword_5_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3468:1: rule__CheckPoint__Group_5_0_1__1 : rule__CheckPoint__Group_5_0_1__1__Impl rule__CheckPoint__Group_5_0_1__2 ;
    public final void rule__CheckPoint__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3472:1: ( rule__CheckPoint__Group_5_0_1__1__Impl rule__CheckPoint__Group_5_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3473:2: rule__CheckPoint__Group_5_0_1__1__Impl rule__CheckPoint__Group_5_0_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__1__Impl_in_rule__CheckPoint__Group_5_0_1__16921);
            rule__CheckPoint__Group_5_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__2_in_rule__CheckPoint__Group_5_0_1__16924);
            rule__CheckPoint__Group_5_0_1__2();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__1"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3480:1: rule__CheckPoint__Group_5_0_1__1__Impl : ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) ) ;
    public final void rule__CheckPoint__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3484:1: ( ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3485:1: ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3485:1: ( ( rule__CheckPoint__AfterAssignment_5_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3486:1: ( rule__CheckPoint__AfterAssignment_5_0_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getAfterAssignment_5_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3487:1: ( rule__CheckPoint__AfterAssignment_5_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3487:2: rule__CheckPoint__AfterAssignment_5_0_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__AfterAssignment_5_0_1_1_in_rule__CheckPoint__Group_5_0_1__1__Impl6951);
            rule__CheckPoint__AfterAssignment_5_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getAfterAssignment_5_0_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3497:1: rule__CheckPoint__Group_5_0_1__2 : rule__CheckPoint__Group_5_0_1__2__Impl rule__CheckPoint__Group_5_0_1__3 ;
    public final void rule__CheckPoint__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3501:1: ( rule__CheckPoint__Group_5_0_1__2__Impl rule__CheckPoint__Group_5_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3502:2: rule__CheckPoint__Group_5_0_1__2__Impl rule__CheckPoint__Group_5_0_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__2__Impl_in_rule__CheckPoint__Group_5_0_1__26981);
            rule__CheckPoint__Group_5_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__3_in_rule__CheckPoint__Group_5_0_1__26984);
            rule__CheckPoint__Group_5_0_1__3();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__2"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3509:1: rule__CheckPoint__Group_5_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__CheckPoint__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3513:1: ( ( 'offset' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3514:1: ( 'offset' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3514:1: ( 'offset' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3515:1: 'offset'
            {
             before(grammarAccess.getCheckPointAccess().getOffsetKeyword_5_0_1_2()); 
            match(input,34,FOLLOW_34_in_rule__CheckPoint__Group_5_0_1__2__Impl7012); 
             after(grammarAccess.getCheckPointAccess().getOffsetKeyword_5_0_1_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3528:1: rule__CheckPoint__Group_5_0_1__3 : rule__CheckPoint__Group_5_0_1__3__Impl rule__CheckPoint__Group_5_0_1__4 ;
    public final void rule__CheckPoint__Group_5_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3532:1: ( rule__CheckPoint__Group_5_0_1__3__Impl rule__CheckPoint__Group_5_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3533:2: rule__CheckPoint__Group_5_0_1__3__Impl rule__CheckPoint__Group_5_0_1__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__3__Impl_in_rule__CheckPoint__Group_5_0_1__37043);
            rule__CheckPoint__Group_5_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__4_in_rule__CheckPoint__Group_5_0_1__37046);
            rule__CheckPoint__Group_5_0_1__4();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__3"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3540:1: rule__CheckPoint__Group_5_0_1__3__Impl : ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) ) ;
    public final void rule__CheckPoint__Group_5_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3544:1: ( ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3545:1: ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3545:1: ( ( rule__CheckPoint__OffsetAssignment_5_0_1_3 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3546:1: ( rule__CheckPoint__OffsetAssignment_5_0_1_3 )
            {
             before(grammarAccess.getCheckPointAccess().getOffsetAssignment_5_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3547:1: ( rule__CheckPoint__OffsetAssignment_5_0_1_3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3547:2: rule__CheckPoint__OffsetAssignment_5_0_1_3
            {
            pushFollow(FOLLOW_rule__CheckPoint__OffsetAssignment_5_0_1_3_in_rule__CheckPoint__Group_5_0_1__3__Impl7073);
            rule__CheckPoint__OffsetAssignment_5_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getOffsetAssignment_5_0_1_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3557:1: rule__CheckPoint__Group_5_0_1__4 : rule__CheckPoint__Group_5_0_1__4__Impl ;
    public final void rule__CheckPoint__Group_5_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3561:1: ( rule__CheckPoint__Group_5_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3562:2: rule__CheckPoint__Group_5_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_0_1__4__Impl_in_rule__CheckPoint__Group_5_0_1__47103);
            rule__CheckPoint__Group_5_0_1__4__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__4"


    // $ANTLR start "rule__CheckPoint__Group_5_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3568:1: rule__CheckPoint__Group_5_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3572:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3573:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3573:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3574:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_1__4__Impl7130);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_1_4()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_0_1__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3595:1: rule__CheckPoint__Group_5_1__0 : rule__CheckPoint__Group_5_1__0__Impl rule__CheckPoint__Group_5_1__1 ;
    public final void rule__CheckPoint__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3599:1: ( rule__CheckPoint__Group_5_1__0__Impl rule__CheckPoint__Group_5_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3600:2: rule__CheckPoint__Group_5_1__0__Impl rule__CheckPoint__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__0__Impl_in_rule__CheckPoint__Group_5_1__07169);
            rule__CheckPoint__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__1_in_rule__CheckPoint__Group_5_1__07172);
            rule__CheckPoint__Group_5_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__0"


    // $ANTLR start "rule__CheckPoint__Group_5_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3607:1: rule__CheckPoint__Group_5_1__0__Impl : ( 'completeness' ) ;
    public final void rule__CheckPoint__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3611:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3612:1: ( 'completeness' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3612:1: ( 'completeness' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3613:1: 'completeness'
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessKeyword_5_1_0()); 
            match(input,35,FOLLOW_35_in_rule__CheckPoint__Group_5_1__0__Impl7200); 
             after(grammarAccess.getCheckPointAccess().getCompletenessKeyword_5_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3626:1: rule__CheckPoint__Group_5_1__1 : rule__CheckPoint__Group_5_1__1__Impl rule__CheckPoint__Group_5_1__2 ;
    public final void rule__CheckPoint__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3630:1: ( rule__CheckPoint__Group_5_1__1__Impl rule__CheckPoint__Group_5_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3631:2: rule__CheckPoint__Group_5_1__1__Impl rule__CheckPoint__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__1__Impl_in_rule__CheckPoint__Group_5_1__17231);
            rule__CheckPoint__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__2_in_rule__CheckPoint__Group_5_1__17234);
            rule__CheckPoint__Group_5_1__2();

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__1"


    // $ANTLR start "rule__CheckPoint__Group_5_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3638:1: rule__CheckPoint__Group_5_1__1__Impl : ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) ) ;
    public final void rule__CheckPoint__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3642:1: ( ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3643:1: ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3643:1: ( ( rule__CheckPoint__CompletenessAssignment_5_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3644:1: ( rule__CheckPoint__CompletenessAssignment_5_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessAssignment_5_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3645:1: ( rule__CheckPoint__CompletenessAssignment_5_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3645:2: rule__CheckPoint__CompletenessAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__CompletenessAssignment_5_1_1_in_rule__CheckPoint__Group_5_1__1__Impl7261);
            rule__CheckPoint__CompletenessAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getCompletenessAssignment_5_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3655:1: rule__CheckPoint__Group_5_1__2 : rule__CheckPoint__Group_5_1__2__Impl rule__CheckPoint__Group_5_1__3 ;
    public final void rule__CheckPoint__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3659:1: ( rule__CheckPoint__Group_5_1__2__Impl rule__CheckPoint__Group_5_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3660:2: rule__CheckPoint__Group_5_1__2__Impl rule__CheckPoint__Group_5_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__2__Impl_in_rule__CheckPoint__Group_5_1__27291);
            rule__CheckPoint__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__3_in_rule__CheckPoint__Group_5_1__27294);
            rule__CheckPoint__Group_5_1__3();

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__2"


    // $ANTLR start "rule__CheckPoint__Group_5_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3667:1: rule__CheckPoint__Group_5_1__2__Impl : ( '%' ) ;
    public final void rule__CheckPoint__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3671:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3672:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3672:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3673:1: '%'
            {
             before(grammarAccess.getCheckPointAccess().getPercentSignKeyword_5_1_2()); 
            match(input,36,FOLLOW_36_in_rule__CheckPoint__Group_5_1__2__Impl7322); 
             after(grammarAccess.getCheckPointAccess().getPercentSignKeyword_5_1_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3686:1: rule__CheckPoint__Group_5_1__3 : rule__CheckPoint__Group_5_1__3__Impl ;
    public final void rule__CheckPoint__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3690:1: ( rule__CheckPoint__Group_5_1__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3691:2: rule__CheckPoint__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__3__Impl_in_rule__CheckPoint__Group_5_1__37353);
            rule__CheckPoint__Group_5_1__3__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__3"


    // $ANTLR start "rule__CheckPoint__Group_5_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3697:1: rule__CheckPoint__Group_5_1__3__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3701:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3702:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3702:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3703:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_1__3__Impl7380);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3722:1: rule__CheckPoint__Group_5_2__0 : rule__CheckPoint__Group_5_2__0__Impl rule__CheckPoint__Group_5_2__1 ;
    public final void rule__CheckPoint__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3726:1: ( rule__CheckPoint__Group_5_2__0__Impl rule__CheckPoint__Group_5_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3727:2: rule__CheckPoint__Group_5_2__0__Impl rule__CheckPoint__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_2__0__Impl_in_rule__CheckPoint__Group_5_2__07417);
            rule__CheckPoint__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_2__1_in_rule__CheckPoint__Group_5_2__07420);
            rule__CheckPoint__Group_5_2__1();

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
    // $ANTLR end "rule__CheckPoint__Group_5_2__0"


    // $ANTLR start "rule__CheckPoint__Group_5_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3734:1: rule__CheckPoint__Group_5_2__0__Impl : ( 'dependsOn' ) ;
    public final void rule__CheckPoint__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3738:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3739:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3739:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3740:1: 'dependsOn'
            {
             before(grammarAccess.getCheckPointAccess().getDependsOnKeyword_5_2_0()); 
            match(input,26,FOLLOW_26_in_rule__CheckPoint__Group_5_2__0__Impl7448); 
             after(grammarAccess.getCheckPointAccess().getDependsOnKeyword_5_2_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_2__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3753:1: rule__CheckPoint__Group_5_2__1 : rule__CheckPoint__Group_5_2__1__Impl rule__CheckPoint__Group_5_2__2 ;
    public final void rule__CheckPoint__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3757:1: ( rule__CheckPoint__Group_5_2__1__Impl rule__CheckPoint__Group_5_2__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3758:2: rule__CheckPoint__Group_5_2__1__Impl rule__CheckPoint__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_2__1__Impl_in_rule__CheckPoint__Group_5_2__17479);
            rule__CheckPoint__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_5_2__2_in_rule__CheckPoint__Group_5_2__17482);
            rule__CheckPoint__Group_5_2__2();

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
    // $ANTLR end "rule__CheckPoint__Group_5_2__1"


    // $ANTLR start "rule__CheckPoint__Group_5_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3765:1: rule__CheckPoint__Group_5_2__1__Impl : ( ( rule__CheckPoint__DependenciesAssignment_5_2_1 )* ) ;
    public final void rule__CheckPoint__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3769:1: ( ( ( rule__CheckPoint__DependenciesAssignment_5_2_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3770:1: ( ( rule__CheckPoint__DependenciesAssignment_5_2_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3770:1: ( ( rule__CheckPoint__DependenciesAssignment_5_2_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3771:1: ( rule__CheckPoint__DependenciesAssignment_5_2_1 )*
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesAssignment_5_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3772:1: ( rule__CheckPoint__DependenciesAssignment_5_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3772:2: rule__CheckPoint__DependenciesAssignment_5_2_1
            	    {
            	    pushFollow(FOLLOW_rule__CheckPoint__DependenciesAssignment_5_2_1_in_rule__CheckPoint__Group_5_2__1__Impl7509);
            	    rule__CheckPoint__DependenciesAssignment_5_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCheckPointAccess().getDependenciesAssignment_5_2_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_2__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_5_2__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3782:1: rule__CheckPoint__Group_5_2__2 : rule__CheckPoint__Group_5_2__2__Impl ;
    public final void rule__CheckPoint__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3786:1: ( rule__CheckPoint__Group_5_2__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3787:2: rule__CheckPoint__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_5_2__2__Impl_in_rule__CheckPoint__Group_5_2__27540);
            rule__CheckPoint__Group_5_2__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_5_2__2"


    // $ANTLR start "rule__CheckPoint__Group_5_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3793:1: rule__CheckPoint__Group_5_2__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3797:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3798:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3798:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3799:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_2_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_2__2__Impl7567);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_2_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_5_2__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3816:1: rule__ResourceInvolvement__Group__0 : rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 ;
    public final void rule__ResourceInvolvement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3820:1: ( rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3821:2: rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__07602);
            rule__ResourceInvolvement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__07605);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3828:1: rule__ResourceInvolvement__Group__0__Impl : ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) ;
    public final void rule__ResourceInvolvement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3832:1: ( ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3833:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3833:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3834:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3835:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3835:2: rule__ResourceInvolvement__ResourceAssignment_0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl7632);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3845:1: rule__ResourceInvolvement__Group__1 : rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 ;
    public final void rule__ResourceInvolvement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3849:1: ( rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3850:2: rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__17662);
            rule__ResourceInvolvement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__17665);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3857:1: rule__ResourceInvolvement__Group__1__Impl : ( ( rule__ResourceInvolvement__Group_1__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3861:1: ( ( ( rule__ResourceInvolvement__Group_1__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3862:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3862:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3863:1: ( rule__ResourceInvolvement__Group_1__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3864:1: ( rule__ResourceInvolvement__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3864:2: rule__ResourceInvolvement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl7692);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3874:1: rule__ResourceInvolvement__Group__2 : rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 ;
    public final void rule__ResourceInvolvement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3878:1: ( rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3879:2: rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__27723);
            rule__ResourceInvolvement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__27726);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3886:1: rule__ResourceInvolvement__Group__2__Impl : ( ( rule__ResourceInvolvement__Group_2__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3890:1: ( ( ( rule__ResourceInvolvement__Group_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3891:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3891:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3892:1: ( rule__ResourceInvolvement__Group_2__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3893:1: ( rule__ResourceInvolvement__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3893:2: rule__ResourceInvolvement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl7753);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3903:1: rule__ResourceInvolvement__Group__3 : rule__ResourceInvolvement__Group__3__Impl ;
    public final void rule__ResourceInvolvement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3907:1: ( rule__ResourceInvolvement__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3908:2: rule__ResourceInvolvement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__37784);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3914:1: rule__ResourceInvolvement__Group__3__Impl : ( ruleENDLINE ) ;
    public final void rule__ResourceInvolvement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3918:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3919:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3919:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3920:1: ruleENDLINE
            {
             before(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl7811);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3939:1: rule__ResourceInvolvement__Group_1__0 : rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 ;
    public final void rule__ResourceInvolvement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3943:1: ( rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3944:2: rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__07848);
            rule__ResourceInvolvement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__07851);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3951:1: rule__ResourceInvolvement__Group_1__0__Impl : ( 'at' ) ;
    public final void rule__ResourceInvolvement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3955:1: ( ( 'at' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3956:1: ( 'at' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3956:1: ( 'at' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3957:1: 'at'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__ResourceInvolvement__Group_1__0__Impl7879); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3970:1: rule__ResourceInvolvement__Group_1__1 : rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 ;
    public final void rule__ResourceInvolvement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3974:1: ( rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3975:2: rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__17910);
            rule__ResourceInvolvement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__17913);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3982:1: rule__ResourceInvolvement__Group_1__1__Impl : ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3986:1: ( ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3987:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3987:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3988:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3989:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3989:2: rule__ResourceInvolvement__OccupationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl7940);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3999:1: rule__ResourceInvolvement__Group_1__2 : rule__ResourceInvolvement__Group_1__2__Impl ;
    public final void rule__ResourceInvolvement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4003:1: ( rule__ResourceInvolvement__Group_1__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4004:2: rule__ResourceInvolvement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__27970);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4010:1: rule__ResourceInvolvement__Group_1__2__Impl : ( '%' ) ;
    public final void rule__ResourceInvolvement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4014:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4015:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4015:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4016:1: '%'
            {
             before(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 
            match(input,36,FOLLOW_36_in_rule__ResourceInvolvement__Group_1__2__Impl7998); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4035:1: rule__ResourceInvolvement__Group_2__0 : rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 ;
    public final void rule__ResourceInvolvement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4039:1: ( rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4040:2: rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__08035);
            rule__ResourceInvolvement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__08038);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4047:1: rule__ResourceInvolvement__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ResourceInvolvement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4051:1: ( ( 'as' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4052:1: ( 'as' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4052:1: ( 'as' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4053:1: 'as'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__ResourceInvolvement__Group_2__0__Impl8066); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4066:1: rule__ResourceInvolvement__Group_2__1 : rule__ResourceInvolvement__Group_2__1__Impl ;
    public final void rule__ResourceInvolvement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4070:1: ( rule__ResourceInvolvement__Group_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4071:2: rule__ResourceInvolvement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__18097);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4077:1: rule__ResourceInvolvement__Group_2__1__Impl : ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4081:1: ( ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4082:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4082:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4083:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4084:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4084:2: rule__ResourceInvolvement__ResponsibilityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl8124);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4098:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4102:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4103:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__08158);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__08161);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4110:1: rule__Activity__Group__0__Impl : ( ( rule__Activity__DescriptionAssignment_0 )? ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4114:1: ( ( ( rule__Activity__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4115:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4115:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4116:1: ( rule__Activity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4117:1: ( rule__Activity__DescriptionAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ML_COMMENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4117:2: rule__Activity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl8188);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4127:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4131:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4132:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__18219);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__18222);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4139:1: rule__Activity__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4143:1: ( ( 'Activity' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4144:1: ( 'Activity' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4144:1: ( 'Activity' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4145:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Activity__Group__1__Impl8250); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4158:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4162:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4163:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__28281);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__28284);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4170:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4174:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4175:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4175:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4176:1: ( rule__Activity__NameAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4177:1: ( rule__Activity__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4177:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl8311);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4187:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4191:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4192:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__38341);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__38344);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4199:1: rule__Activity__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4203:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4204:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4204:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4205:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl8371); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4216:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4220:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4221:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__48400);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__48403);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4228:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4232:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4233:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4233:1: ( ( rule__Activity__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4234:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4235:1: ( rule__Activity__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4235:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl8430);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4245:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4249:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4250:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__58461);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__58464);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4257:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4261:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4262:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4262:1: ( ( rule__Activity__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4263:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4264:1: ( rule__Activity__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4264:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl8491);
                    rule__Activity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_5()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4274:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4278:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4279:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__68522);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__68525);
            rule__Activity__Group__7();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4286:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__UnorderedGroup_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4290:1: ( ( ( rule__Activity__UnorderedGroup_6 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4291:1: ( ( rule__Activity__UnorderedGroup_6 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4291:1: ( ( rule__Activity__UnorderedGroup_6 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4292:1: ( rule__Activity__UnorderedGroup_6 )
            {
             before(grammarAccess.getActivityAccess().getUnorderedGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4293:1: ( rule__Activity__UnorderedGroup_6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4293:2: rule__Activity__UnorderedGroup_6
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6_in_rule__Activity__Group__6__Impl8552);
            rule__Activity__UnorderedGroup_6();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getUnorderedGroup_6()); 

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


    // $ANTLR start "rule__Activity__Group__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4303:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4307:1: ( rule__Activity__Group__7__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4308:2: rule__Activity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__78582);
            rule__Activity__Group__7__Impl();

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
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4314:1: rule__Activity__Group__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4318:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4319:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4319:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4320:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__7__Impl8609); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4347:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4351:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4352:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__08654);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__08657);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4359:1: rule__Activity__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4363:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4364:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4364:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4365:1: 'name'
            {
             before(grammarAccess.getActivityAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Activity__Group_4__0__Impl8685); 
             after(grammarAccess.getActivityAccess().getNameKeyword_4_0()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4378:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4382:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4383:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__18716);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__18719);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4390:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__LongNameAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4394:1: ( ( ( rule__Activity__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4395:1: ( ( rule__Activity__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4395:1: ( ( rule__Activity__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4396:1: ( rule__Activity__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4397:1: ( rule__Activity__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4397:2: rule__Activity__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__LongNameAssignment_4_1_in_rule__Activity__Group_4__1__Impl8746);
            rule__Activity__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getLongNameAssignment_4_1()); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4407:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4411:1: ( rule__Activity__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4412:2: rule__Activity__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__28776);
            rule__Activity__Group_4__2__Impl();

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4418:1: rule__Activity__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4422:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4423:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4423:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4424:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_4__2__Impl8803);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 

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


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4441:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4445:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4446:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__08838);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__08841);
            rule__Activity__Group_5__1();

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
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4453:1: rule__Activity__Group_5__0__Impl : ( 'involves' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4457:1: ( ( 'involves' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4458:1: ( 'involves' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4458:1: ( 'involves' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4459:1: 'involves'
            {
             before(grammarAccess.getActivityAccess().getInvolvesKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__Activity__Group_5__0__Impl8869); 
             after(grammarAccess.getActivityAccess().getInvolvesKeyword_5_0()); 

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
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4472:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4476:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4477:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__18900);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__18903);
            rule__Activity__Group_5__2();

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
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4484:1: rule__Activity__Group_5__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4488:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4489:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4489:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4490:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_5__1__Impl8930); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4501:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4505:1: ( rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4506:2: rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__28959);
            rule__Activity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__28962);
            rule__Activity__Group_5__3();

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
    // $ANTLR end "rule__Activity__Group_5__2"


    // $ANTLR start "rule__Activity__Group_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4513:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4517:1: ( ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4518:1: ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4518:1: ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4519:1: ( rule__Activity__InvolvedResourcesAssignment_5_2 )*
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4520:1: ( rule__Activity__InvolvedResourcesAssignment_5_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4520:2: rule__Activity__InvolvedResourcesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InvolvedResourcesAssignment_5_2_in_rule__Activity__Group_5__2__Impl8989);
            	    rule__Activity__InvolvedResourcesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2()); 

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
    // $ANTLR end "rule__Activity__Group_5__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4530:1: rule__Activity__Group_5__3 : rule__Activity__Group_5__3__Impl ;
    public final void rule__Activity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4534:1: ( rule__Activity__Group_5__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4535:2: rule__Activity__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__39020);
            rule__Activity__Group_5__3__Impl();

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
    // $ANTLR end "rule__Activity__Group_5__3"


    // $ANTLR start "rule__Activity__Group_5__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4541:1: rule__Activity__Group_5__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4545:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4546:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4546:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4547:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_5__3__Impl9047); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 

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
    // $ANTLR end "rule__Activity__Group_5__3__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4566:1: rule__Activity__Group_6_0_0__0 : rule__Activity__Group_6_0_0__0__Impl rule__Activity__Group_6_0_0__1 ;
    public final void rule__Activity__Group_6_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4570:1: ( rule__Activity__Group_6_0_0__0__Impl rule__Activity__Group_6_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4571:2: rule__Activity__Group_6_0_0__0__Impl rule__Activity__Group_6_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__0__Impl_in_rule__Activity__Group_6_0_0__09084);
            rule__Activity__Group_6_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__1_in_rule__Activity__Group_6_0_0__09087);
            rule__Activity__Group_6_0_0__1();

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
    // $ANTLR end "rule__Activity__Group_6_0_0__0"


    // $ANTLR start "rule__Activity__Group_6_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4578:1: rule__Activity__Group_6_0_0__0__Impl : ( 'starts' ) ;
    public final void rule__Activity__Group_6_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4582:1: ( ( 'starts' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4583:1: ( 'starts' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4583:1: ( 'starts' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4584:1: 'starts'
            {
             before(grammarAccess.getActivityAccess().getStartsKeyword_6_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Activity__Group_6_0_0__0__Impl9115); 
             after(grammarAccess.getActivityAccess().getStartsKeyword_6_0_0_0()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4597:1: rule__Activity__Group_6_0_0__1 : rule__Activity__Group_6_0_0__1__Impl rule__Activity__Group_6_0_0__2 ;
    public final void rule__Activity__Group_6_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4601:1: ( rule__Activity__Group_6_0_0__1__Impl rule__Activity__Group_6_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4602:2: rule__Activity__Group_6_0_0__1__Impl rule__Activity__Group_6_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__1__Impl_in_rule__Activity__Group_6_0_0__19146);
            rule__Activity__Group_6_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__2_in_rule__Activity__Group_6_0_0__19149);
            rule__Activity__Group_6_0_0__2();

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
    // $ANTLR end "rule__Activity__Group_6_0_0__1"


    // $ANTLR start "rule__Activity__Group_6_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4609:1: rule__Activity__Group_6_0_0__1__Impl : ( ( rule__Activity__StartAssignment_6_0_0_1 ) ) ;
    public final void rule__Activity__Group_6_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4613:1: ( ( ( rule__Activity__StartAssignment_6_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4614:1: ( ( rule__Activity__StartAssignment_6_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4614:1: ( ( rule__Activity__StartAssignment_6_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4615:1: ( rule__Activity__StartAssignment_6_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getStartAssignment_6_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4616:1: ( rule__Activity__StartAssignment_6_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4616:2: rule__Activity__StartAssignment_6_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__StartAssignment_6_0_0_1_in_rule__Activity__Group_6_0_0__1__Impl9176);
            rule__Activity__StartAssignment_6_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getStartAssignment_6_0_0_1()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4626:1: rule__Activity__Group_6_0_0__2 : rule__Activity__Group_6_0_0__2__Impl ;
    public final void rule__Activity__Group_6_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4630:1: ( rule__Activity__Group_6_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4631:2: rule__Activity__Group_6_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_0__2__Impl_in_rule__Activity__Group_6_0_0__29206);
            rule__Activity__Group_6_0_0__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_6_0_0__2"


    // $ANTLR start "rule__Activity__Group_6_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4637:1: rule__Activity__Group_6_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4641:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4642:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4642:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4643:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_0__2__Impl9233);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_0_2()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4660:1: rule__Activity__Group_6_0_1__0 : rule__Activity__Group_6_0_1__0__Impl rule__Activity__Group_6_0_1__1 ;
    public final void rule__Activity__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4664:1: ( rule__Activity__Group_6_0_1__0__Impl rule__Activity__Group_6_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4665:2: rule__Activity__Group_6_0_1__0__Impl rule__Activity__Group_6_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__0__Impl_in_rule__Activity__Group_6_0_1__09268);
            rule__Activity__Group_6_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__1_in_rule__Activity__Group_6_0_1__09271);
            rule__Activity__Group_6_0_1__1();

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
    // $ANTLR end "rule__Activity__Group_6_0_1__0"


    // $ANTLR start "rule__Activity__Group_6_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4672:1: rule__Activity__Group_6_0_1__0__Impl : ( 'after' ) ;
    public final void rule__Activity__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4676:1: ( ( 'after' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4677:1: ( 'after' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4677:1: ( 'after' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4678:1: 'after'
            {
             before(grammarAccess.getActivityAccess().getAfterKeyword_6_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Activity__Group_6_0_1__0__Impl9299); 
             after(grammarAccess.getActivityAccess().getAfterKeyword_6_0_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4691:1: rule__Activity__Group_6_0_1__1 : rule__Activity__Group_6_0_1__1__Impl rule__Activity__Group_6_0_1__2 ;
    public final void rule__Activity__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4695:1: ( rule__Activity__Group_6_0_1__1__Impl rule__Activity__Group_6_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4696:2: rule__Activity__Group_6_0_1__1__Impl rule__Activity__Group_6_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__1__Impl_in_rule__Activity__Group_6_0_1__19330);
            rule__Activity__Group_6_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__2_in_rule__Activity__Group_6_0_1__19333);
            rule__Activity__Group_6_0_1__2();

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
    // $ANTLR end "rule__Activity__Group_6_0_1__1"


    // $ANTLR start "rule__Activity__Group_6_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4703:1: rule__Activity__Group_6_0_1__1__Impl : ( ( rule__Activity__AfterAssignment_6_0_1_1 ) ) ;
    public final void rule__Activity__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4707:1: ( ( ( rule__Activity__AfterAssignment_6_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4708:1: ( ( rule__Activity__AfterAssignment_6_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4708:1: ( ( rule__Activity__AfterAssignment_6_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4709:1: ( rule__Activity__AfterAssignment_6_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getAfterAssignment_6_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4710:1: ( rule__Activity__AfterAssignment_6_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4710:2: rule__Activity__AfterAssignment_6_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__AfterAssignment_6_0_1_1_in_rule__Activity__Group_6_0_1__1__Impl9360);
            rule__Activity__AfterAssignment_6_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAfterAssignment_6_0_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4720:1: rule__Activity__Group_6_0_1__2 : rule__Activity__Group_6_0_1__2__Impl rule__Activity__Group_6_0_1__3 ;
    public final void rule__Activity__Group_6_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4724:1: ( rule__Activity__Group_6_0_1__2__Impl rule__Activity__Group_6_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4725:2: rule__Activity__Group_6_0_1__2__Impl rule__Activity__Group_6_0_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__2__Impl_in_rule__Activity__Group_6_0_1__29390);
            rule__Activity__Group_6_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__3_in_rule__Activity__Group_6_0_1__29393);
            rule__Activity__Group_6_0_1__3();

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
    // $ANTLR end "rule__Activity__Group_6_0_1__2"


    // $ANTLR start "rule__Activity__Group_6_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4732:1: rule__Activity__Group_6_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__Activity__Group_6_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4736:1: ( ( 'offset' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4737:1: ( 'offset' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4737:1: ( 'offset' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4738:1: 'offset'
            {
             before(grammarAccess.getActivityAccess().getOffsetKeyword_6_0_1_2()); 
            match(input,34,FOLLOW_34_in_rule__Activity__Group_6_0_1__2__Impl9421); 
             after(grammarAccess.getActivityAccess().getOffsetKeyword_6_0_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4751:1: rule__Activity__Group_6_0_1__3 : rule__Activity__Group_6_0_1__3__Impl rule__Activity__Group_6_0_1__4 ;
    public final void rule__Activity__Group_6_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4755:1: ( rule__Activity__Group_6_0_1__3__Impl rule__Activity__Group_6_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4756:2: rule__Activity__Group_6_0_1__3__Impl rule__Activity__Group_6_0_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__3__Impl_in_rule__Activity__Group_6_0_1__39452);
            rule__Activity__Group_6_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__4_in_rule__Activity__Group_6_0_1__39455);
            rule__Activity__Group_6_0_1__4();

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
    // $ANTLR end "rule__Activity__Group_6_0_1__3"


    // $ANTLR start "rule__Activity__Group_6_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4763:1: rule__Activity__Group_6_0_1__3__Impl : ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) ) ;
    public final void rule__Activity__Group_6_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4767:1: ( ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4768:1: ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4768:1: ( ( rule__Activity__OffsetAssignment_6_0_1_3 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4769:1: ( rule__Activity__OffsetAssignment_6_0_1_3 )
            {
             before(grammarAccess.getActivityAccess().getOffsetAssignment_6_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4770:1: ( rule__Activity__OffsetAssignment_6_0_1_3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4770:2: rule__Activity__OffsetAssignment_6_0_1_3
            {
            pushFollow(FOLLOW_rule__Activity__OffsetAssignment_6_0_1_3_in_rule__Activity__Group_6_0_1__3__Impl9482);
            rule__Activity__OffsetAssignment_6_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getOffsetAssignment_6_0_1_3()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_6_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4780:1: rule__Activity__Group_6_0_1__4 : rule__Activity__Group_6_0_1__4__Impl ;
    public final void rule__Activity__Group_6_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4784:1: ( rule__Activity__Group_6_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4785:2: rule__Activity__Group_6_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_0_1__4__Impl_in_rule__Activity__Group_6_0_1__49512);
            rule__Activity__Group_6_0_1__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_6_0_1__4"


    // $ANTLR start "rule__Activity__Group_6_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4791:1: rule__Activity__Group_6_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4795:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4796:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4796:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4797:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_1__4__Impl9539);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_1_4()); 

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
    // $ANTLR end "rule__Activity__Group_6_0_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4818:1: rule__Activity__Group_6_1__0 : rule__Activity__Group_6_1__0__Impl rule__Activity__Group_6_1__1 ;
    public final void rule__Activity__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4822:1: ( rule__Activity__Group_6_1__0__Impl rule__Activity__Group_6_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4823:2: rule__Activity__Group_6_1__0__Impl rule__Activity__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__0__Impl_in_rule__Activity__Group_6_1__09578);
            rule__Activity__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__1_in_rule__Activity__Group_6_1__09581);
            rule__Activity__Group_6_1__1();

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
    // $ANTLR end "rule__Activity__Group_6_1__0"


    // $ANTLR start "rule__Activity__Group_6_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4830:1: rule__Activity__Group_6_1__0__Impl : ( ( rule__Activity__Alternatives_6_1_0 ) ) ;
    public final void rule__Activity__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4834:1: ( ( ( rule__Activity__Alternatives_6_1_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4835:1: ( ( rule__Activity__Alternatives_6_1_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4835:1: ( ( rule__Activity__Alternatives_6_1_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4836:1: ( rule__Activity__Alternatives_6_1_0 )
            {
             before(grammarAccess.getActivityAccess().getAlternatives_6_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4837:1: ( rule__Activity__Alternatives_6_1_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4837:2: rule__Activity__Alternatives_6_1_0
            {
            pushFollow(FOLLOW_rule__Activity__Alternatives_6_1_0_in_rule__Activity__Group_6_1__0__Impl9608);
            rule__Activity__Alternatives_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives_6_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_6_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4847:1: rule__Activity__Group_6_1__1 : rule__Activity__Group_6_1__1__Impl rule__Activity__Group_6_1__2 ;
    public final void rule__Activity__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4851:1: ( rule__Activity__Group_6_1__1__Impl rule__Activity__Group_6_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4852:2: rule__Activity__Group_6_1__1__Impl rule__Activity__Group_6_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__1__Impl_in_rule__Activity__Group_6_1__19638);
            rule__Activity__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__2_in_rule__Activity__Group_6_1__19641);
            rule__Activity__Group_6_1__2();

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
    // $ANTLR end "rule__Activity__Group_6_1__1"


    // $ANTLR start "rule__Activity__Group_6_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4859:1: rule__Activity__Group_6_1__1__Impl : ( 'completeness' ) ;
    public final void rule__Activity__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4863:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4864:1: ( 'completeness' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4864:1: ( 'completeness' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4865:1: 'completeness'
            {
             before(grammarAccess.getActivityAccess().getCompletenessKeyword_6_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Activity__Group_6_1__1__Impl9669); 
             after(grammarAccess.getActivityAccess().getCompletenessKeyword_6_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_6_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4878:1: rule__Activity__Group_6_1__2 : rule__Activity__Group_6_1__2__Impl rule__Activity__Group_6_1__3 ;
    public final void rule__Activity__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4882:1: ( rule__Activity__Group_6_1__2__Impl rule__Activity__Group_6_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4883:2: rule__Activity__Group_6_1__2__Impl rule__Activity__Group_6_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__2__Impl_in_rule__Activity__Group_6_1__29700);
            rule__Activity__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__3_in_rule__Activity__Group_6_1__29703);
            rule__Activity__Group_6_1__3();

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
    // $ANTLR end "rule__Activity__Group_6_1__2"


    // $ANTLR start "rule__Activity__Group_6_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4890:1: rule__Activity__Group_6_1__2__Impl : ( ( rule__Activity__CompletenessAssignment_6_1_2 ) ) ;
    public final void rule__Activity__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4894:1: ( ( ( rule__Activity__CompletenessAssignment_6_1_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4895:1: ( ( rule__Activity__CompletenessAssignment_6_1_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4895:1: ( ( rule__Activity__CompletenessAssignment_6_1_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4896:1: ( rule__Activity__CompletenessAssignment_6_1_2 )
            {
             before(grammarAccess.getActivityAccess().getCompletenessAssignment_6_1_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4897:1: ( rule__Activity__CompletenessAssignment_6_1_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4897:2: rule__Activity__CompletenessAssignment_6_1_2
            {
            pushFollow(FOLLOW_rule__Activity__CompletenessAssignment_6_1_2_in_rule__Activity__Group_6_1__2__Impl9730);
            rule__Activity__CompletenessAssignment_6_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getCompletenessAssignment_6_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_6_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4907:1: rule__Activity__Group_6_1__3 : rule__Activity__Group_6_1__3__Impl rule__Activity__Group_6_1__4 ;
    public final void rule__Activity__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4911:1: ( rule__Activity__Group_6_1__3__Impl rule__Activity__Group_6_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4912:2: rule__Activity__Group_6_1__3__Impl rule__Activity__Group_6_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__3__Impl_in_rule__Activity__Group_6_1__39760);
            rule__Activity__Group_6_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1__4_in_rule__Activity__Group_6_1__39763);
            rule__Activity__Group_6_1__4();

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
    // $ANTLR end "rule__Activity__Group_6_1__3"


    // $ANTLR start "rule__Activity__Group_6_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4919:1: rule__Activity__Group_6_1__3__Impl : ( '%' ) ;
    public final void rule__Activity__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4923:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4924:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4924:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4925:1: '%'
            {
             before(grammarAccess.getActivityAccess().getPercentSignKeyword_6_1_3()); 
            match(input,36,FOLLOW_36_in_rule__Activity__Group_6_1__3__Impl9791); 
             after(grammarAccess.getActivityAccess().getPercentSignKeyword_6_1_3()); 

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
    // $ANTLR end "rule__Activity__Group_6_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_6_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4938:1: rule__Activity__Group_6_1__4 : rule__Activity__Group_6_1__4__Impl ;
    public final void rule__Activity__Group_6_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4942:1: ( rule__Activity__Group_6_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4943:2: rule__Activity__Group_6_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1__4__Impl_in_rule__Activity__Group_6_1__49822);
            rule__Activity__Group_6_1__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_6_1__4"


    // $ANTLR start "rule__Activity__Group_6_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4949:1: rule__Activity__Group_6_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4953:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4954:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4954:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4955:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1__4__Impl9849);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_4()); 

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
    // $ANTLR end "rule__Activity__Group_6_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4976:1: rule__Activity__Group_6_1_0_0__0 : rule__Activity__Group_6_1_0_0__0__Impl rule__Activity__Group_6_1_0_0__1 ;
    public final void rule__Activity__Group_6_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4980:1: ( rule__Activity__Group_6_1_0_0__0__Impl rule__Activity__Group_6_1_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4981:2: rule__Activity__Group_6_1_0_0__0__Impl rule__Activity__Group_6_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__0__Impl_in_rule__Activity__Group_6_1_0_0__09888);
            rule__Activity__Group_6_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__1_in_rule__Activity__Group_6_1_0_0__09891);
            rule__Activity__Group_6_1_0_0__1();

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
    // $ANTLR end "rule__Activity__Group_6_1_0_0__0"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4988:1: rule__Activity__Group_6_1_0_0__0__Impl : ( 'ends' ) ;
    public final void rule__Activity__Group_6_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4992:1: ( ( 'ends' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4993:1: ( 'ends' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4993:1: ( 'ends' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4994:1: 'ends'
            {
             before(grammarAccess.getActivityAccess().getEndsKeyword_6_1_0_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Activity__Group_6_1_0_0__0__Impl9919); 
             after(grammarAccess.getActivityAccess().getEndsKeyword_6_1_0_0_0()); 

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
    // $ANTLR end "rule__Activity__Group_6_1_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5007:1: rule__Activity__Group_6_1_0_0__1 : rule__Activity__Group_6_1_0_0__1__Impl rule__Activity__Group_6_1_0_0__2 ;
    public final void rule__Activity__Group_6_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5011:1: ( rule__Activity__Group_6_1_0_0__1__Impl rule__Activity__Group_6_1_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5012:2: rule__Activity__Group_6_1_0_0__1__Impl rule__Activity__Group_6_1_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__1__Impl_in_rule__Activity__Group_6_1_0_0__19950);
            rule__Activity__Group_6_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__2_in_rule__Activity__Group_6_1_0_0__19953);
            rule__Activity__Group_6_1_0_0__2();

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
    // $ANTLR end "rule__Activity__Group_6_1_0_0__1"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5019:1: rule__Activity__Group_6_1_0_0__1__Impl : ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) ) ;
    public final void rule__Activity__Group_6_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5023:1: ( ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5024:1: ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5024:1: ( ( rule__Activity__EndAssignment_6_1_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5025:1: ( rule__Activity__EndAssignment_6_1_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getEndAssignment_6_1_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5026:1: ( rule__Activity__EndAssignment_6_1_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5026:2: rule__Activity__EndAssignment_6_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__EndAssignment_6_1_0_0_1_in_rule__Activity__Group_6_1_0_0__1__Impl9980);
            rule__Activity__EndAssignment_6_1_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getEndAssignment_6_1_0_0_1()); 

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
    // $ANTLR end "rule__Activity__Group_6_1_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5036:1: rule__Activity__Group_6_1_0_0__2 : rule__Activity__Group_6_1_0_0__2__Impl ;
    public final void rule__Activity__Group_6_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5040:1: ( rule__Activity__Group_6_1_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5041:2: rule__Activity__Group_6_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_0__2__Impl_in_rule__Activity__Group_6_1_0_0__210010);
            rule__Activity__Group_6_1_0_0__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_6_1_0_0__2"


    // $ANTLR start "rule__Activity__Group_6_1_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5047:1: rule__Activity__Group_6_1_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5051:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5053:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_0__2__Impl10037);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_0_2()); 

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
    // $ANTLR end "rule__Activity__Group_6_1_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5070:1: rule__Activity__Group_6_1_0_1__0 : rule__Activity__Group_6_1_0_1__0__Impl rule__Activity__Group_6_1_0_1__1 ;
    public final void rule__Activity__Group_6_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5074:1: ( rule__Activity__Group_6_1_0_1__0__Impl rule__Activity__Group_6_1_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5075:2: rule__Activity__Group_6_1_0_1__0__Impl rule__Activity__Group_6_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__0__Impl_in_rule__Activity__Group_6_1_0_1__010072);
            rule__Activity__Group_6_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__1_in_rule__Activity__Group_6_1_0_1__010075);
            rule__Activity__Group_6_1_0_1__1();

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
    // $ANTLR end "rule__Activity__Group_6_1_0_1__0"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5082:1: rule__Activity__Group_6_1_0_1__0__Impl : ( 'duration' ) ;
    public final void rule__Activity__Group_6_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5086:1: ( ( 'duration' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5087:1: ( 'duration' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5087:1: ( 'duration' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5088:1: 'duration'
            {
             before(grammarAccess.getActivityAccess().getDurationKeyword_6_1_0_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Activity__Group_6_1_0_1__0__Impl10103); 
             after(grammarAccess.getActivityAccess().getDurationKeyword_6_1_0_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_6_1_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5101:1: rule__Activity__Group_6_1_0_1__1 : rule__Activity__Group_6_1_0_1__1__Impl rule__Activity__Group_6_1_0_1__2 ;
    public final void rule__Activity__Group_6_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5105:1: ( rule__Activity__Group_6_1_0_1__1__Impl rule__Activity__Group_6_1_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5106:2: rule__Activity__Group_6_1_0_1__1__Impl rule__Activity__Group_6_1_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__1__Impl_in_rule__Activity__Group_6_1_0_1__110134);
            rule__Activity__Group_6_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__2_in_rule__Activity__Group_6_1_0_1__110137);
            rule__Activity__Group_6_1_0_1__2();

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
    // $ANTLR end "rule__Activity__Group_6_1_0_1__1"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5113:1: rule__Activity__Group_6_1_0_1__1__Impl : ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) ) ;
    public final void rule__Activity__Group_6_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5117:1: ( ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5118:1: ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5118:1: ( ( rule__Activity__DurationAssignment_6_1_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5119:1: ( rule__Activity__DurationAssignment_6_1_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getDurationAssignment_6_1_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5120:1: ( rule__Activity__DurationAssignment_6_1_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5120:2: rule__Activity__DurationAssignment_6_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__DurationAssignment_6_1_0_1_1_in_rule__Activity__Group_6_1_0_1__1__Impl10164);
            rule__Activity__DurationAssignment_6_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDurationAssignment_6_1_0_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_6_1_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5130:1: rule__Activity__Group_6_1_0_1__2 : rule__Activity__Group_6_1_0_1__2__Impl ;
    public final void rule__Activity__Group_6_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5134:1: ( rule__Activity__Group_6_1_0_1__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5135:2: rule__Activity__Group_6_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_1_0_1__2__Impl_in_rule__Activity__Group_6_1_0_1__210194);
            rule__Activity__Group_6_1_0_1__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_6_1_0_1__2"


    // $ANTLR start "rule__Activity__Group_6_1_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5141:1: rule__Activity__Group_6_1_0_1__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5145:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5146:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5146:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5147:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_1_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_1__2__Impl10221);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_6_1_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5164:1: rule__Activity__Group_6_2__0 : rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 ;
    public final void rule__Activity__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5168:1: ( rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5169:2: rule__Activity__Group_6_2__0__Impl rule__Activity__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__010256);
            rule__Activity__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__010259);
            rule__Activity__Group_6_2__1();

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
    // $ANTLR end "rule__Activity__Group_6_2__0"


    // $ANTLR start "rule__Activity__Group_6_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5176:1: rule__Activity__Group_6_2__0__Impl : ( 'dependsOn' ) ;
    public final void rule__Activity__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5180:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5181:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5181:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5182:1: 'dependsOn'
            {
             before(grammarAccess.getActivityAccess().getDependsOnKeyword_6_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_6_2__0__Impl10287); 
             after(grammarAccess.getActivityAccess().getDependsOnKeyword_6_2_0()); 

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
    // $ANTLR end "rule__Activity__Group_6_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5195:1: rule__Activity__Group_6_2__1 : rule__Activity__Group_6_2__1__Impl rule__Activity__Group_6_2__2 ;
    public final void rule__Activity__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5199:1: ( rule__Activity__Group_6_2__1__Impl rule__Activity__Group_6_2__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5200:2: rule__Activity__Group_6_2__1__Impl rule__Activity__Group_6_2__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__110318);
            rule__Activity__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6_2__2_in_rule__Activity__Group_6_2__110321);
            rule__Activity__Group_6_2__2();

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
    // $ANTLR end "rule__Activity__Group_6_2__1"


    // $ANTLR start "rule__Activity__Group_6_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5207:1: rule__Activity__Group_6_2__1__Impl : ( ( rule__Activity__DependenciesAssignment_6_2_1 )* ) ;
    public final void rule__Activity__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5211:1: ( ( ( rule__Activity__DependenciesAssignment_6_2_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5212:1: ( ( rule__Activity__DependenciesAssignment_6_2_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5212:1: ( ( rule__Activity__DependenciesAssignment_6_2_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5213:1: ( rule__Activity__DependenciesAssignment_6_2_1 )*
            {
             before(grammarAccess.getActivityAccess().getDependenciesAssignment_6_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5214:1: ( rule__Activity__DependenciesAssignment_6_2_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5214:2: rule__Activity__DependenciesAssignment_6_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Activity__DependenciesAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl10348);
            	    rule__Activity__DependenciesAssignment_6_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getDependenciesAssignment_6_2_1()); 

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
    // $ANTLR end "rule__Activity__Group_6_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_6_2__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5224:1: rule__Activity__Group_6_2__2 : rule__Activity__Group_6_2__2__Impl ;
    public final void rule__Activity__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5228:1: ( rule__Activity__Group_6_2__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5229:2: rule__Activity__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6_2__2__Impl_in_rule__Activity__Group_6_2__210379);
            rule__Activity__Group_6_2__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_6_2__2"


    // $ANTLR start "rule__Activity__Group_6_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5235:1: rule__Activity__Group_6_2__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5239:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5240:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5240:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5241:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_2__2__Impl10406);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2_2()); 

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
    // $ANTLR end "rule__Activity__Group_6_2__2__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5260:1: rule__CheckPoint__UnorderedGroup_5 : rule__CheckPoint__UnorderedGroup_5__0 {...}?;
    public final void rule__CheckPoint__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5265:1: ( rule__CheckPoint__UnorderedGroup_5__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5266:2: rule__CheckPoint__UnorderedGroup_5__0 {...}?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__0_in_rule__CheckPoint__UnorderedGroup_510443);
            rule__CheckPoint__UnorderedGroup_5__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5277:1: rule__CheckPoint__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) ) ) ) ;
    public final void rule__CheckPoint__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5282:1: ( ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5283:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5283:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) ) ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( LA38_0 >=32 && LA38_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                alt38=2;
            }
            else if ( LA38_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2) ) {
                alt38=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5285:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5285:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5286:5: {...}? => ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5286:107: ( ( ( rule__CheckPoint__Alternatives_5_0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5287:6: ( ( rule__CheckPoint__Alternatives_5_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5293:6: ( ( rule__CheckPoint__Alternatives_5_0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5295:7: ( rule__CheckPoint__Alternatives_5_0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getAlternatives_5_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5296:7: ( rule__CheckPoint__Alternatives_5_0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5296:8: rule__CheckPoint__Alternatives_5_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Alternatives_5_0_in_rule__CheckPoint__UnorderedGroup_5__Impl10532);
                    rule__CheckPoint__Alternatives_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getAlternatives_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5302:4: ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5302:4: ({...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5303:5: {...}? => ( ( ( rule__CheckPoint__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5303:107: ( ( ( rule__CheckPoint__Group_5_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5304:6: ( ( rule__CheckPoint__Group_5_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5310:6: ( ( rule__CheckPoint__Group_5_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5312:7: ( rule__CheckPoint__Group_5_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5313:7: ( rule__CheckPoint__Group_5_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5313:8: rule__CheckPoint__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_1__0_in_rule__CheckPoint__UnorderedGroup_5__Impl10623);
                    rule__CheckPoint__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5319:4: ({...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5319:4: ({...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5320:5: {...}? => ( ( ( rule__CheckPoint__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5320:107: ( ( ( rule__CheckPoint__Group_5_2__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5321:6: ( ( rule__CheckPoint__Group_5_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5327:6: ( ( rule__CheckPoint__Group_5_2__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5329:7: ( rule__CheckPoint__Group_5_2__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_5_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5330:7: ( rule__CheckPoint__Group_5_2__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5330:8: rule__CheckPoint__Group_5_2__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_5_2__0_in_rule__CheckPoint__UnorderedGroup_5__Impl10714);
                    rule__CheckPoint__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_5_2()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5345:1: rule__CheckPoint__UnorderedGroup_5__0 : rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__1 )? ;
    public final void rule__CheckPoint__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5349:1: ( rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5350:2: rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__010773);
            rule__CheckPoint__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5351:2: ( rule__CheckPoint__UnorderedGroup_5__1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 >=32 && LA39_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5351:2: rule__CheckPoint__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__1_in_rule__CheckPoint__UnorderedGroup_5__010776);
                    rule__CheckPoint__UnorderedGroup_5__1();

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__0"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5358:1: rule__CheckPoint__UnorderedGroup_5__1 : rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__2 )? ;
    public final void rule__CheckPoint__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5362:1: ( rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__2 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5363:2: rule__CheckPoint__UnorderedGroup_5__Impl ( rule__CheckPoint__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__110801);
            rule__CheckPoint__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5364:2: ( rule__CheckPoint__UnorderedGroup_5__2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 >=32 && LA40_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 2) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5364:2: rule__CheckPoint__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__2_in_rule__CheckPoint__UnorderedGroup_5__110804);
                    rule__CheckPoint__UnorderedGroup_5__2();

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__1"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5371:1: rule__CheckPoint__UnorderedGroup_5__2 : rule__CheckPoint__UnorderedGroup_5__Impl ;
    public final void rule__CheckPoint__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5375:1: ( rule__CheckPoint__UnorderedGroup_5__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5376:2: rule__CheckPoint__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__210829);
            rule__CheckPoint__UnorderedGroup_5__Impl();

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_5__2"


    // $ANTLR start "rule__Activity__UnorderedGroup_6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5389:1: rule__Activity__UnorderedGroup_6 : rule__Activity__UnorderedGroup_6__0 {...}?;
    public final void rule__Activity__UnorderedGroup_6() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5394:1: ( rule__Activity__UnorderedGroup_6__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5395:2: rule__Activity__UnorderedGroup_6__0 {...}?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__0_in_rule__Activity__UnorderedGroup_610859);
            rule__Activity__UnorderedGroup_6__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6()) ) {
                throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5406:1: rule__Activity__UnorderedGroup_6__Impl : ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) ) ;
    public final void rule__Activity__UnorderedGroup_6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5411:1: ( ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5412:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5412:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33||LA41_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 >=42 && LA41_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                alt41=2;
            }
            else if ( LA41_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                alt41=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5414:4: ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5414:4: ({...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5415:5: {...}? => ( ( ( rule__Activity__Alternatives_6_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5415:105: ( ( ( rule__Activity__Alternatives_6_0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5416:6: ( ( rule__Activity__Alternatives_6_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5422:6: ( ( rule__Activity__Alternatives_6_0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5424:7: ( rule__Activity__Alternatives_6_0 )
                    {
                     before(grammarAccess.getActivityAccess().getAlternatives_6_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5425:7: ( rule__Activity__Alternatives_6_0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5425:8: rule__Activity__Alternatives_6_0
                    {
                    pushFollow(FOLLOW_rule__Activity__Alternatives_6_0_in_rule__Activity__UnorderedGroup_6__Impl10948);
                    rule__Activity__Alternatives_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getAlternatives_6_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5431:4: ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5431:4: ({...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5432:5: {...}? => ( ( ( rule__Activity__Group_6_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5432:105: ( ( ( rule__Activity__Group_6_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5433:6: ( ( rule__Activity__Group_6_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5439:6: ( ( rule__Activity__Group_6_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5441:7: ( rule__Activity__Group_6_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5442:7: ( rule__Activity__Group_6_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5442:8: rule__Activity__Group_6_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_1__0_in_rule__Activity__UnorderedGroup_6__Impl11039);
                    rule__Activity__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5448:4: ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5448:4: ({...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5449:5: {...}? => ( ( ( rule__Activity__Group_6_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_6__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5449:105: ( ( ( rule__Activity__Group_6_2__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5450:6: ( ( rule__Activity__Group_6_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5456:6: ( ( rule__Activity__Group_6_2__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5458:7: ( rule__Activity__Group_6_2__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_6_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5459:7: ( rule__Activity__Group_6_2__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5459:8: rule__Activity__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__UnorderedGroup_6__Impl11130);
                    rule__Activity__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_6_2()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_6__Impl"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5474:1: rule__Activity__UnorderedGroup_6__0 : rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__1 )? ;
    public final void rule__Activity__UnorderedGroup_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5478:1: ( rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5479:2: rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__1 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__011189);
            rule__Activity__UnorderedGroup_6__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5480:2: ( rule__Activity__UnorderedGroup_6__1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33||LA42_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 >=42 && LA42_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5480:2: rule__Activity__UnorderedGroup_6__1
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__1_in_rule__Activity__UnorderedGroup_6__011192);
                    rule__Activity__UnorderedGroup_6__1();

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
    // $ANTLR end "rule__Activity__UnorderedGroup_6__0"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5487:1: rule__Activity__UnorderedGroup_6__1 : rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__2 )? ;
    public final void rule__Activity__UnorderedGroup_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5491:1: ( rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__2 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5492:2: rule__Activity__UnorderedGroup_6__Impl ( rule__Activity__UnorderedGroup_6__2 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__111217);
            rule__Activity__UnorderedGroup_6__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5493:2: ( rule__Activity__UnorderedGroup_6__2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33||LA43_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >=42 && LA43_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5493:2: rule__Activity__UnorderedGroup_6__2
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__2_in_rule__Activity__UnorderedGroup_6__111220);
                    rule__Activity__UnorderedGroup_6__2();

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
    // $ANTLR end "rule__Activity__UnorderedGroup_6__1"


    // $ANTLR start "rule__Activity__UnorderedGroup_6__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5500:1: rule__Activity__UnorderedGroup_6__2 : rule__Activity__UnorderedGroup_6__Impl ;
    public final void rule__Activity__UnorderedGroup_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5504:1: ( rule__Activity__UnorderedGroup_6__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5505:2: rule__Activity__UnorderedGroup_6__Impl
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__211245);
            rule__Activity__UnorderedGroup_6__Impl();

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
    // $ANTLR end "rule__Activity__UnorderedGroup_6__2"


    // $ANTLR start "rule__Program__DescriptionAssignment_0_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5518:1: rule__Program__DescriptionAssignment_0_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Program__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5522:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5523:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5523:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5524:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_011279); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5533:1: rule__Program__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5537:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5538:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5538:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5539:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_111310); 
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


    // $ANTLR start "rule__Program__LongNameAssignment_0_1_3_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5548:1: rule__Program__LongNameAssignment_0_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Program__LongNameAssignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5552:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5553:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5553:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5554:1: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Program__LongNameAssignment_0_1_3_111341); 
             after(grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 

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
    // $ANTLR end "rule__Program__LongNameAssignment_0_1_3_1"


    // $ANTLR start "rule__Program__PlansAssignment_0_1_4_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5563:1: rule__Program__PlansAssignment_0_1_4_0 : ( rulePlanImport ) ;
    public final void rule__Program__PlansAssignment_0_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5567:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5568:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5568:1: ( rulePlanImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5569:1: rulePlanImport
            {
             before(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_4_011372);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 

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
    // $ANTLR end "rule__Program__PlansAssignment_0_1_4_0"


    // $ANTLR start "rule__Program__ReferencedProjectsAssignment_0_1_5_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5578:1: rule__Program__ReferencedProjectsAssignment_0_1_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Program__ReferencedProjectsAssignment_0_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5582:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5583:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5583:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5584:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5585:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5586:1: ruleQualifiedName
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_5_111407);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_5_1_0_1()); 

            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 

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
    // $ANTLR end "rule__Program__ReferencedProjectsAssignment_0_1_5_1"


    // $ANTLR start "rule__Program__ProjectsAssignment_0_1_6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5597:1: rule__Program__ProjectsAssignment_0_1_6 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_0_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5601:1: ( ( ruleProject ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5602:1: ( ruleProject )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5602:1: ( ruleProject )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5603:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_611442);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 

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
    // $ANTLR end "rule__Program__ProjectsAssignment_0_1_6"


    // $ANTLR start "rule__Program__ProjectsAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5612:1: rule__Program__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5616:1: ( ( ruleProject ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5617:1: ( ruleProject )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5617:1: ( ruleProject )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5618:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_111473);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5627:1: rule__Project__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Project__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5631:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5632:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5632:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5633:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_011504); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5642:1: rule__Project__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5646:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5647:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5647:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5648:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Project__NameAssignment_211535); 
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


    // $ANTLR start "rule__Project__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5657:1: rule__Project__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Project__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5661:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5662:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5662:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5663:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__LongNameAssignment_4_111566); 
             after(grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Project__LongNameAssignment_4_1"


    // $ANTLR start "rule__Project__WbsAssignment_5_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5672:1: rule__Project__WbsAssignment_5_0 : ( ruleWBSImport ) ;
    public final void rule__Project__WbsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5676:1: ( ( ruleWBSImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5677:1: ( ruleWBSImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5677:1: ( ruleWBSImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5678:1: ruleWBSImport
            {
             before(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleWBSImport_in_rule__Project__WbsAssignment_5_011597);
            ruleWBSImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Project__WbsAssignment_5_0"


    // $ANTLR start "rule__Project__ResourcesAssignment_6_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5687:1: rule__Project__ResourcesAssignment_6_0 : ( ruleResourcesImport ) ;
    public final void rule__Project__ResourcesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5691:1: ( ( ruleResourcesImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5692:1: ( ruleResourcesImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5692:1: ( ruleResourcesImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5693:1: ruleResourcesImport
            {
             before(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_rule__Project__ResourcesAssignment_6_011628);
            ruleResourcesImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Project__ResourcesAssignment_6_0"


    // $ANTLR start "rule__Project__PlansAssignment_7_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5702:1: rule__Project__PlansAssignment_7_0 : ( rulePlanImport ) ;
    public final void rule__Project__PlansAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5706:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5707:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5707:1: ( rulePlanImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5708:1: rulePlanImport
            {
             before(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_7_011659);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Project__PlansAssignment_7_0"


    // $ANTLR start "rule__Project__AssumptionsAssignment_8_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5717:1: rule__Project__AssumptionsAssignment_8_2 : ( ruleAssumption ) ;
    public final void rule__Project__AssumptionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5721:1: ( ( ruleAssumption ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5722:1: ( ruleAssumption )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5722:1: ( ruleAssumption )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5723:1: ruleAssumption
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_8_211690);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Project__AssumptionsAssignment_8_2"


    // $ANTLR start "rule__Project__ConstraintsAssignment_9_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5732:1: rule__Project__ConstraintsAssignment_9_2 : ( ruleConstraint ) ;
    public final void rule__Project__ConstraintsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5736:1: ( ( ruleConstraint ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5737:1: ( ruleConstraint )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5737:1: ( ruleConstraint )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5738:1: ruleConstraint
            {
             before(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_9_211721);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Project__ConstraintsAssignment_9_2"


    // $ANTLR start "rule__Project__ActivitiesAssignment_10"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5747:1: rule__Project__ActivitiesAssignment_10 : ( ruleActivityElement ) ;
    public final void rule__Project__ActivitiesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5751:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5752:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5752:1: ( ruleActivityElement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5753:1: ruleActivityElement
            {
             before(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_1011752);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Project__ActivitiesAssignment_10"


    // $ANTLR start "rule__Assumption__ValueAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5762:1: rule__Assumption__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Assumption__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5766:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5767:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5767:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5768:1: RULE_STRING
            {
             before(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_111783); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5777:1: rule__Constraint__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5781:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5782:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5782:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5783:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_111814); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5792:1: rule__ActivityGroup__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__ActivityGroup__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5796:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5797:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5797:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5798:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_011845); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5807:1: rule__ActivityGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActivityGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5811:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5812:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5812:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5813:1: RULE_ID
            {
             before(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_211876); 
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


    // $ANTLR start "rule__ActivityGroup__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5822:1: rule__ActivityGroup__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityGroup__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5826:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5827:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5827:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5828:1: RULE_STRING
            {
             before(grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActivityGroup__LongNameAssignment_4_111907); 
             after(grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ActivityGroup__LongNameAssignment_4_1"


    // $ANTLR start "rule__ActivityGroup__DependenciesAssignment_5_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5837:1: rule__ActivityGroup__DependenciesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ActivityGroup__DependenciesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5841:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5842:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5842:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5843:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_5_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5844:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5845:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_5_111942);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ActivityGroup__DependenciesAssignment_5_1"


    // $ANTLR start "rule__ActivityGroup__ActivitiesAssignment_6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5856:1: rule__ActivityGroup__ActivitiesAssignment_6 : ( ruleActivityElement ) ;
    public final void rule__ActivityGroup__ActivitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5860:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5861:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5861:1: ( ruleActivityElement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5862:1: ruleActivityElement
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_611977);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ActivityGroup__ActivitiesAssignment_6"


    // $ANTLR start "rule__WBSImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5871:1: rule__WBSImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WBSImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5875:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5876:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5876:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5877:1: RULE_STRING
            {
             before(grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WBSImport__ImportURIAssignment_112008); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5886:1: rule__ResourcesImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResourcesImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5890:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5891:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5891:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5892:1: RULE_STRING
            {
             before(grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourcesImport__ImportURIAssignment_112039); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5901:1: rule__PlanImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PlanImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5905:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5906:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5906:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5907:1: RULE_STRING
            {
             before(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_112070); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5916:1: rule__CheckPoint__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__CheckPoint__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5920:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5921:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5921:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5922:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_012101); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5931:1: rule__CheckPoint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CheckPoint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5935:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5936:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5936:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5937:1: RULE_ID
            {
             before(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_212132); 
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


    // $ANTLR start "rule__CheckPoint__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5946:1: rule__CheckPoint__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5950:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5951:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5951:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5952:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__LongNameAssignment_4_112163); 
             after(grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__LongNameAssignment_4_1"


    // $ANTLR start "rule__CheckPoint__EndAssignment_5_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5961:1: rule__CheckPoint__EndAssignment_5_0_0_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__EndAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5965:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5966:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5966:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5967:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_5_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_5_0_0_112194); 
             after(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_5_0_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__EndAssignment_5_0_0_1"


    // $ANTLR start "rule__CheckPoint__AfterAssignment_5_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5976:1: rule__CheckPoint__AfterAssignment_5_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__AfterAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5980:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5981:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5981:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5982:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5983:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5984:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_5_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_5_0_1_112229);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_5_0_1_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__AfterAssignment_5_0_1_1"


    // $ANTLR start "rule__CheckPoint__OffsetAssignment_5_0_1_3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5995:1: rule__CheckPoint__OffsetAssignment_5_0_1_3 : ( RULE_INT ) ;
    public final void rule__CheckPoint__OffsetAssignment_5_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5999:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6000:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6000:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6001:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_5_0_1_312264); 
             after(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 

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
    // $ANTLR end "rule__CheckPoint__OffsetAssignment_5_0_1_3"


    // $ANTLR start "rule__CheckPoint__CompletenessAssignment_5_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6010:1: rule__CheckPoint__CompletenessAssignment_5_1_1 : ( RULE_INT ) ;
    public final void rule__CheckPoint__CompletenessAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6014:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6015:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6015:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6016:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_5_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_5_1_112295); 
             after(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__CompletenessAssignment_5_1_1"


    // $ANTLR start "rule__CheckPoint__DependenciesAssignment_5_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6025:1: rule__CheckPoint__DependenciesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__DependenciesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6029:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6030:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6030:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6031:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_5_2_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6032:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6033:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_5_2_112330);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__DependenciesAssignment_5_2_1"


    // $ANTLR start "rule__ResourceInvolvement__ResourceAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6044:1: rule__ResourceInvolvement__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceInvolvement__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6048:1: ( ( ( RULE_ID ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6049:1: ( ( RULE_ID ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6049:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6050:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6051:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6052:1: RULE_ID
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_012369); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6063:1: rule__ResourceInvolvement__OccupationAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ResourceInvolvement__OccupationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6067:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6068:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6068:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6069:1: RULE_INT
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_112404); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6078:1: rule__ResourceInvolvement__ResponsibilityAssignment_2_1 : ( ruleResponsibility ) ;
    public final void rule__ResourceInvolvement__ResponsibilityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6082:1: ( ( ruleResponsibility ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6083:1: ( ruleResponsibility )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6083:1: ( ruleResponsibility )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6084:1: ruleResponsibility
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_112435);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6093:1: rule__Activity__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Activity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6097:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6098:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6098:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6099:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_012466); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6108:1: rule__Activity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6112:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6113:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6113:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6114:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_212497); 
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


    // $ANTLR start "rule__Activity__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6123:1: rule__Activity__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6127:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6128:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6128:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6129:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__LongNameAssignment_4_112528); 
             after(grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Activity__LongNameAssignment_4_1"


    // $ANTLR start "rule__Activity__InvolvedResourcesAssignment_5_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6138:1: rule__Activity__InvolvedResourcesAssignment_5_2 : ( ruleResourceInvolvement ) ;
    public final void rule__Activity__InvolvedResourcesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6142:1: ( ( ruleResourceInvolvement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6143:1: ( ruleResourceInvolvement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6143:1: ( ruleResourceInvolvement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6144:1: ruleResourceInvolvement
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_5_212559);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Activity__InvolvedResourcesAssignment_5_2"


    // $ANTLR start "rule__Activity__StartAssignment_6_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6153:1: rule__Activity__StartAssignment_6_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__StartAssignment_6_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6157:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6158:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6158:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6159:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_6_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_6_0_0_112590); 
             after(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_6_0_0_1_0()); 

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
    // $ANTLR end "rule__Activity__StartAssignment_6_0_0_1"


    // $ANTLR start "rule__Activity__AfterAssignment_6_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6168:1: rule__Activity__AfterAssignment_6_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__AfterAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6172:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6173:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6173:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6174:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_6_0_1_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6175:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6176:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_6_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_6_0_1_112625);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_6_0_1_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_6_0_1_1_0()); 

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
    // $ANTLR end "rule__Activity__AfterAssignment_6_0_1_1"


    // $ANTLR start "rule__Activity__OffsetAssignment_6_0_1_3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6187:1: rule__Activity__OffsetAssignment_6_0_1_3 : ( RULE_INT ) ;
    public final void rule__Activity__OffsetAssignment_6_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6191:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6192:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6192:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6193:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_6_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_6_0_1_312660); 
             after(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_6_0_1_3_0()); 

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
    // $ANTLR end "rule__Activity__OffsetAssignment_6_0_1_3"


    // $ANTLR start "rule__Activity__EndAssignment_6_1_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6202:1: rule__Activity__EndAssignment_6_1_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__EndAssignment_6_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6206:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6207:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6207:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6208:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_6_1_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_6_1_0_0_112691); 
             after(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_6_1_0_0_1_0()); 

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
    // $ANTLR end "rule__Activity__EndAssignment_6_1_0_0_1"


    // $ANTLR start "rule__Activity__DurationAssignment_6_1_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6217:1: rule__Activity__DurationAssignment_6_1_0_1_1 : ( RULE_INT ) ;
    public final void rule__Activity__DurationAssignment_6_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6221:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6222:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6222:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6223:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_6_1_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_6_1_0_1_112722); 
             after(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_6_1_0_1_1_0()); 

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
    // $ANTLR end "rule__Activity__DurationAssignment_6_1_0_1_1"


    // $ANTLR start "rule__Activity__CompletenessAssignment_6_1_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6232:1: rule__Activity__CompletenessAssignment_6_1_2 : ( RULE_INT ) ;
    public final void rule__Activity__CompletenessAssignment_6_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6236:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6237:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6237:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6238:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_6_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_6_1_212753); 
             after(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_6_1_2_0()); 

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
    // $ANTLR end "rule__Activity__CompletenessAssignment_6_1_2"


    // $ANTLR start "rule__Activity__DependenciesAssignment_6_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6247:1: rule__Activity__DependenciesAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__DependenciesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6251:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6252:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6252:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6253:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_6_2_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6254:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6255:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_6_2_112788);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_6_2_1_0()); 

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
    // $ANTLR end "rule__Activity__DependenciesAssignment_6_2_1"

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
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__0_in_rule__CheckPoint__Alternatives_5_01069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__0_in_rule__CheckPoint__Alternatives_5_01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__0_in_rule__Activity__Alternatives_6_01120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__0_in_rule__Activity__Alternatives_6_01138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__0_in_rule__Activity__Alternatives_6_1_01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__0_in_rule__Activity__Alternatives_6_1_01189 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21563 = new BitSet(new long[]{0x00000000203800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31622 = new BitSet(new long[]{0x00000000203800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41683 = new BitSet(new long[]{0x00000000203800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1713 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51744 = new BitSet(new long[]{0x00000000203800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__0_in_rule__Program__Group_0_1__5__Impl1774 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61805 = new BitSet(new long[]{0x00000000203800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__7_in_rule__Program__Group_0_1__61808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_0_1_6_in_rule__Program__Group_0_1__6__Impl1835 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__7__Impl_in_rule__Program__Group_0_1__71866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__7__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01938 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group_0_1_3__0__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__12000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__2_in_rule__Program__Group_0_1_3__12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__LongNameAssignment_0_1_3_1_in_rule__Program__Group_0_1_3__1__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__2__Impl_in_rule__Program__Group_0_1_3__22060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__2__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__02122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PlansAssignment_0_1_4_0_in_rule__Program__Group_0_1_4__0__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__1__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__0__Impl_in_rule__Program__Group_0_1_5__02242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__1_in_rule__Program__Group_0_1_5__02245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Program__Group_0_1_5__0__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__1__Impl_in_rule__Program__Group_0_1_5__12304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__2_in_rule__Program__Group_0_1_5__12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_5_1_in_rule__Program__Group_0_1_5__1__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__2__Impl_in_rule__Program__Group_0_1_5__22364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_5__2__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02426 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group__1__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32609 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42668 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52729 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62790 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72851 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2881 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82912 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92973 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__0_in_rule__Project__Group__9__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__103034 = new BitSet(new long[]{0x00000080BAC800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__11_in_rule__Project__Group__103037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_10_in_rule__Project__Group__10__Impl3064 = new BitSet(new long[]{0x0000008082000082L});
    public static final BitSet FOLLOW_rule__Project__Group__11__Impl_in_rule__Project__Group__113095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__11__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__03175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group_4__0__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__13237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__LongNameAssignment_4_1_in_rule__Project__Group_4__1__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__23297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_4__2__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__03359 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__WbsAssignment_5_0_in_rule__Project__Group_5__0__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_5__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03479 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ResourcesAssignment_6_0_in_rule__Project__Group_6__0__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03599 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__PlansAssignment_7_0_in_rule__Project__Group_7__0__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_7__1__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Project__Group_8__0__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13781 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23840 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__AssumptionsAssignment_8_2_in_rule__Project__Group_8__2__Impl3870 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__33901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__0__Impl_in_rule__Project__Group_9__03965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_9__1_in_rule__Project__Group_9__03968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Project__Group_9__0__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__1__Impl_in_rule__Project__Group_9__14027 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_9__2_in_rule__Project__Group_9__14030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_9__1__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__2__Impl_in_rule__Project__Group_9__24086 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_9__3_in_rule__Project__Group_9__24089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ConstraintsAssignment_9_2_in_rule__Project__Group_9__2__Impl4116 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__3__Impl_in_rule__Project__Group_9__34147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_9__3__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__04211 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__04214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Assumption__Group__0__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__14273 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__14276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__24333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04395 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__0__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14457 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04579 = new BitSet(new long[]{0x0000008082000080L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14640 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActivityGroup__Group__1__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34762 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44821 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__54882 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__54885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__0_in_rule__ActivityGroup__Group__5__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__64943 = new BitSet(new long[]{0x00000080860800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__7_in_rule__ActivityGroup__Group__64946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__ActivitiesAssignment_6_in_rule__ActivityGroup__Group__6__Impl4973 = new BitSet(new long[]{0x0000008082000082L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__7__Impl_in_rule__ActivityGroup__Group__75004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__7__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__05076 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__05079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActivityGroup__Group_4__0__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__15138 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__15141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__LongNameAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__25198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__0__Impl_in_rule__ActivityGroup__Group_5__05260 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__1_in_rule__ActivityGroup__Group_5__05263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActivityGroup__Group_5__0__Impl5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__1__Impl_in_rule__ActivityGroup__Group_5__15322 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__2_in_rule__ActivityGroup__Group_5__15325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DependenciesAssignment_5_1_in_rule__ActivityGroup__Group_5__1__Impl5352 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__2__Impl_in_rule__ActivityGroup__Group_5__25383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_5__2__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__0__Impl_in_rule__WBSImport__Group__05445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__1_in_rule__WBSImport__Group__05448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__WBSImport__Group__0__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__1__Impl_in_rule__WBSImport__Group__15507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__ImportURIAssignment_1_in_rule__WBSImport__Group__1__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__0__Impl_in_rule__ResourcesImport__Group__05568 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__1_in_rule__ResourcesImport__Group__05571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ResourcesImport__Group__0__Impl5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__1__Impl_in_rule__ResourcesImport__Group__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__ImportURIAssignment_1_in_rule__ResourcesImport__Group__1__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__05691 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__05694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PlanImport__Group__0__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05814 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5900 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05935 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__0__Impl_in_rule__CheckPoint__Group__06058 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__1_in_rule__CheckPoint__Group__06061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DescriptionAssignment_0_in_rule__CheckPoint__Group__0__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__1__Impl_in_rule__CheckPoint__Group__16119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__2_in_rule__CheckPoint__Group__16122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CheckPoint__Group__1__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__2__Impl_in_rule__CheckPoint__Group__26181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__3_in_rule__CheckPoint__Group__26184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__NameAssignment_2_in_rule__CheckPoint__Group__2__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__3__Impl_in_rule__CheckPoint__Group__36241 = new BitSet(new long[]{0x0000000B04080000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__4_in_rule__CheckPoint__Group__36244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group__3__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__4__Impl_in_rule__CheckPoint__Group__46300 = new BitSet(new long[]{0x0000000B04080000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__5_in_rule__CheckPoint__Group__46303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__0_in_rule__CheckPoint__Group__4__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__5__Impl_in_rule__CheckPoint__Group__56361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__6_in_rule__CheckPoint__Group__56364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5_in_rule__CheckPoint__Group__5__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group__6__Impl_in_rule__CheckPoint__Group__66421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group__6__Impl6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__0__Impl_in_rule__CheckPoint__Group_4__06491 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__1_in_rule__CheckPoint__Group_4__06494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CheckPoint__Group_4__0__Impl6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__1__Impl_in_rule__CheckPoint__Group_4__16553 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__2_in_rule__CheckPoint__Group_4__16556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__LongNameAssignment_4_1_in_rule__CheckPoint__Group_4__1__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_4__2__Impl_in_rule__CheckPoint__Group_4__26613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_4__2__Impl6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__0__Impl_in_rule__CheckPoint__Group_5_0_0__06675 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__1_in_rule__CheckPoint__Group_5_0_0__06678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CheckPoint__Group_5_0_0__0__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__1__Impl_in_rule__CheckPoint__Group_5_0_0__16737 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__2_in_rule__CheckPoint__Group_5_0_0__16740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__EndAssignment_5_0_0_1_in_rule__CheckPoint__Group_5_0_0__1__Impl6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_0__2__Impl_in_rule__CheckPoint__Group_5_0_0__26797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_0__2__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__0__Impl_in_rule__CheckPoint__Group_5_0_1__06859 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__1_in_rule__CheckPoint__Group_5_0_1__06862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CheckPoint__Group_5_0_1__0__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__1__Impl_in_rule__CheckPoint__Group_5_0_1__16921 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__2_in_rule__CheckPoint__Group_5_0_1__16924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__AfterAssignment_5_0_1_1_in_rule__CheckPoint__Group_5_0_1__1__Impl6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__2__Impl_in_rule__CheckPoint__Group_5_0_1__26981 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__3_in_rule__CheckPoint__Group_5_0_1__26984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CheckPoint__Group_5_0_1__2__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__3__Impl_in_rule__CheckPoint__Group_5_0_1__37043 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__4_in_rule__CheckPoint__Group_5_0_1__37046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__OffsetAssignment_5_0_1_3_in_rule__CheckPoint__Group_5_0_1__3__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_0_1__4__Impl_in_rule__CheckPoint__Group_5_0_1__47103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_0_1__4__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__0__Impl_in_rule__CheckPoint__Group_5_1__07169 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__1_in_rule__CheckPoint__Group_5_1__07172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CheckPoint__Group_5_1__0__Impl7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__1__Impl_in_rule__CheckPoint__Group_5_1__17231 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__2_in_rule__CheckPoint__Group_5_1__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__CompletenessAssignment_5_1_1_in_rule__CheckPoint__Group_5_1__1__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__2__Impl_in_rule__CheckPoint__Group_5_1__27291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__3_in_rule__CheckPoint__Group_5_1__27294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CheckPoint__Group_5_1__2__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__3__Impl_in_rule__CheckPoint__Group_5_1__37353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_1__3__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_2__0__Impl_in_rule__CheckPoint__Group_5_2__07417 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_2__1_in_rule__CheckPoint__Group_5_2__07420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CheckPoint__Group_5_2__0__Impl7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_2__1__Impl_in_rule__CheckPoint__Group_5_2__17479 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_2__2_in_rule__CheckPoint__Group_5_2__17482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DependenciesAssignment_5_2_1_in_rule__CheckPoint__Group_5_2__1__Impl7509 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_2__2__Impl_in_rule__CheckPoint__Group_5_2__27540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_5_2__2__Impl7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__07602 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__07605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__17662 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__17665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__27723 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__27726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__37784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__07848 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__07851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ResourceInvolvement__Group_1__0__Impl7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__17910 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__17913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__27970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ResourceInvolvement__Group_1__2__Impl7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__08035 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__08038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ResourceInvolvement__Group_2__0__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__18097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__08158 = new BitSet(new long[]{0x0000008000000080L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__08161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__18219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__18222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Activity__Group__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__28281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__28284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__38341 = new BitSet(new long[]{0x00000F0204080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__38344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__48400 = new BitSet(new long[]{0x00000F0204080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__48403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__58461 = new BitSet(new long[]{0x00000F0204080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__58464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__68522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__68525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6_in_rule__Activity__Group__6__Impl8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__78582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__7__Impl8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__08654 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__08657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group_4__0__Impl8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__18716 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__18719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LongNameAssignment_4_1_in_rule__Activity__Group_4__1__Impl8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__28776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_4__2__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__08838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__08841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Activity__Group_5__0__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__18900 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__18903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_5__1__Impl8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__28959 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__28962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InvolvedResourcesAssignment_5_2_in_rule__Activity__Group_5__2__Impl8989 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__39020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_5__3__Impl9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__0__Impl_in_rule__Activity__Group_6_0_0__09084 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__1_in_rule__Activity__Group_6_0_0__09087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Activity__Group_6_0_0__0__Impl9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__1__Impl_in_rule__Activity__Group_6_0_0__19146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__2_in_rule__Activity__Group_6_0_0__19149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StartAssignment_6_0_0_1_in_rule__Activity__Group_6_0_0__1__Impl9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_0__2__Impl_in_rule__Activity__Group_6_0_0__29206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_0__2__Impl9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__0__Impl_in_rule__Activity__Group_6_0_1__09268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__1_in_rule__Activity__Group_6_0_1__09271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Activity__Group_6_0_1__0__Impl9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__1__Impl_in_rule__Activity__Group_6_0_1__19330 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__2_in_rule__Activity__Group_6_0_1__19333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AfterAssignment_6_0_1_1_in_rule__Activity__Group_6_0_1__1__Impl9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__2__Impl_in_rule__Activity__Group_6_0_1__29390 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__3_in_rule__Activity__Group_6_0_1__29393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Activity__Group_6_0_1__2__Impl9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__3__Impl_in_rule__Activity__Group_6_0_1__39452 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__4_in_rule__Activity__Group_6_0_1__39455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OffsetAssignment_6_0_1_3_in_rule__Activity__Group_6_0_1__3__Impl9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_0_1__4__Impl_in_rule__Activity__Group_6_0_1__49512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_0_1__4__Impl9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__0__Impl_in_rule__Activity__Group_6_1__09578 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__1_in_rule__Activity__Group_6_1__09581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_6_1_0_in_rule__Activity__Group_6_1__0__Impl9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__1__Impl_in_rule__Activity__Group_6_1__19638 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__2_in_rule__Activity__Group_6_1__19641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Activity__Group_6_1__1__Impl9669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__2__Impl_in_rule__Activity__Group_6_1__29700 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__3_in_rule__Activity__Group_6_1__29703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__CompletenessAssignment_6_1_2_in_rule__Activity__Group_6_1__2__Impl9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__3__Impl_in_rule__Activity__Group_6_1__39760 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__4_in_rule__Activity__Group_6_1__39763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Activity__Group_6_1__3__Impl9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__4__Impl_in_rule__Activity__Group_6_1__49822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1__4__Impl9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__0__Impl_in_rule__Activity__Group_6_1_0_0__09888 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__1_in_rule__Activity__Group_6_1_0_0__09891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Activity__Group_6_1_0_0__0__Impl9919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__1__Impl_in_rule__Activity__Group_6_1_0_0__19950 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__2_in_rule__Activity__Group_6_1_0_0__19953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__EndAssignment_6_1_0_0_1_in_rule__Activity__Group_6_1_0_0__1__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_0__2__Impl_in_rule__Activity__Group_6_1_0_0__210010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_0__2__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__0__Impl_in_rule__Activity__Group_6_1_0_1__010072 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__1_in_rule__Activity__Group_6_1_0_1__010075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Activity__Group_6_1_0_1__0__Impl10103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__1__Impl_in_rule__Activity__Group_6_1_0_1__110134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__2_in_rule__Activity__Group_6_1_0_1__110137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DurationAssignment_6_1_0_1_1_in_rule__Activity__Group_6_1_0_1__1__Impl10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1_0_1__2__Impl_in_rule__Activity__Group_6_1_0_1__210194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_1_0_1__2__Impl10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0__Impl_in_rule__Activity__Group_6_2__010256 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1_in_rule__Activity__Group_6_2__010259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_6_2__0__Impl10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__1__Impl_in_rule__Activity__Group_6_2__110318 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__2_in_rule__Activity__Group_6_2__110321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DependenciesAssignment_6_2_1_in_rule__Activity__Group_6_2__1__Impl10348 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__2__Impl_in_rule__Activity__Group_6_2__210379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6_2__2__Impl10406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__0_in_rule__CheckPoint__UnorderedGroup_510443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Alternatives_5_0_in_rule__CheckPoint__UnorderedGroup_5__Impl10532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_1__0_in_rule__CheckPoint__UnorderedGroup_5__Impl10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_5_2__0_in_rule__CheckPoint__UnorderedGroup_5__Impl10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__010773 = new BitSet(new long[]{0x0000000B04080002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__1_in_rule__CheckPoint__UnorderedGroup_5__010776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__110801 = new BitSet(new long[]{0x0000000B04080002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__2_in_rule__CheckPoint__UnorderedGroup_5__110804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_5__Impl_in_rule__CheckPoint__UnorderedGroup_5__210829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__0_in_rule__Activity__UnorderedGroup_610859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_6_0_in_rule__Activity__UnorderedGroup_6__Impl10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_1__0_in_rule__Activity__UnorderedGroup_6__Impl11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6_2__0_in_rule__Activity__UnorderedGroup_6__Impl11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__011189 = new BitSet(new long[]{0x00000F0204080002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__1_in_rule__Activity__UnorderedGroup_6__011192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__111217 = new BitSet(new long[]{0x00000F0204080002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__2_in_rule__Activity__UnorderedGroup_6__111220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_6__Impl_in_rule__Activity__UnorderedGroup_6__211245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_011279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_111310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Program__LongNameAssignment_0_1_3_111341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_4_011372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_5_111407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_611442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_111473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_011504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_211535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__LongNameAssignment_4_111566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_rule__Project__WbsAssignment_5_011597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_rule__Project__ResourcesAssignment_6_011628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_7_011659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_8_211690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_9_211721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_1011752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_111783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_111814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_011845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_211876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActivityGroup__LongNameAssignment_4_111907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_5_111942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_611977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WBSImport__ImportURIAssignment_112008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourcesImport__ImportURIAssignment_112039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_112070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_012101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_212132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__LongNameAssignment_4_112163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_5_0_0_112194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_5_0_1_112229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_5_0_1_312264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_5_1_112295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_5_2_112330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_012369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_112404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_112435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_012466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_212497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__LongNameAssignment_4_112528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_5_212559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_6_0_0_112590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_6_0_1_112625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_6_0_1_312660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_6_1_0_0_112691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_6_1_0_1_112722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_6_1_212753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_6_2_112788 = new BitSet(new long[]{0x0000000000000002L});

}
