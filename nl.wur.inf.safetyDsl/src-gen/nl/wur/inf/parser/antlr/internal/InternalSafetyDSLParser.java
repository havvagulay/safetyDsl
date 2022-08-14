package nl.wur.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.wur.inf.services.SafetyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSafetyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hazard View'", "'{'", "'Elements {'", "'}'", "'Relations {'", "'hazard'", "';'", "'safetyRequirement'", "'consequence'", "'fault'", "'faultTree'", "'OR'", "'AND'", "'('", "')'", "','", "'derivedFrom'", "'causes'", "'causedBy'", "'SafetyTacticView'", "'.'", "'faultAvoidance'", "'type='", "'avoidedFaults='", "'satisfiedRequirements='", "'faultDetection'", "'detectedFaults='", "'faultContainment'", "'containedFaults='", "'Safety-CriticalView'", "'safety-critical'", "'criticalityLevel='", "'implementedSafetyRequirements='", "'implementedTactics='", "'sub-elements='", "'hasState'", "'A'", "'B'", "'C'", "'D'", "'non-safety-critical'", "'monitor'", "'reads'", "'writes'", "'commands'", "'stops'", "'starts'", "'inits'", "'restarts'", "'monitors'", "'reportsFault'", "'ImplementationRelations {'", "'Module-Class Relations'", "'Class-Test Case Relations'", "'composesOf'", "'='", "'testWith'"
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
    public static final int T__67=67;
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

        public InternalSafetyDSLParser(TokenStream input, SafetyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SafetyFramework";
       	}

       	@Override
       	protected SafetyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSafetyFramework"
    // InternalSafetyDSL.g:64:1: entryRuleSafetyFramework returns [EObject current=null] : iv_ruleSafetyFramework= ruleSafetyFramework EOF ;
    public final EObject entryRuleSafetyFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyFramework = null;


        try {
            // InternalSafetyDSL.g:64:56: (iv_ruleSafetyFramework= ruleSafetyFramework EOF )
            // InternalSafetyDSL.g:65:2: iv_ruleSafetyFramework= ruleSafetyFramework EOF
            {
             newCompositeNode(grammarAccess.getSafetyFrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyFramework=ruleSafetyFramework();

            state._fsp--;

             current =iv_ruleSafetyFramework; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyFramework"


    // $ANTLR start "ruleSafetyFramework"
    // InternalSafetyDSL.g:71:1: ruleSafetyFramework returns [EObject current=null] : ( ( (lv_views_0_0= ruleSafetyViewpoint ) )+ ( (lv_detail_1_0= ruleImplementationDetail ) ) ) ;
    public final EObject ruleSafetyFramework() throws RecognitionException {
        EObject current = null;

        EObject lv_views_0_0 = null;

        EObject lv_detail_1_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:77:2: ( ( ( (lv_views_0_0= ruleSafetyViewpoint ) )+ ( (lv_detail_1_0= ruleImplementationDetail ) ) ) )
            // InternalSafetyDSL.g:78:2: ( ( (lv_views_0_0= ruleSafetyViewpoint ) )+ ( (lv_detail_1_0= ruleImplementationDetail ) ) )
            {
            // InternalSafetyDSL.g:78:2: ( ( (lv_views_0_0= ruleSafetyViewpoint ) )+ ( (lv_detail_1_0= ruleImplementationDetail ) ) )
            // InternalSafetyDSL.g:79:3: ( (lv_views_0_0= ruleSafetyViewpoint ) )+ ( (lv_detail_1_0= ruleImplementationDetail ) )
            {
            // InternalSafetyDSL.g:79:3: ( (lv_views_0_0= ruleSafetyViewpoint ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==30||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSafetyDSL.g:80:4: (lv_views_0_0= ruleSafetyViewpoint )
            	    {
            	    // InternalSafetyDSL.g:80:4: (lv_views_0_0= ruleSafetyViewpoint )
            	    // InternalSafetyDSL.g:81:5: lv_views_0_0= ruleSafetyViewpoint
            	    {

            	    					newCompositeNode(grammarAccess.getSafetyFrameworkAccess().getViewsSafetyViewpointParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_views_0_0=ruleSafetyViewpoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSafetyFrameworkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"views",
            	    						lv_views_0_0,
            	    						"nl.wur.inf.SafetyDSL.SafetyViewpoint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalSafetyDSL.g:98:3: ( (lv_detail_1_0= ruleImplementationDetail ) )
            // InternalSafetyDSL.g:99:4: (lv_detail_1_0= ruleImplementationDetail )
            {
            // InternalSafetyDSL.g:99:4: (lv_detail_1_0= ruleImplementationDetail )
            // InternalSafetyDSL.g:100:5: lv_detail_1_0= ruleImplementationDetail
            {

            					newCompositeNode(grammarAccess.getSafetyFrameworkAccess().getDetailImplementationDetailParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_detail_1_0=ruleImplementationDetail();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyFrameworkRule());
            					}
            					set(
            						current,
            						"detail",
            						lv_detail_1_0,
            						"nl.wur.inf.SafetyDSL.ImplementationDetail");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSafetyFramework"


    // $ANTLR start "entryRuleSafetyViewpoint"
    // InternalSafetyDSL.g:121:1: entryRuleSafetyViewpoint returns [EObject current=null] : iv_ruleSafetyViewpoint= ruleSafetyViewpoint EOF ;
    public final EObject entryRuleSafetyViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyViewpoint = null;


        try {
            // InternalSafetyDSL.g:121:56: (iv_ruleSafetyViewpoint= ruleSafetyViewpoint EOF )
            // InternalSafetyDSL.g:122:2: iv_ruleSafetyViewpoint= ruleSafetyViewpoint EOF
            {
             newCompositeNode(grammarAccess.getSafetyViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyViewpoint=ruleSafetyViewpoint();

            state._fsp--;

             current =iv_ruleSafetyViewpoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyViewpoint"


    // $ANTLR start "ruleSafetyViewpoint"
    // InternalSafetyDSL.g:128:1: ruleSafetyViewpoint returns [EObject current=null] : (this_HazardViewpoint_0= ruleHazardViewpoint | this_SafetyTacticViewpoint_1= ruleSafetyTacticViewpoint | this_SafetyCriticalViewpoint_2= ruleSafetyCriticalViewpoint ) ;
    public final EObject ruleSafetyViewpoint() throws RecognitionException {
        EObject current = null;

        EObject this_HazardViewpoint_0 = null;

        EObject this_SafetyTacticViewpoint_1 = null;

        EObject this_SafetyCriticalViewpoint_2 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:134:2: ( (this_HazardViewpoint_0= ruleHazardViewpoint | this_SafetyTacticViewpoint_1= ruleSafetyTacticViewpoint | this_SafetyCriticalViewpoint_2= ruleSafetyCriticalViewpoint ) )
            // InternalSafetyDSL.g:135:2: (this_HazardViewpoint_0= ruleHazardViewpoint | this_SafetyTacticViewpoint_1= ruleSafetyTacticViewpoint | this_SafetyCriticalViewpoint_2= ruleSafetyCriticalViewpoint )
            {
            // InternalSafetyDSL.g:135:2: (this_HazardViewpoint_0= ruleHazardViewpoint | this_SafetyTacticViewpoint_1= ruleSafetyTacticViewpoint | this_SafetyCriticalViewpoint_2= ruleSafetyCriticalViewpoint )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 40:
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
                    // InternalSafetyDSL.g:136:3: this_HazardViewpoint_0= ruleHazardViewpoint
                    {

                    			newCompositeNode(grammarAccess.getSafetyViewpointAccess().getHazardViewpointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HazardViewpoint_0=ruleHazardViewpoint();

                    state._fsp--;


                    			current = this_HazardViewpoint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:145:3: this_SafetyTacticViewpoint_1= ruleSafetyTacticViewpoint
                    {

                    			newCompositeNode(grammarAccess.getSafetyViewpointAccess().getSafetyTacticViewpointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyTacticViewpoint_1=ruleSafetyTacticViewpoint();

                    state._fsp--;


                    			current = this_SafetyTacticViewpoint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:154:3: this_SafetyCriticalViewpoint_2= ruleSafetyCriticalViewpoint
                    {

                    			newCompositeNode(grammarAccess.getSafetyViewpointAccess().getSafetyCriticalViewpointParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyCriticalViewpoint_2=ruleSafetyCriticalViewpoint();

                    state._fsp--;


                    			current = this_SafetyCriticalViewpoint_2;
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
    // $ANTLR end "ruleSafetyViewpoint"


    // $ANTLR start "entryRuleHazardViewpoint"
    // InternalSafetyDSL.g:166:1: entryRuleHazardViewpoint returns [EObject current=null] : iv_ruleHazardViewpoint= ruleHazardViewpoint EOF ;
    public final EObject entryRuleHazardViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardViewpoint = null;


        try {
            // InternalSafetyDSL.g:166:56: (iv_ruleHazardViewpoint= ruleHazardViewpoint EOF )
            // InternalSafetyDSL.g:167:2: iv_ruleHazardViewpoint= ruleHazardViewpoint EOF
            {
             newCompositeNode(grammarAccess.getHazardViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHazardViewpoint=ruleHazardViewpoint();

            state._fsp--;

             current =iv_ruleHazardViewpoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazardViewpoint"


    // $ANTLR start "ruleHazardViewpoint"
    // InternalSafetyDSL.g:173:1: ruleHazardViewpoint returns [EObject current=null] : (otherlv_0= 'Hazard View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleHazardElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleHazardRelation ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleHazardViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_4_0 = null;

        EObject lv_relations_7_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:179:2: ( (otherlv_0= 'Hazard View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleHazardElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleHazardRelation ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSafetyDSL.g:180:2: (otherlv_0= 'Hazard View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleHazardElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleHazardRelation ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSafetyDSL.g:180:2: (otherlv_0= 'Hazard View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleHazardElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleHazardRelation ) )+ otherlv_8= '}' otherlv_9= '}' )
            // InternalSafetyDSL.g:181:3: otherlv_0= 'Hazard View' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleHazardElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleHazardRelation ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHazardViewpointAccess().getHazardViewKeyword_0());
            		
            // InternalSafetyDSL.g:185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:186:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHazardViewpointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHazardViewpointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getHazardViewpointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getHazardViewpointAccess().getElementsKeyword_3());
            		
            // InternalSafetyDSL.g:211:3: ( (lv_elements_4_0= ruleHazardElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=18 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSafetyDSL.g:212:4: (lv_elements_4_0= ruleHazardElement )
            	    {
            	    // InternalSafetyDSL.g:212:4: (lv_elements_4_0= ruleHazardElement )
            	    // InternalSafetyDSL.g:213:5: lv_elements_4_0= ruleHazardElement
            	    {

            	    					newCompositeNode(grammarAccess.getHazardViewpointAccess().getElementsHazardElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_4_0=ruleHazardElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHazardViewpointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"nl.wur.inf.SafetyDSL.HazardElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getHazardViewpointAccess().getRelationsKeyword_6());
            		
            // InternalSafetyDSL.g:238:3: ( (lv_relations_7_0= ruleHazardRelation ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSafetyDSL.g:239:4: (lv_relations_7_0= ruleHazardRelation )
            	    {
            	    // InternalSafetyDSL.g:239:4: (lv_relations_7_0= ruleHazardRelation )
            	    // InternalSafetyDSL.g:240:5: lv_relations_7_0= ruleHazardRelation
            	    {

            	    					newCompositeNode(grammarAccess.getHazardViewpointAccess().getRelationsHazardRelationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_relations_7_0=ruleHazardRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHazardViewpointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_7_0,
            	    						"nl.wur.inf.SafetyDSL.HazardRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getHazardViewpointAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleHazardViewpoint"


    // $ANTLR start "entryRuleHazardElement"
    // InternalSafetyDSL.g:269:1: entryRuleHazardElement returns [EObject current=null] : iv_ruleHazardElement= ruleHazardElement EOF ;
    public final EObject entryRuleHazardElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardElement = null;


        try {
            // InternalSafetyDSL.g:269:54: (iv_ruleHazardElement= ruleHazardElement EOF )
            // InternalSafetyDSL.g:270:2: iv_ruleHazardElement= ruleHazardElement EOF
            {
             newCompositeNode(grammarAccess.getHazardElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHazardElement=ruleHazardElement();

            state._fsp--;

             current =iv_ruleHazardElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazardElement"


    // $ANTLR start "ruleHazardElement"
    // InternalSafetyDSL.g:276:1: ruleHazardElement returns [EObject current=null] : (this_Hazard_0= ruleHazard | this_SafetyRequirement_1= ruleSafetyRequirement | this_Consequence_2= ruleConsequence | this_Fault_3= ruleFault | this_FaultTree_4= ruleFaultTree ) ;
    public final EObject ruleHazardElement() throws RecognitionException {
        EObject current = null;

        EObject this_Hazard_0 = null;

        EObject this_SafetyRequirement_1 = null;

        EObject this_Consequence_2 = null;

        EObject this_Fault_3 = null;

        EObject this_FaultTree_4 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:282:2: ( (this_Hazard_0= ruleHazard | this_SafetyRequirement_1= ruleSafetyRequirement | this_Consequence_2= ruleConsequence | this_Fault_3= ruleFault | this_FaultTree_4= ruleFaultTree ) )
            // InternalSafetyDSL.g:283:2: (this_Hazard_0= ruleHazard | this_SafetyRequirement_1= ruleSafetyRequirement | this_Consequence_2= ruleConsequence | this_Fault_3= ruleFault | this_FaultTree_4= ruleFaultTree )
            {
            // InternalSafetyDSL.g:283:2: (this_Hazard_0= ruleHazard | this_SafetyRequirement_1= ruleSafetyRequirement | this_Consequence_2= ruleConsequence | this_Fault_3= ruleFault | this_FaultTree_4= ruleFaultTree )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSafetyDSL.g:284:3: this_Hazard_0= ruleHazard
                    {

                    			newCompositeNode(grammarAccess.getHazardElementAccess().getHazardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hazard_0=ruleHazard();

                    state._fsp--;


                    			current = this_Hazard_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:293:3: this_SafetyRequirement_1= ruleSafetyRequirement
                    {

                    			newCompositeNode(grammarAccess.getHazardElementAccess().getSafetyRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyRequirement_1=ruleSafetyRequirement();

                    state._fsp--;


                    			current = this_SafetyRequirement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:302:3: this_Consequence_2= ruleConsequence
                    {

                    			newCompositeNode(grammarAccess.getHazardElementAccess().getConsequenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Consequence_2=ruleConsequence();

                    state._fsp--;


                    			current = this_Consequence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSafetyDSL.g:311:3: this_Fault_3= ruleFault
                    {

                    			newCompositeNode(grammarAccess.getHazardElementAccess().getFaultParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fault_3=ruleFault();

                    state._fsp--;


                    			current = this_Fault_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSafetyDSL.g:320:3: this_FaultTree_4= ruleFaultTree
                    {

                    			newCompositeNode(grammarAccess.getHazardElementAccess().getFaultTreeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FaultTree_4=ruleFaultTree();

                    state._fsp--;


                    			current = this_FaultTree_4;
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
    // $ANTLR end "ruleHazardElement"


    // $ANTLR start "entryRuleHazard"
    // InternalSafetyDSL.g:332:1: entryRuleHazard returns [EObject current=null] : iv_ruleHazard= ruleHazard EOF ;
    public final EObject entryRuleHazard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazard = null;


        try {
            // InternalSafetyDSL.g:332:47: (iv_ruleHazard= ruleHazard EOF )
            // InternalSafetyDSL.g:333:2: iv_ruleHazard= ruleHazard EOF
            {
             newCompositeNode(grammarAccess.getHazardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHazard=ruleHazard();

            state._fsp--;

             current =iv_ruleHazard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazard"


    // $ANTLR start "ruleHazard"
    // InternalSafetyDSL.g:339:1: ruleHazard returns [EObject current=null] : (otherlv_0= 'hazard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleHazard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:345:2: ( (otherlv_0= 'hazard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSafetyDSL.g:346:2: (otherlv_0= 'hazard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSafetyDSL.g:346:2: (otherlv_0= 'hazard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSafetyDSL.g:347:3: otherlv_0= 'hazard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHazardAccess().getHazardKeyword_0());
            		
            // InternalSafetyDSL.g:351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:352:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHazardAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHazardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getHazardAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleHazard"


    // $ANTLR start "entryRuleSafetyRequirement"
    // InternalSafetyDSL.g:377:1: entryRuleSafetyRequirement returns [EObject current=null] : iv_ruleSafetyRequirement= ruleSafetyRequirement EOF ;
    public final EObject entryRuleSafetyRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyRequirement = null;


        try {
            // InternalSafetyDSL.g:377:58: (iv_ruleSafetyRequirement= ruleSafetyRequirement EOF )
            // InternalSafetyDSL.g:378:2: iv_ruleSafetyRequirement= ruleSafetyRequirement EOF
            {
             newCompositeNode(grammarAccess.getSafetyRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyRequirement=ruleSafetyRequirement();

            state._fsp--;

             current =iv_ruleSafetyRequirement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyRequirement"


    // $ANTLR start "ruleSafetyRequirement"
    // InternalSafetyDSL.g:384:1: ruleSafetyRequirement returns [EObject current=null] : (otherlv_0= 'safetyRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleSafetyRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subrequirements_4_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:390:2: ( (otherlv_0= 'safetyRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}' )? ) )
            // InternalSafetyDSL.g:391:2: (otherlv_0= 'safetyRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}' )? )
            {
            // InternalSafetyDSL.g:391:2: (otherlv_0= 'safetyRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}' )? )
            // InternalSafetyDSL.g:392:3: otherlv_0= 'safetyRequirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' (otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyRequirementAccess().getSafetyRequirementKeyword_0());
            		
            // InternalSafetyDSL.g:396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:397:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:398:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSafetyRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyRequirementAccess().getSemicolonKeyword_2());
            		
            // InternalSafetyDSL.g:418:3: (otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSafetyDSL.g:419:4: otherlv_3= '{' ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getSafetyRequirementAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalSafetyDSL.g:423:4: ( (lv_subrequirements_4_0= ruleSafetyRequirement ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:424:5: (lv_subrequirements_4_0= ruleSafetyRequirement )
                    	    {
                    	    // InternalSafetyDSL.g:424:5: (lv_subrequirements_4_0= ruleSafetyRequirement )
                    	    // InternalSafetyDSL.g:425:6: lv_subrequirements_4_0= ruleSafetyRequirement
                    	    {

                    	    						newCompositeNode(grammarAccess.getSafetyRequirementAccess().getSubrequirementsSafetyRequirementParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_subrequirements_4_0=ruleSafetyRequirement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSafetyRequirementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subrequirements",
                    	    							lv_subrequirements_4_0,
                    	    							"nl.wur.inf.SafetyDSL.SafetyRequirement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyRequirementAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleSafetyRequirement"


    // $ANTLR start "entryRuleConsequence"
    // InternalSafetyDSL.g:451:1: entryRuleConsequence returns [EObject current=null] : iv_ruleConsequence= ruleConsequence EOF ;
    public final EObject entryRuleConsequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsequence = null;


        try {
            // InternalSafetyDSL.g:451:52: (iv_ruleConsequence= ruleConsequence EOF )
            // InternalSafetyDSL.g:452:2: iv_ruleConsequence= ruleConsequence EOF
            {
             newCompositeNode(grammarAccess.getConsequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsequence=ruleConsequence();

            state._fsp--;

             current =iv_ruleConsequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsequence"


    // $ANTLR start "ruleConsequence"
    // InternalSafetyDSL.g:458:1: ruleConsequence returns [EObject current=null] : (otherlv_0= 'consequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleConsequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:464:2: ( (otherlv_0= 'consequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSafetyDSL.g:465:2: (otherlv_0= 'consequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSafetyDSL.g:465:2: (otherlv_0= 'consequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSafetyDSL.g:466:3: otherlv_0= 'consequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConsequenceAccess().getConsequenceKeyword_0());
            		
            // InternalSafetyDSL.g:470:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:471:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:471:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:472:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConsequenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConsequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConsequenceAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleConsequence"


    // $ANTLR start "entryRuleFault"
    // InternalSafetyDSL.g:496:1: entryRuleFault returns [EObject current=null] : iv_ruleFault= ruleFault EOF ;
    public final EObject entryRuleFault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFault = null;


        try {
            // InternalSafetyDSL.g:496:46: (iv_ruleFault= ruleFault EOF )
            // InternalSafetyDSL.g:497:2: iv_ruleFault= ruleFault EOF
            {
             newCompositeNode(grammarAccess.getFaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFault=ruleFault();

            state._fsp--;

             current =iv_ruleFault; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFault"


    // $ANTLR start "ruleFault"
    // InternalSafetyDSL.g:503:1: ruleFault returns [EObject current=null] : (otherlv_0= 'fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleFault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:509:2: ( (otherlv_0= 'fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalSafetyDSL.g:510:2: (otherlv_0= 'fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalSafetyDSL.g:510:2: (otherlv_0= 'fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalSafetyDSL.g:511:3: otherlv_0= 'fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFaultAccess().getFaultKeyword_0());
            		
            // InternalSafetyDSL.g:515:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:516:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:516:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:517:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFaultAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFaultAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleFault"


    // $ANTLR start "entryRuleFaultTree"
    // InternalSafetyDSL.g:541:1: entryRuleFaultTree returns [EObject current=null] : iv_ruleFaultTree= ruleFaultTree EOF ;
    public final EObject entryRuleFaultTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaultTree = null;


        try {
            // InternalSafetyDSL.g:541:50: (iv_ruleFaultTree= ruleFaultTree EOF )
            // InternalSafetyDSL.g:542:2: iv_ruleFaultTree= ruleFaultTree EOF
            {
             newCompositeNode(grammarAccess.getFaultTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaultTree=ruleFaultTree();

            state._fsp--;

             current =iv_ruleFaultTree; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultTree"


    // $ANTLR start "ruleFaultTree"
    // InternalSafetyDSL.g:548:1: ruleFaultTree returns [EObject current=null] : (otherlv_0= 'faultTree' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rootNode_2_0= rulePrimaryNode ) ) otherlv_3= ';' ) ;
    public final EObject ruleFaultTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_rootNode_2_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:554:2: ( (otherlv_0= 'faultTree' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rootNode_2_0= rulePrimaryNode ) ) otherlv_3= ';' ) )
            // InternalSafetyDSL.g:555:2: (otherlv_0= 'faultTree' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rootNode_2_0= rulePrimaryNode ) ) otherlv_3= ';' )
            {
            // InternalSafetyDSL.g:555:2: (otherlv_0= 'faultTree' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rootNode_2_0= rulePrimaryNode ) ) otherlv_3= ';' )
            // InternalSafetyDSL.g:556:3: otherlv_0= 'faultTree' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rootNode_2_0= rulePrimaryNode ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFaultTreeAccess().getFaultTreeKeyword_0());
            		
            // InternalSafetyDSL.g:560:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:561:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:561:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:562:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFaultTreeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultTreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSafetyDSL.g:578:3: ( (lv_rootNode_2_0= rulePrimaryNode ) )
            // InternalSafetyDSL.g:579:4: (lv_rootNode_2_0= rulePrimaryNode )
            {
            // InternalSafetyDSL.g:579:4: (lv_rootNode_2_0= rulePrimaryNode )
            // InternalSafetyDSL.g:580:5: lv_rootNode_2_0= rulePrimaryNode
            {

            					newCompositeNode(grammarAccess.getFaultTreeAccess().getRootNodePrimaryNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_rootNode_2_0=rulePrimaryNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFaultTreeRule());
            					}
            					set(
            						current,
            						"rootNode",
            						lv_rootNode_2_0,
            						"nl.wur.inf.SafetyDSL.PrimaryNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFaultTreeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleFaultTree"


    // $ANTLR start "entryRuleORNode"
    // InternalSafetyDSL.g:605:1: entryRuleORNode returns [EObject current=null] : iv_ruleORNode= ruleORNode EOF ;
    public final EObject entryRuleORNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORNode = null;


        try {
            // InternalSafetyDSL.g:605:47: (iv_ruleORNode= ruleORNode EOF )
            // InternalSafetyDSL.g:606:2: iv_ruleORNode= ruleORNode EOF
            {
             newCompositeNode(grammarAccess.getORNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORNode=ruleORNode();

            state._fsp--;

             current =iv_ruleORNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleORNode"


    // $ANTLR start "ruleORNode"
    // InternalSafetyDSL.g:612:1: ruleORNode returns [EObject current=null] : (this_ANDNode_0= ruleANDNode ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) ) )* ) ;
    public final EObject ruleORNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ANDNode_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:618:2: ( (this_ANDNode_0= ruleANDNode ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) ) )* ) )
            // InternalSafetyDSL.g:619:2: (this_ANDNode_0= ruleANDNode ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) ) )* )
            {
            // InternalSafetyDSL.g:619:2: (this_ANDNode_0= ruleANDNode ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) ) )* )
            // InternalSafetyDSL.g:620:3: this_ANDNode_0= ruleANDNode ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) ) )*
            {

            			newCompositeNode(grammarAccess.getORNodeAccess().getANDNodeParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_ANDNode_0=ruleANDNode();

            state._fsp--;


            			current = this_ANDNode_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSafetyDSL.g:628:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSafetyDSL.g:629:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleANDNode ) )
            	    {
            	    // InternalSafetyDSL.g:629:4: ()
            	    // InternalSafetyDSL.g:630:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORNodeAccess().getORNodeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getORNodeAccess().getORKeyword_1_1());
            	    			
            	    // InternalSafetyDSL.g:640:4: ( (lv_right_3_0= ruleANDNode ) )
            	    // InternalSafetyDSL.g:641:5: (lv_right_3_0= ruleANDNode )
            	    {
            	    // InternalSafetyDSL.g:641:5: (lv_right_3_0= ruleANDNode )
            	    // InternalSafetyDSL.g:642:6: lv_right_3_0= ruleANDNode
            	    {

            	    						newCompositeNode(grammarAccess.getORNodeAccess().getRightANDNodeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleANDNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORNodeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.wur.inf.SafetyDSL.ANDNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleORNode"


    // $ANTLR start "entryRuleANDNode"
    // InternalSafetyDSL.g:664:1: entryRuleANDNode returns [EObject current=null] : iv_ruleANDNode= ruleANDNode EOF ;
    public final EObject entryRuleANDNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDNode = null;


        try {
            // InternalSafetyDSL.g:664:48: (iv_ruleANDNode= ruleANDNode EOF )
            // InternalSafetyDSL.g:665:2: iv_ruleANDNode= ruleANDNode EOF
            {
             newCompositeNode(grammarAccess.getANDNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDNode=ruleANDNode();

            state._fsp--;

             current =iv_ruleANDNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleANDNode"


    // $ANTLR start "ruleANDNode"
    // InternalSafetyDSL.g:671:1: ruleANDNode returns [EObject current=null] : (this_PrimaryNode_0= rulePrimaryNode ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) ) )* ) ;
    public final EObject ruleANDNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryNode_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:677:2: ( (this_PrimaryNode_0= rulePrimaryNode ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) ) )* ) )
            // InternalSafetyDSL.g:678:2: (this_PrimaryNode_0= rulePrimaryNode ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) ) )* )
            {
            // InternalSafetyDSL.g:678:2: (this_PrimaryNode_0= rulePrimaryNode ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) ) )* )
            // InternalSafetyDSL.g:679:3: this_PrimaryNode_0= rulePrimaryNode ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDNodeAccess().getPrimaryNodeParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_PrimaryNode_0=rulePrimaryNode();

            state._fsp--;


            			current = this_PrimaryNode_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSafetyDSL.g:687:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSafetyDSL.g:688:4: () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryNode ) )
            	    {
            	    // InternalSafetyDSL.g:688:4: ()
            	    // InternalSafetyDSL.g:689:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDNodeAccess().getANDNodeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getANDNodeAccess().getANDKeyword_1_1());
            	    			
            	    // InternalSafetyDSL.g:699:4: ( (lv_right_3_0= rulePrimaryNode ) )
            	    // InternalSafetyDSL.g:700:5: (lv_right_3_0= rulePrimaryNode )
            	    {
            	    // InternalSafetyDSL.g:700:5: (lv_right_3_0= rulePrimaryNode )
            	    // InternalSafetyDSL.g:701:6: lv_right_3_0= rulePrimaryNode
            	    {

            	    						newCompositeNode(grammarAccess.getANDNodeAccess().getRightPrimaryNodeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=rulePrimaryNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDNodeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"nl.wur.inf.SafetyDSL.PrimaryNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleANDNode"


    // $ANTLR start "entryRulePrimaryNode"
    // InternalSafetyDSL.g:723:1: entryRulePrimaryNode returns [EObject current=null] : iv_rulePrimaryNode= rulePrimaryNode EOF ;
    public final EObject entryRulePrimaryNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryNode = null;


        try {
            // InternalSafetyDSL.g:723:52: (iv_rulePrimaryNode= rulePrimaryNode EOF )
            // InternalSafetyDSL.g:724:2: iv_rulePrimaryNode= rulePrimaryNode EOF
            {
             newCompositeNode(grammarAccess.getPrimaryNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryNode=rulePrimaryNode();

            state._fsp--;

             current =iv_rulePrimaryNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryNode"


    // $ANTLR start "rulePrimaryNode"
    // InternalSafetyDSL.g:730:1: rulePrimaryNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ORNode_2 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:736:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')' ) ) )
            // InternalSafetyDSL.g:737:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')' ) )
            {
            // InternalSafetyDSL.g:737:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSafetyDSL.g:738:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalSafetyDSL.g:738:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSafetyDSL.g:739:4: (otherlv_0= RULE_ID )
                    {
                    // InternalSafetyDSL.g:739:4: (otherlv_0= RULE_ID )
                    // InternalSafetyDSL.g:740:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryNodeRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getPrimaryNodeAccess().getValueFaultCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:752:3: (otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')' )
                    {
                    // InternalSafetyDSL.g:752:3: (otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')' )
                    // InternalSafetyDSL.g:753:4: otherlv_1= '(' this_ORNode_2= ruleORNode otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryNodeAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryNodeAccess().getORNodeParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_ORNode_2=ruleORNode();

                    state._fsp--;


                    				current = this_ORNode_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryNodeAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePrimaryNode"


    // $ANTLR start "entryRuleHazardRelation"
    // InternalSafetyDSL.g:774:1: entryRuleHazardRelation returns [EObject current=null] : iv_ruleHazardRelation= ruleHazardRelation EOF ;
    public final EObject entryRuleHazardRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardRelation = null;


        try {
            // InternalSafetyDSL.g:774:55: (iv_ruleHazardRelation= ruleHazardRelation EOF )
            // InternalSafetyDSL.g:775:2: iv_ruleHazardRelation= ruleHazardRelation EOF
            {
             newCompositeNode(grammarAccess.getHazardRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHazardRelation=ruleHazardRelation();

            state._fsp--;

             current =iv_ruleHazardRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHazardRelation"


    // $ANTLR start "ruleHazardRelation"
    // InternalSafetyDSL.g:781:1: ruleHazardRelation returns [EObject current=null] : (this_DerivedFrom_0= ruleDerivedFrom | this_Causes_1= ruleCauses | this_CausedBy_2= ruleCausedBy ) ;
    public final EObject ruleHazardRelation() throws RecognitionException {
        EObject current = null;

        EObject this_DerivedFrom_0 = null;

        EObject this_Causes_1 = null;

        EObject this_CausedBy_2 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:787:2: ( (this_DerivedFrom_0= ruleDerivedFrom | this_Causes_1= ruleCauses | this_CausedBy_2= ruleCausedBy ) )
            // InternalSafetyDSL.g:788:2: (this_DerivedFrom_0= ruleDerivedFrom | this_Causes_1= ruleCauses | this_CausedBy_2= ruleCausedBy )
            {
            // InternalSafetyDSL.g:788:2: (this_DerivedFrom_0= ruleDerivedFrom | this_Causes_1= ruleCauses | this_CausedBy_2= ruleCausedBy )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 26:
                case 27:
                    {
                    alt11=1;
                    }
                    break;
                case 29:
                    {
                    alt11=3;
                    }
                    break;
                case 28:
                    {
                    alt11=2;
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
                    // InternalSafetyDSL.g:789:3: this_DerivedFrom_0= ruleDerivedFrom
                    {

                    			newCompositeNode(grammarAccess.getHazardRelationAccess().getDerivedFromParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedFrom_0=ruleDerivedFrom();

                    state._fsp--;


                    			current = this_DerivedFrom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:798:3: this_Causes_1= ruleCauses
                    {

                    			newCompositeNode(grammarAccess.getHazardRelationAccess().getCausesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Causes_1=ruleCauses();

                    state._fsp--;


                    			current = this_Causes_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:807:3: this_CausedBy_2= ruleCausedBy
                    {

                    			newCompositeNode(grammarAccess.getHazardRelationAccess().getCausedByParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CausedBy_2=ruleCausedBy();

                    state._fsp--;


                    			current = this_CausedBy_2;
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
    // $ANTLR end "ruleHazardRelation"


    // $ANTLR start "entryRuleDerivedFrom"
    // InternalSafetyDSL.g:819:1: entryRuleDerivedFrom returns [EObject current=null] : iv_ruleDerivedFrom= ruleDerivedFrom EOF ;
    public final EObject entryRuleDerivedFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedFrom = null;


        try {
            // InternalSafetyDSL.g:819:52: (iv_ruleDerivedFrom= ruleDerivedFrom EOF )
            // InternalSafetyDSL.g:820:2: iv_ruleDerivedFrom= ruleDerivedFrom EOF
            {
             newCompositeNode(grammarAccess.getDerivedFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedFrom=ruleDerivedFrom();

            state._fsp--;

             current =iv_ruleDerivedFrom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDerivedFrom"


    // $ANTLR start "ruleDerivedFrom"
    // InternalSafetyDSL.g:826:1: ruleDerivedFrom returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'derivedFrom' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleDerivedFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:832:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'derivedFrom' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalSafetyDSL.g:833:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'derivedFrom' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalSafetyDSL.g:833:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'derivedFrom' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalSafetyDSL.g:834:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= 'derivedFrom' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalSafetyDSL.g:834:3: ( (otherlv_0= RULE_ID ) )
            // InternalSafetyDSL.g:835:4: (otherlv_0= RULE_ID )
            {
            // InternalSafetyDSL.g:835:4: (otherlv_0= RULE_ID )
            // InternalSafetyDSL.g:836:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedFromRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementCrossReference_0_0());
            				

            }


            }

            // InternalSafetyDSL.g:847:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSafetyDSL.g:848:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDerivedFromAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalSafetyDSL.g:852:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalSafetyDSL.g:853:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalSafetyDSL.g:853:5: (otherlv_2= RULE_ID )
            	    // InternalSafetyDSL.g:854:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDerivedFromRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_2, grammarAccess.getDerivedFromAccess().getSafetyRequirementsSafetyRequirementCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedFromAccess().getDerivedFromKeyword_2());
            		
            // InternalSafetyDSL.g:870:3: ( (otherlv_4= RULE_ID ) )
            // InternalSafetyDSL.g:871:4: (otherlv_4= RULE_ID )
            {
            // InternalSafetyDSL.g:871:4: (otherlv_4= RULE_ID )
            // InternalSafetyDSL.g:872:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedFromRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getDerivedFromAccess().getHazardHazardCrossReference_3_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDerivedFromAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDerivedFrom"


    // $ANTLR start "entryRuleCauses"
    // InternalSafetyDSL.g:891:1: entryRuleCauses returns [EObject current=null] : iv_ruleCauses= ruleCauses EOF ;
    public final EObject entryRuleCauses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCauses = null;


        try {
            // InternalSafetyDSL.g:891:47: (iv_ruleCauses= ruleCauses EOF )
            // InternalSafetyDSL.g:892:2: iv_ruleCauses= ruleCauses EOF
            {
             newCompositeNode(grammarAccess.getCausesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCauses=ruleCauses();

            state._fsp--;

             current =iv_ruleCauses; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCauses"


    // $ANTLR start "ruleCauses"
    // InternalSafetyDSL.g:898:1: ruleCauses returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causes' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleCauses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:904:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causes' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalSafetyDSL.g:905:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causes' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalSafetyDSL.g:905:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causes' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalSafetyDSL.g:906:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causes' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';'
            {
            // InternalSafetyDSL.g:906:3: ( (otherlv_0= RULE_ID ) )
            // InternalSafetyDSL.g:907:4: (otherlv_0= RULE_ID )
            {
            // InternalSafetyDSL.g:907:4: (otherlv_0= RULE_ID )
            // InternalSafetyDSL.g:908:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCausesRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getCausesAccess().getHazardHazardCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCausesAccess().getCausesKeyword_1());
            		
            // InternalSafetyDSL.g:923:3: ( (otherlv_2= RULE_ID ) )
            // InternalSafetyDSL.g:924:4: (otherlv_2= RULE_ID )
            {
            // InternalSafetyDSL.g:924:4: (otherlv_2= RULE_ID )
            // InternalSafetyDSL.g:925:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCausesRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getCausesAccess().getConsequencesConsequenceCrossReference_2_0());
            				

            }


            }

            // InternalSafetyDSL.g:936:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSafetyDSL.g:937:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCausesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSafetyDSL.g:941:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSafetyDSL.g:942:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSafetyDSL.g:942:5: (otherlv_4= RULE_ID )
            	    // InternalSafetyDSL.g:943:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCausesRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_4, grammarAccess.getCausesAccess().getConsequencesConsequenceCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCausesAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleCauses"


    // $ANTLR start "entryRuleCausedBy"
    // InternalSafetyDSL.g:963:1: entryRuleCausedBy returns [EObject current=null] : iv_ruleCausedBy= ruleCausedBy EOF ;
    public final EObject entryRuleCausedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausedBy = null;


        try {
            // InternalSafetyDSL.g:963:49: (iv_ruleCausedBy= ruleCausedBy EOF )
            // InternalSafetyDSL.g:964:2: iv_ruleCausedBy= ruleCausedBy EOF
            {
             newCompositeNode(grammarAccess.getCausedByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCausedBy=ruleCausedBy();

            state._fsp--;

             current =iv_ruleCausedBy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCausedBy"


    // $ANTLR start "ruleCausedBy"
    // InternalSafetyDSL.g:970:1: ruleCausedBy returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causedBy' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCausedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:976:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causedBy' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSafetyDSL.g:977:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causedBy' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSafetyDSL.g:977:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causedBy' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalSafetyDSL.g:978:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'causedBy' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSafetyDSL.g:978:3: ( (otherlv_0= RULE_ID ) )
            // InternalSafetyDSL.g:979:4: (otherlv_0= RULE_ID )
            {
            // InternalSafetyDSL.g:979:4: (otherlv_0= RULE_ID )
            // InternalSafetyDSL.g:980:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCausedByRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getCausedByAccess().getHazardHazardCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCausedByAccess().getCausedByKeyword_1());
            		
            // InternalSafetyDSL.g:995:3: ( (otherlv_2= RULE_ID ) )
            // InternalSafetyDSL.g:996:4: (otherlv_2= RULE_ID )
            {
            // InternalSafetyDSL.g:996:4: (otherlv_2= RULE_ID )
            // InternalSafetyDSL.g:997:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCausedByRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getCausedByAccess().getFaultFaultTreeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCausedByAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleCausedBy"


    // $ANTLR start "entryRuleSafetyTacticViewpoint"
    // InternalSafetyDSL.g:1016:1: entryRuleSafetyTacticViewpoint returns [EObject current=null] : iv_ruleSafetyTacticViewpoint= ruleSafetyTacticViewpoint EOF ;
    public final EObject entryRuleSafetyTacticViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyTacticViewpoint = null;


        try {
            // InternalSafetyDSL.g:1016:62: (iv_ruleSafetyTacticViewpoint= ruleSafetyTacticViewpoint EOF )
            // InternalSafetyDSL.g:1017:2: iv_ruleSafetyTacticViewpoint= ruleSafetyTacticViewpoint EOF
            {
             newCompositeNode(grammarAccess.getSafetyTacticViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyTacticViewpoint=ruleSafetyTacticViewpoint();

            state._fsp--;

             current =iv_ruleSafetyTacticViewpoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyTacticViewpoint"


    // $ANTLR start "ruleSafetyTacticViewpoint"
    // InternalSafetyDSL.g:1023:1: ruleSafetyTacticViewpoint returns [EObject current=null] : (otherlv_0= 'SafetyTacticView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_safetyTactics_3_0= ruleSafetyTactic ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSafetyTacticViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_safetyTactics_3_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:1029:2: ( (otherlv_0= 'SafetyTacticView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_safetyTactics_3_0= ruleSafetyTactic ) )+ otherlv_4= '}' ) )
            // InternalSafetyDSL.g:1030:2: (otherlv_0= 'SafetyTacticView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_safetyTactics_3_0= ruleSafetyTactic ) )+ otherlv_4= '}' )
            {
            // InternalSafetyDSL.g:1030:2: (otherlv_0= 'SafetyTacticView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_safetyTactics_3_0= ruleSafetyTactic ) )+ otherlv_4= '}' )
            // InternalSafetyDSL.g:1031:3: otherlv_0= 'SafetyTacticView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_safetyTactics_3_0= ruleSafetyTactic ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticViewKeyword_0());
            		
            // InternalSafetyDSL.g:1035:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:1036:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:1036:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:1037:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSafetyTacticViewpointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyTacticViewpointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyTacticViewpointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSafetyDSL.g:1057:3: ( (lv_safetyTactics_3_0= ruleSafetyTactic ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32||LA14_0==36||LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSafetyDSL.g:1058:4: (lv_safetyTactics_3_0= ruleSafetyTactic )
            	    {
            	    // InternalSafetyDSL.g:1058:4: (lv_safetyTactics_3_0= ruleSafetyTactic )
            	    // InternalSafetyDSL.g:1059:5: lv_safetyTactics_3_0= ruleSafetyTactic
            	    {

            	    					newCompositeNode(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsSafetyTacticParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_safetyTactics_3_0=ruleSafetyTactic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSafetyTacticViewpointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"safetyTactics",
            	    						lv_safetyTactics_3_0,
            	    						"nl.wur.inf.SafetyDSL.SafetyTactic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSafetyTacticViewpointAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSafetyTacticViewpoint"


    // $ANTLR start "entryRuleSafetyTactic"
    // InternalSafetyDSL.g:1084:1: entryRuleSafetyTactic returns [EObject current=null] : iv_ruleSafetyTactic= ruleSafetyTactic EOF ;
    public final EObject entryRuleSafetyTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyTactic = null;


        try {
            // InternalSafetyDSL.g:1084:53: (iv_ruleSafetyTactic= ruleSafetyTactic EOF )
            // InternalSafetyDSL.g:1085:2: iv_ruleSafetyTactic= ruleSafetyTactic EOF
            {
             newCompositeNode(grammarAccess.getSafetyTacticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyTactic=ruleSafetyTactic();

            state._fsp--;

             current =iv_ruleSafetyTactic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyTactic"


    // $ANTLR start "ruleSafetyTactic"
    // InternalSafetyDSL.g:1091:1: ruleSafetyTactic returns [EObject current=null] : (this_FaultContainment_0= ruleFaultContainment | this_FaultAvoidance_1= ruleFaultAvoidance | this_FaultDetection_2= ruleFaultDetection ) ;
    public final EObject ruleSafetyTactic() throws RecognitionException {
        EObject current = null;

        EObject this_FaultContainment_0 = null;

        EObject this_FaultAvoidance_1 = null;

        EObject this_FaultDetection_2 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:1097:2: ( (this_FaultContainment_0= ruleFaultContainment | this_FaultAvoidance_1= ruleFaultAvoidance | this_FaultDetection_2= ruleFaultDetection ) )
            // InternalSafetyDSL.g:1098:2: (this_FaultContainment_0= ruleFaultContainment | this_FaultAvoidance_1= ruleFaultAvoidance | this_FaultDetection_2= ruleFaultDetection )
            {
            // InternalSafetyDSL.g:1098:2: (this_FaultContainment_0= ruleFaultContainment | this_FaultAvoidance_1= ruleFaultAvoidance | this_FaultDetection_2= ruleFaultDetection )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSafetyDSL.g:1099:3: this_FaultContainment_0= ruleFaultContainment
                    {

                    			newCompositeNode(grammarAccess.getSafetyTacticAccess().getFaultContainmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FaultContainment_0=ruleFaultContainment();

                    state._fsp--;


                    			current = this_FaultContainment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1108:3: this_FaultAvoidance_1= ruleFaultAvoidance
                    {

                    			newCompositeNode(grammarAccess.getSafetyTacticAccess().getFaultAvoidanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FaultAvoidance_1=ruleFaultAvoidance();

                    state._fsp--;


                    			current = this_FaultAvoidance_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1117:3: this_FaultDetection_2= ruleFaultDetection
                    {

                    			newCompositeNode(grammarAccess.getSafetyTacticAccess().getFaultDetectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FaultDetection_2=ruleFaultDetection();

                    state._fsp--;


                    			current = this_FaultDetection_2;
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
    // $ANTLR end "ruleSafetyTactic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSafetyDSL.g:1129:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSafetyDSL.g:1129:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSafetyDSL.g:1130:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSafetyDSL.g:1136:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:1142:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSafetyDSL.g:1143:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSafetyDSL.g:1143:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSafetyDSL.g:1144:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSafetyDSL.g:1151:3: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSafetyDSL.g:1152:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "entryRuleFaultAvoidance"
    // InternalSafetyDSL.g:1169:1: entryRuleFaultAvoidance returns [EObject current=null] : iv_ruleFaultAvoidance= ruleFaultAvoidance EOF ;
    public final EObject entryRuleFaultAvoidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaultAvoidance = null;


        try {
            // InternalSafetyDSL.g:1169:55: (iv_ruleFaultAvoidance= ruleFaultAvoidance EOF )
            // InternalSafetyDSL.g:1170:2: iv_ruleFaultAvoidance= ruleFaultAvoidance EOF
            {
             newCompositeNode(grammarAccess.getFaultAvoidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaultAvoidance=ruleFaultAvoidance();

            state._fsp--;

             current =iv_ruleFaultAvoidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultAvoidance"


    // $ANTLR start "ruleFaultAvoidance"
    // InternalSafetyDSL.g:1176:1: ruleFaultAvoidance returns [EObject current=null] : (otherlv_0= 'faultAvoidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'avoidedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleFaultAvoidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:1182:2: ( (otherlv_0= 'faultAvoidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'avoidedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' ) )
            // InternalSafetyDSL.g:1183:2: (otherlv_0= 'faultAvoidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'avoidedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalSafetyDSL.g:1183:2: (otherlv_0= 'faultAvoidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'avoidedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' )
            // InternalSafetyDSL.g:1184:3: otherlv_0= 'faultAvoidance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'avoidedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFaultAvoidanceAccess().getFaultAvoidanceKeyword_0());
            		
            // InternalSafetyDSL.g:1188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:1189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:1189:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:1190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFaultAvoidanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultAvoidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getFaultAvoidanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getFaultAvoidanceAccess().getTypeKeyword_3());
            		
            // InternalSafetyDSL.g:1214:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalSafetyDSL.g:1215:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalSafetyDSL.g:1215:4: (lv_type_4_0= RULE_STRING )
            // InternalSafetyDSL.g:1216:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_type_4_0, grammarAccess.getFaultAvoidanceAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultAvoidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFaultAvoidanceAccess().getAvoidedFaultsKeyword_5());
            		
            // InternalSafetyDSL.g:1236:3: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:1237:4: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:1237:4: ( ruleQualifiedName )
            // InternalSafetyDSL.g:1238:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultAvoidanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultCrossReference_6_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSafetyDSL.g:1252:3: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSafetyDSL.g:1253:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFaultAvoidanceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSafetyDSL.g:1257:4: ( ( ruleQualifiedName ) )
            	    // InternalSafetyDSL.g:1258:5: ( ruleQualifiedName )
            	    {
            	    // InternalSafetyDSL.g:1258:5: ( ruleQualifiedName )
            	    // InternalSafetyDSL.g:1259:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFaultAvoidanceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsFaultCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getFaultAvoidanceAccess().getSatisfiedRequirementsKeyword_8());
            		
            // InternalSafetyDSL.g:1278:3: ( (otherlv_10= RULE_ID ) )
            // InternalSafetyDSL.g:1279:4: (otherlv_10= RULE_ID )
            {
            // InternalSafetyDSL.g:1279:4: (otherlv_10= RULE_ID )
            // InternalSafetyDSL.g:1280:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultAvoidanceRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_10, grammarAccess.getFaultAvoidanceAccess().getSafetyReqsSafetyRequirementCrossReference_9_0());
            				

            }


            }

            // InternalSafetyDSL.g:1291:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSafetyDSL.g:1292:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFaultAvoidanceAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSafetyDSL.g:1296:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSafetyDSL.g:1297:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSafetyDSL.g:1297:5: (otherlv_12= RULE_ID )
            	    // InternalSafetyDSL.g:1298:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFaultAvoidanceRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    						newLeafNode(otherlv_12, grammarAccess.getFaultAvoidanceAccess().getSafetyReqsSafetyRequirementCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFaultAvoidanceAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getFaultAvoidanceAccess().getSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleFaultAvoidance"


    // $ANTLR start "entryRuleFaultDetection"
    // InternalSafetyDSL.g:1322:1: entryRuleFaultDetection returns [EObject current=null] : iv_ruleFaultDetection= ruleFaultDetection EOF ;
    public final EObject entryRuleFaultDetection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaultDetection = null;


        try {
            // InternalSafetyDSL.g:1322:55: (iv_ruleFaultDetection= ruleFaultDetection EOF )
            // InternalSafetyDSL.g:1323:2: iv_ruleFaultDetection= ruleFaultDetection EOF
            {
             newCompositeNode(grammarAccess.getFaultDetectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaultDetection=ruleFaultDetection();

            state._fsp--;

             current =iv_ruleFaultDetection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultDetection"


    // $ANTLR start "ruleFaultDetection"
    // InternalSafetyDSL.g:1329:1: ruleFaultDetection returns [EObject current=null] : (otherlv_0= 'faultDetection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'detectedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleFaultDetection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:1335:2: ( (otherlv_0= 'faultDetection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'detectedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' ) )
            // InternalSafetyDSL.g:1336:2: (otherlv_0= 'faultDetection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'detectedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalSafetyDSL.g:1336:2: (otherlv_0= 'faultDetection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'detectedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' )
            // InternalSafetyDSL.g:1337:3: otherlv_0= 'faultDetection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'detectedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFaultDetectionAccess().getFaultDetectionKeyword_0());
            		
            // InternalSafetyDSL.g:1341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:1342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:1342:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:1343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFaultDetectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultDetectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getFaultDetectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getFaultDetectionAccess().getTypeKeyword_3());
            		
            // InternalSafetyDSL.g:1367:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalSafetyDSL.g:1368:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalSafetyDSL.g:1368:4: (lv_type_4_0= RULE_STRING )
            // InternalSafetyDSL.g:1369:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_type_4_0, grammarAccess.getFaultDetectionAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultDetectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFaultDetectionAccess().getDetectedFaultsKeyword_5());
            		
            // InternalSafetyDSL.g:1389:3: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:1390:4: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:1390:4: ( ruleQualifiedName )
            // InternalSafetyDSL.g:1391:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultDetectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultCrossReference_6_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSafetyDSL.g:1405:3: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSafetyDSL.g:1406:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFaultDetectionAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSafetyDSL.g:1410:4: ( ( ruleQualifiedName ) )
            	    // InternalSafetyDSL.g:1411:5: ( ruleQualifiedName )
            	    {
            	    // InternalSafetyDSL.g:1411:5: ( ruleQualifiedName )
            	    // InternalSafetyDSL.g:1412:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFaultDetectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFaultDetectionAccess().getHandledFaultsFaultCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getFaultDetectionAccess().getSatisfiedRequirementsKeyword_8());
            		
            // InternalSafetyDSL.g:1431:3: ( (otherlv_10= RULE_ID ) )
            // InternalSafetyDSL.g:1432:4: (otherlv_10= RULE_ID )
            {
            // InternalSafetyDSL.g:1432:4: (otherlv_10= RULE_ID )
            // InternalSafetyDSL.g:1433:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultDetectionRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_10, grammarAccess.getFaultDetectionAccess().getSafetyReqsSafetyRequirementCrossReference_9_0());
            				

            }


            }

            // InternalSafetyDSL.g:1444:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSafetyDSL.g:1445:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFaultDetectionAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSafetyDSL.g:1449:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSafetyDSL.g:1450:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSafetyDSL.g:1450:5: (otherlv_12= RULE_ID )
            	    // InternalSafetyDSL.g:1451:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFaultDetectionRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    						newLeafNode(otherlv_12, grammarAccess.getFaultDetectionAccess().getSafetyReqsSafetyRequirementCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFaultDetectionAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getFaultDetectionAccess().getSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleFaultDetection"


    // $ANTLR start "entryRuleFaultContainment"
    // InternalSafetyDSL.g:1475:1: entryRuleFaultContainment returns [EObject current=null] : iv_ruleFaultContainment= ruleFaultContainment EOF ;
    public final EObject entryRuleFaultContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaultContainment = null;


        try {
            // InternalSafetyDSL.g:1475:57: (iv_ruleFaultContainment= ruleFaultContainment EOF )
            // InternalSafetyDSL.g:1476:2: iv_ruleFaultContainment= ruleFaultContainment EOF
            {
             newCompositeNode(grammarAccess.getFaultContainmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaultContainment=ruleFaultContainment();

            state._fsp--;

             current =iv_ruleFaultContainment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFaultContainment"


    // $ANTLR start "ruleFaultContainment"
    // InternalSafetyDSL.g:1482:1: ruleFaultContainment returns [EObject current=null] : (otherlv_0= 'faultContainment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'containedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleFaultContainment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:1488:2: ( (otherlv_0= 'faultContainment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'containedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' ) )
            // InternalSafetyDSL.g:1489:2: (otherlv_0= 'faultContainment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'containedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalSafetyDSL.g:1489:2: (otherlv_0= 'faultContainment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'containedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';' )
            // InternalSafetyDSL.g:1490:3: otherlv_0= 'faultContainment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= 'containedFaults=' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* otherlv_9= 'satisfiedRequirements=' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFaultContainmentAccess().getFaultContainmentKeyword_0());
            		
            // InternalSafetyDSL.g:1494:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:1495:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:1495:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:1496:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFaultContainmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultContainmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getFaultContainmentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getFaultContainmentAccess().getTypeKeyword_3());
            		
            // InternalSafetyDSL.g:1520:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalSafetyDSL.g:1521:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalSafetyDSL.g:1521:4: (lv_type_4_0= RULE_STRING )
            // InternalSafetyDSL.g:1522:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_type_4_0, grammarAccess.getFaultContainmentAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultContainmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFaultContainmentAccess().getContainedFaultsKeyword_5());
            		
            // InternalSafetyDSL.g:1542:3: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:1543:4: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:1543:4: ( ruleQualifiedName )
            // InternalSafetyDSL.g:1544:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultContainmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultCrossReference_6_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSafetyDSL.g:1558:3: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSafetyDSL.g:1559:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFaultContainmentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSafetyDSL.g:1563:4: ( ( ruleQualifiedName ) )
            	    // InternalSafetyDSL.g:1564:5: ( ruleQualifiedName )
            	    {
            	    // InternalSafetyDSL.g:1564:5: ( ruleQualifiedName )
            	    // InternalSafetyDSL.g:1565:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFaultContainmentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFaultContainmentAccess().getHandledFaultsFaultCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getFaultContainmentAccess().getSatisfiedRequirementsKeyword_8());
            		
            // InternalSafetyDSL.g:1584:3: ( (otherlv_10= RULE_ID ) )
            // InternalSafetyDSL.g:1585:4: (otherlv_10= RULE_ID )
            {
            // InternalSafetyDSL.g:1585:4: (otherlv_10= RULE_ID )
            // InternalSafetyDSL.g:1586:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultContainmentRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_10, grammarAccess.getFaultContainmentAccess().getSafetyReqsSafetyRequirementCrossReference_9_0());
            				

            }


            }

            // InternalSafetyDSL.g:1597:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSafetyDSL.g:1598:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_11, grammarAccess.getFaultContainmentAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSafetyDSL.g:1602:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSafetyDSL.g:1603:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSafetyDSL.g:1603:5: (otherlv_12= RULE_ID )
            	    // InternalSafetyDSL.g:1604:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFaultContainmentRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    						newLeafNode(otherlv_12, grammarAccess.getFaultContainmentAccess().getSafetyReqsSafetyRequirementCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getFaultContainmentAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getFaultContainmentAccess().getSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleFaultContainment"


    // $ANTLR start "entryRuleSafetyCriticalViewpoint"
    // InternalSafetyDSL.g:1628:1: entryRuleSafetyCriticalViewpoint returns [EObject current=null] : iv_ruleSafetyCriticalViewpoint= ruleSafetyCriticalViewpoint EOF ;
    public final EObject entryRuleSafetyCriticalViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyCriticalViewpoint = null;


        try {
            // InternalSafetyDSL.g:1628:64: (iv_ruleSafetyCriticalViewpoint= ruleSafetyCriticalViewpoint EOF )
            // InternalSafetyDSL.g:1629:2: iv_ruleSafetyCriticalViewpoint= ruleSafetyCriticalViewpoint EOF
            {
             newCompositeNode(grammarAccess.getSafetyCriticalViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyCriticalViewpoint=ruleSafetyCriticalViewpoint();

            state._fsp--;

             current =iv_ruleSafetyCriticalViewpoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyCriticalViewpoint"


    // $ANTLR start "ruleSafetyCriticalViewpoint"
    // InternalSafetyDSL.g:1635:1: ruleSafetyCriticalViewpoint returns [EObject current=null] : (otherlv_0= 'Safety-CriticalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleArchitecturalElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleSafetyCriticalRelation ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleSafetyCriticalViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_4_0 = null;

        EObject lv_relations_7_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:1641:2: ( (otherlv_0= 'Safety-CriticalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleArchitecturalElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleSafetyCriticalRelation ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSafetyDSL.g:1642:2: (otherlv_0= 'Safety-CriticalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleArchitecturalElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleSafetyCriticalRelation ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSafetyDSL.g:1642:2: (otherlv_0= 'Safety-CriticalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleArchitecturalElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleSafetyCriticalRelation ) )+ otherlv_8= '}' otherlv_9= '}' )
            // InternalSafetyDSL.g:1643:3: otherlv_0= 'Safety-CriticalView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Elements {' ( (lv_elements_4_0= ruleArchitecturalElement ) )+ otherlv_5= '}' otherlv_6= 'Relations {' ( (lv_relations_7_0= ruleSafetyCriticalRelation ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyCriticalViewpointAccess().getSafetyCriticalViewKeyword_0());
            		
            // InternalSafetyDSL.g:1647:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:1648:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:1648:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:1649:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSafetyCriticalViewpointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyCriticalViewpointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyCriticalViewpointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getSafetyCriticalViewpointAccess().getElementsKeyword_3());
            		
            // InternalSafetyDSL.g:1673:3: ( (lv_elements_4_0= ruleArchitecturalElement ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41||(LA23_0>=51 && LA23_0<=52)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSafetyDSL.g:1674:4: (lv_elements_4_0= ruleArchitecturalElement )
            	    {
            	    // InternalSafetyDSL.g:1674:4: (lv_elements_4_0= ruleArchitecturalElement )
            	    // InternalSafetyDSL.g:1675:5: lv_elements_4_0= ruleArchitecturalElement
            	    {

            	    					newCompositeNode(grammarAccess.getSafetyCriticalViewpointAccess().getElementsArchitecturalElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_elements_4_0=ruleArchitecturalElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSafetyCriticalViewpointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"nl.wur.inf.SafetyDSL.ArchitecturalElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSafetyCriticalViewpointAccess().getRelationsKeyword_6());
            		
            // InternalSafetyDSL.g:1700:3: ( (lv_relations_7_0= ruleSafetyCriticalRelation ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSafetyDSL.g:1701:4: (lv_relations_7_0= ruleSafetyCriticalRelation )
            	    {
            	    // InternalSafetyDSL.g:1701:4: (lv_relations_7_0= ruleSafetyCriticalRelation )
            	    // InternalSafetyDSL.g:1702:5: lv_relations_7_0= ruleSafetyCriticalRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsSafetyCriticalRelationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_relations_7_0=ruleSafetyCriticalRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSafetyCriticalViewpointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_7_0,
            	    						"nl.wur.inf.SafetyDSL.SafetyCriticalRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSafetyCriticalViewpointAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSafetyCriticalViewpoint"


    // $ANTLR start "entryRuleArchitecturalElement"
    // InternalSafetyDSL.g:1731:1: entryRuleArchitecturalElement returns [EObject current=null] : iv_ruleArchitecturalElement= ruleArchitecturalElement EOF ;
    public final EObject entryRuleArchitecturalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecturalElement = null;


        try {
            // InternalSafetyDSL.g:1731:61: (iv_ruleArchitecturalElement= ruleArchitecturalElement EOF )
            // InternalSafetyDSL.g:1732:2: iv_ruleArchitecturalElement= ruleArchitecturalElement EOF
            {
             newCompositeNode(grammarAccess.getArchitecturalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecturalElement=ruleArchitecturalElement();

            state._fsp--;

             current =iv_ruleArchitecturalElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArchitecturalElement"


    // $ANTLR start "ruleArchitecturalElement"
    // InternalSafetyDSL.g:1738:1: ruleArchitecturalElement returns [EObject current=null] : (this_SafetyCritical_0= ruleSafetyCritical | this_NonSafetyCritical_1= ruleNonSafetyCritical | this_Monitor_2= ruleMonitor ) ;
    public final EObject ruleArchitecturalElement() throws RecognitionException {
        EObject current = null;

        EObject this_SafetyCritical_0 = null;

        EObject this_NonSafetyCritical_1 = null;

        EObject this_Monitor_2 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:1744:2: ( (this_SafetyCritical_0= ruleSafetyCritical | this_NonSafetyCritical_1= ruleNonSafetyCritical | this_Monitor_2= ruleMonitor ) )
            // InternalSafetyDSL.g:1745:2: (this_SafetyCritical_0= ruleSafetyCritical | this_NonSafetyCritical_1= ruleNonSafetyCritical | this_Monitor_2= ruleMonitor )
            {
            // InternalSafetyDSL.g:1745:2: (this_SafetyCritical_0= ruleSafetyCritical | this_NonSafetyCritical_1= ruleNonSafetyCritical | this_Monitor_2= ruleMonitor )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt25=1;
                }
                break;
            case 51:
                {
                alt25=2;
                }
                break;
            case 52:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSafetyDSL.g:1746:3: this_SafetyCritical_0= ruleSafetyCritical
                    {

                    			newCompositeNode(grammarAccess.getArchitecturalElementAccess().getSafetyCriticalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyCritical_0=ruleSafetyCritical();

                    state._fsp--;


                    			current = this_SafetyCritical_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:1755:3: this_NonSafetyCritical_1= ruleNonSafetyCritical
                    {

                    			newCompositeNode(grammarAccess.getArchitecturalElementAccess().getNonSafetyCriticalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonSafetyCritical_1=ruleNonSafetyCritical();

                    state._fsp--;


                    			current = this_NonSafetyCritical_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:1764:3: this_Monitor_2= ruleMonitor
                    {

                    			newCompositeNode(grammarAccess.getArchitecturalElementAccess().getMonitorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monitor_2=ruleMonitor();

                    state._fsp--;


                    			current = this_Monitor_2;
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
    // $ANTLR end "ruleArchitecturalElement"


    // $ANTLR start "entryRuleSafetyCritical"
    // InternalSafetyDSL.g:1776:1: entryRuleSafetyCritical returns [EObject current=null] : iv_ruleSafetyCritical= ruleSafetyCritical EOF ;
    public final EObject entryRuleSafetyCritical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyCritical = null;


        try {
            // InternalSafetyDSL.g:1776:55: (iv_ruleSafetyCritical= ruleSafetyCritical EOF )
            // InternalSafetyDSL.g:1777:2: iv_ruleSafetyCritical= ruleSafetyCritical EOF
            {
             newCompositeNode(grammarAccess.getSafetyCriticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyCritical=ruleSafetyCritical();

            state._fsp--;

             current =iv_ruleSafetyCritical; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyCritical"


    // $ANTLR start "ruleSafetyCritical"
    // InternalSafetyDSL.g:1783:1: ruleSafetyCritical returns [EObject current=null] : (otherlv_0= 'safety-critical' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'criticalityLevel=' ( (lv_level_4_0= ruleCriticalityLevel ) ) otherlv_5= ';' otherlv_6= 'implementedSafetyRequirements=' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ';' (otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';' )? (otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';' )? (otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )? otherlv_25= '}' otherlv_26= ';' ) ;
    public final EObject ruleSafetyCritical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_level_4_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:1789:2: ( (otherlv_0= 'safety-critical' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'criticalityLevel=' ( (lv_level_4_0= ruleCriticalityLevel ) ) otherlv_5= ';' otherlv_6= 'implementedSafetyRequirements=' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ';' (otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';' )? (otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';' )? (otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )? otherlv_25= '}' otherlv_26= ';' ) )
            // InternalSafetyDSL.g:1790:2: (otherlv_0= 'safety-critical' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'criticalityLevel=' ( (lv_level_4_0= ruleCriticalityLevel ) ) otherlv_5= ';' otherlv_6= 'implementedSafetyRequirements=' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ';' (otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';' )? (otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';' )? (otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )? otherlv_25= '}' otherlv_26= ';' )
            {
            // InternalSafetyDSL.g:1790:2: (otherlv_0= 'safety-critical' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'criticalityLevel=' ( (lv_level_4_0= ruleCriticalityLevel ) ) otherlv_5= ';' otherlv_6= 'implementedSafetyRequirements=' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ';' (otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';' )? (otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';' )? (otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )? otherlv_25= '}' otherlv_26= ';' )
            // InternalSafetyDSL.g:1791:3: otherlv_0= 'safety-critical' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'criticalityLevel=' ( (lv_level_4_0= ruleCriticalityLevel ) ) otherlv_5= ';' otherlv_6= 'implementedSafetyRequirements=' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= ';' (otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';' )? (otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';' )? (otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )? otherlv_25= '}' otherlv_26= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyCriticalAccess().getSafetyCriticalKeyword_0());
            		
            // InternalSafetyDSL.g:1795:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:1796:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:1796:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:1797:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSafetyCriticalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyCriticalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyCriticalAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getSafetyCriticalAccess().getCriticalityLevelKeyword_3());
            		
            // InternalSafetyDSL.g:1821:3: ( (lv_level_4_0= ruleCriticalityLevel ) )
            // InternalSafetyDSL.g:1822:4: (lv_level_4_0= ruleCriticalityLevel )
            {
            // InternalSafetyDSL.g:1822:4: (lv_level_4_0= ruleCriticalityLevel )
            // InternalSafetyDSL.g:1823:5: lv_level_4_0= ruleCriticalityLevel
            {

            					newCompositeNode(grammarAccess.getSafetyCriticalAccess().getLevelCriticalityLevelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_level_4_0=ruleCriticalityLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyCriticalRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_4_0,
            						"nl.wur.inf.SafetyDSL.CriticalityLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsKeyword_6());
            		
            // InternalSafetyDSL.g:1848:3: ( ( ruleQualifiedName ) )
            // InternalSafetyDSL.g:1849:4: ( ruleQualifiedName )
            {
            // InternalSafetyDSL.g:1849:4: ( ruleQualifiedName )
            // InternalSafetyDSL.g:1850:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSafetyCriticalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementCrossReference_7_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSafetyDSL.g:1864:3: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSafetyDSL.g:1865:4: otherlv_8= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSafetyCriticalAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSafetyDSL.g:1869:4: ( ( ruleQualifiedName ) )
            	    // InternalSafetyDSL.g:1870:5: ( ruleQualifiedName )
            	    {
            	    // InternalSafetyDSL.g:1870:5: ( ruleQualifiedName )
            	    // InternalSafetyDSL.g:1871:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSafetyCriticalRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsSafetyRequirementCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_39); 

            			newLeafNode(otherlv_10, grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_9());
            		
            // InternalSafetyDSL.g:1890:3: (otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSafetyDSL.g:1891:4: otherlv_11= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getSafetyCriticalAccess().getImplementedTacticsKeyword_10_0());
                    			
                    // InternalSafetyDSL.g:1895:4: ( ( ruleQualifiedName ) )
                    // InternalSafetyDSL.g:1896:5: ( ruleQualifiedName )
                    {
                    // InternalSafetyDSL.g:1896:5: ( ruleQualifiedName )
                    // InternalSafetyDSL.g:1897:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyCriticalRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSafetyDSL.g:1911:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==26) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:1912:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSafetyCriticalAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalSafetyDSL.g:1916:5: ( ( ruleQualifiedName ) )
                    	    // InternalSafetyDSL.g:1917:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSafetyDSL.g:1917:6: ( ruleQualifiedName )
                    	    // InternalSafetyDSL.g:1918:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSafetyCriticalRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsSafetyTacticCrossReference_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_40); 

                    				newLeafNode(otherlv_15, grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalSafetyDSL.g:1938:3: (otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSafetyDSL.g:1939:4: otherlv_16= 'sub-elements=' ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getSafetyCriticalAccess().getSubElementsKeyword_11_0());
                    			
                    // InternalSafetyDSL.g:1943:4: ( ( ruleQualifiedName ) )
                    // InternalSafetyDSL.g:1944:5: ( ruleQualifiedName )
                    {
                    // InternalSafetyDSL.g:1944:5: ( ruleQualifiedName )
                    // InternalSafetyDSL.g:1945:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyCriticalRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSafetyDSL.g:1959:4: (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==26) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:1960:5: otherlv_18= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_18=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSafetyCriticalAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalSafetyDSL.g:1964:5: ( ( ruleQualifiedName ) )
                    	    // InternalSafetyDSL.g:1965:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSafetyDSL.g:1965:6: ( ruleQualifiedName )
                    	    // InternalSafetyDSL.g:1966:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSafetyCriticalRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSafetyCriticalAccess().getSubelementsSafetyCriticalCrossReference_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_41); 

                    				newLeafNode(otherlv_20, grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalSafetyDSL.g:1986:3: (otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSafetyDSL.g:1987:4: otherlv_21= 'hasState' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )*
                    {
                    otherlv_21=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getSafetyCriticalAccess().getHasStateKeyword_12_0());
                    			
                    // InternalSafetyDSL.g:1991:4: ( (otherlv_22= RULE_ID ) )
                    // InternalSafetyDSL.g:1992:5: (otherlv_22= RULE_ID )
                    {
                    // InternalSafetyDSL.g:1992:5: (otherlv_22= RULE_ID )
                    // InternalSafetyDSL.g:1993:6: otherlv_22= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyCriticalRule());
                    						}
                    					
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_22, grammarAccess.getSafetyCriticalAccess().getStatesStateCrossReference_12_1_0());
                    					

                    }


                    }

                    // InternalSafetyDSL.g:2004:4: (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2005:5: otherlv_23= ',' ( (otherlv_24= RULE_ID ) )
                    	    {
                    	    otherlv_23=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getSafetyCriticalAccess().getCommaKeyword_12_2_0());
                    	    				
                    	    // InternalSafetyDSL.g:2009:5: ( (otherlv_24= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2010:6: (otherlv_24= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2010:6: (otherlv_24= RULE_ID )
                    	    // InternalSafetyDSL.g:2011:7: otherlv_24= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSafetyCriticalRule());
                    	    							}
                    	    						
                    	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_31); 

                    	    							newLeafNode(otherlv_24, grammarAccess.getSafetyCriticalAccess().getStatesStateCrossReference_12_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getSafetyCriticalAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_26=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getSafetyCriticalAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleSafetyCritical"


    // $ANTLR start "entryRuleCriticalityLevel"
    // InternalSafetyDSL.g:2036:1: entryRuleCriticalityLevel returns [EObject current=null] : iv_ruleCriticalityLevel= ruleCriticalityLevel EOF ;
    public final EObject entryRuleCriticalityLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriticalityLevel = null;


        try {
            // InternalSafetyDSL.g:2036:57: (iv_ruleCriticalityLevel= ruleCriticalityLevel EOF )
            // InternalSafetyDSL.g:2037:2: iv_ruleCriticalityLevel= ruleCriticalityLevel EOF
            {
             newCompositeNode(grammarAccess.getCriticalityLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriticalityLevel=ruleCriticalityLevel();

            state._fsp--;

             current =iv_ruleCriticalityLevel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCriticalityLevel"


    // $ANTLR start "ruleCriticalityLevel"
    // InternalSafetyDSL.g:2043:1: ruleCriticalityLevel returns [EObject current=null] : ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'B' ) | ( () otherlv_5= 'C' ) | ( () otherlv_7= 'D' ) ) ;
    public final EObject ruleCriticalityLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:2049:2: ( ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'B' ) | ( () otherlv_5= 'C' ) | ( () otherlv_7= 'D' ) ) )
            // InternalSafetyDSL.g:2050:2: ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'B' ) | ( () otherlv_5= 'C' ) | ( () otherlv_7= 'D' ) )
            {
            // InternalSafetyDSL.g:2050:2: ( ( () otherlv_1= 'A' ) | ( () otherlv_3= 'B' ) | ( () otherlv_5= 'C' ) | ( () otherlv_7= 'D' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt33=1;
                }
                break;
            case 48:
                {
                alt33=2;
                }
                break;
            case 49:
                {
                alt33=3;
                }
                break;
            case 50:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSafetyDSL.g:2051:3: ( () otherlv_1= 'A' )
                    {
                    // InternalSafetyDSL.g:2051:3: ( () otherlv_1= 'A' )
                    // InternalSafetyDSL.g:2052:4: () otherlv_1= 'A'
                    {
                    // InternalSafetyDSL.g:2052:4: ()
                    // InternalSafetyDSL.g:2053:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCriticalityLevelAccess().getLevelAAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCriticalityLevelAccess().getAKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:2065:3: ( () otherlv_3= 'B' )
                    {
                    // InternalSafetyDSL.g:2065:3: ( () otherlv_3= 'B' )
                    // InternalSafetyDSL.g:2066:4: () otherlv_3= 'B'
                    {
                    // InternalSafetyDSL.g:2066:4: ()
                    // InternalSafetyDSL.g:2067:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCriticalityLevelAccess().getLevelBAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCriticalityLevelAccess().getBKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:2079:3: ( () otherlv_5= 'C' )
                    {
                    // InternalSafetyDSL.g:2079:3: ( () otherlv_5= 'C' )
                    // InternalSafetyDSL.g:2080:4: () otherlv_5= 'C'
                    {
                    // InternalSafetyDSL.g:2080:4: ()
                    // InternalSafetyDSL.g:2081:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCriticalityLevelAccess().getLevelCAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCriticalityLevelAccess().getCKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSafetyDSL.g:2093:3: ( () otherlv_7= 'D' )
                    {
                    // InternalSafetyDSL.g:2093:3: ( () otherlv_7= 'D' )
                    // InternalSafetyDSL.g:2094:4: () otherlv_7= 'D'
                    {
                    // InternalSafetyDSL.g:2094:4: ()
                    // InternalSafetyDSL.g:2095:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCriticalityLevelAccess().getLevelDAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getCriticalityLevelAccess().getDKeyword_3_1());
                    			

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
    // $ANTLR end "ruleCriticalityLevel"


    // $ANTLR start "entryRuleNonSafetyCritical"
    // InternalSafetyDSL.g:2110:1: entryRuleNonSafetyCritical returns [EObject current=null] : iv_ruleNonSafetyCritical= ruleNonSafetyCritical EOF ;
    public final EObject entryRuleNonSafetyCritical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonSafetyCritical = null;


        try {
            // InternalSafetyDSL.g:2110:58: (iv_ruleNonSafetyCritical= ruleNonSafetyCritical EOF )
            // InternalSafetyDSL.g:2111:2: iv_ruleNonSafetyCritical= ruleNonSafetyCritical EOF
            {
             newCompositeNode(grammarAccess.getNonSafetyCriticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonSafetyCritical=ruleNonSafetyCritical();

            state._fsp--;

             current =iv_ruleNonSafetyCritical; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonSafetyCritical"


    // $ANTLR start "ruleNonSafetyCritical"
    // InternalSafetyDSL.g:2117:1: ruleNonSafetyCritical returns [EObject current=null] : (otherlv_0= 'non-safety-critical' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' ) | otherlv_5= ';' ) ) ;
    public final EObject ruleNonSafetyCritical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_subelements_3_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:2123:2: ( (otherlv_0= 'non-safety-critical' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' ) | otherlv_5= ';' ) ) )
            // InternalSafetyDSL.g:2124:2: (otherlv_0= 'non-safety-critical' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' ) | otherlv_5= ';' ) )
            {
            // InternalSafetyDSL.g:2124:2: (otherlv_0= 'non-safety-critical' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' ) | otherlv_5= ';' ) )
            // InternalSafetyDSL.g:2125:3: otherlv_0= 'non-safety-critical' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' ) | otherlv_5= ';' )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNonSafetyCriticalAccess().getNonSafetyCriticalKeyword_0());
            		
            // InternalSafetyDSL.g:2129:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:2130:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:2130:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:2131:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNonSafetyCriticalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonSafetyCriticalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSafetyDSL.g:2147:3: ( (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' ) | otherlv_5= ';' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            else if ( (LA35_0==17) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalSafetyDSL.g:2148:4: (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' )
                    {
                    // InternalSafetyDSL.g:2148:4: (otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}' )
                    // InternalSafetyDSL.g:2149:5: otherlv_2= '{' ( (lv_subelements_3_0= ruleNonSafetyCritical ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_43); 

                    					newLeafNode(otherlv_2, grammarAccess.getNonSafetyCriticalAccess().getLeftCurlyBracketKeyword_2_0_0());
                    				
                    // InternalSafetyDSL.g:2153:5: ( (lv_subelements_3_0= ruleNonSafetyCritical ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==51) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2154:6: (lv_subelements_3_0= ruleNonSafetyCritical )
                    	    {
                    	    // InternalSafetyDSL.g:2154:6: (lv_subelements_3_0= ruleNonSafetyCritical )
                    	    // InternalSafetyDSL.g:2155:7: lv_subelements_3_0= ruleNonSafetyCritical
                    	    {

                    	    							newCompositeNode(grammarAccess.getNonSafetyCriticalAccess().getSubelementsNonSafetyCriticalParserRuleCall_2_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_subelements_3_0=ruleNonSafetyCritical();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNonSafetyCriticalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subelements",
                    	    								lv_subelements_3_0,
                    	    								"nl.wur.inf.SafetyDSL.NonSafetyCritical");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getNonSafetyCriticalAccess().getRightCurlyBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:2178:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getNonSafetyCriticalAccess().getSemicolonKeyword_2_1());
                    			

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
    // $ANTLR end "ruleNonSafetyCritical"


    // $ANTLR start "entryRuleMonitor"
    // InternalSafetyDSL.g:2187:1: entryRuleMonitor returns [EObject current=null] : iv_ruleMonitor= ruleMonitor EOF ;
    public final EObject entryRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitor = null;


        try {
            // InternalSafetyDSL.g:2187:48: (iv_ruleMonitor= ruleMonitor EOF )
            // InternalSafetyDSL.g:2188:2: iv_ruleMonitor= ruleMonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitor=ruleMonitor();

            state._fsp--;

             current =iv_ruleMonitor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalSafetyDSL.g:2194:1: ruleMonitor returns [EObject current=null] : (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )? otherlv_8= ';' ) ;
    public final EObject ruleMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:2200:2: ( (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )? otherlv_8= ';' ) )
            // InternalSafetyDSL.g:2201:2: (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )? otherlv_8= ';' )
            {
            // InternalSafetyDSL.g:2201:2: (otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )? otherlv_8= ';' )
            // InternalSafetyDSL.g:2202:3: otherlv_0= 'monitor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitorAccess().getMonitorKeyword_0());
            		
            // InternalSafetyDSL.g:2206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSafetyDSL.g:2207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSafetyDSL.g:2207:4: (lv_name_1_0= RULE_ID )
            // InternalSafetyDSL.g:2208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMonitorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSafetyDSL.g:2224:3: (otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSafetyDSL.g:2225:4: otherlv_2= '{' otherlv_3= 'implementedTactics=' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMonitorAccess().getImplementedTacticsKeyword_2_1());
                    			
                    // InternalSafetyDSL.g:2233:4: ( ( ruleQualifiedName ) )
                    // InternalSafetyDSL.g:2234:5: ( ruleQualifiedName )
                    {
                    // InternalSafetyDSL.g:2234:5: ( ruleQualifiedName )
                    // InternalSafetyDSL.g:2235:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMonitorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSafetyDSL.g:2249:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==26) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2250:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMonitorAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSafetyDSL.g:2254:5: ( ( ruleQualifiedName ) )
                    	    // InternalSafetyDSL.g:2255:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSafetyDSL.g:2255:6: ( ruleQualifiedName )
                    	    // InternalSafetyDSL.g:2256:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMonitorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMonitorAccess().getImplementedTacticsSafetyTacticCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMonitorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "entryRuleSafetyCriticalRelation"
    // InternalSafetyDSL.g:2284:1: entryRuleSafetyCriticalRelation returns [EObject current=null] : iv_ruleSafetyCriticalRelation= ruleSafetyCriticalRelation EOF ;
    public final EObject entryRuleSafetyCriticalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyCriticalRelation = null;


        try {
            // InternalSafetyDSL.g:2284:63: (iv_ruleSafetyCriticalRelation= ruleSafetyCriticalRelation EOF )
            // InternalSafetyDSL.g:2285:2: iv_ruleSafetyCriticalRelation= ruleSafetyCriticalRelation EOF
            {
             newCompositeNode(grammarAccess.getSafetyCriticalRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyCriticalRelation=ruleSafetyCriticalRelation();

            state._fsp--;

             current =iv_ruleSafetyCriticalRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyCriticalRelation"


    // $ANTLR start "ruleSafetyCriticalRelation"
    // InternalSafetyDSL.g:2291:1: ruleSafetyCriticalRelation returns [EObject current=null] : (this_ArchElementToArchElement_0= ruleArchElementToArchElement | this_MonitorToArchitecturalElement_1= ruleMonitorToArchitecturalElement | this_ReportsFault_2= ruleReportsFault ) ;
    public final EObject ruleSafetyCriticalRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ArchElementToArchElement_0 = null;

        EObject this_MonitorToArchitecturalElement_1 = null;

        EObject this_ReportsFault_2 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:2297:2: ( (this_ArchElementToArchElement_0= ruleArchElementToArchElement | this_MonitorToArchitecturalElement_1= ruleMonitorToArchitecturalElement | this_ReportsFault_2= ruleReportsFault ) )
            // InternalSafetyDSL.g:2298:2: (this_ArchElementToArchElement_0= ruleArchElementToArchElement | this_MonitorToArchitecturalElement_1= ruleMonitorToArchitecturalElement | this_ReportsFault_2= ruleReportsFault )
            {
            // InternalSafetyDSL.g:2298:2: (this_ArchElementToArchElement_0= ruleArchElementToArchElement | this_MonitorToArchitecturalElement_1= ruleMonitorToArchitecturalElement | this_ReportsFault_2= ruleReportsFault )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 53:
                case 54:
                case 55:
                    {
                    alt38=1;
                    }
                    break;
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                    {
                    alt38=2;
                    }
                    break;
                case 61:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSafetyDSL.g:2299:3: this_ArchElementToArchElement_0= ruleArchElementToArchElement
                    {

                    			newCompositeNode(grammarAccess.getSafetyCriticalRelationAccess().getArchElementToArchElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArchElementToArchElement_0=ruleArchElementToArchElement();

                    state._fsp--;


                    			current = this_ArchElementToArchElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:2308:3: this_MonitorToArchitecturalElement_1= ruleMonitorToArchitecturalElement
                    {

                    			newCompositeNode(grammarAccess.getSafetyCriticalRelationAccess().getMonitorToArchitecturalElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonitorToArchitecturalElement_1=ruleMonitorToArchitecturalElement();

                    state._fsp--;


                    			current = this_MonitorToArchitecturalElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:2317:3: this_ReportsFault_2= ruleReportsFault
                    {

                    			newCompositeNode(grammarAccess.getSafetyCriticalRelationAccess().getReportsFaultParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReportsFault_2=ruleReportsFault();

                    state._fsp--;


                    			current = this_ReportsFault_2;
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
    // $ANTLR end "ruleSafetyCriticalRelation"


    // $ANTLR start "entryRuleArchElementToArchElement"
    // InternalSafetyDSL.g:2329:1: entryRuleArchElementToArchElement returns [EObject current=null] : iv_ruleArchElementToArchElement= ruleArchElementToArchElement EOF ;
    public final EObject entryRuleArchElementToArchElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchElementToArchElement = null;


        try {
            // InternalSafetyDSL.g:2329:65: (iv_ruleArchElementToArchElement= ruleArchElementToArchElement EOF )
            // InternalSafetyDSL.g:2330:2: iv_ruleArchElementToArchElement= ruleArchElementToArchElement EOF
            {
             newCompositeNode(grammarAccess.getArchElementToArchElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchElementToArchElement=ruleArchElementToArchElement();

            state._fsp--;

             current =iv_ruleArchElementToArchElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArchElementToArchElement"


    // $ANTLR start "ruleArchElementToArchElement"
    // InternalSafetyDSL.g:2336:1: ruleArchElementToArchElement returns [EObject current=null] : ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) ) ;
    public final EObject ruleArchElementToArchElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:2342:2: ( ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) ) )
            // InternalSafetyDSL.g:2343:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) )
            {
            // InternalSafetyDSL.g:2343:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt42=3;
                    }
                    break;
                case 54:
                    {
                    alt42=2;
                    }
                    break;
                case 53:
                    {
                    alt42=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSafetyDSL.g:2344:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
                    {
                    // InternalSafetyDSL.g:2344:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
                    // InternalSafetyDSL.g:2345:4: () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
                    {
                    // InternalSafetyDSL.g:2345:4: ()
                    // InternalSafetyDSL.g:2346:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArchElementToArchElementAccess().getReadsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2352:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
                    // InternalSafetyDSL.g:2353:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= 'reads' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
                    {
                    // InternalSafetyDSL.g:2353:5: ( (otherlv_1= RULE_ID ) )
                    // InternalSafetyDSL.g:2354:6: (otherlv_1= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2354:6: (otherlv_1= RULE_ID )
                    // InternalSafetyDSL.g:2355:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); 

                    							newLeafNode(otherlv_1, grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_0_1_0_0());
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getArchElementToArchElementAccess().getReadsKeyword_0_1_1());
                    				
                    // InternalSafetyDSL.g:2370:5: ( (otherlv_3= RULE_ID ) )
                    // InternalSafetyDSL.g:2371:6: (otherlv_3= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2371:6: (otherlv_3= RULE_ID )
                    // InternalSafetyDSL.g:2372:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_3, grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_0_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2383:5: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==26) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2384:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_0_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2388:6: ( (otherlv_5= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2389:7: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2389:7: (otherlv_5= RULE_ID )
                    	    // InternalSafetyDSL.g:2390:8: otherlv_5= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    	    								}
                    	    							
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_5, grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_0_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_0_1_4());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:2409:3: ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) )
                    {
                    // InternalSafetyDSL.g:2409:3: ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) )
                    // InternalSafetyDSL.g:2410:4: () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' )
                    {
                    // InternalSafetyDSL.g:2410:4: ()
                    // InternalSafetyDSL.g:2411:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArchElementToArchElementAccess().getWritesAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2417:4: ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' )
                    // InternalSafetyDSL.g:2418:5: ( (otherlv_8= RULE_ID ) ) otherlv_9= 'writes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';'
                    {
                    // InternalSafetyDSL.g:2418:5: ( (otherlv_8= RULE_ID ) )
                    // InternalSafetyDSL.g:2419:6: (otherlv_8= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2419:6: (otherlv_8= RULE_ID )
                    // InternalSafetyDSL.g:2420:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_46); 

                    							newLeafNode(otherlv_8, grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_1_1_0_0());
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,54,FOLLOW_4); 

                    					newLeafNode(otherlv_9, grammarAccess.getArchElementToArchElementAccess().getWritesKeyword_1_1_1());
                    				
                    // InternalSafetyDSL.g:2435:5: ( (otherlv_10= RULE_ID ) )
                    // InternalSafetyDSL.g:2436:6: (otherlv_10= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2436:6: (otherlv_10= RULE_ID )
                    // InternalSafetyDSL.g:2437:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_10, grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_1_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2448:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==26) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2449:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_1_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2453:6: ( (otherlv_12= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2454:7: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2454:7: (otherlv_12= RULE_ID )
                    	    // InternalSafetyDSL.g:2455:8: otherlv_12= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    	    								}
                    	    							
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_12, grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_1_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_1_1_4());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:2474:3: ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) )
                    {
                    // InternalSafetyDSL.g:2474:3: ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) )
                    // InternalSafetyDSL.g:2475:4: () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )
                    {
                    // InternalSafetyDSL.g:2475:4: ()
                    // InternalSafetyDSL.g:2476:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArchElementToArchElementAccess().getCommandsAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2482:4: ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )
                    // InternalSafetyDSL.g:2483:5: ( (otherlv_15= RULE_ID ) ) otherlv_16= 'commands' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';'
                    {
                    // InternalSafetyDSL.g:2483:5: ( (otherlv_15= RULE_ID ) )
                    // InternalSafetyDSL.g:2484:6: (otherlv_15= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2484:6: (otherlv_15= RULE_ID )
                    // InternalSafetyDSL.g:2485:7: otherlv_15= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    							}
                    						
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_47); 

                    							newLeafNode(otherlv_15, grammarAccess.getArchElementToArchElementAccess().getElement1ArchitecturalElementCrossReference_2_1_0_0());
                    						

                    }


                    }

                    otherlv_16=(Token)match(input,55,FOLLOW_4); 

                    					newLeafNode(otherlv_16, grammarAccess.getArchElementToArchElementAccess().getCommandsKeyword_2_1_1());
                    				
                    // InternalSafetyDSL.g:2500:5: ( (otherlv_17= RULE_ID ) )
                    // InternalSafetyDSL.g:2501:6: (otherlv_17= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2501:6: (otherlv_17= RULE_ID )
                    // InternalSafetyDSL.g:2502:7: otherlv_17= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    							}
                    						
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_17, grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_2_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2513:5: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==26) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2514:6: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getArchElementToArchElementAccess().getCommaKeyword_2_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2518:6: ( (otherlv_19= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2519:7: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2519:7: (otherlv_19= RULE_ID )
                    	    // InternalSafetyDSL.g:2520:8: otherlv_19= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getArchElementToArchElementRule());
                    	    								}
                    	    							
                    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_19, grammarAccess.getArchElementToArchElementAccess().getElement2ArchitecturalElementCrossReference_2_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_20, grammarAccess.getArchElementToArchElementAccess().getSemicolonKeyword_2_1_4());
                    				

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
    // $ANTLR end "ruleArchElementToArchElement"


    // $ANTLR start "entryRuleMonitorToArchitecturalElement"
    // InternalSafetyDSL.g:2542:1: entryRuleMonitorToArchitecturalElement returns [EObject current=null] : iv_ruleMonitorToArchitecturalElement= ruleMonitorToArchitecturalElement EOF ;
    public final EObject entryRuleMonitorToArchitecturalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorToArchitecturalElement = null;


        try {
            // InternalSafetyDSL.g:2542:70: (iv_ruleMonitorToArchitecturalElement= ruleMonitorToArchitecturalElement EOF )
            // InternalSafetyDSL.g:2543:2: iv_ruleMonitorToArchitecturalElement= ruleMonitorToArchitecturalElement EOF
            {
             newCompositeNode(grammarAccess.getMonitorToArchitecturalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorToArchitecturalElement=ruleMonitorToArchitecturalElement();

            state._fsp--;

             current =iv_ruleMonitorToArchitecturalElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMonitorToArchitecturalElement"


    // $ANTLR start "ruleMonitorToArchitecturalElement"
    // InternalSafetyDSL.g:2549:1: ruleMonitorToArchitecturalElement returns [EObject current=null] : ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) | ( () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' ) ) | ( () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ;
    public final EObject ruleMonitorToArchitecturalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:2555:2: ( ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) | ( () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' ) ) | ( () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) )
            // InternalSafetyDSL.g:2556:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) | ( () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' ) ) | ( () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) )
            {
            // InternalSafetyDSL.g:2556:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ) | ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) ) | ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) ) | ( () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' ) ) | ( () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) )
            int alt48=5;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    alt48=2;
                    }
                    break;
                case 56:
                    {
                    alt48=1;
                    }
                    break;
                case 60:
                    {
                    alt48=5;
                    }
                    break;
                case 59:
                    {
                    alt48=4;
                    }
                    break;
                case 58:
                    {
                    alt48=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSafetyDSL.g:2557:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
                    {
                    // InternalSafetyDSL.g:2557:3: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
                    // InternalSafetyDSL.g:2558:4: () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
                    {
                    // InternalSafetyDSL.g:2558:4: ()
                    // InternalSafetyDSL.g:2559:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMonitorToArchitecturalElementAccess().getStopsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2565:4: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
                    // InternalSafetyDSL.g:2566:5: ( (otherlv_1= RULE_ID ) ) otherlv_2= 'stops' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
                    {
                    // InternalSafetyDSL.g:2566:5: ( (otherlv_1= RULE_ID ) )
                    // InternalSafetyDSL.g:2567:6: (otherlv_1= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2567:6: (otherlv_1= RULE_ID )
                    // InternalSafetyDSL.g:2568:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_48); 

                    							newLeafNode(otherlv_1, grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_0_1_0_0());
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getMonitorToArchitecturalElementAccess().getStopsKeyword_0_1_1());
                    				
                    // InternalSafetyDSL.g:2583:5: ( (otherlv_3= RULE_ID ) )
                    // InternalSafetyDSL.g:2584:6: (otherlv_3= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2584:6: (otherlv_3= RULE_ID )
                    // InternalSafetyDSL.g:2585:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_3, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_0_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2596:5: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==26) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2597:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_0_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2601:6: ( (otherlv_5= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2602:7: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2602:7: (otherlv_5= RULE_ID )
                    	    // InternalSafetyDSL.g:2603:8: otherlv_5= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    	    								}
                    	    							
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_5, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_0_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_0_1_4());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSafetyDSL.g:2622:3: ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) )
                    {
                    // InternalSafetyDSL.g:2622:3: ( () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' ) )
                    // InternalSafetyDSL.g:2623:4: () ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' )
                    {
                    // InternalSafetyDSL.g:2623:4: ()
                    // InternalSafetyDSL.g:2624:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMonitorToArchitecturalElementAccess().getStartsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2630:4: ( ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';' )
                    // InternalSafetyDSL.g:2631:5: ( (otherlv_8= RULE_ID ) ) otherlv_9= 'starts' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ';'
                    {
                    // InternalSafetyDSL.g:2631:5: ( (otherlv_8= RULE_ID ) )
                    // InternalSafetyDSL.g:2632:6: (otherlv_8= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2632:6: (otherlv_8= RULE_ID )
                    // InternalSafetyDSL.g:2633:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_49); 

                    							newLeafNode(otherlv_8, grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_1_1_0_0());
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,57,FOLLOW_4); 

                    					newLeafNode(otherlv_9, grammarAccess.getMonitorToArchitecturalElementAccess().getStartsKeyword_1_1_1());
                    				
                    // InternalSafetyDSL.g:2648:5: ( (otherlv_10= RULE_ID ) )
                    // InternalSafetyDSL.g:2649:6: (otherlv_10= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2649:6: (otherlv_10= RULE_ID )
                    // InternalSafetyDSL.g:2650:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_10, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_1_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2661:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==26) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2662:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_1_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2666:6: ( (otherlv_12= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2667:7: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2667:7: (otherlv_12= RULE_ID )
                    	    // InternalSafetyDSL.g:2668:8: otherlv_12= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    	    								}
                    	    							
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_12, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_1_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_1_1_4());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSafetyDSL.g:2687:3: ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) )
                    {
                    // InternalSafetyDSL.g:2687:3: ( () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' ) )
                    // InternalSafetyDSL.g:2688:4: () ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )
                    {
                    // InternalSafetyDSL.g:2688:4: ()
                    // InternalSafetyDSL.g:2689:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMonitorToArchitecturalElementAccess().getInitsAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2695:4: ( ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';' )
                    // InternalSafetyDSL.g:2696:5: ( (otherlv_15= RULE_ID ) ) otherlv_16= 'inits' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ';'
                    {
                    // InternalSafetyDSL.g:2696:5: ( (otherlv_15= RULE_ID ) )
                    // InternalSafetyDSL.g:2697:6: (otherlv_15= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2697:6: (otherlv_15= RULE_ID )
                    // InternalSafetyDSL.g:2698:7: otherlv_15= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_50); 

                    							newLeafNode(otherlv_15, grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_2_1_0_0());
                    						

                    }


                    }

                    otherlv_16=(Token)match(input,58,FOLLOW_4); 

                    					newLeafNode(otherlv_16, grammarAccess.getMonitorToArchitecturalElementAccess().getInitsKeyword_2_1_1());
                    				
                    // InternalSafetyDSL.g:2713:5: ( (otherlv_17= RULE_ID ) )
                    // InternalSafetyDSL.g:2714:6: (otherlv_17= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2714:6: (otherlv_17= RULE_ID )
                    // InternalSafetyDSL.g:2715:7: otherlv_17= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_17, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_2_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2726:5: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==26) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2727:6: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
                    	    {
                    	    otherlv_18=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_2_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2731:6: ( (otherlv_19= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2732:7: (otherlv_19= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2732:7: (otherlv_19= RULE_ID )
                    	    // InternalSafetyDSL.g:2733:8: otherlv_19= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    	    								}
                    	    							
                    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_19, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_2_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_20, grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_2_1_4());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSafetyDSL.g:2752:3: ( () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' ) )
                    {
                    // InternalSafetyDSL.g:2752:3: ( () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' ) )
                    // InternalSafetyDSL.g:2753:4: () ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' )
                    {
                    // InternalSafetyDSL.g:2753:4: ()
                    // InternalSafetyDSL.g:2754:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMonitorToArchitecturalElementAccess().getRestartsAction_3_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2760:4: ( ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';' )
                    // InternalSafetyDSL.g:2761:5: ( (otherlv_22= RULE_ID ) ) otherlv_23= 'restarts' ( (otherlv_24= RULE_ID ) ) (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ';'
                    {
                    // InternalSafetyDSL.g:2761:5: ( (otherlv_22= RULE_ID ) )
                    // InternalSafetyDSL.g:2762:6: (otherlv_22= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2762:6: (otherlv_22= RULE_ID )
                    // InternalSafetyDSL.g:2763:7: otherlv_22= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_51); 

                    							newLeafNode(otherlv_22, grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_3_1_0_0());
                    						

                    }


                    }

                    otherlv_23=(Token)match(input,59,FOLLOW_4); 

                    					newLeafNode(otherlv_23, grammarAccess.getMonitorToArchitecturalElementAccess().getRestartsKeyword_3_1_1());
                    				
                    // InternalSafetyDSL.g:2778:5: ( (otherlv_24= RULE_ID ) )
                    // InternalSafetyDSL.g:2779:6: (otherlv_24= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2779:6: (otherlv_24= RULE_ID )
                    // InternalSafetyDSL.g:2780:7: otherlv_24= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_24, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_3_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2791:5: (otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==26) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2792:6: otherlv_25= ',' ( (otherlv_26= RULE_ID ) )
                    	    {
                    	    otherlv_25=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_25, grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_3_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2796:6: ( (otherlv_26= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2797:7: (otherlv_26= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2797:7: (otherlv_26= RULE_ID )
                    	    // InternalSafetyDSL.g:2798:8: otherlv_26= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    	    								}
                    	    							
                    	    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_26, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_3_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_27, grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_3_1_4());
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSafetyDSL.g:2817:3: ( () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) )
                    {
                    // InternalSafetyDSL.g:2817:3: ( () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) )
                    // InternalSafetyDSL.g:2818:4: () ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' )
                    {
                    // InternalSafetyDSL.g:2818:4: ()
                    // InternalSafetyDSL.g:2819:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorsAction_4_0(),
                    						current);
                    				

                    }

                    // InternalSafetyDSL.g:2825:4: ( ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' )
                    // InternalSafetyDSL.g:2826:5: ( (otherlv_29= RULE_ID ) ) otherlv_30= 'monitors' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';'
                    {
                    // InternalSafetyDSL.g:2826:5: ( (otherlv_29= RULE_ID ) )
                    // InternalSafetyDSL.g:2827:6: (otherlv_29= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2827:6: (otherlv_29= RULE_ID )
                    // InternalSafetyDSL.g:2828:7: otherlv_29= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_52); 

                    							newLeafNode(otherlv_29, grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorMonitorCrossReference_4_1_0_0());
                    						

                    }


                    }

                    otherlv_30=(Token)match(input,60,FOLLOW_4); 

                    					newLeafNode(otherlv_30, grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorsKeyword_4_1_1());
                    				
                    // InternalSafetyDSL.g:2843:5: ( (otherlv_31= RULE_ID ) )
                    // InternalSafetyDSL.g:2844:6: (otherlv_31= RULE_ID )
                    {
                    // InternalSafetyDSL.g:2844:6: (otherlv_31= RULE_ID )
                    // InternalSafetyDSL.g:2845:7: otherlv_31= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    							}
                    						
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_31, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_4_1_2_0());
                    						

                    }


                    }

                    // InternalSafetyDSL.g:2856:5: (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==26) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalSafetyDSL.g:2857:6: otherlv_32= ',' ( (otherlv_33= RULE_ID ) )
                    	    {
                    	    otherlv_32=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_32, grammarAccess.getMonitorToArchitecturalElementAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalSafetyDSL.g:2861:6: ( (otherlv_33= RULE_ID ) )
                    	    // InternalSafetyDSL.g:2862:7: (otherlv_33= RULE_ID )
                    	    {
                    	    // InternalSafetyDSL.g:2862:7: (otherlv_33= RULE_ID )
                    	    // InternalSafetyDSL.g:2863:8: otherlv_33= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMonitorToArchitecturalElementRule());
                    	    								}
                    	    							
                    	    otherlv_33=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    								newLeafNode(otherlv_33, grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalSafetyCriticalCrossReference_4_1_3_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_34, grammarAccess.getMonitorToArchitecturalElementAccess().getSemicolonKeyword_4_1_4());
                    				

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
    // $ANTLR end "ruleMonitorToArchitecturalElement"


    // $ANTLR start "entryRuleReportsFault"
    // InternalSafetyDSL.g:2885:1: entryRuleReportsFault returns [EObject current=null] : iv_ruleReportsFault= ruleReportsFault EOF ;
    public final EObject entryRuleReportsFault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportsFault = null;


        try {
            // InternalSafetyDSL.g:2885:53: (iv_ruleReportsFault= ruleReportsFault EOF )
            // InternalSafetyDSL.g:2886:2: iv_ruleReportsFault= ruleReportsFault EOF
            {
             newCompositeNode(grammarAccess.getReportsFaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReportsFault=ruleReportsFault();

            state._fsp--;

             current =iv_ruleReportsFault; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReportsFault"


    // $ANTLR start "ruleReportsFault"
    // InternalSafetyDSL.g:2892:1: ruleReportsFault returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'reportsFault' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleReportsFault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSafetyDSL.g:2898:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'reportsFault' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalSafetyDSL.g:2899:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'reportsFault' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalSafetyDSL.g:2899:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'reportsFault' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalSafetyDSL.g:2900:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'reportsFault' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ';'
            {
            // InternalSafetyDSL.g:2900:3: ( (otherlv_0= RULE_ID ) )
            // InternalSafetyDSL.g:2901:4: (otherlv_0= RULE_ID )
            {
            // InternalSafetyDSL.g:2901:4: (otherlv_0= RULE_ID )
            // InternalSafetyDSL.g:2902:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportsFaultRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(otherlv_0, grammarAccess.getReportsFaultAccess().getSafetyCritical1SafetyCriticalCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReportsFaultAccess().getReportsFaultKeyword_1());
            		
            // InternalSafetyDSL.g:2917:3: ( (otherlv_2= RULE_ID ) )
            // InternalSafetyDSL.g:2918:4: (otherlv_2= RULE_ID )
            {
            // InternalSafetyDSL.g:2918:4: (otherlv_2= RULE_ID )
            // InternalSafetyDSL.g:2919:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportsFaultRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalCrossReference_2_0());
            				

            }


            }

            // InternalSafetyDSL.g:2930:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==26) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSafetyDSL.g:2931:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReportsFaultAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSafetyDSL.g:2935:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSafetyDSL.g:2936:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSafetyDSL.g:2936:5: (otherlv_4= RULE_ID )
            	    // InternalSafetyDSL.g:2937:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReportsFaultRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_4, grammarAccess.getReportsFaultAccess().getSafetyCritical2SafetyCriticalCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReportsFaultAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleReportsFault"


    // $ANTLR start "entryRuleImplementationDetail"
    // InternalSafetyDSL.g:2957:1: entryRuleImplementationDetail returns [EObject current=null] : iv_ruleImplementationDetail= ruleImplementationDetail EOF ;
    public final EObject entryRuleImplementationDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDetail = null;


        try {
            // InternalSafetyDSL.g:2957:61: (iv_ruleImplementationDetail= ruleImplementationDetail EOF )
            // InternalSafetyDSL.g:2958:2: iv_ruleImplementationDetail= ruleImplementationDetail EOF
            {
             newCompositeNode(grammarAccess.getImplementationDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDetail=ruleImplementationDetail();

            state._fsp--;

             current =iv_ruleImplementationDetail; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplementationDetail"


    // $ANTLR start "ruleImplementationDetail"
    // InternalSafetyDSL.g:2964:1: ruleImplementationDetail returns [EObject current=null] : (otherlv_0= 'ImplementationRelations {' otherlv_1= 'Module-Class Relations' otherlv_2= '{' ( (lv_moduleClassRelations_3_0= ruleModuleClassRelation ) )+ otherlv_4= '}' otherlv_5= ';' otherlv_6= 'Class-Test Case Relations' otherlv_7= '{' ( (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation ) )+ otherlv_9= '}' otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleImplementationDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_moduleClassRelations_3_0 = null;

        EObject lv_classTestCaseRelations_8_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:2970:2: ( (otherlv_0= 'ImplementationRelations {' otherlv_1= 'Module-Class Relations' otherlv_2= '{' ( (lv_moduleClassRelations_3_0= ruleModuleClassRelation ) )+ otherlv_4= '}' otherlv_5= ';' otherlv_6= 'Class-Test Case Relations' otherlv_7= '{' ( (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation ) )+ otherlv_9= '}' otherlv_10= ';' otherlv_11= '}' ) )
            // InternalSafetyDSL.g:2971:2: (otherlv_0= 'ImplementationRelations {' otherlv_1= 'Module-Class Relations' otherlv_2= '{' ( (lv_moduleClassRelations_3_0= ruleModuleClassRelation ) )+ otherlv_4= '}' otherlv_5= ';' otherlv_6= 'Class-Test Case Relations' otherlv_7= '{' ( (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation ) )+ otherlv_9= '}' otherlv_10= ';' otherlv_11= '}' )
            {
            // InternalSafetyDSL.g:2971:2: (otherlv_0= 'ImplementationRelations {' otherlv_1= 'Module-Class Relations' otherlv_2= '{' ( (lv_moduleClassRelations_3_0= ruleModuleClassRelation ) )+ otherlv_4= '}' otherlv_5= ';' otherlv_6= 'Class-Test Case Relations' otherlv_7= '{' ( (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation ) )+ otherlv_9= '}' otherlv_10= ';' otherlv_11= '}' )
            // InternalSafetyDSL.g:2972:3: otherlv_0= 'ImplementationRelations {' otherlv_1= 'Module-Class Relations' otherlv_2= '{' ( (lv_moduleClassRelations_3_0= ruleModuleClassRelation ) )+ otherlv_4= '}' otherlv_5= ';' otherlv_6= 'Class-Test Case Relations' otherlv_7= '{' ( (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation ) )+ otherlv_9= '}' otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationDetailAccess().getImplementationRelationsKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationDetailAccess().getModuleClassRelationsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getImplementationDetailAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSafetyDSL.g:2984:3: ( (lv_moduleClassRelations_3_0= ruleModuleClassRelation ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSafetyDSL.g:2985:4: (lv_moduleClassRelations_3_0= ruleModuleClassRelation )
            	    {
            	    // InternalSafetyDSL.g:2985:4: (lv_moduleClassRelations_3_0= ruleModuleClassRelation )
            	    // InternalSafetyDSL.g:2986:5: lv_moduleClassRelations_3_0= ruleModuleClassRelation
            	    {

            	    					newCompositeNode(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsModuleClassRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_moduleClassRelations_3_0=ruleModuleClassRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementationDetailRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moduleClassRelations",
            	    						lv_moduleClassRelations_3_0,
            	    						"nl.wur.inf.SafetyDSL.ModuleClassRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_55); 

            			newLeafNode(otherlv_5, grammarAccess.getImplementationDetailAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getImplementationDetailAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalSafetyDSL.g:3019:3: ( (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSafetyDSL.g:3020:4: (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation )
            	    {
            	    // InternalSafetyDSL.g:3020:4: (lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation )
            	    // InternalSafetyDSL.g:3021:5: lv_classTestCaseRelations_8_0= ruleClassTestCaseRelation
            	    {

            	    					newCompositeNode(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsClassTestCaseRelationParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_classTestCaseRelations_8_0=ruleClassTestCaseRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementationDetailRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classTestCaseRelations",
            	    						lv_classTestCaseRelations_8_0,
            	    						"nl.wur.inf.SafetyDSL.ClassTestCaseRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getImplementationDetailAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getImplementationDetailAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleImplementationDetail"


    // $ANTLR start "entryRuleModuleClassRelation"
    // InternalSafetyDSL.g:3054:1: entryRuleModuleClassRelation returns [EObject current=null] : iv_ruleModuleClassRelation= ruleModuleClassRelation EOF ;
    public final EObject entryRuleModuleClassRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleClassRelation = null;


        try {
            // InternalSafetyDSL.g:3054:60: (iv_ruleModuleClassRelation= ruleModuleClassRelation EOF )
            // InternalSafetyDSL.g:3055:2: iv_ruleModuleClassRelation= ruleModuleClassRelation EOF
            {
             newCompositeNode(grammarAccess.getModuleClassRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleClassRelation=ruleModuleClassRelation();

            state._fsp--;

             current =iv_ruleModuleClassRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModuleClassRelation"


    // $ANTLR start "ruleModuleClassRelation"
    // InternalSafetyDSL.g:3061:1: ruleModuleClassRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'composesOf' otherlv_2= '=' otherlv_3= '{' ( (lv_classes_4_0= ruleClassDef ) ) (otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleModuleClassRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_classes_4_0 = null;

        EObject lv_classes_6_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:3067:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'composesOf' otherlv_2= '=' otherlv_3= '{' ( (lv_classes_4_0= ruleClassDef ) ) (otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalSafetyDSL.g:3068:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'composesOf' otherlv_2= '=' otherlv_3= '{' ( (lv_classes_4_0= ruleClassDef ) ) (otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalSafetyDSL.g:3068:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'composesOf' otherlv_2= '=' otherlv_3= '{' ( (lv_classes_4_0= ruleClassDef ) ) (otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalSafetyDSL.g:3069:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'composesOf' otherlv_2= '=' otherlv_3= '{' ( (lv_classes_4_0= ruleClassDef ) ) (otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalSafetyDSL.g:3069:3: ( (otherlv_0= RULE_ID ) )
            // InternalSafetyDSL.g:3070:4: (otherlv_0= RULE_ID )
            {
            // InternalSafetyDSL.g:3070:4: (otherlv_0= RULE_ID )
            // InternalSafetyDSL.g:3071:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleClassRelationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_0, grammarAccess.getModuleClassRelationAccess().getModuleArchitecturalElementCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,65,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleClassRelationAccess().getComposesOfKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleClassRelationAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleClassRelationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSafetyDSL.g:3094:3: ( (lv_classes_4_0= ruleClassDef ) )
            // InternalSafetyDSL.g:3095:4: (lv_classes_4_0= ruleClassDef )
            {
            // InternalSafetyDSL.g:3095:4: (lv_classes_4_0= ruleClassDef )
            // InternalSafetyDSL.g:3096:5: lv_classes_4_0= ruleClassDef
            {

            					newCompositeNode(grammarAccess.getModuleClassRelationAccess().getClassesClassDefParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_classes_4_0=ruleClassDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleClassRelationRule());
            					}
            					add(
            						current,
            						"classes",
            						lv_classes_4_0,
            						"nl.wur.inf.SafetyDSL.ClassDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSafetyDSL.g:3113:3: (otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==26) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSafetyDSL.g:3114:4: otherlv_5= ',' ( (lv_classes_6_0= ruleClassDef ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModuleClassRelationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSafetyDSL.g:3118:4: ( (lv_classes_6_0= ruleClassDef ) )
            	    // InternalSafetyDSL.g:3119:5: (lv_classes_6_0= ruleClassDef )
            	    {
            	    // InternalSafetyDSL.g:3119:5: (lv_classes_6_0= ruleClassDef )
            	    // InternalSafetyDSL.g:3120:6: lv_classes_6_0= ruleClassDef
            	    {

            	    						newCompositeNode(grammarAccess.getModuleClassRelationAccess().getClassesClassDefParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_classes_6_0=ruleClassDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleClassRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classes",
            	    							lv_classes_6_0,
            	    							"nl.wur.inf.SafetyDSL.ClassDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleClassRelationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getModuleClassRelationAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleModuleClassRelation"


    // $ANTLR start "entryRuleClassTestCaseRelation"
    // InternalSafetyDSL.g:3150:1: entryRuleClassTestCaseRelation returns [EObject current=null] : iv_ruleClassTestCaseRelation= ruleClassTestCaseRelation EOF ;
    public final EObject entryRuleClassTestCaseRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassTestCaseRelation = null;


        try {
            // InternalSafetyDSL.g:3150:62: (iv_ruleClassTestCaseRelation= ruleClassTestCaseRelation EOF )
            // InternalSafetyDSL.g:3151:2: iv_ruleClassTestCaseRelation= ruleClassTestCaseRelation EOF
            {
             newCompositeNode(grammarAccess.getClassTestCaseRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassTestCaseRelation=ruleClassTestCaseRelation();

            state._fsp--;

             current =iv_ruleClassTestCaseRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassTestCaseRelation"


    // $ANTLR start "ruleClassTestCaseRelation"
    // InternalSafetyDSL.g:3157:1: ruleClassTestCaseRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'testWith' otherlv_2= '=' otherlv_3= '{' ( (lv_testCases_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleClassTestCaseRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_testCases_4_0 = null;

        AntlrDatatypeRuleToken lv_testCases_6_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:3163:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'testWith' otherlv_2= '=' otherlv_3= '{' ( (lv_testCases_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalSafetyDSL.g:3164:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'testWith' otherlv_2= '=' otherlv_3= '{' ( (lv_testCases_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalSafetyDSL.g:3164:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'testWith' otherlv_2= '=' otherlv_3= '{' ( (lv_testCases_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalSafetyDSL.g:3165:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'testWith' otherlv_2= '=' otherlv_3= '{' ( (lv_testCases_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            // InternalSafetyDSL.g:3165:3: ( (otherlv_0= RULE_ID ) )
            // InternalSafetyDSL.g:3166:4: (otherlv_0= RULE_ID )
            {
            // InternalSafetyDSL.g:3166:4: (otherlv_0= RULE_ID )
            // InternalSafetyDSL.g:3167:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassTestCaseRelationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(otherlv_0, grammarAccess.getClassTestCaseRelationAccess().getClazzClassDefCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getClassTestCaseRelationAccess().getTestWithKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getClassTestCaseRelationAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getClassTestCaseRelationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSafetyDSL.g:3190:3: ( (lv_testCases_4_0= ruleQualifiedName ) )
            // InternalSafetyDSL.g:3191:4: (lv_testCases_4_0= ruleQualifiedName )
            {
            // InternalSafetyDSL.g:3191:4: (lv_testCases_4_0= ruleQualifiedName )
            // InternalSafetyDSL.g:3192:5: lv_testCases_4_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getClassTestCaseRelationAccess().getTestCasesQualifiedNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_testCases_4_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassTestCaseRelationRule());
            					}
            					add(
            						current,
            						"testCases",
            						lv_testCases_4_0,
            						"nl.wur.inf.SafetyDSL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSafetyDSL.g:3209:3: (otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==26) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSafetyDSL.g:3210:4: otherlv_5= ',' ( (lv_testCases_6_0= ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getClassTestCaseRelationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSafetyDSL.g:3214:4: ( (lv_testCases_6_0= ruleQualifiedName ) )
            	    // InternalSafetyDSL.g:3215:5: (lv_testCases_6_0= ruleQualifiedName )
            	    {
            	    // InternalSafetyDSL.g:3215:5: (lv_testCases_6_0= ruleQualifiedName )
            	    // InternalSafetyDSL.g:3216:6: lv_testCases_6_0= ruleQualifiedName
            	    {

            	    						newCompositeNode(grammarAccess.getClassTestCaseRelationAccess().getTestCasesQualifiedNameParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_testCases_6_0=ruleQualifiedName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassTestCaseRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"testCases",
            	    							lv_testCases_6_0,
            	    							"nl.wur.inf.SafetyDSL.QualifiedName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getClassTestCaseRelationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getClassTestCaseRelationAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleClassTestCaseRelation"


    // $ANTLR start "entryRuleClassDef"
    // InternalSafetyDSL.g:3246:1: entryRuleClassDef returns [EObject current=null] : iv_ruleClassDef= ruleClassDef EOF ;
    public final EObject entryRuleClassDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDef = null;


        try {
            // InternalSafetyDSL.g:3246:49: (iv_ruleClassDef= ruleClassDef EOF )
            // InternalSafetyDSL.g:3247:2: iv_ruleClassDef= ruleClassDef EOF
            {
             newCompositeNode(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDef=ruleClassDef();

            state._fsp--;

             current =iv_ruleClassDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDef"


    // $ANTLR start "ruleClassDef"
    // InternalSafetyDSL.g:3253:1: ruleClassDef returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleClassDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSafetyDSL.g:3259:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // InternalSafetyDSL.g:3260:2: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // InternalSafetyDSL.g:3260:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalSafetyDSL.g:3261:3: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalSafetyDSL.g:3261:3: (lv_name_0_0= ruleQualifiedName )
            // InternalSafetyDSL.g:3262:4: lv_name_0_0= ruleQualifiedName
            {

            				newCompositeNode(grammarAccess.getClassDefAccess().getNameQualifiedNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getClassDefRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"nl.wur.inf.SafetyDSL.QualifiedName");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleClassDef"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000010040000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003D0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003D4000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000005100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000005100004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0018020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0018020000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000700000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});

}