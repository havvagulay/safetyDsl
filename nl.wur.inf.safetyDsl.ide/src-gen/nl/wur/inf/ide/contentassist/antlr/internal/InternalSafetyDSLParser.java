package nl.wur.inf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nl.wur.inf.services.SafetyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSafetyDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Hazard View'", "'{'", "'Elements {'", "'}'", "'Relations {'", "'hazard'", "'safetyRequirement'", "'consequence'", "'fault'", "'faultTree'", "'OR'", "'AND'", "'('", "')'", "'derivedFrom'", "','", "'causes'", "'causedBy'", "'SafetyTacticView'", "'.'", "'faultAvoidance'", "'type='", "'avoidedFaults='", "'faultDetection'", "'detectedFaults='", "'faultContainment'", "'containedFaults='", "'Safety-CriticalView'", "'safety-critical'", "'criticalityLevel='", "'implementedSafetyRequirements='", "'implementedTactics='", "'sub-elements='", "'hasState'", "'A'", "'B'", "'C'", "'D'", "'non-safety-critical'", "'monitor'", "'reads'", "'writes'", "'commands'", "'stops'", "'starts'", "'inits'", "'restarts'", "'monitors'", "'reportsFault'", "'ImplementationRelations {'", "'Module-Class Relations'", "'Class-Test Case Relations'", "'composesOf'", "'='", "'testWith'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSafetyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSafetyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSafetyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSafetyDSL.g"; }


    	private SafetyDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SafetyDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSafetyFramework"
    // InternalSafetyDSL.g:53:1: entryRuleSafetyFramework : ruleSafetyFramework EOF ;
    public final void entryRuleSafetyFramework() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:54:1: ( ruleSafetyFramework EOF )
            // InternalSafetyDSL.g:55:1: ruleSafetyFramework EOF
            {
             before(grammarAccess.getSafetyFrameworkRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyFramework();

            state._fsp--;

             after(grammarAccess.getSafetyFrameworkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyFramework"


    // $ANTLR start "ruleSafetyFramework"
    // InternalSafetyDSL.g:62:1: ruleSafetyFramework : ( ( rule__SafetyFramework__Group__0 ) ) ;
    public final void ruleSafetyFramework() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:66:2: ( ( ( rule__SafetyFramework__Group__0 ) ) )
            // InternalSafetyDSL.g:67:2: ( ( rule__SafetyFramework__Group__0 ) )
            {
            // InternalSafetyDSL.g:67:2: ( ( rule__SafetyFramework__Group__0 ) )
            // InternalSafetyDSL.g:68:3: ( rule__SafetyFramework__Group__0 )
            {
             before(grammarAccess.getSafetyFrameworkAccess().getGroup()); 
            // InternalSafetyDSL.g:69:3: ( rule__SafetyFramework__Group__0 )
            // InternalSafetyDSL.g:69:4: rule__SafetyFramework__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyFramework__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyFrameworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyFramework"


    // $ANTLR start "entryRuleSafetyViewpoint"
    // InternalSafetyDSL.g:78:1: entryRuleSafetyViewpoint : ruleSafetyViewpoint EOF ;
    public final void entryRuleSafetyViewpoint() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:79:1: ( ruleSafetyViewpoint EOF )
            // InternalSafetyDSL.g:80:1: ruleSafetyViewpoint EOF
            {
             before(grammarAccess.getSafetyViewpointRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyViewpoint();

            state._fsp--;

             after(grammarAccess.getSafetyViewpointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyViewpoint"


    // $ANTLR start "ruleSafetyViewpoint"
    // InternalSafetyDSL.g:87:1: ruleSafetyViewpoint : ( ( rule__SafetyViewpoint__Alternatives ) ) ;
    public final void ruleSafetyViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:91:2: ( ( ( rule__SafetyViewpoint__Alternatives ) ) )
            // InternalSafetyDSL.g:92:2: ( ( rule__SafetyViewpoint__Alternatives ) )
            {
            // InternalSafetyDSL.g:92:2: ( ( rule__SafetyViewpoint__Alternatives ) )
            // InternalSafetyDSL.g:93:3: ( rule__SafetyViewpoint__Alternatives )
            {
             before(grammarAccess.getSafetyViewpointAccess().getAlternatives()); 
            // InternalSafetyDSL.g:94:3: ( rule__SafetyViewpoint__Alternatives )
            // InternalSafetyDSL.g:94:4: rule__SafetyViewpoint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SafetyViewpoint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSafetyViewpointAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyViewpoint"


    // $ANTLR start "entryRuleHazardViewpoint"
    // InternalSafetyDSL.g:103:1: entryRuleHazardViewpoint : ruleHazardViewpoint EOF ;
    public final void entryRuleHazardViewpoint() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:104:1: ( ruleHazardViewpoint EOF )
            // InternalSafetyDSL.g:105:1: ruleHazardViewpoint EOF
            {
             before(grammarAccess.getHazardViewpointRule()); 
            pushFollow(FOLLOW_1);
            ruleHazardViewpoint();

            state._fsp--;

             after(grammarAccess.getHazardViewpointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazardViewpoint"


    // $ANTLR start "ruleHazardViewpoint"
    // InternalSafetyDSL.g:112:1: ruleHazardViewpoint : ( ( rule__HazardViewpoint__Group__0 ) ) ;
    public final void ruleHazardViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:116:2: ( ( ( rule__HazardViewpoint__Group__0 ) ) )
            // InternalSafetyDSL.g:117:2: ( ( rule__HazardViewpoint__Group__0 ) )
            {
            // InternalSafetyDSL.g:117:2: ( ( rule__HazardViewpoint__Group__0 ) )
            // InternalSafetyDSL.g:118:3: ( rule__HazardViewpoint__Group__0 )
            {
             before(grammarAccess.getHazardViewpointAccess().getGroup()); 
            // InternalSafetyDSL.g:119:3: ( rule__HazardViewpoint__Group__0 )
            // InternalSafetyDSL.g:119:4: rule__HazardViewpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHazardViewpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHazardViewpoint"


    // $ANTLR start "entryRuleHazardElement"
    // InternalSafetyDSL.g:128:1: entryRuleHazardElement : ruleHazardElement EOF ;
    public final void entryRuleHazardElement() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:129:1: ( ruleHazardElement EOF )
            // InternalSafetyDSL.g:130:1: ruleHazardElement EOF
            {
             before(grammarAccess.getHazardElementRule()); 
            pushFollow(FOLLOW_1);
            ruleHazardElement();

            state._fsp--;

             after(grammarAccess.getHazardElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazardElement"


    // $ANTLR start "ruleHazardElement"
    // InternalSafetyDSL.g:137:1: ruleHazardElement : ( ( rule__HazardElement__Alternatives ) ) ;
    public final void ruleHazardElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:141:2: ( ( ( rule__HazardElement__Alternatives ) ) )
            // InternalSafetyDSL.g:142:2: ( ( rule__HazardElement__Alternatives ) )
            {
            // InternalSafetyDSL.g:142:2: ( ( rule__HazardElement__Alternatives ) )
            // InternalSafetyDSL.g:143:3: ( rule__HazardElement__Alternatives )
            {
             before(grammarAccess.getHazardElementAccess().getAlternatives()); 
            // InternalSafetyDSL.g:144:3: ( rule__HazardElement__Alternatives )
            // InternalSafetyDSL.g:144:4: rule__HazardElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HazardElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHazardElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHazardElement"


    // $ANTLR start "entryRuleHazard"
    // InternalSafetyDSL.g:153:1: entryRuleHazard : ruleHazard EOF ;
    public final void entryRuleHazard() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:154:1: ( ruleHazard EOF )
            // InternalSafetyDSL.g:155:1: ruleHazard EOF
            {
             before(grammarAccess.getHazardRule()); 
            pushFollow(FOLLOW_1);
            ruleHazard();

            state._fsp--;

             after(grammarAccess.getHazardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazard"


    // $ANTLR start "ruleHazard"
    // InternalSafetyDSL.g:162:1: ruleHazard : ( ( rule__Hazard__Group__0 ) ) ;
    public final void ruleHazard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:166:2: ( ( ( rule__Hazard__Group__0 ) ) )
            // InternalSafetyDSL.g:167:2: ( ( rule__Hazard__Group__0 ) )
            {
            // InternalSafetyDSL.g:167:2: ( ( rule__Hazard__Group__0 ) )
            // InternalSafetyDSL.g:168:3: ( rule__Hazard__Group__0 )
            {
             before(grammarAccess.getHazardAccess().getGroup()); 
            // InternalSafetyDSL.g:169:3: ( rule__Hazard__Group__0 )
            // InternalSafetyDSL.g:169:4: rule__Hazard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hazard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHazardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHazard"


    // $ANTLR start "entryRuleSafetyRequirement"
    // InternalSafetyDSL.g:178:1: entryRuleSafetyRequirement : ruleSafetyRequirement EOF ;
    public final void entryRuleSafetyRequirement() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:179:1: ( ruleSafetyRequirement EOF )
            // InternalSafetyDSL.g:180:1: ruleSafetyRequirement EOF
            {
             before(grammarAccess.getSafetyRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyRequirement();

            state._fsp--;

             after(grammarAccess.getSafetyRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyRequirement"


    // $ANTLR start "ruleSafetyRequirement"
    // InternalSafetyDSL.g:187:1: ruleSafetyRequirement : ( ( rule__SafetyRequirement__Group__0 ) ) ;
    public final void ruleSafetyRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:191:2: ( ( ( rule__SafetyRequirement__Group__0 ) ) )
            // InternalSafetyDSL.g:192:2: ( ( rule__SafetyRequirement__Group__0 ) )
            {
            // InternalSafetyDSL.g:192:2: ( ( rule__SafetyRequirement__Group__0 ) )
            // InternalSafetyDSL.g:193:3: ( rule__SafetyRequirement__Group__0 )
            {
             before(grammarAccess.getSafetyRequirementAccess().getGroup()); 
            // InternalSafetyDSL.g:194:3: ( rule__SafetyRequirement__Group__0 )
            // InternalSafetyDSL.g:194:4: rule__SafetyRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyRequirement"


    // $ANTLR start "entryRuleConsequence"
    // InternalSafetyDSL.g:203:1: entryRuleConsequence : ruleConsequence EOF ;
    public final void entryRuleConsequence() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:204:1: ( ruleConsequence EOF )
            // InternalSafetyDSL.g:205:1: ruleConsequence EOF
            {
             before(grammarAccess.getConsequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleConsequence();

            state._fsp--;

             after(grammarAccess.getConsequenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsequence"


    // $ANTLR start "ruleConsequence"
    // InternalSafetyDSL.g:212:1: ruleConsequence : ( ( rule__Consequence__Group__0 ) ) ;
    public final void ruleConsequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:216:2: ( ( ( rule__Consequence__Group__0 ) ) )
            // InternalSafetyDSL.g:217:2: ( ( rule__Consequence__Group__0 ) )
            {
            // InternalSafetyDSL.g:217:2: ( ( rule__Consequence__Group__0 ) )
            // InternalSafetyDSL.g:218:3: ( rule__Consequence__Group__0 )
            {
             before(grammarAccess.getConsequenceAccess().getGroup()); 
            // InternalSafetyDSL.g:219:3: ( rule__Consequence__Group__0 )
            // InternalSafetyDSL.g:219:4: rule__Consequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Consequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConsequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsequence"


    // $ANTLR start "entryRuleFault"
    // InternalSafetyDSL.g:228:1: entryRuleFault : ruleFault EOF ;
    public final void entryRuleFault() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:229:1: ( ruleFault EOF )
            // InternalSafetyDSL.g:230:1: ruleFault EOF
            {
             before(grammarAccess.getFaultRule()); 
            pushFollow(FOLLOW_1);
            ruleFault();

            state._fsp--;

             after(grammarAccess.getFaultRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFault"


    // $ANTLR start "ruleFault"
    // InternalSafetyDSL.g:237:1: ruleFault : ( ( rule__Fault__Group__0 ) ) ;
    public final void ruleFault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:241:2: ( ( ( rule__Fault__Group__0 ) ) )
            // InternalSafetyDSL.g:242:2: ( ( rule__Fault__Group__0 ) )
            {
            // InternalSafetyDSL.g:242:2: ( ( rule__Fault__Group__0 ) )
            // InternalSafetyDSL.g:243:3: ( rule__Fault__Group__0 )
            {
             before(grammarAccess.getFaultAccess().getGroup()); 
            // InternalSafetyDSL.g:244:3: ( rule__Fault__Group__0 )
            // InternalSafetyDSL.g:244:4: rule__Fault__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fault__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFault"


    // $ANTLR start "entryRuleFaultTree"
    // InternalSafetyDSL.g:253:1: entryRuleFaultTree : ruleFaultTree EOF ;
    public final void entryRuleFaultTree() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:254:1: ( ruleFaultTree EOF )
            // InternalSafetyDSL.g:255:1: ruleFaultTree EOF
            {
             before(grammarAccess.getFaultTreeRule()); 
            pushFollow(FOLLOW_1);
            ruleFaultTree();

            state._fsp--;

             after(grammarAccess.getFaultTreeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultTree"


    // $ANTLR start "ruleFaultTree"
    // InternalSafetyDSL.g:262:1: ruleFaultTree : ( ( rule__FaultTree__Group__0 ) ) ;
    public final void ruleFaultTree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:266:2: ( ( ( rule__FaultTree__Group__0 ) ) )
            // InternalSafetyDSL.g:267:2: ( ( rule__FaultTree__Group__0 ) )
            {
            // InternalSafetyDSL.g:267:2: ( ( rule__FaultTree__Group__0 ) )
            // InternalSafetyDSL.g:268:3: ( rule__FaultTree__Group__0 )
            {
             before(grammarAccess.getFaultTreeAccess().getGroup()); 
            // InternalSafetyDSL.g:269:3: ( rule__FaultTree__Group__0 )
            // InternalSafetyDSL.g:269:4: rule__FaultTree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FaultTree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFaultTreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFaultTree"


    // $ANTLR start "entryRuleORNode"
    // InternalSafetyDSL.g:278:1: entryRuleORNode : ruleORNode EOF ;
    public final void entryRuleORNode() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:279:1: ( ruleORNode EOF )
            // InternalSafetyDSL.g:280:1: ruleORNode EOF
            {
             before(grammarAccess.getORNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleORNode();

            state._fsp--;

             after(grammarAccess.getORNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleORNode"


    // $ANTLR start "ruleORNode"
    // InternalSafetyDSL.g:287:1: ruleORNode : ( ( rule__ORNode__Group__0 ) ) ;
    public final void ruleORNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:291:2: ( ( ( rule__ORNode__Group__0 ) ) )
            // InternalSafetyDSL.g:292:2: ( ( rule__ORNode__Group__0 ) )
            {
            // InternalSafetyDSL.g:292:2: ( ( rule__ORNode__Group__0 ) )
            // InternalSafetyDSL.g:293:3: ( rule__ORNode__Group__0 )
            {
             before(grammarAccess.getORNodeAccess().getGroup()); 
            // InternalSafetyDSL.g:294:3: ( rule__ORNode__Group__0 )
            // InternalSafetyDSL.g:294:4: rule__ORNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ORNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleORNode"


    // $ANTLR start "entryRuleANDNode"
    // InternalSafetyDSL.g:303:1: entryRuleANDNode : ruleANDNode EOF ;
    public final void entryRuleANDNode() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:304:1: ( ruleANDNode EOF )
            // InternalSafetyDSL.g:305:1: ruleANDNode EOF
            {
             before(grammarAccess.getANDNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleANDNode();

            state._fsp--;

             after(grammarAccess.getANDNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleANDNode"


    // $ANTLR start "ruleANDNode"
    // InternalSafetyDSL.g:312:1: ruleANDNode : ( ( rule__ANDNode__Group__0 ) ) ;
    public final void ruleANDNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:316:2: ( ( ( rule__ANDNode__Group__0 ) ) )
            // InternalSafetyDSL.g:317:2: ( ( rule__ANDNode__Group__0 ) )
            {
            // InternalSafetyDSL.g:317:2: ( ( rule__ANDNode__Group__0 ) )
            // InternalSafetyDSL.g:318:3: ( rule__ANDNode__Group__0 )
            {
             before(grammarAccess.getANDNodeAccess().getGroup()); 
            // InternalSafetyDSL.g:319:3: ( rule__ANDNode__Group__0 )
            // InternalSafetyDSL.g:319:4: rule__ANDNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ANDNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANDNode"


    // $ANTLR start "entryRulePrimaryNode"
    // InternalSafetyDSL.g:328:1: entryRulePrimaryNode : rulePrimaryNode EOF ;
    public final void entryRulePrimaryNode() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:329:1: ( rulePrimaryNode EOF )
            // InternalSafetyDSL.g:330:1: rulePrimaryNode EOF
            {
             before(grammarAccess.getPrimaryNodeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryNode();

            state._fsp--;

             after(grammarAccess.getPrimaryNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryNode"


    // $ANTLR start "rulePrimaryNode"
    // InternalSafetyDSL.g:337:1: rulePrimaryNode : ( ( rule__PrimaryNode__Alternatives ) ) ;
    public final void rulePrimaryNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:341:2: ( ( ( rule__PrimaryNode__Alternatives ) ) )
            // InternalSafetyDSL.g:342:2: ( ( rule__PrimaryNode__Alternatives ) )
            {
            // InternalSafetyDSL.g:342:2: ( ( rule__PrimaryNode__Alternatives ) )
            // InternalSafetyDSL.g:343:3: ( rule__PrimaryNode__Alternatives )
            {
             before(grammarAccess.getPrimaryNodeAccess().getAlternatives()); 
            // InternalSafetyDSL.g:344:3: ( rule__PrimaryNode__Alternatives )
            // InternalSafetyDSL.g:344:4: rule__PrimaryNode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryNode"


    // $ANTLR start "entryRuleHazardRelation"
    // InternalSafetyDSL.g:353:1: entryRuleHazardRelation : ruleHazardRelation EOF ;
    public final void entryRuleHazardRelation() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:354:1: ( ruleHazardRelation EOF )
            // InternalSafetyDSL.g:355:1: ruleHazardRelation EOF
            {
             before(grammarAccess.getHazardRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleHazardRelation();

            state._fsp--;

             after(grammarAccess.getHazardRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazardRelation"


    // $ANTLR start "ruleHazardRelation"
    // InternalSafetyDSL.g:362:1: ruleHazardRelation : ( ( rule__HazardRelation__Alternatives ) ) ;
    public final void ruleHazardRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:366:2: ( ( ( rule__HazardRelation__Alternatives ) ) )
            // InternalSafetyDSL.g:367:2: ( ( rule__HazardRelation__Alternatives ) )
            {
            // InternalSafetyDSL.g:367:2: ( ( rule__HazardRelation__Alternatives ) )
            // InternalSafetyDSL.g:368:3: ( rule__HazardRelation__Alternatives )
            {
             before(grammarAccess.getHazardRelationAccess().getAlternatives()); 
            // InternalSafetyDSL.g:369:3: ( rule__HazardRelation__Alternatives )
            // InternalSafetyDSL.g:369:4: rule__HazardRelation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HazardRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHazardRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHazardRelation"


    // $ANTLR start "entryRuleDerivedFrom"
    // InternalSafetyDSL.g:378:1: entryRuleDerivedFrom : ruleDerivedFrom EOF ;
    public final void entryRuleDerivedFrom() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:379:1: ( ruleDerivedFrom EOF )
            // InternalSafetyDSL.g:380:1: ruleDerivedFrom EOF
            {
             before(grammarAccess.getDerivedFromRule()); 
            pushFollow(FOLLOW_1);
            ruleDerivedFrom();

            state._fsp--;

             after(grammarAccess.getDerivedFromRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDerivedFrom"


    // $ANTLR start "ruleDerivedFrom"
    // InternalSafetyDSL.g:387:1: ruleDerivedFrom : ( ( rule__DerivedFrom__Group__0 ) ) ;
    public final void ruleDerivedFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:391:2: ( ( ( rule__DerivedFrom__Group__0 ) ) )
            // InternalSafetyDSL.g:392:2: ( ( rule__DerivedFrom__Group__0 ) )
            {
            // InternalSafetyDSL.g:392:2: ( ( rule__DerivedFrom__Group__0 ) )
            // InternalSafetyDSL.g:393:3: ( rule__DerivedFrom__Group__0 )
            {
             before(grammarAccess.getDerivedFromAccess().getGroup()); 
            // InternalSafetyDSL.g:394:3: ( rule__DerivedFrom__Group__0 )
            // InternalSafetyDSL.g:394:4: rule__DerivedFrom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDerivedFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDerivedFrom"


    // $ANTLR start "entryRuleCauses"
    // InternalSafetyDSL.g:403:1: entryRuleCauses : ruleCauses EOF ;
    public final void entryRuleCauses() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:404:1: ( ruleCauses EOF )
            // InternalSafetyDSL.g:405:1: ruleCauses EOF
            {
             before(grammarAccess.getCausesRule()); 
            pushFollow(FOLLOW_1);
            ruleCauses();

            state._fsp--;

             after(grammarAccess.getCausesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCauses"


    // $ANTLR start "ruleCauses"
    // InternalSafetyDSL.g:412:1: ruleCauses : ( ( rule__Causes__Group__0 ) ) ;
    public final void ruleCauses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:416:2: ( ( ( rule__Causes__Group__0 ) ) )
            // InternalSafetyDSL.g:417:2: ( ( rule__Causes__Group__0 ) )
            {
            // InternalSafetyDSL.g:417:2: ( ( rule__Causes__Group__0 ) )
            // InternalSafetyDSL.g:418:3: ( rule__Causes__Group__0 )
            {
             before(grammarAccess.getCausesAccess().getGroup()); 
            // InternalSafetyDSL.g:419:3: ( rule__Causes__Group__0 )
            // InternalSafetyDSL.g:419:4: rule__Causes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Causes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCausesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCauses"


    // $ANTLR start "entryRuleCausedBy"
    // InternalSafetyDSL.g:428:1: entryRuleCausedBy : ruleCausedBy EOF ;
    public final void entryRuleCausedBy() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:429:1: ( ruleCausedBy EOF )
            // InternalSafetyDSL.g:430:1: ruleCausedBy EOF
            {
             before(grammarAccess.getCausedByRule()); 
            pushFollow(FOLLOW_1);
            ruleCausedBy();

            state._fsp--;

             after(grammarAccess.getCausedByRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCausedBy"


    // $ANTLR start "ruleCausedBy"
    // InternalSafetyDSL.g:437:1: ruleCausedBy : ( ( rule__CausedBy__Group__0 ) ) ;
    public final void ruleCausedBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:441:2: ( ( ( rule__CausedBy__Group__0 ) ) )
            // InternalSafetyDSL.g:442:2: ( ( rule__CausedBy__Group__0 ) )
            {
            // InternalSafetyDSL.g:442:2: ( ( rule__CausedBy__Group__0 ) )
            // InternalSafetyDSL.g:443:3: ( rule__CausedBy__Group__0 )
            {
             before(grammarAccess.getCausedByAccess().getGroup()); 
            // InternalSafetyDSL.g:444:3: ( rule__CausedBy__Group__0 )
            // InternalSafetyDSL.g:444:4: rule__CausedBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CausedBy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCausedByAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCausedBy"


    // $ANTLR start "entryRuleSafetyTacticViewpoint"
    // InternalSafetyDSL.g:453:1: entryRuleSafetyTacticViewpoint : ruleSafetyTacticViewpoint EOF ;
    public final void entryRuleSafetyTacticViewpoint() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:454:1: ( ruleSafetyTacticViewpoint EOF )
            // InternalSafetyDSL.g:455:1: ruleSafetyTacticViewpoint EOF
            {
             before(grammarAccess.getSafetyTacticViewpointRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyTacticViewpoint();

            state._fsp--;

             after(grammarAccess.getSafetyTacticViewpointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyTacticViewpoint"


    // $ANTLR start "ruleSafetyTacticViewpoint"
    // InternalSafetyDSL.g:462:1: ruleSafetyTacticViewpoint : ( ( rule__SafetyTacticViewpoint__Group__0 ) ) ;
    public final void ruleSafetyTacticViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:466:2: ( ( ( rule__SafetyTacticViewpoint__Group__0 ) ) )
            // InternalSafetyDSL.g:467:2: ( ( rule__SafetyTacticViewpoint__Group__0 ) )
            {
            // InternalSafetyDSL.g:467:2: ( ( rule__SafetyTacticViewpoint__Group__0 ) )
            // InternalSafetyDSL.g:468:3: ( rule__SafetyTacticViewpoint__Group__0 )
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getGroup()); 
            // InternalSafetyDSL.g:469:3: ( rule__SafetyTacticViewpoint__Group__0 )
            // InternalSafetyDSL.g:469:4: rule__SafetyTacticViewpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyTacticViewpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyTacticViewpoint"


    // $ANTLR start "entryRuleSafetyTactic"
    // InternalSafetyDSL.g:478:1: entryRuleSafetyTactic : ruleSafetyTactic EOF ;
    public final void entryRuleSafetyTactic() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:479:1: ( ruleSafetyTactic EOF )
            // InternalSafetyDSL.g:480:1: ruleSafetyTactic EOF
            {
             before(grammarAccess.getSafetyTacticRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyTactic();

            state._fsp--;

             after(grammarAccess.getSafetyTacticRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyTactic"


    // $ANTLR start "ruleSafetyTactic"
    // InternalSafetyDSL.g:487:1: ruleSafetyTactic : ( ( rule__SafetyTactic__Alternatives ) ) ;
    public final void ruleSafetyTactic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:491:2: ( ( ( rule__SafetyTactic__Alternatives ) ) )
            // InternalSafetyDSL.g:492:2: ( ( rule__SafetyTactic__Alternatives ) )
            {
            // InternalSafetyDSL.g:492:2: ( ( rule__SafetyTactic__Alternatives ) )
            // InternalSafetyDSL.g:493:3: ( rule__SafetyTactic__Alternatives )
            {
             before(grammarAccess.getSafetyTacticAccess().getAlternatives()); 
            // InternalSafetyDSL.g:494:3: ( rule__SafetyTactic__Alternatives )
            // InternalSafetyDSL.g:494:4: rule__SafetyTactic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SafetyTactic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSafetyTacticAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyTactic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSafetyDSL.g:503:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:504:1: ( ruleQualifiedName EOF )
            // InternalSafetyDSL.g:505:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSafetyDSL.g:512:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:516:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSafetyDSL.g:517:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSafetyDSL.g:517:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSafetyDSL.g:518:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSafetyDSL.g:519:3: ( rule__QualifiedName__Group__0 )
            // InternalSafetyDSL.g:519:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleFaultAvoidance"
    // InternalSafetyDSL.g:528:1: entryRuleFaultAvoidance : ruleFaultAvoidance EOF ;
    public final void entryRuleFaultAvoidance() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:529:1: ( ruleFaultAvoidance EOF )
            // InternalSafetyDSL.g:530:1: ruleFaultAvoidance EOF
            {
             before(grammarAccess.getFaultAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleFaultAvoidance();

            state._fsp--;

             after(grammarAccess.getFaultAvoidanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultAvoidance"


    // $ANTLR start "ruleFaultAvoidance"
    // InternalSafetyDSL.g:537:1: ruleFaultAvoidance : ( ( rule__FaultAvoidance__Group__0 ) ) ;
    public final void ruleFaultAvoidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:541:2: ( ( ( rule__FaultAvoidance__Group__0 ) ) )
            // InternalSafetyDSL.g:542:2: ( ( rule__FaultAvoidance__Group__0 ) )
            {
            // InternalSafetyDSL.g:542:2: ( ( rule__FaultAvoidance__Group__0 ) )
            // InternalSafetyDSL.g:543:3: ( rule__FaultAvoidance__Group__0 )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getGroup()); 
            // InternalSafetyDSL.g:544:3: ( rule__FaultAvoidance__Group__0 )
            // InternalSafetyDSL.g:544:4: rule__FaultAvoidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFaultAvoidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFaultAvoidance"


    // $ANTLR start "entryRuleFaultDetection"
    // InternalSafetyDSL.g:553:1: entryRuleFaultDetection : ruleFaultDetection EOF ;
    public final void entryRuleFaultDetection() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:554:1: ( ruleFaultDetection EOF )
            // InternalSafetyDSL.g:555:1: ruleFaultDetection EOF
            {
             before(grammarAccess.getFaultDetectionRule()); 
            pushFollow(FOLLOW_1);
            ruleFaultDetection();

            state._fsp--;

             after(grammarAccess.getFaultDetectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultDetection"


    // $ANTLR start "ruleFaultDetection"
    // InternalSafetyDSL.g:562:1: ruleFaultDetection : ( ( rule__FaultDetection__Group__0 ) ) ;
    public final void ruleFaultDetection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:566:2: ( ( ( rule__FaultDetection__Group__0 ) ) )
            // InternalSafetyDSL.g:567:2: ( ( rule__FaultDetection__Group__0 ) )
            {
            // InternalSafetyDSL.g:567:2: ( ( rule__FaultDetection__Group__0 ) )
            // InternalSafetyDSL.g:568:3: ( rule__FaultDetection__Group__0 )
            {
             before(grammarAccess.getFaultDetectionAccess().getGroup()); 
            // InternalSafetyDSL.g:569:3: ( rule__FaultDetection__Group__0 )
            // InternalSafetyDSL.g:569:4: rule__FaultDetection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFaultDetectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFaultDetection"


    // $ANTLR start "entryRuleFaultContainment"
    // InternalSafetyDSL.g:578:1: entryRuleFaultContainment : ruleFaultContainment EOF ;
    public final void entryRuleFaultContainment() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:579:1: ( ruleFaultContainment EOF )
            // InternalSafetyDSL.g:580:1: ruleFaultContainment EOF
            {
             before(grammarAccess.getFaultContainmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFaultContainment();

            state._fsp--;

             after(grammarAccess.getFaultContainmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultContainment"


    // $ANTLR start "ruleFaultContainment"
    // InternalSafetyDSL.g:587:1: ruleFaultContainment : ( ( rule__FaultContainment__Group__0 ) ) ;
    public final void ruleFaultContainment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:591:2: ( ( ( rule__FaultContainment__Group__0 ) ) )
            // InternalSafetyDSL.g:592:2: ( ( rule__FaultContainment__Group__0 ) )
            {
            // InternalSafetyDSL.g:592:2: ( ( rule__FaultContainment__Group__0 ) )
            // InternalSafetyDSL.g:593:3: ( rule__FaultContainment__Group__0 )
            {
             before(grammarAccess.getFaultContainmentAccess().getGroup()); 
            // InternalSafetyDSL.g:594:3: ( rule__FaultContainment__Group__0 )
            // InternalSafetyDSL.g:594:4: rule__FaultContainment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFaultContainmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFaultContainment"


    // $ANTLR start "entryRuleSafetyCriticalViewpoint"
    // InternalSafetyDSL.g:603:1: entryRuleSafetyCriticalViewpoint : ruleSafetyCriticalViewpoint EOF ;
    public final void entryRuleSafetyCriticalViewpoint() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:604:1: ( ruleSafetyCriticalViewpoint EOF )
            // InternalSafetyDSL.g:605:1: ruleSafetyCriticalViewpoint EOF
            {
             before(grammarAccess.getSafetyCriticalViewpointRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyCriticalViewpoint();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalViewpointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyCriticalViewpoint"


    // $ANTLR start "ruleSafetyCriticalViewpoint"
    // InternalSafetyDSL.g:612:1: ruleSafetyCriticalViewpoint : ( ( rule__SafetyCriticalViewpoint__Group__0 ) ) ;
    public final void ruleSafetyCriticalViewpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:616:2: ( ( ( rule__SafetyCriticalViewpoint__Group__0 ) ) )
            // InternalSafetyDSL.g:617:2: ( ( rule__SafetyCriticalViewpoint__Group__0 ) )
            {
            // InternalSafetyDSL.g:617:2: ( ( rule__SafetyCriticalViewpoint__Group__0 ) )
            // InternalSafetyDSL.g:618:3: ( rule__SafetyCriticalViewpoint__Group__0 )
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getGroup()); 
            // InternalSafetyDSL.g:619:3: ( rule__SafetyCriticalViewpoint__Group__0 )
            // InternalSafetyDSL.g:619:4: rule__SafetyCriticalViewpoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalViewpointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyCriticalViewpoint"


    // $ANTLR start "entryRuleArchitecturalElement"
    // InternalSafetyDSL.g:628:1: entryRuleArchitecturalElement : ruleArchitecturalElement EOF ;
    public final void entryRuleArchitecturalElement() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:629:1: ( ruleArchitecturalElement EOF )
            // InternalSafetyDSL.g:630:1: ruleArchitecturalElement EOF
            {
             before(grammarAccess.getArchitecturalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitecturalElement();

            state._fsp--;

             after(grammarAccess.getArchitecturalElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArchitecturalElement"


    // $ANTLR start "ruleArchitecturalElement"
    // InternalSafetyDSL.g:637:1: ruleArchitecturalElement : ( ( rule__ArchitecturalElement__Alternatives ) ) ;
    public final void ruleArchitecturalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:641:2: ( ( ( rule__ArchitecturalElement__Alternatives ) ) )
            // InternalSafetyDSL.g:642:2: ( ( rule__ArchitecturalElement__Alternatives ) )
            {
            // InternalSafetyDSL.g:642:2: ( ( rule__ArchitecturalElement__Alternatives ) )
            // InternalSafetyDSL.g:643:3: ( rule__ArchitecturalElement__Alternatives )
            {
             before(grammarAccess.getArchitecturalElementAccess().getAlternatives()); 
            // InternalSafetyDSL.g:644:3: ( rule__ArchitecturalElement__Alternatives )
            // InternalSafetyDSL.g:644:4: rule__ArchitecturalElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArchitecturalElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArchitecturalElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitecturalElement"


    // $ANTLR start "entryRuleSafetyCritical"
    // InternalSafetyDSL.g:653:1: entryRuleSafetyCritical : ruleSafetyCritical EOF ;
    public final void entryRuleSafetyCritical() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:654:1: ( ruleSafetyCritical EOF )
            // InternalSafetyDSL.g:655:1: ruleSafetyCritical EOF
            {
             before(grammarAccess.getSafetyCriticalRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyCritical();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyCritical"


    // $ANTLR start "ruleSafetyCritical"
    // InternalSafetyDSL.g:662:1: ruleSafetyCritical : ( ( rule__SafetyCritical__Group__0 ) ) ;
    public final void ruleSafetyCritical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:666:2: ( ( ( rule__SafetyCritical__Group__0 ) ) )
            // InternalSafetyDSL.g:667:2: ( ( rule__SafetyCritical__Group__0 ) )
            {
            // InternalSafetyDSL.g:667:2: ( ( rule__SafetyCritical__Group__0 ) )
            // InternalSafetyDSL.g:668:3: ( rule__SafetyCritical__Group__0 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup()); 
            // InternalSafetyDSL.g:669:3: ( rule__SafetyCritical__Group__0 )
            // InternalSafetyDSL.g:669:4: rule__SafetyCritical__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyCritical"


    // $ANTLR start "entryRuleCriticalityLevel"
    // InternalSafetyDSL.g:678:1: entryRuleCriticalityLevel : ruleCriticalityLevel EOF ;
    public final void entryRuleCriticalityLevel() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:679:1: ( ruleCriticalityLevel EOF )
            // InternalSafetyDSL.g:680:1: ruleCriticalityLevel EOF
            {
             before(grammarAccess.getCriticalityLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleCriticalityLevel();

            state._fsp--;

             after(grammarAccess.getCriticalityLevelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCriticalityLevel"


    // $ANTLR start "ruleCriticalityLevel"
    // InternalSafetyDSL.g:687:1: ruleCriticalityLevel : ( ( rule__CriticalityLevel__Alternatives ) ) ;
    public final void ruleCriticalityLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:691:2: ( ( ( rule__CriticalityLevel__Alternatives ) ) )
            // InternalSafetyDSL.g:692:2: ( ( rule__CriticalityLevel__Alternatives ) )
            {
            // InternalSafetyDSL.g:692:2: ( ( rule__CriticalityLevel__Alternatives ) )
            // InternalSafetyDSL.g:693:3: ( rule__CriticalityLevel__Alternatives )
            {
             before(grammarAccess.getCriticalityLevelAccess().getAlternatives()); 
            // InternalSafetyDSL.g:694:3: ( rule__CriticalityLevel__Alternatives )
            // InternalSafetyDSL.g:694:4: rule__CriticalityLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCriticalityLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCriticalityLevel"


    // $ANTLR start "entryRuleNonSafetyCritical"
    // InternalSafetyDSL.g:703:1: entryRuleNonSafetyCritical : ruleNonSafetyCritical EOF ;
    public final void entryRuleNonSafetyCritical() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:704:1: ( ruleNonSafetyCritical EOF )
            // InternalSafetyDSL.g:705:1: ruleNonSafetyCritical EOF
            {
             before(grammarAccess.getNonSafetyCriticalRule()); 
            pushFollow(FOLLOW_1);
            ruleNonSafetyCritical();

            state._fsp--;

             after(grammarAccess.getNonSafetyCriticalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonSafetyCritical"


    // $ANTLR start "ruleNonSafetyCritical"
    // InternalSafetyDSL.g:712:1: ruleNonSafetyCritical : ( ( rule__NonSafetyCritical__Group__0 ) ) ;
    public final void ruleNonSafetyCritical() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:716:2: ( ( ( rule__NonSafetyCritical__Group__0 ) ) )
            // InternalSafetyDSL.g:717:2: ( ( rule__NonSafetyCritical__Group__0 ) )
            {
            // InternalSafetyDSL.g:717:2: ( ( rule__NonSafetyCritical__Group__0 ) )
            // InternalSafetyDSL.g:718:3: ( rule__NonSafetyCritical__Group__0 )
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getGroup()); 
            // InternalSafetyDSL.g:719:3: ( rule__NonSafetyCritical__Group__0 )
            // InternalSafetyDSL.g:719:4: rule__NonSafetyCritical__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonSafetyCriticalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonSafetyCritical"


    // $ANTLR start "entryRuleMonitor"
    // InternalSafetyDSL.g:728:1: entryRuleMonitor : ruleMonitor EOF ;
    public final void entryRuleMonitor() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:729:1: ( ruleMonitor EOF )
            // InternalSafetyDSL.g:730:1: ruleMonitor EOF
            {
             before(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitor();

            state._fsp--;

             after(grammarAccess.getMonitorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalSafetyDSL.g:737:1: ruleMonitor : ( ( rule__Monitor__Group__0 ) ) ;
    public final void ruleMonitor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:741:2: ( ( ( rule__Monitor__Group__0 ) ) )
            // InternalSafetyDSL.g:742:2: ( ( rule__Monitor__Group__0 ) )
            {
            // InternalSafetyDSL.g:742:2: ( ( rule__Monitor__Group__0 ) )
            // InternalSafetyDSL.g:743:3: ( rule__Monitor__Group__0 )
            {
             before(grammarAccess.getMonitorAccess().getGroup()); 
            // InternalSafetyDSL.g:744:3: ( rule__Monitor__Group__0 )
            // InternalSafetyDSL.g:744:4: rule__Monitor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "entryRuleSafetyCriticalRelation"
    // InternalSafetyDSL.g:753:1: entryRuleSafetyCriticalRelation : ruleSafetyCriticalRelation EOF ;
    public final void entryRuleSafetyCriticalRelation() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:754:1: ( ruleSafetyCriticalRelation EOF )
            // InternalSafetyDSL.g:755:1: ruleSafetyCriticalRelation EOF
            {
             before(grammarAccess.getSafetyCriticalRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyCriticalRelation();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyCriticalRelation"


    // $ANTLR start "ruleSafetyCriticalRelation"
    // InternalSafetyDSL.g:762:1: ruleSafetyCriticalRelation : ( ( rule__SafetyCriticalRelation__Alternatives ) ) ;
    public final void ruleSafetyCriticalRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:766:2: ( ( ( rule__SafetyCriticalRelation__Alternatives ) ) )
            // InternalSafetyDSL.g:767:2: ( ( rule__SafetyCriticalRelation__Alternatives ) )
            {
            // InternalSafetyDSL.g:767:2: ( ( rule__SafetyCriticalRelation__Alternatives ) )
            // InternalSafetyDSL.g:768:3: ( rule__SafetyCriticalRelation__Alternatives )
            {
             before(grammarAccess.getSafetyCriticalRelationAccess().getAlternatives()); 
            // InternalSafetyDSL.g:769:3: ( rule__SafetyCriticalRelation__Alternatives )
            // InternalSafetyDSL.g:769:4: rule__SafetyCriticalRelation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCriticalRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyCriticalRelation"


    // $ANTLR start "entryRuleArchElementToArchElement"
    // InternalSafetyDSL.g:778:1: entryRuleArchElementToArchElement : ruleArchElementToArchElement EOF ;
    public final void entryRuleArchElementToArchElement() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:779:1: ( ruleArchElementToArchElement EOF )
            // InternalSafetyDSL.g:780:1: ruleArchElementToArchElement EOF
            {
             before(grammarAccess.getArchElementToArchElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArchElementToArchElement();

            state._fsp--;

             after(grammarAccess.getArchElementToArchElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArchElementToArchElement"


    // $ANTLR start "ruleArchElementToArchElement"
    // InternalSafetyDSL.g:787:1: ruleArchElementToArchElement : ( ( rule__ArchElementToArchElement__Alternatives ) ) ;
    public final void ruleArchElementToArchElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:791:2: ( ( ( rule__ArchElementToArchElement__Alternatives ) ) )
            // InternalSafetyDSL.g:792:2: ( ( rule__ArchElementToArchElement__Alternatives ) )
            {
            // InternalSafetyDSL.g:792:2: ( ( rule__ArchElementToArchElement__Alternatives ) )
            // InternalSafetyDSL.g:793:3: ( rule__ArchElementToArchElement__Alternatives )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getAlternatives()); 
            // InternalSafetyDSL.g:794:3: ( rule__ArchElementToArchElement__Alternatives )
            // InternalSafetyDSL.g:794:4: rule__ArchElementToArchElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchElementToArchElement"


    // $ANTLR start "entryRuleMonitorToArchitecturalElement"
    // InternalSafetyDSL.g:803:1: entryRuleMonitorToArchitecturalElement : ruleMonitorToArchitecturalElement EOF ;
    public final void entryRuleMonitorToArchitecturalElement() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:804:1: ( ruleMonitorToArchitecturalElement EOF )
            // InternalSafetyDSL.g:805:1: ruleMonitorToArchitecturalElement EOF
            {
             before(grammarAccess.getMonitorToArchitecturalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitorToArchitecturalElement();

            state._fsp--;

             after(grammarAccess.getMonitorToArchitecturalElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMonitorToArchitecturalElement"


    // $ANTLR start "ruleMonitorToArchitecturalElement"
    // InternalSafetyDSL.g:812:1: ruleMonitorToArchitecturalElement : ( ( rule__MonitorToArchitecturalElement__Alternatives ) ) ;
    public final void ruleMonitorToArchitecturalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:816:2: ( ( ( rule__MonitorToArchitecturalElement__Alternatives ) ) )
            // InternalSafetyDSL.g:817:2: ( ( rule__MonitorToArchitecturalElement__Alternatives ) )
            {
            // InternalSafetyDSL.g:817:2: ( ( rule__MonitorToArchitecturalElement__Alternatives ) )
            // InternalSafetyDSL.g:818:3: ( rule__MonitorToArchitecturalElement__Alternatives )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getAlternatives()); 
            // InternalSafetyDSL.g:819:3: ( rule__MonitorToArchitecturalElement__Alternatives )
            // InternalSafetyDSL.g:819:4: rule__MonitorToArchitecturalElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitorToArchitecturalElement"


    // $ANTLR start "entryRuleReportsFault"
    // InternalSafetyDSL.g:828:1: entryRuleReportsFault : ruleReportsFault EOF ;
    public final void entryRuleReportsFault() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:829:1: ( ruleReportsFault EOF )
            // InternalSafetyDSL.g:830:1: ruleReportsFault EOF
            {
             before(grammarAccess.getReportsFaultRule()); 
            pushFollow(FOLLOW_1);
            ruleReportsFault();

            state._fsp--;

             after(grammarAccess.getReportsFaultRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReportsFault"


    // $ANTLR start "ruleReportsFault"
    // InternalSafetyDSL.g:837:1: ruleReportsFault : ( ( rule__ReportsFault__Group__0 ) ) ;
    public final void ruleReportsFault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:841:2: ( ( ( rule__ReportsFault__Group__0 ) ) )
            // InternalSafetyDSL.g:842:2: ( ( rule__ReportsFault__Group__0 ) )
            {
            // InternalSafetyDSL.g:842:2: ( ( rule__ReportsFault__Group__0 ) )
            // InternalSafetyDSL.g:843:3: ( rule__ReportsFault__Group__0 )
            {
             before(grammarAccess.getReportsFaultAccess().getGroup()); 
            // InternalSafetyDSL.g:844:3: ( rule__ReportsFault__Group__0 )
            // InternalSafetyDSL.g:844:4: rule__ReportsFault__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReportsFaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReportsFault"


    // $ANTLR start "entryRuleImplementationDetail"
    // InternalSafetyDSL.g:853:1: entryRuleImplementationDetail : ruleImplementationDetail EOF ;
    public final void entryRuleImplementationDetail() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:854:1: ( ruleImplementationDetail EOF )
            // InternalSafetyDSL.g:855:1: ruleImplementationDetail EOF
            {
             before(grammarAccess.getImplementationDetailRule()); 
            pushFollow(FOLLOW_1);
            ruleImplementationDetail();

            state._fsp--;

             after(grammarAccess.getImplementationDetailRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplementationDetail"


    // $ANTLR start "ruleImplementationDetail"
    // InternalSafetyDSL.g:862:1: ruleImplementationDetail : ( ( rule__ImplementationDetail__Group__0 ) ) ;
    public final void ruleImplementationDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:866:2: ( ( ( rule__ImplementationDetail__Group__0 ) ) )
            // InternalSafetyDSL.g:867:2: ( ( rule__ImplementationDetail__Group__0 ) )
            {
            // InternalSafetyDSL.g:867:2: ( ( rule__ImplementationDetail__Group__0 ) )
            // InternalSafetyDSL.g:868:3: ( rule__ImplementationDetail__Group__0 )
            {
             before(grammarAccess.getImplementationDetailAccess().getGroup()); 
            // InternalSafetyDSL.g:869:3: ( rule__ImplementationDetail__Group__0 )
            // InternalSafetyDSL.g:869:4: rule__ImplementationDetail__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplementationDetailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplementationDetail"


    // $ANTLR start "entryRuleModuleClassRelation"
    // InternalSafetyDSL.g:878:1: entryRuleModuleClassRelation : ruleModuleClassRelation EOF ;
    public final void entryRuleModuleClassRelation() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:879:1: ( ruleModuleClassRelation EOF )
            // InternalSafetyDSL.g:880:1: ruleModuleClassRelation EOF
            {
             before(grammarAccess.getModuleClassRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleClassRelation();

            state._fsp--;

             after(grammarAccess.getModuleClassRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModuleClassRelation"


    // $ANTLR start "ruleModuleClassRelation"
    // InternalSafetyDSL.g:887:1: ruleModuleClassRelation : ( ( rule__ModuleClassRelation__Group__0 ) ) ;
    public final void ruleModuleClassRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:891:2: ( ( ( rule__ModuleClassRelation__Group__0 ) ) )
            // InternalSafetyDSL.g:892:2: ( ( rule__ModuleClassRelation__Group__0 ) )
            {
            // InternalSafetyDSL.g:892:2: ( ( rule__ModuleClassRelation__Group__0 ) )
            // InternalSafetyDSL.g:893:3: ( rule__ModuleClassRelation__Group__0 )
            {
             before(grammarAccess.getModuleClassRelationAccess().getGroup()); 
            // InternalSafetyDSL.g:894:3: ( rule__ModuleClassRelation__Group__0 )
            // InternalSafetyDSL.g:894:4: rule__ModuleClassRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleClassRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleClassRelation"


    // $ANTLR start "entryRuleClassTestCaseRelation"
    // InternalSafetyDSL.g:903:1: entryRuleClassTestCaseRelation : ruleClassTestCaseRelation EOF ;
    public final void entryRuleClassTestCaseRelation() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:904:1: ( ruleClassTestCaseRelation EOF )
            // InternalSafetyDSL.g:905:1: ruleClassTestCaseRelation EOF
            {
             before(grammarAccess.getClassTestCaseRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassTestCaseRelation();

            state._fsp--;

             after(grammarAccess.getClassTestCaseRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassTestCaseRelation"


    // $ANTLR start "ruleClassTestCaseRelation"
    // InternalSafetyDSL.g:912:1: ruleClassTestCaseRelation : ( ( rule__ClassTestCaseRelation__Group__0 ) ) ;
    public final void ruleClassTestCaseRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:916:2: ( ( ( rule__ClassTestCaseRelation__Group__0 ) ) )
            // InternalSafetyDSL.g:917:2: ( ( rule__ClassTestCaseRelation__Group__0 ) )
            {
            // InternalSafetyDSL.g:917:2: ( ( rule__ClassTestCaseRelation__Group__0 ) )
            // InternalSafetyDSL.g:918:3: ( rule__ClassTestCaseRelation__Group__0 )
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getGroup()); 
            // InternalSafetyDSL.g:919:3: ( rule__ClassTestCaseRelation__Group__0 )
            // InternalSafetyDSL.g:919:4: rule__ClassTestCaseRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassTestCaseRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassTestCaseRelation"


    // $ANTLR start "entryRuleClassDef"
    // InternalSafetyDSL.g:928:1: entryRuleClassDef : ruleClassDef EOF ;
    public final void entryRuleClassDef() throws RecognitionException {
        try {
            // InternalSafetyDSL.g:929:1: ( ruleClassDef EOF )
            // InternalSafetyDSL.g:930:1: ruleClassDef EOF
            {
             before(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDef();

            state._fsp--;

             after(grammarAccess.getClassDefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDef"


    // $ANTLR start "ruleClassDef"
    // InternalSafetyDSL.g:937:1: ruleClassDef : ( ( rule__ClassDef__NameAssignment ) ) ;
    public final void ruleClassDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:941:2: ( ( ( rule__ClassDef__NameAssignment ) ) )
            // InternalSafetyDSL.g:942:2: ( ( rule__ClassDef__NameAssignment ) )
            {
            // InternalSafetyDSL.g:942:2: ( ( rule__ClassDef__NameAssignment ) )
            // InternalSafetyDSL.g:943:3: ( rule__ClassDef__NameAssignment )
            {
             before(grammarAccess.getClassDefAccess().getNameAssignment()); 
            // InternalSafetyDSL.g:944:3: ( rule__ClassDef__NameAssignment )
            // InternalSafetyDSL.g:944:4: rule__ClassDef__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassDefAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDef"


    // $ANTLR start "rule__SafetyViewpoint__Alternatives"
    // InternalSafetyDSL.g:952:1: rule__SafetyViewpoint__Alternatives : ( ( ruleHazardViewpoint ) | ( ruleSafetyTacticViewpoint ) | ( ruleSafetyCriticalViewpoint ) );
    public final void rule__SafetyViewpoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:956:1: ( ( ruleHazardViewpoint ) | ( ruleSafetyTacticViewpoint ) | ( ruleSafetyCriticalViewpoint ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 39:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSafetyDSL.g:957:2: ( ruleHazardViewpoint )
                    {
                    // InternalSafetyDSL.g:957:2: ( ruleHazardViewpoint )
                    // InternalSafetyDSL.g:958:3: ruleHazardViewpoint
                    {
                     before(grammarAccess.getSafetyViewpointAccess().getHazardViewpointParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHazardViewpoint();

                    state._fsp--;

                     after(grammarAccess.getSafetyViewpointAccess().getHazardViewpointParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:963:2: ( ruleSafetyTacticViewpoint )
                    {
                    // InternalSafetyDSL.g:963:2: ( ruleSafetyTacticViewpoint )
                    // InternalSafetyDSL.g:964:3: ruleSafetyTacticViewpoint
                    {
                     before(grammarAccess.getSafetyViewpointAccess().getSafetyTacticViewpointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSafetyTacticViewpoint();

                    state._fsp--;

                     after(grammarAccess.getSafetyViewpointAccess().getSafetyTacticViewpointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:969:2: ( ruleSafetyCriticalViewpoint )
                    {
                    // InternalSafetyDSL.g:969:2: ( ruleSafetyCriticalViewpoint )
                    // InternalSafetyDSL.g:970:3: ruleSafetyCriticalViewpoint
                    {
                     before(grammarAccess.getSafetyViewpointAccess().getSafetyCriticalViewpointParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSafetyCriticalViewpoint();

                    state._fsp--;

                     after(grammarAccess.getSafetyViewpointAccess().getSafetyCriticalViewpointParserRuleCall_2()); 

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
    // $ANTLR end "rule__SafetyViewpoint__Alternatives"


    // $ANTLR start "rule__HazardElement__Alternatives"
    // InternalSafetyDSL.g:979:1: rule__HazardElement__Alternatives : ( ( ruleHazard ) | ( ruleSafetyRequirement ) | ( ruleConsequence ) | ( ruleFault ) | ( ruleFaultTree ) );
    public final void rule__HazardElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:983:1: ( ( ruleHazard ) | ( ruleSafetyRequirement ) | ( ruleConsequence ) | ( ruleFault ) | ( ruleFaultTree ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSafetyDSL.g:984:2: ( ruleHazard )
                    {
                    // InternalSafetyDSL.g:984:2: ( ruleHazard )
                    // InternalSafetyDSL.g:985:3: ruleHazard
                    {
                     before(grammarAccess.getHazardElementAccess().getHazardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHazard();

                    state._fsp--;

                     after(grammarAccess.getHazardElementAccess().getHazardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:990:2: ( ruleSafetyRequirement )
                    {
                    // InternalSafetyDSL.g:990:2: ( ruleSafetyRequirement )
                    // InternalSafetyDSL.g:991:3: ruleSafetyRequirement
                    {
                     before(grammarAccess.getHazardElementAccess().getSafetyRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSafetyRequirement();

                    state._fsp--;

                     after(grammarAccess.getHazardElementAccess().getSafetyRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:996:2: ( ruleConsequence )
                    {
                    // InternalSafetyDSL.g:996:2: ( ruleConsequence )
                    // InternalSafetyDSL.g:997:3: ruleConsequence
                    {
                     before(grammarAccess.getHazardElementAccess().getConsequenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConsequence();

                    state._fsp--;

                     after(grammarAccess.getHazardElementAccess().getConsequenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSafetyDSL.g:1002:2: ( ruleFault )
                    {
                    // InternalSafetyDSL.g:1002:2: ( ruleFault )
                    // InternalSafetyDSL.g:1003:3: ruleFault
                    {
                     before(grammarAccess.getHazardElementAccess().getFaultParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFault();

                    state._fsp--;

                     after(grammarAccess.getHazardElementAccess().getFaultParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSafetyDSL.g:1008:2: ( ruleFaultTree )
                    {
                    // InternalSafetyDSL.g:1008:2: ( ruleFaultTree )
                    // InternalSafetyDSL.g:1009:3: ruleFaultTree
                    {
                     before(grammarAccess.getHazardElementAccess().getFaultTreeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFaultTree();

                    state._fsp--;

                     after(grammarAccess.getHazardElementAccess().getFaultTreeParserRuleCall_4()); 

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
    // $ANTLR end "rule__HazardElement__Alternatives"


    // $ANTLR start "rule__PrimaryNode__Alternatives"
    // InternalSafetyDSL.g:1018:1: rule__PrimaryNode__Alternatives : ( ( ( rule__PrimaryNode__ValueAssignment_0 ) ) | ( ( rule__PrimaryNode__Group_1__0 ) ) );
    public final void rule__PrimaryNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1022:1: ( ( ( rule__PrimaryNode__ValueAssignment_0 ) ) | ( ( rule__PrimaryNode__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSafetyDSL.g:1023:2: ( ( rule__PrimaryNode__ValueAssignment_0 ) )
                    {
                    // InternalSafetyDSL.g:1023:2: ( ( rule__PrimaryNode__ValueAssignment_0 ) )
                    // InternalSafetyDSL.g:1024:3: ( rule__PrimaryNode__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryNodeAccess().getValueAssignment_0()); 
                    // InternalSafetyDSL.g:1025:3: ( rule__PrimaryNode__ValueAssignment_0 )
                    // InternalSafetyDSL.g:1025:4: rule__PrimaryNode__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryNode__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryNodeAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1029:2: ( ( rule__PrimaryNode__Group_1__0 ) )
                    {
                    // InternalSafetyDSL.g:1029:2: ( ( rule__PrimaryNode__Group_1__0 ) )
                    // InternalSafetyDSL.g:1030:3: ( rule__PrimaryNode__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryNodeAccess().getGroup_1()); 
                    // InternalSafetyDSL.g:1031:3: ( rule__PrimaryNode__Group_1__0 )
                    // InternalSafetyDSL.g:1031:4: rule__PrimaryNode__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryNode__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryNodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PrimaryNode__Alternatives"


    // $ANTLR start "rule__HazardRelation__Alternatives"
    // InternalSafetyDSL.g:1039:1: rule__HazardRelation__Alternatives : ( ( ruleDerivedFrom ) | ( ruleCauses ) | ( ruleCausedBy ) );
    public final void rule__HazardRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1043:1: ( ( ruleDerivedFrom ) | ( ruleCauses ) | ( ruleCausedBy ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt4=3;
                    }
                    break;
                case 28:
                    {
                    alt4=2;
                    }
                    break;
                case 26:
                case 27:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSafetyDSL.g:1044:2: ( ruleDerivedFrom )
                    {
                    // InternalSafetyDSL.g:1044:2: ( ruleDerivedFrom )
                    // InternalSafetyDSL.g:1045:3: ruleDerivedFrom
                    {
                     before(grammarAccess.getHazardRelationAccess().getDerivedFromParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDerivedFrom();

                    state._fsp--;

                     after(grammarAccess.getHazardRelationAccess().getDerivedFromParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1050:2: ( ruleCauses )
                    {
                    // InternalSafetyDSL.g:1050:2: ( ruleCauses )
                    // InternalSafetyDSL.g:1051:3: ruleCauses
                    {
                     before(grammarAccess.getHazardRelationAccess().getCausesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCauses();

                    state._fsp--;

                     after(grammarAccess.getHazardRelationAccess().getCausesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1056:2: ( ruleCausedBy )
                    {
                    // InternalSafetyDSL.g:1056:2: ( ruleCausedBy )
                    // InternalSafetyDSL.g:1057:3: ruleCausedBy
                    {
                     before(grammarAccess.getHazardRelationAccess().getCausedByParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCausedBy();

                    state._fsp--;

                     after(grammarAccess.getHazardRelationAccess().getCausedByParserRuleCall_2()); 

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
    // $ANTLR end "rule__HazardRelation__Alternatives"


    // $ANTLR start "rule__SafetyTactic__Alternatives"
    // InternalSafetyDSL.g:1066:1: rule__SafetyTactic__Alternatives : ( ( ruleFaultContainment ) | ( ruleFaultAvoidance ) | ( ruleFaultDetection ) );
    public final void rule__SafetyTactic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1070:1: ( ( ruleFaultContainment ) | ( ruleFaultAvoidance ) | ( ruleFaultDetection ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSafetyDSL.g:1071:2: ( ruleFaultContainment )
                    {
                    // InternalSafetyDSL.g:1071:2: ( ruleFaultContainment )
                    // InternalSafetyDSL.g:1072:3: ruleFaultContainment
                    {
                     before(grammarAccess.getSafetyTacticAccess().getFaultContainmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFaultContainment();

                    state._fsp--;

                     after(grammarAccess.getSafetyTacticAccess().getFaultContainmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1077:2: ( ruleFaultAvoidance )
                    {
                    // InternalSafetyDSL.g:1077:2: ( ruleFaultAvoidance )
                    // InternalSafetyDSL.g:1078:3: ruleFaultAvoidance
                    {
                     before(grammarAccess.getSafetyTacticAccess().getFaultAvoidanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFaultAvoidance();

                    state._fsp--;

                     after(grammarAccess.getSafetyTacticAccess().getFaultAvoidanceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1083:2: ( ruleFaultDetection )
                    {
                    // InternalSafetyDSL.g:1083:2: ( ruleFaultDetection )
                    // InternalSafetyDSL.g:1084:3: ruleFaultDetection
                    {
                     before(grammarAccess.getSafetyTacticAccess().getFaultDetectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFaultDetection();

                    state._fsp--;

                     after(grammarAccess.getSafetyTacticAccess().getFaultDetectionParserRuleCall_2()); 

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
    // $ANTLR end "rule__SafetyTactic__Alternatives"


    // $ANTLR start "rule__ArchitecturalElement__Alternatives"
    // InternalSafetyDSL.g:1093:1: rule__ArchitecturalElement__Alternatives : ( ( ruleSafetyCritical ) | ( ruleNonSafetyCritical ) | ( ruleMonitor ) );
    public final void rule__ArchitecturalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1097:1: ( ( ruleSafetyCritical ) | ( ruleNonSafetyCritical ) | ( ruleMonitor ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt6=1;
                }
                break;
            case 50:
                {
                alt6=2;
                }
                break;
            case 51:
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
                    // InternalSafetyDSL.g:1098:2: ( ruleSafetyCritical )
                    {
                    // InternalSafetyDSL.g:1098:2: ( ruleSafetyCritical )
                    // InternalSafetyDSL.g:1099:3: ruleSafetyCritical
                    {
                     before(grammarAccess.getArchitecturalElementAccess().getSafetyCriticalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSafetyCritical();

                    state._fsp--;

                     after(grammarAccess.getArchitecturalElementAccess().getSafetyCriticalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1104:2: ( ruleNonSafetyCritical )
                    {
                    // InternalSafetyDSL.g:1104:2: ( ruleNonSafetyCritical )
                    // InternalSafetyDSL.g:1105:3: ruleNonSafetyCritical
                    {
                     before(grammarAccess.getArchitecturalElementAccess().getNonSafetyCriticalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonSafetyCritical();

                    state._fsp--;

                     after(grammarAccess.getArchitecturalElementAccess().getNonSafetyCriticalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1110:2: ( ruleMonitor )
                    {
                    // InternalSafetyDSL.g:1110:2: ( ruleMonitor )
                    // InternalSafetyDSL.g:1111:3: ruleMonitor
                    {
                     before(grammarAccess.getArchitecturalElementAccess().getMonitorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMonitor();

                    state._fsp--;

                     after(grammarAccess.getArchitecturalElementAccess().getMonitorParserRuleCall_2()); 

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
    // $ANTLR end "rule__ArchitecturalElement__Alternatives"


    // $ANTLR start "rule__CriticalityLevel__Alternatives"
    // InternalSafetyDSL.g:1120:1: rule__CriticalityLevel__Alternatives : ( ( ( rule__CriticalityLevel__Group_0__0 ) ) | ( ( rule__CriticalityLevel__Group_1__0 ) ) | ( ( rule__CriticalityLevel__Group_2__0 ) ) | ( ( rule__CriticalityLevel__Group_3__0 ) ) );
    public final void rule__CriticalityLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1124:1: ( ( ( rule__CriticalityLevel__Group_0__0 ) ) | ( ( rule__CriticalityLevel__Group_1__0 ) ) | ( ( rule__CriticalityLevel__Group_2__0 ) ) | ( ( rule__CriticalityLevel__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt7=1;
                }
                break;
            case 47:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            case 49:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSafetyDSL.g:1125:2: ( ( rule__CriticalityLevel__Group_0__0 ) )
                    {
                    // InternalSafetyDSL.g:1125:2: ( ( rule__CriticalityLevel__Group_0__0 ) )
                    // InternalSafetyDSL.g:1126:3: ( rule__CriticalityLevel__Group_0__0 )
                    {
                     before(grammarAccess.getCriticalityLevelAccess().getGroup_0()); 
                    // InternalSafetyDSL.g:1127:3: ( rule__CriticalityLevel__Group_0__0 )
                    // InternalSafetyDSL.g:1127:4: rule__CriticalityLevel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriticalityLevel__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCriticalityLevelAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1131:2: ( ( rule__CriticalityLevel__Group_1__0 ) )
                    {
                    // InternalSafetyDSL.g:1131:2: ( ( rule__CriticalityLevel__Group_1__0 ) )
                    // InternalSafetyDSL.g:1132:3: ( rule__CriticalityLevel__Group_1__0 )
                    {
                     before(grammarAccess.getCriticalityLevelAccess().getGroup_1()); 
                    // InternalSafetyDSL.g:1133:3: ( rule__CriticalityLevel__Group_1__0 )
                    // InternalSafetyDSL.g:1133:4: rule__CriticalityLevel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriticalityLevel__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCriticalityLevelAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1137:2: ( ( rule__CriticalityLevel__Group_2__0 ) )
                    {
                    // InternalSafetyDSL.g:1137:2: ( ( rule__CriticalityLevel__Group_2__0 ) )
                    // InternalSafetyDSL.g:1138:3: ( rule__CriticalityLevel__Group_2__0 )
                    {
                     before(grammarAccess.getCriticalityLevelAccess().getGroup_2()); 
                    // InternalSafetyDSL.g:1139:3: ( rule__CriticalityLevel__Group_2__0 )
                    // InternalSafetyDSL.g:1139:4: rule__CriticalityLevel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriticalityLevel__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCriticalityLevelAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSafetyDSL.g:1143:2: ( ( rule__CriticalityLevel__Group_3__0 ) )
                    {
                    // InternalSafetyDSL.g:1143:2: ( ( rule__CriticalityLevel__Group_3__0 ) )
                    // InternalSafetyDSL.g:1144:3: ( rule__CriticalityLevel__Group_3__0 )
                    {
                     before(grammarAccess.getCriticalityLevelAccess().getGroup_3()); 
                    // InternalSafetyDSL.g:1145:3: ( rule__CriticalityLevel__Group_3__0 )
                    // InternalSafetyDSL.g:1145:4: rule__CriticalityLevel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CriticalityLevel__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCriticalityLevelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CriticalityLevel__Alternatives"


    // $ANTLR start "rule__NonSafetyCritical__Alternatives_2"
    // InternalSafetyDSL.g:1153:1: rule__NonSafetyCritical__Alternatives_2 : ( ( ( rule__NonSafetyCritical__Group_2_0__0 ) ) | ( ';' ) );
    public final void rule__NonSafetyCritical__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1157:1: ( ( ( rule__NonSafetyCritical__Group_2_0__0 ) ) | ( ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSafetyDSL.g:1158:2: ( ( rule__NonSafetyCritical__Group_2_0__0 ) )
                    {
                    // InternalSafetyDSL.g:1158:2: ( ( rule__NonSafetyCritical__Group_2_0__0 ) )
                    // InternalSafetyDSL.g:1159:3: ( rule__NonSafetyCritical__Group_2_0__0 )
                    {
                     before(grammarAccess.getNonSafetyCriticalAccess().getGroup_2_0()); 
                    // InternalSafetyDSL.g:1160:3: ( rule__NonSafetyCritical__Group_2_0__0 )
                    // InternalSafetyDSL.g:1160:4: rule__NonSafetyCritical__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonSafetyCritical__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonSafetyCriticalAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1164:2: ( ';' )
                    {
                    // InternalSafetyDSL.g:1164:2: ( ';' )
                    // InternalSafetyDSL.g:1165:3: ';'
                    {
                     before(grammarAccess.getNonSafetyCriticalAccess().getSemicolonKeyword_2_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNonSafetyCriticalAccess().getSemicolonKeyword_2_1()); 

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
    // $ANTLR end "rule__NonSafetyCritical__Alternatives_2"


    // $ANTLR start "rule__SafetyCriticalRelation__Alternatives"
    // InternalSafetyDSL.g:1174:1: rule__SafetyCriticalRelation__Alternatives : ( ( ruleArchElementToArchElement ) | ( ruleMonitorToArchitecturalElement ) | ( ruleReportsFault ) );
    public final void rule__SafetyCriticalRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1178:1: ( ( ruleArchElementToArchElement ) | ( ruleMonitorToArchitecturalElement ) | ( ruleReportsFault ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 52:
                case 53:
                case 54:
                    {
                    alt9=1;
                    }
                    break;
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    {
                    alt9=2;
                    }
                    break;
                case 60:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSafetyDSL.g:1179:2: ( ruleArchElementToArchElement )
                    {
                    // InternalSafetyDSL.g:1179:2: ( ruleArchElementToArchElement )
                    // InternalSafetyDSL.g:1180:3: ruleArchElementToArchElement
                    {
                     before(grammarAccess.getSafetyCriticalRelationAccess().getArchElementToArchElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleArchElementToArchElement();

                    state._fsp--;

                     after(grammarAccess.getSafetyCriticalRelationAccess().getArchElementToArchElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1185:2: ( ruleMonitorToArchitecturalElement )
                    {
                    // InternalSafetyDSL.g:1185:2: ( ruleMonitorToArchitecturalElement )
                    // InternalSafetyDSL.g:1186:3: ruleMonitorToArchitecturalElement
                    {
                     before(grammarAccess.getSafetyCriticalRelationAccess().getMonitorToArchitecturalElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMonitorToArchitecturalElement();

                    state._fsp--;

                     after(grammarAccess.getSafetyCriticalRelationAccess().getMonitorToArchitecturalElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1191:2: ( ruleReportsFault )
                    {
                    // InternalSafetyDSL.g:1191:2: ( ruleReportsFault )
                    // InternalSafetyDSL.g:1192:3: ruleReportsFault
                    {
                     before(grammarAccess.getSafetyCriticalRelationAccess().getReportsFaultParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReportsFault();

                    state._fsp--;

                     after(grammarAccess.getSafetyCriticalRelationAccess().getReportsFaultParserRuleCall_2()); 

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
    // $ANTLR end "rule__SafetyCriticalRelation__Alternatives"


    // $ANTLR start "rule__ArchElementToArchElement__Alternatives"
    // InternalSafetyDSL.g:1201:1: rule__ArchElementToArchElement__Alternatives : ( ( ( rule__ArchElementToArchElement__Group_0__0 ) ) | ( ( rule__ArchElementToArchElement__Group_1__0 ) ) | ( ( rule__ArchElementToArchElement__Group_2__0 ) ) );
    public final void rule__ArchElementToArchElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1205:1: ( ( ( rule__ArchElementToArchElement__Group_0__0 ) ) | ( ( rule__ArchElementToArchElement__Group_1__0 ) ) | ( ( rule__ArchElementToArchElement__Group_2__0 ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt10=2;
                    }
                    break;
                case 52:
                    {
                    alt10=1;
                    }
                    break;
                case 54:
                    {
                    alt10=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSafetyDSL.g:1206:2: ( ( rule__ArchElementToArchElement__Group_0__0 ) )
                    {
                    // InternalSafetyDSL.g:1206:2: ( ( rule__ArchElementToArchElement__Group_0__0 ) )
                    // InternalSafetyDSL.g:1207:3: ( rule__ArchElementToArchElement__Group_0__0 )
                    {
                     before(grammarAccess.getArchElementToArchElementAccess().getGroup_0()); 
                    // InternalSafetyDSL.g:1208:3: ( rule__ArchElementToArchElement__Group_0__0 )
                    // InternalSafetyDSL.g:1208:4: rule__ArchElementToArchElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArchElementToArchElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArchElementToArchElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1212:2: ( ( rule__ArchElementToArchElement__Group_1__0 ) )
                    {
                    // InternalSafetyDSL.g:1212:2: ( ( rule__ArchElementToArchElement__Group_1__0 ) )
                    // InternalSafetyDSL.g:1213:3: ( rule__ArchElementToArchElement__Group_1__0 )
                    {
                     before(grammarAccess.getArchElementToArchElementAccess().getGroup_1()); 
                    // InternalSafetyDSL.g:1214:3: ( rule__ArchElementToArchElement__Group_1__0 )
                    // InternalSafetyDSL.g:1214:4: rule__ArchElementToArchElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArchElementToArchElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArchElementToArchElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1218:2: ( ( rule__ArchElementToArchElement__Group_2__0 ) )
                    {
                    // InternalSafetyDSL.g:1218:2: ( ( rule__ArchElementToArchElement__Group_2__0 ) )
                    // InternalSafetyDSL.g:1219:3: ( rule__ArchElementToArchElement__Group_2__0 )
                    {
                     before(grammarAccess.getArchElementToArchElementAccess().getGroup_2()); 
                    // InternalSafetyDSL.g:1220:3: ( rule__ArchElementToArchElement__Group_2__0 )
                    // InternalSafetyDSL.g:1220:4: rule__ArchElementToArchElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArchElementToArchElement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArchElementToArchElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ArchElementToArchElement__Alternatives"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Alternatives"
    // InternalSafetyDSL.g:1228:1: rule__MonitorToArchitecturalElement__Alternatives : ( ( ( rule__MonitorToArchitecturalElement__Group_0__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_1__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_2__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_3__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_4__0 ) ) );
    public final void rule__MonitorToArchitecturalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1232:1: ( ( ( rule__MonitorToArchitecturalElement__Group_0__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_1__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_2__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_3__0 ) ) | ( ( rule__MonitorToArchitecturalElement__Group_4__0 ) ) )
            int alt11=5;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt11=1;
                    }
                    break;
                case 57:
                    {
                    alt11=3;
                    }
                    break;
                case 59:
                    {
                    alt11=5;
                    }
                    break;
                case 56:
                    {
                    alt11=2;
                    }
                    break;
                case 58:
                    {
                    alt11=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSafetyDSL.g:1233:2: ( ( rule__MonitorToArchitecturalElement__Group_0__0 ) )
                    {
                    // InternalSafetyDSL.g:1233:2: ( ( rule__MonitorToArchitecturalElement__Group_0__0 ) )
                    // InternalSafetyDSL.g:1234:3: ( rule__MonitorToArchitecturalElement__Group_0__0 )
                    {
                     before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0()); 
                    // InternalSafetyDSL.g:1235:3: ( rule__MonitorToArchitecturalElement__Group_0__0 )
                    // InternalSafetyDSL.g:1235:4: rule__MonitorToArchitecturalElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MonitorToArchitecturalElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1239:2: ( ( rule__MonitorToArchitecturalElement__Group_1__0 ) )
                    {
                    // InternalSafetyDSL.g:1239:2: ( ( rule__MonitorToArchitecturalElement__Group_1__0 ) )
                    // InternalSafetyDSL.g:1240:3: ( rule__MonitorToArchitecturalElement__Group_1__0 )
                    {
                     before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1()); 
                    // InternalSafetyDSL.g:1241:3: ( rule__MonitorToArchitecturalElement__Group_1__0 )
                    // InternalSafetyDSL.g:1241:4: rule__MonitorToArchitecturalElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MonitorToArchitecturalElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1245:2: ( ( rule__MonitorToArchitecturalElement__Group_2__0 ) )
                    {
                    // InternalSafetyDSL.g:1245:2: ( ( rule__MonitorToArchitecturalElement__Group_2__0 ) )
                    // InternalSafetyDSL.g:1246:3: ( rule__MonitorToArchitecturalElement__Group_2__0 )
                    {
                     before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2()); 
                    // InternalSafetyDSL.g:1247:3: ( rule__MonitorToArchitecturalElement__Group_2__0 )
                    // InternalSafetyDSL.g:1247:4: rule__MonitorToArchitecturalElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MonitorToArchitecturalElement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSafetyDSL.g:1251:2: ( ( rule__MonitorToArchitecturalElement__Group_3__0 ) )
                    {
                    // InternalSafetyDSL.g:1251:2: ( ( rule__MonitorToArchitecturalElement__Group_3__0 ) )
                    // InternalSafetyDSL.g:1252:3: ( rule__MonitorToArchitecturalElement__Group_3__0 )
                    {
                     before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3()); 
                    // InternalSafetyDSL.g:1253:3: ( rule__MonitorToArchitecturalElement__Group_3__0 )
                    // InternalSafetyDSL.g:1253:4: rule__MonitorToArchitecturalElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MonitorToArchitecturalElement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSafetyDSL.g:1257:2: ( ( rule__MonitorToArchitecturalElement__Group_4__0 ) )
                    {
                    // InternalSafetyDSL.g:1257:2: ( ( rule__MonitorToArchitecturalElement__Group_4__0 ) )
                    // InternalSafetyDSL.g:1258:3: ( rule__MonitorToArchitecturalElement__Group_4__0 )
                    {
                     before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4()); 
                    // InternalSafetyDSL.g:1259:3: ( rule__MonitorToArchitecturalElement__Group_4__0 )
                    // InternalSafetyDSL.g:1259:4: rule__MonitorToArchitecturalElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MonitorToArchitecturalElement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MonitorToArchitecturalElement__Alternatives"


    // $ANTLR start "rule__SafetyFramework__Group__0"
    // InternalSafetyDSL.g:1267:1: rule__SafetyFramework__Group__0 : rule__SafetyFramework__Group__0__Impl rule__SafetyFramework__Group__1 ;
    public final void rule__SafetyFramework__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1271:1: ( rule__SafetyFramework__Group__0__Impl rule__SafetyFramework__Group__1 )
            // InternalSafetyDSL.g:1272:2: rule__SafetyFramework__Group__0__Impl rule__SafetyFramework__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SafetyFramework__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyFramework__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyFramework__Group__0"


    // $ANTLR start "rule__SafetyFramework__Group__0__Impl"
    // InternalSafetyDSL.g:1279:1: rule__SafetyFramework__Group__0__Impl : ( ( ( rule__SafetyFramework__ViewsAssignment_0 ) ) ( ( rule__SafetyFramework__ViewsAssignment_0 )* ) ) ;
    public final void rule__SafetyFramework__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1283:1: ( ( ( ( rule__SafetyFramework__ViewsAssignment_0 ) ) ( ( rule__SafetyFramework__ViewsAssignment_0 )* ) ) )
            // InternalSafetyDSL.g:1284:1: ( ( ( rule__SafetyFramework__ViewsAssignment_0 ) ) ( ( rule__SafetyFramework__ViewsAssignment_0 )* ) )
            {
            // InternalSafetyDSL.g:1284:1: ( ( ( rule__SafetyFramework__ViewsAssignment_0 ) ) ( ( rule__SafetyFramework__ViewsAssignment_0 )* ) )
            // InternalSafetyDSL.g:1285:2: ( ( rule__SafetyFramework__ViewsAssignment_0 ) ) ( ( rule__SafetyFramework__ViewsAssignment_0 )* )
            {
            // InternalSafetyDSL.g:1285:2: ( ( rule__SafetyFramework__ViewsAssignment_0 ) )
            // InternalSafetyDSL.g:1286:3: ( rule__SafetyFramework__ViewsAssignment_0 )
            {
             before(grammarAccess.getSafetyFrameworkAccess().getViewsAssignment_0()); 
            // InternalSafetyDSL.g:1287:3: ( rule__SafetyFramework__ViewsAssignment_0 )
            // InternalSafetyDSL.g:1287:4: rule__SafetyFramework__ViewsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__SafetyFramework__ViewsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyFrameworkAccess().getViewsAssignment_0()); 

            }

            // InternalSafetyDSL.g:1290:2: ( ( rule__SafetyFramework__ViewsAssignment_0 )* )
            // InternalSafetyDSL.g:1291:3: ( rule__SafetyFramework__ViewsAssignment_0 )*
            {
             before(grammarAccess.getSafetyFrameworkAccess().getViewsAssignment_0()); 
            // InternalSafetyDSL.g:1292:3: ( rule__SafetyFramework__ViewsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12||LA12_0==30||LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSafetyDSL.g:1292:4: rule__SafetyFramework__ViewsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SafetyFramework__ViewsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSafetyFrameworkAccess().getViewsAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyFramework__Group__0__Impl"


    // $ANTLR start "rule__SafetyFramework__Group__1"
    // InternalSafetyDSL.g:1301:1: rule__SafetyFramework__Group__1 : rule__SafetyFramework__Group__1__Impl ;
    public final void rule__SafetyFramework__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1305:1: ( rule__SafetyFramework__Group__1__Impl )
            // InternalSafetyDSL.g:1306:2: rule__SafetyFramework__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyFramework__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyFramework__Group__1"


    // $ANTLR start "rule__SafetyFramework__Group__1__Impl"
    // InternalSafetyDSL.g:1312:1: rule__SafetyFramework__Group__1__Impl : ( ( rule__SafetyFramework__DetailAssignment_1 ) ) ;
    public final void rule__SafetyFramework__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1316:1: ( ( ( rule__SafetyFramework__DetailAssignment_1 ) ) )
            // InternalSafetyDSL.g:1317:1: ( ( rule__SafetyFramework__DetailAssignment_1 ) )
            {
            // InternalSafetyDSL.g:1317:1: ( ( rule__SafetyFramework__DetailAssignment_1 ) )
            // InternalSafetyDSL.g:1318:2: ( rule__SafetyFramework__DetailAssignment_1 )
            {
             before(grammarAccess.getSafetyFrameworkAccess().getDetailAssignment_1()); 
            // InternalSafetyDSL.g:1319:2: ( rule__SafetyFramework__DetailAssignment_1 )
            // InternalSafetyDSL.g:1319:3: rule__SafetyFramework__DetailAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyFramework__DetailAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyFrameworkAccess().getDetailAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyFramework__Group__1__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__0"
    // InternalSafetyDSL.g:1328:1: rule__HazardViewpoint__Group__0 : rule__HazardViewpoint__Group__0__Impl rule__HazardViewpoint__Group__1 ;
    public final void rule__HazardViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1332:1: ( rule__HazardViewpoint__Group__0__Impl rule__HazardViewpoint__Group__1 )
            // InternalSafetyDSL.g:1333:2: rule__HazardViewpoint__Group__0__Impl rule__HazardViewpoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__HazardViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__0"


    // $ANTLR start "rule__HazardViewpoint__Group__0__Impl"
    // InternalSafetyDSL.g:1340:1: rule__HazardViewpoint__Group__0__Impl : ( 'Hazard View' ) ;
    public final void rule__HazardViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1344:1: ( ( 'Hazard View' ) )
            // InternalSafetyDSL.g:1345:1: ( 'Hazard View' )
            {
            // InternalSafetyDSL.g:1345:1: ( 'Hazard View' )
            // InternalSafetyDSL.g:1346:2: 'Hazard View'
            {
             before(grammarAccess.getHazardViewpointAccess().getHazardViewKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getHazardViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__0__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__1"
    // InternalSafetyDSL.g:1355:1: rule__HazardViewpoint__Group__1 : rule__HazardViewpoint__Group__1__Impl rule__HazardViewpoint__Group__2 ;
    public final void rule__HazardViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1359:1: ( rule__HazardViewpoint__Group__1__Impl rule__HazardViewpoint__Group__2 )
            // InternalSafetyDSL.g:1360:2: rule__HazardViewpoint__Group__1__Impl rule__HazardViewpoint__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HazardViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__1"


    // $ANTLR start "rule__HazardViewpoint__Group__1__Impl"
    // InternalSafetyDSL.g:1367:1: rule__HazardViewpoint__Group__1__Impl : ( ( rule__HazardViewpoint__NameAssignment_1 ) ) ;
    public final void rule__HazardViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1371:1: ( ( ( rule__HazardViewpoint__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:1372:1: ( ( rule__HazardViewpoint__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:1372:1: ( ( rule__HazardViewpoint__NameAssignment_1 ) )
            // InternalSafetyDSL.g:1373:2: ( rule__HazardViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getHazardViewpointAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:1374:2: ( rule__HazardViewpoint__NameAssignment_1 )
            // InternalSafetyDSL.g:1374:3: rule__HazardViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHazardViewpointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__1__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__2"
    // InternalSafetyDSL.g:1382:1: rule__HazardViewpoint__Group__2 : rule__HazardViewpoint__Group__2__Impl rule__HazardViewpoint__Group__3 ;
    public final void rule__HazardViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1386:1: ( rule__HazardViewpoint__Group__2__Impl rule__HazardViewpoint__Group__3 )
            // InternalSafetyDSL.g:1387:2: rule__HazardViewpoint__Group__2__Impl rule__HazardViewpoint__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__HazardViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__2"


    // $ANTLR start "rule__HazardViewpoint__Group__2__Impl"
    // InternalSafetyDSL.g:1394:1: rule__HazardViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__HazardViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1398:1: ( ( '{' ) )
            // InternalSafetyDSL.g:1399:1: ( '{' )
            {
            // InternalSafetyDSL.g:1399:1: ( '{' )
            // InternalSafetyDSL.g:1400:2: '{'
            {
             before(grammarAccess.getHazardViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__2__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__3"
    // InternalSafetyDSL.g:1409:1: rule__HazardViewpoint__Group__3 : rule__HazardViewpoint__Group__3__Impl rule__HazardViewpoint__Group__4 ;
    public final void rule__HazardViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1413:1: ( rule__HazardViewpoint__Group__3__Impl rule__HazardViewpoint__Group__4 )
            // InternalSafetyDSL.g:1414:2: rule__HazardViewpoint__Group__3__Impl rule__HazardViewpoint__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__HazardViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__3"


    // $ANTLR start "rule__HazardViewpoint__Group__3__Impl"
    // InternalSafetyDSL.g:1421:1: rule__HazardViewpoint__Group__3__Impl : ( 'Elements {' ) ;
    public final void rule__HazardViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1425:1: ( ( 'Elements {' ) )
            // InternalSafetyDSL.g:1426:1: ( 'Elements {' )
            {
            // InternalSafetyDSL.g:1426:1: ( 'Elements {' )
            // InternalSafetyDSL.g:1427:2: 'Elements {'
            {
             before(grammarAccess.getHazardViewpointAccess().getElementsKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getElementsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__3__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__4"
    // InternalSafetyDSL.g:1436:1: rule__HazardViewpoint__Group__4 : rule__HazardViewpoint__Group__4__Impl rule__HazardViewpoint__Group__5 ;
    public final void rule__HazardViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1440:1: ( rule__HazardViewpoint__Group__4__Impl rule__HazardViewpoint__Group__5 )
            // InternalSafetyDSL.g:1441:2: rule__HazardViewpoint__Group__4__Impl rule__HazardViewpoint__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__HazardViewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__4"


    // $ANTLR start "rule__HazardViewpoint__Group__4__Impl"
    // InternalSafetyDSL.g:1448:1: rule__HazardViewpoint__Group__4__Impl : ( ( ( rule__HazardViewpoint__ElementsAssignment_4 ) ) ( ( rule__HazardViewpoint__ElementsAssignment_4 )* ) ) ;
    public final void rule__HazardViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1452:1: ( ( ( ( rule__HazardViewpoint__ElementsAssignment_4 ) ) ( ( rule__HazardViewpoint__ElementsAssignment_4 )* ) ) )
            // InternalSafetyDSL.g:1453:1: ( ( ( rule__HazardViewpoint__ElementsAssignment_4 ) ) ( ( rule__HazardViewpoint__ElementsAssignment_4 )* ) )
            {
            // InternalSafetyDSL.g:1453:1: ( ( ( rule__HazardViewpoint__ElementsAssignment_4 ) ) ( ( rule__HazardViewpoint__ElementsAssignment_4 )* ) )
            // InternalSafetyDSL.g:1454:2: ( ( rule__HazardViewpoint__ElementsAssignment_4 ) ) ( ( rule__HazardViewpoint__ElementsAssignment_4 )* )
            {
            // InternalSafetyDSL.g:1454:2: ( ( rule__HazardViewpoint__ElementsAssignment_4 ) )
            // InternalSafetyDSL.g:1455:3: ( rule__HazardViewpoint__ElementsAssignment_4 )
            {
             before(grammarAccess.getHazardViewpointAccess().getElementsAssignment_4()); 
            // InternalSafetyDSL.g:1456:3: ( rule__HazardViewpoint__ElementsAssignment_4 )
            // InternalSafetyDSL.g:1456:4: rule__HazardViewpoint__ElementsAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__HazardViewpoint__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHazardViewpointAccess().getElementsAssignment_4()); 

            }

            // InternalSafetyDSL.g:1459:2: ( ( rule__HazardViewpoint__ElementsAssignment_4 )* )
            // InternalSafetyDSL.g:1460:3: ( rule__HazardViewpoint__ElementsAssignment_4 )*
            {
             before(grammarAccess.getHazardViewpointAccess().getElementsAssignment_4()); 
            // InternalSafetyDSL.g:1461:3: ( rule__HazardViewpoint__ElementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=17 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSafetyDSL.g:1461:4: rule__HazardViewpoint__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__HazardViewpoint__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHazardViewpointAccess().getElementsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__4__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__5"
    // InternalSafetyDSL.g:1470:1: rule__HazardViewpoint__Group__5 : rule__HazardViewpoint__Group__5__Impl rule__HazardViewpoint__Group__6 ;
    public final void rule__HazardViewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1474:1: ( rule__HazardViewpoint__Group__5__Impl rule__HazardViewpoint__Group__6 )
            // InternalSafetyDSL.g:1475:2: rule__HazardViewpoint__Group__5__Impl rule__HazardViewpoint__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__HazardViewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__5"


    // $ANTLR start "rule__HazardViewpoint__Group__5__Impl"
    // InternalSafetyDSL.g:1482:1: rule__HazardViewpoint__Group__5__Impl : ( '}' ) ;
    public final void rule__HazardViewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1486:1: ( ( '}' ) )
            // InternalSafetyDSL.g:1487:1: ( '}' )
            {
            // InternalSafetyDSL.g:1487:1: ( '}' )
            // InternalSafetyDSL.g:1488:2: '}'
            {
             before(grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__5__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__6"
    // InternalSafetyDSL.g:1497:1: rule__HazardViewpoint__Group__6 : rule__HazardViewpoint__Group__6__Impl rule__HazardViewpoint__Group__7 ;
    public final void rule__HazardViewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1501:1: ( rule__HazardViewpoint__Group__6__Impl rule__HazardViewpoint__Group__7 )
            // InternalSafetyDSL.g:1502:2: rule__HazardViewpoint__Group__6__Impl rule__HazardViewpoint__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__HazardViewpoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__6"


    // $ANTLR start "rule__HazardViewpoint__Group__6__Impl"
    // InternalSafetyDSL.g:1509:1: rule__HazardViewpoint__Group__6__Impl : ( 'Relations {' ) ;
    public final void rule__HazardViewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1513:1: ( ( 'Relations {' ) )
            // InternalSafetyDSL.g:1514:1: ( 'Relations {' )
            {
            // InternalSafetyDSL.g:1514:1: ( 'Relations {' )
            // InternalSafetyDSL.g:1515:2: 'Relations {'
            {
             before(grammarAccess.getHazardViewpointAccess().getRelationsKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getRelationsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__6__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__7"
    // InternalSafetyDSL.g:1524:1: rule__HazardViewpoint__Group__7 : rule__HazardViewpoint__Group__7__Impl rule__HazardViewpoint__Group__8 ;
    public final void rule__HazardViewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1528:1: ( rule__HazardViewpoint__Group__7__Impl rule__HazardViewpoint__Group__8 )
            // InternalSafetyDSL.g:1529:2: rule__HazardViewpoint__Group__7__Impl rule__HazardViewpoint__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__HazardViewpoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__7"


    // $ANTLR start "rule__HazardViewpoint__Group__7__Impl"
    // InternalSafetyDSL.g:1536:1: rule__HazardViewpoint__Group__7__Impl : ( ( ( rule__HazardViewpoint__RelationsAssignment_7 ) ) ( ( rule__HazardViewpoint__RelationsAssignment_7 )* ) ) ;
    public final void rule__HazardViewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1540:1: ( ( ( ( rule__HazardViewpoint__RelationsAssignment_7 ) ) ( ( rule__HazardViewpoint__RelationsAssignment_7 )* ) ) )
            // InternalSafetyDSL.g:1541:1: ( ( ( rule__HazardViewpoint__RelationsAssignment_7 ) ) ( ( rule__HazardViewpoint__RelationsAssignment_7 )* ) )
            {
            // InternalSafetyDSL.g:1541:1: ( ( ( rule__HazardViewpoint__RelationsAssignment_7 ) ) ( ( rule__HazardViewpoint__RelationsAssignment_7 )* ) )
            // InternalSafetyDSL.g:1542:2: ( ( rule__HazardViewpoint__RelationsAssignment_7 ) ) ( ( rule__HazardViewpoint__RelationsAssignment_7 )* )
            {
            // InternalSafetyDSL.g:1542:2: ( ( rule__HazardViewpoint__RelationsAssignment_7 ) )
            // InternalSafetyDSL.g:1543:3: ( rule__HazardViewpoint__RelationsAssignment_7 )
            {
             before(grammarAccess.getHazardViewpointAccess().getRelationsAssignment_7()); 
            // InternalSafetyDSL.g:1544:3: ( rule__HazardViewpoint__RelationsAssignment_7 )
            // InternalSafetyDSL.g:1544:4: rule__HazardViewpoint__RelationsAssignment_7
            {
            pushFollow(FOLLOW_12);
            rule__HazardViewpoint__RelationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHazardViewpointAccess().getRelationsAssignment_7()); 

            }

            // InternalSafetyDSL.g:1547:2: ( ( rule__HazardViewpoint__RelationsAssignment_7 )* )
            // InternalSafetyDSL.g:1548:3: ( rule__HazardViewpoint__RelationsAssignment_7 )*
            {
             before(grammarAccess.getHazardViewpointAccess().getRelationsAssignment_7()); 
            // InternalSafetyDSL.g:1549:3: ( rule__HazardViewpoint__RelationsAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSafetyDSL.g:1549:4: rule__HazardViewpoint__RelationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HazardViewpoint__RelationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getHazardViewpointAccess().getRelationsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__7__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__8"
    // InternalSafetyDSL.g:1558:1: rule__HazardViewpoint__Group__8 : rule__HazardViewpoint__Group__8__Impl rule__HazardViewpoint__Group__9 ;
    public final void rule__HazardViewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1562:1: ( rule__HazardViewpoint__Group__8__Impl rule__HazardViewpoint__Group__9 )
            // InternalSafetyDSL.g:1563:2: rule__HazardViewpoint__Group__8__Impl rule__HazardViewpoint__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__HazardViewpoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__8"


    // $ANTLR start "rule__HazardViewpoint__Group__8__Impl"
    // InternalSafetyDSL.g:1570:1: rule__HazardViewpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__HazardViewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1574:1: ( ( '}' ) )
            // InternalSafetyDSL.g:1575:1: ( '}' )
            {
            // InternalSafetyDSL.g:1575:1: ( '}' )
            // InternalSafetyDSL.g:1576:2: '}'
            {
             before(grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__8__Impl"


    // $ANTLR start "rule__HazardViewpoint__Group__9"
    // InternalSafetyDSL.g:1585:1: rule__HazardViewpoint__Group__9 : rule__HazardViewpoint__Group__9__Impl ;
    public final void rule__HazardViewpoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1589:1: ( rule__HazardViewpoint__Group__9__Impl )
            // InternalSafetyDSL.g:1590:2: rule__HazardViewpoint__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HazardViewpoint__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__9"


    // $ANTLR start "rule__HazardViewpoint__Group__9__Impl"
    // InternalSafetyDSL.g:1596:1: rule__HazardViewpoint__Group__9__Impl : ( '}' ) ;
    public final void rule__HazardViewpoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1600:1: ( ( '}' ) )
            // InternalSafetyDSL.g:1601:1: ( '}' )
            {
            // InternalSafetyDSL.g:1601:1: ( '}' )
            // InternalSafetyDSL.g:1602:2: '}'
            {
             before(grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__Group__9__Impl"


    // $ANTLR start "rule__Hazard__Group__0"
    // InternalSafetyDSL.g:1612:1: rule__Hazard__Group__0 : rule__Hazard__Group__0__Impl rule__Hazard__Group__1 ;
    public final void rule__Hazard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1616:1: ( rule__Hazard__Group__0__Impl rule__Hazard__Group__1 )
            // InternalSafetyDSL.g:1617:2: rule__Hazard__Group__0__Impl rule__Hazard__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Hazard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hazard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__Group__0"


    // $ANTLR start "rule__Hazard__Group__0__Impl"
    // InternalSafetyDSL.g:1624:1: rule__Hazard__Group__0__Impl : ( 'hazard' ) ;
    public final void rule__Hazard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1628:1: ( ( 'hazard' ) )
            // InternalSafetyDSL.g:1629:1: ( 'hazard' )
            {
            // InternalSafetyDSL.g:1629:1: ( 'hazard' )
            // InternalSafetyDSL.g:1630:2: 'hazard'
            {
             before(grammarAccess.getHazardAccess().getHazardKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHazardAccess().getHazardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__Group__0__Impl"


    // $ANTLR start "rule__Hazard__Group__1"
    // InternalSafetyDSL.g:1639:1: rule__Hazard__Group__1 : rule__Hazard__Group__1__Impl rule__Hazard__Group__2 ;
    public final void rule__Hazard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1643:1: ( rule__Hazard__Group__1__Impl rule__Hazard__Group__2 )
            // InternalSafetyDSL.g:1644:2: rule__Hazard__Group__1__Impl rule__Hazard__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Hazard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hazard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__Group__1"


    // $ANTLR start "rule__Hazard__Group__1__Impl"
    // InternalSafetyDSL.g:1651:1: rule__Hazard__Group__1__Impl : ( ( rule__Hazard__NameAssignment_1 ) ) ;
    public final void rule__Hazard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1655:1: ( ( ( rule__Hazard__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:1656:1: ( ( rule__Hazard__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:1656:1: ( ( rule__Hazard__NameAssignment_1 ) )
            // InternalSafetyDSL.g:1657:2: ( rule__Hazard__NameAssignment_1 )
            {
             before(grammarAccess.getHazardAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:1658:2: ( rule__Hazard__NameAssignment_1 )
            // InternalSafetyDSL.g:1658:3: rule__Hazard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hazard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHazardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__Group__1__Impl"


    // $ANTLR start "rule__Hazard__Group__2"
    // InternalSafetyDSL.g:1666:1: rule__Hazard__Group__2 : rule__Hazard__Group__2__Impl ;
    public final void rule__Hazard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1670:1: ( rule__Hazard__Group__2__Impl )
            // InternalSafetyDSL.g:1671:2: rule__Hazard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hazard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__Group__2"


    // $ANTLR start "rule__Hazard__Group__2__Impl"
    // InternalSafetyDSL.g:1677:1: rule__Hazard__Group__2__Impl : ( ';' ) ;
    public final void rule__Hazard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1681:1: ( ( ';' ) )
            // InternalSafetyDSL.g:1682:1: ( ';' )
            {
            // InternalSafetyDSL.g:1682:1: ( ';' )
            // InternalSafetyDSL.g:1683:2: ';'
            {
             before(grammarAccess.getHazardAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getHazardAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__Group__2__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group__0"
    // InternalSafetyDSL.g:1693:1: rule__SafetyRequirement__Group__0 : rule__SafetyRequirement__Group__0__Impl rule__SafetyRequirement__Group__1 ;
    public final void rule__SafetyRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1697:1: ( rule__SafetyRequirement__Group__0__Impl rule__SafetyRequirement__Group__1 )
            // InternalSafetyDSL.g:1698:2: rule__SafetyRequirement__Group__0__Impl rule__SafetyRequirement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__0"


    // $ANTLR start "rule__SafetyRequirement__Group__0__Impl"
    // InternalSafetyDSL.g:1705:1: rule__SafetyRequirement__Group__0__Impl : ( 'safetyRequirement' ) ;
    public final void rule__SafetyRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1709:1: ( ( 'safetyRequirement' ) )
            // InternalSafetyDSL.g:1710:1: ( 'safetyRequirement' )
            {
            // InternalSafetyDSL.g:1710:1: ( 'safetyRequirement' )
            // InternalSafetyDSL.g:1711:2: 'safetyRequirement'
            {
             before(grammarAccess.getSafetyRequirementAccess().getSafetyRequirementKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSafetyRequirementAccess().getSafetyRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__0__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group__1"
    // InternalSafetyDSL.g:1720:1: rule__SafetyRequirement__Group__1 : rule__SafetyRequirement__Group__1__Impl rule__SafetyRequirement__Group__2 ;
    public final void rule__SafetyRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1724:1: ( rule__SafetyRequirement__Group__1__Impl rule__SafetyRequirement__Group__2 )
            // InternalSafetyDSL.g:1725:2: rule__SafetyRequirement__Group__1__Impl rule__SafetyRequirement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SafetyRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__1"


    // $ANTLR start "rule__SafetyRequirement__Group__1__Impl"
    // InternalSafetyDSL.g:1732:1: rule__SafetyRequirement__Group__1__Impl : ( ( rule__SafetyRequirement__NameAssignment_1 ) ) ;
    public final void rule__SafetyRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1736:1: ( ( ( rule__SafetyRequirement__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:1737:1: ( ( rule__SafetyRequirement__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:1737:1: ( ( rule__SafetyRequirement__NameAssignment_1 ) )
            // InternalSafetyDSL.g:1738:2: ( rule__SafetyRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getSafetyRequirementAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:1739:2: ( rule__SafetyRequirement__NameAssignment_1 )
            // InternalSafetyDSL.g:1739:3: rule__SafetyRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__1__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group__2"
    // InternalSafetyDSL.g:1747:1: rule__SafetyRequirement__Group__2 : rule__SafetyRequirement__Group__2__Impl rule__SafetyRequirement__Group__3 ;
    public final void rule__SafetyRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1751:1: ( rule__SafetyRequirement__Group__2__Impl rule__SafetyRequirement__Group__3 )
            // InternalSafetyDSL.g:1752:2: rule__SafetyRequirement__Group__2__Impl rule__SafetyRequirement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SafetyRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__2"


    // $ANTLR start "rule__SafetyRequirement__Group__2__Impl"
    // InternalSafetyDSL.g:1759:1: rule__SafetyRequirement__Group__2__Impl : ( ';' ) ;
    public final void rule__SafetyRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1763:1: ( ( ';' ) )
            // InternalSafetyDSL.g:1764:1: ( ';' )
            {
            // InternalSafetyDSL.g:1764:1: ( ';' )
            // InternalSafetyDSL.g:1765:2: ';'
            {
             before(grammarAccess.getSafetyRequirementAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSafetyRequirementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__2__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group__3"
    // InternalSafetyDSL.g:1774:1: rule__SafetyRequirement__Group__3 : rule__SafetyRequirement__Group__3__Impl ;
    public final void rule__SafetyRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1778:1: ( rule__SafetyRequirement__Group__3__Impl )
            // InternalSafetyDSL.g:1779:2: rule__SafetyRequirement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__3"


    // $ANTLR start "rule__SafetyRequirement__Group__3__Impl"
    // InternalSafetyDSL.g:1785:1: rule__SafetyRequirement__Group__3__Impl : ( ( rule__SafetyRequirement__Group_3__0 )? ) ;
    public final void rule__SafetyRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1789:1: ( ( ( rule__SafetyRequirement__Group_3__0 )? ) )
            // InternalSafetyDSL.g:1790:1: ( ( rule__SafetyRequirement__Group_3__0 )? )
            {
            // InternalSafetyDSL.g:1790:1: ( ( rule__SafetyRequirement__Group_3__0 )? )
            // InternalSafetyDSL.g:1791:2: ( rule__SafetyRequirement__Group_3__0 )?
            {
             before(grammarAccess.getSafetyRequirementAccess().getGroup_3()); 
            // InternalSafetyDSL.g:1792:2: ( rule__SafetyRequirement__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSafetyDSL.g:1792:3: rule__SafetyRequirement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyRequirement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyRequirementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group__3__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group_3__0"
    // InternalSafetyDSL.g:1801:1: rule__SafetyRequirement__Group_3__0 : rule__SafetyRequirement__Group_3__0__Impl rule__SafetyRequirement__Group_3__1 ;
    public final void rule__SafetyRequirement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1805:1: ( rule__SafetyRequirement__Group_3__0__Impl rule__SafetyRequirement__Group_3__1 )
            // InternalSafetyDSL.g:1806:2: rule__SafetyRequirement__Group_3__0__Impl rule__SafetyRequirement__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__SafetyRequirement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group_3__0"


    // $ANTLR start "rule__SafetyRequirement__Group_3__0__Impl"
    // InternalSafetyDSL.g:1813:1: rule__SafetyRequirement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__SafetyRequirement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1817:1: ( ( '{' ) )
            // InternalSafetyDSL.g:1818:1: ( '{' )
            {
            // InternalSafetyDSL.g:1818:1: ( '{' )
            // InternalSafetyDSL.g:1819:2: '{'
            {
             before(grammarAccess.getSafetyRequirementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSafetyRequirementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group_3__0__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group_3__1"
    // InternalSafetyDSL.g:1828:1: rule__SafetyRequirement__Group_3__1 : rule__SafetyRequirement__Group_3__1__Impl rule__SafetyRequirement__Group_3__2 ;
    public final void rule__SafetyRequirement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1832:1: ( rule__SafetyRequirement__Group_3__1__Impl rule__SafetyRequirement__Group_3__2 )
            // InternalSafetyDSL.g:1833:2: rule__SafetyRequirement__Group_3__1__Impl rule__SafetyRequirement__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__SafetyRequirement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group_3__1"


    // $ANTLR start "rule__SafetyRequirement__Group_3__1__Impl"
    // InternalSafetyDSL.g:1840:1: rule__SafetyRequirement__Group_3__1__Impl : ( ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 ) ) ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )* ) ) ;
    public final void rule__SafetyRequirement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1844:1: ( ( ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 ) ) ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )* ) ) )
            // InternalSafetyDSL.g:1845:1: ( ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 ) ) ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )* ) )
            {
            // InternalSafetyDSL.g:1845:1: ( ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 ) ) ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )* ) )
            // InternalSafetyDSL.g:1846:2: ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 ) ) ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )* )
            {
            // InternalSafetyDSL.g:1846:2: ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 ) )
            // InternalSafetyDSL.g:1847:3: ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )
            {
             before(grammarAccess.getSafetyRequirementAccess().getSubrequirementsAssignment_3_1()); 
            // InternalSafetyDSL.g:1848:3: ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )
            // InternalSafetyDSL.g:1848:4: rule__SafetyRequirement__SubrequirementsAssignment_3_1
            {
            pushFollow(FOLLOW_15);
            rule__SafetyRequirement__SubrequirementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyRequirementAccess().getSubrequirementsAssignment_3_1()); 

            }

            // InternalSafetyDSL.g:1851:2: ( ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )* )
            // InternalSafetyDSL.g:1852:3: ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )*
            {
             before(grammarAccess.getSafetyRequirementAccess().getSubrequirementsAssignment_3_1()); 
            // InternalSafetyDSL.g:1853:3: ( rule__SafetyRequirement__SubrequirementsAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSafetyDSL.g:1853:4: rule__SafetyRequirement__SubrequirementsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SafetyRequirement__SubrequirementsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSafetyRequirementAccess().getSubrequirementsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group_3__1__Impl"


    // $ANTLR start "rule__SafetyRequirement__Group_3__2"
    // InternalSafetyDSL.g:1862:1: rule__SafetyRequirement__Group_3__2 : rule__SafetyRequirement__Group_3__2__Impl ;
    public final void rule__SafetyRequirement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1866:1: ( rule__SafetyRequirement__Group_3__2__Impl )
            // InternalSafetyDSL.g:1867:2: rule__SafetyRequirement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyRequirement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group_3__2"


    // $ANTLR start "rule__SafetyRequirement__Group_3__2__Impl"
    // InternalSafetyDSL.g:1873:1: rule__SafetyRequirement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__SafetyRequirement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1877:1: ( ( '}' ) )
            // InternalSafetyDSL.g:1878:1: ( '}' )
            {
            // InternalSafetyDSL.g:1878:1: ( '}' )
            // InternalSafetyDSL.g:1879:2: '}'
            {
             before(grammarAccess.getSafetyRequirementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSafetyRequirementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__Group_3__2__Impl"


    // $ANTLR start "rule__Consequence__Group__0"
    // InternalSafetyDSL.g:1889:1: rule__Consequence__Group__0 : rule__Consequence__Group__0__Impl rule__Consequence__Group__1 ;
    public final void rule__Consequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1893:1: ( rule__Consequence__Group__0__Impl rule__Consequence__Group__1 )
            // InternalSafetyDSL.g:1894:2: rule__Consequence__Group__0__Impl rule__Consequence__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Consequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__Group__0"


    // $ANTLR start "rule__Consequence__Group__0__Impl"
    // InternalSafetyDSL.g:1901:1: rule__Consequence__Group__0__Impl : ( 'consequence' ) ;
    public final void rule__Consequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1905:1: ( ( 'consequence' ) )
            // InternalSafetyDSL.g:1906:1: ( 'consequence' )
            {
            // InternalSafetyDSL.g:1906:1: ( 'consequence' )
            // InternalSafetyDSL.g:1907:2: 'consequence'
            {
             before(grammarAccess.getConsequenceAccess().getConsequenceKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConsequenceAccess().getConsequenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__Group__0__Impl"


    // $ANTLR start "rule__Consequence__Group__1"
    // InternalSafetyDSL.g:1916:1: rule__Consequence__Group__1 : rule__Consequence__Group__1__Impl rule__Consequence__Group__2 ;
    public final void rule__Consequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1920:1: ( rule__Consequence__Group__1__Impl rule__Consequence__Group__2 )
            // InternalSafetyDSL.g:1921:2: rule__Consequence__Group__1__Impl rule__Consequence__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Consequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__Group__1"


    // $ANTLR start "rule__Consequence__Group__1__Impl"
    // InternalSafetyDSL.g:1928:1: rule__Consequence__Group__1__Impl : ( ( rule__Consequence__NameAssignment_1 ) ) ;
    public final void rule__Consequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1932:1: ( ( ( rule__Consequence__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:1933:1: ( ( rule__Consequence__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:1933:1: ( ( rule__Consequence__NameAssignment_1 ) )
            // InternalSafetyDSL.g:1934:2: ( rule__Consequence__NameAssignment_1 )
            {
             before(grammarAccess.getConsequenceAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:1935:2: ( rule__Consequence__NameAssignment_1 )
            // InternalSafetyDSL.g:1935:3: rule__Consequence__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Consequence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConsequenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__Group__1__Impl"


    // $ANTLR start "rule__Consequence__Group__2"
    // InternalSafetyDSL.g:1943:1: rule__Consequence__Group__2 : rule__Consequence__Group__2__Impl ;
    public final void rule__Consequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1947:1: ( rule__Consequence__Group__2__Impl )
            // InternalSafetyDSL.g:1948:2: rule__Consequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Consequence__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__Group__2"


    // $ANTLR start "rule__Consequence__Group__2__Impl"
    // InternalSafetyDSL.g:1954:1: rule__Consequence__Group__2__Impl : ( ';' ) ;
    public final void rule__Consequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1958:1: ( ( ';' ) )
            // InternalSafetyDSL.g:1959:1: ( ';' )
            {
            // InternalSafetyDSL.g:1959:1: ( ';' )
            // InternalSafetyDSL.g:1960:2: ';'
            {
             before(grammarAccess.getConsequenceAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConsequenceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__Group__2__Impl"


    // $ANTLR start "rule__Fault__Group__0"
    // InternalSafetyDSL.g:1970:1: rule__Fault__Group__0 : rule__Fault__Group__0__Impl rule__Fault__Group__1 ;
    public final void rule__Fault__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1974:1: ( rule__Fault__Group__0__Impl rule__Fault__Group__1 )
            // InternalSafetyDSL.g:1975:2: rule__Fault__Group__0__Impl rule__Fault__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Fault__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fault__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__Group__0"


    // $ANTLR start "rule__Fault__Group__0__Impl"
    // InternalSafetyDSL.g:1982:1: rule__Fault__Group__0__Impl : ( 'fault' ) ;
    public final void rule__Fault__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:1986:1: ( ( 'fault' ) )
            // InternalSafetyDSL.g:1987:1: ( 'fault' )
            {
            // InternalSafetyDSL.g:1987:1: ( 'fault' )
            // InternalSafetyDSL.g:1988:2: 'fault'
            {
             before(grammarAccess.getFaultAccess().getFaultKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFaultAccess().getFaultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__Group__0__Impl"


    // $ANTLR start "rule__Fault__Group__1"
    // InternalSafetyDSL.g:1997:1: rule__Fault__Group__1 : rule__Fault__Group__1__Impl rule__Fault__Group__2 ;
    public final void rule__Fault__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2001:1: ( rule__Fault__Group__1__Impl rule__Fault__Group__2 )
            // InternalSafetyDSL.g:2002:2: rule__Fault__Group__1__Impl rule__Fault__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Fault__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fault__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__Group__1"


    // $ANTLR start "rule__Fault__Group__1__Impl"
    // InternalSafetyDSL.g:2009:1: rule__Fault__Group__1__Impl : ( ( rule__Fault__NameAssignment_1 ) ) ;
    public final void rule__Fault__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2013:1: ( ( ( rule__Fault__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:2014:1: ( ( rule__Fault__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:2014:1: ( ( rule__Fault__NameAssignment_1 ) )
            // InternalSafetyDSL.g:2015:2: ( rule__Fault__NameAssignment_1 )
            {
             before(grammarAccess.getFaultAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:2016:2: ( rule__Fault__NameAssignment_1 )
            // InternalSafetyDSL.g:2016:3: rule__Fault__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fault__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__Group__1__Impl"


    // $ANTLR start "rule__Fault__Group__2"
    // InternalSafetyDSL.g:2024:1: rule__Fault__Group__2 : rule__Fault__Group__2__Impl ;
    public final void rule__Fault__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2028:1: ( rule__Fault__Group__2__Impl )
            // InternalSafetyDSL.g:2029:2: rule__Fault__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fault__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__Group__2"


    // $ANTLR start "rule__Fault__Group__2__Impl"
    // InternalSafetyDSL.g:2035:1: rule__Fault__Group__2__Impl : ( ';' ) ;
    public final void rule__Fault__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2039:1: ( ( ';' ) )
            // InternalSafetyDSL.g:2040:1: ( ';' )
            {
            // InternalSafetyDSL.g:2040:1: ( ';' )
            // InternalSafetyDSL.g:2041:2: ';'
            {
             before(grammarAccess.getFaultAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFaultAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__Group__2__Impl"


    // $ANTLR start "rule__FaultTree__Group__0"
    // InternalSafetyDSL.g:2051:1: rule__FaultTree__Group__0 : rule__FaultTree__Group__0__Impl rule__FaultTree__Group__1 ;
    public final void rule__FaultTree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2055:1: ( rule__FaultTree__Group__0__Impl rule__FaultTree__Group__1 )
            // InternalSafetyDSL.g:2056:2: rule__FaultTree__Group__0__Impl rule__FaultTree__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultTree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultTree__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__0"


    // $ANTLR start "rule__FaultTree__Group__0__Impl"
    // InternalSafetyDSL.g:2063:1: rule__FaultTree__Group__0__Impl : ( 'faultTree' ) ;
    public final void rule__FaultTree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2067:1: ( ( 'faultTree' ) )
            // InternalSafetyDSL.g:2068:1: ( 'faultTree' )
            {
            // InternalSafetyDSL.g:2068:1: ( 'faultTree' )
            // InternalSafetyDSL.g:2069:2: 'faultTree'
            {
             before(grammarAccess.getFaultTreeAccess().getFaultTreeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFaultTreeAccess().getFaultTreeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__0__Impl"


    // $ANTLR start "rule__FaultTree__Group__1"
    // InternalSafetyDSL.g:2078:1: rule__FaultTree__Group__1 : rule__FaultTree__Group__1__Impl rule__FaultTree__Group__2 ;
    public final void rule__FaultTree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2082:1: ( rule__FaultTree__Group__1__Impl rule__FaultTree__Group__2 )
            // InternalSafetyDSL.g:2083:2: rule__FaultTree__Group__1__Impl rule__FaultTree__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FaultTree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultTree__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__1"


    // $ANTLR start "rule__FaultTree__Group__1__Impl"
    // InternalSafetyDSL.g:2090:1: rule__FaultTree__Group__1__Impl : ( ( rule__FaultTree__NameAssignment_1 ) ) ;
    public final void rule__FaultTree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2094:1: ( ( ( rule__FaultTree__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:2095:1: ( ( rule__FaultTree__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:2095:1: ( ( rule__FaultTree__NameAssignment_1 ) )
            // InternalSafetyDSL.g:2096:2: ( rule__FaultTree__NameAssignment_1 )
            {
             before(grammarAccess.getFaultTreeAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:2097:2: ( rule__FaultTree__NameAssignment_1 )
            // InternalSafetyDSL.g:2097:3: rule__FaultTree__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultTree__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultTreeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__1__Impl"


    // $ANTLR start "rule__FaultTree__Group__2"
    // InternalSafetyDSL.g:2105:1: rule__FaultTree__Group__2 : rule__FaultTree__Group__2__Impl rule__FaultTree__Group__3 ;
    public final void rule__FaultTree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2109:1: ( rule__FaultTree__Group__2__Impl rule__FaultTree__Group__3 )
            // InternalSafetyDSL.g:2110:2: rule__FaultTree__Group__2__Impl rule__FaultTree__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FaultTree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultTree__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__2"


    // $ANTLR start "rule__FaultTree__Group__2__Impl"
    // InternalSafetyDSL.g:2117:1: rule__FaultTree__Group__2__Impl : ( ( rule__FaultTree__RootNodeAssignment_2 ) ) ;
    public final void rule__FaultTree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2121:1: ( ( ( rule__FaultTree__RootNodeAssignment_2 ) ) )
            // InternalSafetyDSL.g:2122:1: ( ( rule__FaultTree__RootNodeAssignment_2 ) )
            {
            // InternalSafetyDSL.g:2122:1: ( ( rule__FaultTree__RootNodeAssignment_2 ) )
            // InternalSafetyDSL.g:2123:2: ( rule__FaultTree__RootNodeAssignment_2 )
            {
             before(grammarAccess.getFaultTreeAccess().getRootNodeAssignment_2()); 
            // InternalSafetyDSL.g:2124:2: ( rule__FaultTree__RootNodeAssignment_2 )
            // InternalSafetyDSL.g:2124:3: rule__FaultTree__RootNodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FaultTree__RootNodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFaultTreeAccess().getRootNodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__2__Impl"


    // $ANTLR start "rule__FaultTree__Group__3"
    // InternalSafetyDSL.g:2132:1: rule__FaultTree__Group__3 : rule__FaultTree__Group__3__Impl ;
    public final void rule__FaultTree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2136:1: ( rule__FaultTree__Group__3__Impl )
            // InternalSafetyDSL.g:2137:2: rule__FaultTree__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultTree__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__3"


    // $ANTLR start "rule__FaultTree__Group__3__Impl"
    // InternalSafetyDSL.g:2143:1: rule__FaultTree__Group__3__Impl : ( ';' ) ;
    public final void rule__FaultTree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2147:1: ( ( ';' ) )
            // InternalSafetyDSL.g:2148:1: ( ';' )
            {
            // InternalSafetyDSL.g:2148:1: ( ';' )
            // InternalSafetyDSL.g:2149:2: ';'
            {
             before(grammarAccess.getFaultTreeAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFaultTreeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__Group__3__Impl"


    // $ANTLR start "rule__ORNode__Group__0"
    // InternalSafetyDSL.g:2159:1: rule__ORNode__Group__0 : rule__ORNode__Group__0__Impl rule__ORNode__Group__1 ;
    public final void rule__ORNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2163:1: ( rule__ORNode__Group__0__Impl rule__ORNode__Group__1 )
            // InternalSafetyDSL.g:2164:2: rule__ORNode__Group__0__Impl rule__ORNode__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ORNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group__0"


    // $ANTLR start "rule__ORNode__Group__0__Impl"
    // InternalSafetyDSL.g:2171:1: rule__ORNode__Group__0__Impl : ( ruleANDNode ) ;
    public final void rule__ORNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2175:1: ( ( ruleANDNode ) )
            // InternalSafetyDSL.g:2176:1: ( ruleANDNode )
            {
            // InternalSafetyDSL.g:2176:1: ( ruleANDNode )
            // InternalSafetyDSL.g:2177:2: ruleANDNode
            {
             before(grammarAccess.getORNodeAccess().getANDNodeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleANDNode();

            state._fsp--;

             after(grammarAccess.getORNodeAccess().getANDNodeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group__0__Impl"


    // $ANTLR start "rule__ORNode__Group__1"
    // InternalSafetyDSL.g:2186:1: rule__ORNode__Group__1 : rule__ORNode__Group__1__Impl ;
    public final void rule__ORNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2190:1: ( rule__ORNode__Group__1__Impl )
            // InternalSafetyDSL.g:2191:2: rule__ORNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORNode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group__1"


    // $ANTLR start "rule__ORNode__Group__1__Impl"
    // InternalSafetyDSL.g:2197:1: rule__ORNode__Group__1__Impl : ( ( rule__ORNode__Group_1__0 )* ) ;
    public final void rule__ORNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2201:1: ( ( ( rule__ORNode__Group_1__0 )* ) )
            // InternalSafetyDSL.g:2202:1: ( ( rule__ORNode__Group_1__0 )* )
            {
            // InternalSafetyDSL.g:2202:1: ( ( rule__ORNode__Group_1__0 )* )
            // InternalSafetyDSL.g:2203:2: ( rule__ORNode__Group_1__0 )*
            {
             before(grammarAccess.getORNodeAccess().getGroup_1()); 
            // InternalSafetyDSL.g:2204:2: ( rule__ORNode__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSafetyDSL.g:2204:3: rule__ORNode__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ORNode__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getORNodeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group__1__Impl"


    // $ANTLR start "rule__ORNode__Group_1__0"
    // InternalSafetyDSL.g:2213:1: rule__ORNode__Group_1__0 : rule__ORNode__Group_1__0__Impl rule__ORNode__Group_1__1 ;
    public final void rule__ORNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2217:1: ( rule__ORNode__Group_1__0__Impl rule__ORNode__Group_1__1 )
            // InternalSafetyDSL.g:2218:2: rule__ORNode__Group_1__0__Impl rule__ORNode__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ORNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORNode__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group_1__0"


    // $ANTLR start "rule__ORNode__Group_1__0__Impl"
    // InternalSafetyDSL.g:2225:1: rule__ORNode__Group_1__0__Impl : ( () ) ;
    public final void rule__ORNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2229:1: ( ( () ) )
            // InternalSafetyDSL.g:2230:1: ( () )
            {
            // InternalSafetyDSL.g:2230:1: ( () )
            // InternalSafetyDSL.g:2231:2: ()
            {
             before(grammarAccess.getORNodeAccess().getORNodeExpressionLeftAction_1_0()); 
            // InternalSafetyDSL.g:2232:2: ()
            // InternalSafetyDSL.g:2232:3: 
            {
            }

             after(grammarAccess.getORNodeAccess().getORNodeExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group_1__0__Impl"


    // $ANTLR start "rule__ORNode__Group_1__1"
    // InternalSafetyDSL.g:2240:1: rule__ORNode__Group_1__1 : rule__ORNode__Group_1__1__Impl rule__ORNode__Group_1__2 ;
    public final void rule__ORNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2244:1: ( rule__ORNode__Group_1__1__Impl rule__ORNode__Group_1__2 )
            // InternalSafetyDSL.g:2245:2: rule__ORNode__Group_1__1__Impl rule__ORNode__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ORNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORNode__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group_1__1"


    // $ANTLR start "rule__ORNode__Group_1__1__Impl"
    // InternalSafetyDSL.g:2252:1: rule__ORNode__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__ORNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2256:1: ( ( 'OR' ) )
            // InternalSafetyDSL.g:2257:1: ( 'OR' )
            {
            // InternalSafetyDSL.g:2257:1: ( 'OR' )
            // InternalSafetyDSL.g:2258:2: 'OR'
            {
             before(grammarAccess.getORNodeAccess().getORKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getORNodeAccess().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group_1__1__Impl"


    // $ANTLR start "rule__ORNode__Group_1__2"
    // InternalSafetyDSL.g:2267:1: rule__ORNode__Group_1__2 : rule__ORNode__Group_1__2__Impl ;
    public final void rule__ORNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2271:1: ( rule__ORNode__Group_1__2__Impl )
            // InternalSafetyDSL.g:2272:2: rule__ORNode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORNode__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group_1__2"


    // $ANTLR start "rule__ORNode__Group_1__2__Impl"
    // InternalSafetyDSL.g:2278:1: rule__ORNode__Group_1__2__Impl : ( ( rule__ORNode__RightAssignment_1_2 ) ) ;
    public final void rule__ORNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2282:1: ( ( ( rule__ORNode__RightAssignment_1_2 ) ) )
            // InternalSafetyDSL.g:2283:1: ( ( rule__ORNode__RightAssignment_1_2 ) )
            {
            // InternalSafetyDSL.g:2283:1: ( ( rule__ORNode__RightAssignment_1_2 ) )
            // InternalSafetyDSL.g:2284:2: ( rule__ORNode__RightAssignment_1_2 )
            {
             before(grammarAccess.getORNodeAccess().getRightAssignment_1_2()); 
            // InternalSafetyDSL.g:2285:2: ( rule__ORNode__RightAssignment_1_2 )
            // InternalSafetyDSL.g:2285:3: rule__ORNode__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ORNode__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getORNodeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__Group_1__2__Impl"


    // $ANTLR start "rule__ANDNode__Group__0"
    // InternalSafetyDSL.g:2294:1: rule__ANDNode__Group__0 : rule__ANDNode__Group__0__Impl rule__ANDNode__Group__1 ;
    public final void rule__ANDNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2298:1: ( rule__ANDNode__Group__0__Impl rule__ANDNode__Group__1 )
            // InternalSafetyDSL.g:2299:2: rule__ANDNode__Group__0__Impl rule__ANDNode__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ANDNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group__0"


    // $ANTLR start "rule__ANDNode__Group__0__Impl"
    // InternalSafetyDSL.g:2306:1: rule__ANDNode__Group__0__Impl : ( rulePrimaryNode ) ;
    public final void rule__ANDNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2310:1: ( ( rulePrimaryNode ) )
            // InternalSafetyDSL.g:2311:1: ( rulePrimaryNode )
            {
            // InternalSafetyDSL.g:2311:1: ( rulePrimaryNode )
            // InternalSafetyDSL.g:2312:2: rulePrimaryNode
            {
             before(grammarAccess.getANDNodeAccess().getPrimaryNodeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryNode();

            state._fsp--;

             after(grammarAccess.getANDNodeAccess().getPrimaryNodeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group__0__Impl"


    // $ANTLR start "rule__ANDNode__Group__1"
    // InternalSafetyDSL.g:2321:1: rule__ANDNode__Group__1 : rule__ANDNode__Group__1__Impl ;
    public final void rule__ANDNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2325:1: ( rule__ANDNode__Group__1__Impl )
            // InternalSafetyDSL.g:2326:2: rule__ANDNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDNode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group__1"


    // $ANTLR start "rule__ANDNode__Group__1__Impl"
    // InternalSafetyDSL.g:2332:1: rule__ANDNode__Group__1__Impl : ( ( rule__ANDNode__Group_1__0 )* ) ;
    public final void rule__ANDNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2336:1: ( ( ( rule__ANDNode__Group_1__0 )* ) )
            // InternalSafetyDSL.g:2337:1: ( ( rule__ANDNode__Group_1__0 )* )
            {
            // InternalSafetyDSL.g:2337:1: ( ( rule__ANDNode__Group_1__0 )* )
            // InternalSafetyDSL.g:2338:2: ( rule__ANDNode__Group_1__0 )*
            {
             before(grammarAccess.getANDNodeAccess().getGroup_1()); 
            // InternalSafetyDSL.g:2339:2: ( rule__ANDNode__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSafetyDSL.g:2339:3: rule__ANDNode__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ANDNode__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getANDNodeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group__1__Impl"


    // $ANTLR start "rule__ANDNode__Group_1__0"
    // InternalSafetyDSL.g:2348:1: rule__ANDNode__Group_1__0 : rule__ANDNode__Group_1__0__Impl rule__ANDNode__Group_1__1 ;
    public final void rule__ANDNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2352:1: ( rule__ANDNode__Group_1__0__Impl rule__ANDNode__Group_1__1 )
            // InternalSafetyDSL.g:2353:2: rule__ANDNode__Group_1__0__Impl rule__ANDNode__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ANDNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDNode__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group_1__0"


    // $ANTLR start "rule__ANDNode__Group_1__0__Impl"
    // InternalSafetyDSL.g:2360:1: rule__ANDNode__Group_1__0__Impl : ( () ) ;
    public final void rule__ANDNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2364:1: ( ( () ) )
            // InternalSafetyDSL.g:2365:1: ( () )
            {
            // InternalSafetyDSL.g:2365:1: ( () )
            // InternalSafetyDSL.g:2366:2: ()
            {
             before(grammarAccess.getANDNodeAccess().getANDNodeExpressionLeftAction_1_0()); 
            // InternalSafetyDSL.g:2367:2: ()
            // InternalSafetyDSL.g:2367:3: 
            {
            }

             after(grammarAccess.getANDNodeAccess().getANDNodeExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group_1__0__Impl"


    // $ANTLR start "rule__ANDNode__Group_1__1"
    // InternalSafetyDSL.g:2375:1: rule__ANDNode__Group_1__1 : rule__ANDNode__Group_1__1__Impl rule__ANDNode__Group_1__2 ;
    public final void rule__ANDNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2379:1: ( rule__ANDNode__Group_1__1__Impl rule__ANDNode__Group_1__2 )
            // InternalSafetyDSL.g:2380:2: rule__ANDNode__Group_1__1__Impl rule__ANDNode__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ANDNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDNode__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group_1__1"


    // $ANTLR start "rule__ANDNode__Group_1__1__Impl"
    // InternalSafetyDSL.g:2387:1: rule__ANDNode__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__ANDNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2391:1: ( ( 'AND' ) )
            // InternalSafetyDSL.g:2392:1: ( 'AND' )
            {
            // InternalSafetyDSL.g:2392:1: ( 'AND' )
            // InternalSafetyDSL.g:2393:2: 'AND'
            {
             before(grammarAccess.getANDNodeAccess().getANDKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getANDNodeAccess().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group_1__1__Impl"


    // $ANTLR start "rule__ANDNode__Group_1__2"
    // InternalSafetyDSL.g:2402:1: rule__ANDNode__Group_1__2 : rule__ANDNode__Group_1__2__Impl ;
    public final void rule__ANDNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2406:1: ( rule__ANDNode__Group_1__2__Impl )
            // InternalSafetyDSL.g:2407:2: rule__ANDNode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDNode__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group_1__2"


    // $ANTLR start "rule__ANDNode__Group_1__2__Impl"
    // InternalSafetyDSL.g:2413:1: rule__ANDNode__Group_1__2__Impl : ( ( rule__ANDNode__RightAssignment_1_2 ) ) ;
    public final void rule__ANDNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2417:1: ( ( ( rule__ANDNode__RightAssignment_1_2 ) ) )
            // InternalSafetyDSL.g:2418:1: ( ( rule__ANDNode__RightAssignment_1_2 ) )
            {
            // InternalSafetyDSL.g:2418:1: ( ( rule__ANDNode__RightAssignment_1_2 ) )
            // InternalSafetyDSL.g:2419:2: ( rule__ANDNode__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDNodeAccess().getRightAssignment_1_2()); 
            // InternalSafetyDSL.g:2420:2: ( rule__ANDNode__RightAssignment_1_2 )
            // InternalSafetyDSL.g:2420:3: rule__ANDNode__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ANDNode__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getANDNodeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryNode__Group_1__0"
    // InternalSafetyDSL.g:2429:1: rule__PrimaryNode__Group_1__0 : rule__PrimaryNode__Group_1__0__Impl rule__PrimaryNode__Group_1__1 ;
    public final void rule__PrimaryNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2433:1: ( rule__PrimaryNode__Group_1__0__Impl rule__PrimaryNode__Group_1__1 )
            // InternalSafetyDSL.g:2434:2: rule__PrimaryNode__Group_1__0__Impl rule__PrimaryNode__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__PrimaryNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryNode__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__Group_1__0"


    // $ANTLR start "rule__PrimaryNode__Group_1__0__Impl"
    // InternalSafetyDSL.g:2441:1: rule__PrimaryNode__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2445:1: ( ( '(' ) )
            // InternalSafetyDSL.g:2446:1: ( '(' )
            {
            // InternalSafetyDSL.g:2446:1: ( '(' )
            // InternalSafetyDSL.g:2447:2: '('
            {
             before(grammarAccess.getPrimaryNodeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryNodeAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryNode__Group_1__1"
    // InternalSafetyDSL.g:2456:1: rule__PrimaryNode__Group_1__1 : rule__PrimaryNode__Group_1__1__Impl rule__PrimaryNode__Group_1__2 ;
    public final void rule__PrimaryNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2460:1: ( rule__PrimaryNode__Group_1__1__Impl rule__PrimaryNode__Group_1__2 )
            // InternalSafetyDSL.g:2461:2: rule__PrimaryNode__Group_1__1__Impl rule__PrimaryNode__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__PrimaryNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryNode__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__Group_1__1"


    // $ANTLR start "rule__PrimaryNode__Group_1__1__Impl"
    // InternalSafetyDSL.g:2468:1: rule__PrimaryNode__Group_1__1__Impl : ( ruleORNode ) ;
    public final void rule__PrimaryNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2472:1: ( ( ruleORNode ) )
            // InternalSafetyDSL.g:2473:1: ( ruleORNode )
            {
            // InternalSafetyDSL.g:2473:1: ( ruleORNode )
            // InternalSafetyDSL.g:2474:2: ruleORNode
            {
             before(grammarAccess.getPrimaryNodeAccess().getORNodeParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleORNode();

            state._fsp--;

             after(grammarAccess.getPrimaryNodeAccess().getORNodeParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryNode__Group_1__2"
    // InternalSafetyDSL.g:2483:1: rule__PrimaryNode__Group_1__2 : rule__PrimaryNode__Group_1__2__Impl ;
    public final void rule__PrimaryNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2487:1: ( rule__PrimaryNode__Group_1__2__Impl )
            // InternalSafetyDSL.g:2488:2: rule__PrimaryNode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryNode__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__Group_1__2"


    // $ANTLR start "rule__PrimaryNode__Group_1__2__Impl"
    // InternalSafetyDSL.g:2494:1: rule__PrimaryNode__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2498:1: ( ( ')' ) )
            // InternalSafetyDSL.g:2499:1: ( ')' )
            {
            // InternalSafetyDSL.g:2499:1: ( ')' )
            // InternalSafetyDSL.g:2500:2: ')'
            {
             before(grammarAccess.getPrimaryNodeAccess().getRightParenthesisKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimaryNodeAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__Group_1__2__Impl"


    // $ANTLR start "rule__DerivedFrom__Group__0"
    // InternalSafetyDSL.g:2510:1: rule__DerivedFrom__Group__0 : rule__DerivedFrom__Group__0__Impl rule__DerivedFrom__Group__1 ;
    public final void rule__DerivedFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2514:1: ( rule__DerivedFrom__Group__0__Impl rule__DerivedFrom__Group__1 )
            // InternalSafetyDSL.g:2515:2: rule__DerivedFrom__Group__0__Impl rule__DerivedFrom__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DerivedFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__0"


    // $ANTLR start "rule__DerivedFrom__Group__0__Impl"
    // InternalSafetyDSL.g:2522:1: rule__DerivedFrom__Group__0__Impl : ( ( rule__DerivedFrom__SafetyRequirementsAssignment_0 ) ) ;
    public final void rule__DerivedFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2526:1: ( ( ( rule__DerivedFrom__SafetyRequirementsAssignment_0 ) ) )
            // InternalSafetyDSL.g:2527:1: ( ( rule__DerivedFrom__SafetyRequirementsAssignment_0 ) )
            {
            // InternalSafetyDSL.g:2527:1: ( ( rule__DerivedFrom__SafetyRequirementsAssignment_0 ) )
            // InternalSafetyDSL.g:2528:2: ( rule__DerivedFrom__SafetyRequirementsAssignment_0 )
            {
             before(grammarAccess.getDerivedFromAccess().getSafetyRequirementsAssignment_0()); 
            // InternalSafetyDSL.g:2529:2: ( rule__DerivedFrom__SafetyRequirementsAssignment_0 )
            // InternalSafetyDSL.g:2529:3: rule__DerivedFrom__SafetyRequirementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DerivedFrom__SafetyRequirementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDerivedFromAccess().getSafetyRequirementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__0__Impl"


    // $ANTLR start "rule__DerivedFrom__Group__1"
    // InternalSafetyDSL.g:2537:1: rule__DerivedFrom__Group__1 : rule__DerivedFrom__Group__1__Impl rule__DerivedFrom__Group__2 ;
    public final void rule__DerivedFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2541:1: ( rule__DerivedFrom__Group__1__Impl rule__DerivedFrom__Group__2 )
            // InternalSafetyDSL.g:2542:2: rule__DerivedFrom__Group__1__Impl rule__DerivedFrom__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__DerivedFrom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__1"


    // $ANTLR start "rule__DerivedFrom__Group__1__Impl"
    // InternalSafetyDSL.g:2549:1: rule__DerivedFrom__Group__1__Impl : ( ( rule__DerivedFrom__Group_1__0 )* ) ;
    public final void rule__DerivedFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2553:1: ( ( ( rule__DerivedFrom__Group_1__0 )* ) )
            // InternalSafetyDSL.g:2554:1: ( ( rule__DerivedFrom__Group_1__0 )* )
            {
            // InternalSafetyDSL.g:2554:1: ( ( rule__DerivedFrom__Group_1__0 )* )
            // InternalSafetyDSL.g:2555:2: ( rule__DerivedFrom__Group_1__0 )*
            {
             before(grammarAccess.getDerivedFromAccess().getGroup_1()); 
            // InternalSafetyDSL.g:2556:2: ( rule__DerivedFrom__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSafetyDSL.g:2556:3: rule__DerivedFrom__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DerivedFrom__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDerivedFromAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__1__Impl"


    // $ANTLR start "rule__DerivedFrom__Group__2"
    // InternalSafetyDSL.g:2564:1: rule__DerivedFrom__Group__2 : rule__DerivedFrom__Group__2__Impl rule__DerivedFrom__Group__3 ;
    public final void rule__DerivedFrom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2568:1: ( rule__DerivedFrom__Group__2__Impl rule__DerivedFrom__Group__3 )
            // InternalSafetyDSL.g:2569:2: rule__DerivedFrom__Group__2__Impl rule__DerivedFrom__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DerivedFrom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__2"


    // $ANTLR start "rule__DerivedFrom__Group__2__Impl"
    // InternalSafetyDSL.g:2576:1: rule__DerivedFrom__Group__2__Impl : ( 'derivedFrom' ) ;
    public final void rule__DerivedFrom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2580:1: ( ( 'derivedFrom' ) )
            // InternalSafetyDSL.g:2581:1: ( 'derivedFrom' )
            {
            // InternalSafetyDSL.g:2581:1: ( 'derivedFrom' )
            // InternalSafetyDSL.g:2582:2: 'derivedFrom'
            {
             before(grammarAccess.getDerivedFromAccess().getDerivedFromKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDerivedFromAccess().getDerivedFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__2__Impl"


    // $ANTLR start "rule__DerivedFrom__Group__3"
    // InternalSafetyDSL.g:2591:1: rule__DerivedFrom__Group__3 : rule__DerivedFrom__Group__3__Impl rule__DerivedFrom__Group__4 ;
    public final void rule__DerivedFrom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2595:1: ( rule__DerivedFrom__Group__3__Impl rule__DerivedFrom__Group__4 )
            // InternalSafetyDSL.g:2596:2: rule__DerivedFrom__Group__3__Impl rule__DerivedFrom__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DerivedFrom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__3"


    // $ANTLR start "rule__DerivedFrom__Group__3__Impl"
    // InternalSafetyDSL.g:2603:1: rule__DerivedFrom__Group__3__Impl : ( ( rule__DerivedFrom__HazardAssignment_3 ) ) ;
    public final void rule__DerivedFrom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2607:1: ( ( ( rule__DerivedFrom__HazardAssignment_3 ) ) )
            // InternalSafetyDSL.g:2608:1: ( ( rule__DerivedFrom__HazardAssignment_3 ) )
            {
            // InternalSafetyDSL.g:2608:1: ( ( rule__DerivedFrom__HazardAssignment_3 ) )
            // InternalSafetyDSL.g:2609:2: ( rule__DerivedFrom__HazardAssignment_3 )
            {
             before(grammarAccess.getDerivedFromAccess().getHazardAssignment_3()); 
            // InternalSafetyDSL.g:2610:2: ( rule__DerivedFrom__HazardAssignment_3 )
            // InternalSafetyDSL.g:2610:3: rule__DerivedFrom__HazardAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DerivedFrom__HazardAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDerivedFromAccess().getHazardAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__3__Impl"


    // $ANTLR start "rule__DerivedFrom__Group__4"
    // InternalSafetyDSL.g:2618:1: rule__DerivedFrom__Group__4 : rule__DerivedFrom__Group__4__Impl ;
    public final void rule__DerivedFrom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2622:1: ( rule__DerivedFrom__Group__4__Impl )
            // InternalSafetyDSL.g:2623:2: rule__DerivedFrom__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__4"


    // $ANTLR start "rule__DerivedFrom__Group__4__Impl"
    // InternalSafetyDSL.g:2629:1: rule__DerivedFrom__Group__4__Impl : ( ';' ) ;
    public final void rule__DerivedFrom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2633:1: ( ( ';' ) )
            // InternalSafetyDSL.g:2634:1: ( ';' )
            {
            // InternalSafetyDSL.g:2634:1: ( ';' )
            // InternalSafetyDSL.g:2635:2: ';'
            {
             before(grammarAccess.getDerivedFromAccess().getSemicolonKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDerivedFromAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group__4__Impl"


    // $ANTLR start "rule__DerivedFrom__Group_1__0"
    // InternalSafetyDSL.g:2645:1: rule__DerivedFrom__Group_1__0 : rule__DerivedFrom__Group_1__0__Impl rule__DerivedFrom__Group_1__1 ;
    public final void rule__DerivedFrom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2649:1: ( rule__DerivedFrom__Group_1__0__Impl rule__DerivedFrom__Group_1__1 )
            // InternalSafetyDSL.g:2650:2: rule__DerivedFrom__Group_1__0__Impl rule__DerivedFrom__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__DerivedFrom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group_1__0"


    // $ANTLR start "rule__DerivedFrom__Group_1__0__Impl"
    // InternalSafetyDSL.g:2657:1: rule__DerivedFrom__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DerivedFrom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2661:1: ( ( ',' ) )
            // InternalSafetyDSL.g:2662:1: ( ',' )
            {
            // InternalSafetyDSL.g:2662:1: ( ',' )
            // InternalSafetyDSL.g:2663:2: ','
            {
             before(grammarAccess.getDerivedFromAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDerivedFromAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group_1__0__Impl"


    // $ANTLR start "rule__DerivedFrom__Group_1__1"
    // InternalSafetyDSL.g:2672:1: rule__DerivedFrom__Group_1__1 : rule__DerivedFrom__Group_1__1__Impl ;
    public final void rule__DerivedFrom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2676:1: ( rule__DerivedFrom__Group_1__1__Impl )
            // InternalSafetyDSL.g:2677:2: rule__DerivedFrom__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivedFrom__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group_1__1"


    // $ANTLR start "rule__DerivedFrom__Group_1__1__Impl"
    // InternalSafetyDSL.g:2683:1: rule__DerivedFrom__Group_1__1__Impl : ( ( rule__DerivedFrom__SafetyRequirementsAssignment_1_1 ) ) ;
    public final void rule__DerivedFrom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2687:1: ( ( ( rule__DerivedFrom__SafetyRequirementsAssignment_1_1 ) ) )
            // InternalSafetyDSL.g:2688:1: ( ( rule__DerivedFrom__SafetyRequirementsAssignment_1_1 ) )
            {
            // InternalSafetyDSL.g:2688:1: ( ( rule__DerivedFrom__SafetyRequirementsAssignment_1_1 ) )
            // InternalSafetyDSL.g:2689:2: ( rule__DerivedFrom__SafetyRequirementsAssignment_1_1 )
            {
             before(grammarAccess.getDerivedFromAccess().getSafetyRequirementsAssignment_1_1()); 
            // InternalSafetyDSL.g:2690:2: ( rule__DerivedFrom__SafetyRequirementsAssignment_1_1 )
            // InternalSafetyDSL.g:2690:3: rule__DerivedFrom__SafetyRequirementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DerivedFrom__SafetyRequirementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivedFromAccess().getSafetyRequirementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__Group_1__1__Impl"


    // $ANTLR start "rule__Causes__Group__0"
    // InternalSafetyDSL.g:2699:1: rule__Causes__Group__0 : rule__Causes__Group__0__Impl rule__Causes__Group__1 ;
    public final void rule__Causes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2703:1: ( rule__Causes__Group__0__Impl rule__Causes__Group__1 )
            // InternalSafetyDSL.g:2704:2: rule__Causes__Group__0__Impl rule__Causes__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Causes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Causes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__0"


    // $ANTLR start "rule__Causes__Group__0__Impl"
    // InternalSafetyDSL.g:2711:1: rule__Causes__Group__0__Impl : ( ( rule__Causes__HazardAssignment_0 ) ) ;
    public final void rule__Causes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2715:1: ( ( ( rule__Causes__HazardAssignment_0 ) ) )
            // InternalSafetyDSL.g:2716:1: ( ( rule__Causes__HazardAssignment_0 ) )
            {
            // InternalSafetyDSL.g:2716:1: ( ( rule__Causes__HazardAssignment_0 ) )
            // InternalSafetyDSL.g:2717:2: ( rule__Causes__HazardAssignment_0 )
            {
             before(grammarAccess.getCausesAccess().getHazardAssignment_0()); 
            // InternalSafetyDSL.g:2718:2: ( rule__Causes__HazardAssignment_0 )
            // InternalSafetyDSL.g:2718:3: rule__Causes__HazardAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Causes__HazardAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCausesAccess().getHazardAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__0__Impl"


    // $ANTLR start "rule__Causes__Group__1"
    // InternalSafetyDSL.g:2726:1: rule__Causes__Group__1 : rule__Causes__Group__1__Impl rule__Causes__Group__2 ;
    public final void rule__Causes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2730:1: ( rule__Causes__Group__1__Impl rule__Causes__Group__2 )
            // InternalSafetyDSL.g:2731:2: rule__Causes__Group__1__Impl rule__Causes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Causes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Causes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__1"


    // $ANTLR start "rule__Causes__Group__1__Impl"
    // InternalSafetyDSL.g:2738:1: rule__Causes__Group__1__Impl : ( 'causes' ) ;
    public final void rule__Causes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2742:1: ( ( 'causes' ) )
            // InternalSafetyDSL.g:2743:1: ( 'causes' )
            {
            // InternalSafetyDSL.g:2743:1: ( 'causes' )
            // InternalSafetyDSL.g:2744:2: 'causes'
            {
             before(grammarAccess.getCausesAccess().getCausesKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCausesAccess().getCausesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__1__Impl"


    // $ANTLR start "rule__Causes__Group__2"
    // InternalSafetyDSL.g:2753:1: rule__Causes__Group__2 : rule__Causes__Group__2__Impl rule__Causes__Group__3 ;
    public final void rule__Causes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2757:1: ( rule__Causes__Group__2__Impl rule__Causes__Group__3 )
            // InternalSafetyDSL.g:2758:2: rule__Causes__Group__2__Impl rule__Causes__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Causes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Causes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__2"


    // $ANTLR start "rule__Causes__Group__2__Impl"
    // InternalSafetyDSL.g:2765:1: rule__Causes__Group__2__Impl : ( ( rule__Causes__ConsequencesAssignment_2 ) ) ;
    public final void rule__Causes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2769:1: ( ( ( rule__Causes__ConsequencesAssignment_2 ) ) )
            // InternalSafetyDSL.g:2770:1: ( ( rule__Causes__ConsequencesAssignment_2 ) )
            {
            // InternalSafetyDSL.g:2770:1: ( ( rule__Causes__ConsequencesAssignment_2 ) )
            // InternalSafetyDSL.g:2771:2: ( rule__Causes__ConsequencesAssignment_2 )
            {
             before(grammarAccess.getCausesAccess().getConsequencesAssignment_2()); 
            // InternalSafetyDSL.g:2772:2: ( rule__Causes__ConsequencesAssignment_2 )
            // InternalSafetyDSL.g:2772:3: rule__Causes__ConsequencesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Causes__ConsequencesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCausesAccess().getConsequencesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__2__Impl"


    // $ANTLR start "rule__Causes__Group__3"
    // InternalSafetyDSL.g:2780:1: rule__Causes__Group__3 : rule__Causes__Group__3__Impl rule__Causes__Group__4 ;
    public final void rule__Causes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2784:1: ( rule__Causes__Group__3__Impl rule__Causes__Group__4 )
            // InternalSafetyDSL.g:2785:2: rule__Causes__Group__3__Impl rule__Causes__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Causes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Causes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__3"


    // $ANTLR start "rule__Causes__Group__3__Impl"
    // InternalSafetyDSL.g:2792:1: rule__Causes__Group__3__Impl : ( ( rule__Causes__Group_3__0 )* ) ;
    public final void rule__Causes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2796:1: ( ( ( rule__Causes__Group_3__0 )* ) )
            // InternalSafetyDSL.g:2797:1: ( ( rule__Causes__Group_3__0 )* )
            {
            // InternalSafetyDSL.g:2797:1: ( ( rule__Causes__Group_3__0 )* )
            // InternalSafetyDSL.g:2798:2: ( rule__Causes__Group_3__0 )*
            {
             before(grammarAccess.getCausesAccess().getGroup_3()); 
            // InternalSafetyDSL.g:2799:2: ( rule__Causes__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSafetyDSL.g:2799:3: rule__Causes__Group_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Causes__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCausesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__3__Impl"


    // $ANTLR start "rule__Causes__Group__4"
    // InternalSafetyDSL.g:2807:1: rule__Causes__Group__4 : rule__Causes__Group__4__Impl ;
    public final void rule__Causes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2811:1: ( rule__Causes__Group__4__Impl )
            // InternalSafetyDSL.g:2812:2: rule__Causes__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Causes__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__4"


    // $ANTLR start "rule__Causes__Group__4__Impl"
    // InternalSafetyDSL.g:2818:1: rule__Causes__Group__4__Impl : ( ';' ) ;
    public final void rule__Causes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2822:1: ( ( ';' ) )
            // InternalSafetyDSL.g:2823:1: ( ';' )
            {
            // InternalSafetyDSL.g:2823:1: ( ';' )
            // InternalSafetyDSL.g:2824:2: ';'
            {
             before(grammarAccess.getCausesAccess().getSemicolonKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCausesAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group__4__Impl"


    // $ANTLR start "rule__Causes__Group_3__0"
    // InternalSafetyDSL.g:2834:1: rule__Causes__Group_3__0 : rule__Causes__Group_3__0__Impl rule__Causes__Group_3__1 ;
    public final void rule__Causes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2838:1: ( rule__Causes__Group_3__0__Impl rule__Causes__Group_3__1 )
            // InternalSafetyDSL.g:2839:2: rule__Causes__Group_3__0__Impl rule__Causes__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Causes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Causes__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group_3__0"


    // $ANTLR start "rule__Causes__Group_3__0__Impl"
    // InternalSafetyDSL.g:2846:1: rule__Causes__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Causes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2850:1: ( ( ',' ) )
            // InternalSafetyDSL.g:2851:1: ( ',' )
            {
            // InternalSafetyDSL.g:2851:1: ( ',' )
            // InternalSafetyDSL.g:2852:2: ','
            {
             before(grammarAccess.getCausesAccess().getCommaKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCausesAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group_3__0__Impl"


    // $ANTLR start "rule__Causes__Group_3__1"
    // InternalSafetyDSL.g:2861:1: rule__Causes__Group_3__1 : rule__Causes__Group_3__1__Impl ;
    public final void rule__Causes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2865:1: ( rule__Causes__Group_3__1__Impl )
            // InternalSafetyDSL.g:2866:2: rule__Causes__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Causes__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group_3__1"


    // $ANTLR start "rule__Causes__Group_3__1__Impl"
    // InternalSafetyDSL.g:2872:1: rule__Causes__Group_3__1__Impl : ( ( rule__Causes__ConsequencesAssignment_3_1 ) ) ;
    public final void rule__Causes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2876:1: ( ( ( rule__Causes__ConsequencesAssignment_3_1 ) ) )
            // InternalSafetyDSL.g:2877:1: ( ( rule__Causes__ConsequencesAssignment_3_1 ) )
            {
            // InternalSafetyDSL.g:2877:1: ( ( rule__Causes__ConsequencesAssignment_3_1 ) )
            // InternalSafetyDSL.g:2878:2: ( rule__Causes__ConsequencesAssignment_3_1 )
            {
             before(grammarAccess.getCausesAccess().getConsequencesAssignment_3_1()); 
            // InternalSafetyDSL.g:2879:2: ( rule__Causes__ConsequencesAssignment_3_1 )
            // InternalSafetyDSL.g:2879:3: rule__Causes__ConsequencesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Causes__ConsequencesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCausesAccess().getConsequencesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__Group_3__1__Impl"


    // $ANTLR start "rule__CausedBy__Group__0"
    // InternalSafetyDSL.g:2888:1: rule__CausedBy__Group__0 : rule__CausedBy__Group__0__Impl rule__CausedBy__Group__1 ;
    public final void rule__CausedBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2892:1: ( rule__CausedBy__Group__0__Impl rule__CausedBy__Group__1 )
            // InternalSafetyDSL.g:2893:2: rule__CausedBy__Group__0__Impl rule__CausedBy__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__CausedBy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CausedBy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__0"


    // $ANTLR start "rule__CausedBy__Group__0__Impl"
    // InternalSafetyDSL.g:2900:1: rule__CausedBy__Group__0__Impl : ( ( rule__CausedBy__HazardAssignment_0 ) ) ;
    public final void rule__CausedBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2904:1: ( ( ( rule__CausedBy__HazardAssignment_0 ) ) )
            // InternalSafetyDSL.g:2905:1: ( ( rule__CausedBy__HazardAssignment_0 ) )
            {
            // InternalSafetyDSL.g:2905:1: ( ( rule__CausedBy__HazardAssignment_0 ) )
            // InternalSafetyDSL.g:2906:2: ( rule__CausedBy__HazardAssignment_0 )
            {
             before(grammarAccess.getCausedByAccess().getHazardAssignment_0()); 
            // InternalSafetyDSL.g:2907:2: ( rule__CausedBy__HazardAssignment_0 )
            // InternalSafetyDSL.g:2907:3: rule__CausedBy__HazardAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CausedBy__HazardAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCausedByAccess().getHazardAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__0__Impl"


    // $ANTLR start "rule__CausedBy__Group__1"
    // InternalSafetyDSL.g:2915:1: rule__CausedBy__Group__1 : rule__CausedBy__Group__1__Impl rule__CausedBy__Group__2 ;
    public final void rule__CausedBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2919:1: ( rule__CausedBy__Group__1__Impl rule__CausedBy__Group__2 )
            // InternalSafetyDSL.g:2920:2: rule__CausedBy__Group__1__Impl rule__CausedBy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CausedBy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CausedBy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__1"


    // $ANTLR start "rule__CausedBy__Group__1__Impl"
    // InternalSafetyDSL.g:2927:1: rule__CausedBy__Group__1__Impl : ( 'causedBy' ) ;
    public final void rule__CausedBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2931:1: ( ( 'causedBy' ) )
            // InternalSafetyDSL.g:2932:1: ( 'causedBy' )
            {
            // InternalSafetyDSL.g:2932:1: ( 'causedBy' )
            // InternalSafetyDSL.g:2933:2: 'causedBy'
            {
             before(grammarAccess.getCausedByAccess().getCausedByKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCausedByAccess().getCausedByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__1__Impl"


    // $ANTLR start "rule__CausedBy__Group__2"
    // InternalSafetyDSL.g:2942:1: rule__CausedBy__Group__2 : rule__CausedBy__Group__2__Impl rule__CausedBy__Group__3 ;
    public final void rule__CausedBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2946:1: ( rule__CausedBy__Group__2__Impl rule__CausedBy__Group__3 )
            // InternalSafetyDSL.g:2947:2: rule__CausedBy__Group__2__Impl rule__CausedBy__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CausedBy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CausedBy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__2"


    // $ANTLR start "rule__CausedBy__Group__2__Impl"
    // InternalSafetyDSL.g:2954:1: rule__CausedBy__Group__2__Impl : ( ( rule__CausedBy__FaultAssignment_2 ) ) ;
    public final void rule__CausedBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2958:1: ( ( ( rule__CausedBy__FaultAssignment_2 ) ) )
            // InternalSafetyDSL.g:2959:1: ( ( rule__CausedBy__FaultAssignment_2 ) )
            {
            // InternalSafetyDSL.g:2959:1: ( ( rule__CausedBy__FaultAssignment_2 ) )
            // InternalSafetyDSL.g:2960:2: ( rule__CausedBy__FaultAssignment_2 )
            {
             before(grammarAccess.getCausedByAccess().getFaultAssignment_2()); 
            // InternalSafetyDSL.g:2961:2: ( rule__CausedBy__FaultAssignment_2 )
            // InternalSafetyDSL.g:2961:3: rule__CausedBy__FaultAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CausedBy__FaultAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCausedByAccess().getFaultAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__2__Impl"


    // $ANTLR start "rule__CausedBy__Group__3"
    // InternalSafetyDSL.g:2969:1: rule__CausedBy__Group__3 : rule__CausedBy__Group__3__Impl ;
    public final void rule__CausedBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2973:1: ( rule__CausedBy__Group__3__Impl )
            // InternalSafetyDSL.g:2974:2: rule__CausedBy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CausedBy__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__3"


    // $ANTLR start "rule__CausedBy__Group__3__Impl"
    // InternalSafetyDSL.g:2980:1: rule__CausedBy__Group__3__Impl : ( ';' ) ;
    public final void rule__CausedBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:2984:1: ( ( ';' ) )
            // InternalSafetyDSL.g:2985:1: ( ';' )
            {
            // InternalSafetyDSL.g:2985:1: ( ';' )
            // InternalSafetyDSL.g:2986:2: ';'
            {
             before(grammarAccess.getCausedByAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCausedByAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__Group__3__Impl"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__0"
    // InternalSafetyDSL.g:2996:1: rule__SafetyTacticViewpoint__Group__0 : rule__SafetyTacticViewpoint__Group__0__Impl rule__SafetyTacticViewpoint__Group__1 ;
    public final void rule__SafetyTacticViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3000:1: ( rule__SafetyTacticViewpoint__Group__0__Impl rule__SafetyTacticViewpoint__Group__1 )
            // InternalSafetyDSL.g:3001:2: rule__SafetyTacticViewpoint__Group__0__Impl rule__SafetyTacticViewpoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyTacticViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__0"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__0__Impl"
    // InternalSafetyDSL.g:3008:1: rule__SafetyTacticViewpoint__Group__0__Impl : ( 'SafetyTacticView' ) ;
    public final void rule__SafetyTacticViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3012:1: ( ( 'SafetyTacticView' ) )
            // InternalSafetyDSL.g:3013:1: ( 'SafetyTacticView' )
            {
            // InternalSafetyDSL.g:3013:1: ( 'SafetyTacticView' )
            // InternalSafetyDSL.g:3014:2: 'SafetyTacticView'
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticViewKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__0__Impl"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__1"
    // InternalSafetyDSL.g:3023:1: rule__SafetyTacticViewpoint__Group__1 : rule__SafetyTacticViewpoint__Group__1__Impl rule__SafetyTacticViewpoint__Group__2 ;
    public final void rule__SafetyTacticViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3027:1: ( rule__SafetyTacticViewpoint__Group__1__Impl rule__SafetyTacticViewpoint__Group__2 )
            // InternalSafetyDSL.g:3028:2: rule__SafetyTacticViewpoint__Group__1__Impl rule__SafetyTacticViewpoint__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SafetyTacticViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__1"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__1__Impl"
    // InternalSafetyDSL.g:3035:1: rule__SafetyTacticViewpoint__Group__1__Impl : ( ( rule__SafetyTacticViewpoint__NameAssignment_1 ) ) ;
    public final void rule__SafetyTacticViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3039:1: ( ( ( rule__SafetyTacticViewpoint__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:3040:1: ( ( rule__SafetyTacticViewpoint__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:3040:1: ( ( rule__SafetyTacticViewpoint__NameAssignment_1 ) )
            // InternalSafetyDSL.g:3041:2: ( rule__SafetyTacticViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:3042:2: ( rule__SafetyTacticViewpoint__NameAssignment_1 )
            // InternalSafetyDSL.g:3042:3: rule__SafetyTacticViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyTacticViewpointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__1__Impl"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__2"
    // InternalSafetyDSL.g:3050:1: rule__SafetyTacticViewpoint__Group__2 : rule__SafetyTacticViewpoint__Group__2__Impl rule__SafetyTacticViewpoint__Group__3 ;
    public final void rule__SafetyTacticViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3054:1: ( rule__SafetyTacticViewpoint__Group__2__Impl rule__SafetyTacticViewpoint__Group__3 )
            // InternalSafetyDSL.g:3055:2: rule__SafetyTacticViewpoint__Group__2__Impl rule__SafetyTacticViewpoint__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SafetyTacticViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__2"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__2__Impl"
    // InternalSafetyDSL.g:3062:1: rule__SafetyTacticViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__SafetyTacticViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3066:1: ( ( '{' ) )
            // InternalSafetyDSL.g:3067:1: ( '{' )
            {
            // InternalSafetyDSL.g:3067:1: ( '{' )
            // InternalSafetyDSL.g:3068:2: '{'
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSafetyTacticViewpointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__2__Impl"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__3"
    // InternalSafetyDSL.g:3077:1: rule__SafetyTacticViewpoint__Group__3 : rule__SafetyTacticViewpoint__Group__3__Impl rule__SafetyTacticViewpoint__Group__4 ;
    public final void rule__SafetyTacticViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3081:1: ( rule__SafetyTacticViewpoint__Group__3__Impl rule__SafetyTacticViewpoint__Group__4 )
            // InternalSafetyDSL.g:3082:2: rule__SafetyTacticViewpoint__Group__3__Impl rule__SafetyTacticViewpoint__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SafetyTacticViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__3"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__3__Impl"
    // InternalSafetyDSL.g:3089:1: rule__SafetyTacticViewpoint__Group__3__Impl : ( ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 ) ) ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )* ) ) ;
    public final void rule__SafetyTacticViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3093:1: ( ( ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 ) ) ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )* ) ) )
            // InternalSafetyDSL.g:3094:1: ( ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 ) ) ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )* ) )
            {
            // InternalSafetyDSL.g:3094:1: ( ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 ) ) ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )* ) )
            // InternalSafetyDSL.g:3095:2: ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 ) ) ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )* )
            {
            // InternalSafetyDSL.g:3095:2: ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 ) )
            // InternalSafetyDSL.g:3096:3: ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsAssignment_3()); 
            // InternalSafetyDSL.g:3097:3: ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )
            // InternalSafetyDSL.g:3097:4: rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3
            {
            pushFollow(FOLLOW_28);
            rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsAssignment_3()); 

            }

            // InternalSafetyDSL.g:3100:2: ( ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )* )
            // InternalSafetyDSL.g:3101:3: ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )*
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsAssignment_3()); 
            // InternalSafetyDSL.g:3102:3: ( rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32||LA21_0==35||LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSafetyDSL.g:3102:4: rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__3__Impl"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__4"
    // InternalSafetyDSL.g:3111:1: rule__SafetyTacticViewpoint__Group__4 : rule__SafetyTacticViewpoint__Group__4__Impl ;
    public final void rule__SafetyTacticViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3115:1: ( rule__SafetyTacticViewpoint__Group__4__Impl )
            // InternalSafetyDSL.g:3116:2: rule__SafetyTacticViewpoint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyTacticViewpoint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__4"


    // $ANTLR start "rule__SafetyTacticViewpoint__Group__4__Impl"
    // InternalSafetyDSL.g:3122:1: rule__SafetyTacticViewpoint__Group__4__Impl : ( '}' ) ;
    public final void rule__SafetyTacticViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3126:1: ( ( '}' ) )
            // InternalSafetyDSL.g:3127:1: ( '}' )
            {
            // InternalSafetyDSL.g:3127:1: ( '}' )
            // InternalSafetyDSL.g:3128:2: '}'
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSafetyTacticViewpointAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSafetyDSL.g:3138:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3142:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSafetyDSL.g:3143:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSafetyDSL.g:3150:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3154:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:3155:1: ( RULE_ID )
            {
            // InternalSafetyDSL.g:3155:1: ( RULE_ID )
            // InternalSafetyDSL.g:3156:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalSafetyDSL.g:3165:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3169:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSafetyDSL.g:3170:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSafetyDSL.g:3176:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3180:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSafetyDSL.g:3181:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSafetyDSL.g:3181:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSafetyDSL.g:3182:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSafetyDSL.g:3183:2: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSafetyDSL.g:3183:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSafetyDSL.g:3192:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3196:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSafetyDSL.g:3197:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalSafetyDSL.g:3204:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3208:1: ( ( '.' ) )
            // InternalSafetyDSL.g:3209:1: ( '.' )
            {
            // InternalSafetyDSL.g:3209:1: ( '.' )
            // InternalSafetyDSL.g:3210:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSafetyDSL.g:3219:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3223:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSafetyDSL.g:3224:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalSafetyDSL.g:3230:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3234:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:3235:1: ( RULE_ID )
            {
            // InternalSafetyDSL.g:3235:1: ( RULE_ID )
            // InternalSafetyDSL.g:3236:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__FaultAvoidance__Group__0"
    // InternalSafetyDSL.g:3246:1: rule__FaultAvoidance__Group__0 : rule__FaultAvoidance__Group__0__Impl rule__FaultAvoidance__Group__1 ;
    public final void rule__FaultAvoidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3250:1: ( rule__FaultAvoidance__Group__0__Impl rule__FaultAvoidance__Group__1 )
            // InternalSafetyDSL.g:3251:2: rule__FaultAvoidance__Group__0__Impl rule__FaultAvoidance__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultAvoidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__0"


    // $ANTLR start "rule__FaultAvoidance__Group__0__Impl"
    // InternalSafetyDSL.g:3258:1: rule__FaultAvoidance__Group__0__Impl : ( 'faultAvoidance' ) ;
    public final void rule__FaultAvoidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3262:1: ( ( 'faultAvoidance' ) )
            // InternalSafetyDSL.g:3263:1: ( 'faultAvoidance' )
            {
            // InternalSafetyDSL.g:3263:1: ( 'faultAvoidance' )
            // InternalSafetyDSL.g:3264:2: 'faultAvoidance'
            {
             before(grammarAccess.getFaultAvoidanceAccess().getFaultAvoidanceKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getFaultAvoidanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__0__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__1"
    // InternalSafetyDSL.g:3273:1: rule__FaultAvoidance__Group__1 : rule__FaultAvoidance__Group__1__Impl rule__FaultAvoidance__Group__2 ;
    public final void rule__FaultAvoidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3277:1: ( rule__FaultAvoidance__Group__1__Impl rule__FaultAvoidance__Group__2 )
            // InternalSafetyDSL.g:3278:2: rule__FaultAvoidance__Group__1__Impl rule__FaultAvoidance__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FaultAvoidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__1"


    // $ANTLR start "rule__FaultAvoidance__Group__1__Impl"
    // InternalSafetyDSL.g:3285:1: rule__FaultAvoidance__Group__1__Impl : ( ( rule__FaultAvoidance__NameAssignment_1 ) ) ;
    public final void rule__FaultAvoidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3289:1: ( ( ( rule__FaultAvoidance__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:3290:1: ( ( rule__FaultAvoidance__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:3290:1: ( ( rule__FaultAvoidance__NameAssignment_1 ) )
            // InternalSafetyDSL.g:3291:2: ( rule__FaultAvoidance__NameAssignment_1 )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:3292:2: ( rule__FaultAvoidance__NameAssignment_1 )
            // InternalSafetyDSL.g:3292:3: rule__FaultAvoidance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultAvoidanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__1__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__2"
    // InternalSafetyDSL.g:3300:1: rule__FaultAvoidance__Group__2 : rule__FaultAvoidance__Group__2__Impl rule__FaultAvoidance__Group__3 ;
    public final void rule__FaultAvoidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3304:1: ( rule__FaultAvoidance__Group__2__Impl rule__FaultAvoidance__Group__3 )
            // InternalSafetyDSL.g:3305:2: rule__FaultAvoidance__Group__2__Impl rule__FaultAvoidance__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__FaultAvoidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__2"


    // $ANTLR start "rule__FaultAvoidance__Group__2__Impl"
    // InternalSafetyDSL.g:3312:1: rule__FaultAvoidance__Group__2__Impl : ( '{' ) ;
    public final void rule__FaultAvoidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3316:1: ( ( '{' ) )
            // InternalSafetyDSL.g:3317:1: ( '{' )
            {
            // InternalSafetyDSL.g:3317:1: ( '{' )
            // InternalSafetyDSL.g:3318:2: '{'
            {
             before(grammarAccess.getFaultAvoidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__2__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__3"
    // InternalSafetyDSL.g:3327:1: rule__FaultAvoidance__Group__3 : rule__FaultAvoidance__Group__3__Impl rule__FaultAvoidance__Group__4 ;
    public final void rule__FaultAvoidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3331:1: ( rule__FaultAvoidance__Group__3__Impl rule__FaultAvoidance__Group__4 )
            // InternalSafetyDSL.g:3332:2: rule__FaultAvoidance__Group__3__Impl rule__FaultAvoidance__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__FaultAvoidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__3"


    // $ANTLR start "rule__FaultAvoidance__Group__3__Impl"
    // InternalSafetyDSL.g:3339:1: rule__FaultAvoidance__Group__3__Impl : ( 'type=' ) ;
    public final void rule__FaultAvoidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3343:1: ( ( 'type=' ) )
            // InternalSafetyDSL.g:3344:1: ( 'type=' )
            {
            // InternalSafetyDSL.g:3344:1: ( 'type=' )
            // InternalSafetyDSL.g:3345:2: 'type='
            {
             before(grammarAccess.getFaultAvoidanceAccess().getTypeKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__3__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__4"
    // InternalSafetyDSL.g:3354:1: rule__FaultAvoidance__Group__4 : rule__FaultAvoidance__Group__4__Impl rule__FaultAvoidance__Group__5 ;
    public final void rule__FaultAvoidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3358:1: ( rule__FaultAvoidance__Group__4__Impl rule__FaultAvoidance__Group__5 )
            // InternalSafetyDSL.g:3359:2: rule__FaultAvoidance__Group__4__Impl rule__FaultAvoidance__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__FaultAvoidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__4"


    // $ANTLR start "rule__FaultAvoidance__Group__4__Impl"
    // InternalSafetyDSL.g:3366:1: rule__FaultAvoidance__Group__4__Impl : ( ( rule__FaultAvoidance__TypeAssignment_4 ) ) ;
    public final void rule__FaultAvoidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3370:1: ( ( ( rule__FaultAvoidance__TypeAssignment_4 ) ) )
            // InternalSafetyDSL.g:3371:1: ( ( rule__FaultAvoidance__TypeAssignment_4 ) )
            {
            // InternalSafetyDSL.g:3371:1: ( ( rule__FaultAvoidance__TypeAssignment_4 ) )
            // InternalSafetyDSL.g:3372:2: ( rule__FaultAvoidance__TypeAssignment_4 )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getTypeAssignment_4()); 
            // InternalSafetyDSL.g:3373:2: ( rule__FaultAvoidance__TypeAssignment_4 )
            // InternalSafetyDSL.g:3373:3: rule__FaultAvoidance__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFaultAvoidanceAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__4__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__5"
    // InternalSafetyDSL.g:3381:1: rule__FaultAvoidance__Group__5 : rule__FaultAvoidance__Group__5__Impl rule__FaultAvoidance__Group__6 ;
    public final void rule__FaultAvoidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3385:1: ( rule__FaultAvoidance__Group__5__Impl rule__FaultAvoidance__Group__6 )
            // InternalSafetyDSL.g:3386:2: rule__FaultAvoidance__Group__5__Impl rule__FaultAvoidance__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__FaultAvoidance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__5"


    // $ANTLR start "rule__FaultAvoidance__Group__5__Impl"
    // InternalSafetyDSL.g:3393:1: rule__FaultAvoidance__Group__5__Impl : ( 'avoidedFaults=' ) ;
    public final void rule__FaultAvoidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3397:1: ( ( 'avoidedFaults=' ) )
            // InternalSafetyDSL.g:3398:1: ( 'avoidedFaults=' )
            {
            // InternalSafetyDSL.g:3398:1: ( 'avoidedFaults=' )
            // InternalSafetyDSL.g:3399:2: 'avoidedFaults='
            {
             before(grammarAccess.getFaultAvoidanceAccess().getAvoidedFaultsKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getAvoidedFaultsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__5__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__6"
    // InternalSafetyDSL.g:3408:1: rule__FaultAvoidance__Group__6 : rule__FaultAvoidance__Group__6__Impl rule__FaultAvoidance__Group__7 ;
    public final void rule__FaultAvoidance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3412:1: ( rule__FaultAvoidance__Group__6__Impl rule__FaultAvoidance__Group__7 )
            // InternalSafetyDSL.g:3413:2: rule__FaultAvoidance__Group__6__Impl rule__FaultAvoidance__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__FaultAvoidance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__6"


    // $ANTLR start "rule__FaultAvoidance__Group__6__Impl"
    // InternalSafetyDSL.g:3420:1: rule__FaultAvoidance__Group__6__Impl : ( ( rule__FaultAvoidance__HandledFaultsAssignment_6 ) ) ;
    public final void rule__FaultAvoidance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3424:1: ( ( ( rule__FaultAvoidance__HandledFaultsAssignment_6 ) ) )
            // InternalSafetyDSL.g:3425:1: ( ( rule__FaultAvoidance__HandledFaultsAssignment_6 ) )
            {
            // InternalSafetyDSL.g:3425:1: ( ( rule__FaultAvoidance__HandledFaultsAssignment_6 ) )
            // InternalSafetyDSL.g:3426:2: ( rule__FaultAvoidance__HandledFaultsAssignment_6 )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsAssignment_6()); 
            // InternalSafetyDSL.g:3427:2: ( rule__FaultAvoidance__HandledFaultsAssignment_6 )
            // InternalSafetyDSL.g:3427:3: rule__FaultAvoidance__HandledFaultsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__HandledFaultsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__6__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__7"
    // InternalSafetyDSL.g:3435:1: rule__FaultAvoidance__Group__7 : rule__FaultAvoidance__Group__7__Impl rule__FaultAvoidance__Group__8 ;
    public final void rule__FaultAvoidance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3439:1: ( rule__FaultAvoidance__Group__7__Impl rule__FaultAvoidance__Group__8 )
            // InternalSafetyDSL.g:3440:2: rule__FaultAvoidance__Group__7__Impl rule__FaultAvoidance__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__FaultAvoidance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__7"


    // $ANTLR start "rule__FaultAvoidance__Group__7__Impl"
    // InternalSafetyDSL.g:3447:1: rule__FaultAvoidance__Group__7__Impl : ( ( rule__FaultAvoidance__Group_7__0 )* ) ;
    public final void rule__FaultAvoidance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3451:1: ( ( ( rule__FaultAvoidance__Group_7__0 )* ) )
            // InternalSafetyDSL.g:3452:1: ( ( rule__FaultAvoidance__Group_7__0 )* )
            {
            // InternalSafetyDSL.g:3452:1: ( ( rule__FaultAvoidance__Group_7__0 )* )
            // InternalSafetyDSL.g:3453:2: ( rule__FaultAvoidance__Group_7__0 )*
            {
             before(grammarAccess.getFaultAvoidanceAccess().getGroup_7()); 
            // InternalSafetyDSL.g:3454:2: ( rule__FaultAvoidance__Group_7__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSafetyDSL.g:3454:3: rule__FaultAvoidance__Group_7__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FaultAvoidance__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFaultAvoidanceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__7__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__8"
    // InternalSafetyDSL.g:3462:1: rule__FaultAvoidance__Group__8 : rule__FaultAvoidance__Group__8__Impl rule__FaultAvoidance__Group__9 ;
    public final void rule__FaultAvoidance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3466:1: ( rule__FaultAvoidance__Group__8__Impl rule__FaultAvoidance__Group__9 )
            // InternalSafetyDSL.g:3467:2: rule__FaultAvoidance__Group__8__Impl rule__FaultAvoidance__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FaultAvoidance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__8"


    // $ANTLR start "rule__FaultAvoidance__Group__8__Impl"
    // InternalSafetyDSL.g:3474:1: rule__FaultAvoidance__Group__8__Impl : ( '}' ) ;
    public final void rule__FaultAvoidance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3478:1: ( ( '}' ) )
            // InternalSafetyDSL.g:3479:1: ( '}' )
            {
            // InternalSafetyDSL.g:3479:1: ( '}' )
            // InternalSafetyDSL.g:3480:2: '}'
            {
             before(grammarAccess.getFaultAvoidanceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__8__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group__9"
    // InternalSafetyDSL.g:3489:1: rule__FaultAvoidance__Group__9 : rule__FaultAvoidance__Group__9__Impl ;
    public final void rule__FaultAvoidance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3493:1: ( rule__FaultAvoidance__Group__9__Impl )
            // InternalSafetyDSL.g:3494:2: rule__FaultAvoidance__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__9"


    // $ANTLR start "rule__FaultAvoidance__Group__9__Impl"
    // InternalSafetyDSL.g:3500:1: rule__FaultAvoidance__Group__9__Impl : ( ';' ) ;
    public final void rule__FaultAvoidance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3504:1: ( ( ';' ) )
            // InternalSafetyDSL.g:3505:1: ( ';' )
            {
            // InternalSafetyDSL.g:3505:1: ( ';' )
            // InternalSafetyDSL.g:3506:2: ';'
            {
             before(grammarAccess.getFaultAvoidanceAccess().getSemicolonKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group__9__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group_7__0"
    // InternalSafetyDSL.g:3516:1: rule__FaultAvoidance__Group_7__0 : rule__FaultAvoidance__Group_7__0__Impl rule__FaultAvoidance__Group_7__1 ;
    public final void rule__FaultAvoidance__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3520:1: ( rule__FaultAvoidance__Group_7__0__Impl rule__FaultAvoidance__Group_7__1 )
            // InternalSafetyDSL.g:3521:2: rule__FaultAvoidance__Group_7__0__Impl rule__FaultAvoidance__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultAvoidance__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group_7__0"


    // $ANTLR start "rule__FaultAvoidance__Group_7__0__Impl"
    // InternalSafetyDSL.g:3528:1: rule__FaultAvoidance__Group_7__0__Impl : ( ',' ) ;
    public final void rule__FaultAvoidance__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3532:1: ( ( ',' ) )
            // InternalSafetyDSL.g:3533:1: ( ',' )
            {
            // InternalSafetyDSL.g:3533:1: ( ',' )
            // InternalSafetyDSL.g:3534:2: ','
            {
             before(grammarAccess.getFaultAvoidanceAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group_7__0__Impl"


    // $ANTLR start "rule__FaultAvoidance__Group_7__1"
    // InternalSafetyDSL.g:3543:1: rule__FaultAvoidance__Group_7__1 : rule__FaultAvoidance__Group_7__1__Impl ;
    public final void rule__FaultAvoidance__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3547:1: ( rule__FaultAvoidance__Group_7__1__Impl )
            // InternalSafetyDSL.g:3548:2: rule__FaultAvoidance__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group_7__1"


    // $ANTLR start "rule__FaultAvoidance__Group_7__1__Impl"
    // InternalSafetyDSL.g:3554:1: rule__FaultAvoidance__Group_7__1__Impl : ( ( rule__FaultAvoidance__HandledFaultsAssignment_7_1 ) ) ;
    public final void rule__FaultAvoidance__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3558:1: ( ( ( rule__FaultAvoidance__HandledFaultsAssignment_7_1 ) ) )
            // InternalSafetyDSL.g:3559:1: ( ( rule__FaultAvoidance__HandledFaultsAssignment_7_1 ) )
            {
            // InternalSafetyDSL.g:3559:1: ( ( rule__FaultAvoidance__HandledFaultsAssignment_7_1 ) )
            // InternalSafetyDSL.g:3560:2: ( rule__FaultAvoidance__HandledFaultsAssignment_7_1 )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsAssignment_7_1()); 
            // InternalSafetyDSL.g:3561:2: ( rule__FaultAvoidance__HandledFaultsAssignment_7_1 )
            // InternalSafetyDSL.g:3561:3: rule__FaultAvoidance__HandledFaultsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultAvoidance__HandledFaultsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__Group_7__1__Impl"


    // $ANTLR start "rule__FaultDetection__Group__0"
    // InternalSafetyDSL.g:3570:1: rule__FaultDetection__Group__0 : rule__FaultDetection__Group__0__Impl rule__FaultDetection__Group__1 ;
    public final void rule__FaultDetection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3574:1: ( rule__FaultDetection__Group__0__Impl rule__FaultDetection__Group__1 )
            // InternalSafetyDSL.g:3575:2: rule__FaultDetection__Group__0__Impl rule__FaultDetection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultDetection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__0"


    // $ANTLR start "rule__FaultDetection__Group__0__Impl"
    // InternalSafetyDSL.g:3582:1: rule__FaultDetection__Group__0__Impl : ( 'faultDetection' ) ;
    public final void rule__FaultDetection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3586:1: ( ( 'faultDetection' ) )
            // InternalSafetyDSL.g:3587:1: ( 'faultDetection' )
            {
            // InternalSafetyDSL.g:3587:1: ( 'faultDetection' )
            // InternalSafetyDSL.g:3588:2: 'faultDetection'
            {
             before(grammarAccess.getFaultDetectionAccess().getFaultDetectionKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getFaultDetectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__0__Impl"


    // $ANTLR start "rule__FaultDetection__Group__1"
    // InternalSafetyDSL.g:3597:1: rule__FaultDetection__Group__1 : rule__FaultDetection__Group__1__Impl rule__FaultDetection__Group__2 ;
    public final void rule__FaultDetection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3601:1: ( rule__FaultDetection__Group__1__Impl rule__FaultDetection__Group__2 )
            // InternalSafetyDSL.g:3602:2: rule__FaultDetection__Group__1__Impl rule__FaultDetection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FaultDetection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__1"


    // $ANTLR start "rule__FaultDetection__Group__1__Impl"
    // InternalSafetyDSL.g:3609:1: rule__FaultDetection__Group__1__Impl : ( ( rule__FaultDetection__NameAssignment_1 ) ) ;
    public final void rule__FaultDetection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3613:1: ( ( ( rule__FaultDetection__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:3614:1: ( ( rule__FaultDetection__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:3614:1: ( ( rule__FaultDetection__NameAssignment_1 ) )
            // InternalSafetyDSL.g:3615:2: ( rule__FaultDetection__NameAssignment_1 )
            {
             before(grammarAccess.getFaultDetectionAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:3616:2: ( rule__FaultDetection__NameAssignment_1 )
            // InternalSafetyDSL.g:3616:3: rule__FaultDetection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultDetectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__1__Impl"


    // $ANTLR start "rule__FaultDetection__Group__2"
    // InternalSafetyDSL.g:3624:1: rule__FaultDetection__Group__2 : rule__FaultDetection__Group__2__Impl rule__FaultDetection__Group__3 ;
    public final void rule__FaultDetection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3628:1: ( rule__FaultDetection__Group__2__Impl rule__FaultDetection__Group__3 )
            // InternalSafetyDSL.g:3629:2: rule__FaultDetection__Group__2__Impl rule__FaultDetection__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__FaultDetection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__2"


    // $ANTLR start "rule__FaultDetection__Group__2__Impl"
    // InternalSafetyDSL.g:3636:1: rule__FaultDetection__Group__2__Impl : ( '{' ) ;
    public final void rule__FaultDetection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3640:1: ( ( '{' ) )
            // InternalSafetyDSL.g:3641:1: ( '{' )
            {
            // InternalSafetyDSL.g:3641:1: ( '{' )
            // InternalSafetyDSL.g:3642:2: '{'
            {
             before(grammarAccess.getFaultDetectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__2__Impl"


    // $ANTLR start "rule__FaultDetection__Group__3"
    // InternalSafetyDSL.g:3651:1: rule__FaultDetection__Group__3 : rule__FaultDetection__Group__3__Impl rule__FaultDetection__Group__4 ;
    public final void rule__FaultDetection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3655:1: ( rule__FaultDetection__Group__3__Impl rule__FaultDetection__Group__4 )
            // InternalSafetyDSL.g:3656:2: rule__FaultDetection__Group__3__Impl rule__FaultDetection__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__FaultDetection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__3"


    // $ANTLR start "rule__FaultDetection__Group__3__Impl"
    // InternalSafetyDSL.g:3663:1: rule__FaultDetection__Group__3__Impl : ( 'type=' ) ;
    public final void rule__FaultDetection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3667:1: ( ( 'type=' ) )
            // InternalSafetyDSL.g:3668:1: ( 'type=' )
            {
            // InternalSafetyDSL.g:3668:1: ( 'type=' )
            // InternalSafetyDSL.g:3669:2: 'type='
            {
             before(grammarAccess.getFaultDetectionAccess().getTypeKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__3__Impl"


    // $ANTLR start "rule__FaultDetection__Group__4"
    // InternalSafetyDSL.g:3678:1: rule__FaultDetection__Group__4 : rule__FaultDetection__Group__4__Impl rule__FaultDetection__Group__5 ;
    public final void rule__FaultDetection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3682:1: ( rule__FaultDetection__Group__4__Impl rule__FaultDetection__Group__5 )
            // InternalSafetyDSL.g:3683:2: rule__FaultDetection__Group__4__Impl rule__FaultDetection__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__FaultDetection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__4"


    // $ANTLR start "rule__FaultDetection__Group__4__Impl"
    // InternalSafetyDSL.g:3690:1: rule__FaultDetection__Group__4__Impl : ( ( rule__FaultDetection__TypeAssignment_4 ) ) ;
    public final void rule__FaultDetection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3694:1: ( ( ( rule__FaultDetection__TypeAssignment_4 ) ) )
            // InternalSafetyDSL.g:3695:1: ( ( rule__FaultDetection__TypeAssignment_4 ) )
            {
            // InternalSafetyDSL.g:3695:1: ( ( rule__FaultDetection__TypeAssignment_4 ) )
            // InternalSafetyDSL.g:3696:2: ( rule__FaultDetection__TypeAssignment_4 )
            {
             before(grammarAccess.getFaultDetectionAccess().getTypeAssignment_4()); 
            // InternalSafetyDSL.g:3697:2: ( rule__FaultDetection__TypeAssignment_4 )
            // InternalSafetyDSL.g:3697:3: rule__FaultDetection__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFaultDetectionAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__4__Impl"


    // $ANTLR start "rule__FaultDetection__Group__5"
    // InternalSafetyDSL.g:3705:1: rule__FaultDetection__Group__5 : rule__FaultDetection__Group__5__Impl rule__FaultDetection__Group__6 ;
    public final void rule__FaultDetection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3709:1: ( rule__FaultDetection__Group__5__Impl rule__FaultDetection__Group__6 )
            // InternalSafetyDSL.g:3710:2: rule__FaultDetection__Group__5__Impl rule__FaultDetection__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__FaultDetection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__5"


    // $ANTLR start "rule__FaultDetection__Group__5__Impl"
    // InternalSafetyDSL.g:3717:1: rule__FaultDetection__Group__5__Impl : ( 'detectedFaults=' ) ;
    public final void rule__FaultDetection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3721:1: ( ( 'detectedFaults=' ) )
            // InternalSafetyDSL.g:3722:1: ( 'detectedFaults=' )
            {
            // InternalSafetyDSL.g:3722:1: ( 'detectedFaults=' )
            // InternalSafetyDSL.g:3723:2: 'detectedFaults='
            {
             before(grammarAccess.getFaultDetectionAccess().getDetectedFaultsKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getDetectedFaultsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__5__Impl"


    // $ANTLR start "rule__FaultDetection__Group__6"
    // InternalSafetyDSL.g:3732:1: rule__FaultDetection__Group__6 : rule__FaultDetection__Group__6__Impl rule__FaultDetection__Group__7 ;
    public final void rule__FaultDetection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3736:1: ( rule__FaultDetection__Group__6__Impl rule__FaultDetection__Group__7 )
            // InternalSafetyDSL.g:3737:2: rule__FaultDetection__Group__6__Impl rule__FaultDetection__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__FaultDetection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__6"


    // $ANTLR start "rule__FaultDetection__Group__6__Impl"
    // InternalSafetyDSL.g:3744:1: rule__FaultDetection__Group__6__Impl : ( ( rule__FaultDetection__HandledFaultsAssignment_6 ) ) ;
    public final void rule__FaultDetection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3748:1: ( ( ( rule__FaultDetection__HandledFaultsAssignment_6 ) ) )
            // InternalSafetyDSL.g:3749:1: ( ( rule__FaultDetection__HandledFaultsAssignment_6 ) )
            {
            // InternalSafetyDSL.g:3749:1: ( ( rule__FaultDetection__HandledFaultsAssignment_6 ) )
            // InternalSafetyDSL.g:3750:2: ( rule__FaultDetection__HandledFaultsAssignment_6 )
            {
             before(grammarAccess.getFaultDetectionAccess().getHandledFaultsAssignment_6()); 
            // InternalSafetyDSL.g:3751:2: ( rule__FaultDetection__HandledFaultsAssignment_6 )
            // InternalSafetyDSL.g:3751:3: rule__FaultDetection__HandledFaultsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__HandledFaultsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFaultDetectionAccess().getHandledFaultsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__6__Impl"


    // $ANTLR start "rule__FaultDetection__Group__7"
    // InternalSafetyDSL.g:3759:1: rule__FaultDetection__Group__7 : rule__FaultDetection__Group__7__Impl rule__FaultDetection__Group__8 ;
    public final void rule__FaultDetection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3763:1: ( rule__FaultDetection__Group__7__Impl rule__FaultDetection__Group__8 )
            // InternalSafetyDSL.g:3764:2: rule__FaultDetection__Group__7__Impl rule__FaultDetection__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__FaultDetection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__7"


    // $ANTLR start "rule__FaultDetection__Group__7__Impl"
    // InternalSafetyDSL.g:3771:1: rule__FaultDetection__Group__7__Impl : ( ( rule__FaultDetection__Group_7__0 )* ) ;
    public final void rule__FaultDetection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3775:1: ( ( ( rule__FaultDetection__Group_7__0 )* ) )
            // InternalSafetyDSL.g:3776:1: ( ( rule__FaultDetection__Group_7__0 )* )
            {
            // InternalSafetyDSL.g:3776:1: ( ( rule__FaultDetection__Group_7__0 )* )
            // InternalSafetyDSL.g:3777:2: ( rule__FaultDetection__Group_7__0 )*
            {
             before(grammarAccess.getFaultDetectionAccess().getGroup_7()); 
            // InternalSafetyDSL.g:3778:2: ( rule__FaultDetection__Group_7__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSafetyDSL.g:3778:3: rule__FaultDetection__Group_7__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FaultDetection__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFaultDetectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__7__Impl"


    // $ANTLR start "rule__FaultDetection__Group__8"
    // InternalSafetyDSL.g:3786:1: rule__FaultDetection__Group__8 : rule__FaultDetection__Group__8__Impl rule__FaultDetection__Group__9 ;
    public final void rule__FaultDetection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3790:1: ( rule__FaultDetection__Group__8__Impl rule__FaultDetection__Group__9 )
            // InternalSafetyDSL.g:3791:2: rule__FaultDetection__Group__8__Impl rule__FaultDetection__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FaultDetection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__8"


    // $ANTLR start "rule__FaultDetection__Group__8__Impl"
    // InternalSafetyDSL.g:3798:1: rule__FaultDetection__Group__8__Impl : ( '}' ) ;
    public final void rule__FaultDetection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3802:1: ( ( '}' ) )
            // InternalSafetyDSL.g:3803:1: ( '}' )
            {
            // InternalSafetyDSL.g:3803:1: ( '}' )
            // InternalSafetyDSL.g:3804:2: '}'
            {
             before(grammarAccess.getFaultDetectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__8__Impl"


    // $ANTLR start "rule__FaultDetection__Group__9"
    // InternalSafetyDSL.g:3813:1: rule__FaultDetection__Group__9 : rule__FaultDetection__Group__9__Impl ;
    public final void rule__FaultDetection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3817:1: ( rule__FaultDetection__Group__9__Impl )
            // InternalSafetyDSL.g:3818:2: rule__FaultDetection__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__9"


    // $ANTLR start "rule__FaultDetection__Group__9__Impl"
    // InternalSafetyDSL.g:3824:1: rule__FaultDetection__Group__9__Impl : ( ';' ) ;
    public final void rule__FaultDetection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3828:1: ( ( ';' ) )
            // InternalSafetyDSL.g:3829:1: ( ';' )
            {
            // InternalSafetyDSL.g:3829:1: ( ';' )
            // InternalSafetyDSL.g:3830:2: ';'
            {
             before(grammarAccess.getFaultDetectionAccess().getSemicolonKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group__9__Impl"


    // $ANTLR start "rule__FaultDetection__Group_7__0"
    // InternalSafetyDSL.g:3840:1: rule__FaultDetection__Group_7__0 : rule__FaultDetection__Group_7__0__Impl rule__FaultDetection__Group_7__1 ;
    public final void rule__FaultDetection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3844:1: ( rule__FaultDetection__Group_7__0__Impl rule__FaultDetection__Group_7__1 )
            // InternalSafetyDSL.g:3845:2: rule__FaultDetection__Group_7__0__Impl rule__FaultDetection__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultDetection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group_7__0"


    // $ANTLR start "rule__FaultDetection__Group_7__0__Impl"
    // InternalSafetyDSL.g:3852:1: rule__FaultDetection__Group_7__0__Impl : ( ',' ) ;
    public final void rule__FaultDetection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3856:1: ( ( ',' ) )
            // InternalSafetyDSL.g:3857:1: ( ',' )
            {
            // InternalSafetyDSL.g:3857:1: ( ',' )
            // InternalSafetyDSL.g:3858:2: ','
            {
             before(grammarAccess.getFaultDetectionAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group_7__0__Impl"


    // $ANTLR start "rule__FaultDetection__Group_7__1"
    // InternalSafetyDSL.g:3867:1: rule__FaultDetection__Group_7__1 : rule__FaultDetection__Group_7__1__Impl ;
    public final void rule__FaultDetection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3871:1: ( rule__FaultDetection__Group_7__1__Impl )
            // InternalSafetyDSL.g:3872:2: rule__FaultDetection__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group_7__1"


    // $ANTLR start "rule__FaultDetection__Group_7__1__Impl"
    // InternalSafetyDSL.g:3878:1: rule__FaultDetection__Group_7__1__Impl : ( ( rule__FaultDetection__HandledFaultsAssignment_7_1 ) ) ;
    public final void rule__FaultDetection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3882:1: ( ( ( rule__FaultDetection__HandledFaultsAssignment_7_1 ) ) )
            // InternalSafetyDSL.g:3883:1: ( ( rule__FaultDetection__HandledFaultsAssignment_7_1 ) )
            {
            // InternalSafetyDSL.g:3883:1: ( ( rule__FaultDetection__HandledFaultsAssignment_7_1 ) )
            // InternalSafetyDSL.g:3884:2: ( rule__FaultDetection__HandledFaultsAssignment_7_1 )
            {
             before(grammarAccess.getFaultDetectionAccess().getHandledFaultsAssignment_7_1()); 
            // InternalSafetyDSL.g:3885:2: ( rule__FaultDetection__HandledFaultsAssignment_7_1 )
            // InternalSafetyDSL.g:3885:3: rule__FaultDetection__HandledFaultsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultDetection__HandledFaultsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultDetectionAccess().getHandledFaultsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__Group_7__1__Impl"


    // $ANTLR start "rule__FaultContainment__Group__0"
    // InternalSafetyDSL.g:3894:1: rule__FaultContainment__Group__0 : rule__FaultContainment__Group__0__Impl rule__FaultContainment__Group__1 ;
    public final void rule__FaultContainment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3898:1: ( rule__FaultContainment__Group__0__Impl rule__FaultContainment__Group__1 )
            // InternalSafetyDSL.g:3899:2: rule__FaultContainment__Group__0__Impl rule__FaultContainment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultContainment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__0"


    // $ANTLR start "rule__FaultContainment__Group__0__Impl"
    // InternalSafetyDSL.g:3906:1: rule__FaultContainment__Group__0__Impl : ( 'faultContainment' ) ;
    public final void rule__FaultContainment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3910:1: ( ( 'faultContainment' ) )
            // InternalSafetyDSL.g:3911:1: ( 'faultContainment' )
            {
            // InternalSafetyDSL.g:3911:1: ( 'faultContainment' )
            // InternalSafetyDSL.g:3912:2: 'faultContainment'
            {
             before(grammarAccess.getFaultContainmentAccess().getFaultContainmentKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getFaultContainmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__0__Impl"


    // $ANTLR start "rule__FaultContainment__Group__1"
    // InternalSafetyDSL.g:3921:1: rule__FaultContainment__Group__1 : rule__FaultContainment__Group__1__Impl rule__FaultContainment__Group__2 ;
    public final void rule__FaultContainment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3925:1: ( rule__FaultContainment__Group__1__Impl rule__FaultContainment__Group__2 )
            // InternalSafetyDSL.g:3926:2: rule__FaultContainment__Group__1__Impl rule__FaultContainment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FaultContainment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__1"


    // $ANTLR start "rule__FaultContainment__Group__1__Impl"
    // InternalSafetyDSL.g:3933:1: rule__FaultContainment__Group__1__Impl : ( ( rule__FaultContainment__NameAssignment_1 ) ) ;
    public final void rule__FaultContainment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3937:1: ( ( ( rule__FaultContainment__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:3938:1: ( ( rule__FaultContainment__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:3938:1: ( ( rule__FaultContainment__NameAssignment_1 ) )
            // InternalSafetyDSL.g:3939:2: ( rule__FaultContainment__NameAssignment_1 )
            {
             before(grammarAccess.getFaultContainmentAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:3940:2: ( rule__FaultContainment__NameAssignment_1 )
            // InternalSafetyDSL.g:3940:3: rule__FaultContainment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultContainmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__1__Impl"


    // $ANTLR start "rule__FaultContainment__Group__2"
    // InternalSafetyDSL.g:3948:1: rule__FaultContainment__Group__2 : rule__FaultContainment__Group__2__Impl rule__FaultContainment__Group__3 ;
    public final void rule__FaultContainment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3952:1: ( rule__FaultContainment__Group__2__Impl rule__FaultContainment__Group__3 )
            // InternalSafetyDSL.g:3953:2: rule__FaultContainment__Group__2__Impl rule__FaultContainment__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__FaultContainment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__2"


    // $ANTLR start "rule__FaultContainment__Group__2__Impl"
    // InternalSafetyDSL.g:3960:1: rule__FaultContainment__Group__2__Impl : ( '{' ) ;
    public final void rule__FaultContainment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3964:1: ( ( '{' ) )
            // InternalSafetyDSL.g:3965:1: ( '{' )
            {
            // InternalSafetyDSL.g:3965:1: ( '{' )
            // InternalSafetyDSL.g:3966:2: '{'
            {
             before(grammarAccess.getFaultContainmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__2__Impl"


    // $ANTLR start "rule__FaultContainment__Group__3"
    // InternalSafetyDSL.g:3975:1: rule__FaultContainment__Group__3 : rule__FaultContainment__Group__3__Impl rule__FaultContainment__Group__4 ;
    public final void rule__FaultContainment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3979:1: ( rule__FaultContainment__Group__3__Impl rule__FaultContainment__Group__4 )
            // InternalSafetyDSL.g:3980:2: rule__FaultContainment__Group__3__Impl rule__FaultContainment__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__FaultContainment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__3"


    // $ANTLR start "rule__FaultContainment__Group__3__Impl"
    // InternalSafetyDSL.g:3987:1: rule__FaultContainment__Group__3__Impl : ( 'type=' ) ;
    public final void rule__FaultContainment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:3991:1: ( ( 'type=' ) )
            // InternalSafetyDSL.g:3992:1: ( 'type=' )
            {
            // InternalSafetyDSL.g:3992:1: ( 'type=' )
            // InternalSafetyDSL.g:3993:2: 'type='
            {
             before(grammarAccess.getFaultContainmentAccess().getTypeKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__3__Impl"


    // $ANTLR start "rule__FaultContainment__Group__4"
    // InternalSafetyDSL.g:4002:1: rule__FaultContainment__Group__4 : rule__FaultContainment__Group__4__Impl rule__FaultContainment__Group__5 ;
    public final void rule__FaultContainment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4006:1: ( rule__FaultContainment__Group__4__Impl rule__FaultContainment__Group__5 )
            // InternalSafetyDSL.g:4007:2: rule__FaultContainment__Group__4__Impl rule__FaultContainment__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__FaultContainment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__4"


    // $ANTLR start "rule__FaultContainment__Group__4__Impl"
    // InternalSafetyDSL.g:4014:1: rule__FaultContainment__Group__4__Impl : ( ( rule__FaultContainment__TypeAssignment_4 ) ) ;
    public final void rule__FaultContainment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4018:1: ( ( ( rule__FaultContainment__TypeAssignment_4 ) ) )
            // InternalSafetyDSL.g:4019:1: ( ( rule__FaultContainment__TypeAssignment_4 ) )
            {
            // InternalSafetyDSL.g:4019:1: ( ( rule__FaultContainment__TypeAssignment_4 ) )
            // InternalSafetyDSL.g:4020:2: ( rule__FaultContainment__TypeAssignment_4 )
            {
             before(grammarAccess.getFaultContainmentAccess().getTypeAssignment_4()); 
            // InternalSafetyDSL.g:4021:2: ( rule__FaultContainment__TypeAssignment_4 )
            // InternalSafetyDSL.g:4021:3: rule__FaultContainment__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFaultContainmentAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__4__Impl"


    // $ANTLR start "rule__FaultContainment__Group__5"
    // InternalSafetyDSL.g:4029:1: rule__FaultContainment__Group__5 : rule__FaultContainment__Group__5__Impl rule__FaultContainment__Group__6 ;
    public final void rule__FaultContainment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4033:1: ( rule__FaultContainment__Group__5__Impl rule__FaultContainment__Group__6 )
            // InternalSafetyDSL.g:4034:2: rule__FaultContainment__Group__5__Impl rule__FaultContainment__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__FaultContainment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__5"


    // $ANTLR start "rule__FaultContainment__Group__5__Impl"
    // InternalSafetyDSL.g:4041:1: rule__FaultContainment__Group__5__Impl : ( 'containedFaults=' ) ;
    public final void rule__FaultContainment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4045:1: ( ( 'containedFaults=' ) )
            // InternalSafetyDSL.g:4046:1: ( 'containedFaults=' )
            {
            // InternalSafetyDSL.g:4046:1: ( 'containedFaults=' )
            // InternalSafetyDSL.g:4047:2: 'containedFaults='
            {
             before(grammarAccess.getFaultContainmentAccess().getContainedFaultsKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getContainedFaultsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__5__Impl"


    // $ANTLR start "rule__FaultContainment__Group__6"
    // InternalSafetyDSL.g:4056:1: rule__FaultContainment__Group__6 : rule__FaultContainment__Group__6__Impl rule__FaultContainment__Group__7 ;
    public final void rule__FaultContainment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4060:1: ( rule__FaultContainment__Group__6__Impl rule__FaultContainment__Group__7 )
            // InternalSafetyDSL.g:4061:2: rule__FaultContainment__Group__6__Impl rule__FaultContainment__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__FaultContainment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__6"


    // $ANTLR start "rule__FaultContainment__Group__6__Impl"
    // InternalSafetyDSL.g:4068:1: rule__FaultContainment__Group__6__Impl : ( ( rule__FaultContainment__HandledFaultsAssignment_6 ) ) ;
    public final void rule__FaultContainment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4072:1: ( ( ( rule__FaultContainment__HandledFaultsAssignment_6 ) ) )
            // InternalSafetyDSL.g:4073:1: ( ( rule__FaultContainment__HandledFaultsAssignment_6 ) )
            {
            // InternalSafetyDSL.g:4073:1: ( ( rule__FaultContainment__HandledFaultsAssignment_6 ) )
            // InternalSafetyDSL.g:4074:2: ( rule__FaultContainment__HandledFaultsAssignment_6 )
            {
             before(grammarAccess.getFaultContainmentAccess().getHandledFaultsAssignment_6()); 
            // InternalSafetyDSL.g:4075:2: ( rule__FaultContainment__HandledFaultsAssignment_6 )
            // InternalSafetyDSL.g:4075:3: rule__FaultContainment__HandledFaultsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__HandledFaultsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFaultContainmentAccess().getHandledFaultsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__6__Impl"


    // $ANTLR start "rule__FaultContainment__Group__7"
    // InternalSafetyDSL.g:4083:1: rule__FaultContainment__Group__7 : rule__FaultContainment__Group__7__Impl rule__FaultContainment__Group__8 ;
    public final void rule__FaultContainment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4087:1: ( rule__FaultContainment__Group__7__Impl rule__FaultContainment__Group__8 )
            // InternalSafetyDSL.g:4088:2: rule__FaultContainment__Group__7__Impl rule__FaultContainment__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__FaultContainment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__7"


    // $ANTLR start "rule__FaultContainment__Group__7__Impl"
    // InternalSafetyDSL.g:4095:1: rule__FaultContainment__Group__7__Impl : ( ( rule__FaultContainment__Group_7__0 )* ) ;
    public final void rule__FaultContainment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4099:1: ( ( ( rule__FaultContainment__Group_7__0 )* ) )
            // InternalSafetyDSL.g:4100:1: ( ( rule__FaultContainment__Group_7__0 )* )
            {
            // InternalSafetyDSL.g:4100:1: ( ( rule__FaultContainment__Group_7__0 )* )
            // InternalSafetyDSL.g:4101:2: ( rule__FaultContainment__Group_7__0 )*
            {
             before(grammarAccess.getFaultContainmentAccess().getGroup_7()); 
            // InternalSafetyDSL.g:4102:2: ( rule__FaultContainment__Group_7__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSafetyDSL.g:4102:3: rule__FaultContainment__Group_7__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FaultContainment__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFaultContainmentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__7__Impl"


    // $ANTLR start "rule__FaultContainment__Group__8"
    // InternalSafetyDSL.g:4110:1: rule__FaultContainment__Group__8 : rule__FaultContainment__Group__8__Impl rule__FaultContainment__Group__9 ;
    public final void rule__FaultContainment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4114:1: ( rule__FaultContainment__Group__8__Impl rule__FaultContainment__Group__9 )
            // InternalSafetyDSL.g:4115:2: rule__FaultContainment__Group__8__Impl rule__FaultContainment__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__FaultContainment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__8"


    // $ANTLR start "rule__FaultContainment__Group__8__Impl"
    // InternalSafetyDSL.g:4122:1: rule__FaultContainment__Group__8__Impl : ( '}' ) ;
    public final void rule__FaultContainment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4126:1: ( ( '}' ) )
            // InternalSafetyDSL.g:4127:1: ( '}' )
            {
            // InternalSafetyDSL.g:4127:1: ( '}' )
            // InternalSafetyDSL.g:4128:2: '}'
            {
             before(grammarAccess.getFaultContainmentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__8__Impl"


    // $ANTLR start "rule__FaultContainment__Group__9"
    // InternalSafetyDSL.g:4137:1: rule__FaultContainment__Group__9 : rule__FaultContainment__Group__9__Impl ;
    public final void rule__FaultContainment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4141:1: ( rule__FaultContainment__Group__9__Impl )
            // InternalSafetyDSL.g:4142:2: rule__FaultContainment__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__9"


    // $ANTLR start "rule__FaultContainment__Group__9__Impl"
    // InternalSafetyDSL.g:4148:1: rule__FaultContainment__Group__9__Impl : ( ';' ) ;
    public final void rule__FaultContainment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4152:1: ( ( ';' ) )
            // InternalSafetyDSL.g:4153:1: ( ';' )
            {
            // InternalSafetyDSL.g:4153:1: ( ';' )
            // InternalSafetyDSL.g:4154:2: ';'
            {
             before(grammarAccess.getFaultContainmentAccess().getSemicolonKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group__9__Impl"


    // $ANTLR start "rule__FaultContainment__Group_7__0"
    // InternalSafetyDSL.g:4164:1: rule__FaultContainment__Group_7__0 : rule__FaultContainment__Group_7__0__Impl rule__FaultContainment__Group_7__1 ;
    public final void rule__FaultContainment__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4168:1: ( rule__FaultContainment__Group_7__0__Impl rule__FaultContainment__Group_7__1 )
            // InternalSafetyDSL.g:4169:2: rule__FaultContainment__Group_7__0__Impl rule__FaultContainment__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__FaultContainment__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group_7__0"


    // $ANTLR start "rule__FaultContainment__Group_7__0__Impl"
    // InternalSafetyDSL.g:4176:1: rule__FaultContainment__Group_7__0__Impl : ( ',' ) ;
    public final void rule__FaultContainment__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4180:1: ( ( ',' ) )
            // InternalSafetyDSL.g:4181:1: ( ',' )
            {
            // InternalSafetyDSL.g:4181:1: ( ',' )
            // InternalSafetyDSL.g:4182:2: ','
            {
             before(grammarAccess.getFaultContainmentAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group_7__0__Impl"


    // $ANTLR start "rule__FaultContainment__Group_7__1"
    // InternalSafetyDSL.g:4191:1: rule__FaultContainment__Group_7__1 : rule__FaultContainment__Group_7__1__Impl ;
    public final void rule__FaultContainment__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4195:1: ( rule__FaultContainment__Group_7__1__Impl )
            // InternalSafetyDSL.g:4196:2: rule__FaultContainment__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group_7__1"


    // $ANTLR start "rule__FaultContainment__Group_7__1__Impl"
    // InternalSafetyDSL.g:4202:1: rule__FaultContainment__Group_7__1__Impl : ( ( rule__FaultContainment__HandledFaultsAssignment_7_1 ) ) ;
    public final void rule__FaultContainment__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4206:1: ( ( ( rule__FaultContainment__HandledFaultsAssignment_7_1 ) ) )
            // InternalSafetyDSL.g:4207:1: ( ( rule__FaultContainment__HandledFaultsAssignment_7_1 ) )
            {
            // InternalSafetyDSL.g:4207:1: ( ( rule__FaultContainment__HandledFaultsAssignment_7_1 ) )
            // InternalSafetyDSL.g:4208:2: ( rule__FaultContainment__HandledFaultsAssignment_7_1 )
            {
             before(grammarAccess.getFaultContainmentAccess().getHandledFaultsAssignment_7_1()); 
            // InternalSafetyDSL.g:4209:2: ( rule__FaultContainment__HandledFaultsAssignment_7_1 )
            // InternalSafetyDSL.g:4209:3: rule__FaultContainment__HandledFaultsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__FaultContainment__HandledFaultsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFaultContainmentAccess().getHandledFaultsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__Group_7__1__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__0"
    // InternalSafetyDSL.g:4218:1: rule__SafetyCriticalViewpoint__Group__0 : rule__SafetyCriticalViewpoint__Group__0__Impl rule__SafetyCriticalViewpoint__Group__1 ;
    public final void rule__SafetyCriticalViewpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4222:1: ( rule__SafetyCriticalViewpoint__Group__0__Impl rule__SafetyCriticalViewpoint__Group__1 )
            // InternalSafetyDSL.g:4223:2: rule__SafetyCriticalViewpoint__Group__0__Impl rule__SafetyCriticalViewpoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCriticalViewpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__0"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__0__Impl"
    // InternalSafetyDSL.g:4230:1: rule__SafetyCriticalViewpoint__Group__0__Impl : ( 'Safety-CriticalView' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4234:1: ( ( 'Safety-CriticalView' ) )
            // InternalSafetyDSL.g:4235:1: ( 'Safety-CriticalView' )
            {
            // InternalSafetyDSL.g:4235:1: ( 'Safety-CriticalView' )
            // InternalSafetyDSL.g:4236:2: 'Safety-CriticalView'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getSafetyCriticalViewKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getSafetyCriticalViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__0__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__1"
    // InternalSafetyDSL.g:4245:1: rule__SafetyCriticalViewpoint__Group__1 : rule__SafetyCriticalViewpoint__Group__1__Impl rule__SafetyCriticalViewpoint__Group__2 ;
    public final void rule__SafetyCriticalViewpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4249:1: ( rule__SafetyCriticalViewpoint__Group__1__Impl rule__SafetyCriticalViewpoint__Group__2 )
            // InternalSafetyDSL.g:4250:2: rule__SafetyCriticalViewpoint__Group__1__Impl rule__SafetyCriticalViewpoint__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SafetyCriticalViewpoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__1"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__1__Impl"
    // InternalSafetyDSL.g:4257:1: rule__SafetyCriticalViewpoint__Group__1__Impl : ( ( rule__SafetyCriticalViewpoint__NameAssignment_1 ) ) ;
    public final void rule__SafetyCriticalViewpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4261:1: ( ( ( rule__SafetyCriticalViewpoint__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:4262:1: ( ( rule__SafetyCriticalViewpoint__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:4262:1: ( ( rule__SafetyCriticalViewpoint__NameAssignment_1 ) )
            // InternalSafetyDSL.g:4263:2: ( rule__SafetyCriticalViewpoint__NameAssignment_1 )
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:4264:2: ( rule__SafetyCriticalViewpoint__NameAssignment_1 )
            // InternalSafetyDSL.g:4264:3: rule__SafetyCriticalViewpoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalViewpointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__1__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__2"
    // InternalSafetyDSL.g:4272:1: rule__SafetyCriticalViewpoint__Group__2 : rule__SafetyCriticalViewpoint__Group__2__Impl rule__SafetyCriticalViewpoint__Group__3 ;
    public final void rule__SafetyCriticalViewpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4276:1: ( rule__SafetyCriticalViewpoint__Group__2__Impl rule__SafetyCriticalViewpoint__Group__3 )
            // InternalSafetyDSL.g:4277:2: rule__SafetyCriticalViewpoint__Group__2__Impl rule__SafetyCriticalViewpoint__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SafetyCriticalViewpoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__2"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__2__Impl"
    // InternalSafetyDSL.g:4284:1: rule__SafetyCriticalViewpoint__Group__2__Impl : ( '{' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4288:1: ( ( '{' ) )
            // InternalSafetyDSL.g:4289:1: ( '{' )
            {
            // InternalSafetyDSL.g:4289:1: ( '{' )
            // InternalSafetyDSL.g:4290:2: '{'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__2__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__3"
    // InternalSafetyDSL.g:4299:1: rule__SafetyCriticalViewpoint__Group__3 : rule__SafetyCriticalViewpoint__Group__3__Impl rule__SafetyCriticalViewpoint__Group__4 ;
    public final void rule__SafetyCriticalViewpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4303:1: ( rule__SafetyCriticalViewpoint__Group__3__Impl rule__SafetyCriticalViewpoint__Group__4 )
            // InternalSafetyDSL.g:4304:2: rule__SafetyCriticalViewpoint__Group__3__Impl rule__SafetyCriticalViewpoint__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__SafetyCriticalViewpoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__3"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__3__Impl"
    // InternalSafetyDSL.g:4311:1: rule__SafetyCriticalViewpoint__Group__3__Impl : ( 'Elements {' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4315:1: ( ( 'Elements {' ) )
            // InternalSafetyDSL.g:4316:1: ( 'Elements {' )
            {
            // InternalSafetyDSL.g:4316:1: ( 'Elements {' )
            // InternalSafetyDSL.g:4317:2: 'Elements {'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getElementsKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getElementsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__3__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__4"
    // InternalSafetyDSL.g:4326:1: rule__SafetyCriticalViewpoint__Group__4 : rule__SafetyCriticalViewpoint__Group__4__Impl rule__SafetyCriticalViewpoint__Group__5 ;
    public final void rule__SafetyCriticalViewpoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4330:1: ( rule__SafetyCriticalViewpoint__Group__4__Impl rule__SafetyCriticalViewpoint__Group__5 )
            // InternalSafetyDSL.g:4331:2: rule__SafetyCriticalViewpoint__Group__4__Impl rule__SafetyCriticalViewpoint__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SafetyCriticalViewpoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__4"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__4__Impl"
    // InternalSafetyDSL.g:4338:1: rule__SafetyCriticalViewpoint__Group__4__Impl : ( ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 ) ) ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )* ) ) ;
    public final void rule__SafetyCriticalViewpoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4342:1: ( ( ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 ) ) ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )* ) ) )
            // InternalSafetyDSL.g:4343:1: ( ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 ) ) ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )* ) )
            {
            // InternalSafetyDSL.g:4343:1: ( ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 ) ) ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )* ) )
            // InternalSafetyDSL.g:4344:2: ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 ) ) ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )* )
            {
            // InternalSafetyDSL.g:4344:2: ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 ) )
            // InternalSafetyDSL.g:4345:3: ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getElementsAssignment_4()); 
            // InternalSafetyDSL.g:4346:3: ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )
            // InternalSafetyDSL.g:4346:4: rule__SafetyCriticalViewpoint__ElementsAssignment_4
            {
            pushFollow(FOLLOW_38);
            rule__SafetyCriticalViewpoint__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalViewpointAccess().getElementsAssignment_4()); 

            }

            // InternalSafetyDSL.g:4349:2: ( ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )* )
            // InternalSafetyDSL.g:4350:3: ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )*
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getElementsAssignment_4()); 
            // InternalSafetyDSL.g:4351:3: ( rule__SafetyCriticalViewpoint__ElementsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40||(LA26_0>=50 && LA26_0<=51)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSafetyDSL.g:4351:4: rule__SafetyCriticalViewpoint__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SafetyCriticalViewpoint__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSafetyCriticalViewpointAccess().getElementsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__4__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__5"
    // InternalSafetyDSL.g:4360:1: rule__SafetyCriticalViewpoint__Group__5 : rule__SafetyCriticalViewpoint__Group__5__Impl rule__SafetyCriticalViewpoint__Group__6 ;
    public final void rule__SafetyCriticalViewpoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4364:1: ( rule__SafetyCriticalViewpoint__Group__5__Impl rule__SafetyCriticalViewpoint__Group__6 )
            // InternalSafetyDSL.g:4365:2: rule__SafetyCriticalViewpoint__Group__5__Impl rule__SafetyCriticalViewpoint__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SafetyCriticalViewpoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__5"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__5__Impl"
    // InternalSafetyDSL.g:4372:1: rule__SafetyCriticalViewpoint__Group__5__Impl : ( '}' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4376:1: ( ( '}' ) )
            // InternalSafetyDSL.g:4377:1: ( '}' )
            {
            // InternalSafetyDSL.g:4377:1: ( '}' )
            // InternalSafetyDSL.g:4378:2: '}'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__5__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__6"
    // InternalSafetyDSL.g:4387:1: rule__SafetyCriticalViewpoint__Group__6 : rule__SafetyCriticalViewpoint__Group__6__Impl rule__SafetyCriticalViewpoint__Group__7 ;
    public final void rule__SafetyCriticalViewpoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4391:1: ( rule__SafetyCriticalViewpoint__Group__6__Impl rule__SafetyCriticalViewpoint__Group__7 )
            // InternalSafetyDSL.g:4392:2: rule__SafetyCriticalViewpoint__Group__6__Impl rule__SafetyCriticalViewpoint__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCriticalViewpoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__6"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__6__Impl"
    // InternalSafetyDSL.g:4399:1: rule__SafetyCriticalViewpoint__Group__6__Impl : ( 'Relations {' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4403:1: ( ( 'Relations {' ) )
            // InternalSafetyDSL.g:4404:1: ( 'Relations {' )
            {
            // InternalSafetyDSL.g:4404:1: ( 'Relations {' )
            // InternalSafetyDSL.g:4405:2: 'Relations {'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__6__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__7"
    // InternalSafetyDSL.g:4414:1: rule__SafetyCriticalViewpoint__Group__7 : rule__SafetyCriticalViewpoint__Group__7__Impl rule__SafetyCriticalViewpoint__Group__8 ;
    public final void rule__SafetyCriticalViewpoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4418:1: ( rule__SafetyCriticalViewpoint__Group__7__Impl rule__SafetyCriticalViewpoint__Group__8 )
            // InternalSafetyDSL.g:4419:2: rule__SafetyCriticalViewpoint__Group__7__Impl rule__SafetyCriticalViewpoint__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__SafetyCriticalViewpoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__7"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__7__Impl"
    // InternalSafetyDSL.g:4426:1: rule__SafetyCriticalViewpoint__Group__7__Impl : ( ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 ) ) ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )* ) ) ;
    public final void rule__SafetyCriticalViewpoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4430:1: ( ( ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 ) ) ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )* ) ) )
            // InternalSafetyDSL.g:4431:1: ( ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 ) ) ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )* ) )
            {
            // InternalSafetyDSL.g:4431:1: ( ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 ) ) ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )* ) )
            // InternalSafetyDSL.g:4432:2: ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 ) ) ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )* )
            {
            // InternalSafetyDSL.g:4432:2: ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 ) )
            // InternalSafetyDSL.g:4433:3: ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsAssignment_7()); 
            // InternalSafetyDSL.g:4434:3: ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )
            // InternalSafetyDSL.g:4434:4: rule__SafetyCriticalViewpoint__RelationsAssignment_7
            {
            pushFollow(FOLLOW_12);
            rule__SafetyCriticalViewpoint__RelationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsAssignment_7()); 

            }

            // InternalSafetyDSL.g:4437:2: ( ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )* )
            // InternalSafetyDSL.g:4438:3: ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )*
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsAssignment_7()); 
            // InternalSafetyDSL.g:4439:3: ( rule__SafetyCriticalViewpoint__RelationsAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSafetyDSL.g:4439:4: rule__SafetyCriticalViewpoint__RelationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SafetyCriticalViewpoint__RelationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__7__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__8"
    // InternalSafetyDSL.g:4448:1: rule__SafetyCriticalViewpoint__Group__8 : rule__SafetyCriticalViewpoint__Group__8__Impl rule__SafetyCriticalViewpoint__Group__9 ;
    public final void rule__SafetyCriticalViewpoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4452:1: ( rule__SafetyCriticalViewpoint__Group__8__Impl rule__SafetyCriticalViewpoint__Group__9 )
            // InternalSafetyDSL.g:4453:2: rule__SafetyCriticalViewpoint__Group__8__Impl rule__SafetyCriticalViewpoint__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__SafetyCriticalViewpoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__8"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__8__Impl"
    // InternalSafetyDSL.g:4460:1: rule__SafetyCriticalViewpoint__Group__8__Impl : ( '}' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4464:1: ( ( '}' ) )
            // InternalSafetyDSL.g:4465:1: ( '}' )
            {
            // InternalSafetyDSL.g:4465:1: ( '}' )
            // InternalSafetyDSL.g:4466:2: '}'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__8__Impl"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__9"
    // InternalSafetyDSL.g:4475:1: rule__SafetyCriticalViewpoint__Group__9 : rule__SafetyCriticalViewpoint__Group__9__Impl ;
    public final void rule__SafetyCriticalViewpoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4479:1: ( rule__SafetyCriticalViewpoint__Group__9__Impl )
            // InternalSafetyDSL.g:4480:2: rule__SafetyCriticalViewpoint__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCriticalViewpoint__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__9"


    // $ANTLR start "rule__SafetyCriticalViewpoint__Group__9__Impl"
    // InternalSafetyDSL.g:4486:1: rule__SafetyCriticalViewpoint__Group__9__Impl : ( '}' ) ;
    public final void rule__SafetyCriticalViewpoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4490:1: ( ( '}' ) )
            // InternalSafetyDSL.g:4491:1: ( '}' )
            {
            // InternalSafetyDSL.g:4491:1: ( '}' )
            // InternalSafetyDSL.g:4492:2: '}'
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__Group__9__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__0"
    // InternalSafetyDSL.g:4502:1: rule__SafetyCritical__Group__0 : rule__SafetyCritical__Group__0__Impl rule__SafetyCritical__Group__1 ;
    public final void rule__SafetyCritical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4506:1: ( rule__SafetyCritical__Group__0__Impl rule__SafetyCritical__Group__1 )
            // InternalSafetyDSL.g:4507:2: rule__SafetyCritical__Group__0__Impl rule__SafetyCritical__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__0"


    // $ANTLR start "rule__SafetyCritical__Group__0__Impl"
    // InternalSafetyDSL.g:4514:1: rule__SafetyCritical__Group__0__Impl : ( 'safety-critical' ) ;
    public final void rule__SafetyCritical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4518:1: ( ( 'safety-critical' ) )
            // InternalSafetyDSL.g:4519:1: ( 'safety-critical' )
            {
            // InternalSafetyDSL.g:4519:1: ( 'safety-critical' )
            // InternalSafetyDSL.g:4520:2: 'safety-critical'
            {
             before(grammarAccess.getSafetyCriticalAccess().getSafetyCriticalKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSafetyCriticalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__1"
    // InternalSafetyDSL.g:4529:1: rule__SafetyCritical__Group__1 : rule__SafetyCritical__Group__1__Impl rule__SafetyCritical__Group__2 ;
    public final void rule__SafetyCritical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4533:1: ( rule__SafetyCritical__Group__1__Impl rule__SafetyCritical__Group__2 )
            // InternalSafetyDSL.g:4534:2: rule__SafetyCritical__Group__1__Impl rule__SafetyCritical__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SafetyCritical__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__1"


    // $ANTLR start "rule__SafetyCritical__Group__1__Impl"
    // InternalSafetyDSL.g:4541:1: rule__SafetyCritical__Group__1__Impl : ( ( rule__SafetyCritical__NameAssignment_1 ) ) ;
    public final void rule__SafetyCritical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4545:1: ( ( ( rule__SafetyCritical__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:4546:1: ( ( rule__SafetyCritical__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:4546:1: ( ( rule__SafetyCritical__NameAssignment_1 ) )
            // InternalSafetyDSL.g:4547:2: ( rule__SafetyCritical__NameAssignment_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:4548:2: ( rule__SafetyCritical__NameAssignment_1 )
            // InternalSafetyDSL.g:4548:3: rule__SafetyCritical__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__2"
    // InternalSafetyDSL.g:4556:1: rule__SafetyCritical__Group__2 : rule__SafetyCritical__Group__2__Impl rule__SafetyCritical__Group__3 ;
    public final void rule__SafetyCritical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4560:1: ( rule__SafetyCritical__Group__2__Impl rule__SafetyCritical__Group__3 )
            // InternalSafetyDSL.g:4561:2: rule__SafetyCritical__Group__2__Impl rule__SafetyCritical__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__SafetyCritical__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__2"


    // $ANTLR start "rule__SafetyCritical__Group__2__Impl"
    // InternalSafetyDSL.g:4568:1: rule__SafetyCritical__Group__2__Impl : ( '{' ) ;
    public final void rule__SafetyCritical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4572:1: ( ( '{' ) )
            // InternalSafetyDSL.g:4573:1: ( '{' )
            {
            // InternalSafetyDSL.g:4573:1: ( '{' )
            // InternalSafetyDSL.g:4574:2: '{'
            {
             before(grammarAccess.getSafetyCriticalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__2__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__3"
    // InternalSafetyDSL.g:4583:1: rule__SafetyCritical__Group__3 : rule__SafetyCritical__Group__3__Impl rule__SafetyCritical__Group__4 ;
    public final void rule__SafetyCritical__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4587:1: ( rule__SafetyCritical__Group__3__Impl rule__SafetyCritical__Group__4 )
            // InternalSafetyDSL.g:4588:2: rule__SafetyCritical__Group__3__Impl rule__SafetyCritical__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__SafetyCritical__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__3"


    // $ANTLR start "rule__SafetyCritical__Group__3__Impl"
    // InternalSafetyDSL.g:4595:1: rule__SafetyCritical__Group__3__Impl : ( 'criticalityLevel=' ) ;
    public final void rule__SafetyCritical__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4599:1: ( ( 'criticalityLevel=' ) )
            // InternalSafetyDSL.g:4600:1: ( 'criticalityLevel=' )
            {
            // InternalSafetyDSL.g:4600:1: ( 'criticalityLevel=' )
            // InternalSafetyDSL.g:4601:2: 'criticalityLevel='
            {
             before(grammarAccess.getSafetyCriticalAccess().getCriticalityLevelKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getCriticalityLevelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__3__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__4"
    // InternalSafetyDSL.g:4610:1: rule__SafetyCritical__Group__4 : rule__SafetyCritical__Group__4__Impl rule__SafetyCritical__Group__5 ;
    public final void rule__SafetyCritical__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4614:1: ( rule__SafetyCritical__Group__4__Impl rule__SafetyCritical__Group__5 )
            // InternalSafetyDSL.g:4615:2: rule__SafetyCritical__Group__4__Impl rule__SafetyCritical__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__SafetyCritical__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__4"


    // $ANTLR start "rule__SafetyCritical__Group__4__Impl"
    // InternalSafetyDSL.g:4622:1: rule__SafetyCritical__Group__4__Impl : ( ( rule__SafetyCritical__LevelAssignment_4 ) ) ;
    public final void rule__SafetyCritical__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4626:1: ( ( ( rule__SafetyCritical__LevelAssignment_4 ) ) )
            // InternalSafetyDSL.g:4627:1: ( ( rule__SafetyCritical__LevelAssignment_4 ) )
            {
            // InternalSafetyDSL.g:4627:1: ( ( rule__SafetyCritical__LevelAssignment_4 ) )
            // InternalSafetyDSL.g:4628:2: ( rule__SafetyCritical__LevelAssignment_4 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getLevelAssignment_4()); 
            // InternalSafetyDSL.g:4629:2: ( rule__SafetyCritical__LevelAssignment_4 )
            // InternalSafetyDSL.g:4629:3: rule__SafetyCritical__LevelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__LevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getLevelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__4__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__5"
    // InternalSafetyDSL.g:4637:1: rule__SafetyCritical__Group__5 : rule__SafetyCritical__Group__5__Impl rule__SafetyCritical__Group__6 ;
    public final void rule__SafetyCritical__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4641:1: ( rule__SafetyCritical__Group__5__Impl rule__SafetyCritical__Group__6 )
            // InternalSafetyDSL.g:4642:2: rule__SafetyCritical__Group__5__Impl rule__SafetyCritical__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__SafetyCritical__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__5"


    // $ANTLR start "rule__SafetyCritical__Group__5__Impl"
    // InternalSafetyDSL.g:4649:1: rule__SafetyCritical__Group__5__Impl : ( ';' ) ;
    public final void rule__SafetyCritical__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4653:1: ( ( ';' ) )
            // InternalSafetyDSL.g:4654:1: ( ';' )
            {
            // InternalSafetyDSL.g:4654:1: ( ';' )
            // InternalSafetyDSL.g:4655:2: ';'
            {
             before(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__5__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__6"
    // InternalSafetyDSL.g:4664:1: rule__SafetyCritical__Group__6 : rule__SafetyCritical__Group__6__Impl rule__SafetyCritical__Group__7 ;
    public final void rule__SafetyCritical__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4668:1: ( rule__SafetyCritical__Group__6__Impl rule__SafetyCritical__Group__7 )
            // InternalSafetyDSL.g:4669:2: rule__SafetyCritical__Group__6__Impl rule__SafetyCritical__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__6"


    // $ANTLR start "rule__SafetyCritical__Group__6__Impl"
    // InternalSafetyDSL.g:4676:1: rule__SafetyCritical__Group__6__Impl : ( 'implementedSafetyRequirements=' ) ;
    public final void rule__SafetyCritical__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4680:1: ( ( 'implementedSafetyRequirements=' ) )
            // InternalSafetyDSL.g:4681:1: ( 'implementedSafetyRequirements=' )
            {
            // InternalSafetyDSL.g:4681:1: ( 'implementedSafetyRequirements=' )
            // InternalSafetyDSL.g:4682:2: 'implementedSafetyRequirements='
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__6__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__7"
    // InternalSafetyDSL.g:4691:1: rule__SafetyCritical__Group__7 : rule__SafetyCritical__Group__7__Impl rule__SafetyCritical__Group__8 ;
    public final void rule__SafetyCritical__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4695:1: ( rule__SafetyCritical__Group__7__Impl rule__SafetyCritical__Group__8 )
            // InternalSafetyDSL.g:4696:2: rule__SafetyCritical__Group__7__Impl rule__SafetyCritical__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__SafetyCritical__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__7"


    // $ANTLR start "rule__SafetyCritical__Group__7__Impl"
    // InternalSafetyDSL.g:4703:1: rule__SafetyCritical__Group__7__Impl : ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 ) ) ;
    public final void rule__SafetyCritical__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4707:1: ( ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 ) ) )
            // InternalSafetyDSL.g:4708:1: ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 ) )
            {
            // InternalSafetyDSL.g:4708:1: ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 ) )
            // InternalSafetyDSL.g:4709:2: ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsAssignment_7()); 
            // InternalSafetyDSL.g:4710:2: ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 )
            // InternalSafetyDSL.g:4710:3: rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__7__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__8"
    // InternalSafetyDSL.g:4718:1: rule__SafetyCritical__Group__8 : rule__SafetyCritical__Group__8__Impl rule__SafetyCritical__Group__9 ;
    public final void rule__SafetyCritical__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4722:1: ( rule__SafetyCritical__Group__8__Impl rule__SafetyCritical__Group__9 )
            // InternalSafetyDSL.g:4723:2: rule__SafetyCritical__Group__8__Impl rule__SafetyCritical__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__SafetyCritical__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__8"


    // $ANTLR start "rule__SafetyCritical__Group__8__Impl"
    // InternalSafetyDSL.g:4730:1: rule__SafetyCritical__Group__8__Impl : ( ( rule__SafetyCritical__Group_8__0 )* ) ;
    public final void rule__SafetyCritical__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4734:1: ( ( ( rule__SafetyCritical__Group_8__0 )* ) )
            // InternalSafetyDSL.g:4735:1: ( ( rule__SafetyCritical__Group_8__0 )* )
            {
            // InternalSafetyDSL.g:4735:1: ( ( rule__SafetyCritical__Group_8__0 )* )
            // InternalSafetyDSL.g:4736:2: ( rule__SafetyCritical__Group_8__0 )*
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_8()); 
            // InternalSafetyDSL.g:4737:2: ( rule__SafetyCritical__Group_8__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSafetyDSL.g:4737:3: rule__SafetyCritical__Group_8__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SafetyCritical__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSafetyCriticalAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__8__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__9"
    // InternalSafetyDSL.g:4745:1: rule__SafetyCritical__Group__9 : rule__SafetyCritical__Group__9__Impl rule__SafetyCritical__Group__10 ;
    public final void rule__SafetyCritical__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4749:1: ( rule__SafetyCritical__Group__9__Impl rule__SafetyCritical__Group__10 )
            // InternalSafetyDSL.g:4750:2: rule__SafetyCritical__Group__9__Impl rule__SafetyCritical__Group__10
            {
            pushFollow(FOLLOW_42);
            rule__SafetyCritical__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__9"


    // $ANTLR start "rule__SafetyCritical__Group__9__Impl"
    // InternalSafetyDSL.g:4757:1: rule__SafetyCritical__Group__9__Impl : ( ';' ) ;
    public final void rule__SafetyCritical__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4761:1: ( ( ';' ) )
            // InternalSafetyDSL.g:4762:1: ( ';' )
            {
            // InternalSafetyDSL.g:4762:1: ( ';' )
            // InternalSafetyDSL.g:4763:2: ';'
            {
             before(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_9()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__9__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__10"
    // InternalSafetyDSL.g:4772:1: rule__SafetyCritical__Group__10 : rule__SafetyCritical__Group__10__Impl rule__SafetyCritical__Group__11 ;
    public final void rule__SafetyCritical__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4776:1: ( rule__SafetyCritical__Group__10__Impl rule__SafetyCritical__Group__11 )
            // InternalSafetyDSL.g:4777:2: rule__SafetyCritical__Group__10__Impl rule__SafetyCritical__Group__11
            {
            pushFollow(FOLLOW_42);
            rule__SafetyCritical__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__10"


    // $ANTLR start "rule__SafetyCritical__Group__10__Impl"
    // InternalSafetyDSL.g:4784:1: rule__SafetyCritical__Group__10__Impl : ( ( rule__SafetyCritical__Group_10__0 )? ) ;
    public final void rule__SafetyCritical__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4788:1: ( ( ( rule__SafetyCritical__Group_10__0 )? ) )
            // InternalSafetyDSL.g:4789:1: ( ( rule__SafetyCritical__Group_10__0 )? )
            {
            // InternalSafetyDSL.g:4789:1: ( ( rule__SafetyCritical__Group_10__0 )? )
            // InternalSafetyDSL.g:4790:2: ( rule__SafetyCritical__Group_10__0 )?
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_10()); 
            // InternalSafetyDSL.g:4791:2: ( rule__SafetyCritical__Group_10__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSafetyDSL.g:4791:3: rule__SafetyCritical__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyCritical__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyCriticalAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__10__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__11"
    // InternalSafetyDSL.g:4799:1: rule__SafetyCritical__Group__11 : rule__SafetyCritical__Group__11__Impl rule__SafetyCritical__Group__12 ;
    public final void rule__SafetyCritical__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4803:1: ( rule__SafetyCritical__Group__11__Impl rule__SafetyCritical__Group__12 )
            // InternalSafetyDSL.g:4804:2: rule__SafetyCritical__Group__11__Impl rule__SafetyCritical__Group__12
            {
            pushFollow(FOLLOW_42);
            rule__SafetyCritical__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__11"


    // $ANTLR start "rule__SafetyCritical__Group__11__Impl"
    // InternalSafetyDSL.g:4811:1: rule__SafetyCritical__Group__11__Impl : ( ( rule__SafetyCritical__Group_11__0 )? ) ;
    public final void rule__SafetyCritical__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4815:1: ( ( ( rule__SafetyCritical__Group_11__0 )? ) )
            // InternalSafetyDSL.g:4816:1: ( ( rule__SafetyCritical__Group_11__0 )? )
            {
            // InternalSafetyDSL.g:4816:1: ( ( rule__SafetyCritical__Group_11__0 )? )
            // InternalSafetyDSL.g:4817:2: ( rule__SafetyCritical__Group_11__0 )?
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_11()); 
            // InternalSafetyDSL.g:4818:2: ( rule__SafetyCritical__Group_11__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSafetyDSL.g:4818:3: rule__SafetyCritical__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyCritical__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyCriticalAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__11__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__12"
    // InternalSafetyDSL.g:4826:1: rule__SafetyCritical__Group__12 : rule__SafetyCritical__Group__12__Impl rule__SafetyCritical__Group__13 ;
    public final void rule__SafetyCritical__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4830:1: ( rule__SafetyCritical__Group__12__Impl rule__SafetyCritical__Group__13 )
            // InternalSafetyDSL.g:4831:2: rule__SafetyCritical__Group__12__Impl rule__SafetyCritical__Group__13
            {
            pushFollow(FOLLOW_42);
            rule__SafetyCritical__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__12"


    // $ANTLR start "rule__SafetyCritical__Group__12__Impl"
    // InternalSafetyDSL.g:4838:1: rule__SafetyCritical__Group__12__Impl : ( ( rule__SafetyCritical__Group_12__0 )? ) ;
    public final void rule__SafetyCritical__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4842:1: ( ( ( rule__SafetyCritical__Group_12__0 )? ) )
            // InternalSafetyDSL.g:4843:1: ( ( rule__SafetyCritical__Group_12__0 )? )
            {
            // InternalSafetyDSL.g:4843:1: ( ( rule__SafetyCritical__Group_12__0 )? )
            // InternalSafetyDSL.g:4844:2: ( rule__SafetyCritical__Group_12__0 )?
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_12()); 
            // InternalSafetyDSL.g:4845:2: ( rule__SafetyCritical__Group_12__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSafetyDSL.g:4845:3: rule__SafetyCritical__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyCritical__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyCriticalAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__12__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__13"
    // InternalSafetyDSL.g:4853:1: rule__SafetyCritical__Group__13 : rule__SafetyCritical__Group__13__Impl rule__SafetyCritical__Group__14 ;
    public final void rule__SafetyCritical__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4857:1: ( rule__SafetyCritical__Group__13__Impl rule__SafetyCritical__Group__14 )
            // InternalSafetyDSL.g:4858:2: rule__SafetyCritical__Group__13__Impl rule__SafetyCritical__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__SafetyCritical__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__13"


    // $ANTLR start "rule__SafetyCritical__Group__13__Impl"
    // InternalSafetyDSL.g:4865:1: rule__SafetyCritical__Group__13__Impl : ( '}' ) ;
    public final void rule__SafetyCritical__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4869:1: ( ( '}' ) )
            // InternalSafetyDSL.g:4870:1: ( '}' )
            {
            // InternalSafetyDSL.g:4870:1: ( '}' )
            // InternalSafetyDSL.g:4871:2: '}'
            {
             before(grammarAccess.getSafetyCriticalAccess().getRightCurlyBracketKeyword_13()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__13__Impl"


    // $ANTLR start "rule__SafetyCritical__Group__14"
    // InternalSafetyDSL.g:4880:1: rule__SafetyCritical__Group__14 : rule__SafetyCritical__Group__14__Impl ;
    public final void rule__SafetyCritical__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4884:1: ( rule__SafetyCritical__Group__14__Impl )
            // InternalSafetyDSL.g:4885:2: rule__SafetyCritical__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__14"


    // $ANTLR start "rule__SafetyCritical__Group__14__Impl"
    // InternalSafetyDSL.g:4891:1: rule__SafetyCritical__Group__14__Impl : ( ';' ) ;
    public final void rule__SafetyCritical__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4895:1: ( ( ';' ) )
            // InternalSafetyDSL.g:4896:1: ( ';' )
            {
            // InternalSafetyDSL.g:4896:1: ( ';' )
            // InternalSafetyDSL.g:4897:2: ';'
            {
             before(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_14()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group__14__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_8__0"
    // InternalSafetyDSL.g:4907:1: rule__SafetyCritical__Group_8__0 : rule__SafetyCritical__Group_8__0__Impl rule__SafetyCritical__Group_8__1 ;
    public final void rule__SafetyCritical__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4911:1: ( rule__SafetyCritical__Group_8__0__Impl rule__SafetyCritical__Group_8__1 )
            // InternalSafetyDSL.g:4912:2: rule__SafetyCritical__Group_8__0__Impl rule__SafetyCritical__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_8__0"


    // $ANTLR start "rule__SafetyCritical__Group_8__0__Impl"
    // InternalSafetyDSL.g:4919:1: rule__SafetyCritical__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SafetyCritical__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4923:1: ( ( ',' ) )
            // InternalSafetyDSL.g:4924:1: ( ',' )
            {
            // InternalSafetyDSL.g:4924:1: ( ',' )
            // InternalSafetyDSL.g:4925:2: ','
            {
             before(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_8__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_8__1"
    // InternalSafetyDSL.g:4934:1: rule__SafetyCritical__Group_8__1 : rule__SafetyCritical__Group_8__1__Impl ;
    public final void rule__SafetyCritical__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4938:1: ( rule__SafetyCritical__Group_8__1__Impl )
            // InternalSafetyDSL.g:4939:2: rule__SafetyCritical__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_8__1"


    // $ANTLR start "rule__SafetyCritical__Group_8__1__Impl"
    // InternalSafetyDSL.g:4945:1: rule__SafetyCritical__Group_8__1__Impl : ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 ) ) ;
    public final void rule__SafetyCritical__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4949:1: ( ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 ) ) )
            // InternalSafetyDSL.g:4950:1: ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 ) )
            {
            // InternalSafetyDSL.g:4950:1: ( ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 ) )
            // InternalSafetyDSL.g:4951:2: ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsAssignment_8_1()); 
            // InternalSafetyDSL.g:4952:2: ( rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 )
            // InternalSafetyDSL.g:4952:3: rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_8__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_10__0"
    // InternalSafetyDSL.g:4961:1: rule__SafetyCritical__Group_10__0 : rule__SafetyCritical__Group_10__0__Impl rule__SafetyCritical__Group_10__1 ;
    public final void rule__SafetyCritical__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4965:1: ( rule__SafetyCritical__Group_10__0__Impl rule__SafetyCritical__Group_10__1 )
            // InternalSafetyDSL.g:4966:2: rule__SafetyCritical__Group_10__0__Impl rule__SafetyCritical__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__0"


    // $ANTLR start "rule__SafetyCritical__Group_10__0__Impl"
    // InternalSafetyDSL.g:4973:1: rule__SafetyCritical__Group_10__0__Impl : ( 'implementedTactics=' ) ;
    public final void rule__SafetyCritical__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4977:1: ( ( 'implementedTactics=' ) )
            // InternalSafetyDSL.g:4978:1: ( 'implementedTactics=' )
            {
            // InternalSafetyDSL.g:4978:1: ( 'implementedTactics=' )
            // InternalSafetyDSL.g:4979:2: 'implementedTactics='
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsKeyword_10_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_10__1"
    // InternalSafetyDSL.g:4988:1: rule__SafetyCritical__Group_10__1 : rule__SafetyCritical__Group_10__1__Impl rule__SafetyCritical__Group_10__2 ;
    public final void rule__SafetyCritical__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:4992:1: ( rule__SafetyCritical__Group_10__1__Impl rule__SafetyCritical__Group_10__2 )
            // InternalSafetyDSL.g:4993:2: rule__SafetyCritical__Group_10__1__Impl rule__SafetyCritical__Group_10__2
            {
            pushFollow(FOLLOW_25);
            rule__SafetyCritical__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__1"


    // $ANTLR start "rule__SafetyCritical__Group_10__1__Impl"
    // InternalSafetyDSL.g:5000:1: rule__SafetyCritical__Group_10__1__Impl : ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_1 ) ) ;
    public final void rule__SafetyCritical__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5004:1: ( ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_1 ) ) )
            // InternalSafetyDSL.g:5005:1: ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_1 ) )
            {
            // InternalSafetyDSL.g:5005:1: ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_1 ) )
            // InternalSafetyDSL.g:5006:2: ( rule__SafetyCritical__ImplementedTacticsAssignment_10_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsAssignment_10_1()); 
            // InternalSafetyDSL.g:5007:2: ( rule__SafetyCritical__ImplementedTacticsAssignment_10_1 )
            // InternalSafetyDSL.g:5007:3: rule__SafetyCritical__ImplementedTacticsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__ImplementedTacticsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_10__2"
    // InternalSafetyDSL.g:5015:1: rule__SafetyCritical__Group_10__2 : rule__SafetyCritical__Group_10__2__Impl rule__SafetyCritical__Group_10__3 ;
    public final void rule__SafetyCritical__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5019:1: ( rule__SafetyCritical__Group_10__2__Impl rule__SafetyCritical__Group_10__3 )
            // InternalSafetyDSL.g:5020:2: rule__SafetyCritical__Group_10__2__Impl rule__SafetyCritical__Group_10__3
            {
            pushFollow(FOLLOW_25);
            rule__SafetyCritical__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__2"


    // $ANTLR start "rule__SafetyCritical__Group_10__2__Impl"
    // InternalSafetyDSL.g:5027:1: rule__SafetyCritical__Group_10__2__Impl : ( ( rule__SafetyCritical__Group_10_2__0 )* ) ;
    public final void rule__SafetyCritical__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5031:1: ( ( ( rule__SafetyCritical__Group_10_2__0 )* ) )
            // InternalSafetyDSL.g:5032:1: ( ( rule__SafetyCritical__Group_10_2__0 )* )
            {
            // InternalSafetyDSL.g:5032:1: ( ( rule__SafetyCritical__Group_10_2__0 )* )
            // InternalSafetyDSL.g:5033:2: ( rule__SafetyCritical__Group_10_2__0 )*
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_10_2()); 
            // InternalSafetyDSL.g:5034:2: ( rule__SafetyCritical__Group_10_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSafetyDSL.g:5034:3: rule__SafetyCritical__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SafetyCritical__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSafetyCriticalAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__2__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_10__3"
    // InternalSafetyDSL.g:5042:1: rule__SafetyCritical__Group_10__3 : rule__SafetyCritical__Group_10__3__Impl ;
    public final void rule__SafetyCritical__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5046:1: ( rule__SafetyCritical__Group_10__3__Impl )
            // InternalSafetyDSL.g:5047:2: rule__SafetyCritical__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__3"


    // $ANTLR start "rule__SafetyCritical__Group_10__3__Impl"
    // InternalSafetyDSL.g:5053:1: rule__SafetyCritical__Group_10__3__Impl : ( ';' ) ;
    public final void rule__SafetyCritical__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5057:1: ( ( ';' ) )
            // InternalSafetyDSL.g:5058:1: ( ';' )
            {
            // InternalSafetyDSL.g:5058:1: ( ';' )
            // InternalSafetyDSL.g:5059:2: ';'
            {
             before(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_10_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10__3__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_10_2__0"
    // InternalSafetyDSL.g:5069:1: rule__SafetyCritical__Group_10_2__0 : rule__SafetyCritical__Group_10_2__0__Impl rule__SafetyCritical__Group_10_2__1 ;
    public final void rule__SafetyCritical__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5073:1: ( rule__SafetyCritical__Group_10_2__0__Impl rule__SafetyCritical__Group_10_2__1 )
            // InternalSafetyDSL.g:5074:2: rule__SafetyCritical__Group_10_2__0__Impl rule__SafetyCritical__Group_10_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10_2__0"


    // $ANTLR start "rule__SafetyCritical__Group_10_2__0__Impl"
    // InternalSafetyDSL.g:5081:1: rule__SafetyCritical__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__SafetyCritical__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5085:1: ( ( ',' ) )
            // InternalSafetyDSL.g:5086:1: ( ',' )
            {
            // InternalSafetyDSL.g:5086:1: ( ',' )
            // InternalSafetyDSL.g:5087:2: ','
            {
             before(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_10_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10_2__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_10_2__1"
    // InternalSafetyDSL.g:5096:1: rule__SafetyCritical__Group_10_2__1 : rule__SafetyCritical__Group_10_2__1__Impl ;
    public final void rule__SafetyCritical__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5100:1: ( rule__SafetyCritical__Group_10_2__1__Impl )
            // InternalSafetyDSL.g:5101:2: rule__SafetyCritical__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10_2__1"


    // $ANTLR start "rule__SafetyCritical__Group_10_2__1__Impl"
    // InternalSafetyDSL.g:5107:1: rule__SafetyCritical__Group_10_2__1__Impl : ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 ) ) ;
    public final void rule__SafetyCritical__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5111:1: ( ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 ) ) )
            // InternalSafetyDSL.g:5112:1: ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 ) )
            {
            // InternalSafetyDSL.g:5112:1: ( ( rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 ) )
            // InternalSafetyDSL.g:5113:2: ( rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsAssignment_10_2_1()); 
            // InternalSafetyDSL.g:5114:2: ( rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 )
            // InternalSafetyDSL.g:5114:3: rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_10_2__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_11__0"
    // InternalSafetyDSL.g:5123:1: rule__SafetyCritical__Group_11__0 : rule__SafetyCritical__Group_11__0__Impl rule__SafetyCritical__Group_11__1 ;
    public final void rule__SafetyCritical__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5127:1: ( rule__SafetyCritical__Group_11__0__Impl rule__SafetyCritical__Group_11__1 )
            // InternalSafetyDSL.g:5128:2: rule__SafetyCritical__Group_11__0__Impl rule__SafetyCritical__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__0"


    // $ANTLR start "rule__SafetyCritical__Group_11__0__Impl"
    // InternalSafetyDSL.g:5135:1: rule__SafetyCritical__Group_11__0__Impl : ( 'sub-elements=' ) ;
    public final void rule__SafetyCritical__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5139:1: ( ( 'sub-elements=' ) )
            // InternalSafetyDSL.g:5140:1: ( 'sub-elements=' )
            {
            // InternalSafetyDSL.g:5140:1: ( 'sub-elements=' )
            // InternalSafetyDSL.g:5141:2: 'sub-elements='
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubElementsKeyword_11_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSubElementsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_11__1"
    // InternalSafetyDSL.g:5150:1: rule__SafetyCritical__Group_11__1 : rule__SafetyCritical__Group_11__1__Impl rule__SafetyCritical__Group_11__2 ;
    public final void rule__SafetyCritical__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5154:1: ( rule__SafetyCritical__Group_11__1__Impl rule__SafetyCritical__Group_11__2 )
            // InternalSafetyDSL.g:5155:2: rule__SafetyCritical__Group_11__1__Impl rule__SafetyCritical__Group_11__2
            {
            pushFollow(FOLLOW_25);
            rule__SafetyCritical__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__1"


    // $ANTLR start "rule__SafetyCritical__Group_11__1__Impl"
    // InternalSafetyDSL.g:5162:1: rule__SafetyCritical__Group_11__1__Impl : ( ( rule__SafetyCritical__SubelementsAssignment_11_1 ) ) ;
    public final void rule__SafetyCritical__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5166:1: ( ( ( rule__SafetyCritical__SubelementsAssignment_11_1 ) ) )
            // InternalSafetyDSL.g:5167:1: ( ( rule__SafetyCritical__SubelementsAssignment_11_1 ) )
            {
            // InternalSafetyDSL.g:5167:1: ( ( rule__SafetyCritical__SubelementsAssignment_11_1 ) )
            // InternalSafetyDSL.g:5168:2: ( rule__SafetyCritical__SubelementsAssignment_11_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubelementsAssignment_11_1()); 
            // InternalSafetyDSL.g:5169:2: ( rule__SafetyCritical__SubelementsAssignment_11_1 )
            // InternalSafetyDSL.g:5169:3: rule__SafetyCritical__SubelementsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__SubelementsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getSubelementsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_11__2"
    // InternalSafetyDSL.g:5177:1: rule__SafetyCritical__Group_11__2 : rule__SafetyCritical__Group_11__2__Impl rule__SafetyCritical__Group_11__3 ;
    public final void rule__SafetyCritical__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5181:1: ( rule__SafetyCritical__Group_11__2__Impl rule__SafetyCritical__Group_11__3 )
            // InternalSafetyDSL.g:5182:2: rule__SafetyCritical__Group_11__2__Impl rule__SafetyCritical__Group_11__3
            {
            pushFollow(FOLLOW_25);
            rule__SafetyCritical__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__2"


    // $ANTLR start "rule__SafetyCritical__Group_11__2__Impl"
    // InternalSafetyDSL.g:5189:1: rule__SafetyCritical__Group_11__2__Impl : ( ( rule__SafetyCritical__Group_11_2__0 )* ) ;
    public final void rule__SafetyCritical__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5193:1: ( ( ( rule__SafetyCritical__Group_11_2__0 )* ) )
            // InternalSafetyDSL.g:5194:1: ( ( rule__SafetyCritical__Group_11_2__0 )* )
            {
            // InternalSafetyDSL.g:5194:1: ( ( rule__SafetyCritical__Group_11_2__0 )* )
            // InternalSafetyDSL.g:5195:2: ( rule__SafetyCritical__Group_11_2__0 )*
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_11_2()); 
            // InternalSafetyDSL.g:5196:2: ( rule__SafetyCritical__Group_11_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSafetyDSL.g:5196:3: rule__SafetyCritical__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SafetyCritical__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSafetyCriticalAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__2__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_11__3"
    // InternalSafetyDSL.g:5204:1: rule__SafetyCritical__Group_11__3 : rule__SafetyCritical__Group_11__3__Impl ;
    public final void rule__SafetyCritical__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5208:1: ( rule__SafetyCritical__Group_11__3__Impl )
            // InternalSafetyDSL.g:5209:2: rule__SafetyCritical__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__3"


    // $ANTLR start "rule__SafetyCritical__Group_11__3__Impl"
    // InternalSafetyDSL.g:5215:1: rule__SafetyCritical__Group_11__3__Impl : ( ';' ) ;
    public final void rule__SafetyCritical__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5219:1: ( ( ';' ) )
            // InternalSafetyDSL.g:5220:1: ( ';' )
            {
            // InternalSafetyDSL.g:5220:1: ( ';' )
            // InternalSafetyDSL.g:5221:2: ';'
            {
             before(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_11_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11__3__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_11_2__0"
    // InternalSafetyDSL.g:5231:1: rule__SafetyCritical__Group_11_2__0 : rule__SafetyCritical__Group_11_2__0__Impl rule__SafetyCritical__Group_11_2__1 ;
    public final void rule__SafetyCritical__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5235:1: ( rule__SafetyCritical__Group_11_2__0__Impl rule__SafetyCritical__Group_11_2__1 )
            // InternalSafetyDSL.g:5236:2: rule__SafetyCritical__Group_11_2__0__Impl rule__SafetyCritical__Group_11_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11_2__0"


    // $ANTLR start "rule__SafetyCritical__Group_11_2__0__Impl"
    // InternalSafetyDSL.g:5243:1: rule__SafetyCritical__Group_11_2__0__Impl : ( ',' ) ;
    public final void rule__SafetyCritical__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5247:1: ( ( ',' ) )
            // InternalSafetyDSL.g:5248:1: ( ',' )
            {
            // InternalSafetyDSL.g:5248:1: ( ',' )
            // InternalSafetyDSL.g:5249:2: ','
            {
             before(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_11_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11_2__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_11_2__1"
    // InternalSafetyDSL.g:5258:1: rule__SafetyCritical__Group_11_2__1 : rule__SafetyCritical__Group_11_2__1__Impl ;
    public final void rule__SafetyCritical__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5262:1: ( rule__SafetyCritical__Group_11_2__1__Impl )
            // InternalSafetyDSL.g:5263:2: rule__SafetyCritical__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11_2__1"


    // $ANTLR start "rule__SafetyCritical__Group_11_2__1__Impl"
    // InternalSafetyDSL.g:5269:1: rule__SafetyCritical__Group_11_2__1__Impl : ( ( rule__SafetyCritical__SubelementsAssignment_11_2_1 ) ) ;
    public final void rule__SafetyCritical__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5273:1: ( ( ( rule__SafetyCritical__SubelementsAssignment_11_2_1 ) ) )
            // InternalSafetyDSL.g:5274:1: ( ( rule__SafetyCritical__SubelementsAssignment_11_2_1 ) )
            {
            // InternalSafetyDSL.g:5274:1: ( ( rule__SafetyCritical__SubelementsAssignment_11_2_1 ) )
            // InternalSafetyDSL.g:5275:2: ( rule__SafetyCritical__SubelementsAssignment_11_2_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubelementsAssignment_11_2_1()); 
            // InternalSafetyDSL.g:5276:2: ( rule__SafetyCritical__SubelementsAssignment_11_2_1 )
            // InternalSafetyDSL.g:5276:3: rule__SafetyCritical__SubelementsAssignment_11_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__SubelementsAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getSubelementsAssignment_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_11_2__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_12__0"
    // InternalSafetyDSL.g:5285:1: rule__SafetyCritical__Group_12__0 : rule__SafetyCritical__Group_12__0__Impl rule__SafetyCritical__Group_12__1 ;
    public final void rule__SafetyCritical__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5289:1: ( rule__SafetyCritical__Group_12__0__Impl rule__SafetyCritical__Group_12__1 )
            // InternalSafetyDSL.g:5290:2: rule__SafetyCritical__Group_12__0__Impl rule__SafetyCritical__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12__0"


    // $ANTLR start "rule__SafetyCritical__Group_12__0__Impl"
    // InternalSafetyDSL.g:5297:1: rule__SafetyCritical__Group_12__0__Impl : ( 'hasState' ) ;
    public final void rule__SafetyCritical__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5301:1: ( ( 'hasState' ) )
            // InternalSafetyDSL.g:5302:1: ( 'hasState' )
            {
            // InternalSafetyDSL.g:5302:1: ( 'hasState' )
            // InternalSafetyDSL.g:5303:2: 'hasState'
            {
             before(grammarAccess.getSafetyCriticalAccess().getHasStateKeyword_12_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getHasStateKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_12__1"
    // InternalSafetyDSL.g:5312:1: rule__SafetyCritical__Group_12__1 : rule__SafetyCritical__Group_12__1__Impl rule__SafetyCritical__Group_12__2 ;
    public final void rule__SafetyCritical__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5316:1: ( rule__SafetyCritical__Group_12__1__Impl rule__SafetyCritical__Group_12__2 )
            // InternalSafetyDSL.g:5317:2: rule__SafetyCritical__Group_12__1__Impl rule__SafetyCritical__Group_12__2
            {
            pushFollow(FOLLOW_43);
            rule__SafetyCritical__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12__1"


    // $ANTLR start "rule__SafetyCritical__Group_12__1__Impl"
    // InternalSafetyDSL.g:5324:1: rule__SafetyCritical__Group_12__1__Impl : ( ( rule__SafetyCritical__StatesAssignment_12_1 ) ) ;
    public final void rule__SafetyCritical__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5328:1: ( ( ( rule__SafetyCritical__StatesAssignment_12_1 ) ) )
            // InternalSafetyDSL.g:5329:1: ( ( rule__SafetyCritical__StatesAssignment_12_1 ) )
            {
            // InternalSafetyDSL.g:5329:1: ( ( rule__SafetyCritical__StatesAssignment_12_1 ) )
            // InternalSafetyDSL.g:5330:2: ( rule__SafetyCritical__StatesAssignment_12_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getStatesAssignment_12_1()); 
            // InternalSafetyDSL.g:5331:2: ( rule__SafetyCritical__StatesAssignment_12_1 )
            // InternalSafetyDSL.g:5331:3: rule__SafetyCritical__StatesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__StatesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getStatesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12__1__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_12__2"
    // InternalSafetyDSL.g:5339:1: rule__SafetyCritical__Group_12__2 : rule__SafetyCritical__Group_12__2__Impl ;
    public final void rule__SafetyCritical__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5343:1: ( rule__SafetyCritical__Group_12__2__Impl )
            // InternalSafetyDSL.g:5344:2: rule__SafetyCritical__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12__2"


    // $ANTLR start "rule__SafetyCritical__Group_12__2__Impl"
    // InternalSafetyDSL.g:5350:1: rule__SafetyCritical__Group_12__2__Impl : ( ( rule__SafetyCritical__Group_12_2__0 )* ) ;
    public final void rule__SafetyCritical__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5354:1: ( ( ( rule__SafetyCritical__Group_12_2__0 )* ) )
            // InternalSafetyDSL.g:5355:1: ( ( rule__SafetyCritical__Group_12_2__0 )* )
            {
            // InternalSafetyDSL.g:5355:1: ( ( rule__SafetyCritical__Group_12_2__0 )* )
            // InternalSafetyDSL.g:5356:2: ( rule__SafetyCritical__Group_12_2__0 )*
            {
             before(grammarAccess.getSafetyCriticalAccess().getGroup_12_2()); 
            // InternalSafetyDSL.g:5357:2: ( rule__SafetyCritical__Group_12_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSafetyDSL.g:5357:3: rule__SafetyCritical__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SafetyCritical__Group_12_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSafetyCriticalAccess().getGroup_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12__2__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_12_2__0"
    // InternalSafetyDSL.g:5366:1: rule__SafetyCritical__Group_12_2__0 : rule__SafetyCritical__Group_12_2__0__Impl rule__SafetyCritical__Group_12_2__1 ;
    public final void rule__SafetyCritical__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5370:1: ( rule__SafetyCritical__Group_12_2__0__Impl rule__SafetyCritical__Group_12_2__1 )
            // InternalSafetyDSL.g:5371:2: rule__SafetyCritical__Group_12_2__0__Impl rule__SafetyCritical__Group_12_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SafetyCritical__Group_12_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_12_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12_2__0"


    // $ANTLR start "rule__SafetyCritical__Group_12_2__0__Impl"
    // InternalSafetyDSL.g:5378:1: rule__SafetyCritical__Group_12_2__0__Impl : ( ',' ) ;
    public final void rule__SafetyCritical__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5382:1: ( ( ',' ) )
            // InternalSafetyDSL.g:5383:1: ( ',' )
            {
            // InternalSafetyDSL.g:5383:1: ( ',' )
            // InternalSafetyDSL.g:5384:2: ','
            {
             before(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_12_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getCommaKeyword_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12_2__0__Impl"


    // $ANTLR start "rule__SafetyCritical__Group_12_2__1"
    // InternalSafetyDSL.g:5393:1: rule__SafetyCritical__Group_12_2__1 : rule__SafetyCritical__Group_12_2__1__Impl ;
    public final void rule__SafetyCritical__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5397:1: ( rule__SafetyCritical__Group_12_2__1__Impl )
            // InternalSafetyDSL.g:5398:2: rule__SafetyCritical__Group_12_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__Group_12_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12_2__1"


    // $ANTLR start "rule__SafetyCritical__Group_12_2__1__Impl"
    // InternalSafetyDSL.g:5404:1: rule__SafetyCritical__Group_12_2__1__Impl : ( ( rule__SafetyCritical__StatesAssignment_12_2_1 ) ) ;
    public final void rule__SafetyCritical__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5408:1: ( ( ( rule__SafetyCritical__StatesAssignment_12_2_1 ) ) )
            // InternalSafetyDSL.g:5409:1: ( ( rule__SafetyCritical__StatesAssignment_12_2_1 ) )
            {
            // InternalSafetyDSL.g:5409:1: ( ( rule__SafetyCritical__StatesAssignment_12_2_1 ) )
            // InternalSafetyDSL.g:5410:2: ( rule__SafetyCritical__StatesAssignment_12_2_1 )
            {
             before(grammarAccess.getSafetyCriticalAccess().getStatesAssignment_12_2_1()); 
            // InternalSafetyDSL.g:5411:2: ( rule__SafetyCritical__StatesAssignment_12_2_1 )
            // InternalSafetyDSL.g:5411:3: rule__SafetyCritical__StatesAssignment_12_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyCritical__StatesAssignment_12_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyCriticalAccess().getStatesAssignment_12_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__Group_12_2__1__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_0__0"
    // InternalSafetyDSL.g:5420:1: rule__CriticalityLevel__Group_0__0 : rule__CriticalityLevel__Group_0__0__Impl rule__CriticalityLevel__Group_0__1 ;
    public final void rule__CriticalityLevel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5424:1: ( rule__CriticalityLevel__Group_0__0__Impl rule__CriticalityLevel__Group_0__1 )
            // InternalSafetyDSL.g:5425:2: rule__CriticalityLevel__Group_0__0__Impl rule__CriticalityLevel__Group_0__1
            {
            pushFollow(FOLLOW_44);
            rule__CriticalityLevel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_0__0"


    // $ANTLR start "rule__CriticalityLevel__Group_0__0__Impl"
    // InternalSafetyDSL.g:5432:1: rule__CriticalityLevel__Group_0__0__Impl : ( () ) ;
    public final void rule__CriticalityLevel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5436:1: ( ( () ) )
            // InternalSafetyDSL.g:5437:1: ( () )
            {
            // InternalSafetyDSL.g:5437:1: ( () )
            // InternalSafetyDSL.g:5438:2: ()
            {
             before(grammarAccess.getCriticalityLevelAccess().getLevelAAction_0_0()); 
            // InternalSafetyDSL.g:5439:2: ()
            // InternalSafetyDSL.g:5439:3: 
            {
            }

             after(grammarAccess.getCriticalityLevelAccess().getLevelAAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_0__0__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_0__1"
    // InternalSafetyDSL.g:5447:1: rule__CriticalityLevel__Group_0__1 : rule__CriticalityLevel__Group_0__1__Impl ;
    public final void rule__CriticalityLevel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5451:1: ( rule__CriticalityLevel__Group_0__1__Impl )
            // InternalSafetyDSL.g:5452:2: rule__CriticalityLevel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_0__1"


    // $ANTLR start "rule__CriticalityLevel__Group_0__1__Impl"
    // InternalSafetyDSL.g:5458:1: rule__CriticalityLevel__Group_0__1__Impl : ( 'A' ) ;
    public final void rule__CriticalityLevel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5462:1: ( ( 'A' ) )
            // InternalSafetyDSL.g:5463:1: ( 'A' )
            {
            // InternalSafetyDSL.g:5463:1: ( 'A' )
            // InternalSafetyDSL.g:5464:2: 'A'
            {
             before(grammarAccess.getCriticalityLevelAccess().getAKeyword_0_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCriticalityLevelAccess().getAKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_0__1__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_1__0"
    // InternalSafetyDSL.g:5474:1: rule__CriticalityLevel__Group_1__0 : rule__CriticalityLevel__Group_1__0__Impl rule__CriticalityLevel__Group_1__1 ;
    public final void rule__CriticalityLevel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5478:1: ( rule__CriticalityLevel__Group_1__0__Impl rule__CriticalityLevel__Group_1__1 )
            // InternalSafetyDSL.g:5479:2: rule__CriticalityLevel__Group_1__0__Impl rule__CriticalityLevel__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__CriticalityLevel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_1__0"


    // $ANTLR start "rule__CriticalityLevel__Group_1__0__Impl"
    // InternalSafetyDSL.g:5486:1: rule__CriticalityLevel__Group_1__0__Impl : ( () ) ;
    public final void rule__CriticalityLevel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5490:1: ( ( () ) )
            // InternalSafetyDSL.g:5491:1: ( () )
            {
            // InternalSafetyDSL.g:5491:1: ( () )
            // InternalSafetyDSL.g:5492:2: ()
            {
             before(grammarAccess.getCriticalityLevelAccess().getLevelBAction_1_0()); 
            // InternalSafetyDSL.g:5493:2: ()
            // InternalSafetyDSL.g:5493:3: 
            {
            }

             after(grammarAccess.getCriticalityLevelAccess().getLevelBAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_1__0__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_1__1"
    // InternalSafetyDSL.g:5501:1: rule__CriticalityLevel__Group_1__1 : rule__CriticalityLevel__Group_1__1__Impl ;
    public final void rule__CriticalityLevel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5505:1: ( rule__CriticalityLevel__Group_1__1__Impl )
            // InternalSafetyDSL.g:5506:2: rule__CriticalityLevel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_1__1"


    // $ANTLR start "rule__CriticalityLevel__Group_1__1__Impl"
    // InternalSafetyDSL.g:5512:1: rule__CriticalityLevel__Group_1__1__Impl : ( 'B' ) ;
    public final void rule__CriticalityLevel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5516:1: ( ( 'B' ) )
            // InternalSafetyDSL.g:5517:1: ( 'B' )
            {
            // InternalSafetyDSL.g:5517:1: ( 'B' )
            // InternalSafetyDSL.g:5518:2: 'B'
            {
             before(grammarAccess.getCriticalityLevelAccess().getBKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCriticalityLevelAccess().getBKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_1__1__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_2__0"
    // InternalSafetyDSL.g:5528:1: rule__CriticalityLevel__Group_2__0 : rule__CriticalityLevel__Group_2__0__Impl rule__CriticalityLevel__Group_2__1 ;
    public final void rule__CriticalityLevel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5532:1: ( rule__CriticalityLevel__Group_2__0__Impl rule__CriticalityLevel__Group_2__1 )
            // InternalSafetyDSL.g:5533:2: rule__CriticalityLevel__Group_2__0__Impl rule__CriticalityLevel__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__CriticalityLevel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_2__0"


    // $ANTLR start "rule__CriticalityLevel__Group_2__0__Impl"
    // InternalSafetyDSL.g:5540:1: rule__CriticalityLevel__Group_2__0__Impl : ( () ) ;
    public final void rule__CriticalityLevel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5544:1: ( ( () ) )
            // InternalSafetyDSL.g:5545:1: ( () )
            {
            // InternalSafetyDSL.g:5545:1: ( () )
            // InternalSafetyDSL.g:5546:2: ()
            {
             before(grammarAccess.getCriticalityLevelAccess().getLevelCAction_2_0()); 
            // InternalSafetyDSL.g:5547:2: ()
            // InternalSafetyDSL.g:5547:3: 
            {
            }

             after(grammarAccess.getCriticalityLevelAccess().getLevelCAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_2__0__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_2__1"
    // InternalSafetyDSL.g:5555:1: rule__CriticalityLevel__Group_2__1 : rule__CriticalityLevel__Group_2__1__Impl ;
    public final void rule__CriticalityLevel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5559:1: ( rule__CriticalityLevel__Group_2__1__Impl )
            // InternalSafetyDSL.g:5560:2: rule__CriticalityLevel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_2__1"


    // $ANTLR start "rule__CriticalityLevel__Group_2__1__Impl"
    // InternalSafetyDSL.g:5566:1: rule__CriticalityLevel__Group_2__1__Impl : ( 'C' ) ;
    public final void rule__CriticalityLevel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5570:1: ( ( 'C' ) )
            // InternalSafetyDSL.g:5571:1: ( 'C' )
            {
            // InternalSafetyDSL.g:5571:1: ( 'C' )
            // InternalSafetyDSL.g:5572:2: 'C'
            {
             before(grammarAccess.getCriticalityLevelAccess().getCKeyword_2_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCriticalityLevelAccess().getCKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_2__1__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_3__0"
    // InternalSafetyDSL.g:5582:1: rule__CriticalityLevel__Group_3__0 : rule__CriticalityLevel__Group_3__0__Impl rule__CriticalityLevel__Group_3__1 ;
    public final void rule__CriticalityLevel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5586:1: ( rule__CriticalityLevel__Group_3__0__Impl rule__CriticalityLevel__Group_3__1 )
            // InternalSafetyDSL.g:5587:2: rule__CriticalityLevel__Group_3__0__Impl rule__CriticalityLevel__Group_3__1
            {
            pushFollow(FOLLOW_40);
            rule__CriticalityLevel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_3__0"


    // $ANTLR start "rule__CriticalityLevel__Group_3__0__Impl"
    // InternalSafetyDSL.g:5594:1: rule__CriticalityLevel__Group_3__0__Impl : ( () ) ;
    public final void rule__CriticalityLevel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5598:1: ( ( () ) )
            // InternalSafetyDSL.g:5599:1: ( () )
            {
            // InternalSafetyDSL.g:5599:1: ( () )
            // InternalSafetyDSL.g:5600:2: ()
            {
             before(grammarAccess.getCriticalityLevelAccess().getLevelDAction_3_0()); 
            // InternalSafetyDSL.g:5601:2: ()
            // InternalSafetyDSL.g:5601:3: 
            {
            }

             after(grammarAccess.getCriticalityLevelAccess().getLevelDAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_3__0__Impl"


    // $ANTLR start "rule__CriticalityLevel__Group_3__1"
    // InternalSafetyDSL.g:5609:1: rule__CriticalityLevel__Group_3__1 : rule__CriticalityLevel__Group_3__1__Impl ;
    public final void rule__CriticalityLevel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5613:1: ( rule__CriticalityLevel__Group_3__1__Impl )
            // InternalSafetyDSL.g:5614:2: rule__CriticalityLevel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CriticalityLevel__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_3__1"


    // $ANTLR start "rule__CriticalityLevel__Group_3__1__Impl"
    // InternalSafetyDSL.g:5620:1: rule__CriticalityLevel__Group_3__1__Impl : ( 'D' ) ;
    public final void rule__CriticalityLevel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5624:1: ( ( 'D' ) )
            // InternalSafetyDSL.g:5625:1: ( 'D' )
            {
            // InternalSafetyDSL.g:5625:1: ( 'D' )
            // InternalSafetyDSL.g:5626:2: 'D'
            {
             before(grammarAccess.getCriticalityLevelAccess().getDKeyword_3_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCriticalityLevelAccess().getDKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CriticalityLevel__Group_3__1__Impl"


    // $ANTLR start "rule__NonSafetyCritical__Group__0"
    // InternalSafetyDSL.g:5636:1: rule__NonSafetyCritical__Group__0 : rule__NonSafetyCritical__Group__0__Impl rule__NonSafetyCritical__Group__1 ;
    public final void rule__NonSafetyCritical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5640:1: ( rule__NonSafetyCritical__Group__0__Impl rule__NonSafetyCritical__Group__1 )
            // InternalSafetyDSL.g:5641:2: rule__NonSafetyCritical__Group__0__Impl rule__NonSafetyCritical__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NonSafetyCritical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group__0"


    // $ANTLR start "rule__NonSafetyCritical__Group__0__Impl"
    // InternalSafetyDSL.g:5648:1: rule__NonSafetyCritical__Group__0__Impl : ( 'non-safety-critical' ) ;
    public final void rule__NonSafetyCritical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5652:1: ( ( 'non-safety-critical' ) )
            // InternalSafetyDSL.g:5653:1: ( 'non-safety-critical' )
            {
            // InternalSafetyDSL.g:5653:1: ( 'non-safety-critical' )
            // InternalSafetyDSL.g:5654:2: 'non-safety-critical'
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getNonSafetyCriticalKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNonSafetyCriticalAccess().getNonSafetyCriticalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group__0__Impl"


    // $ANTLR start "rule__NonSafetyCritical__Group__1"
    // InternalSafetyDSL.g:5663:1: rule__NonSafetyCritical__Group__1 : rule__NonSafetyCritical__Group__1__Impl rule__NonSafetyCritical__Group__2 ;
    public final void rule__NonSafetyCritical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5667:1: ( rule__NonSafetyCritical__Group__1__Impl rule__NonSafetyCritical__Group__2 )
            // InternalSafetyDSL.g:5668:2: rule__NonSafetyCritical__Group__1__Impl rule__NonSafetyCritical__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__NonSafetyCritical__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group__1"


    // $ANTLR start "rule__NonSafetyCritical__Group__1__Impl"
    // InternalSafetyDSL.g:5675:1: rule__NonSafetyCritical__Group__1__Impl : ( ( rule__NonSafetyCritical__NameAssignment_1 ) ) ;
    public final void rule__NonSafetyCritical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5679:1: ( ( ( rule__NonSafetyCritical__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:5680:1: ( ( rule__NonSafetyCritical__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:5680:1: ( ( rule__NonSafetyCritical__NameAssignment_1 ) )
            // InternalSafetyDSL.g:5681:2: ( rule__NonSafetyCritical__NameAssignment_1 )
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:5682:2: ( rule__NonSafetyCritical__NameAssignment_1 )
            // InternalSafetyDSL.g:5682:3: rule__NonSafetyCritical__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonSafetyCriticalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group__1__Impl"


    // $ANTLR start "rule__NonSafetyCritical__Group__2"
    // InternalSafetyDSL.g:5690:1: rule__NonSafetyCritical__Group__2 : rule__NonSafetyCritical__Group__2__Impl ;
    public final void rule__NonSafetyCritical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5694:1: ( rule__NonSafetyCritical__Group__2__Impl )
            // InternalSafetyDSL.g:5695:2: rule__NonSafetyCritical__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group__2"


    // $ANTLR start "rule__NonSafetyCritical__Group__2__Impl"
    // InternalSafetyDSL.g:5701:1: rule__NonSafetyCritical__Group__2__Impl : ( ( rule__NonSafetyCritical__Alternatives_2 ) ) ;
    public final void rule__NonSafetyCritical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5705:1: ( ( ( rule__NonSafetyCritical__Alternatives_2 ) ) )
            // InternalSafetyDSL.g:5706:1: ( ( rule__NonSafetyCritical__Alternatives_2 ) )
            {
            // InternalSafetyDSL.g:5706:1: ( ( rule__NonSafetyCritical__Alternatives_2 ) )
            // InternalSafetyDSL.g:5707:2: ( rule__NonSafetyCritical__Alternatives_2 )
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getAlternatives_2()); 
            // InternalSafetyDSL.g:5708:2: ( rule__NonSafetyCritical__Alternatives_2 )
            // InternalSafetyDSL.g:5708:3: rule__NonSafetyCritical__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNonSafetyCriticalAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group__2__Impl"


    // $ANTLR start "rule__NonSafetyCritical__Group_2_0__0"
    // InternalSafetyDSL.g:5717:1: rule__NonSafetyCritical__Group_2_0__0 : rule__NonSafetyCritical__Group_2_0__0__Impl rule__NonSafetyCritical__Group_2_0__1 ;
    public final void rule__NonSafetyCritical__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5721:1: ( rule__NonSafetyCritical__Group_2_0__0__Impl rule__NonSafetyCritical__Group_2_0__1 )
            // InternalSafetyDSL.g:5722:2: rule__NonSafetyCritical__Group_2_0__0__Impl rule__NonSafetyCritical__Group_2_0__1
            {
            pushFollow(FOLLOW_48);
            rule__NonSafetyCritical__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group_2_0__0"


    // $ANTLR start "rule__NonSafetyCritical__Group_2_0__0__Impl"
    // InternalSafetyDSL.g:5729:1: rule__NonSafetyCritical__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__NonSafetyCritical__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5733:1: ( ( '{' ) )
            // InternalSafetyDSL.g:5734:1: ( '{' )
            {
            // InternalSafetyDSL.g:5734:1: ( '{' )
            // InternalSafetyDSL.g:5735:2: '{'
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNonSafetyCriticalAccess().getLeftCurlyBracketKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group_2_0__0__Impl"


    // $ANTLR start "rule__NonSafetyCritical__Group_2_0__1"
    // InternalSafetyDSL.g:5744:1: rule__NonSafetyCritical__Group_2_0__1 : rule__NonSafetyCritical__Group_2_0__1__Impl rule__NonSafetyCritical__Group_2_0__2 ;
    public final void rule__NonSafetyCritical__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5748:1: ( rule__NonSafetyCritical__Group_2_0__1__Impl rule__NonSafetyCritical__Group_2_0__2 )
            // InternalSafetyDSL.g:5749:2: rule__NonSafetyCritical__Group_2_0__1__Impl rule__NonSafetyCritical__Group_2_0__2
            {
            pushFollow(FOLLOW_48);
            rule__NonSafetyCritical__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group_2_0__1"


    // $ANTLR start "rule__NonSafetyCritical__Group_2_0__1__Impl"
    // InternalSafetyDSL.g:5756:1: rule__NonSafetyCritical__Group_2_0__1__Impl : ( ( rule__NonSafetyCritical__SubelementsAssignment_2_0_1 )* ) ;
    public final void rule__NonSafetyCritical__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5760:1: ( ( ( rule__NonSafetyCritical__SubelementsAssignment_2_0_1 )* ) )
            // InternalSafetyDSL.g:5761:1: ( ( rule__NonSafetyCritical__SubelementsAssignment_2_0_1 )* )
            {
            // InternalSafetyDSL.g:5761:1: ( ( rule__NonSafetyCritical__SubelementsAssignment_2_0_1 )* )
            // InternalSafetyDSL.g:5762:2: ( rule__NonSafetyCritical__SubelementsAssignment_2_0_1 )*
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getSubelementsAssignment_2_0_1()); 
            // InternalSafetyDSL.g:5763:2: ( rule__NonSafetyCritical__SubelementsAssignment_2_0_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==50) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSafetyDSL.g:5763:3: rule__NonSafetyCritical__SubelementsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__NonSafetyCritical__SubelementsAssignment_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getNonSafetyCriticalAccess().getSubelementsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group_2_0__1__Impl"


    // $ANTLR start "rule__NonSafetyCritical__Group_2_0__2"
    // InternalSafetyDSL.g:5771:1: rule__NonSafetyCritical__Group_2_0__2 : rule__NonSafetyCritical__Group_2_0__2__Impl ;
    public final void rule__NonSafetyCritical__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5775:1: ( rule__NonSafetyCritical__Group_2_0__2__Impl )
            // InternalSafetyDSL.g:5776:2: rule__NonSafetyCritical__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonSafetyCritical__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group_2_0__2"


    // $ANTLR start "rule__NonSafetyCritical__Group_2_0__2__Impl"
    // InternalSafetyDSL.g:5782:1: rule__NonSafetyCritical__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__NonSafetyCritical__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5786:1: ( ( '}' ) )
            // InternalSafetyDSL.g:5787:1: ( '}' )
            {
            // InternalSafetyDSL.g:5787:1: ( '}' )
            // InternalSafetyDSL.g:5788:2: '}'
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNonSafetyCriticalAccess().getRightCurlyBracketKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__Group_2_0__2__Impl"


    // $ANTLR start "rule__Monitor__Group__0"
    // InternalSafetyDSL.g:5798:1: rule__Monitor__Group__0 : rule__Monitor__Group__0__Impl rule__Monitor__Group__1 ;
    public final void rule__Monitor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5802:1: ( rule__Monitor__Group__0__Impl rule__Monitor__Group__1 )
            // InternalSafetyDSL.g:5803:2: rule__Monitor__Group__0__Impl rule__Monitor__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Monitor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__0"


    // $ANTLR start "rule__Monitor__Group__0__Impl"
    // InternalSafetyDSL.g:5810:1: rule__Monitor__Group__0__Impl : ( 'monitor' ) ;
    public final void rule__Monitor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5814:1: ( ( 'monitor' ) )
            // InternalSafetyDSL.g:5815:1: ( 'monitor' )
            {
            // InternalSafetyDSL.g:5815:1: ( 'monitor' )
            // InternalSafetyDSL.g:5816:2: 'monitor'
            {
             before(grammarAccess.getMonitorAccess().getMonitorKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getMonitorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__0__Impl"


    // $ANTLR start "rule__Monitor__Group__1"
    // InternalSafetyDSL.g:5825:1: rule__Monitor__Group__1 : rule__Monitor__Group__1__Impl rule__Monitor__Group__2 ;
    public final void rule__Monitor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5829:1: ( rule__Monitor__Group__1__Impl rule__Monitor__Group__2 )
            // InternalSafetyDSL.g:5830:2: rule__Monitor__Group__1__Impl rule__Monitor__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Monitor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__1"


    // $ANTLR start "rule__Monitor__Group__1__Impl"
    // InternalSafetyDSL.g:5837:1: rule__Monitor__Group__1__Impl : ( ( rule__Monitor__NameAssignment_1 ) ) ;
    public final void rule__Monitor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5841:1: ( ( ( rule__Monitor__NameAssignment_1 ) ) )
            // InternalSafetyDSL.g:5842:1: ( ( rule__Monitor__NameAssignment_1 ) )
            {
            // InternalSafetyDSL.g:5842:1: ( ( rule__Monitor__NameAssignment_1 ) )
            // InternalSafetyDSL.g:5843:2: ( rule__Monitor__NameAssignment_1 )
            {
             before(grammarAccess.getMonitorAccess().getNameAssignment_1()); 
            // InternalSafetyDSL.g:5844:2: ( rule__Monitor__NameAssignment_1 )
            // InternalSafetyDSL.g:5844:3: rule__Monitor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__1__Impl"


    // $ANTLR start "rule__Monitor__Group__2"
    // InternalSafetyDSL.g:5852:1: rule__Monitor__Group__2 : rule__Monitor__Group__2__Impl rule__Monitor__Group__3 ;
    public final void rule__Monitor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5856:1: ( rule__Monitor__Group__2__Impl rule__Monitor__Group__3 )
            // InternalSafetyDSL.g:5857:2: rule__Monitor__Group__2__Impl rule__Monitor__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__Monitor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__2"


    // $ANTLR start "rule__Monitor__Group__2__Impl"
    // InternalSafetyDSL.g:5864:1: rule__Monitor__Group__2__Impl : ( ( rule__Monitor__Group_2__0 )? ) ;
    public final void rule__Monitor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5868:1: ( ( ( rule__Monitor__Group_2__0 )? ) )
            // InternalSafetyDSL.g:5869:1: ( ( rule__Monitor__Group_2__0 )? )
            {
            // InternalSafetyDSL.g:5869:1: ( ( rule__Monitor__Group_2__0 )? )
            // InternalSafetyDSL.g:5870:2: ( rule__Monitor__Group_2__0 )?
            {
             before(grammarAccess.getMonitorAccess().getGroup_2()); 
            // InternalSafetyDSL.g:5871:2: ( rule__Monitor__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSafetyDSL.g:5871:3: rule__Monitor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Monitor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMonitorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__2__Impl"


    // $ANTLR start "rule__Monitor__Group__3"
    // InternalSafetyDSL.g:5879:1: rule__Monitor__Group__3 : rule__Monitor__Group__3__Impl ;
    public final void rule__Monitor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5883:1: ( rule__Monitor__Group__3__Impl )
            // InternalSafetyDSL.g:5884:2: rule__Monitor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__3"


    // $ANTLR start "rule__Monitor__Group__3__Impl"
    // InternalSafetyDSL.g:5890:1: rule__Monitor__Group__3__Impl : ( ';' ) ;
    public final void rule__Monitor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5894:1: ( ( ';' ) )
            // InternalSafetyDSL.g:5895:1: ( ';' )
            {
            // InternalSafetyDSL.g:5895:1: ( ';' )
            // InternalSafetyDSL.g:5896:2: ';'
            {
             before(grammarAccess.getMonitorAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__3__Impl"


    // $ANTLR start "rule__Monitor__Group_2__0"
    // InternalSafetyDSL.g:5906:1: rule__Monitor__Group_2__0 : rule__Monitor__Group_2__0__Impl rule__Monitor__Group_2__1 ;
    public final void rule__Monitor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5910:1: ( rule__Monitor__Group_2__0__Impl rule__Monitor__Group_2__1 )
            // InternalSafetyDSL.g:5911:2: rule__Monitor__Group_2__0__Impl rule__Monitor__Group_2__1
            {
            pushFollow(FOLLOW_50);
            rule__Monitor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__0"


    // $ANTLR start "rule__Monitor__Group_2__0__Impl"
    // InternalSafetyDSL.g:5918:1: rule__Monitor__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Monitor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5922:1: ( ( '{' ) )
            // InternalSafetyDSL.g:5923:1: ( '{' )
            {
            // InternalSafetyDSL.g:5923:1: ( '{' )
            // InternalSafetyDSL.g:5924:2: '{'
            {
             before(grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__0__Impl"


    // $ANTLR start "rule__Monitor__Group_2__1"
    // InternalSafetyDSL.g:5933:1: rule__Monitor__Group_2__1 : rule__Monitor__Group_2__1__Impl rule__Monitor__Group_2__2 ;
    public final void rule__Monitor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5937:1: ( rule__Monitor__Group_2__1__Impl rule__Monitor__Group_2__2 )
            // InternalSafetyDSL.g:5938:2: rule__Monitor__Group_2__1__Impl rule__Monitor__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Monitor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__1"


    // $ANTLR start "rule__Monitor__Group_2__1__Impl"
    // InternalSafetyDSL.g:5945:1: rule__Monitor__Group_2__1__Impl : ( 'implementedTactics=' ) ;
    public final void rule__Monitor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5949:1: ( ( 'implementedTactics=' ) )
            // InternalSafetyDSL.g:5950:1: ( 'implementedTactics=' )
            {
            // InternalSafetyDSL.g:5950:1: ( 'implementedTactics=' )
            // InternalSafetyDSL.g:5951:2: 'implementedTactics='
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getImplementedTacticsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__1__Impl"


    // $ANTLR start "rule__Monitor__Group_2__2"
    // InternalSafetyDSL.g:5960:1: rule__Monitor__Group_2__2 : rule__Monitor__Group_2__2__Impl rule__Monitor__Group_2__3 ;
    public final void rule__Monitor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5964:1: ( rule__Monitor__Group_2__2__Impl rule__Monitor__Group_2__3 )
            // InternalSafetyDSL.g:5965:2: rule__Monitor__Group_2__2__Impl rule__Monitor__Group_2__3
            {
            pushFollow(FOLLOW_34);
            rule__Monitor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__2"


    // $ANTLR start "rule__Monitor__Group_2__2__Impl"
    // InternalSafetyDSL.g:5972:1: rule__Monitor__Group_2__2__Impl : ( ( rule__Monitor__ImplementedTacticsAssignment_2_2 ) ) ;
    public final void rule__Monitor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5976:1: ( ( ( rule__Monitor__ImplementedTacticsAssignment_2_2 ) ) )
            // InternalSafetyDSL.g:5977:1: ( ( rule__Monitor__ImplementedTacticsAssignment_2_2 ) )
            {
            // InternalSafetyDSL.g:5977:1: ( ( rule__Monitor__ImplementedTacticsAssignment_2_2 ) )
            // InternalSafetyDSL.g:5978:2: ( rule__Monitor__ImplementedTacticsAssignment_2_2 )
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsAssignment_2_2()); 
            // InternalSafetyDSL.g:5979:2: ( rule__Monitor__ImplementedTacticsAssignment_2_2 )
            // InternalSafetyDSL.g:5979:3: rule__Monitor__ImplementedTacticsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__ImplementedTacticsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getImplementedTacticsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__2__Impl"


    // $ANTLR start "rule__Monitor__Group_2__3"
    // InternalSafetyDSL.g:5987:1: rule__Monitor__Group_2__3 : rule__Monitor__Group_2__3__Impl rule__Monitor__Group_2__4 ;
    public final void rule__Monitor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:5991:1: ( rule__Monitor__Group_2__3__Impl rule__Monitor__Group_2__4 )
            // InternalSafetyDSL.g:5992:2: rule__Monitor__Group_2__3__Impl rule__Monitor__Group_2__4
            {
            pushFollow(FOLLOW_34);
            rule__Monitor__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__3"


    // $ANTLR start "rule__Monitor__Group_2__3__Impl"
    // InternalSafetyDSL.g:5999:1: rule__Monitor__Group_2__3__Impl : ( ( rule__Monitor__Group_2_3__0 )* ) ;
    public final void rule__Monitor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6003:1: ( ( ( rule__Monitor__Group_2_3__0 )* ) )
            // InternalSafetyDSL.g:6004:1: ( ( rule__Monitor__Group_2_3__0 )* )
            {
            // InternalSafetyDSL.g:6004:1: ( ( rule__Monitor__Group_2_3__0 )* )
            // InternalSafetyDSL.g:6005:2: ( rule__Monitor__Group_2_3__0 )*
            {
             before(grammarAccess.getMonitorAccess().getGroup_2_3()); 
            // InternalSafetyDSL.g:6006:2: ( rule__Monitor__Group_2_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==27) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSafetyDSL.g:6006:3: rule__Monitor__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Monitor__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getMonitorAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__3__Impl"


    // $ANTLR start "rule__Monitor__Group_2__4"
    // InternalSafetyDSL.g:6014:1: rule__Monitor__Group_2__4 : rule__Monitor__Group_2__4__Impl ;
    public final void rule__Monitor__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6018:1: ( rule__Monitor__Group_2__4__Impl )
            // InternalSafetyDSL.g:6019:2: rule__Monitor__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__4"


    // $ANTLR start "rule__Monitor__Group_2__4__Impl"
    // InternalSafetyDSL.g:6025:1: rule__Monitor__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Monitor__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6029:1: ( ( '}' ) )
            // InternalSafetyDSL.g:6030:1: ( '}' )
            {
            // InternalSafetyDSL.g:6030:1: ( '}' )
            // InternalSafetyDSL.g:6031:2: '}'
            {
             before(grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2__4__Impl"


    // $ANTLR start "rule__Monitor__Group_2_3__0"
    // InternalSafetyDSL.g:6041:1: rule__Monitor__Group_2_3__0 : rule__Monitor__Group_2_3__0__Impl rule__Monitor__Group_2_3__1 ;
    public final void rule__Monitor__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6045:1: ( rule__Monitor__Group_2_3__0__Impl rule__Monitor__Group_2_3__1 )
            // InternalSafetyDSL.g:6046:2: rule__Monitor__Group_2_3__0__Impl rule__Monitor__Group_2_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Monitor__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2_3__0"


    // $ANTLR start "rule__Monitor__Group_2_3__0__Impl"
    // InternalSafetyDSL.g:6053:1: rule__Monitor__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Monitor__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6057:1: ( ( ',' ) )
            // InternalSafetyDSL.g:6058:1: ( ',' )
            {
            // InternalSafetyDSL.g:6058:1: ( ',' )
            // InternalSafetyDSL.g:6059:2: ','
            {
             before(grammarAccess.getMonitorAccess().getCommaKeyword_2_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2_3__0__Impl"


    // $ANTLR start "rule__Monitor__Group_2_3__1"
    // InternalSafetyDSL.g:6068:1: rule__Monitor__Group_2_3__1 : rule__Monitor__Group_2_3__1__Impl ;
    public final void rule__Monitor__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6072:1: ( rule__Monitor__Group_2_3__1__Impl )
            // InternalSafetyDSL.g:6073:2: rule__Monitor__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2_3__1"


    // $ANTLR start "rule__Monitor__Group_2_3__1__Impl"
    // InternalSafetyDSL.g:6079:1: rule__Monitor__Group_2_3__1__Impl : ( ( rule__Monitor__ImplementedTacticsAssignment_2_3_1 ) ) ;
    public final void rule__Monitor__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6083:1: ( ( ( rule__Monitor__ImplementedTacticsAssignment_2_3_1 ) ) )
            // InternalSafetyDSL.g:6084:1: ( ( rule__Monitor__ImplementedTacticsAssignment_2_3_1 ) )
            {
            // InternalSafetyDSL.g:6084:1: ( ( rule__Monitor__ImplementedTacticsAssignment_2_3_1 ) )
            // InternalSafetyDSL.g:6085:2: ( rule__Monitor__ImplementedTacticsAssignment_2_3_1 )
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsAssignment_2_3_1()); 
            // InternalSafetyDSL.g:6086:2: ( rule__Monitor__ImplementedTacticsAssignment_2_3_1 )
            // InternalSafetyDSL.g:6086:3: rule__Monitor__ImplementedTacticsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__ImplementedTacticsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getImplementedTacticsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_2_3__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0__0"
    // InternalSafetyDSL.g:6095:1: rule__ArchElementToArchElement__Group_0__0 : rule__ArchElementToArchElement__Group_0__0__Impl rule__ArchElementToArchElement__Group_0__1 ;
    public final void rule__ArchElementToArchElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6099:1: ( rule__ArchElementToArchElement__Group_0__0__Impl rule__ArchElementToArchElement__Group_0__1 )
            // InternalSafetyDSL.g:6100:2: rule__ArchElementToArchElement__Group_0__0__Impl rule__ArchElementToArchElement__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0__0__Impl"
    // InternalSafetyDSL.g:6107:1: rule__ArchElementToArchElement__Group_0__0__Impl : ( () ) ;
    public final void rule__ArchElementToArchElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6111:1: ( ( () ) )
            // InternalSafetyDSL.g:6112:1: ( () )
            {
            // InternalSafetyDSL.g:6112:1: ( () )
            // InternalSafetyDSL.g:6113:2: ()
            {
             before(grammarAccess.getArchElementToArchElementAccess().getReadsAction_0_0()); 
            // InternalSafetyDSL.g:6114:2: ()
            // InternalSafetyDSL.g:6114:3: 
            {
            }

             after(grammarAccess.getArchElementToArchElementAccess().getReadsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0__1"
    // InternalSafetyDSL.g:6122:1: rule__ArchElementToArchElement__Group_0__1 : rule__ArchElementToArchElement__Group_0__1__Impl ;
    public final void rule__ArchElementToArchElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6126:1: ( rule__ArchElementToArchElement__Group_0__1__Impl )
            // InternalSafetyDSL.g:6127:2: rule__ArchElementToArchElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0__1__Impl"
    // InternalSafetyDSL.g:6133:1: rule__ArchElementToArchElement__Group_0__1__Impl : ( ( rule__ArchElementToArchElement__Group_0_1__0 ) ) ;
    public final void rule__ArchElementToArchElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6137:1: ( ( ( rule__ArchElementToArchElement__Group_0_1__0 ) ) )
            // InternalSafetyDSL.g:6138:1: ( ( rule__ArchElementToArchElement__Group_0_1__0 ) )
            {
            // InternalSafetyDSL.g:6138:1: ( ( rule__ArchElementToArchElement__Group_0_1__0 ) )
            // InternalSafetyDSL.g:6139:2: ( rule__ArchElementToArchElement__Group_0_1__0 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getGroup_0_1()); 
            // InternalSafetyDSL.g:6140:2: ( rule__ArchElementToArchElement__Group_0_1__0 )
            // InternalSafetyDSL.g:6140:3: rule__ArchElementToArchElement__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__0"
    // InternalSafetyDSL.g:6149:1: rule__ArchElementToArchElement__Group_0_1__0 : rule__ArchElementToArchElement__Group_0_1__0__Impl rule__ArchElementToArchElement__Group_0_1__1 ;
    public final void rule__ArchElementToArchElement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6153:1: ( rule__ArchElementToArchElement__Group_0_1__0__Impl rule__ArchElementToArchElement__Group_0_1__1 )
            // InternalSafetyDSL.g:6154:2: rule__ArchElementToArchElement__Group_0_1__0__Impl rule__ArchElementToArchElement__Group_0_1__1
            {
            pushFollow(FOLLOW_51);
            rule__ArchElementToArchElement__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__0__Impl"
    // InternalSafetyDSL.g:6161:1: rule__ArchElementToArchElement__Group_0_1__0__Impl : ( ( rule__ArchElementToArchElement__Element1Assignment_0_1_0 ) ) ;
    public final void rule__ArchElementToArchElement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6165:1: ( ( ( rule__ArchElementToArchElement__Element1Assignment_0_1_0 ) ) )
            // InternalSafetyDSL.g:6166:1: ( ( rule__ArchElementToArchElement__Element1Assignment_0_1_0 ) )
            {
            // InternalSafetyDSL.g:6166:1: ( ( rule__ArchElementToArchElement__Element1Assignment_0_1_0 ) )
            // InternalSafetyDSL.g:6167:2: ( rule__ArchElementToArchElement__Element1Assignment_0_1_0 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_0_1_0()); 
            // InternalSafetyDSL.g:6168:2: ( rule__ArchElementToArchElement__Element1Assignment_0_1_0 )
            // InternalSafetyDSL.g:6168:3: rule__ArchElementToArchElement__Element1Assignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element1Assignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__1"
    // InternalSafetyDSL.g:6176:1: rule__ArchElementToArchElement__Group_0_1__1 : rule__ArchElementToArchElement__Group_0_1__1__Impl rule__ArchElementToArchElement__Group_0_1__2 ;
    public final void rule__ArchElementToArchElement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6180:1: ( rule__ArchElementToArchElement__Group_0_1__1__Impl rule__ArchElementToArchElement__Group_0_1__2 )
            // InternalSafetyDSL.g:6181:2: rule__ArchElementToArchElement__Group_0_1__1__Impl rule__ArchElementToArchElement__Group_0_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__1__Impl"
    // InternalSafetyDSL.g:6188:1: rule__ArchElementToArchElement__Group_0_1__1__Impl : ( 'reads' ) ;
    public final void rule__ArchElementToArchElement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6192:1: ( ( 'reads' ) )
            // InternalSafetyDSL.g:6193:1: ( 'reads' )
            {
            // InternalSafetyDSL.g:6193:1: ( 'reads' )
            // InternalSafetyDSL.g:6194:2: 'reads'
            {
             before(grammarAccess.getArchElementToArchElementAccess().getReadsKeyword_0_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getReadsKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__2"
    // InternalSafetyDSL.g:6203:1: rule__ArchElementToArchElement__Group_0_1__2 : rule__ArchElementToArchElement__Group_0_1__2__Impl rule__ArchElementToArchElement__Group_0_1__3 ;
    public final void rule__ArchElementToArchElement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6207:1: ( rule__ArchElementToArchElement__Group_0_1__2__Impl rule__ArchElementToArchElement__Group_0_1__3 )
            // InternalSafetyDSL.g:6208:2: rule__ArchElementToArchElement__Group_0_1__2__Impl rule__ArchElementToArchElement__Group_0_1__3
            {
            pushFollow(FOLLOW_25);
            rule__ArchElementToArchElement__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__2"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__2__Impl"
    // InternalSafetyDSL.g:6215:1: rule__ArchElementToArchElement__Group_0_1__2__Impl : ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_2 ) ) ;
    public final void rule__ArchElementToArchElement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6219:1: ( ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_2 ) ) )
            // InternalSafetyDSL.g:6220:1: ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_2 ) )
            {
            // InternalSafetyDSL.g:6220:1: ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_2 ) )
            // InternalSafetyDSL.g:6221:2: ( rule__ArchElementToArchElement__Element2Assignment_0_1_2 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_0_1_2()); 
            // InternalSafetyDSL.g:6222:2: ( rule__ArchElementToArchElement__Element2Assignment_0_1_2 )
            // InternalSafetyDSL.g:6222:3: rule__ArchElementToArchElement__Element2Assignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element2Assignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__2__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__3"
    // InternalSafetyDSL.g:6230:1: rule__ArchElementToArchElement__Group_0_1__3 : rule__ArchElementToArchElement__Group_0_1__3__Impl rule__ArchElementToArchElement__Group_0_1__4 ;
    public final void rule__ArchElementToArchElement__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6234:1: ( rule__ArchElementToArchElement__Group_0_1__3__Impl rule__ArchElementToArchElement__Group_0_1__4 )
            // InternalSafetyDSL.g:6235:2: rule__ArchElementToArchElement__Group_0_1__3__Impl rule__ArchElementToArchElement__Group_0_1__4
            {
            pushFollow(FOLLOW_25);
            rule__ArchElementToArchElement__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__3"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__3__Impl"
    // InternalSafetyDSL.g:6242:1: rule__ArchElementToArchElement__Group_0_1__3__Impl : ( ( rule__ArchElementToArchElement__Group_0_1_3__0 )* ) ;
    public final void rule__ArchElementToArchElement__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6246:1: ( ( ( rule__ArchElementToArchElement__Group_0_1_3__0 )* ) )
            // InternalSafetyDSL.g:6247:1: ( ( rule__ArchElementToArchElement__Group_0_1_3__0 )* )
            {
            // InternalSafetyDSL.g:6247:1: ( ( rule__ArchElementToArchElement__Group_0_1_3__0 )* )
            // InternalSafetyDSL.g:6248:2: ( rule__ArchElementToArchElement__Group_0_1_3__0 )*
            {
             before(grammarAccess.getArchElementToArchElementAccess().getGroup_0_1_3()); 
            // InternalSafetyDSL.g:6249:2: ( rule__ArchElementToArchElement__Group_0_1_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==27) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSafetyDSL.g:6249:3: rule__ArchElementToArchElement__Group_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ArchElementToArchElement__Group_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getArchElementToArchElementAccess().getGroup_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__3__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__4"
    // InternalSafetyDSL.g:6257:1: rule__ArchElementToArchElement__Group_0_1__4 : rule__ArchElementToArchElement__Group_0_1__4__Impl ;
    public final void rule__ArchElementToArchElement__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6261:1: ( rule__ArchElementToArchElement__Group_0_1__4__Impl )
            // InternalSafetyDSL.g:6262:2: rule__ArchElementToArchElement__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__4"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1__4__Impl"
    // InternalSafetyDSL.g:6268:1: rule__ArchElementToArchElement__Group_0_1__4__Impl : ( ';' ) ;
    public final void rule__ArchElementToArchElement__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6272:1: ( ( ';' ) )
            // InternalSafetyDSL.g:6273:1: ( ';' )
            {
            // InternalSafetyDSL.g:6273:1: ( ';' )
            // InternalSafetyDSL.g:6274:2: ';'
            {
             before(grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_0_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1__4__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1_3__0"
    // InternalSafetyDSL.g:6284:1: rule__ArchElementToArchElement__Group_0_1_3__0 : rule__ArchElementToArchElement__Group_0_1_3__0__Impl rule__ArchElementToArchElement__Group_0_1_3__1 ;
    public final void rule__ArchElementToArchElement__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6288:1: ( rule__ArchElementToArchElement__Group_0_1_3__0__Impl rule__ArchElementToArchElement__Group_0_1_3__1 )
            // InternalSafetyDSL.g:6289:2: rule__ArchElementToArchElement__Group_0_1_3__0__Impl rule__ArchElementToArchElement__Group_0_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1_3__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1_3__0__Impl"
    // InternalSafetyDSL.g:6296:1: rule__ArchElementToArchElement__Group_0_1_3__0__Impl : ( ',' ) ;
    public final void rule__ArchElementToArchElement__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6300:1: ( ( ',' ) )
            // InternalSafetyDSL.g:6301:1: ( ',' )
            {
            // InternalSafetyDSL.g:6301:1: ( ',' )
            // InternalSafetyDSL.g:6302:2: ','
            {
             before(grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_0_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1_3__1"
    // InternalSafetyDSL.g:6311:1: rule__ArchElementToArchElement__Group_0_1_3__1 : rule__ArchElementToArchElement__Group_0_1_3__1__Impl ;
    public final void rule__ArchElementToArchElement__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6315:1: ( rule__ArchElementToArchElement__Group_0_1_3__1__Impl )
            // InternalSafetyDSL.g:6316:2: rule__ArchElementToArchElement__Group_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_0_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1_3__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_0_1_3__1__Impl"
    // InternalSafetyDSL.g:6322:1: rule__ArchElementToArchElement__Group_0_1_3__1__Impl : ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 ) ) ;
    public final void rule__ArchElementToArchElement__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6326:1: ( ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 ) ) )
            // InternalSafetyDSL.g:6327:1: ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 ) )
            {
            // InternalSafetyDSL.g:6327:1: ( ( rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 ) )
            // InternalSafetyDSL.g:6328:2: ( rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_0_1_3_1()); 
            // InternalSafetyDSL.g:6329:2: ( rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 )
            // InternalSafetyDSL.g:6329:3: rule__ArchElementToArchElement__Element2Assignment_0_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element2Assignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_0_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1__0"
    // InternalSafetyDSL.g:6338:1: rule__ArchElementToArchElement__Group_1__0 : rule__ArchElementToArchElement__Group_1__0__Impl rule__ArchElementToArchElement__Group_1__1 ;
    public final void rule__ArchElementToArchElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6342:1: ( rule__ArchElementToArchElement__Group_1__0__Impl rule__ArchElementToArchElement__Group_1__1 )
            // InternalSafetyDSL.g:6343:2: rule__ArchElementToArchElement__Group_1__0__Impl rule__ArchElementToArchElement__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1__0__Impl"
    // InternalSafetyDSL.g:6350:1: rule__ArchElementToArchElement__Group_1__0__Impl : ( () ) ;
    public final void rule__ArchElementToArchElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6354:1: ( ( () ) )
            // InternalSafetyDSL.g:6355:1: ( () )
            {
            // InternalSafetyDSL.g:6355:1: ( () )
            // InternalSafetyDSL.g:6356:2: ()
            {
             before(grammarAccess.getArchElementToArchElementAccess().getWritesAction_1_0()); 
            // InternalSafetyDSL.g:6357:2: ()
            // InternalSafetyDSL.g:6357:3: 
            {
            }

             after(grammarAccess.getArchElementToArchElementAccess().getWritesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1__1"
    // InternalSafetyDSL.g:6365:1: rule__ArchElementToArchElement__Group_1__1 : rule__ArchElementToArchElement__Group_1__1__Impl ;
    public final void rule__ArchElementToArchElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6369:1: ( rule__ArchElementToArchElement__Group_1__1__Impl )
            // InternalSafetyDSL.g:6370:2: rule__ArchElementToArchElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1__1__Impl"
    // InternalSafetyDSL.g:6376:1: rule__ArchElementToArchElement__Group_1__1__Impl : ( ( rule__ArchElementToArchElement__Group_1_1__0 ) ) ;
    public final void rule__ArchElementToArchElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6380:1: ( ( ( rule__ArchElementToArchElement__Group_1_1__0 ) ) )
            // InternalSafetyDSL.g:6381:1: ( ( rule__ArchElementToArchElement__Group_1_1__0 ) )
            {
            // InternalSafetyDSL.g:6381:1: ( ( rule__ArchElementToArchElement__Group_1_1__0 ) )
            // InternalSafetyDSL.g:6382:2: ( rule__ArchElementToArchElement__Group_1_1__0 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getGroup_1_1()); 
            // InternalSafetyDSL.g:6383:2: ( rule__ArchElementToArchElement__Group_1_1__0 )
            // InternalSafetyDSL.g:6383:3: rule__ArchElementToArchElement__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__0"
    // InternalSafetyDSL.g:6392:1: rule__ArchElementToArchElement__Group_1_1__0 : rule__ArchElementToArchElement__Group_1_1__0__Impl rule__ArchElementToArchElement__Group_1_1__1 ;
    public final void rule__ArchElementToArchElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6396:1: ( rule__ArchElementToArchElement__Group_1_1__0__Impl rule__ArchElementToArchElement__Group_1_1__1 )
            // InternalSafetyDSL.g:6397:2: rule__ArchElementToArchElement__Group_1_1__0__Impl rule__ArchElementToArchElement__Group_1_1__1
            {
            pushFollow(FOLLOW_52);
            rule__ArchElementToArchElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__0__Impl"
    // InternalSafetyDSL.g:6404:1: rule__ArchElementToArchElement__Group_1_1__0__Impl : ( ( rule__ArchElementToArchElement__Element1Assignment_1_1_0 ) ) ;
    public final void rule__ArchElementToArchElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6408:1: ( ( ( rule__ArchElementToArchElement__Element1Assignment_1_1_0 ) ) )
            // InternalSafetyDSL.g:6409:1: ( ( rule__ArchElementToArchElement__Element1Assignment_1_1_0 ) )
            {
            // InternalSafetyDSL.g:6409:1: ( ( rule__ArchElementToArchElement__Element1Assignment_1_1_0 ) )
            // InternalSafetyDSL.g:6410:2: ( rule__ArchElementToArchElement__Element1Assignment_1_1_0 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_1_1_0()); 
            // InternalSafetyDSL.g:6411:2: ( rule__ArchElementToArchElement__Element1Assignment_1_1_0 )
            // InternalSafetyDSL.g:6411:3: rule__ArchElementToArchElement__Element1Assignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element1Assignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__1"
    // InternalSafetyDSL.g:6419:1: rule__ArchElementToArchElement__Group_1_1__1 : rule__ArchElementToArchElement__Group_1_1__1__Impl rule__ArchElementToArchElement__Group_1_1__2 ;
    public final void rule__ArchElementToArchElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6423:1: ( rule__ArchElementToArchElement__Group_1_1__1__Impl rule__ArchElementToArchElement__Group_1_1__2 )
            // InternalSafetyDSL.g:6424:2: rule__ArchElementToArchElement__Group_1_1__1__Impl rule__ArchElementToArchElement__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__1__Impl"
    // InternalSafetyDSL.g:6431:1: rule__ArchElementToArchElement__Group_1_1__1__Impl : ( 'writes' ) ;
    public final void rule__ArchElementToArchElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6435:1: ( ( 'writes' ) )
            // InternalSafetyDSL.g:6436:1: ( 'writes' )
            {
            // InternalSafetyDSL.g:6436:1: ( 'writes' )
            // InternalSafetyDSL.g:6437:2: 'writes'
            {
             before(grammarAccess.getArchElementToArchElementAccess().getWritesKeyword_1_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getWritesKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__2"
    // InternalSafetyDSL.g:6446:1: rule__ArchElementToArchElement__Group_1_1__2 : rule__ArchElementToArchElement__Group_1_1__2__Impl rule__ArchElementToArchElement__Group_1_1__3 ;
    public final void rule__ArchElementToArchElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6450:1: ( rule__ArchElementToArchElement__Group_1_1__2__Impl rule__ArchElementToArchElement__Group_1_1__3 )
            // InternalSafetyDSL.g:6451:2: rule__ArchElementToArchElement__Group_1_1__2__Impl rule__ArchElementToArchElement__Group_1_1__3
            {
            pushFollow(FOLLOW_25);
            rule__ArchElementToArchElement__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__2"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__2__Impl"
    // InternalSafetyDSL.g:6458:1: rule__ArchElementToArchElement__Group_1_1__2__Impl : ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_2 ) ) ;
    public final void rule__ArchElementToArchElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6462:1: ( ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_2 ) ) )
            // InternalSafetyDSL.g:6463:1: ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_2 ) )
            {
            // InternalSafetyDSL.g:6463:1: ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_2 ) )
            // InternalSafetyDSL.g:6464:2: ( rule__ArchElementToArchElement__Element2Assignment_1_1_2 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_1_1_2()); 
            // InternalSafetyDSL.g:6465:2: ( rule__ArchElementToArchElement__Element2Assignment_1_1_2 )
            // InternalSafetyDSL.g:6465:3: rule__ArchElementToArchElement__Element2Assignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element2Assignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__3"
    // InternalSafetyDSL.g:6473:1: rule__ArchElementToArchElement__Group_1_1__3 : rule__ArchElementToArchElement__Group_1_1__3__Impl rule__ArchElementToArchElement__Group_1_1__4 ;
    public final void rule__ArchElementToArchElement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6477:1: ( rule__ArchElementToArchElement__Group_1_1__3__Impl rule__ArchElementToArchElement__Group_1_1__4 )
            // InternalSafetyDSL.g:6478:2: rule__ArchElementToArchElement__Group_1_1__3__Impl rule__ArchElementToArchElement__Group_1_1__4
            {
            pushFollow(FOLLOW_25);
            rule__ArchElementToArchElement__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__3"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__3__Impl"
    // InternalSafetyDSL.g:6485:1: rule__ArchElementToArchElement__Group_1_1__3__Impl : ( ( rule__ArchElementToArchElement__Group_1_1_3__0 )* ) ;
    public final void rule__ArchElementToArchElement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6489:1: ( ( ( rule__ArchElementToArchElement__Group_1_1_3__0 )* ) )
            // InternalSafetyDSL.g:6490:1: ( ( rule__ArchElementToArchElement__Group_1_1_3__0 )* )
            {
            // InternalSafetyDSL.g:6490:1: ( ( rule__ArchElementToArchElement__Group_1_1_3__0 )* )
            // InternalSafetyDSL.g:6491:2: ( rule__ArchElementToArchElement__Group_1_1_3__0 )*
            {
             before(grammarAccess.getArchElementToArchElementAccess().getGroup_1_1_3()); 
            // InternalSafetyDSL.g:6492:2: ( rule__ArchElementToArchElement__Group_1_1_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSafetyDSL.g:6492:3: rule__ArchElementToArchElement__Group_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ArchElementToArchElement__Group_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getArchElementToArchElementAccess().getGroup_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__3__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__4"
    // InternalSafetyDSL.g:6500:1: rule__ArchElementToArchElement__Group_1_1__4 : rule__ArchElementToArchElement__Group_1_1__4__Impl ;
    public final void rule__ArchElementToArchElement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6504:1: ( rule__ArchElementToArchElement__Group_1_1__4__Impl )
            // InternalSafetyDSL.g:6505:2: rule__ArchElementToArchElement__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__4"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1__4__Impl"
    // InternalSafetyDSL.g:6511:1: rule__ArchElementToArchElement__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__ArchElementToArchElement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6515:1: ( ( ';' ) )
            // InternalSafetyDSL.g:6516:1: ( ';' )
            {
            // InternalSafetyDSL.g:6516:1: ( ';' )
            // InternalSafetyDSL.g:6517:2: ';'
            {
             before(grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_1_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1__4__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1_3__0"
    // InternalSafetyDSL.g:6527:1: rule__ArchElementToArchElement__Group_1_1_3__0 : rule__ArchElementToArchElement__Group_1_1_3__0__Impl rule__ArchElementToArchElement__Group_1_1_3__1 ;
    public final void rule__ArchElementToArchElement__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6531:1: ( rule__ArchElementToArchElement__Group_1_1_3__0__Impl rule__ArchElementToArchElement__Group_1_1_3__1 )
            // InternalSafetyDSL.g:6532:2: rule__ArchElementToArchElement__Group_1_1_3__0__Impl rule__ArchElementToArchElement__Group_1_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1_3__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1_3__0__Impl"
    // InternalSafetyDSL.g:6539:1: rule__ArchElementToArchElement__Group_1_1_3__0__Impl : ( ',' ) ;
    public final void rule__ArchElementToArchElement__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6543:1: ( ( ',' ) )
            // InternalSafetyDSL.g:6544:1: ( ',' )
            {
            // InternalSafetyDSL.g:6544:1: ( ',' )
            // InternalSafetyDSL.g:6545:2: ','
            {
             before(grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_1_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1_3__1"
    // InternalSafetyDSL.g:6554:1: rule__ArchElementToArchElement__Group_1_1_3__1 : rule__ArchElementToArchElement__Group_1_1_3__1__Impl ;
    public final void rule__ArchElementToArchElement__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6558:1: ( rule__ArchElementToArchElement__Group_1_1_3__1__Impl )
            // InternalSafetyDSL.g:6559:2: rule__ArchElementToArchElement__Group_1_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_1_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1_3__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_1_1_3__1__Impl"
    // InternalSafetyDSL.g:6565:1: rule__ArchElementToArchElement__Group_1_1_3__1__Impl : ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 ) ) ;
    public final void rule__ArchElementToArchElement__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6569:1: ( ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 ) ) )
            // InternalSafetyDSL.g:6570:1: ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 ) )
            {
            // InternalSafetyDSL.g:6570:1: ( ( rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 ) )
            // InternalSafetyDSL.g:6571:2: ( rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_1_1_3_1()); 
            // InternalSafetyDSL.g:6572:2: ( rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 )
            // InternalSafetyDSL.g:6572:3: rule__ArchElementToArchElement__Element2Assignment_1_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element2Assignment_1_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_1_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2__0"
    // InternalSafetyDSL.g:6581:1: rule__ArchElementToArchElement__Group_2__0 : rule__ArchElementToArchElement__Group_2__0__Impl rule__ArchElementToArchElement__Group_2__1 ;
    public final void rule__ArchElementToArchElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6585:1: ( rule__ArchElementToArchElement__Group_2__0__Impl rule__ArchElementToArchElement__Group_2__1 )
            // InternalSafetyDSL.g:6586:2: rule__ArchElementToArchElement__Group_2__0__Impl rule__ArchElementToArchElement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2__0__Impl"
    // InternalSafetyDSL.g:6593:1: rule__ArchElementToArchElement__Group_2__0__Impl : ( () ) ;
    public final void rule__ArchElementToArchElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6597:1: ( ( () ) )
            // InternalSafetyDSL.g:6598:1: ( () )
            {
            // InternalSafetyDSL.g:6598:1: ( () )
            // InternalSafetyDSL.g:6599:2: ()
            {
             before(grammarAccess.getArchElementToArchElementAccess().getCommandsAction_2_0()); 
            // InternalSafetyDSL.g:6600:2: ()
            // InternalSafetyDSL.g:6600:3: 
            {
            }

             after(grammarAccess.getArchElementToArchElementAccess().getCommandsAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2__1"
    // InternalSafetyDSL.g:6608:1: rule__ArchElementToArchElement__Group_2__1 : rule__ArchElementToArchElement__Group_2__1__Impl ;
    public final void rule__ArchElementToArchElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6612:1: ( rule__ArchElementToArchElement__Group_2__1__Impl )
            // InternalSafetyDSL.g:6613:2: rule__ArchElementToArchElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2__1__Impl"
    // InternalSafetyDSL.g:6619:1: rule__ArchElementToArchElement__Group_2__1__Impl : ( ( rule__ArchElementToArchElement__Group_2_1__0 ) ) ;
    public final void rule__ArchElementToArchElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6623:1: ( ( ( rule__ArchElementToArchElement__Group_2_1__0 ) ) )
            // InternalSafetyDSL.g:6624:1: ( ( rule__ArchElementToArchElement__Group_2_1__0 ) )
            {
            // InternalSafetyDSL.g:6624:1: ( ( rule__ArchElementToArchElement__Group_2_1__0 ) )
            // InternalSafetyDSL.g:6625:2: ( rule__ArchElementToArchElement__Group_2_1__0 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getGroup_2_1()); 
            // InternalSafetyDSL.g:6626:2: ( rule__ArchElementToArchElement__Group_2_1__0 )
            // InternalSafetyDSL.g:6626:3: rule__ArchElementToArchElement__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__0"
    // InternalSafetyDSL.g:6635:1: rule__ArchElementToArchElement__Group_2_1__0 : rule__ArchElementToArchElement__Group_2_1__0__Impl rule__ArchElementToArchElement__Group_2_1__1 ;
    public final void rule__ArchElementToArchElement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6639:1: ( rule__ArchElementToArchElement__Group_2_1__0__Impl rule__ArchElementToArchElement__Group_2_1__1 )
            // InternalSafetyDSL.g:6640:2: rule__ArchElementToArchElement__Group_2_1__0__Impl rule__ArchElementToArchElement__Group_2_1__1
            {
            pushFollow(FOLLOW_53);
            rule__ArchElementToArchElement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__0__Impl"
    // InternalSafetyDSL.g:6647:1: rule__ArchElementToArchElement__Group_2_1__0__Impl : ( ( rule__ArchElementToArchElement__Element1Assignment_2_1_0 ) ) ;
    public final void rule__ArchElementToArchElement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6651:1: ( ( ( rule__ArchElementToArchElement__Element1Assignment_2_1_0 ) ) )
            // InternalSafetyDSL.g:6652:1: ( ( rule__ArchElementToArchElement__Element1Assignment_2_1_0 ) )
            {
            // InternalSafetyDSL.g:6652:1: ( ( rule__ArchElementToArchElement__Element1Assignment_2_1_0 ) )
            // InternalSafetyDSL.g:6653:2: ( rule__ArchElementToArchElement__Element1Assignment_2_1_0 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_2_1_0()); 
            // InternalSafetyDSL.g:6654:2: ( rule__ArchElementToArchElement__Element1Assignment_2_1_0 )
            // InternalSafetyDSL.g:6654:3: rule__ArchElementToArchElement__Element1Assignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element1Assignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__1"
    // InternalSafetyDSL.g:6662:1: rule__ArchElementToArchElement__Group_2_1__1 : rule__ArchElementToArchElement__Group_2_1__1__Impl rule__ArchElementToArchElement__Group_2_1__2 ;
    public final void rule__ArchElementToArchElement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6666:1: ( rule__ArchElementToArchElement__Group_2_1__1__Impl rule__ArchElementToArchElement__Group_2_1__2 )
            // InternalSafetyDSL.g:6667:2: rule__ArchElementToArchElement__Group_2_1__1__Impl rule__ArchElementToArchElement__Group_2_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__1__Impl"
    // InternalSafetyDSL.g:6674:1: rule__ArchElementToArchElement__Group_2_1__1__Impl : ( 'commands' ) ;
    public final void rule__ArchElementToArchElement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6678:1: ( ( 'commands' ) )
            // InternalSafetyDSL.g:6679:1: ( 'commands' )
            {
            // InternalSafetyDSL.g:6679:1: ( 'commands' )
            // InternalSafetyDSL.g:6680:2: 'commands'
            {
             before(grammarAccess.getArchElementToArchElementAccess().getCommandsKeyword_2_1_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getCommandsKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__1__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__2"
    // InternalSafetyDSL.g:6689:1: rule__ArchElementToArchElement__Group_2_1__2 : rule__ArchElementToArchElement__Group_2_1__2__Impl rule__ArchElementToArchElement__Group_2_1__3 ;
    public final void rule__ArchElementToArchElement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6693:1: ( rule__ArchElementToArchElement__Group_2_1__2__Impl rule__ArchElementToArchElement__Group_2_1__3 )
            // InternalSafetyDSL.g:6694:2: rule__ArchElementToArchElement__Group_2_1__2__Impl rule__ArchElementToArchElement__Group_2_1__3
            {
            pushFollow(FOLLOW_25);
            rule__ArchElementToArchElement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__2"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__2__Impl"
    // InternalSafetyDSL.g:6701:1: rule__ArchElementToArchElement__Group_2_1__2__Impl : ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_2 ) ) ;
    public final void rule__ArchElementToArchElement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6705:1: ( ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_2 ) ) )
            // InternalSafetyDSL.g:6706:1: ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_2 ) )
            {
            // InternalSafetyDSL.g:6706:1: ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_2 ) )
            // InternalSafetyDSL.g:6707:2: ( rule__ArchElementToArchElement__Element2Assignment_2_1_2 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_2_1_2()); 
            // InternalSafetyDSL.g:6708:2: ( rule__ArchElementToArchElement__Element2Assignment_2_1_2 )
            // InternalSafetyDSL.g:6708:3: rule__ArchElementToArchElement__Element2Assignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element2Assignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__2__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__3"
    // InternalSafetyDSL.g:6716:1: rule__ArchElementToArchElement__Group_2_1__3 : rule__ArchElementToArchElement__Group_2_1__3__Impl rule__ArchElementToArchElement__Group_2_1__4 ;
    public final void rule__ArchElementToArchElement__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6720:1: ( rule__ArchElementToArchElement__Group_2_1__3__Impl rule__ArchElementToArchElement__Group_2_1__4 )
            // InternalSafetyDSL.g:6721:2: rule__ArchElementToArchElement__Group_2_1__3__Impl rule__ArchElementToArchElement__Group_2_1__4
            {
            pushFollow(FOLLOW_25);
            rule__ArchElementToArchElement__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__3"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__3__Impl"
    // InternalSafetyDSL.g:6728:1: rule__ArchElementToArchElement__Group_2_1__3__Impl : ( ( rule__ArchElementToArchElement__Group_2_1_3__0 )* ) ;
    public final void rule__ArchElementToArchElement__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6732:1: ( ( ( rule__ArchElementToArchElement__Group_2_1_3__0 )* ) )
            // InternalSafetyDSL.g:6733:1: ( ( rule__ArchElementToArchElement__Group_2_1_3__0 )* )
            {
            // InternalSafetyDSL.g:6733:1: ( ( rule__ArchElementToArchElement__Group_2_1_3__0 )* )
            // InternalSafetyDSL.g:6734:2: ( rule__ArchElementToArchElement__Group_2_1_3__0 )*
            {
             before(grammarAccess.getArchElementToArchElementAccess().getGroup_2_1_3()); 
            // InternalSafetyDSL.g:6735:2: ( rule__ArchElementToArchElement__Group_2_1_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSafetyDSL.g:6735:3: rule__ArchElementToArchElement__Group_2_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ArchElementToArchElement__Group_2_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getArchElementToArchElementAccess().getGroup_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__3__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__4"
    // InternalSafetyDSL.g:6743:1: rule__ArchElementToArchElement__Group_2_1__4 : rule__ArchElementToArchElement__Group_2_1__4__Impl ;
    public final void rule__ArchElementToArchElement__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6747:1: ( rule__ArchElementToArchElement__Group_2_1__4__Impl )
            // InternalSafetyDSL.g:6748:2: rule__ArchElementToArchElement__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__4"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1__4__Impl"
    // InternalSafetyDSL.g:6754:1: rule__ArchElementToArchElement__Group_2_1__4__Impl : ( ';' ) ;
    public final void rule__ArchElementToArchElement__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6758:1: ( ( ';' ) )
            // InternalSafetyDSL.g:6759:1: ( ';' )
            {
            // InternalSafetyDSL.g:6759:1: ( ';' )
            // InternalSafetyDSL.g:6760:2: ';'
            {
             before(grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_2_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1__4__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1_3__0"
    // InternalSafetyDSL.g:6770:1: rule__ArchElementToArchElement__Group_2_1_3__0 : rule__ArchElementToArchElement__Group_2_1_3__0__Impl rule__ArchElementToArchElement__Group_2_1_3__1 ;
    public final void rule__ArchElementToArchElement__Group_2_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6774:1: ( rule__ArchElementToArchElement__Group_2_1_3__0__Impl rule__ArchElementToArchElement__Group_2_1_3__1 )
            // InternalSafetyDSL.g:6775:2: rule__ArchElementToArchElement__Group_2_1_3__0__Impl rule__ArchElementToArchElement__Group_2_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ArchElementToArchElement__Group_2_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1_3__0"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1_3__0__Impl"
    // InternalSafetyDSL.g:6782:1: rule__ArchElementToArchElement__Group_2_1_3__0__Impl : ( ',' ) ;
    public final void rule__ArchElementToArchElement__Group_2_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6786:1: ( ( ',' ) )
            // InternalSafetyDSL.g:6787:1: ( ',' )
            {
            // InternalSafetyDSL.g:6787:1: ( ',' )
            // InternalSafetyDSL.g:6788:2: ','
            {
             before(grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_2_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1_3__0__Impl"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1_3__1"
    // InternalSafetyDSL.g:6797:1: rule__ArchElementToArchElement__Group_2_1_3__1 : rule__ArchElementToArchElement__Group_2_1_3__1__Impl ;
    public final void rule__ArchElementToArchElement__Group_2_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6801:1: ( rule__ArchElementToArchElement__Group_2_1_3__1__Impl )
            // InternalSafetyDSL.g:6802:2: rule__ArchElementToArchElement__Group_2_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Group_2_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1_3__1"


    // $ANTLR start "rule__ArchElementToArchElement__Group_2_1_3__1__Impl"
    // InternalSafetyDSL.g:6808:1: rule__ArchElementToArchElement__Group_2_1_3__1__Impl : ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 ) ) ;
    public final void rule__ArchElementToArchElement__Group_2_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6812:1: ( ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 ) ) )
            // InternalSafetyDSL.g:6813:1: ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 ) )
            {
            // InternalSafetyDSL.g:6813:1: ( ( rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 ) )
            // InternalSafetyDSL.g:6814:2: ( rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_2_1_3_1()); 
            // InternalSafetyDSL.g:6815:2: ( rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 )
            // InternalSafetyDSL.g:6815:3: rule__ArchElementToArchElement__Element2Assignment_2_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchElementToArchElement__Element2Assignment_2_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_2_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Group_2_1_3__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0__0"
    // InternalSafetyDSL.g:6824:1: rule__MonitorToArchitecturalElement__Group_0__0 : rule__MonitorToArchitecturalElement__Group_0__0__Impl rule__MonitorToArchitecturalElement__Group_0__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6828:1: ( rule__MonitorToArchitecturalElement__Group_0__0__Impl rule__MonitorToArchitecturalElement__Group_0__1 )
            // InternalSafetyDSL.g:6829:2: rule__MonitorToArchitecturalElement__Group_0__0__Impl rule__MonitorToArchitecturalElement__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0__0__Impl"
    // InternalSafetyDSL.g:6836:1: rule__MonitorToArchitecturalElement__Group_0__0__Impl : ( () ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6840:1: ( ( () ) )
            // InternalSafetyDSL.g:6841:1: ( () )
            {
            // InternalSafetyDSL.g:6841:1: ( () )
            // InternalSafetyDSL.g:6842:2: ()
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getStopsAction_0_0()); 
            // InternalSafetyDSL.g:6843:2: ()
            // InternalSafetyDSL.g:6843:3: 
            {
            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getStopsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0__1"
    // InternalSafetyDSL.g:6851:1: rule__MonitorToArchitecturalElement__Group_0__1 : rule__MonitorToArchitecturalElement__Group_0__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6855:1: ( rule__MonitorToArchitecturalElement__Group_0__1__Impl )
            // InternalSafetyDSL.g:6856:2: rule__MonitorToArchitecturalElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0__1__Impl"
    // InternalSafetyDSL.g:6862:1: rule__MonitorToArchitecturalElement__Group_0__1__Impl : ( ( rule__MonitorToArchitecturalElement__Group_0_1__0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6866:1: ( ( ( rule__MonitorToArchitecturalElement__Group_0_1__0 ) ) )
            // InternalSafetyDSL.g:6867:1: ( ( rule__MonitorToArchitecturalElement__Group_0_1__0 ) )
            {
            // InternalSafetyDSL.g:6867:1: ( ( rule__MonitorToArchitecturalElement__Group_0_1__0 ) )
            // InternalSafetyDSL.g:6868:2: ( rule__MonitorToArchitecturalElement__Group_0_1__0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0_1()); 
            // InternalSafetyDSL.g:6869:2: ( rule__MonitorToArchitecturalElement__Group_0_1__0 )
            // InternalSafetyDSL.g:6869:3: rule__MonitorToArchitecturalElement__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__0"
    // InternalSafetyDSL.g:6878:1: rule__MonitorToArchitecturalElement__Group_0_1__0 : rule__MonitorToArchitecturalElement__Group_0_1__0__Impl rule__MonitorToArchitecturalElement__Group_0_1__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6882:1: ( rule__MonitorToArchitecturalElement__Group_0_1__0__Impl rule__MonitorToArchitecturalElement__Group_0_1__1 )
            // InternalSafetyDSL.g:6883:2: rule__MonitorToArchitecturalElement__Group_0_1__0__Impl rule__MonitorToArchitecturalElement__Group_0_1__1
            {
            pushFollow(FOLLOW_54);
            rule__MonitorToArchitecturalElement__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__0__Impl"
    // InternalSafetyDSL.g:6890:1: rule__MonitorToArchitecturalElement__Group_0_1__0__Impl : ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6894:1: ( ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 ) ) )
            // InternalSafetyDSL.g:6895:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 ) )
            {
            // InternalSafetyDSL.g:6895:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 ) )
            // InternalSafetyDSL.g:6896:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_0_1_0()); 
            // InternalSafetyDSL.g:6897:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 )
            // InternalSafetyDSL.g:6897:3: rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__1"
    // InternalSafetyDSL.g:6905:1: rule__MonitorToArchitecturalElement__Group_0_1__1 : rule__MonitorToArchitecturalElement__Group_0_1__1__Impl rule__MonitorToArchitecturalElement__Group_0_1__2 ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6909:1: ( rule__MonitorToArchitecturalElement__Group_0_1__1__Impl rule__MonitorToArchitecturalElement__Group_0_1__2 )
            // InternalSafetyDSL.g:6910:2: rule__MonitorToArchitecturalElement__Group_0_1__1__Impl rule__MonitorToArchitecturalElement__Group_0_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__1__Impl"
    // InternalSafetyDSL.g:6917:1: rule__MonitorToArchitecturalElement__Group_0_1__1__Impl : ( 'stops' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6921:1: ( ( 'stops' ) )
            // InternalSafetyDSL.g:6922:1: ( 'stops' )
            {
            // InternalSafetyDSL.g:6922:1: ( 'stops' )
            // InternalSafetyDSL.g:6923:2: 'stops'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getStopsKeyword_0_1_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getStopsKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__2"
    // InternalSafetyDSL.g:6932:1: rule__MonitorToArchitecturalElement__Group_0_1__2 : rule__MonitorToArchitecturalElement__Group_0_1__2__Impl rule__MonitorToArchitecturalElement__Group_0_1__3 ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6936:1: ( rule__MonitorToArchitecturalElement__Group_0_1__2__Impl rule__MonitorToArchitecturalElement__Group_0_1__3 )
            // InternalSafetyDSL.g:6937:2: rule__MonitorToArchitecturalElement__Group_0_1__2__Impl rule__MonitorToArchitecturalElement__Group_0_1__3
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__2__Impl"
    // InternalSafetyDSL.g:6944:1: rule__MonitorToArchitecturalElement__Group_0_1__2__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6948:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 ) ) )
            // InternalSafetyDSL.g:6949:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 ) )
            {
            // InternalSafetyDSL.g:6949:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 ) )
            // InternalSafetyDSL.g:6950:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_0_1_2()); 
            // InternalSafetyDSL.g:6951:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 )
            // InternalSafetyDSL.g:6951:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__2__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__3"
    // InternalSafetyDSL.g:6959:1: rule__MonitorToArchitecturalElement__Group_0_1__3 : rule__MonitorToArchitecturalElement__Group_0_1__3__Impl rule__MonitorToArchitecturalElement__Group_0_1__4 ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6963:1: ( rule__MonitorToArchitecturalElement__Group_0_1__3__Impl rule__MonitorToArchitecturalElement__Group_0_1__4 )
            // InternalSafetyDSL.g:6964:2: rule__MonitorToArchitecturalElement__Group_0_1__3__Impl rule__MonitorToArchitecturalElement__Group_0_1__4
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__3"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__3__Impl"
    // InternalSafetyDSL.g:6971:1: rule__MonitorToArchitecturalElement__Group_0_1__3__Impl : ( ( rule__MonitorToArchitecturalElement__Group_0_1_3__0 )* ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6975:1: ( ( ( rule__MonitorToArchitecturalElement__Group_0_1_3__0 )* ) )
            // InternalSafetyDSL.g:6976:1: ( ( rule__MonitorToArchitecturalElement__Group_0_1_3__0 )* )
            {
            // InternalSafetyDSL.g:6976:1: ( ( rule__MonitorToArchitecturalElement__Group_0_1_3__0 )* )
            // InternalSafetyDSL.g:6977:2: ( rule__MonitorToArchitecturalElement__Group_0_1_3__0 )*
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0_1_3()); 
            // InternalSafetyDSL.g:6978:2: ( rule__MonitorToArchitecturalElement__Group_0_1_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSafetyDSL.g:6978:3: rule__MonitorToArchitecturalElement__Group_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MonitorToArchitecturalElement__Group_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__3__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__4"
    // InternalSafetyDSL.g:6986:1: rule__MonitorToArchitecturalElement__Group_0_1__4 : rule__MonitorToArchitecturalElement__Group_0_1__4__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:6990:1: ( rule__MonitorToArchitecturalElement__Group_0_1__4__Impl )
            // InternalSafetyDSL.g:6991:2: rule__MonitorToArchitecturalElement__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__4"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1__4__Impl"
    // InternalSafetyDSL.g:6997:1: rule__MonitorToArchitecturalElement__Group_0_1__4__Impl : ( ';' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7001:1: ( ( ';' ) )
            // InternalSafetyDSL.g:7002:1: ( ';' )
            {
            // InternalSafetyDSL.g:7002:1: ( ';' )
            // InternalSafetyDSL.g:7003:2: ';'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_0_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1__4__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1_3__0"
    // InternalSafetyDSL.g:7013:1: rule__MonitorToArchitecturalElement__Group_0_1_3__0 : rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_0_1_3__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7017:1: ( rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_0_1_3__1 )
            // InternalSafetyDSL.g:7018:2: rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_0_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1_3__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl"
    // InternalSafetyDSL.g:7025:1: rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl : ( ',' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7029:1: ( ( ',' ) )
            // InternalSafetyDSL.g:7030:1: ( ',' )
            {
            // InternalSafetyDSL.g:7030:1: ( ',' )
            // InternalSafetyDSL.g:7031:2: ','
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_0_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1_3__1"
    // InternalSafetyDSL.g:7040:1: rule__MonitorToArchitecturalElement__Group_0_1_3__1 : rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7044:1: ( rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl )
            // InternalSafetyDSL.g:7045:2: rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1_3__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl"
    // InternalSafetyDSL.g:7051:1: rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7055:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 ) ) )
            // InternalSafetyDSL.g:7056:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 ) )
            {
            // InternalSafetyDSL.g:7056:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 ) )
            // InternalSafetyDSL.g:7057:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_0_1_3_1()); 
            // InternalSafetyDSL.g:7058:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 )
            // InternalSafetyDSL.g:7058:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_0_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1__0"
    // InternalSafetyDSL.g:7067:1: rule__MonitorToArchitecturalElement__Group_1__0 : rule__MonitorToArchitecturalElement__Group_1__0__Impl rule__MonitorToArchitecturalElement__Group_1__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7071:1: ( rule__MonitorToArchitecturalElement__Group_1__0__Impl rule__MonitorToArchitecturalElement__Group_1__1 )
            // InternalSafetyDSL.g:7072:2: rule__MonitorToArchitecturalElement__Group_1__0__Impl rule__MonitorToArchitecturalElement__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1__0__Impl"
    // InternalSafetyDSL.g:7079:1: rule__MonitorToArchitecturalElement__Group_1__0__Impl : ( () ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7083:1: ( ( () ) )
            // InternalSafetyDSL.g:7084:1: ( () )
            {
            // InternalSafetyDSL.g:7084:1: ( () )
            // InternalSafetyDSL.g:7085:2: ()
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getStartsAction_1_0()); 
            // InternalSafetyDSL.g:7086:2: ()
            // InternalSafetyDSL.g:7086:3: 
            {
            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getStartsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1__1"
    // InternalSafetyDSL.g:7094:1: rule__MonitorToArchitecturalElement__Group_1__1 : rule__MonitorToArchitecturalElement__Group_1__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7098:1: ( rule__MonitorToArchitecturalElement__Group_1__1__Impl )
            // InternalSafetyDSL.g:7099:2: rule__MonitorToArchitecturalElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1__1__Impl"
    // InternalSafetyDSL.g:7105:1: rule__MonitorToArchitecturalElement__Group_1__1__Impl : ( ( rule__MonitorToArchitecturalElement__Group_1_1__0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7109:1: ( ( ( rule__MonitorToArchitecturalElement__Group_1_1__0 ) ) )
            // InternalSafetyDSL.g:7110:1: ( ( rule__MonitorToArchitecturalElement__Group_1_1__0 ) )
            {
            // InternalSafetyDSL.g:7110:1: ( ( rule__MonitorToArchitecturalElement__Group_1_1__0 ) )
            // InternalSafetyDSL.g:7111:2: ( rule__MonitorToArchitecturalElement__Group_1_1__0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1_1()); 
            // InternalSafetyDSL.g:7112:2: ( rule__MonitorToArchitecturalElement__Group_1_1__0 )
            // InternalSafetyDSL.g:7112:3: rule__MonitorToArchitecturalElement__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__0"
    // InternalSafetyDSL.g:7121:1: rule__MonitorToArchitecturalElement__Group_1_1__0 : rule__MonitorToArchitecturalElement__Group_1_1__0__Impl rule__MonitorToArchitecturalElement__Group_1_1__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7125:1: ( rule__MonitorToArchitecturalElement__Group_1_1__0__Impl rule__MonitorToArchitecturalElement__Group_1_1__1 )
            // InternalSafetyDSL.g:7126:2: rule__MonitorToArchitecturalElement__Group_1_1__0__Impl rule__MonitorToArchitecturalElement__Group_1_1__1
            {
            pushFollow(FOLLOW_55);
            rule__MonitorToArchitecturalElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__0__Impl"
    // InternalSafetyDSL.g:7133:1: rule__MonitorToArchitecturalElement__Group_1_1__0__Impl : ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7137:1: ( ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 ) ) )
            // InternalSafetyDSL.g:7138:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 ) )
            {
            // InternalSafetyDSL.g:7138:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 ) )
            // InternalSafetyDSL.g:7139:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_1_1_0()); 
            // InternalSafetyDSL.g:7140:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 )
            // InternalSafetyDSL.g:7140:3: rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__1"
    // InternalSafetyDSL.g:7148:1: rule__MonitorToArchitecturalElement__Group_1_1__1 : rule__MonitorToArchitecturalElement__Group_1_1__1__Impl rule__MonitorToArchitecturalElement__Group_1_1__2 ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7152:1: ( rule__MonitorToArchitecturalElement__Group_1_1__1__Impl rule__MonitorToArchitecturalElement__Group_1_1__2 )
            // InternalSafetyDSL.g:7153:2: rule__MonitorToArchitecturalElement__Group_1_1__1__Impl rule__MonitorToArchitecturalElement__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__1__Impl"
    // InternalSafetyDSL.g:7160:1: rule__MonitorToArchitecturalElement__Group_1_1__1__Impl : ( 'starts' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7164:1: ( ( 'starts' ) )
            // InternalSafetyDSL.g:7165:1: ( 'starts' )
            {
            // InternalSafetyDSL.g:7165:1: ( 'starts' )
            // InternalSafetyDSL.g:7166:2: 'starts'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getStartsKeyword_1_1_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getStartsKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__2"
    // InternalSafetyDSL.g:7175:1: rule__MonitorToArchitecturalElement__Group_1_1__2 : rule__MonitorToArchitecturalElement__Group_1_1__2__Impl rule__MonitorToArchitecturalElement__Group_1_1__3 ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7179:1: ( rule__MonitorToArchitecturalElement__Group_1_1__2__Impl rule__MonitorToArchitecturalElement__Group_1_1__3 )
            // InternalSafetyDSL.g:7180:2: rule__MonitorToArchitecturalElement__Group_1_1__2__Impl rule__MonitorToArchitecturalElement__Group_1_1__3
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__2__Impl"
    // InternalSafetyDSL.g:7187:1: rule__MonitorToArchitecturalElement__Group_1_1__2__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7191:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 ) ) )
            // InternalSafetyDSL.g:7192:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 ) )
            {
            // InternalSafetyDSL.g:7192:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 ) )
            // InternalSafetyDSL.g:7193:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_1_1_2()); 
            // InternalSafetyDSL.g:7194:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 )
            // InternalSafetyDSL.g:7194:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__3"
    // InternalSafetyDSL.g:7202:1: rule__MonitorToArchitecturalElement__Group_1_1__3 : rule__MonitorToArchitecturalElement__Group_1_1__3__Impl rule__MonitorToArchitecturalElement__Group_1_1__4 ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7206:1: ( rule__MonitorToArchitecturalElement__Group_1_1__3__Impl rule__MonitorToArchitecturalElement__Group_1_1__4 )
            // InternalSafetyDSL.g:7207:2: rule__MonitorToArchitecturalElement__Group_1_1__3__Impl rule__MonitorToArchitecturalElement__Group_1_1__4
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__3"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__3__Impl"
    // InternalSafetyDSL.g:7214:1: rule__MonitorToArchitecturalElement__Group_1_1__3__Impl : ( ( rule__MonitorToArchitecturalElement__Group_1_1_3__0 )* ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7218:1: ( ( ( rule__MonitorToArchitecturalElement__Group_1_1_3__0 )* ) )
            // InternalSafetyDSL.g:7219:1: ( ( rule__MonitorToArchitecturalElement__Group_1_1_3__0 )* )
            {
            // InternalSafetyDSL.g:7219:1: ( ( rule__MonitorToArchitecturalElement__Group_1_1_3__0 )* )
            // InternalSafetyDSL.g:7220:2: ( rule__MonitorToArchitecturalElement__Group_1_1_3__0 )*
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1_1_3()); 
            // InternalSafetyDSL.g:7221:2: ( rule__MonitorToArchitecturalElement__Group_1_1_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSafetyDSL.g:7221:3: rule__MonitorToArchitecturalElement__Group_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MonitorToArchitecturalElement__Group_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__3__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__4"
    // InternalSafetyDSL.g:7229:1: rule__MonitorToArchitecturalElement__Group_1_1__4 : rule__MonitorToArchitecturalElement__Group_1_1__4__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7233:1: ( rule__MonitorToArchitecturalElement__Group_1_1__4__Impl )
            // InternalSafetyDSL.g:7234:2: rule__MonitorToArchitecturalElement__Group_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__4"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1__4__Impl"
    // InternalSafetyDSL.g:7240:1: rule__MonitorToArchitecturalElement__Group_1_1__4__Impl : ( ';' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7244:1: ( ( ';' ) )
            // InternalSafetyDSL.g:7245:1: ( ';' )
            {
            // InternalSafetyDSL.g:7245:1: ( ';' )
            // InternalSafetyDSL.g:7246:2: ';'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_1_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1__4__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1_3__0"
    // InternalSafetyDSL.g:7256:1: rule__MonitorToArchitecturalElement__Group_1_1_3__0 : rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_1_1_3__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7260:1: ( rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_1_1_3__1 )
            // InternalSafetyDSL.g:7261:2: rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_1_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1_3__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl"
    // InternalSafetyDSL.g:7268:1: rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl : ( ',' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7272:1: ( ( ',' ) )
            // InternalSafetyDSL.g:7273:1: ( ',' )
            {
            // InternalSafetyDSL.g:7273:1: ( ',' )
            // InternalSafetyDSL.g:7274:2: ','
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_1_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1_3__1"
    // InternalSafetyDSL.g:7283:1: rule__MonitorToArchitecturalElement__Group_1_1_3__1 : rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7287:1: ( rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl )
            // InternalSafetyDSL.g:7288:2: rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1_3__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl"
    // InternalSafetyDSL.g:7294:1: rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7298:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 ) ) )
            // InternalSafetyDSL.g:7299:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 ) )
            {
            // InternalSafetyDSL.g:7299:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 ) )
            // InternalSafetyDSL.g:7300:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_1_1_3_1()); 
            // InternalSafetyDSL.g:7301:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 )
            // InternalSafetyDSL.g:7301:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_1_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2__0"
    // InternalSafetyDSL.g:7310:1: rule__MonitorToArchitecturalElement__Group_2__0 : rule__MonitorToArchitecturalElement__Group_2__0__Impl rule__MonitorToArchitecturalElement__Group_2__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7314:1: ( rule__MonitorToArchitecturalElement__Group_2__0__Impl rule__MonitorToArchitecturalElement__Group_2__1 )
            // InternalSafetyDSL.g:7315:2: rule__MonitorToArchitecturalElement__Group_2__0__Impl rule__MonitorToArchitecturalElement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2__0__Impl"
    // InternalSafetyDSL.g:7322:1: rule__MonitorToArchitecturalElement__Group_2__0__Impl : ( () ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7326:1: ( ( () ) )
            // InternalSafetyDSL.g:7327:1: ( () )
            {
            // InternalSafetyDSL.g:7327:1: ( () )
            // InternalSafetyDSL.g:7328:2: ()
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getInitsAction_2_0()); 
            // InternalSafetyDSL.g:7329:2: ()
            // InternalSafetyDSL.g:7329:3: 
            {
            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getInitsAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2__1"
    // InternalSafetyDSL.g:7337:1: rule__MonitorToArchitecturalElement__Group_2__1 : rule__MonitorToArchitecturalElement__Group_2__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7341:1: ( rule__MonitorToArchitecturalElement__Group_2__1__Impl )
            // InternalSafetyDSL.g:7342:2: rule__MonitorToArchitecturalElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2__1__Impl"
    // InternalSafetyDSL.g:7348:1: rule__MonitorToArchitecturalElement__Group_2__1__Impl : ( ( rule__MonitorToArchitecturalElement__Group_2_1__0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7352:1: ( ( ( rule__MonitorToArchitecturalElement__Group_2_1__0 ) ) )
            // InternalSafetyDSL.g:7353:1: ( ( rule__MonitorToArchitecturalElement__Group_2_1__0 ) )
            {
            // InternalSafetyDSL.g:7353:1: ( ( rule__MonitorToArchitecturalElement__Group_2_1__0 ) )
            // InternalSafetyDSL.g:7354:2: ( rule__MonitorToArchitecturalElement__Group_2_1__0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2_1()); 
            // InternalSafetyDSL.g:7355:2: ( rule__MonitorToArchitecturalElement__Group_2_1__0 )
            // InternalSafetyDSL.g:7355:3: rule__MonitorToArchitecturalElement__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__0"
    // InternalSafetyDSL.g:7364:1: rule__MonitorToArchitecturalElement__Group_2_1__0 : rule__MonitorToArchitecturalElement__Group_2_1__0__Impl rule__MonitorToArchitecturalElement__Group_2_1__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7368:1: ( rule__MonitorToArchitecturalElement__Group_2_1__0__Impl rule__MonitorToArchitecturalElement__Group_2_1__1 )
            // InternalSafetyDSL.g:7369:2: rule__MonitorToArchitecturalElement__Group_2_1__0__Impl rule__MonitorToArchitecturalElement__Group_2_1__1
            {
            pushFollow(FOLLOW_56);
            rule__MonitorToArchitecturalElement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__0__Impl"
    // InternalSafetyDSL.g:7376:1: rule__MonitorToArchitecturalElement__Group_2_1__0__Impl : ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7380:1: ( ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 ) ) )
            // InternalSafetyDSL.g:7381:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 ) )
            {
            // InternalSafetyDSL.g:7381:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 ) )
            // InternalSafetyDSL.g:7382:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_2_1_0()); 
            // InternalSafetyDSL.g:7383:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 )
            // InternalSafetyDSL.g:7383:3: rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__1"
    // InternalSafetyDSL.g:7391:1: rule__MonitorToArchitecturalElement__Group_2_1__1 : rule__MonitorToArchitecturalElement__Group_2_1__1__Impl rule__MonitorToArchitecturalElement__Group_2_1__2 ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7395:1: ( rule__MonitorToArchitecturalElement__Group_2_1__1__Impl rule__MonitorToArchitecturalElement__Group_2_1__2 )
            // InternalSafetyDSL.g:7396:2: rule__MonitorToArchitecturalElement__Group_2_1__1__Impl rule__MonitorToArchitecturalElement__Group_2_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__1__Impl"
    // InternalSafetyDSL.g:7403:1: rule__MonitorToArchitecturalElement__Group_2_1__1__Impl : ( 'inits' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7407:1: ( ( 'inits' ) )
            // InternalSafetyDSL.g:7408:1: ( 'inits' )
            {
            // InternalSafetyDSL.g:7408:1: ( 'inits' )
            // InternalSafetyDSL.g:7409:2: 'inits'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getInitsKeyword_2_1_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getInitsKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__2"
    // InternalSafetyDSL.g:7418:1: rule__MonitorToArchitecturalElement__Group_2_1__2 : rule__MonitorToArchitecturalElement__Group_2_1__2__Impl rule__MonitorToArchitecturalElement__Group_2_1__3 ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7422:1: ( rule__MonitorToArchitecturalElement__Group_2_1__2__Impl rule__MonitorToArchitecturalElement__Group_2_1__3 )
            // InternalSafetyDSL.g:7423:2: rule__MonitorToArchitecturalElement__Group_2_1__2__Impl rule__MonitorToArchitecturalElement__Group_2_1__3
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__2__Impl"
    // InternalSafetyDSL.g:7430:1: rule__MonitorToArchitecturalElement__Group_2_1__2__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7434:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 ) ) )
            // InternalSafetyDSL.g:7435:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 ) )
            {
            // InternalSafetyDSL.g:7435:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 ) )
            // InternalSafetyDSL.g:7436:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_2_1_2()); 
            // InternalSafetyDSL.g:7437:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 )
            // InternalSafetyDSL.g:7437:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__2__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__3"
    // InternalSafetyDSL.g:7445:1: rule__MonitorToArchitecturalElement__Group_2_1__3 : rule__MonitorToArchitecturalElement__Group_2_1__3__Impl rule__MonitorToArchitecturalElement__Group_2_1__4 ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7449:1: ( rule__MonitorToArchitecturalElement__Group_2_1__3__Impl rule__MonitorToArchitecturalElement__Group_2_1__4 )
            // InternalSafetyDSL.g:7450:2: rule__MonitorToArchitecturalElement__Group_2_1__3__Impl rule__MonitorToArchitecturalElement__Group_2_1__4
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__3"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__3__Impl"
    // InternalSafetyDSL.g:7457:1: rule__MonitorToArchitecturalElement__Group_2_1__3__Impl : ( ( rule__MonitorToArchitecturalElement__Group_2_1_3__0 )* ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7461:1: ( ( ( rule__MonitorToArchitecturalElement__Group_2_1_3__0 )* ) )
            // InternalSafetyDSL.g:7462:1: ( ( rule__MonitorToArchitecturalElement__Group_2_1_3__0 )* )
            {
            // InternalSafetyDSL.g:7462:1: ( ( rule__MonitorToArchitecturalElement__Group_2_1_3__0 )* )
            // InternalSafetyDSL.g:7463:2: ( rule__MonitorToArchitecturalElement__Group_2_1_3__0 )*
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2_1_3()); 
            // InternalSafetyDSL.g:7464:2: ( rule__MonitorToArchitecturalElement__Group_2_1_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==27) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSafetyDSL.g:7464:3: rule__MonitorToArchitecturalElement__Group_2_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MonitorToArchitecturalElement__Group_2_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__3__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__4"
    // InternalSafetyDSL.g:7472:1: rule__MonitorToArchitecturalElement__Group_2_1__4 : rule__MonitorToArchitecturalElement__Group_2_1__4__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7476:1: ( rule__MonitorToArchitecturalElement__Group_2_1__4__Impl )
            // InternalSafetyDSL.g:7477:2: rule__MonitorToArchitecturalElement__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__4"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1__4__Impl"
    // InternalSafetyDSL.g:7483:1: rule__MonitorToArchitecturalElement__Group_2_1__4__Impl : ( ';' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7487:1: ( ( ';' ) )
            // InternalSafetyDSL.g:7488:1: ( ';' )
            {
            // InternalSafetyDSL.g:7488:1: ( ';' )
            // InternalSafetyDSL.g:7489:2: ';'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_2_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1__4__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1_3__0"
    // InternalSafetyDSL.g:7499:1: rule__MonitorToArchitecturalElement__Group_2_1_3__0 : rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_2_1_3__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7503:1: ( rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_2_1_3__1 )
            // InternalSafetyDSL.g:7504:2: rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_2_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1_3__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl"
    // InternalSafetyDSL.g:7511:1: rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl : ( ',' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7515:1: ( ( ',' ) )
            // InternalSafetyDSL.g:7516:1: ( ',' )
            {
            // InternalSafetyDSL.g:7516:1: ( ',' )
            // InternalSafetyDSL.g:7517:2: ','
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_2_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1_3__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1_3__1"
    // InternalSafetyDSL.g:7526:1: rule__MonitorToArchitecturalElement__Group_2_1_3__1 : rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7530:1: ( rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl )
            // InternalSafetyDSL.g:7531:2: rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1_3__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl"
    // InternalSafetyDSL.g:7537:1: rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7541:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 ) ) )
            // InternalSafetyDSL.g:7542:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 ) )
            {
            // InternalSafetyDSL.g:7542:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 ) )
            // InternalSafetyDSL.g:7543:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_2_1_3_1()); 
            // InternalSafetyDSL.g:7544:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 )
            // InternalSafetyDSL.g:7544:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_2_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_2_1_3__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3__0"
    // InternalSafetyDSL.g:7553:1: rule__MonitorToArchitecturalElement__Group_3__0 : rule__MonitorToArchitecturalElement__Group_3__0__Impl rule__MonitorToArchitecturalElement__Group_3__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7557:1: ( rule__MonitorToArchitecturalElement__Group_3__0__Impl rule__MonitorToArchitecturalElement__Group_3__1 )
            // InternalSafetyDSL.g:7558:2: rule__MonitorToArchitecturalElement__Group_3__0__Impl rule__MonitorToArchitecturalElement__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3__0__Impl"
    // InternalSafetyDSL.g:7565:1: rule__MonitorToArchitecturalElement__Group_3__0__Impl : ( () ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7569:1: ( ( () ) )
            // InternalSafetyDSL.g:7570:1: ( () )
            {
            // InternalSafetyDSL.g:7570:1: ( () )
            // InternalSafetyDSL.g:7571:2: ()
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getRestartsAction_3_0()); 
            // InternalSafetyDSL.g:7572:2: ()
            // InternalSafetyDSL.g:7572:3: 
            {
            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getRestartsAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3__1"
    // InternalSafetyDSL.g:7580:1: rule__MonitorToArchitecturalElement__Group_3__1 : rule__MonitorToArchitecturalElement__Group_3__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7584:1: ( rule__MonitorToArchitecturalElement__Group_3__1__Impl )
            // InternalSafetyDSL.g:7585:2: rule__MonitorToArchitecturalElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3__1__Impl"
    // InternalSafetyDSL.g:7591:1: rule__MonitorToArchitecturalElement__Group_3__1__Impl : ( ( rule__MonitorToArchitecturalElement__Group_3_1__0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7595:1: ( ( ( rule__MonitorToArchitecturalElement__Group_3_1__0 ) ) )
            // InternalSafetyDSL.g:7596:1: ( ( rule__MonitorToArchitecturalElement__Group_3_1__0 ) )
            {
            // InternalSafetyDSL.g:7596:1: ( ( rule__MonitorToArchitecturalElement__Group_3_1__0 ) )
            // InternalSafetyDSL.g:7597:2: ( rule__MonitorToArchitecturalElement__Group_3_1__0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3_1()); 
            // InternalSafetyDSL.g:7598:2: ( rule__MonitorToArchitecturalElement__Group_3_1__0 )
            // InternalSafetyDSL.g:7598:3: rule__MonitorToArchitecturalElement__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__0"
    // InternalSafetyDSL.g:7607:1: rule__MonitorToArchitecturalElement__Group_3_1__0 : rule__MonitorToArchitecturalElement__Group_3_1__0__Impl rule__MonitorToArchitecturalElement__Group_3_1__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7611:1: ( rule__MonitorToArchitecturalElement__Group_3_1__0__Impl rule__MonitorToArchitecturalElement__Group_3_1__1 )
            // InternalSafetyDSL.g:7612:2: rule__MonitorToArchitecturalElement__Group_3_1__0__Impl rule__MonitorToArchitecturalElement__Group_3_1__1
            {
            pushFollow(FOLLOW_57);
            rule__MonitorToArchitecturalElement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__0__Impl"
    // InternalSafetyDSL.g:7619:1: rule__MonitorToArchitecturalElement__Group_3_1__0__Impl : ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7623:1: ( ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 ) ) )
            // InternalSafetyDSL.g:7624:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 ) )
            {
            // InternalSafetyDSL.g:7624:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 ) )
            // InternalSafetyDSL.g:7625:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_3_1_0()); 
            // InternalSafetyDSL.g:7626:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 )
            // InternalSafetyDSL.g:7626:3: rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__1"
    // InternalSafetyDSL.g:7634:1: rule__MonitorToArchitecturalElement__Group_3_1__1 : rule__MonitorToArchitecturalElement__Group_3_1__1__Impl rule__MonitorToArchitecturalElement__Group_3_1__2 ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7638:1: ( rule__MonitorToArchitecturalElement__Group_3_1__1__Impl rule__MonitorToArchitecturalElement__Group_3_1__2 )
            // InternalSafetyDSL.g:7639:2: rule__MonitorToArchitecturalElement__Group_3_1__1__Impl rule__MonitorToArchitecturalElement__Group_3_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__1__Impl"
    // InternalSafetyDSL.g:7646:1: rule__MonitorToArchitecturalElement__Group_3_1__1__Impl : ( 'restarts' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7650:1: ( ( 'restarts' ) )
            // InternalSafetyDSL.g:7651:1: ( 'restarts' )
            {
            // InternalSafetyDSL.g:7651:1: ( 'restarts' )
            // InternalSafetyDSL.g:7652:2: 'restarts'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getRestartsKeyword_3_1_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getRestartsKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__2"
    // InternalSafetyDSL.g:7661:1: rule__MonitorToArchitecturalElement__Group_3_1__2 : rule__MonitorToArchitecturalElement__Group_3_1__2__Impl rule__MonitorToArchitecturalElement__Group_3_1__3 ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7665:1: ( rule__MonitorToArchitecturalElement__Group_3_1__2__Impl rule__MonitorToArchitecturalElement__Group_3_1__3 )
            // InternalSafetyDSL.g:7666:2: rule__MonitorToArchitecturalElement__Group_3_1__2__Impl rule__MonitorToArchitecturalElement__Group_3_1__3
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__2__Impl"
    // InternalSafetyDSL.g:7673:1: rule__MonitorToArchitecturalElement__Group_3_1__2__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7677:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 ) ) )
            // InternalSafetyDSL.g:7678:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 ) )
            {
            // InternalSafetyDSL.g:7678:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 ) )
            // InternalSafetyDSL.g:7679:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_3_1_2()); 
            // InternalSafetyDSL.g:7680:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 )
            // InternalSafetyDSL.g:7680:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__2__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__3"
    // InternalSafetyDSL.g:7688:1: rule__MonitorToArchitecturalElement__Group_3_1__3 : rule__MonitorToArchitecturalElement__Group_3_1__3__Impl rule__MonitorToArchitecturalElement__Group_3_1__4 ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7692:1: ( rule__MonitorToArchitecturalElement__Group_3_1__3__Impl rule__MonitorToArchitecturalElement__Group_3_1__4 )
            // InternalSafetyDSL.g:7693:2: rule__MonitorToArchitecturalElement__Group_3_1__3__Impl rule__MonitorToArchitecturalElement__Group_3_1__4
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__3"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__3__Impl"
    // InternalSafetyDSL.g:7700:1: rule__MonitorToArchitecturalElement__Group_3_1__3__Impl : ( ( rule__MonitorToArchitecturalElement__Group_3_1_3__0 )* ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7704:1: ( ( ( rule__MonitorToArchitecturalElement__Group_3_1_3__0 )* ) )
            // InternalSafetyDSL.g:7705:1: ( ( rule__MonitorToArchitecturalElement__Group_3_1_3__0 )* )
            {
            // InternalSafetyDSL.g:7705:1: ( ( rule__MonitorToArchitecturalElement__Group_3_1_3__0 )* )
            // InternalSafetyDSL.g:7706:2: ( rule__MonitorToArchitecturalElement__Group_3_1_3__0 )*
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3_1_3()); 
            // InternalSafetyDSL.g:7707:2: ( rule__MonitorToArchitecturalElement__Group_3_1_3__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==27) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSafetyDSL.g:7707:3: rule__MonitorToArchitecturalElement__Group_3_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MonitorToArchitecturalElement__Group_3_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__3__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__4"
    // InternalSafetyDSL.g:7715:1: rule__MonitorToArchitecturalElement__Group_3_1__4 : rule__MonitorToArchitecturalElement__Group_3_1__4__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7719:1: ( rule__MonitorToArchitecturalElement__Group_3_1__4__Impl )
            // InternalSafetyDSL.g:7720:2: rule__MonitorToArchitecturalElement__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__4"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1__4__Impl"
    // InternalSafetyDSL.g:7726:1: rule__MonitorToArchitecturalElement__Group_3_1__4__Impl : ( ';' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7730:1: ( ( ';' ) )
            // InternalSafetyDSL.g:7731:1: ( ';' )
            {
            // InternalSafetyDSL.g:7731:1: ( ';' )
            // InternalSafetyDSL.g:7732:2: ';'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_3_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_3_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1__4__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1_3__0"
    // InternalSafetyDSL.g:7742:1: rule__MonitorToArchitecturalElement__Group_3_1_3__0 : rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_3_1_3__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7746:1: ( rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_3_1_3__1 )
            // InternalSafetyDSL.g:7747:2: rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_3_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1_3__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl"
    // InternalSafetyDSL.g:7754:1: rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7758:1: ( ( ',' ) )
            // InternalSafetyDSL.g:7759:1: ( ',' )
            {
            // InternalSafetyDSL.g:7759:1: ( ',' )
            // InternalSafetyDSL.g:7760:2: ','
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_3_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1_3__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1_3__1"
    // InternalSafetyDSL.g:7769:1: rule__MonitorToArchitecturalElement__Group_3_1_3__1 : rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7773:1: ( rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl )
            // InternalSafetyDSL.g:7774:2: rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1_3__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl"
    // InternalSafetyDSL.g:7780:1: rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7784:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 ) ) )
            // InternalSafetyDSL.g:7785:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 ) )
            {
            // InternalSafetyDSL.g:7785:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 ) )
            // InternalSafetyDSL.g:7786:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_3_1_3_1()); 
            // InternalSafetyDSL.g:7787:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 )
            // InternalSafetyDSL.g:7787:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_3_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_3_1_3__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4__0"
    // InternalSafetyDSL.g:7796:1: rule__MonitorToArchitecturalElement__Group_4__0 : rule__MonitorToArchitecturalElement__Group_4__0__Impl rule__MonitorToArchitecturalElement__Group_4__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7800:1: ( rule__MonitorToArchitecturalElement__Group_4__0__Impl rule__MonitorToArchitecturalElement__Group_4__1 )
            // InternalSafetyDSL.g:7801:2: rule__MonitorToArchitecturalElement__Group_4__0__Impl rule__MonitorToArchitecturalElement__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4__0__Impl"
    // InternalSafetyDSL.g:7808:1: rule__MonitorToArchitecturalElement__Group_4__0__Impl : ( () ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7812:1: ( ( () ) )
            // InternalSafetyDSL.g:7813:1: ( () )
            {
            // InternalSafetyDSL.g:7813:1: ( () )
            // InternalSafetyDSL.g:7814:2: ()
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorsAction_4_0()); 
            // InternalSafetyDSL.g:7815:2: ()
            // InternalSafetyDSL.g:7815:3: 
            {
            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorsAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4__1"
    // InternalSafetyDSL.g:7823:1: rule__MonitorToArchitecturalElement__Group_4__1 : rule__MonitorToArchitecturalElement__Group_4__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7827:1: ( rule__MonitorToArchitecturalElement__Group_4__1__Impl )
            // InternalSafetyDSL.g:7828:2: rule__MonitorToArchitecturalElement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4__1__Impl"
    // InternalSafetyDSL.g:7834:1: rule__MonitorToArchitecturalElement__Group_4__1__Impl : ( ( rule__MonitorToArchitecturalElement__Group_4_1__0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7838:1: ( ( ( rule__MonitorToArchitecturalElement__Group_4_1__0 ) ) )
            // InternalSafetyDSL.g:7839:1: ( ( rule__MonitorToArchitecturalElement__Group_4_1__0 ) )
            {
            // InternalSafetyDSL.g:7839:1: ( ( rule__MonitorToArchitecturalElement__Group_4_1__0 ) )
            // InternalSafetyDSL.g:7840:2: ( rule__MonitorToArchitecturalElement__Group_4_1__0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4_1()); 
            // InternalSafetyDSL.g:7841:2: ( rule__MonitorToArchitecturalElement__Group_4_1__0 )
            // InternalSafetyDSL.g:7841:3: rule__MonitorToArchitecturalElement__Group_4_1__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__0"
    // InternalSafetyDSL.g:7850:1: rule__MonitorToArchitecturalElement__Group_4_1__0 : rule__MonitorToArchitecturalElement__Group_4_1__0__Impl rule__MonitorToArchitecturalElement__Group_4_1__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7854:1: ( rule__MonitorToArchitecturalElement__Group_4_1__0__Impl rule__MonitorToArchitecturalElement__Group_4_1__1 )
            // InternalSafetyDSL.g:7855:2: rule__MonitorToArchitecturalElement__Group_4_1__0__Impl rule__MonitorToArchitecturalElement__Group_4_1__1
            {
            pushFollow(FOLLOW_58);
            rule__MonitorToArchitecturalElement__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__0__Impl"
    // InternalSafetyDSL.g:7862:1: rule__MonitorToArchitecturalElement__Group_4_1__0__Impl : ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7866:1: ( ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 ) ) )
            // InternalSafetyDSL.g:7867:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 ) )
            {
            // InternalSafetyDSL.g:7867:1: ( ( rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 ) )
            // InternalSafetyDSL.g:7868:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_4_1_0()); 
            // InternalSafetyDSL.g:7869:2: ( rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 )
            // InternalSafetyDSL.g:7869:3: rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__1"
    // InternalSafetyDSL.g:7877:1: rule__MonitorToArchitecturalElement__Group_4_1__1 : rule__MonitorToArchitecturalElement__Group_4_1__1__Impl rule__MonitorToArchitecturalElement__Group_4_1__2 ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7881:1: ( rule__MonitorToArchitecturalElement__Group_4_1__1__Impl rule__MonitorToArchitecturalElement__Group_4_1__2 )
            // InternalSafetyDSL.g:7882:2: rule__MonitorToArchitecturalElement__Group_4_1__1__Impl rule__MonitorToArchitecturalElement__Group_4_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__1__Impl"
    // InternalSafetyDSL.g:7889:1: rule__MonitorToArchitecturalElement__Group_4_1__1__Impl : ( 'monitors' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7893:1: ( ( 'monitors' ) )
            // InternalSafetyDSL.g:7894:1: ( 'monitors' )
            {
            // InternalSafetyDSL.g:7894:1: ( 'monitors' )
            // InternalSafetyDSL.g:7895:2: 'monitors'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorsKeyword_4_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorsKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__1__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__2"
    // InternalSafetyDSL.g:7904:1: rule__MonitorToArchitecturalElement__Group_4_1__2 : rule__MonitorToArchitecturalElement__Group_4_1__2__Impl rule__MonitorToArchitecturalElement__Group_4_1__3 ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7908:1: ( rule__MonitorToArchitecturalElement__Group_4_1__2__Impl rule__MonitorToArchitecturalElement__Group_4_1__3 )
            // InternalSafetyDSL.g:7909:2: rule__MonitorToArchitecturalElement__Group_4_1__2__Impl rule__MonitorToArchitecturalElement__Group_4_1__3
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__2__Impl"
    // InternalSafetyDSL.g:7916:1: rule__MonitorToArchitecturalElement__Group_4_1__2__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7920:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 ) ) )
            // InternalSafetyDSL.g:7921:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 ) )
            {
            // InternalSafetyDSL.g:7921:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 ) )
            // InternalSafetyDSL.g:7922:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_4_1_2()); 
            // InternalSafetyDSL.g:7923:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 )
            // InternalSafetyDSL.g:7923:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__2__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__3"
    // InternalSafetyDSL.g:7931:1: rule__MonitorToArchitecturalElement__Group_4_1__3 : rule__MonitorToArchitecturalElement__Group_4_1__3__Impl rule__MonitorToArchitecturalElement__Group_4_1__4 ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7935:1: ( rule__MonitorToArchitecturalElement__Group_4_1__3__Impl rule__MonitorToArchitecturalElement__Group_4_1__4 )
            // InternalSafetyDSL.g:7936:2: rule__MonitorToArchitecturalElement__Group_4_1__3__Impl rule__MonitorToArchitecturalElement__Group_4_1__4
            {
            pushFollow(FOLLOW_25);
            rule__MonitorToArchitecturalElement__Group_4_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__3"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__3__Impl"
    // InternalSafetyDSL.g:7943:1: rule__MonitorToArchitecturalElement__Group_4_1__3__Impl : ( ( rule__MonitorToArchitecturalElement__Group_4_1_3__0 )* ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7947:1: ( ( ( rule__MonitorToArchitecturalElement__Group_4_1_3__0 )* ) )
            // InternalSafetyDSL.g:7948:1: ( ( rule__MonitorToArchitecturalElement__Group_4_1_3__0 )* )
            {
            // InternalSafetyDSL.g:7948:1: ( ( rule__MonitorToArchitecturalElement__Group_4_1_3__0 )* )
            // InternalSafetyDSL.g:7949:2: ( rule__MonitorToArchitecturalElement__Group_4_1_3__0 )*
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4_1_3()); 
            // InternalSafetyDSL.g:7950:2: ( rule__MonitorToArchitecturalElement__Group_4_1_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSafetyDSL.g:7950:3: rule__MonitorToArchitecturalElement__Group_4_1_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MonitorToArchitecturalElement__Group_4_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__3__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__4"
    // InternalSafetyDSL.g:7958:1: rule__MonitorToArchitecturalElement__Group_4_1__4 : rule__MonitorToArchitecturalElement__Group_4_1__4__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7962:1: ( rule__MonitorToArchitecturalElement__Group_4_1__4__Impl )
            // InternalSafetyDSL.g:7963:2: rule__MonitorToArchitecturalElement__Group_4_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__4"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1__4__Impl"
    // InternalSafetyDSL.g:7969:1: rule__MonitorToArchitecturalElement__Group_4_1__4__Impl : ( ';' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7973:1: ( ( ';' ) )
            // InternalSafetyDSL.g:7974:1: ( ';' )
            {
            // InternalSafetyDSL.g:7974:1: ( ';' )
            // InternalSafetyDSL.g:7975:2: ';'
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_4_1_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_4_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1__4__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1_3__0"
    // InternalSafetyDSL.g:7985:1: rule__MonitorToArchitecturalElement__Group_4_1_3__0 : rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_4_1_3__1 ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:7989:1: ( rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_4_1_3__1 )
            // InternalSafetyDSL.g:7990:2: rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl rule__MonitorToArchitecturalElement__Group_4_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1_3__0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl"
    // InternalSafetyDSL.g:7997:1: rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl : ( ',' ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8001:1: ( ( ',' ) )
            // InternalSafetyDSL.g:8002:1: ( ',' )
            {
            // InternalSafetyDSL.g:8002:1: ( ',' )
            // InternalSafetyDSL.g:8003:2: ','
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_4_1_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_4_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1_3__0__Impl"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1_3__1"
    // InternalSafetyDSL.g:8012:1: rule__MonitorToArchitecturalElement__Group_4_1_3__1 : rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8016:1: ( rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl )
            // InternalSafetyDSL.g:8017:2: rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1_3__1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl"
    // InternalSafetyDSL.g:8023:1: rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl : ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 ) ) ;
    public final void rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8027:1: ( ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 ) ) )
            // InternalSafetyDSL.g:8028:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 ) )
            {
            // InternalSafetyDSL.g:8028:1: ( ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 ) )
            // InternalSafetyDSL.g:8029:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_4_1_3_1()); 
            // InternalSafetyDSL.g:8030:2: ( rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 )
            // InternalSafetyDSL.g:8030:3: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_4_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__Group_4_1_3__1__Impl"


    // $ANTLR start "rule__ReportsFault__Group__0"
    // InternalSafetyDSL.g:8039:1: rule__ReportsFault__Group__0 : rule__ReportsFault__Group__0__Impl rule__ReportsFault__Group__1 ;
    public final void rule__ReportsFault__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8043:1: ( rule__ReportsFault__Group__0__Impl rule__ReportsFault__Group__1 )
            // InternalSafetyDSL.g:8044:2: rule__ReportsFault__Group__0__Impl rule__ReportsFault__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__ReportsFault__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__0"


    // $ANTLR start "rule__ReportsFault__Group__0__Impl"
    // InternalSafetyDSL.g:8051:1: rule__ReportsFault__Group__0__Impl : ( ( rule__ReportsFault__SafetyCritical1Assignment_0 ) ) ;
    public final void rule__ReportsFault__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8055:1: ( ( ( rule__ReportsFault__SafetyCritical1Assignment_0 ) ) )
            // InternalSafetyDSL.g:8056:1: ( ( rule__ReportsFault__SafetyCritical1Assignment_0 ) )
            {
            // InternalSafetyDSL.g:8056:1: ( ( rule__ReportsFault__SafetyCritical1Assignment_0 ) )
            // InternalSafetyDSL.g:8057:2: ( rule__ReportsFault__SafetyCritical1Assignment_0 )
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical1Assignment_0()); 
            // InternalSafetyDSL.g:8058:2: ( rule__ReportsFault__SafetyCritical1Assignment_0 )
            // InternalSafetyDSL.g:8058:3: rule__ReportsFault__SafetyCritical1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReportsFault__SafetyCritical1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReportsFaultAccess().getSafetyCritical1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__0__Impl"


    // $ANTLR start "rule__ReportsFault__Group__1"
    // InternalSafetyDSL.g:8066:1: rule__ReportsFault__Group__1 : rule__ReportsFault__Group__1__Impl rule__ReportsFault__Group__2 ;
    public final void rule__ReportsFault__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8070:1: ( rule__ReportsFault__Group__1__Impl rule__ReportsFault__Group__2 )
            // InternalSafetyDSL.g:8071:2: rule__ReportsFault__Group__1__Impl rule__ReportsFault__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReportsFault__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__1"


    // $ANTLR start "rule__ReportsFault__Group__1__Impl"
    // InternalSafetyDSL.g:8078:1: rule__ReportsFault__Group__1__Impl : ( 'reportsFault' ) ;
    public final void rule__ReportsFault__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8082:1: ( ( 'reportsFault' ) )
            // InternalSafetyDSL.g:8083:1: ( 'reportsFault' )
            {
            // InternalSafetyDSL.g:8083:1: ( 'reportsFault' )
            // InternalSafetyDSL.g:8084:2: 'reportsFault'
            {
             before(grammarAccess.getReportsFaultAccess().getReportsFaultKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getReportsFaultAccess().getReportsFaultKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__1__Impl"


    // $ANTLR start "rule__ReportsFault__Group__2"
    // InternalSafetyDSL.g:8093:1: rule__ReportsFault__Group__2 : rule__ReportsFault__Group__2__Impl rule__ReportsFault__Group__3 ;
    public final void rule__ReportsFault__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8097:1: ( rule__ReportsFault__Group__2__Impl rule__ReportsFault__Group__3 )
            // InternalSafetyDSL.g:8098:2: rule__ReportsFault__Group__2__Impl rule__ReportsFault__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ReportsFault__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__2"


    // $ANTLR start "rule__ReportsFault__Group__2__Impl"
    // InternalSafetyDSL.g:8105:1: rule__ReportsFault__Group__2__Impl : ( ( rule__ReportsFault__SafetyCritical2Assignment_2 ) ) ;
    public final void rule__ReportsFault__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8109:1: ( ( ( rule__ReportsFault__SafetyCritical2Assignment_2 ) ) )
            // InternalSafetyDSL.g:8110:1: ( ( rule__ReportsFault__SafetyCritical2Assignment_2 ) )
            {
            // InternalSafetyDSL.g:8110:1: ( ( rule__ReportsFault__SafetyCritical2Assignment_2 ) )
            // InternalSafetyDSL.g:8111:2: ( rule__ReportsFault__SafetyCritical2Assignment_2 )
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical2Assignment_2()); 
            // InternalSafetyDSL.g:8112:2: ( rule__ReportsFault__SafetyCritical2Assignment_2 )
            // InternalSafetyDSL.g:8112:3: rule__ReportsFault__SafetyCritical2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReportsFault__SafetyCritical2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReportsFaultAccess().getSafetyCritical2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__2__Impl"


    // $ANTLR start "rule__ReportsFault__Group__3"
    // InternalSafetyDSL.g:8120:1: rule__ReportsFault__Group__3 : rule__ReportsFault__Group__3__Impl rule__ReportsFault__Group__4 ;
    public final void rule__ReportsFault__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8124:1: ( rule__ReportsFault__Group__3__Impl rule__ReportsFault__Group__4 )
            // InternalSafetyDSL.g:8125:2: rule__ReportsFault__Group__3__Impl rule__ReportsFault__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ReportsFault__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__3"


    // $ANTLR start "rule__ReportsFault__Group__3__Impl"
    // InternalSafetyDSL.g:8132:1: rule__ReportsFault__Group__3__Impl : ( ( rule__ReportsFault__Group_3__0 )* ) ;
    public final void rule__ReportsFault__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8136:1: ( ( ( rule__ReportsFault__Group_3__0 )* ) )
            // InternalSafetyDSL.g:8137:1: ( ( rule__ReportsFault__Group_3__0 )* )
            {
            // InternalSafetyDSL.g:8137:1: ( ( rule__ReportsFault__Group_3__0 )* )
            // InternalSafetyDSL.g:8138:2: ( rule__ReportsFault__Group_3__0 )*
            {
             before(grammarAccess.getReportsFaultAccess().getGroup_3()); 
            // InternalSafetyDSL.g:8139:2: ( rule__ReportsFault__Group_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSafetyDSL.g:8139:3: rule__ReportsFault__Group_3__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ReportsFault__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getReportsFaultAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__3__Impl"


    // $ANTLR start "rule__ReportsFault__Group__4"
    // InternalSafetyDSL.g:8147:1: rule__ReportsFault__Group__4 : rule__ReportsFault__Group__4__Impl ;
    public final void rule__ReportsFault__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8151:1: ( rule__ReportsFault__Group__4__Impl )
            // InternalSafetyDSL.g:8152:2: rule__ReportsFault__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__4"


    // $ANTLR start "rule__ReportsFault__Group__4__Impl"
    // InternalSafetyDSL.g:8158:1: rule__ReportsFault__Group__4__Impl : ( ';' ) ;
    public final void rule__ReportsFault__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8162:1: ( ( ';' ) )
            // InternalSafetyDSL.g:8163:1: ( ';' )
            {
            // InternalSafetyDSL.g:8163:1: ( ';' )
            // InternalSafetyDSL.g:8164:2: ';'
            {
             before(grammarAccess.getReportsFaultAccess().getSemicolonKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getReportsFaultAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group__4__Impl"


    // $ANTLR start "rule__ReportsFault__Group_3__0"
    // InternalSafetyDSL.g:8174:1: rule__ReportsFault__Group_3__0 : rule__ReportsFault__Group_3__0__Impl rule__ReportsFault__Group_3__1 ;
    public final void rule__ReportsFault__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8178:1: ( rule__ReportsFault__Group_3__0__Impl rule__ReportsFault__Group_3__1 )
            // InternalSafetyDSL.g:8179:2: rule__ReportsFault__Group_3__0__Impl rule__ReportsFault__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ReportsFault__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group_3__0"


    // $ANTLR start "rule__ReportsFault__Group_3__0__Impl"
    // InternalSafetyDSL.g:8186:1: rule__ReportsFault__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ReportsFault__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8190:1: ( ( ',' ) )
            // InternalSafetyDSL.g:8191:1: ( ',' )
            {
            // InternalSafetyDSL.g:8191:1: ( ',' )
            // InternalSafetyDSL.g:8192:2: ','
            {
             before(grammarAccess.getReportsFaultAccess().getCommaKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReportsFaultAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group_3__0__Impl"


    // $ANTLR start "rule__ReportsFault__Group_3__1"
    // InternalSafetyDSL.g:8201:1: rule__ReportsFault__Group_3__1 : rule__ReportsFault__Group_3__1__Impl ;
    public final void rule__ReportsFault__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8205:1: ( rule__ReportsFault__Group_3__1__Impl )
            // InternalSafetyDSL.g:8206:2: rule__ReportsFault__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportsFault__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group_3__1"


    // $ANTLR start "rule__ReportsFault__Group_3__1__Impl"
    // InternalSafetyDSL.g:8212:1: rule__ReportsFault__Group_3__1__Impl : ( ( rule__ReportsFault__SafetyCritical2Assignment_3_1 ) ) ;
    public final void rule__ReportsFault__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8216:1: ( ( ( rule__ReportsFault__SafetyCritical2Assignment_3_1 ) ) )
            // InternalSafetyDSL.g:8217:1: ( ( rule__ReportsFault__SafetyCritical2Assignment_3_1 ) )
            {
            // InternalSafetyDSL.g:8217:1: ( ( rule__ReportsFault__SafetyCritical2Assignment_3_1 ) )
            // InternalSafetyDSL.g:8218:2: ( rule__ReportsFault__SafetyCritical2Assignment_3_1 )
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical2Assignment_3_1()); 
            // InternalSafetyDSL.g:8219:2: ( rule__ReportsFault__SafetyCritical2Assignment_3_1 )
            // InternalSafetyDSL.g:8219:3: rule__ReportsFault__SafetyCritical2Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ReportsFault__SafetyCritical2Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReportsFaultAccess().getSafetyCritical2Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__Group_3__1__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__0"
    // InternalSafetyDSL.g:8228:1: rule__ImplementationDetail__Group__0 : rule__ImplementationDetail__Group__0__Impl rule__ImplementationDetail__Group__1 ;
    public final void rule__ImplementationDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8232:1: ( rule__ImplementationDetail__Group__0__Impl rule__ImplementationDetail__Group__1 )
            // InternalSafetyDSL.g:8233:2: rule__ImplementationDetail__Group__0__Impl rule__ImplementationDetail__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__ImplementationDetail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__0"


    // $ANTLR start "rule__ImplementationDetail__Group__0__Impl"
    // InternalSafetyDSL.g:8240:1: rule__ImplementationDetail__Group__0__Impl : ( 'ImplementationRelations {' ) ;
    public final void rule__ImplementationDetail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8244:1: ( ( 'ImplementationRelations {' ) )
            // InternalSafetyDSL.g:8245:1: ( 'ImplementationRelations {' )
            {
            // InternalSafetyDSL.g:8245:1: ( 'ImplementationRelations {' )
            // InternalSafetyDSL.g:8246:2: 'ImplementationRelations {'
            {
             before(grammarAccess.getImplementationDetailAccess().getImplementationRelationsKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getImplementationRelationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__0__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__1"
    // InternalSafetyDSL.g:8255:1: rule__ImplementationDetail__Group__1 : rule__ImplementationDetail__Group__1__Impl rule__ImplementationDetail__Group__2 ;
    public final void rule__ImplementationDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8259:1: ( rule__ImplementationDetail__Group__1__Impl rule__ImplementationDetail__Group__2 )
            // InternalSafetyDSL.g:8260:2: rule__ImplementationDetail__Group__1__Impl rule__ImplementationDetail__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ImplementationDetail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__1"


    // $ANTLR start "rule__ImplementationDetail__Group__1__Impl"
    // InternalSafetyDSL.g:8267:1: rule__ImplementationDetail__Group__1__Impl : ( 'Module-Class Relations' ) ;
    public final void rule__ImplementationDetail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8271:1: ( ( 'Module-Class Relations' ) )
            // InternalSafetyDSL.g:8272:1: ( 'Module-Class Relations' )
            {
            // InternalSafetyDSL.g:8272:1: ( 'Module-Class Relations' )
            // InternalSafetyDSL.g:8273:2: 'Module-Class Relations'
            {
             before(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__1__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__2"
    // InternalSafetyDSL.g:8282:1: rule__ImplementationDetail__Group__2 : rule__ImplementationDetail__Group__2__Impl rule__ImplementationDetail__Group__3 ;
    public final void rule__ImplementationDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8286:1: ( rule__ImplementationDetail__Group__2__Impl rule__ImplementationDetail__Group__3 )
            // InternalSafetyDSL.g:8287:2: rule__ImplementationDetail__Group__2__Impl rule__ImplementationDetail__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ImplementationDetail__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__2"


    // $ANTLR start "rule__ImplementationDetail__Group__2__Impl"
    // InternalSafetyDSL.g:8294:1: rule__ImplementationDetail__Group__2__Impl : ( '{' ) ;
    public final void rule__ImplementationDetail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8298:1: ( ( '{' ) )
            // InternalSafetyDSL.g:8299:1: ( '{' )
            {
            // InternalSafetyDSL.g:8299:1: ( '{' )
            // InternalSafetyDSL.g:8300:2: '{'
            {
             before(grammarAccess.getImplementationDetailAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__2__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__3"
    // InternalSafetyDSL.g:8309:1: rule__ImplementationDetail__Group__3 : rule__ImplementationDetail__Group__3__Impl rule__ImplementationDetail__Group__4 ;
    public final void rule__ImplementationDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8313:1: ( rule__ImplementationDetail__Group__3__Impl rule__ImplementationDetail__Group__4 )
            // InternalSafetyDSL.g:8314:2: rule__ImplementationDetail__Group__3__Impl rule__ImplementationDetail__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ImplementationDetail__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__3"


    // $ANTLR start "rule__ImplementationDetail__Group__3__Impl"
    // InternalSafetyDSL.g:8321:1: rule__ImplementationDetail__Group__3__Impl : ( ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 ) ) ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )* ) ) ;
    public final void rule__ImplementationDetail__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8325:1: ( ( ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 ) ) ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )* ) ) )
            // InternalSafetyDSL.g:8326:1: ( ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 ) ) ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )* ) )
            {
            // InternalSafetyDSL.g:8326:1: ( ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 ) ) ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )* ) )
            // InternalSafetyDSL.g:8327:2: ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 ) ) ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )* )
            {
            // InternalSafetyDSL.g:8327:2: ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 ) )
            // InternalSafetyDSL.g:8328:3: ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )
            {
             before(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsAssignment_3()); 
            // InternalSafetyDSL.g:8329:3: ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )
            // InternalSafetyDSL.g:8329:4: rule__ImplementationDetail__ModuleClassRelationsAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__ImplementationDetail__ModuleClassRelationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsAssignment_3()); 

            }

            // InternalSafetyDSL.g:8332:2: ( ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )* )
            // InternalSafetyDSL.g:8333:3: ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )*
            {
             before(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsAssignment_3()); 
            // InternalSafetyDSL.g:8334:3: ( rule__ImplementationDetail__ModuleClassRelationsAssignment_3 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSafetyDSL.g:8334:4: rule__ImplementationDetail__ModuleClassRelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ImplementationDetail__ModuleClassRelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__3__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__4"
    // InternalSafetyDSL.g:8343:1: rule__ImplementationDetail__Group__4 : rule__ImplementationDetail__Group__4__Impl rule__ImplementationDetail__Group__5 ;
    public final void rule__ImplementationDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8347:1: ( rule__ImplementationDetail__Group__4__Impl rule__ImplementationDetail__Group__5 )
            // InternalSafetyDSL.g:8348:2: rule__ImplementationDetail__Group__4__Impl rule__ImplementationDetail__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ImplementationDetail__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__4"


    // $ANTLR start "rule__ImplementationDetail__Group__4__Impl"
    // InternalSafetyDSL.g:8355:1: rule__ImplementationDetail__Group__4__Impl : ( '}' ) ;
    public final void rule__ImplementationDetail__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8359:1: ( ( '}' ) )
            // InternalSafetyDSL.g:8360:1: ( '}' )
            {
            // InternalSafetyDSL.g:8360:1: ( '}' )
            // InternalSafetyDSL.g:8361:2: '}'
            {
             before(grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__4__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__5"
    // InternalSafetyDSL.g:8370:1: rule__ImplementationDetail__Group__5 : rule__ImplementationDetail__Group__5__Impl rule__ImplementationDetail__Group__6 ;
    public final void rule__ImplementationDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8374:1: ( rule__ImplementationDetail__Group__5__Impl rule__ImplementationDetail__Group__6 )
            // InternalSafetyDSL.g:8375:2: rule__ImplementationDetail__Group__5__Impl rule__ImplementationDetail__Group__6
            {
            pushFollow(FOLLOW_61);
            rule__ImplementationDetail__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__5"


    // $ANTLR start "rule__ImplementationDetail__Group__5__Impl"
    // InternalSafetyDSL.g:8382:1: rule__ImplementationDetail__Group__5__Impl : ( ';' ) ;
    public final void rule__ImplementationDetail__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8386:1: ( ( ';' ) )
            // InternalSafetyDSL.g:8387:1: ( ';' )
            {
            // InternalSafetyDSL.g:8387:1: ( ';' )
            // InternalSafetyDSL.g:8388:2: ';'
            {
             before(grammarAccess.getImplementationDetailAccess().getSemicolonKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__5__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__6"
    // InternalSafetyDSL.g:8397:1: rule__ImplementationDetail__Group__6 : rule__ImplementationDetail__Group__6__Impl rule__ImplementationDetail__Group__7 ;
    public final void rule__ImplementationDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8401:1: ( rule__ImplementationDetail__Group__6__Impl rule__ImplementationDetail__Group__7 )
            // InternalSafetyDSL.g:8402:2: rule__ImplementationDetail__Group__6__Impl rule__ImplementationDetail__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ImplementationDetail__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__6"


    // $ANTLR start "rule__ImplementationDetail__Group__6__Impl"
    // InternalSafetyDSL.g:8409:1: rule__ImplementationDetail__Group__6__Impl : ( 'Class-Test Case Relations' ) ;
    public final void rule__ImplementationDetail__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8413:1: ( ( 'Class-Test Case Relations' ) )
            // InternalSafetyDSL.g:8414:1: ( 'Class-Test Case Relations' )
            {
            // InternalSafetyDSL.g:8414:1: ( 'Class-Test Case Relations' )
            // InternalSafetyDSL.g:8415:2: 'Class-Test Case Relations'
            {
             before(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsKeyword_6()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__6__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__7"
    // InternalSafetyDSL.g:8424:1: rule__ImplementationDetail__Group__7 : rule__ImplementationDetail__Group__7__Impl rule__ImplementationDetail__Group__8 ;
    public final void rule__ImplementationDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8428:1: ( rule__ImplementationDetail__Group__7__Impl rule__ImplementationDetail__Group__8 )
            // InternalSafetyDSL.g:8429:2: rule__ImplementationDetail__Group__7__Impl rule__ImplementationDetail__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__ImplementationDetail__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__7"


    // $ANTLR start "rule__ImplementationDetail__Group__7__Impl"
    // InternalSafetyDSL.g:8436:1: rule__ImplementationDetail__Group__7__Impl : ( '{' ) ;
    public final void rule__ImplementationDetail__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8440:1: ( ( '{' ) )
            // InternalSafetyDSL.g:8441:1: ( '{' )
            {
            // InternalSafetyDSL.g:8441:1: ( '{' )
            // InternalSafetyDSL.g:8442:2: '{'
            {
             before(grammarAccess.getImplementationDetailAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__7__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__8"
    // InternalSafetyDSL.g:8451:1: rule__ImplementationDetail__Group__8 : rule__ImplementationDetail__Group__8__Impl rule__ImplementationDetail__Group__9 ;
    public final void rule__ImplementationDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8455:1: ( rule__ImplementationDetail__Group__8__Impl rule__ImplementationDetail__Group__9 )
            // InternalSafetyDSL.g:8456:2: rule__ImplementationDetail__Group__8__Impl rule__ImplementationDetail__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__ImplementationDetail__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__8"


    // $ANTLR start "rule__ImplementationDetail__Group__8__Impl"
    // InternalSafetyDSL.g:8463:1: rule__ImplementationDetail__Group__8__Impl : ( ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 ) ) ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )* ) ) ;
    public final void rule__ImplementationDetail__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8467:1: ( ( ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 ) ) ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )* ) ) )
            // InternalSafetyDSL.g:8468:1: ( ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 ) ) ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )* ) )
            {
            // InternalSafetyDSL.g:8468:1: ( ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 ) ) ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )* ) )
            // InternalSafetyDSL.g:8469:2: ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 ) ) ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )* )
            {
            // InternalSafetyDSL.g:8469:2: ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 ) )
            // InternalSafetyDSL.g:8470:3: ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )
            {
             before(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsAssignment_8()); 
            // InternalSafetyDSL.g:8471:3: ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )
            // InternalSafetyDSL.g:8471:4: rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8
            {
            pushFollow(FOLLOW_12);
            rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsAssignment_8()); 

            }

            // InternalSafetyDSL.g:8474:2: ( ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )* )
            // InternalSafetyDSL.g:8475:3: ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )*
            {
             before(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsAssignment_8()); 
            // InternalSafetyDSL.g:8476:3: ( rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSafetyDSL.g:8476:4: rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__8__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__9"
    // InternalSafetyDSL.g:8485:1: rule__ImplementationDetail__Group__9 : rule__ImplementationDetail__Group__9__Impl rule__ImplementationDetail__Group__10 ;
    public final void rule__ImplementationDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8489:1: ( rule__ImplementationDetail__Group__9__Impl rule__ImplementationDetail__Group__10 )
            // InternalSafetyDSL.g:8490:2: rule__ImplementationDetail__Group__9__Impl rule__ImplementationDetail__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__ImplementationDetail__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__9"


    // $ANTLR start "rule__ImplementationDetail__Group__9__Impl"
    // InternalSafetyDSL.g:8497:1: rule__ImplementationDetail__Group__9__Impl : ( '}' ) ;
    public final void rule__ImplementationDetail__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8501:1: ( ( '}' ) )
            // InternalSafetyDSL.g:8502:1: ( '}' )
            {
            // InternalSafetyDSL.g:8502:1: ( '}' )
            // InternalSafetyDSL.g:8503:2: '}'
            {
             before(grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__9__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__10"
    // InternalSafetyDSL.g:8512:1: rule__ImplementationDetail__Group__10 : rule__ImplementationDetail__Group__10__Impl rule__ImplementationDetail__Group__11 ;
    public final void rule__ImplementationDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8516:1: ( rule__ImplementationDetail__Group__10__Impl rule__ImplementationDetail__Group__11 )
            // InternalSafetyDSL.g:8517:2: rule__ImplementationDetail__Group__10__Impl rule__ImplementationDetail__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__ImplementationDetail__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__10"


    // $ANTLR start "rule__ImplementationDetail__Group__10__Impl"
    // InternalSafetyDSL.g:8524:1: rule__ImplementationDetail__Group__10__Impl : ( ';' ) ;
    public final void rule__ImplementationDetail__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8528:1: ( ( ';' ) )
            // InternalSafetyDSL.g:8529:1: ( ';' )
            {
            // InternalSafetyDSL.g:8529:1: ( ';' )
            // InternalSafetyDSL.g:8530:2: ';'
            {
             before(grammarAccess.getImplementationDetailAccess().getSemicolonKeyword_10()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__10__Impl"


    // $ANTLR start "rule__ImplementationDetail__Group__11"
    // InternalSafetyDSL.g:8539:1: rule__ImplementationDetail__Group__11 : rule__ImplementationDetail__Group__11__Impl ;
    public final void rule__ImplementationDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8543:1: ( rule__ImplementationDetail__Group__11__Impl )
            // InternalSafetyDSL.g:8544:2: rule__ImplementationDetail__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplementationDetail__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__11"


    // $ANTLR start "rule__ImplementationDetail__Group__11__Impl"
    // InternalSafetyDSL.g:8550:1: rule__ImplementationDetail__Group__11__Impl : ( '}' ) ;
    public final void rule__ImplementationDetail__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8554:1: ( ( '}' ) )
            // InternalSafetyDSL.g:8555:1: ( '}' )
            {
            // InternalSafetyDSL.g:8555:1: ( '}' )
            // InternalSafetyDSL.g:8556:2: '}'
            {
             before(grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__Group__11__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__0"
    // InternalSafetyDSL.g:8566:1: rule__ModuleClassRelation__Group__0 : rule__ModuleClassRelation__Group__0__Impl rule__ModuleClassRelation__Group__1 ;
    public final void rule__ModuleClassRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8570:1: ( rule__ModuleClassRelation__Group__0__Impl rule__ModuleClassRelation__Group__1 )
            // InternalSafetyDSL.g:8571:2: rule__ModuleClassRelation__Group__0__Impl rule__ModuleClassRelation__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__ModuleClassRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__0"


    // $ANTLR start "rule__ModuleClassRelation__Group__0__Impl"
    // InternalSafetyDSL.g:8578:1: rule__ModuleClassRelation__Group__0__Impl : ( ( rule__ModuleClassRelation__ModuleAssignment_0 ) ) ;
    public final void rule__ModuleClassRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8582:1: ( ( ( rule__ModuleClassRelation__ModuleAssignment_0 ) ) )
            // InternalSafetyDSL.g:8583:1: ( ( rule__ModuleClassRelation__ModuleAssignment_0 ) )
            {
            // InternalSafetyDSL.g:8583:1: ( ( rule__ModuleClassRelation__ModuleAssignment_0 ) )
            // InternalSafetyDSL.g:8584:2: ( rule__ModuleClassRelation__ModuleAssignment_0 )
            {
             before(grammarAccess.getModuleClassRelationAccess().getModuleAssignment_0()); 
            // InternalSafetyDSL.g:8585:2: ( rule__ModuleClassRelation__ModuleAssignment_0 )
            // InternalSafetyDSL.g:8585:3: rule__ModuleClassRelation__ModuleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__ModuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleClassRelationAccess().getModuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__0__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__1"
    // InternalSafetyDSL.g:8593:1: rule__ModuleClassRelation__Group__1 : rule__ModuleClassRelation__Group__1__Impl rule__ModuleClassRelation__Group__2 ;
    public final void rule__ModuleClassRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8597:1: ( rule__ModuleClassRelation__Group__1__Impl rule__ModuleClassRelation__Group__2 )
            // InternalSafetyDSL.g:8598:2: rule__ModuleClassRelation__Group__1__Impl rule__ModuleClassRelation__Group__2
            {
            pushFollow(FOLLOW_63);
            rule__ModuleClassRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__1"


    // $ANTLR start "rule__ModuleClassRelation__Group__1__Impl"
    // InternalSafetyDSL.g:8605:1: rule__ModuleClassRelation__Group__1__Impl : ( 'composesOf' ) ;
    public final void rule__ModuleClassRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8609:1: ( ( 'composesOf' ) )
            // InternalSafetyDSL.g:8610:1: ( 'composesOf' )
            {
            // InternalSafetyDSL.g:8610:1: ( 'composesOf' )
            // InternalSafetyDSL.g:8611:2: 'composesOf'
            {
             before(grammarAccess.getModuleClassRelationAccess().getComposesOfKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getComposesOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__1__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__2"
    // InternalSafetyDSL.g:8620:1: rule__ModuleClassRelation__Group__2 : rule__ModuleClassRelation__Group__2__Impl rule__ModuleClassRelation__Group__3 ;
    public final void rule__ModuleClassRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8624:1: ( rule__ModuleClassRelation__Group__2__Impl rule__ModuleClassRelation__Group__3 )
            // InternalSafetyDSL.g:8625:2: rule__ModuleClassRelation__Group__2__Impl rule__ModuleClassRelation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ModuleClassRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__2"


    // $ANTLR start "rule__ModuleClassRelation__Group__2__Impl"
    // InternalSafetyDSL.g:8632:1: rule__ModuleClassRelation__Group__2__Impl : ( '=' ) ;
    public final void rule__ModuleClassRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8636:1: ( ( '=' ) )
            // InternalSafetyDSL.g:8637:1: ( '=' )
            {
            // InternalSafetyDSL.g:8637:1: ( '=' )
            // InternalSafetyDSL.g:8638:2: '='
            {
             before(grammarAccess.getModuleClassRelationAccess().getEqualsSignKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__2__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__3"
    // InternalSafetyDSL.g:8647:1: rule__ModuleClassRelation__Group__3 : rule__ModuleClassRelation__Group__3__Impl rule__ModuleClassRelation__Group__4 ;
    public final void rule__ModuleClassRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8651:1: ( rule__ModuleClassRelation__Group__3__Impl rule__ModuleClassRelation__Group__4 )
            // InternalSafetyDSL.g:8652:2: rule__ModuleClassRelation__Group__3__Impl rule__ModuleClassRelation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ModuleClassRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__3"


    // $ANTLR start "rule__ModuleClassRelation__Group__3__Impl"
    // InternalSafetyDSL.g:8659:1: rule__ModuleClassRelation__Group__3__Impl : ( '{' ) ;
    public final void rule__ModuleClassRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8663:1: ( ( '{' ) )
            // InternalSafetyDSL.g:8664:1: ( '{' )
            {
            // InternalSafetyDSL.g:8664:1: ( '{' )
            // InternalSafetyDSL.g:8665:2: '{'
            {
             before(grammarAccess.getModuleClassRelationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__3__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__4"
    // InternalSafetyDSL.g:8674:1: rule__ModuleClassRelation__Group__4 : rule__ModuleClassRelation__Group__4__Impl rule__ModuleClassRelation__Group__5 ;
    public final void rule__ModuleClassRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8678:1: ( rule__ModuleClassRelation__Group__4__Impl rule__ModuleClassRelation__Group__5 )
            // InternalSafetyDSL.g:8679:2: rule__ModuleClassRelation__Group__4__Impl rule__ModuleClassRelation__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__ModuleClassRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__4"


    // $ANTLR start "rule__ModuleClassRelation__Group__4__Impl"
    // InternalSafetyDSL.g:8686:1: rule__ModuleClassRelation__Group__4__Impl : ( ( rule__ModuleClassRelation__ClassesAssignment_4 ) ) ;
    public final void rule__ModuleClassRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8690:1: ( ( ( rule__ModuleClassRelation__ClassesAssignment_4 ) ) )
            // InternalSafetyDSL.g:8691:1: ( ( rule__ModuleClassRelation__ClassesAssignment_4 ) )
            {
            // InternalSafetyDSL.g:8691:1: ( ( rule__ModuleClassRelation__ClassesAssignment_4 ) )
            // InternalSafetyDSL.g:8692:2: ( rule__ModuleClassRelation__ClassesAssignment_4 )
            {
             before(grammarAccess.getModuleClassRelationAccess().getClassesAssignment_4()); 
            // InternalSafetyDSL.g:8693:2: ( rule__ModuleClassRelation__ClassesAssignment_4 )
            // InternalSafetyDSL.g:8693:3: rule__ModuleClassRelation__ClassesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__ClassesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModuleClassRelationAccess().getClassesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__4__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__5"
    // InternalSafetyDSL.g:8701:1: rule__ModuleClassRelation__Group__5 : rule__ModuleClassRelation__Group__5__Impl rule__ModuleClassRelation__Group__6 ;
    public final void rule__ModuleClassRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8705:1: ( rule__ModuleClassRelation__Group__5__Impl rule__ModuleClassRelation__Group__6 )
            // InternalSafetyDSL.g:8706:2: rule__ModuleClassRelation__Group__5__Impl rule__ModuleClassRelation__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ModuleClassRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__5"


    // $ANTLR start "rule__ModuleClassRelation__Group__5__Impl"
    // InternalSafetyDSL.g:8713:1: rule__ModuleClassRelation__Group__5__Impl : ( ( rule__ModuleClassRelation__Group_5__0 )* ) ;
    public final void rule__ModuleClassRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8717:1: ( ( ( rule__ModuleClassRelation__Group_5__0 )* ) )
            // InternalSafetyDSL.g:8718:1: ( ( rule__ModuleClassRelation__Group_5__0 )* )
            {
            // InternalSafetyDSL.g:8718:1: ( ( rule__ModuleClassRelation__Group_5__0 )* )
            // InternalSafetyDSL.g:8719:2: ( rule__ModuleClassRelation__Group_5__0 )*
            {
             before(grammarAccess.getModuleClassRelationAccess().getGroup_5()); 
            // InternalSafetyDSL.g:8720:2: ( rule__ModuleClassRelation__Group_5__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==27) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSafetyDSL.g:8720:3: rule__ModuleClassRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ModuleClassRelation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getModuleClassRelationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__5__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__6"
    // InternalSafetyDSL.g:8728:1: rule__ModuleClassRelation__Group__6 : rule__ModuleClassRelation__Group__6__Impl rule__ModuleClassRelation__Group__7 ;
    public final void rule__ModuleClassRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8732:1: ( rule__ModuleClassRelation__Group__6__Impl rule__ModuleClassRelation__Group__7 )
            // InternalSafetyDSL.g:8733:2: rule__ModuleClassRelation__Group__6__Impl rule__ModuleClassRelation__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ModuleClassRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__6"


    // $ANTLR start "rule__ModuleClassRelation__Group__6__Impl"
    // InternalSafetyDSL.g:8740:1: rule__ModuleClassRelation__Group__6__Impl : ( '}' ) ;
    public final void rule__ModuleClassRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8744:1: ( ( '}' ) )
            // InternalSafetyDSL.g:8745:1: ( '}' )
            {
            // InternalSafetyDSL.g:8745:1: ( '}' )
            // InternalSafetyDSL.g:8746:2: '}'
            {
             before(grammarAccess.getModuleClassRelationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__6__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group__7"
    // InternalSafetyDSL.g:8755:1: rule__ModuleClassRelation__Group__7 : rule__ModuleClassRelation__Group__7__Impl ;
    public final void rule__ModuleClassRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8759:1: ( rule__ModuleClassRelation__Group__7__Impl )
            // InternalSafetyDSL.g:8760:2: rule__ModuleClassRelation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__7"


    // $ANTLR start "rule__ModuleClassRelation__Group__7__Impl"
    // InternalSafetyDSL.g:8766:1: rule__ModuleClassRelation__Group__7__Impl : ( ';' ) ;
    public final void rule__ModuleClassRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8770:1: ( ( ';' ) )
            // InternalSafetyDSL.g:8771:1: ( ';' )
            {
            // InternalSafetyDSL.g:8771:1: ( ';' )
            // InternalSafetyDSL.g:8772:2: ';'
            {
             before(grammarAccess.getModuleClassRelationAccess().getSemicolonKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group__7__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group_5__0"
    // InternalSafetyDSL.g:8782:1: rule__ModuleClassRelation__Group_5__0 : rule__ModuleClassRelation__Group_5__0__Impl rule__ModuleClassRelation__Group_5__1 ;
    public final void rule__ModuleClassRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8786:1: ( rule__ModuleClassRelation__Group_5__0__Impl rule__ModuleClassRelation__Group_5__1 )
            // InternalSafetyDSL.g:8787:2: rule__ModuleClassRelation__Group_5__0__Impl rule__ModuleClassRelation__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ModuleClassRelation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group_5__0"


    // $ANTLR start "rule__ModuleClassRelation__Group_5__0__Impl"
    // InternalSafetyDSL.g:8794:1: rule__ModuleClassRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ModuleClassRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8798:1: ( ( ',' ) )
            // InternalSafetyDSL.g:8799:1: ( ',' )
            {
            // InternalSafetyDSL.g:8799:1: ( ',' )
            // InternalSafetyDSL.g:8800:2: ','
            {
             before(grammarAccess.getModuleClassRelationAccess().getCommaKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group_5__0__Impl"


    // $ANTLR start "rule__ModuleClassRelation__Group_5__1"
    // InternalSafetyDSL.g:8809:1: rule__ModuleClassRelation__Group_5__1 : rule__ModuleClassRelation__Group_5__1__Impl ;
    public final void rule__ModuleClassRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8813:1: ( rule__ModuleClassRelation__Group_5__1__Impl )
            // InternalSafetyDSL.g:8814:2: rule__ModuleClassRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group_5__1"


    // $ANTLR start "rule__ModuleClassRelation__Group_5__1__Impl"
    // InternalSafetyDSL.g:8820:1: rule__ModuleClassRelation__Group_5__1__Impl : ( ( rule__ModuleClassRelation__ClassesAssignment_5_1 ) ) ;
    public final void rule__ModuleClassRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8824:1: ( ( ( rule__ModuleClassRelation__ClassesAssignment_5_1 ) ) )
            // InternalSafetyDSL.g:8825:1: ( ( rule__ModuleClassRelation__ClassesAssignment_5_1 ) )
            {
            // InternalSafetyDSL.g:8825:1: ( ( rule__ModuleClassRelation__ClassesAssignment_5_1 ) )
            // InternalSafetyDSL.g:8826:2: ( rule__ModuleClassRelation__ClassesAssignment_5_1 )
            {
             before(grammarAccess.getModuleClassRelationAccess().getClassesAssignment_5_1()); 
            // InternalSafetyDSL.g:8827:2: ( rule__ModuleClassRelation__ClassesAssignment_5_1 )
            // InternalSafetyDSL.g:8827:3: rule__ModuleClassRelation__ClassesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ModuleClassRelation__ClassesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleClassRelationAccess().getClassesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__Group_5__1__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__0"
    // InternalSafetyDSL.g:8836:1: rule__ClassTestCaseRelation__Group__0 : rule__ClassTestCaseRelation__Group__0__Impl rule__ClassTestCaseRelation__Group__1 ;
    public final void rule__ClassTestCaseRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8840:1: ( rule__ClassTestCaseRelation__Group__0__Impl rule__ClassTestCaseRelation__Group__1 )
            // InternalSafetyDSL.g:8841:2: rule__ClassTestCaseRelation__Group__0__Impl rule__ClassTestCaseRelation__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__ClassTestCaseRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__0"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__0__Impl"
    // InternalSafetyDSL.g:8848:1: rule__ClassTestCaseRelation__Group__0__Impl : ( ( rule__ClassTestCaseRelation__ClazzAssignment_0 ) ) ;
    public final void rule__ClassTestCaseRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8852:1: ( ( ( rule__ClassTestCaseRelation__ClazzAssignment_0 ) ) )
            // InternalSafetyDSL.g:8853:1: ( ( rule__ClassTestCaseRelation__ClazzAssignment_0 ) )
            {
            // InternalSafetyDSL.g:8853:1: ( ( rule__ClassTestCaseRelation__ClazzAssignment_0 ) )
            // InternalSafetyDSL.g:8854:2: ( rule__ClassTestCaseRelation__ClazzAssignment_0 )
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getClazzAssignment_0()); 
            // InternalSafetyDSL.g:8855:2: ( rule__ClassTestCaseRelation__ClazzAssignment_0 )
            // InternalSafetyDSL.g:8855:3: rule__ClassTestCaseRelation__ClazzAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__ClazzAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassTestCaseRelationAccess().getClazzAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__0__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__1"
    // InternalSafetyDSL.g:8863:1: rule__ClassTestCaseRelation__Group__1 : rule__ClassTestCaseRelation__Group__1__Impl rule__ClassTestCaseRelation__Group__2 ;
    public final void rule__ClassTestCaseRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8867:1: ( rule__ClassTestCaseRelation__Group__1__Impl rule__ClassTestCaseRelation__Group__2 )
            // InternalSafetyDSL.g:8868:2: rule__ClassTestCaseRelation__Group__1__Impl rule__ClassTestCaseRelation__Group__2
            {
            pushFollow(FOLLOW_63);
            rule__ClassTestCaseRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__1"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__1__Impl"
    // InternalSafetyDSL.g:8875:1: rule__ClassTestCaseRelation__Group__1__Impl : ( 'testWith' ) ;
    public final void rule__ClassTestCaseRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8879:1: ( ( 'testWith' ) )
            // InternalSafetyDSL.g:8880:1: ( 'testWith' )
            {
            // InternalSafetyDSL.g:8880:1: ( 'testWith' )
            // InternalSafetyDSL.g:8881:2: 'testWith'
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getTestWithKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getTestWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__1__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__2"
    // InternalSafetyDSL.g:8890:1: rule__ClassTestCaseRelation__Group__2 : rule__ClassTestCaseRelation__Group__2__Impl rule__ClassTestCaseRelation__Group__3 ;
    public final void rule__ClassTestCaseRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8894:1: ( rule__ClassTestCaseRelation__Group__2__Impl rule__ClassTestCaseRelation__Group__3 )
            // InternalSafetyDSL.g:8895:2: rule__ClassTestCaseRelation__Group__2__Impl rule__ClassTestCaseRelation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ClassTestCaseRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__2"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__2__Impl"
    // InternalSafetyDSL.g:8902:1: rule__ClassTestCaseRelation__Group__2__Impl : ( '=' ) ;
    public final void rule__ClassTestCaseRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8906:1: ( ( '=' ) )
            // InternalSafetyDSL.g:8907:1: ( '=' )
            {
            // InternalSafetyDSL.g:8907:1: ( '=' )
            // InternalSafetyDSL.g:8908:2: '='
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getEqualsSignKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__2__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__3"
    // InternalSafetyDSL.g:8917:1: rule__ClassTestCaseRelation__Group__3 : rule__ClassTestCaseRelation__Group__3__Impl rule__ClassTestCaseRelation__Group__4 ;
    public final void rule__ClassTestCaseRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8921:1: ( rule__ClassTestCaseRelation__Group__3__Impl rule__ClassTestCaseRelation__Group__4 )
            // InternalSafetyDSL.g:8922:2: rule__ClassTestCaseRelation__Group__3__Impl rule__ClassTestCaseRelation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ClassTestCaseRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__3"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__3__Impl"
    // InternalSafetyDSL.g:8929:1: rule__ClassTestCaseRelation__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassTestCaseRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8933:1: ( ( '{' ) )
            // InternalSafetyDSL.g:8934:1: ( '{' )
            {
            // InternalSafetyDSL.g:8934:1: ( '{' )
            // InternalSafetyDSL.g:8935:2: '{'
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__3__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__4"
    // InternalSafetyDSL.g:8944:1: rule__ClassTestCaseRelation__Group__4 : rule__ClassTestCaseRelation__Group__4__Impl rule__ClassTestCaseRelation__Group__5 ;
    public final void rule__ClassTestCaseRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8948:1: ( rule__ClassTestCaseRelation__Group__4__Impl rule__ClassTestCaseRelation__Group__5 )
            // InternalSafetyDSL.g:8949:2: rule__ClassTestCaseRelation__Group__4__Impl rule__ClassTestCaseRelation__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__ClassTestCaseRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__4"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__4__Impl"
    // InternalSafetyDSL.g:8956:1: rule__ClassTestCaseRelation__Group__4__Impl : ( ( rule__ClassTestCaseRelation__TestCasesAssignment_4 ) ) ;
    public final void rule__ClassTestCaseRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8960:1: ( ( ( rule__ClassTestCaseRelation__TestCasesAssignment_4 ) ) )
            // InternalSafetyDSL.g:8961:1: ( ( rule__ClassTestCaseRelation__TestCasesAssignment_4 ) )
            {
            // InternalSafetyDSL.g:8961:1: ( ( rule__ClassTestCaseRelation__TestCasesAssignment_4 ) )
            // InternalSafetyDSL.g:8962:2: ( rule__ClassTestCaseRelation__TestCasesAssignment_4 )
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getTestCasesAssignment_4()); 
            // InternalSafetyDSL.g:8963:2: ( rule__ClassTestCaseRelation__TestCasesAssignment_4 )
            // InternalSafetyDSL.g:8963:3: rule__ClassTestCaseRelation__TestCasesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__TestCasesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClassTestCaseRelationAccess().getTestCasesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__4__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__5"
    // InternalSafetyDSL.g:8971:1: rule__ClassTestCaseRelation__Group__5 : rule__ClassTestCaseRelation__Group__5__Impl rule__ClassTestCaseRelation__Group__6 ;
    public final void rule__ClassTestCaseRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8975:1: ( rule__ClassTestCaseRelation__Group__5__Impl rule__ClassTestCaseRelation__Group__6 )
            // InternalSafetyDSL.g:8976:2: rule__ClassTestCaseRelation__Group__5__Impl rule__ClassTestCaseRelation__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ClassTestCaseRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__5"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__5__Impl"
    // InternalSafetyDSL.g:8983:1: rule__ClassTestCaseRelation__Group__5__Impl : ( ( rule__ClassTestCaseRelation__Group_5__0 )* ) ;
    public final void rule__ClassTestCaseRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:8987:1: ( ( ( rule__ClassTestCaseRelation__Group_5__0 )* ) )
            // InternalSafetyDSL.g:8988:1: ( ( rule__ClassTestCaseRelation__Group_5__0 )* )
            {
            // InternalSafetyDSL.g:8988:1: ( ( rule__ClassTestCaseRelation__Group_5__0 )* )
            // InternalSafetyDSL.g:8989:2: ( rule__ClassTestCaseRelation__Group_5__0 )*
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getGroup_5()); 
            // InternalSafetyDSL.g:8990:2: ( rule__ClassTestCaseRelation__Group_5__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSafetyDSL.g:8990:3: rule__ClassTestCaseRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ClassTestCaseRelation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getClassTestCaseRelationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__5__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__6"
    // InternalSafetyDSL.g:8998:1: rule__ClassTestCaseRelation__Group__6 : rule__ClassTestCaseRelation__Group__6__Impl rule__ClassTestCaseRelation__Group__7 ;
    public final void rule__ClassTestCaseRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9002:1: ( rule__ClassTestCaseRelation__Group__6__Impl rule__ClassTestCaseRelation__Group__7 )
            // InternalSafetyDSL.g:9003:2: rule__ClassTestCaseRelation__Group__6__Impl rule__ClassTestCaseRelation__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ClassTestCaseRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__6"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__6__Impl"
    // InternalSafetyDSL.g:9010:1: rule__ClassTestCaseRelation__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassTestCaseRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9014:1: ( ( '}' ) )
            // InternalSafetyDSL.g:9015:1: ( '}' )
            {
            // InternalSafetyDSL.g:9015:1: ( '}' )
            // InternalSafetyDSL.g:9016:2: '}'
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__6__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__7"
    // InternalSafetyDSL.g:9025:1: rule__ClassTestCaseRelation__Group__7 : rule__ClassTestCaseRelation__Group__7__Impl ;
    public final void rule__ClassTestCaseRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9029:1: ( rule__ClassTestCaseRelation__Group__7__Impl )
            // InternalSafetyDSL.g:9030:2: rule__ClassTestCaseRelation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__7"


    // $ANTLR start "rule__ClassTestCaseRelation__Group__7__Impl"
    // InternalSafetyDSL.g:9036:1: rule__ClassTestCaseRelation__Group__7__Impl : ( ';' ) ;
    public final void rule__ClassTestCaseRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9040:1: ( ( ';' ) )
            // InternalSafetyDSL.g:9041:1: ( ';' )
            {
            // InternalSafetyDSL.g:9041:1: ( ';' )
            // InternalSafetyDSL.g:9042:2: ';'
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getSemicolonKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group__7__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group_5__0"
    // InternalSafetyDSL.g:9052:1: rule__ClassTestCaseRelation__Group_5__0 : rule__ClassTestCaseRelation__Group_5__0__Impl rule__ClassTestCaseRelation__Group_5__1 ;
    public final void rule__ClassTestCaseRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9056:1: ( rule__ClassTestCaseRelation__Group_5__0__Impl rule__ClassTestCaseRelation__Group_5__1 )
            // InternalSafetyDSL.g:9057:2: rule__ClassTestCaseRelation__Group_5__0__Impl rule__ClassTestCaseRelation__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassTestCaseRelation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group_5__0"


    // $ANTLR start "rule__ClassTestCaseRelation__Group_5__0__Impl"
    // InternalSafetyDSL.g:9064:1: rule__ClassTestCaseRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ClassTestCaseRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9068:1: ( ( ',' ) )
            // InternalSafetyDSL.g:9069:1: ( ',' )
            {
            // InternalSafetyDSL.g:9069:1: ( ',' )
            // InternalSafetyDSL.g:9070:2: ','
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getCommaKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group_5__0__Impl"


    // $ANTLR start "rule__ClassTestCaseRelation__Group_5__1"
    // InternalSafetyDSL.g:9079:1: rule__ClassTestCaseRelation__Group_5__1 : rule__ClassTestCaseRelation__Group_5__1__Impl ;
    public final void rule__ClassTestCaseRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9083:1: ( rule__ClassTestCaseRelation__Group_5__1__Impl )
            // InternalSafetyDSL.g:9084:2: rule__ClassTestCaseRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group_5__1"


    // $ANTLR start "rule__ClassTestCaseRelation__Group_5__1__Impl"
    // InternalSafetyDSL.g:9090:1: rule__ClassTestCaseRelation__Group_5__1__Impl : ( ( rule__ClassTestCaseRelation__TestCasesAssignment_5_1 ) ) ;
    public final void rule__ClassTestCaseRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9094:1: ( ( ( rule__ClassTestCaseRelation__TestCasesAssignment_5_1 ) ) )
            // InternalSafetyDSL.g:9095:1: ( ( rule__ClassTestCaseRelation__TestCasesAssignment_5_1 ) )
            {
            // InternalSafetyDSL.g:9095:1: ( ( rule__ClassTestCaseRelation__TestCasesAssignment_5_1 ) )
            // InternalSafetyDSL.g:9096:2: ( rule__ClassTestCaseRelation__TestCasesAssignment_5_1 )
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getTestCasesAssignment_5_1()); 
            // InternalSafetyDSL.g:9097:2: ( rule__ClassTestCaseRelation__TestCasesAssignment_5_1 )
            // InternalSafetyDSL.g:9097:3: rule__ClassTestCaseRelation__TestCasesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassTestCaseRelation__TestCasesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassTestCaseRelationAccess().getTestCasesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__Group_5__1__Impl"


    // $ANTLR start "rule__SafetyFramework__ViewsAssignment_0"
    // InternalSafetyDSL.g:9106:1: rule__SafetyFramework__ViewsAssignment_0 : ( ruleSafetyViewpoint ) ;
    public final void rule__SafetyFramework__ViewsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9110:1: ( ( ruleSafetyViewpoint ) )
            // InternalSafetyDSL.g:9111:2: ( ruleSafetyViewpoint )
            {
            // InternalSafetyDSL.g:9111:2: ( ruleSafetyViewpoint )
            // InternalSafetyDSL.g:9112:3: ruleSafetyViewpoint
            {
             before(grammarAccess.getSafetyFrameworkAccess().getViewsSafetyViewpointParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyViewpoint();

            state._fsp--;

             after(grammarAccess.getSafetyFrameworkAccess().getViewsSafetyViewpointParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyFramework__ViewsAssignment_0"


    // $ANTLR start "rule__SafetyFramework__DetailAssignment_1"
    // InternalSafetyDSL.g:9121:1: rule__SafetyFramework__DetailAssignment_1 : ( ruleImplementationDetail ) ;
    public final void rule__SafetyFramework__DetailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9125:1: ( ( ruleImplementationDetail ) )
            // InternalSafetyDSL.g:9126:2: ( ruleImplementationDetail )
            {
            // InternalSafetyDSL.g:9126:2: ( ruleImplementationDetail )
            // InternalSafetyDSL.g:9127:3: ruleImplementationDetail
            {
             before(grammarAccess.getSafetyFrameworkAccess().getDetailImplementationDetailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImplementationDetail();

            state._fsp--;

             after(grammarAccess.getSafetyFrameworkAccess().getDetailImplementationDetailParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyFramework__DetailAssignment_1"


    // $ANTLR start "rule__HazardViewpoint__NameAssignment_1"
    // InternalSafetyDSL.g:9136:1: rule__HazardViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HazardViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9140:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9141:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9141:2: ( RULE_ID )
            // InternalSafetyDSL.g:9142:3: RULE_ID
            {
             before(grammarAccess.getHazardViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHazardViewpointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__NameAssignment_1"


    // $ANTLR start "rule__HazardViewpoint__ElementsAssignment_4"
    // InternalSafetyDSL.g:9151:1: rule__HazardViewpoint__ElementsAssignment_4 : ( ruleHazardElement ) ;
    public final void rule__HazardViewpoint__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9155:1: ( ( ruleHazardElement ) )
            // InternalSafetyDSL.g:9156:2: ( ruleHazardElement )
            {
            // InternalSafetyDSL.g:9156:2: ( ruleHazardElement )
            // InternalSafetyDSL.g:9157:3: ruleHazardElement
            {
             before(grammarAccess.getHazardViewpointAccess().getElementsHazardElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHazardElement();

            state._fsp--;

             after(grammarAccess.getHazardViewpointAccess().getElementsHazardElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__ElementsAssignment_4"


    // $ANTLR start "rule__HazardViewpoint__RelationsAssignment_7"
    // InternalSafetyDSL.g:9166:1: rule__HazardViewpoint__RelationsAssignment_7 : ( ruleHazardRelation ) ;
    public final void rule__HazardViewpoint__RelationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9170:1: ( ( ruleHazardRelation ) )
            // InternalSafetyDSL.g:9171:2: ( ruleHazardRelation )
            {
            // InternalSafetyDSL.g:9171:2: ( ruleHazardRelation )
            // InternalSafetyDSL.g:9172:3: ruleHazardRelation
            {
             before(grammarAccess.getHazardViewpointAccess().getRelationsHazardRelationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleHazardRelation();

            state._fsp--;

             after(grammarAccess.getHazardViewpointAccess().getRelationsHazardRelationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HazardViewpoint__RelationsAssignment_7"


    // $ANTLR start "rule__Hazard__NameAssignment_1"
    // InternalSafetyDSL.g:9181:1: rule__Hazard__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Hazard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9185:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9186:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9186:2: ( RULE_ID )
            // InternalSafetyDSL.g:9187:3: RULE_ID
            {
             before(grammarAccess.getHazardAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHazardAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hazard__NameAssignment_1"


    // $ANTLR start "rule__SafetyRequirement__NameAssignment_1"
    // InternalSafetyDSL.g:9196:1: rule__SafetyRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9200:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9201:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9201:2: ( RULE_ID )
            // InternalSafetyDSL.g:9202:3: RULE_ID
            {
             before(grammarAccess.getSafetyRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__NameAssignment_1"


    // $ANTLR start "rule__SafetyRequirement__SubrequirementsAssignment_3_1"
    // InternalSafetyDSL.g:9211:1: rule__SafetyRequirement__SubrequirementsAssignment_3_1 : ( ruleSafetyRequirement ) ;
    public final void rule__SafetyRequirement__SubrequirementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9215:1: ( ( ruleSafetyRequirement ) )
            // InternalSafetyDSL.g:9216:2: ( ruleSafetyRequirement )
            {
            // InternalSafetyDSL.g:9216:2: ( ruleSafetyRequirement )
            // InternalSafetyDSL.g:9217:3: ruleSafetyRequirement
            {
             before(grammarAccess.getSafetyRequirementAccess().getSubrequirementsSafetyRequirementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyRequirement();

            state._fsp--;

             after(grammarAccess.getSafetyRequirementAccess().getSubrequirementsSafetyRequirementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyRequirement__SubrequirementsAssignment_3_1"


    // $ANTLR start "rule__Consequence__NameAssignment_1"
    // InternalSafetyDSL.g:9226:1: rule__Consequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Consequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9230:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9231:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9231:2: ( RULE_ID )
            // InternalSafetyDSL.g:9232:3: RULE_ID
            {
             before(grammarAccess.getConsequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConsequenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consequence__NameAssignment_1"


    // $ANTLR start "rule__Fault__NameAssignment_1"
    // InternalSafetyDSL.g:9241:1: rule__Fault__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fault__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9245:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9246:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9246:2: ( RULE_ID )
            // InternalSafetyDSL.g:9247:3: RULE_ID
            {
             before(grammarAccess.getFaultAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFaultAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fault__NameAssignment_1"


    // $ANTLR start "rule__FaultTree__NameAssignment_1"
    // InternalSafetyDSL.g:9256:1: rule__FaultTree__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FaultTree__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9260:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9261:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9261:2: ( RULE_ID )
            // InternalSafetyDSL.g:9262:3: RULE_ID
            {
             before(grammarAccess.getFaultTreeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFaultTreeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__NameAssignment_1"


    // $ANTLR start "rule__FaultTree__RootNodeAssignment_2"
    // InternalSafetyDSL.g:9271:1: rule__FaultTree__RootNodeAssignment_2 : ( rulePrimaryNode ) ;
    public final void rule__FaultTree__RootNodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9275:1: ( ( rulePrimaryNode ) )
            // InternalSafetyDSL.g:9276:2: ( rulePrimaryNode )
            {
            // InternalSafetyDSL.g:9276:2: ( rulePrimaryNode )
            // InternalSafetyDSL.g:9277:3: rulePrimaryNode
            {
             before(grammarAccess.getFaultTreeAccess().getRootNodePrimaryNodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryNode();

            state._fsp--;

             after(grammarAccess.getFaultTreeAccess().getRootNodePrimaryNodeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultTree__RootNodeAssignment_2"


    // $ANTLR start "rule__ORNode__RightAssignment_1_2"
    // InternalSafetyDSL.g:9286:1: rule__ORNode__RightAssignment_1_2 : ( ruleANDNode ) ;
    public final void rule__ORNode__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9290:1: ( ( ruleANDNode ) )
            // InternalSafetyDSL.g:9291:2: ( ruleANDNode )
            {
            // InternalSafetyDSL.g:9291:2: ( ruleANDNode )
            // InternalSafetyDSL.g:9292:3: ruleANDNode
            {
             before(grammarAccess.getORNodeAccess().getRightANDNodeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleANDNode();

            state._fsp--;

             after(grammarAccess.getORNodeAccess().getRightANDNodeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORNode__RightAssignment_1_2"


    // $ANTLR start "rule__ANDNode__RightAssignment_1_2"
    // InternalSafetyDSL.g:9301:1: rule__ANDNode__RightAssignment_1_2 : ( rulePrimaryNode ) ;
    public final void rule__ANDNode__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9305:1: ( ( rulePrimaryNode ) )
            // InternalSafetyDSL.g:9306:2: ( rulePrimaryNode )
            {
            // InternalSafetyDSL.g:9306:2: ( rulePrimaryNode )
            // InternalSafetyDSL.g:9307:3: rulePrimaryNode
            {
             before(grammarAccess.getANDNodeAccess().getRightPrimaryNodeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryNode();

            state._fsp--;

             after(grammarAccess.getANDNodeAccess().getRightPrimaryNodeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDNode__RightAssignment_1_2"


    // $ANTLR start "rule__PrimaryNode__ValueAssignment_0"
    // InternalSafetyDSL.g:9316:1: rule__PrimaryNode__ValueAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryNode__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9320:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9321:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9321:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9322:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryNodeAccess().getValueFaultCrossReference_0_0()); 
            // InternalSafetyDSL.g:9323:3: ( RULE_ID )
            // InternalSafetyDSL.g:9324:4: RULE_ID
            {
             before(grammarAccess.getPrimaryNodeAccess().getValueFaultIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryNodeAccess().getValueFaultIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPrimaryNodeAccess().getValueFaultCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryNode__ValueAssignment_0"


    // $ANTLR start "rule__DerivedFrom__SafetyRequirementsAssignment_0"
    // InternalSafetyDSL.g:9335:1: rule__DerivedFrom__SafetyRequirementsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DerivedFrom__SafetyRequirementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9339:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9340:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9340:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9341:3: ( RULE_ID )
            {
             before(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementCrossReference_0_0()); 
            // InternalSafetyDSL.g:9342:3: ( RULE_ID )
            // InternalSafetyDSL.g:9343:4: RULE_ID
            {
             before(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__SafetyRequirementsAssignment_0"


    // $ANTLR start "rule__DerivedFrom__SafetyRequirementsAssignment_1_1"
    // InternalSafetyDSL.g:9354:1: rule__DerivedFrom__SafetyRequirementsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DerivedFrom__SafetyRequirementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9358:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9359:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9359:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9360:3: ( RULE_ID )
            {
             before(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementCrossReference_1_1_0()); 
            // InternalSafetyDSL.g:9361:3: ( RULE_ID )
            // InternalSafetyDSL.g:9362:4: RULE_ID
            {
             before(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__SafetyRequirementsAssignment_1_1"


    // $ANTLR start "rule__DerivedFrom__HazardAssignment_3"
    // InternalSafetyDSL.g:9373:1: rule__DerivedFrom__HazardAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DerivedFrom__HazardAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9377:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9378:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9378:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9379:3: ( RULE_ID )
            {
             before(grammarAccess.getDerivedFromAccess().getHazardHazardCrossReference_3_0()); 
            // InternalSafetyDSL.g:9380:3: ( RULE_ID )
            // InternalSafetyDSL.g:9381:4: RULE_ID
            {
             before(grammarAccess.getDerivedFromAccess().getHazardHazardIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDerivedFromAccess().getHazardHazardIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDerivedFromAccess().getHazardHazardCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivedFrom__HazardAssignment_3"


    // $ANTLR start "rule__Causes__HazardAssignment_0"
    // InternalSafetyDSL.g:9392:1: rule__Causes__HazardAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Causes__HazardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9396:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9397:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9397:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9398:3: ( RULE_ID )
            {
             before(grammarAccess.getCausesAccess().getHazardHazardCrossReference_0_0()); 
            // InternalSafetyDSL.g:9399:3: ( RULE_ID )
            // InternalSafetyDSL.g:9400:4: RULE_ID
            {
             before(grammarAccess.getCausesAccess().getHazardHazardIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCausesAccess().getHazardHazardIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCausesAccess().getHazardHazardCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__HazardAssignment_0"


    // $ANTLR start "rule__Causes__ConsequencesAssignment_2"
    // InternalSafetyDSL.g:9411:1: rule__Causes__ConsequencesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Causes__ConsequencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9415:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9416:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9416:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9417:3: ( RULE_ID )
            {
             before(grammarAccess.getCausesAccess().getConsequencesConsequenceCrossReference_2_0()); 
            // InternalSafetyDSL.g:9418:3: ( RULE_ID )
            // InternalSafetyDSL.g:9419:4: RULE_ID
            {
             before(grammarAccess.getCausesAccess().getConsequencesConsequenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCausesAccess().getConsequencesConsequenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCausesAccess().getConsequencesConsequenceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__ConsequencesAssignment_2"


    // $ANTLR start "rule__Causes__ConsequencesAssignment_3_1"
    // InternalSafetyDSL.g:9430:1: rule__Causes__ConsequencesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Causes__ConsequencesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9434:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9435:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9435:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9436:3: ( RULE_ID )
            {
             before(grammarAccess.getCausesAccess().getConsequencesConsequenceCrossReference_3_1_0()); 
            // InternalSafetyDSL.g:9437:3: ( RULE_ID )
            // InternalSafetyDSL.g:9438:4: RULE_ID
            {
             before(grammarAccess.getCausesAccess().getConsequencesConsequenceIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCausesAccess().getConsequencesConsequenceIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCausesAccess().getConsequencesConsequenceCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Causes__ConsequencesAssignment_3_1"


    // $ANTLR start "rule__CausedBy__HazardAssignment_0"
    // InternalSafetyDSL.g:9449:1: rule__CausedBy__HazardAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CausedBy__HazardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9453:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9454:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9454:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9455:3: ( RULE_ID )
            {
             before(grammarAccess.getCausedByAccess().getHazardHazardCrossReference_0_0()); 
            // InternalSafetyDSL.g:9456:3: ( RULE_ID )
            // InternalSafetyDSL.g:9457:4: RULE_ID
            {
             before(grammarAccess.getCausedByAccess().getHazardHazardIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCausedByAccess().getHazardHazardIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCausedByAccess().getHazardHazardCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__HazardAssignment_0"


    // $ANTLR start "rule__CausedBy__FaultAssignment_2"
    // InternalSafetyDSL.g:9468:1: rule__CausedBy__FaultAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__CausedBy__FaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9472:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9473:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9473:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9474:3: ( RULE_ID )
            {
             before(grammarAccess.getCausedByAccess().getFaultFaultTreeCrossReference_2_0()); 
            // InternalSafetyDSL.g:9475:3: ( RULE_ID )
            // InternalSafetyDSL.g:9476:4: RULE_ID
            {
             before(grammarAccess.getCausedByAccess().getFaultFaultTreeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCausedByAccess().getFaultFaultTreeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCausedByAccess().getFaultFaultTreeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CausedBy__FaultAssignment_2"


    // $ANTLR start "rule__SafetyTacticViewpoint__NameAssignment_1"
    // InternalSafetyDSL.g:9487:1: rule__SafetyTacticViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyTacticViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9491:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9492:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9492:2: ( RULE_ID )
            // InternalSafetyDSL.g:9493:3: RULE_ID
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyTacticViewpointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__NameAssignment_1"


    // $ANTLR start "rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3"
    // InternalSafetyDSL.g:9502:1: rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3 : ( ruleSafetyTactic ) ;
    public final void rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9506:1: ( ( ruleSafetyTactic ) )
            // InternalSafetyDSL.g:9507:2: ( ruleSafetyTactic )
            {
            // InternalSafetyDSL.g:9507:2: ( ruleSafetyTactic )
            // InternalSafetyDSL.g:9508:3: ruleSafetyTactic
            {
             before(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsSafetyTacticParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyTactic();

            state._fsp--;

             after(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsSafetyTacticParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3"


    // $ANTLR start "rule__FaultAvoidance__NameAssignment_1"
    // InternalSafetyDSL.g:9517:1: rule__FaultAvoidance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FaultAvoidance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9521:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9522:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9522:2: ( RULE_ID )
            // InternalSafetyDSL.g:9523:3: RULE_ID
            {
             before(grammarAccess.getFaultAvoidanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__NameAssignment_1"


    // $ANTLR start "rule__FaultAvoidance__TypeAssignment_4"
    // InternalSafetyDSL.g:9532:1: rule__FaultAvoidance__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FaultAvoidance__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9536:1: ( ( RULE_STRING ) )
            // InternalSafetyDSL.g:9537:2: ( RULE_STRING )
            {
            // InternalSafetyDSL.g:9537:2: ( RULE_STRING )
            // InternalSafetyDSL.g:9538:3: RULE_STRING
            {
             before(grammarAccess.getFaultAvoidanceAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFaultAvoidanceAccess().getTypeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__TypeAssignment_4"


    // $ANTLR start "rule__FaultAvoidance__HandledFaultsAssignment_6"
    // InternalSafetyDSL.g:9547:1: rule__FaultAvoidance__HandledFaultsAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FaultAvoidance__HandledFaultsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9551:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9552:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9552:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9553:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultCrossReference_6_0()); 
            // InternalSafetyDSL.g:9554:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9555:4: ruleQualifiedName
            {
             before(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__HandledFaultsAssignment_6"


    // $ANTLR start "rule__FaultAvoidance__HandledFaultsAssignment_7_1"
    // InternalSafetyDSL.g:9566:1: rule__FaultAvoidance__HandledFaultsAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FaultAvoidance__HandledFaultsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9570:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9571:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9571:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9572:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultCrossReference_7_1_0()); 
            // InternalSafetyDSL.g:9573:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9574:4: ruleQualifiedName
            {
             before(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultAvoidance__HandledFaultsAssignment_7_1"


    // $ANTLR start "rule__FaultDetection__NameAssignment_1"
    // InternalSafetyDSL.g:9585:1: rule__FaultDetection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FaultDetection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9589:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9590:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9590:2: ( RULE_ID )
            // InternalSafetyDSL.g:9591:3: RULE_ID
            {
             before(grammarAccess.getFaultDetectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__NameAssignment_1"


    // $ANTLR start "rule__FaultDetection__TypeAssignment_4"
    // InternalSafetyDSL.g:9600:1: rule__FaultDetection__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FaultDetection__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9604:1: ( ( RULE_STRING ) )
            // InternalSafetyDSL.g:9605:2: ( RULE_STRING )
            {
            // InternalSafetyDSL.g:9605:2: ( RULE_STRING )
            // InternalSafetyDSL.g:9606:3: RULE_STRING
            {
             before(grammarAccess.getFaultDetectionAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFaultDetectionAccess().getTypeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__TypeAssignment_4"


    // $ANTLR start "rule__FaultDetection__HandledFaultsAssignment_6"
    // InternalSafetyDSL.g:9615:1: rule__FaultDetection__HandledFaultsAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FaultDetection__HandledFaultsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9619:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9620:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9620:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9621:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultCrossReference_6_0()); 
            // InternalSafetyDSL.g:9622:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9623:4: ruleQualifiedName
            {
             before(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__HandledFaultsAssignment_6"


    // $ANTLR start "rule__FaultDetection__HandledFaultsAssignment_7_1"
    // InternalSafetyDSL.g:9634:1: rule__FaultDetection__HandledFaultsAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FaultDetection__HandledFaultsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9638:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9639:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9639:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9640:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultCrossReference_7_1_0()); 
            // InternalSafetyDSL.g:9641:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9642:4: ruleQualifiedName
            {
             before(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultDetection__HandledFaultsAssignment_7_1"


    // $ANTLR start "rule__FaultContainment__NameAssignment_1"
    // InternalSafetyDSL.g:9653:1: rule__FaultContainment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FaultContainment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9657:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9658:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9658:2: ( RULE_ID )
            // InternalSafetyDSL.g:9659:3: RULE_ID
            {
             before(grammarAccess.getFaultContainmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__NameAssignment_1"


    // $ANTLR start "rule__FaultContainment__TypeAssignment_4"
    // InternalSafetyDSL.g:9668:1: rule__FaultContainment__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FaultContainment__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9672:1: ( ( RULE_STRING ) )
            // InternalSafetyDSL.g:9673:2: ( RULE_STRING )
            {
            // InternalSafetyDSL.g:9673:2: ( RULE_STRING )
            // InternalSafetyDSL.g:9674:3: RULE_STRING
            {
             before(grammarAccess.getFaultContainmentAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFaultContainmentAccess().getTypeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__TypeAssignment_4"


    // $ANTLR start "rule__FaultContainment__HandledFaultsAssignment_6"
    // InternalSafetyDSL.g:9683:1: rule__FaultContainment__HandledFaultsAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FaultContainment__HandledFaultsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9687:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9688:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9688:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9689:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultCrossReference_6_0()); 
            // InternalSafetyDSL.g:9690:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9691:4: ruleQualifiedName
            {
             before(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__HandledFaultsAssignment_6"


    // $ANTLR start "rule__FaultContainment__HandledFaultsAssignment_7_1"
    // InternalSafetyDSL.g:9702:1: rule__FaultContainment__HandledFaultsAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FaultContainment__HandledFaultsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9706:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9707:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9707:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9708:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultCrossReference_7_1_0()); 
            // InternalSafetyDSL.g:9709:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9710:4: ruleQualifiedName
            {
             before(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FaultContainment__HandledFaultsAssignment_7_1"


    // $ANTLR start "rule__SafetyCriticalViewpoint__NameAssignment_1"
    // InternalSafetyDSL.g:9721:1: rule__SafetyCriticalViewpoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyCriticalViewpoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9725:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9726:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9726:2: ( RULE_ID )
            // InternalSafetyDSL.g:9727:3: RULE_ID
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalViewpointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__NameAssignment_1"


    // $ANTLR start "rule__SafetyCriticalViewpoint__ElementsAssignment_4"
    // InternalSafetyDSL.g:9736:1: rule__SafetyCriticalViewpoint__ElementsAssignment_4 : ( ruleArchitecturalElement ) ;
    public final void rule__SafetyCriticalViewpoint__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9740:1: ( ( ruleArchitecturalElement ) )
            // InternalSafetyDSL.g:9741:2: ( ruleArchitecturalElement )
            {
            // InternalSafetyDSL.g:9741:2: ( ruleArchitecturalElement )
            // InternalSafetyDSL.g:9742:3: ruleArchitecturalElement
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getElementsArchitecturalElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitecturalElement();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalViewpointAccess().getElementsArchitecturalElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__ElementsAssignment_4"


    // $ANTLR start "rule__SafetyCriticalViewpoint__RelationsAssignment_7"
    // InternalSafetyDSL.g:9751:1: rule__SafetyCriticalViewpoint__RelationsAssignment_7 : ( ruleSafetyCriticalRelation ) ;
    public final void rule__SafetyCriticalViewpoint__RelationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9755:1: ( ( ruleSafetyCriticalRelation ) )
            // InternalSafetyDSL.g:9756:2: ( ruleSafetyCriticalRelation )
            {
            // InternalSafetyDSL.g:9756:2: ( ruleSafetyCriticalRelation )
            // InternalSafetyDSL.g:9757:3: ruleSafetyCriticalRelation
            {
             before(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsSafetyCriticalRelationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyCriticalRelation();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsSafetyCriticalRelationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCriticalViewpoint__RelationsAssignment_7"


    // $ANTLR start "rule__SafetyCritical__NameAssignment_1"
    // InternalSafetyDSL.g:9766:1: rule__SafetyCritical__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyCritical__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9770:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9771:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9771:2: ( RULE_ID )
            // InternalSafetyDSL.g:9772:3: RULE_ID
            {
             before(grammarAccess.getSafetyCriticalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__NameAssignment_1"


    // $ANTLR start "rule__SafetyCritical__LevelAssignment_4"
    // InternalSafetyDSL.g:9781:1: rule__SafetyCritical__LevelAssignment_4 : ( ruleCriticalityLevel ) ;
    public final void rule__SafetyCritical__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9785:1: ( ( ruleCriticalityLevel ) )
            // InternalSafetyDSL.g:9786:2: ( ruleCriticalityLevel )
            {
            // InternalSafetyDSL.g:9786:2: ( ruleCriticalityLevel )
            // InternalSafetyDSL.g:9787:3: ruleCriticalityLevel
            {
             before(grammarAccess.getSafetyCriticalAccess().getLevelCriticalityLevelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCriticalityLevel();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getLevelCriticalityLevelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__LevelAssignment_4"


    // $ANTLR start "rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7"
    // InternalSafetyDSL.g:9796:1: rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9800:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9801:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9801:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9802:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementCrossReference_7_0()); 
            // InternalSafetyDSL.g:9803:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9804:4: ruleQualifiedName
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7"


    // $ANTLR start "rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1"
    // InternalSafetyDSL.g:9815:1: rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9819:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9820:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9820:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9821:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementCrossReference_8_1_0()); 
            // InternalSafetyDSL.g:9822:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9823:4: ruleQualifiedName
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1"


    // $ANTLR start "rule__SafetyCritical__ImplementedTacticsAssignment_10_1"
    // InternalSafetyDSL.g:9834:1: rule__SafetyCritical__ImplementedTacticsAssignment_10_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SafetyCritical__ImplementedTacticsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9838:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9839:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9839:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9840:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticCrossReference_10_1_0()); 
            // InternalSafetyDSL.g:9841:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9842:4: ruleQualifiedName
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__ImplementedTacticsAssignment_10_1"


    // $ANTLR start "rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1"
    // InternalSafetyDSL.g:9853:1: rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9857:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9858:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9858:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9859:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticCrossReference_10_2_1_0()); 
            // InternalSafetyDSL.g:9860:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9861:4: ruleQualifiedName
            {
             before(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_10_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_10_2_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticCrossReference_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1"


    // $ANTLR start "rule__SafetyCritical__SubelementsAssignment_11_1"
    // InternalSafetyDSL.g:9872:1: rule__SafetyCritical__SubelementsAssignment_11_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SafetyCritical__SubelementsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9876:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9877:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9877:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9878:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalCrossReference_11_1_0()); 
            // InternalSafetyDSL.g:9879:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9880:4: ruleQualifiedName
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalQualifiedNameParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalQualifiedNameParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__SubelementsAssignment_11_1"


    // $ANTLR start "rule__SafetyCritical__SubelementsAssignment_11_2_1"
    // InternalSafetyDSL.g:9891:1: rule__SafetyCritical__SubelementsAssignment_11_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SafetyCritical__SubelementsAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9895:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9896:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9896:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9897:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalCrossReference_11_2_1_0()); 
            // InternalSafetyDSL.g:9898:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:9899:4: ruleQualifiedName
            {
             before(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalQualifiedNameParserRuleCall_11_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalQualifiedNameParserRuleCall_11_2_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalCrossReference_11_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__SubelementsAssignment_11_2_1"


    // $ANTLR start "rule__SafetyCritical__StatesAssignment_12_1"
    // InternalSafetyDSL.g:9910:1: rule__SafetyCritical__StatesAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__SafetyCritical__StatesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9914:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9915:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9915:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9916:3: ( RULE_ID )
            {
             before(grammarAccess.getSafetyCriticalAccess().getStatesStateCrossReference_12_1_0()); 
            // InternalSafetyDSL.g:9917:3: ( RULE_ID )
            // InternalSafetyDSL.g:9918:4: RULE_ID
            {
             before(grammarAccess.getSafetyCriticalAccess().getStatesStateIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getStatesStateIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getStatesStateCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__StatesAssignment_12_1"


    // $ANTLR start "rule__SafetyCritical__StatesAssignment_12_2_1"
    // InternalSafetyDSL.g:9929:1: rule__SafetyCritical__StatesAssignment_12_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SafetyCritical__StatesAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9933:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:9934:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:9934:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9935:3: ( RULE_ID )
            {
             before(grammarAccess.getSafetyCriticalAccess().getStatesStateCrossReference_12_2_1_0()); 
            // InternalSafetyDSL.g:9936:3: ( RULE_ID )
            // InternalSafetyDSL.g:9937:4: RULE_ID
            {
             before(grammarAccess.getSafetyCriticalAccess().getStatesStateIDTerminalRuleCall_12_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyCriticalAccess().getStatesStateIDTerminalRuleCall_12_2_1_0_1()); 

            }

             after(grammarAccess.getSafetyCriticalAccess().getStatesStateCrossReference_12_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyCritical__StatesAssignment_12_2_1"


    // $ANTLR start "rule__NonSafetyCritical__NameAssignment_1"
    // InternalSafetyDSL.g:9948:1: rule__NonSafetyCritical__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonSafetyCritical__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9952:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9953:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9953:2: ( RULE_ID )
            // InternalSafetyDSL.g:9954:3: RULE_ID
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonSafetyCriticalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__NameAssignment_1"


    // $ANTLR start "rule__NonSafetyCritical__SubelementsAssignment_2_0_1"
    // InternalSafetyDSL.g:9963:1: rule__NonSafetyCritical__SubelementsAssignment_2_0_1 : ( ruleNonSafetyCritical ) ;
    public final void rule__NonSafetyCritical__SubelementsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9967:1: ( ( ruleNonSafetyCritical ) )
            // InternalSafetyDSL.g:9968:2: ( ruleNonSafetyCritical )
            {
            // InternalSafetyDSL.g:9968:2: ( ruleNonSafetyCritical )
            // InternalSafetyDSL.g:9969:3: ruleNonSafetyCritical
            {
             before(grammarAccess.getNonSafetyCriticalAccess().getSubelementsNonSafetyCriticalParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonSafetyCritical();

            state._fsp--;

             after(grammarAccess.getNonSafetyCriticalAccess().getSubelementsNonSafetyCriticalParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonSafetyCritical__SubelementsAssignment_2_0_1"


    // $ANTLR start "rule__Monitor__NameAssignment_1"
    // InternalSafetyDSL.g:9978:1: rule__Monitor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Monitor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9982:1: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:9983:2: ( RULE_ID )
            {
            // InternalSafetyDSL.g:9983:2: ( RULE_ID )
            // InternalSafetyDSL.g:9984:3: RULE_ID
            {
             before(grammarAccess.getMonitorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__NameAssignment_1"


    // $ANTLR start "rule__Monitor__ImplementedTacticsAssignment_2_2"
    // InternalSafetyDSL.g:9993:1: rule__Monitor__ImplementedTacticsAssignment_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Monitor__ImplementedTacticsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:9997:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:9998:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:9998:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:9999:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticCrossReference_2_2_0()); 
            // InternalSafetyDSL.g:10000:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:10001:4: ruleQualifiedName
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__ImplementedTacticsAssignment_2_2"


    // $ANTLR start "rule__Monitor__ImplementedTacticsAssignment_2_3_1"
    // InternalSafetyDSL.g:10012:1: rule__Monitor__ImplementedTacticsAssignment_2_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Monitor__ImplementedTacticsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10016:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:10017:2: ( ( ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:10017:2: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:10018:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticCrossReference_2_3_1_0()); 
            // InternalSafetyDSL.g:10019:3: ( ruleQualifiedName )
            // InternalSafetyDSL.g:10020:4: ruleQualifiedName
            {
             before(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticQualifiedNameParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__ImplementedTacticsAssignment_2_3_1"


    // $ANTLR start "rule__ArchElementToArchElement__Element1Assignment_0_1_0"
    // InternalSafetyDSL.g:10031:1: rule__ArchElementToArchElement__Element1Assignment_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element1Assignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10035:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10036:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10036:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10037:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_0_1_0_0()); 
            // InternalSafetyDSL.g:10038:3: ( RULE_ID )
            // InternalSafetyDSL.g:10039:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementIDTerminalRuleCall_0_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementIDTerminalRuleCall_0_1_0_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element1Assignment_0_1_0"


    // $ANTLR start "rule__ArchElementToArchElement__Element2Assignment_0_1_2"
    // InternalSafetyDSL.g:10050:1: rule__ArchElementToArchElement__Element2Assignment_0_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element2Assignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10054:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10055:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10055:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10056:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_0_1_2_0()); 
            // InternalSafetyDSL.g:10057:3: ( RULE_ID )
            // InternalSafetyDSL.g:10058:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_0_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element2Assignment_0_1_2"


    // $ANTLR start "rule__ArchElementToArchElement__Element2Assignment_0_1_3_1"
    // InternalSafetyDSL.g:10069:1: rule__ArchElementToArchElement__Element2Assignment_0_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element2Assignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10073:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10074:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10074:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10075:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_0_1_3_1_0()); 
            // InternalSafetyDSL.g:10076:3: ( RULE_ID )
            // InternalSafetyDSL.g:10077:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_0_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_0_1_3_1_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element2Assignment_0_1_3_1"


    // $ANTLR start "rule__ArchElementToArchElement__Element1Assignment_1_1_0"
    // InternalSafetyDSL.g:10088:1: rule__ArchElementToArchElement__Element1Assignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element1Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10092:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10093:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10093:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10094:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_1_1_0_0()); 
            // InternalSafetyDSL.g:10095:3: ( RULE_ID )
            // InternalSafetyDSL.g:10096:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element1Assignment_1_1_0"


    // $ANTLR start "rule__ArchElementToArchElement__Element2Assignment_1_1_2"
    // InternalSafetyDSL.g:10107:1: rule__ArchElementToArchElement__Element2Assignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element2Assignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10111:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10112:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10112:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10113:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_1_1_2_0()); 
            // InternalSafetyDSL.g:10114:3: ( RULE_ID )
            // InternalSafetyDSL.g:10115:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element2Assignment_1_1_2"


    // $ANTLR start "rule__ArchElementToArchElement__Element2Assignment_1_1_3_1"
    // InternalSafetyDSL.g:10126:1: rule__ArchElementToArchElement__Element2Assignment_1_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element2Assignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10130:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10131:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10131:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10132:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_1_1_3_1_0()); 
            // InternalSafetyDSL.g:10133:3: ( RULE_ID )
            // InternalSafetyDSL.g:10134:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_1_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_1_1_3_1_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_1_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element2Assignment_1_1_3_1"


    // $ANTLR start "rule__ArchElementToArchElement__Element1Assignment_2_1_0"
    // InternalSafetyDSL.g:10145:1: rule__ArchElementToArchElement__Element1Assignment_2_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element1Assignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10149:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10150:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10150:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10151:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_2_1_0_0()); 
            // InternalSafetyDSL.g:10152:3: ( RULE_ID )
            // InternalSafetyDSL.g:10153:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementIDTerminalRuleCall_2_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementIDTerminalRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element1Assignment_2_1_0"


    // $ANTLR start "rule__ArchElementToArchElement__Element2Assignment_2_1_2"
    // InternalSafetyDSL.g:10164:1: rule__ArchElementToArchElement__Element2Assignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element2Assignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10168:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10169:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10169:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10170:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_2_1_2_0()); 
            // InternalSafetyDSL.g:10171:3: ( RULE_ID )
            // InternalSafetyDSL.g:10172:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element2Assignment_2_1_2"


    // $ANTLR start "rule__ArchElementToArchElement__Element2Assignment_2_1_3_1"
    // InternalSafetyDSL.g:10183:1: rule__ArchElementToArchElement__Element2Assignment_2_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArchElementToArchElement__Element2Assignment_2_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10187:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10188:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10188:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10189:3: ( RULE_ID )
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_2_1_3_1_0()); 
            // InternalSafetyDSL.g:10190:3: ( RULE_ID )
            // InternalSafetyDSL.g:10191:4: RULE_ID
            {
             before(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_2_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementIDTerminalRuleCall_2_1_3_1_0_1()); 

            }

             after(grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_2_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchElementToArchElement__Element2Assignment_2_1_3_1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0"
    // InternalSafetyDSL.g:10202:1: rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10206:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10207:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10207:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10208:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_0_1_0_0()); 
            // InternalSafetyDSL.g:10209:3: ( RULE_ID )
            // InternalSafetyDSL.g:10210:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_0_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_0_1_0_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2"
    // InternalSafetyDSL.g:10221:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10225:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10226:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10226:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10227:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_0_1_2_0()); 
            // InternalSafetyDSL.g:10228:3: ( RULE_ID )
            // InternalSafetyDSL.g:10229:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_0_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1"
    // InternalSafetyDSL.g:10240:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10244:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10245:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10245:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10246:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_0_1_3_1_0()); 
            // InternalSafetyDSL.g:10247:3: ( RULE_ID )
            // InternalSafetyDSL.g:10248:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_0_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_0_1_3_1_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0"
    // InternalSafetyDSL.g:10259:1: rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10263:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10264:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10264:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10265:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_1_1_0_0()); 
            // InternalSafetyDSL.g:10266:3: ( RULE_ID )
            // InternalSafetyDSL.g:10267:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2"
    // InternalSafetyDSL.g:10278:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10282:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10283:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10283:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10284:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_1_1_2_0()); 
            // InternalSafetyDSL.g:10285:3: ( RULE_ID )
            // InternalSafetyDSL.g:10286:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1"
    // InternalSafetyDSL.g:10297:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10301:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10302:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10302:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10303:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_1_1_3_1_0()); 
            // InternalSafetyDSL.g:10304:3: ( RULE_ID )
            // InternalSafetyDSL.g:10305:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_1_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_1_1_3_1_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_1_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0"
    // InternalSafetyDSL.g:10316:1: rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10320:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10321:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10321:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10322:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_2_1_0_0()); 
            // InternalSafetyDSL.g:10323:3: ( RULE_ID )
            // InternalSafetyDSL.g:10324:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_2_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2"
    // InternalSafetyDSL.g:10335:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10339:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10340:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10340:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10341:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_2_1_2_0()); 
            // InternalSafetyDSL.g:10342:3: ( RULE_ID )
            // InternalSafetyDSL.g:10343:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1"
    // InternalSafetyDSL.g:10354:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10358:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10359:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10359:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10360:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_2_1_3_1_0()); 
            // InternalSafetyDSL.g:10361:3: ( RULE_ID )
            // InternalSafetyDSL.g:10362:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_2_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_2_1_3_1_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_2_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0"
    // InternalSafetyDSL.g:10373:1: rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10377:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10378:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10378:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10379:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_3_1_0_0()); 
            // InternalSafetyDSL.g:10380:3: ( RULE_ID )
            // InternalSafetyDSL.g:10381:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_3_1_0_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2"
    // InternalSafetyDSL.g:10392:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10396:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10397:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10397:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10398:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_3_1_2_0()); 
            // InternalSafetyDSL.g:10399:3: ( RULE_ID )
            // InternalSafetyDSL.g:10400:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1"
    // InternalSafetyDSL.g:10411:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10415:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10416:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10416:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10417:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_3_1_3_1_0()); 
            // InternalSafetyDSL.g:10418:3: ( RULE_ID )
            // InternalSafetyDSL.g:10419:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_3_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_3_1_3_1_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_3_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1"


    // $ANTLR start "rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0"
    // InternalSafetyDSL.g:10430:1: rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10434:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10435:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10435:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10436:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_4_1_0_0()); 
            // InternalSafetyDSL.g:10437:3: ( RULE_ID )
            // InternalSafetyDSL.g:10438:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_4_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorIDTerminalRuleCall_4_1_0_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2"
    // InternalSafetyDSL.g:10449:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10453:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10454:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10454:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10455:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_4_1_2_0()); 
            // InternalSafetyDSL.g:10456:3: ( RULE_ID )
            // InternalSafetyDSL.g:10457:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_4_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_4_1_2_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2"


    // $ANTLR start "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1"
    // InternalSafetyDSL.g:10468:1: rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10472:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10473:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10473:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10474:3: ( RULE_ID )
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_4_1_3_1_0()); 
            // InternalSafetyDSL.g:10475:3: ( RULE_ID )
            // InternalSafetyDSL.g:10476:4: RULE_ID
            {
             before(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_4_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalIDTerminalRuleCall_4_1_3_1_0_1()); 

            }

             after(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_4_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1"


    // $ANTLR start "rule__ReportsFault__SafetyCritical1Assignment_0"
    // InternalSafetyDSL.g:10487:1: rule__ReportsFault__SafetyCritical1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReportsFault__SafetyCritical1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10491:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10492:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10492:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10493:3: ( RULE_ID )
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical1SafetyCriticalCrossReference_0_0()); 
            // InternalSafetyDSL.g:10494:3: ( RULE_ID )
            // InternalSafetyDSL.g:10495:4: RULE_ID
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical1SafetyCriticalIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReportsFaultAccess().getSafetyCritical1SafetyCriticalIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReportsFaultAccess().getSafetyCritical1SafetyCriticalCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__SafetyCritical1Assignment_0"


    // $ANTLR start "rule__ReportsFault__SafetyCritical2Assignment_2"
    // InternalSafetyDSL.g:10506:1: rule__ReportsFault__SafetyCritical2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ReportsFault__SafetyCritical2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10510:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10511:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10511:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10512:3: ( RULE_ID )
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalCrossReference_2_0()); 
            // InternalSafetyDSL.g:10513:3: ( RULE_ID )
            // InternalSafetyDSL.g:10514:4: RULE_ID
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__SafetyCritical2Assignment_2"


    // $ANTLR start "rule__ReportsFault__SafetyCritical2Assignment_3_1"
    // InternalSafetyDSL.g:10525:1: rule__ReportsFault__SafetyCritical2Assignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReportsFault__SafetyCritical2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10529:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10530:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10530:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10531:3: ( RULE_ID )
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalCrossReference_3_1_0()); 
            // InternalSafetyDSL.g:10532:3: ( RULE_ID )
            // InternalSafetyDSL.g:10533:4: RULE_ID
            {
             before(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportsFault__SafetyCritical2Assignment_3_1"


    // $ANTLR start "rule__ImplementationDetail__ModuleClassRelationsAssignment_3"
    // InternalSafetyDSL.g:10544:1: rule__ImplementationDetail__ModuleClassRelationsAssignment_3 : ( ruleModuleClassRelation ) ;
    public final void rule__ImplementationDetail__ModuleClassRelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10548:1: ( ( ruleModuleClassRelation ) )
            // InternalSafetyDSL.g:10549:2: ( ruleModuleClassRelation )
            {
            // InternalSafetyDSL.g:10549:2: ( ruleModuleClassRelation )
            // InternalSafetyDSL.g:10550:3: ruleModuleClassRelation
            {
             before(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsModuleClassRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleClassRelation();

            state._fsp--;

             after(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsModuleClassRelationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__ModuleClassRelationsAssignment_3"


    // $ANTLR start "rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8"
    // InternalSafetyDSL.g:10559:1: rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8 : ( ruleClassTestCaseRelation ) ;
    public final void rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10563:1: ( ( ruleClassTestCaseRelation ) )
            // InternalSafetyDSL.g:10564:2: ( ruleClassTestCaseRelation )
            {
            // InternalSafetyDSL.g:10564:2: ( ruleClassTestCaseRelation )
            // InternalSafetyDSL.g:10565:3: ruleClassTestCaseRelation
            {
             before(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsClassTestCaseRelationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleClassTestCaseRelation();

            state._fsp--;

             after(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsClassTestCaseRelationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8"


    // $ANTLR start "rule__ModuleClassRelation__ModuleAssignment_0"
    // InternalSafetyDSL.g:10574:1: rule__ModuleClassRelation__ModuleAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModuleClassRelation__ModuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10578:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10579:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10579:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10580:3: ( RULE_ID )
            {
             before(grammarAccess.getModuleClassRelationAccess().getModuleArchitecturalElementCrossReference_0_0()); 
            // InternalSafetyDSL.g:10581:3: ( RULE_ID )
            // InternalSafetyDSL.g:10582:4: RULE_ID
            {
             before(grammarAccess.getModuleClassRelationAccess().getModuleArchitecturalElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleClassRelationAccess().getModuleArchitecturalElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getModuleClassRelationAccess().getModuleArchitecturalElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__ModuleAssignment_0"


    // $ANTLR start "rule__ModuleClassRelation__ClassesAssignment_4"
    // InternalSafetyDSL.g:10593:1: rule__ModuleClassRelation__ClassesAssignment_4 : ( ruleClassDef ) ;
    public final void rule__ModuleClassRelation__ClassesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10597:1: ( ( ruleClassDef ) )
            // InternalSafetyDSL.g:10598:2: ( ruleClassDef )
            {
            // InternalSafetyDSL.g:10598:2: ( ruleClassDef )
            // InternalSafetyDSL.g:10599:3: ruleClassDef
            {
             before(grammarAccess.getModuleClassRelationAccess().getClassesClassDefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDef();

            state._fsp--;

             after(grammarAccess.getModuleClassRelationAccess().getClassesClassDefParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__ClassesAssignment_4"


    // $ANTLR start "rule__ModuleClassRelation__ClassesAssignment_5_1"
    // InternalSafetyDSL.g:10608:1: rule__ModuleClassRelation__ClassesAssignment_5_1 : ( ruleClassDef ) ;
    public final void rule__ModuleClassRelation__ClassesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10612:1: ( ( ruleClassDef ) )
            // InternalSafetyDSL.g:10613:2: ( ruleClassDef )
            {
            // InternalSafetyDSL.g:10613:2: ( ruleClassDef )
            // InternalSafetyDSL.g:10614:3: ruleClassDef
            {
             before(grammarAccess.getModuleClassRelationAccess().getClassesClassDefParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDef();

            state._fsp--;

             after(grammarAccess.getModuleClassRelationAccess().getClassesClassDefParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleClassRelation__ClassesAssignment_5_1"


    // $ANTLR start "rule__ClassTestCaseRelation__ClazzAssignment_0"
    // InternalSafetyDSL.g:10623:1: rule__ClassTestCaseRelation__ClazzAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassTestCaseRelation__ClazzAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10627:1: ( ( ( RULE_ID ) ) )
            // InternalSafetyDSL.g:10628:2: ( ( RULE_ID ) )
            {
            // InternalSafetyDSL.g:10628:2: ( ( RULE_ID ) )
            // InternalSafetyDSL.g:10629:3: ( RULE_ID )
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getClazzClassDefCrossReference_0_0()); 
            // InternalSafetyDSL.g:10630:3: ( RULE_ID )
            // InternalSafetyDSL.g:10631:4: RULE_ID
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getClazzClassDefIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassTestCaseRelationAccess().getClazzClassDefIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getClassTestCaseRelationAccess().getClazzClassDefCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__ClazzAssignment_0"


    // $ANTLR start "rule__ClassTestCaseRelation__TestCasesAssignment_4"
    // InternalSafetyDSL.g:10642:1: rule__ClassTestCaseRelation__TestCasesAssignment_4 : ( ruleQualifiedName ) ;
    public final void rule__ClassTestCaseRelation__TestCasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10646:1: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:10647:2: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:10647:2: ( ruleQualifiedName )
            // InternalSafetyDSL.g:10648:3: ruleQualifiedName
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getTestCasesQualifiedNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassTestCaseRelationAccess().getTestCasesQualifiedNameParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__TestCasesAssignment_4"


    // $ANTLR start "rule__ClassTestCaseRelation__TestCasesAssignment_5_1"
    // InternalSafetyDSL.g:10657:1: rule__ClassTestCaseRelation__TestCasesAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__ClassTestCaseRelation__TestCasesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10661:1: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:10662:2: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:10662:2: ( ruleQualifiedName )
            // InternalSafetyDSL.g:10663:3: ruleQualifiedName
            {
             before(grammarAccess.getClassTestCaseRelationAccess().getTestCasesQualifiedNameParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassTestCaseRelationAccess().getTestCasesQualifiedNameParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassTestCaseRelation__TestCasesAssignment_5_1"


    // $ANTLR start "rule__ClassDef__NameAssignment"
    // InternalSafetyDSL.g:10672:1: rule__ClassDef__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__ClassDef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSafetyDSL.g:10676:1: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:10677:2: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:10677:2: ( ruleQualifiedName )
            // InternalSafetyDSL.g:10678:3: ruleQualifiedName
            {
             before(grammarAccess.getClassDefAccess().getNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDefAccess().getNameQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008040001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002900000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002900000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000C010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000C010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000380000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}