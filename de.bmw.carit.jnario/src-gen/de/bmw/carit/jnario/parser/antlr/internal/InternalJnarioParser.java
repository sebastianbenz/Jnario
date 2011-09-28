package de.bmw.carit.jnario.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.bmw.carit.jnario.services.JnarioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJnarioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FEATURE_TEXT", "RULE_SCENARIO_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_MULTI_LINE", "RULE_NEW_LINE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=12;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_NEW_LINE=14;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_THEN_TEXT=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_WHEN_TEXT=8;
    public static final int RULE_GIVEN_TEXT=6;
    public static final int RULE_SCENARIO_TEXT=5;
    public static final int T__59=59;
    public static final int RULE_INT=10;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=17;
    public static final int RULE_MULTI_LINE=13;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_AND_TEXT=7;
    public static final int T__73=73;
    public static final int RULE_FEATURE_TEXT=4;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalJnarioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJnarioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJnarioParser.tokenNames; }
    public String getGrammarFileName() { return "../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g"; }



     	private JnarioGrammarAccess grammarAccess;
     	
        public InternalJnarioParser(TokenStream input, JnarioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Jnario";	
       	}
       	
       	@Override
       	protected JnarioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJnario"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:67:1: entryRuleJnario returns [EObject current=null] : iv_ruleJnario= ruleJnario EOF ;
    public final EObject entryRuleJnario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJnario = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:68:2: (iv_ruleJnario= ruleJnario EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:69:2: iv_ruleJnario= ruleJnario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJnarioRule()); 
            }
            pushFollow(FOLLOW_ruleJnario_in_entryRuleJnario75);
            iv_ruleJnario=ruleJnario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJnario; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJnario85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJnario"


    // $ANTLR start "ruleJnario"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:76:1: ruleJnario returns [EObject current=null] : ( ( (lv_name_0_0= RULE_FEATURE_TEXT ) ) ( (lv_scenarios_1_0= ruleScenario ) )+ ) ;
    public final EObject ruleJnario() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_scenarios_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:79:28: ( ( ( (lv_name_0_0= RULE_FEATURE_TEXT ) ) ( (lv_scenarios_1_0= ruleScenario ) )+ ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:1: ( ( (lv_name_0_0= RULE_FEATURE_TEXT ) ) ( (lv_scenarios_1_0= ruleScenario ) )+ )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:1: ( ( (lv_name_0_0= RULE_FEATURE_TEXT ) ) ( (lv_scenarios_1_0= ruleScenario ) )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:2: ( (lv_name_0_0= RULE_FEATURE_TEXT ) ) ( (lv_scenarios_1_0= ruleScenario ) )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:80:2: ( (lv_name_0_0= RULE_FEATURE_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:81:1: (lv_name_0_0= RULE_FEATURE_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:81:1: (lv_name_0_0= RULE_FEATURE_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:82:3: lv_name_0_0= RULE_FEATURE_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_FEATURE_TEXT,FOLLOW_RULE_FEATURE_TEXT_in_ruleJnario127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getJnarioAccess().getNameFEATURE_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJnarioRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"FEATURE_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:98:2: ( (lv_scenarios_1_0= ruleScenario ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SCENARIO_TEXT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:99:1: (lv_scenarios_1_0= ruleScenario )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:99:1: (lv_scenarios_1_0= ruleScenario )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:100:3: lv_scenarios_1_0= ruleScenario
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJnarioAccess().getScenariosScenarioParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleScenario_in_ruleJnario153);
            	    lv_scenarios_1_0=ruleScenario();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJnarioRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scenarios",
            	              		lv_scenarios_1_0, 
            	              		"Scenario");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJnario"


    // $ANTLR start "entryRuleScenario"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:124:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:125:2: (iv_ruleScenario= ruleScenario EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:126:2: iv_ruleScenario= ruleScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenarioRule()); 
            }
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario190);
            iv_ruleScenario=ruleScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:133:1: ruleScenario returns [EObject current=null] : ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_given_1_0= ruleGiven ) ) ( (lv_when_2_0= ruleWhen ) ) ( (lv_then_3_0= ruleThen ) ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_given_1_0 = null;

        EObject lv_when_2_0 = null;

        EObject lv_then_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:136:28: ( ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_given_1_0= ruleGiven ) ) ( (lv_when_2_0= ruleWhen ) ) ( (lv_then_3_0= ruleThen ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:137:1: ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_given_1_0= ruleGiven ) ) ( (lv_when_2_0= ruleWhen ) ) ( (lv_then_3_0= ruleThen ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:137:1: ( ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_given_1_0= ruleGiven ) ) ( (lv_when_2_0= ruleWhen ) ) ( (lv_then_3_0= ruleThen ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:137:2: ( (lv_name_0_0= RULE_SCENARIO_TEXT ) ) ( (lv_given_1_0= ruleGiven ) ) ( (lv_when_2_0= ruleWhen ) ) ( (lv_then_3_0= ruleThen ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:137:2: ( (lv_name_0_0= RULE_SCENARIO_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:138:1: (lv_name_0_0= RULE_SCENARIO_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:138:1: (lv_name_0_0= RULE_SCENARIO_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:139:3: lv_name_0_0= RULE_SCENARIO_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_SCENARIO_TEXT,FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScenarioRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"SCENARIO_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:155:2: ( (lv_given_1_0= ruleGiven ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:156:1: (lv_given_1_0= ruleGiven )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:156:1: (lv_given_1_0= ruleGiven )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:157:3: lv_given_1_0= ruleGiven
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScenarioAccess().getGivenGivenParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGiven_in_ruleScenario268);
            lv_given_1_0=ruleGiven();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScenarioRule());
              	        }
                     		set(
                     			current, 
                     			"given",
                      		lv_given_1_0, 
                      		"Given");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:173:2: ( (lv_when_2_0= ruleWhen ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:174:1: (lv_when_2_0= ruleWhen )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:174:1: (lv_when_2_0= ruleWhen )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:175:3: lv_when_2_0= ruleWhen
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScenarioAccess().getWhenWhenParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWhen_in_ruleScenario289);
            lv_when_2_0=ruleWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScenarioRule());
              	        }
                     		set(
                     			current, 
                     			"when",
                      		lv_when_2_0, 
                      		"When");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:191:2: ( (lv_then_3_0= ruleThen ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:192:1: (lv_then_3_0= ruleThen )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:192:1: (lv_then_3_0= ruleThen )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:193:3: lv_then_3_0= ruleThen
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScenarioAccess().getThenThenParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleThen_in_ruleScenario310);
            lv_then_3_0=ruleThen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScenarioRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_3_0, 
                      		"Then");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleGiven"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:219:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:220:2: (iv_ruleGiven= ruleGiven EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:221:2: iv_ruleGiven= ruleGiven EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGivenRule()); 
            }
            pushFollow(FOLLOW_ruleGiven_in_entryRuleGiven348);
            iv_ruleGiven=ruleGiven();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGiven; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGiven358); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:228:1: ruleGiven returns [EObject current=null] : ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_code_1_0 = null;

        EObject lv_code_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:231:28: ( ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:232:1: ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:232:1: ( ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:232:2: ( (lv_name_0_0= RULE_GIVEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:232:2: ( (lv_name_0_0= RULE_GIVEN_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:233:1: (lv_name_0_0= RULE_GIVEN_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:233:1: (lv_name_0_0= RULE_GIVEN_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:234:3: lv_name_0_0= RULE_GIVEN_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_GIVEN_TEXT,FOLLOW_RULE_GIVEN_TEXT_in_ruleGiven400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getGivenAccess().getNameGIVEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGivenRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"GIVEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:250:2: ( (lv_code_1_0= ruleCode ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||LA2_0==29||(LA2_0>=32 && LA2_0<=33)||LA2_0==38||LA2_0==44||LA2_0==46||LA2_0==49||LA2_0==51||LA2_0==53||(LA2_0>=57 && LA2_0<=59)||(LA2_0>=61 && LA2_0<=63)||(LA2_0>=65 && LA2_0<=72)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:251:1: (lv_code_1_0= ruleCode )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:251:1: (lv_code_1_0= ruleCode )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:252:3: lv_code_1_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGivenAccess().getCodeCodeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleGiven426);
                    lv_code_1_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGivenRule());
                      	        }
                             		add(
                             			current, 
                             			"code",
                              		lv_code_1_0, 
                              		"Code");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:268:3: ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_AND_TEXT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:268:4: ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:268:4: ( (lv_name_2_0= RULE_AND_TEXT ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:269:1: (lv_name_2_0= RULE_AND_TEXT )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:269:1: (lv_name_2_0= RULE_AND_TEXT )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:270:3: lv_name_2_0= RULE_AND_TEXT
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_ruleGiven445); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_name_2_0, grammarAccess.getGivenAccess().getNameAND_TEXTTerminalRuleCall_2_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGivenRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"name",
            	              		lv_name_2_0, 
            	              		"AND_TEXT");
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:286:2: ( (lv_code_3_0= ruleCode ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||LA3_0==29||(LA3_0>=32 && LA3_0<=33)||LA3_0==38||LA3_0==44||LA3_0==46||LA3_0==49||LA3_0==51||LA3_0==53||(LA3_0>=57 && LA3_0<=59)||(LA3_0>=61 && LA3_0<=63)||(LA3_0>=65 && LA3_0<=72)) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:287:1: (lv_code_3_0= ruleCode )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:287:1: (lv_code_3_0= ruleCode )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:288:3: lv_code_3_0= ruleCode
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGivenAccess().getCodeCodeParserRuleCall_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleCode_in_ruleGiven471);
            	            lv_code_3_0=ruleCode();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getGivenRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"code",
            	                      		lv_code_3_0, 
            	                      		"Code");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:312:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:313:2: (iv_ruleWhen= ruleWhen EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:314:2: iv_ruleWhen= ruleWhen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenRule()); 
            }
            pushFollow(FOLLOW_ruleWhen_in_entryRuleWhen510);
            iv_ruleWhen=ruleWhen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhen520); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:321:1: ruleWhen returns [EObject current=null] : ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_code_1_0 = null;

        EObject lv_code_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:324:28: ( ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:325:1: ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:325:1: ( ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:325:2: ( (lv_name_0_0= RULE_WHEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:325:2: ( (lv_name_0_0= RULE_WHEN_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:326:1: (lv_name_0_0= RULE_WHEN_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:326:1: (lv_name_0_0= RULE_WHEN_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:327:3: lv_name_0_0= RULE_WHEN_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_WHEN_TEXT,FOLLOW_RULE_WHEN_TEXT_in_ruleWhen562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getWhenAccess().getNameWHEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhenRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"WHEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:343:2: ( (lv_code_1_0= ruleCode ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_ID)||LA5_0==29||(LA5_0>=32 && LA5_0<=33)||LA5_0==38||LA5_0==44||LA5_0==46||LA5_0==49||LA5_0==51||LA5_0==53||(LA5_0>=57 && LA5_0<=59)||(LA5_0>=61 && LA5_0<=63)||(LA5_0>=65 && LA5_0<=72)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:344:1: (lv_code_1_0= ruleCode )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:344:1: (lv_code_1_0= ruleCode )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:345:3: lv_code_1_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhenAccess().getCodeCodeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleWhen588);
                    lv_code_1_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhenRule());
                      	        }
                             		add(
                             			current, 
                             			"code",
                              		lv_code_1_0, 
                              		"Code");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:361:3: ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_AND_TEXT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:361:4: ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:361:4: ( (lv_name_2_0= RULE_AND_TEXT ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:362:1: (lv_name_2_0= RULE_AND_TEXT )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:362:1: (lv_name_2_0= RULE_AND_TEXT )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:363:3: lv_name_2_0= RULE_AND_TEXT
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_ruleWhen607); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_name_2_0, grammarAccess.getWhenAccess().getNameAND_TEXTTerminalRuleCall_2_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getWhenRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"name",
            	              		lv_name_2_0, 
            	              		"AND_TEXT");
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:379:2: ( (lv_code_3_0= ruleCode ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||LA6_0==29||(LA6_0>=32 && LA6_0<=33)||LA6_0==38||LA6_0==44||LA6_0==46||LA6_0==49||LA6_0==51||LA6_0==53||(LA6_0>=57 && LA6_0<=59)||(LA6_0>=61 && LA6_0<=63)||(LA6_0>=65 && LA6_0<=72)) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:380:1: (lv_code_3_0= ruleCode )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:380:1: (lv_code_3_0= ruleCode )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:381:3: lv_code_3_0= ruleCode
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getWhenAccess().getCodeCodeParserRuleCall_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleCode_in_ruleWhen633);
            	            lv_code_3_0=ruleCode();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getWhenRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"code",
            	                      		lv_code_3_0, 
            	                      		"Code");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:405:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:406:2: (iv_ruleThen= ruleThen EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:407:2: iv_ruleThen= ruleThen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThenRule()); 
            }
            pushFollow(FOLLOW_ruleThen_in_entryRuleThen672);
            iv_ruleThen=ruleThen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThen682); if (state.failed) return current;

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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:414:1: ruleThen returns [EObject current=null] : ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_code_1_0 = null;

        EObject lv_code_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:417:28: ( ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:418:1: ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:418:1: ( ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:418:2: ( (lv_name_0_0= RULE_THEN_TEXT ) ) ( (lv_code_1_0= ruleCode ) )? ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )*
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:418:2: ( (lv_name_0_0= RULE_THEN_TEXT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:419:1: (lv_name_0_0= RULE_THEN_TEXT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:419:1: (lv_name_0_0= RULE_THEN_TEXT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:420:3: lv_name_0_0= RULE_THEN_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_THEN_TEXT,FOLLOW_RULE_THEN_TEXT_in_ruleThen724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getThenAccess().getNameTHEN_TEXTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getThenRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"THEN_TEXT");
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:436:2: ( (lv_code_1_0= ruleCode ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_ID)||LA8_0==29||(LA8_0>=32 && LA8_0<=33)||LA8_0==38||LA8_0==44||LA8_0==46||LA8_0==49||LA8_0==51||LA8_0==53||(LA8_0>=57 && LA8_0<=59)||(LA8_0>=61 && LA8_0<=63)||(LA8_0>=65 && LA8_0<=72)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:437:1: (lv_code_1_0= ruleCode )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:437:1: (lv_code_1_0= ruleCode )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:438:3: lv_code_1_0= ruleCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getThenAccess().getCodeCodeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCode_in_ruleThen750);
                    lv_code_1_0=ruleCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getThenRule());
                      	        }
                             		add(
                             			current, 
                             			"code",
                              		lv_code_1_0, 
                              		"Code");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:454:3: ( ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_AND_TEXT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:454:4: ( (lv_name_2_0= RULE_AND_TEXT ) ) ( (lv_code_3_0= ruleCode ) )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:454:4: ( (lv_name_2_0= RULE_AND_TEXT ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:455:1: (lv_name_2_0= RULE_AND_TEXT )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:455:1: (lv_name_2_0= RULE_AND_TEXT )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:456:3: lv_name_2_0= RULE_AND_TEXT
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_RULE_AND_TEXT_in_ruleThen769); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_name_2_0, grammarAccess.getThenAccess().getNameAND_TEXTTerminalRuleCall_2_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getThenRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"name",
            	              		lv_name_2_0, 
            	              		"AND_TEXT");
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:472:2: ( (lv_code_3_0= ruleCode ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||LA9_0==29||(LA9_0>=32 && LA9_0<=33)||LA9_0==38||LA9_0==44||LA9_0==46||LA9_0==49||LA9_0==51||LA9_0==53||(LA9_0>=57 && LA9_0<=59)||(LA9_0>=61 && LA9_0<=63)||(LA9_0>=65 && LA9_0<=72)) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:473:1: (lv_code_3_0= ruleCode )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:473:1: (lv_code_3_0= ruleCode )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:474:3: lv_code_3_0= ruleCode
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getThenAccess().getCodeCodeParserRuleCall_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleCode_in_ruleThen795);
            	            lv_code_3_0=ruleCode();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getThenRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"code",
            	                      		lv_code_3_0, 
            	                      		"Code");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleCode"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:498:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:499:2: (iv_ruleCode= ruleCode EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:500:2: iv_ruleCode= ruleCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeRule()); 
            }
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode834);
            iv_ruleCode=ruleCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode844); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:507:1: ruleCode returns [EObject current=null] : ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+ ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:510:28: ( ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:511:1: ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:511:1: ( (lv_expressions_0_0= ruleXExpressionInsideBlock ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||LA11_0==29||(LA11_0>=32 && LA11_0<=33)||LA11_0==38||LA11_0==44||LA11_0==46||LA11_0==49||LA11_0==51||LA11_0==53||(LA11_0>=57 && LA11_0<=59)||(LA11_0>=61 && LA11_0<=63)||(LA11_0>=65 && LA11_0<=72)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:512:1: (lv_expressions_0_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:512:1: (lv_expressions_0_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:513:3: lv_expressions_0_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCodeAccess().getExpressionsXExpressionInsideBlockParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleCode889);
            	    lv_expressions_0_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_0_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleXExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:537:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:538:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:539:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression925);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression935); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:546:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:549:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:551:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression981);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:567:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:568:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:569:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1015);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:576:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:579:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:580:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:580:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_SCENARIO_TEXT||(LA13_1>=RULE_AND_TEXT && LA13_1<=RULE_ID)||(LA13_1>=20 && LA13_1<=46)||(LA13_1>=48 && LA13_1<=75)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==19) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||LA13_0==29||(LA13_0>=32 && LA13_0<=33)||LA13_0==38||LA13_0==44||LA13_0==46||LA13_0==49||LA13_0==51||LA13_0==53||(LA13_0>=57 && LA13_0<=59)||LA13_0==63||(LA13_0>=65 && LA13_0<=72)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:580:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:580:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:580:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:580:3: ()
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:581:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:586:2: ( ( ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:587:1: ( ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:587:1: ( ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:588:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1083);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1099);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:609:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:610:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:610:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:611:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1119);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:628:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:628:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:629:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1149);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==20) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalJnario()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:642:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:642:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:642:7: ()
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:643:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:648:2: ( ( ruleOpMultiAssign ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:649:1: ( ruleOpMultiAssign )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:649:1: ( ruleOpMultiAssign )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:650:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1202);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:663:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:664:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:664:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:665:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1225);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:689:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:690:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:691:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1265);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:698:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:701:28: (kw= '=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:703:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign1313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:716:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:717:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:718:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1353);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1364); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:725:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:728:28: (kw= '+=' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:730:2: kw= '+='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpMultiAssign1401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:743:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:744:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:745:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1440);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:752:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:755:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:756:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:756:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:757:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1497);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred2_InternalJnario()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:770:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:770:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:770:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:771:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:776:2: ( ( ruleOpOr ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:777:1: ( ruleOpOr )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:777:1: ( ruleOpOr )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:778:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1550);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:791:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:792:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:792:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:793:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1573);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:817:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:818:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:819:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1612);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1623); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:826:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:829:28: (kw= '||' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:831:2: kw= '||'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpOr1660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:844:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:845:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:846:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1699);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1709); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:853:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:856:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:857:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:857:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:858:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1756);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalJnario()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:871:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:871:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:871:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:872:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:877:2: ( ( ruleOpAnd ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:878:1: ( ruleOpAnd )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:878:1: ( ruleOpAnd )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:879:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1809);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:892:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:893:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:893:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:894:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1832);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:918:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:919:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:920:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1871);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1882); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:927:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:930:28: (kw= '&&' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:932:2: kw= '&&'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpAnd1919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:945:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:946:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:947:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1958);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1968); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:954:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:957:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:958:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:958:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:959:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2015);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred4_InternalJnario()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==24) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred4_InternalJnario()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:972:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:972:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:972:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:973:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:978:2: ( ( ruleOpEquality ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:979:1: ( ruleOpEquality )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:979:1: ( ruleOpEquality )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:980:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2068);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:993:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:994:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:994:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:995:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2091);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1019:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1020:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1021:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2130);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2141); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1028:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1031:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1032:1: (kw= '==' | kw= '!=' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1032:1: (kw= '==' | kw= '!=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==24) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1033:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality2179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1040:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1053:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1054:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1055:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2238);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2248); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1062:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1065:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1066:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1066:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1067:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2295);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred5_InternalJnario()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred6_InternalJnario()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred6_InternalJnario()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred6_InternalJnario()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred6_InternalJnario()) ) {
                        alt18=2;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1077:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1077:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1077:6: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1078:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression2331); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1087:3: ( ( ruleQualifiedName ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1088:1: ( ruleQualifiedName )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1088:1: ( ruleQualifiedName )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1089:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2356);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1108:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1114:2: ( ( ruleOpCompare ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1115:1: ( ruleOpCompare )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1115:1: ( ruleOpCompare )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1116:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2417);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1129:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1130:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1130:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1131:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2440);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1155:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1156:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1157:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2480);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2491); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1164:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1167:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1168:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1168:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt19=1;
                }
                break;
            case 27:
                {
                alt19=2;
                }
                break;
            case 28:
                {
                alt19=3;
                }
                break;
            case 29:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1169:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1176:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1183:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1190:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1203:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1204:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1205:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2626);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2636); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1212:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1215:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1216:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1216:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1217:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2683);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred7_InternalJnario()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==31) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred7_InternalJnario()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1230:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1230:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1230:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1231:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1236:2: ( ( ruleOpOther ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1237:1: ( ruleOpOther )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1237:1: ( ruleOpOther )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1238:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2736);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1251:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1252:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1252:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1253:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2759);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1277:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1278:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1279:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2798);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2809); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1286:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1289:28: ( (kw= '->' | kw= '..' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1290:1: (kw= '->' | kw= '..' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1290:1: (kw= '->' | kw= '..' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1291:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1298:2: kw= '..'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1311:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1312:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1313:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2906);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1320:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1323:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1324:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1324:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1325:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2963);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred8_InternalJnario()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==33) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred8_InternalJnario()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1338:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1338:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1338:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1339:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1344:2: ( ( ruleOpAdd ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1345:1: ( ruleOpAdd )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1345:1: ( ruleOpAdd )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1346:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3016);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1359:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1360:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1360:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1361:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3039);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1385:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1386:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1387:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3078);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3089); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1394:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1397:28: ( (kw= '+' | kw= '-' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1398:1: (kw= '+' | kw= '-' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1398:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            else if ( (LA23_0==33) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1399:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd3127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1406:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1419:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1420:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1421:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3186);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3196); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1428:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1431:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1432:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1432:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1433:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3243);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalJnario()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred9_InternalJnario()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred9_InternalJnario()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred9_InternalJnario()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1446:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1446:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1446:7: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1447:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1452:2: ( ( ruleOpMulti ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1453:1: ( ruleOpMulti )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1453:1: ( ruleOpMulti )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1454:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3296);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1467:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1468:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1468:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1469:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3319);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1493:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1494:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1495:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3358);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1502:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1505:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1506:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1506:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt25=1;
                }
                break;
            case 35:
                {
                alt25=2;
                }
                break;
            case 36:
                {
                alt25=3;
                }
                break;
            case 37:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1507:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1514:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1521:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1528:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1541:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1542:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1543:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3504);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3514); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1550:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1553:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1554:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1554:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=32 && LA26_0<=33)||LA26_0==38) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_ID)||LA26_0==29||LA26_0==44||LA26_0==46||LA26_0==49||LA26_0==51||LA26_0==53||(LA26_0>=57 && LA26_0<=59)||LA26_0==63||(LA26_0>=65 && LA26_0<=72)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1554:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1554:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1554:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1554:3: ()
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1555:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1560:2: ( ( ruleOpUnary ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1561:1: ( ruleOpUnary )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1561:1: ( ruleOpUnary )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1562:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3572);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1575:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1576:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1576:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1577:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3593);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1595:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3622);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1611:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1612:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1613:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3658);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3669); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1620:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1623:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1624:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1624:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 33:
                {
                alt27=2;
                }
                break;
            case 32:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1625:2: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1632:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1639:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1652:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1653:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1654:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3785);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3795); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1661:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1664:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1665:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1665:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1666:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3842);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred10_InternalJnario()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1676:5: ( () otherlv_2= 'as' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1676:6: () otherlv_2= 'as'
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1676:6: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1677:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXCastedExpression3877); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1686:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1687:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1687:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1688:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3900);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1712:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1713:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1714:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3938);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3948); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1721:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1724:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1725:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1725:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1726:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3995);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop35:
            do {
                int alt35=3;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred11_InternalJnario()) ) {
                        alt35=1;
                    }
                    else if ( (synpred12_InternalJnario()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred12_InternalJnario()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred12_InternalJnario()) ) {
                        alt35=2;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1740:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1740:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1740:26: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1741:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4044); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1750:1: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1751:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1751:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1752:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4067);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4083);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1773:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1774:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1774:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1775:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4105);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1808:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1808:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1808:8: ()
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1809:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1814:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1814:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4191); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1819:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1819:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1820:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1820:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1821:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4215); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1835:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1835:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1836:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1836:1: (lv_spreading_9_0= '*.' )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1837:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4252); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1850:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==29) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1850:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4281); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1854:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1855:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1855:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1856:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4302);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1872:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==43) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1872:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4315); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1876:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1877:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1877:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1878:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4336);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4350); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1898:3: ( ( ruleValidID ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1899:1: ( ruleValidID )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1899:1: ( ruleValidID )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1900:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4375);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1913:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1913:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1913:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1913:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1920:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1921:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4409); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1946:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1947:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4484);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1964:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1964:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1964:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1964:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1965:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1965:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1966:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4512);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1982:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==43) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1982:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4525); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1986:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1987:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1987:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1988:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4546);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4563); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2016:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2017:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2018:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4604);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4614); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2025:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2028:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2029:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2029:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt36=13;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt36=1;
                }
                break;
            case 53:
                {
                alt36=2;
                }
                break;
            case 51:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
            case 29:
            case 63:
                {
                alt36=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 46:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt36=5;
                }
                break;
            case 49:
                {
                alt36=6;
                }
                break;
            case 57:
                {
                alt36=7;
                }
                break;
            case 58:
                {
                alt36=8;
                }
                break;
            case 59:
                {
                alt36=9;
                }
                break;
            case 70:
                {
                alt36=10;
                }
                break;
            case 71:
                {
                alt36=11;
                }
                break;
            case 72:
                {
                alt36=12;
                }
                break;
            case 44:
                {
                alt36=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2030:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4661);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2040:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4688);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2050:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4715);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2060:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4742);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2070:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4769);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2080:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4796);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2090:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4823);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2100:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4850);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2110:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4877);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2120:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4904);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2130:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4931);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2140:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4958);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2150:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4985);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2166:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2167:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2168:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5020);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5030); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2175:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2178:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2179:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2179:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt37=1;
                }
                break;
            case 66:
            case 67:
                {
                alt37=2;
                }
                break;
            case RULE_INT:
                {
                alt37=3;
                }
                break;
            case 68:
                {
                alt37=4;
                }
                break;
            case RULE_STRING:
                {
                alt37=5;
                }
                break;
            case 69:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2180:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5077);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2190:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5104);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2200:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5131);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2210:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5158);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2220:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5185);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2230:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5212);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2246:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2247:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2248:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5247);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5257); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2255:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2258:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2259:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2259:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2259:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2259:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2260:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2269:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==44||LA39_0==75) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2269:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2269:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2270:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2270:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2271:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5325);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2287:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==43) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2287:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5338); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2291:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2292:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2292:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2293:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5359);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2313:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2314:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2314:1: (lv_expression_6_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2315:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5396);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2343:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2344:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2345:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5444);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5454); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2352:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2355:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2356:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2356:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2356:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2356:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2356:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2367:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2367:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2367:6: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2368:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2373:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==44||LA41_0==75) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2373:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2373:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2374:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2374:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2375:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5552);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2391:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==43) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2391:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5565); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2395:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2396:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2396:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2397:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5586);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure5602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2417:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2418:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2418:1: (lv_expression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2419:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5625);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2443:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2444:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2445:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5661);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5671); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2452:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2455:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2456:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2456:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2456:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5730);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2481:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2482:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2483:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5777);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2490:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2493:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2494:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2494:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2494:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2494:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2495:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2508:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2509:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2509:1: (lv_if_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2510:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5866);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2530:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2531:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2531:1: (lv_then_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2532:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5899);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2548:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred16_InternalJnario()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2548:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2548:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2548:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression5920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2553:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2554:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2554:1: (lv_else_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2555:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5942);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2579:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2580:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2581:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5980);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5990); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2588:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2591:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2592:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2592:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2592:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2592:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2593:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2602:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==52) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2602:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2602:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2603:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2603:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2604:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6058);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2624:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2625:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2625:1: (lv_switch_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2626:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6093);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2646:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==44||LA44_0==52||LA44_0==56||LA44_0==75) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2647:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2647:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2648:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6126);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2664:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2664:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2672:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2673:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2673:1: (lv_default_9_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2674:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6173);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2702:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2703:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2704:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6223);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2711:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2714:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2715:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2715:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2715:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2715:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==44||LA46_0==75) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2716:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2716:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2717:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6279);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2733:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2733:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2737:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2738:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2738:1: (lv_case_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2739:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6314);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2759:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2760:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2760:1: (lv_then_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2761:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6349);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2785:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2786:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2787:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6385);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6395); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2794:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2797:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2798:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2798:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2798:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2798:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression6441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2812:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2813:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2813:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2814:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6474);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression6486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2834:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2835:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2835:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2836:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6507);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2856:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2857:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2857:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2858:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6540);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2882:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2883:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2884:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6576);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2891:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2894:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2895:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2895:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2895:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2895:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2896:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression6632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2909:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2910:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2910:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2911:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6665);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression6677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2931:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2932:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2932:1: (lv_body_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2933:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6698);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2957:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2958:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2959:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6734);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6744); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2966:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2969:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2970:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2970:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2970:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2970:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2971:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression6790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2980:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2981:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2981:1: (lv_body_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2982:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6811);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression6835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3006:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3007:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3007:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3008:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6856);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression6868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3036:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3037:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3038:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6904);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3045:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3048:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3049:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3049:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3049:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3049:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3050:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression6960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3059:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_ID)||LA49_0==29||(LA49_0>=32 && LA49_0<=33)||LA49_0==38||LA49_0==44||LA49_0==46||LA49_0==49||LA49_0==51||LA49_0==53||(LA49_0>=57 && LA49_0<=59)||(LA49_0>=61 && LA49_0<=63)||(LA49_0>=65 && LA49_0<=72)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3059:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3059:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3060:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3060:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3061:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6982);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3077:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==60) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3077:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression6995); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3093:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3094:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3095:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7047);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7057); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3102:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3105:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3106:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3106:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=61 && LA50_0<=62)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_INT && LA50_0<=RULE_ID)||LA50_0==29||(LA50_0>=32 && LA50_0<=33)||LA50_0==38||LA50_0==44||LA50_0==46||LA50_0==49||LA50_0==51||LA50_0==53||(LA50_0>=57 && LA50_0<=59)||LA50_0==63||(LA50_0>=65 && LA50_0<=72)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3107:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7104);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3117:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7131);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3133:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3134:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3135:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7166);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3142:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3145:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3146:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3146:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3146:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3146:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3147:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3152:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            else if ( (LA51_0==62) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3152:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3152:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3153:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3153:1: (lv_writeable_1_0= 'var' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3154:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3168:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred17_InternalJnario()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==44) && (synpred17_InternalJnario())) {
                alt52=1;
            }
            else if ( (LA52_0==75) && (synpred17_InternalJnario())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3180:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3180:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3180:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3181:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3181:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3182:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7308);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3198:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3199:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3199:1: (lv_name_4_0= ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3200:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7329);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3217:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3217:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3218:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3218:1: (lv_name_5_0= ruleValidID )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3219:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7358);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3235:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==19) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3235:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration7372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3239:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3240:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3240:1: (lv_right_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3241:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7393);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3265:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3266:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3267:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7431);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3274:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3277:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3278:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3278:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3278:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3278:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==29||LA54_1==40) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==44||LA54_0==75) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3279:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3279:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3280:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7487);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3296:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3297:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3297:1: (lv_name_1_0= ruleValidID )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3298:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7509);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3322:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3323:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3324:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7545);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7555); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3331:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3334:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3335:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3335:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3335:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3335:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3336:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3341:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==64) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3342:1: ( ruleStaticQualifier )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3342:1: ( ruleStaticQualifier )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3343:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7612);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3356:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==29) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3356:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall7626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3360:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3361:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3361:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3362:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7647);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3378:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==43) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3378:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7660); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3382:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3383:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3383:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3384:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7681);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3404:3: ( ( ruleIdOrSuper ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3405:1: ( ruleIdOrSuper )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3405:1: ( ruleIdOrSuper )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3406:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7720);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3419:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3419:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3419:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3419:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3426:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3427:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall7754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3452:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3453:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7829);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3470:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3471:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3471:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3472:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7857);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3488:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==43) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3488:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7870); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3492:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3493:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3493:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3494:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7891);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall7908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3522:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3523:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3524:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7947);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3531:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3534:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3535:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3535:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==63) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3536:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8005);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3548:2: kw= 'super'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleIdOrSuper8029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3561:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3562:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3563:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8070);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3570:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3573:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3574:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3574:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==64) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3575:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8128);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleStaticQualifier8146); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3599:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3600:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3601:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8187);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8197); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3608:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3611:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3612:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3612:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3612:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3612:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3613:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXConstructorCall8243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3622:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3623:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3623:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3624:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8266);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3637:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==29) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3637:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall8279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3641:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3642:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3642:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3643:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8300);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3659:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==43) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3659:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8313); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3663:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3664:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3664:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3665:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8334);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3701:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3702:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8424);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3719:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3719:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3719:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3719:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3720:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3720:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3721:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8452);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3737:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==43) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3737:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8465); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3741:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3742:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3742:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3743:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8486);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3771:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3772:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3773:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8539);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8549); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3780:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3783:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3784:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3784:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3784:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3784:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3785:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3790:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==66) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3790:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral8596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3795:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3795:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3796:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3796:1: (lv_isTrue_2_0= 'true' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3797:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral8620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3818:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3819:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3820:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8670);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8680); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3827:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3830:28: ( ( () otherlv_1= 'null' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3831:1: ( () otherlv_1= 'null' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3831:1: ( () otherlv_1= 'null' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3831:2: () otherlv_1= 'null'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3831:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3832:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXNullLiteral8726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3849:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3850:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3851:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8762);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8772); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3858:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3861:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3862:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3862:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3862:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3862:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3863:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3868:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3869:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3869:1: (lv_value_1_0= RULE_INT )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3870:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3894:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3895:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3896:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8864);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8874); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3903:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3906:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3907:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3907:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3907:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3907:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3908:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3913:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3914:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3914:1: (lv_value_1_0= RULE_STRING )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3915:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3939:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3940:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3941:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8966);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8976); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3948:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3951:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3952:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3952:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3952:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3952:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3953:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTypeLiteral9022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3966:1: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3967:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3967:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3968:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9057);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3993:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3994:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3995:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9105);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9115); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4002:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4005:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4006:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4006:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4006:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4006:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXThrowExpression9161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4016:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4017:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4017:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4018:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9182);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4042:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4043:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4044:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9218);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9228); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4051:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4054:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4055:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4055:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4055:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4055:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXReturnExpression9274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4065:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4065:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4070:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4071:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9305);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4095:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4096:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4097:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9342);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9352); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4104:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4107:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4108:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4108:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4108:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4108:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4109:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4118:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4119:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4119:1: (lv_expression_2_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4120:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9419);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==74) ) {
                alt71=1;
            }
            else if ( (LA71_0==73) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==74) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred22_InternalJnario()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4138:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4139:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9449);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4155:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==73) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred23_InternalJnario()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4155:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4155:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4155:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9471); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4160:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4161:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4161:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4162:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9493);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4179:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4179:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4179:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4183:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4184:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4184:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4185:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9536);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4209:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4210:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4211:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9574);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9584); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4218:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4221:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4222:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4222:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4222:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4222:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4222:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleXCatchClause9629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause9642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4231:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4232:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4232:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4233:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9663);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause9675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4253:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4254:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4254:1: (lv_expression_4_0= ruleXExpression )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4255:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9696);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4279:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4280:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4281:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9733);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9744); if (state.failed) return current;

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
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4288:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4291:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4292:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4292:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4293:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9791);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4303:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==40) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ID) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred25_InternalJnario()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4303:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4303:2: ( ( '.' )=>kw= '.' )
            	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4303:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName9819); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9842);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4330:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4331:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4332:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9889);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9899); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4339:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4342:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4343:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4343:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==44||LA73_0==75) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4344:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9946);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4354:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9973);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4370:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4371:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4372:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10008);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4379:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4382:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4383:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4383:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4383:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4383:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==44) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4383:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4387:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4388:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4388:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4389:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10077);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4405:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==43) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4405:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10090); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4409:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4410:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4410:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4411:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10111);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleXFunctionTypeRef10139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4435:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4436:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4436:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4437:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10160);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4461:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4462:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4463:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10196);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10206); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4470:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4473:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4474:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4474:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4474:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4474:2: ( ( ruleQualifiedName ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4475:1: ( ruleQualifiedName )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4475:1: ( ruleQualifiedName )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4476:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10254);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4489:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4489:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4489:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4489:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference10275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4494:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4495:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4495:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4496:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10297);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4512:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==43) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4512:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference10310); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4516:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4517:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4517:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4518:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10331);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4546:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4547:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4548:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10383);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10393); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4555:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4558:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4559:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4559:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||LA78_0==44||LA78_0==75) ) {
                alt78=1;
            }
            else if ( (LA78_0==76) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4560:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10440);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4570:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10467);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4586:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4587:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4588:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10502);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10512); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4595:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4598:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4599:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4599:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4599:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4599:2: ()
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4600:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference10558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4609:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==77) ) {
                alt79=1;
            }
            else if ( (LA79_0==63) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4609:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4609:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4610:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4610:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4611:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10580);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4628:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4628:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4629:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4629:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4630:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10607);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4654:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4655:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4656:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10645);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10655); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4663:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4666:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4667:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4667:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4667:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound10692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4671:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4672:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4672:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4673:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10713);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4697:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4698:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4699:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10749);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4706:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4709:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4710:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4710:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4710:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded10796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4714:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4715:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4715:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4716:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10817);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4740:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4741:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4742:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10853);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10863); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4749:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4752:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4753:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4753:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4753:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmLowerBound10900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4757:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4758:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4758:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4759:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10921);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4785:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4786:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4787:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID10960);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID10971); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4794:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4797:28: (this_ID_0= RULE_ID )
            // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4798:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalJnario
    public final void synpred1_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:637:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:638:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:638:2: ( ( ruleOpMultiAssign ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:639:1: ( ruleOpMultiAssign )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:639:1: ( ruleOpMultiAssign )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:640:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalJnario1170);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalJnario

    // $ANTLR start synpred2_InternalJnario
    public final void synpred2_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:4: ( () ( ( ruleOpOr ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:5: () ( ( ruleOpOr ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:765:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:766:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:766:2: ( ( ruleOpOr ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:767:1: ( ruleOpOr )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:767:1: ( ruleOpOr )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:768:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalJnario1518);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalJnario

    // $ANTLR start synpred3_InternalJnario
    public final void synpred3_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:5: () ( ( ruleOpAnd ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:866:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:867:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:867:2: ( ( ruleOpAnd ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:868:1: ( ruleOpAnd )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:868:1: ( ruleOpAnd )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:869:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalJnario1777);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalJnario

    // $ANTLR start synpred4_InternalJnario
    public final void synpred4_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:5: () ( ( ruleOpEquality ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:967:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:968:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:968:2: ( ( ruleOpEquality ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:969:1: ( ruleOpEquality )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:969:1: ( ruleOpEquality )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:970:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalJnario2036);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalJnario

    // $ANTLR start synpred5_InternalJnario
    public final void synpred5_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:4: ( ( () 'instanceof' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:5: ( () 'instanceof' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:5: ( () 'instanceof' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:6: () 'instanceof'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1075:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1076:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalJnario2312); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalJnario

    // $ANTLR start synpred6_InternalJnario
    public final void synpred6_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:10: () ( ( ruleOpCompare ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1103:10: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1104:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1104:2: ( ( ruleOpCompare ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1105:1: ( ruleOpCompare )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1105:1: ( ruleOpCompare )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1106:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalJnario2385);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalJnario

    // $ANTLR start synpred7_InternalJnario
    public final void synpred7_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:4: ( () ( ( ruleOpOther ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:5: () ( ( ruleOpOther ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1225:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1226:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1226:2: ( ( ruleOpOther ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1227:1: ( ruleOpOther )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1227:1: ( ruleOpOther )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1228:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalJnario2704);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalJnario

    // $ANTLR start synpred8_InternalJnario
    public final void synpred8_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:5: () ( ( ruleOpAdd ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1333:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1334:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1334:2: ( ( ruleOpAdd ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1335:1: ( ruleOpAdd )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1335:1: ( ruleOpAdd )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1336:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalJnario2984);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalJnario

    // $ANTLR start synpred9_InternalJnario
    public final void synpred9_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:5: () ( ( ruleOpMulti ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1441:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1442:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1442:2: ( ( ruleOpMulti ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1443:1: ( ruleOpMulti )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1443:1: ( ruleOpMulti )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1444:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalJnario3264);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalJnario

    // $ANTLR start synpred10_InternalJnario
    public final void synpred10_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:3: ( ( () 'as' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:4: ( () 'as' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:4: ( () 'as' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:5: () 'as'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1674:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1675:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred10_InternalJnario3858); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalJnario

    // $ANTLR start synpred11_InternalJnario
    public final void synpred11_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1734:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1735:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred11_InternalJnario4012); if (state.failed) return ;
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1736:1: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1737:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1737:1: ( ruleValidID )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1738:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalJnario4021);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalJnario4027);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalJnario

    // $ANTLR start synpred12_InternalJnario
    public final void synpred12_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1792:10: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1793:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1793:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt80=3;
        switch ( input.LA(1) ) {
        case 40:
            {
            alt80=1;
            }
            break;
        case 41:
            {
            alt80=2;
            }
            break;
        case 42:
            {
            alt80=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 80, 0, input);

            throw nvae;
        }

        switch (alt80) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1793:4: '.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalJnario4130); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1795:6: ( ( '?.' ) )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1795:6: ( ( '?.' ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1796:1: ( '?.' )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1796:1: ( '?.' )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1797:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalJnario4144); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1802:6: ( ( '*.' ) )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1802:6: ( ( '*.' ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1803:1: ( '*.' )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1803:1: ( '*.' )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1804:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalJnario4164); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalJnario

    // $ANTLR start synpred13_InternalJnario
    public final void synpred13_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1913:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1914:1: ( '(' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1914:1: ( '(' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1915:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred13_InternalJnario4391); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalJnario

    // $ANTLR start synpred14_InternalJnario
    public final void synpred14_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1934:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1935:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1935:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_ID||LA82_0==44||LA82_0==75) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1935:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1935:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1936:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1936:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1937:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalJnario4443);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1939:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==43) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1939:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred14_InternalJnario4450); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1940:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1941:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1941:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:1942:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalJnario4457);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                }
                break;

        }

        match(input,47,FOLLOW_47_in_synpred14_InternalJnario4467); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalJnario

    // $ANTLR start synpred16_InternalJnario
    public final void synpred16_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2548:4: ( 'else' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:2548:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred16_InternalJnario5912); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalJnario

    // $ANTLR start synpred17_InternalJnario
    public final void synpred17_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3172:6: ( ( ruleJvmTypeReference ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3173:1: ( ruleJvmTypeReference )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3173:1: ( ruleJvmTypeReference )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3174:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalJnario7278);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3176:2: ( ( ruleValidID ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3177:1: ( ruleValidID )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3177:1: ( ruleValidID )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3178:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalJnario7287);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalJnario

    // $ANTLR start synpred18_InternalJnario
    public final void synpred18_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3419:4: ( ( '(' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3420:1: ( '(' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3420:1: ( '(' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3421:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred18_InternalJnario7736); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalJnario

    // $ANTLR start synpred19_InternalJnario
    public final void synpred19_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3440:6: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3441:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3441:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==44||LA86_0==75) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3441:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3441:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3442:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3442:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3443:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalJnario7788);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3445:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==43) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3445:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred19_InternalJnario7795); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3446:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3447:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3447:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3448:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalJnario7802);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                }
                break;

        }

        match(input,47,FOLLOW_47_in_synpred19_InternalJnario7812); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalJnario

    // $ANTLR start synpred20_InternalJnario
    public final void synpred20_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3689:5: ()
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3690:1: 
        {
        }

        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3690:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==44||LA88_0==75) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3690:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3690:3: ( ( ruleJvmFormalParameter ) )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3691:1: ( ruleJvmFormalParameter )
                {
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3691:1: ( ruleJvmFormalParameter )
                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3692:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario8383);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3694:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==43) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3694:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred20_InternalJnario8390); if (state.failed) return ;
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3695:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3696:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3696:1: ( ruleJvmFormalParameter )
                	    // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:3697:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario8397);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        match(input,47,FOLLOW_47_in_synpred20_InternalJnario8407); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalJnario

    // $ANTLR start synpred21_InternalJnario
    public final void synpred21_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4065:2: ( ( ruleXExpression ) )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4066:1: ( ruleXExpression )
        {
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4066:1: ( ruleXExpression )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4067:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalJnario9288);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalJnario

    // $ANTLR start synpred22_InternalJnario
    public final void synpred22_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:5: ( 'catch' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4136:7: 'catch'
        {
        match(input,74,FOLLOW_74_in_synpred22_InternalJnario9433); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalJnario

    // $ANTLR start synpred23_InternalJnario
    public final void synpred23_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4155:5: ( 'finally' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4155:7: 'finally'
        {
        match(input,73,FOLLOW_73_in_synpred23_InternalJnario9463); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalJnario

    // $ANTLR start synpred25_InternalJnario
    public final void synpred25_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4303:3: ( '.' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4304:2: '.'
        {
        match(input,40,FOLLOW_40_in_synpred25_InternalJnario9810); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalJnario

    // $ANTLR start synpred26_InternalJnario
    public final void synpred26_InternalJnario_fragment() throws RecognitionException {   
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4489:4: ( '<' )
        // ../de.bmw.carit.jnario/src-gen/de/bmw/carit/jnario/parser/antlr/internal/InternalJnario.g:4489:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred26_InternalJnario10267); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalJnario

    // Delegated rules

    public final boolean synpred9_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalJnario() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalJnario_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String DFA34_eotS =
        "\100\uffff";
    static final String DFA34_eofS =
        "\1\2\77\uffff";
    static final String DFA34_minS =
        "\1\5\1\0\76\uffff";
    static final String DFA34_maxS =
        "\1\113\1\0\76\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\1\uffff\6\2\7\uffff\30\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1913:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\34\uffff";
    static final String DFA33_eofS =
        "\34\uffff";
    static final String DFA33_minS =
        "\1\12\2\0\31\uffff";
    static final String DFA33_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\5\1\1\20\uffff\1\5\2\uffff\2\5\4\uffff\1\5\5\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1934:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==44) ) {s = 2;}

                        else if ( (LA33_0==75) && (synpred14_InternalJnario())) {s = 3;}

                        else if ( (LA33_0==47) && (synpred14_InternalJnario())) {s = 4;}

                        else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||LA33_0==29||(LA33_0>=32 && LA33_0<=33)||LA33_0==38||LA33_0==46||LA33_0==49||LA33_0==51||LA33_0==53||(LA33_0>=57 && LA33_0<=59)||LA33_0==63||(LA33_0>=65 && LA33_0<=72)) ) {s = 5;}

                        else if ( (LA33_0==45) ) {s = 27;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\100\uffff";
    static final String DFA60_eofS =
        "\1\2\77\uffff";
    static final String DFA60_minS =
        "\1\5\1\0\76\uffff";
    static final String DFA60_maxS =
        "\1\113\1\0\76\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\1\uffff\6\2\7\uffff\30\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3419:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\34\uffff";
    static final String DFA59_eofS =
        "\34\uffff";
    static final String DFA59_minS =
        "\1\12\2\0\31\uffff";
    static final String DFA59_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA59_transitionS = {
            "\2\5\1\1\20\uffff\1\5\2\uffff\2\5\4\uffff\1\5\5\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3440:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==44) ) {s = 2;}

                        else if ( (LA59_0==75) && (synpred19_InternalJnario())) {s = 3;}

                        else if ( (LA59_0==47) && (synpred19_InternalJnario())) {s = 4;}

                        else if ( ((LA59_0>=RULE_INT && LA59_0<=RULE_STRING)||LA59_0==29||(LA59_0>=32 && LA59_0<=33)||LA59_0==38||LA59_0==46||LA59_0==49||LA59_0==51||LA59_0==53||(LA59_0>=57 && LA59_0<=59)||LA59_0==63||(LA59_0>=65 && LA59_0<=72)) ) {s = 5;}

                        else if ( (LA59_0==45) ) {s = 27;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\34\uffff";
    static final String DFA66_eofS =
        "\34\uffff";
    static final String DFA66_minS =
        "\1\12\2\0\31\uffff";
    static final String DFA66_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA66_transitionS = {
            "\2\5\1\1\20\uffff\1\5\2\uffff\2\5\4\uffff\1\5\5\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\3\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3689:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==44) ) {s = 2;}

                        else if ( (LA66_0==75) && (synpred20_InternalJnario())) {s = 3;}

                        else if ( (LA66_0==47) && (synpred20_InternalJnario())) {s = 4;}

                        else if ( ((LA66_0>=RULE_INT && LA66_0<=RULE_STRING)||LA66_0==29||(LA66_0>=32 && LA66_0<=33)||LA66_0==38||LA66_0==46||LA66_0==49||LA66_0==51||LA66_0==53||(LA66_0>=57 && LA66_0<=59)||LA66_0==63||(LA66_0>=65 && LA66_0<=72)) ) {s = 5;}

                        else if ( (LA66_0==45) ) {s = 27;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalJnario()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\100\uffff";
    static final String DFA68_eofS =
        "\1\31\77\uffff";
    static final String DFA68_minS =
        "\1\5\30\0\47\uffff";
    static final String DFA68_maxS =
        "\1\113\30\0\47\uffff";
    static final String DFA68_acceptS =
        "\31\uffff\1\2\45\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\47\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\31\1\uffff\3\31\1\15\1\17\1\1\7\uffff\11\31\1\10\2\31\1"+
            "\4\1\3\4\31\1\2\5\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31\1"+
            "\7\1\31\1\6\3\31\1\22\1\23\1\24\3\31\1\11\1\uffff\1\5\1\13\1"+
            "\14\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "4065:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA68_16 = input.LA(1);

                         
                        int index68_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA68_17 = input.LA(1);

                         
                        int index68_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA68_18 = input.LA(1);

                         
                        int index68_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA68_19 = input.LA(1);

                         
                        int index68_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA68_20 = input.LA(1);

                         
                        int index68_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA68_21 = input.LA(1);

                         
                        int index68_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA68_22 = input.LA(1);

                         
                        int index68_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA68_23 = input.LA(1);

                         
                        int index68_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA68_24 = input.LA(1);

                         
                        int index68_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index68_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\100\uffff";
    static final String DFA77_eofS =
        "\1\2\77\uffff";
    static final String DFA77_minS =
        "\1\5\1\0\76\uffff";
    static final String DFA77_maxS =
        "\1\113\1\0\76\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\2\1\uffff\6\2\7\uffff\11\2\1\1\21\2\1\uffff\20\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4489:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalJnario()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleJnario_in_entryRuleJnario75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJnario85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FEATURE_TEXT_in_ruleJnario127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleJnario153 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCENARIO_TEXT_in_ruleScenario242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleGiven_in_ruleScenario268 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleWhen_in_ruleScenario289 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleThen_in_ruleScenario310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGiven_in_entryRuleGiven348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGiven358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GIVEN_TEXT_in_ruleGiven400 = new BitSet(new long[]{0xEE2A504320001C82L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCode_in_ruleGiven426 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleGiven445 = new BitSet(new long[]{0xEE2A504320001C82L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCode_in_ruleGiven471 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleWhen_in_entryRuleWhen510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhen520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_TEXT_in_ruleWhen562 = new BitSet(new long[]{0xEE2A504320001C82L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCode_in_ruleWhen588 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleWhen607 = new BitSet(new long[]{0xEE2A504320001C82L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCode_in_ruleWhen633 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleThen_in_entryRuleThen672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThen682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THEN_TEXT_in_ruleThen724 = new BitSet(new long[]{0xEE2A504320001C82L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCode_in_ruleThen750 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_AND_TEXT_in_ruleThen769 = new BitSet(new long[]{0xEE2A504320001C82L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCode_in_ruleThen795 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleCode889 = new BitSet(new long[]{0xEE2A504320001C02L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1083 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1099 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1149 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1202 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpMultiAssign1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1497 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1550 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1573 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpOr1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1756 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1809 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1832 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpAnd1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2015 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2068 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2091 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2295 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression2331 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2356 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2417 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2440 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2683 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2736 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2759 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2963 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3016 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3039 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3243 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3296 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3319 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3572 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3842 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXCastedExpression3877 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3900 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3995 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4044 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4067 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4083 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4105 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4191 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4215 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4252 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4281 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4302 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4315 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4336 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4375 = new BitSet(new long[]{0x0000170000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4409 = new BitSet(new long[]{0xEE2AF04320001C00L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4484 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4512 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4525 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4546 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4563 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5303 = new BitSet(new long[]{0x0000900000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5325 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5338 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5359 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5375 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5396 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5552 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5565 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5586 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure5602 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5708 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5730 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5833 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5845 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5866 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5878 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5899 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression5920 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6036 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6058 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6070 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6093 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6105 = new BitSet(new long[]{0x0110100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6126 = new BitSet(new long[]{0x01D0100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6140 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6152 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6173 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6279 = new BitSet(new long[]{0x0110000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6293 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6314 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6328 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression6441 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6453 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6474 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression6486 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6507 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6519 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression6632 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6644 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6665 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression6677 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression6790 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6811 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6823 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression6835 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6856 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression6960 = new BitSet(new long[]{0xEEAA504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6982 = new BitSet(new long[]{0xFEAA504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression6995 = new BitSet(new long[]{0xEEAA504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7229 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7260 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7308 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7329 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7358 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration7372 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7487 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7612 = new BitSet(new long[]{0x8000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall7626 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7647 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7660 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7681 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7695 = new BitSet(new long[]{0x8000000020001000L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7720 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall7754 = new BitSet(new long[]{0xEE2AF04320001C00L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7829 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7857 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7870 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7891 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleIdOrSuper8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStaticQualifier8146 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXConstructorCall8243 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8266 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall8279 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8300 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8313 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8334 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8348 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8362 = new BitSet(new long[]{0xEE2AF04320001C00L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8424 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8452 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8465 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8486 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXNullLiteral8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTypeLiteral9022 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9034 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9057 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXThrowExpression9161 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXReturnExpression9274 = new BitSet(new long[]{0xEE2A504320001C02L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9398 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9471 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9515 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXCatchClause9629 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause9642 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9663 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause9675 = new BitSet(new long[]{0xEE2A504320001C00L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9791 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName9819 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9842 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10056 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10077 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10090 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10111 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleXFunctionTypeRef10139 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10254 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference10275 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10297 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference10310 = new BitSet(new long[]{0x0000100000001000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10331 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference10558 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound10692 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded10796 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmLowerBound10900 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID10960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID10971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalJnario1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalJnario1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalJnario1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalJnario2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalJnario2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalJnario2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalJnario2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalJnario2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalJnario3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred10_InternalJnario3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred11_InternalJnario4012 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalJnario4021 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalJnario4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalJnario4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalJnario4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalJnario4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred13_InternalJnario4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalJnario4443 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalJnario4450 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalJnario4457 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalJnario4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred16_InternalJnario5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalJnario7278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalJnario7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred18_InternalJnario7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalJnario7788 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred19_InternalJnario7795 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalJnario7802 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred19_InternalJnario7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario8383 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalJnario8390 = new BitSet(new long[]{0x0000100000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalJnario8397 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalJnario8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalJnario9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred22_InternalJnario9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred23_InternalJnario9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred25_InternalJnario9810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred26_InternalJnario10267 = new BitSet(new long[]{0x0000000000000002L});

}